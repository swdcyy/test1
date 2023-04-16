package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$Data;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$Data$a;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$Rule;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BaseTaskStatus;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BasePopUpInfo;
import java.util.List;
import com.kuaishou.android.model.ads.NeoLiveTopPendantInfo;
import com.kuaishou.android.model.ads.NeoLiveBottomPendantInfo;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$CardLiveBanner;
import java.lang.Object;

public final class NeoTaskStatusResponse$Data implements Serializable	// class@001505
{
    public final String actionBarTitle;
    public final NeoLiveBottomPendantInfo bottomPendantInfo;
    public final NeoTaskStatusResponse$CardLiveBanner cardLiveBanner;
    public final String extData;
    public final List guideBubbles;
    public final long guideBubblesDelayMs;
    public final String navigationPendantKey;
    public final NeoTaskStatusResponse$BasePopUpInfo popUpInfo;
    public final NeoTaskStatusResponse$Rule rule;
    public final NeoTaskStatusResponse$BaseTaskStatus[] tasks;
    public final NeoLiveTopPendantInfo topPendantInfo;
    public static final NeoTaskStatusResponse$Data$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$Data.Companion = new NeoTaskStatusResponse$Data$a(null);
    }
    public void NeoTaskStatusResponse$Data(String p0,NeoTaskStatusResponse$Rule p1,NeoTaskStatusResponse$BaseTaskStatus[] p2,NeoTaskStatusResponse$BasePopUpInfo p3,List p4,long p5,NeoLiveTopPendantInfo p6,String p7,NeoLiveBottomPendantInfo p8,String p9,NeoTaskStatusResponse$CardLiveBanner p10){
       super();
       this.actionBarTitle = p0;
       this.rule = p1;
       this.tasks = p2;
       this.popUpInfo = p3;
       this.guideBubbles = p4;
       this.guideBubblesDelayMs = p5;
       this.topPendantInfo = p6;
       this.extData = p7;
       this.bottomPendantInfo = p8;
       this.navigationPendantKey = p9;
       this.cardLiveBanner = p10;
    }
    public void NeoTaskStatusResponse$Data(String p0,NeoTaskStatusResponse$Rule p1,NeoTaskStatusResponse$BaseTaskStatus[] p2,NeoTaskStatusResponse$BasePopUpInfo p3,List p4,long p5,NeoLiveTopPendantInfo p6,String p7,NeoLiveBottomPendantInfo p8,String p9,NeoTaskStatusResponse$CardLiveBanner p10,int p11,u p12){
       int i = p11;
       NeoTaskStatusResponse$BaseTaskStatus[] uBaseTaskSta = (i & 0x04)? null: p2;
       NeoTaskStatusResponse$BasePopUpInfo uBasePopUpIn = (i & 0x08)? null: p3;
       List list = (i & 0x10)? null: p4;
       long l = (i & 0x20)? 0: p5;
       NeoLiveTopPendantInfo neoLiveTopPe = (i & 0x40)? null: p6;
       String str = (i & 0x0080)? null: p7;
       NeoLiveBottomPendantInfo neoLiveBotto = (i & 0x0100)? null: p8;
       String str1 = (i & 0x0200)? null: p9;
       super(p0, p1, uBaseTaskSta, uBasePopUpIn, list, l, neoLiveTopPe, str, neoLiveBotto, str1, p10);
       return;
    }
    public final String getActionBarTitle(){
       return this.actionBarTitle;
    }
    public final NeoLiveBottomPendantInfo getBottomPendantInfo(){
       return this.bottomPendantInfo;
    }
    public final NeoTaskStatusResponse$CardLiveBanner getCardLiveBanner(){
       return this.cardLiveBanner;
    }
    public final String getExtData(){
       return this.extData;
    }
    public final List getGuideBubbles(){
       return this.guideBubbles;
    }
    public final long getGuideBubblesDelayMs(){
       return this.guideBubblesDelayMs;
    }
    public final String getNavigationPendantKey(){
       return this.navigationPendantKey;
    }
    public final NeoTaskStatusResponse$BasePopUpInfo getPopUpInfo(){
       return this.popUpInfo;
    }
    public final NeoTaskStatusResponse$Rule getRule(){
       return this.rule;
    }
    public final NeoTaskStatusResponse$BaseTaskStatus[] getTasks(){
       return this.tasks;
    }
    public final NeoLiveTopPendantInfo getTopPendantInfo(){
       return this.topPendantInfo;
    }
}
