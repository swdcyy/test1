package com.yxcorp.gifshow.growth.push.permission.CommonGrowthUpPushGuideConfig;
import java.io.Serializable;
import java.lang.Object;

public class CommonGrowthUpPushGuideConfig implements Serializable	// class@0014a7
{
    public String buttonCopy;
    public long momentView;
    public String popUp;
    public boolean pushButtonOn;
    public String title;
    public String toast;

    public void CommonGrowthUpPushGuideConfig(){
       super();
       this.popUp = "";
       this.title = "";
       this.buttonCopy = "";
       this.toast = "";
    }
}
