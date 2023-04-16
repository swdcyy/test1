package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveCommonActivityWidgetConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveCommonActivityWidgetConfig implements Serializable	// class@00102f
{
    public int mAllWidgetMaxShowCount;
    public String mDefaultPrimaryColor;
    public int mDynamicWidgetMaxShowCount;
    public long mDynamicWidgetShowDurationMs;
    public long mStaticWidgetShowDurationMs;
    public float mWidgetTransparency;
    public static final long serialVersionUID = 0x218ed7c93c973679;

    public void LiveConfigStartupResponse$LiveCommonActivityWidgetConfig(){
       super();
       this.mDynamicWidgetMaxShowCount = 1;
       this.mAllWidgetMaxShowCount = 5;
       this.mWidgetTransparency = 0x3f4ccccd;
       this.mDynamicWidgetShowDurationMs = 4500;
       this.mStaticWidgetShowDurationMs = 4000;
    }
}
