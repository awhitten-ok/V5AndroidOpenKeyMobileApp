package com.openkey.server.objects;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table
public class AutomationTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private User user;
    private String lockType;
    private int invocationCount;
    @ManyToOne
    private TestApp testApp;
    private String testToRun;
    private String appId;
    private String appPackage;
    private String platform;
    private String status;
    private LocalDateTime dateCreated;
    @ManyToOne
    private Phone phone;
    private String resultUrl;

    @ManyToOne(optional = false)
    private Rail rail;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public int getInvocationCount() {
        return invocationCount;
    }

    public void setInvocationCount(int invocationCount) {
        this.invocationCount = invocationCount;
    }

    public String getTestToRun() {
        return testToRun;
    }

    public void setTestToRun(String testToRun) {
        this.testToRun = testToRun;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public Rail getRail() {
        return rail;
    }

    public void setRail(Rail rail) {
        this.rail = rail;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public TestApp getTestApp() {
        return testApp;
    }

    public void setTestApp(TestApp testApp) {
        this.testApp = testApp;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String testAppId) {
        this.appId = testAppId;
    }
}
