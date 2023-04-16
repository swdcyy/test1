package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BasePopUpInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BasePopUpInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public class NeoTaskStatusResponse$BasePopUpInfo implements Serializable	// class@00103d
{
    public final String actionBar;
    public final String iconUrl;
    public final String subTitle;
    public final String title;
    public int type;
    public static final NeoTaskStatusResponse$BasePopUpInfo$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$BasePopUpInfo.Companion = new NeoTaskStatusResponse$BasePopUpInfo$a(null);
    }
    public void NeoTaskStatusResponse$BasePopUpInfo(){
       super();
    }
    public static void getType$annotations(){
    }
    public final String getActionBar(){
       return this.actionBar;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public final int getType(){
       return this.type;
    }
}
