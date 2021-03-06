package com.mabl.integration.jenkins.test.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "testcase")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestCase {

    @XmlAttribute(name = "classname")
    private String plan;
    @XmlAttribute(name = "name")
    private String journey;
    @XmlAttribute(name = "time")
    private long duration;
    @XmlAttribute(name = "xlink:type")
    private String linkType;
    @XmlAttribute(name = "xlink:href")
    private String appHref;

    @XmlElement(name = "failure")
    private Failure failure;

    public TestCase() {

    }

    public TestCase(String plan, String journey, long duration, String appHref) {
        this.plan = plan;
        this.journey = journey;
        this.duration = duration;
        this.linkType = "simple";
        this.appHref = appHref;
    }

    public TestCase(String plan, String journey, long duration, String appHref, Failure failure) {
        this.plan = plan;
        this.journey = journey;
        this.duration = duration;
        this.linkType = "simple";
        this.appHref = appHref;
        this.failure = failure;
    }

    public TestCase setFailure(Failure failure) {
        this.failure = failure;
        return this;
    }

    public String getPlan() {
        return this.plan;
    }

    public String getJourney() {
        return this.journey;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getAppHref() {
        return this.appHref;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public Failure getFailure() {
        return this.failure;
    }
}


