package com.yxcorp.gifshow.growth.halfscreenfollow.GrowthFollowDialogConfig;
import java.io.Serializable;
import java.lang.Object;

public class GrowthFollowDialogConfig implements Serializable	// class@001384
{
    public int frequency;
    public String pageUrl;
    public String talentKwaiUrl;
    public static final long serialVersionUID = 0xf3ce80cf6e61baef;

    public void GrowthFollowDialogConfig(){
       super();
       this.frequency = 0;
       this.pageUrl = "";
       this.talentKwaiUrl = "";
    }
}
