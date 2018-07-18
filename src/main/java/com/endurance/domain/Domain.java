package com.endurance.domain;

/**
 * Created by shivam.a on 7/17/18.
 */
public class Domain {
    private String domainName;
    private String tld;
    private String domainOwner;

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getDomainOwner() {
        return domainOwner;
    }

    public String getTld() {
        return tld;
    }
}
