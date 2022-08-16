package com.mma.enums;

public enum BrowserTypeEnum {

    NONE("NONE"),
    CHROME("CHROME"),
    HEADLESS("HEADLESS"),
    FIREFOX("FIREFOX"),
    IPHONE("IPHONE"),
    IPAD("IPAD", true),
    ANDROID("ANDROID", true),
    ANDROID_TAB("ANDROID_Tab", true);

    private final String browserName;
    private final boolean isTablet;

    BrowserTypeEnum(String browserName){
        this(browserName, false);
    }

    BrowserTypeEnum(String browserName, boolean isTablet){
        this.browserName = browserName;
        this.isTablet = isTablet;
    }

    public String getBrowserName(){
        return browserName;
    }

    public boolean isTablet(){
        return isTablet;
    }
}
