package com.kuaishou.live.core.show.profilecard.http.LiveProfileNobleEntranceInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.profilecard.http.LiveProfileNobleEntranceInfo$a;
import nsd.u;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class LiveProfileNobleEntranceInfo implements Serializable	// class@000dcc
{
    public String dynamicPicKey;
    public CDNUrl[] imageBackUpUrls;
    public String nobleEntranceUrl;
    public int nobleType;
    public static final LiveProfileNobleEntranceInfo$a Companion;
    public static final long serialVersionUID;

    static {
       LiveProfileNobleEntranceInfo.Companion = new LiveProfileNobleEntranceInfo$a(null);
    }
    public void LiveProfileNobleEntranceInfo(CDNUrl[] p0,String p1,String p2,int p3){
       a.p(p0, "imageBackUpUrls");
       a.p(p1, "dynamicPicKey");
       a.p(p2, "nobleEntranceUrl");
       super();
       this.imageBackUpUrls = p0;
       this.dynamicPicKey = p1;
       this.nobleEntranceUrl = p2;
       this.nobleType = p3;
    }
    public final String getDynamicPicKey(){
       return this.dynamicPicKey;
    }
    public final CDNUrl[] getImageBackUpUrls(){
       return this.imageBackUpUrls;
    }
    public final String getNobleEntranceUrl(){
       return this.nobleEntranceUrl;
    }
    public final int getNobleType(){
       return this.nobleType;
    }
    public final void setDynamicPicKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileNobleEntranceInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.dynamicPicKey = p0;
       return;
    }
    public final void setImageBackUpUrls(CDNUrl[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileNobleEntranceInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.imageBackUpUrls = p0;
       return;
    }
    public final void setNobleEntranceUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileNobleEntranceInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.nobleEntranceUrl = p0;
       return;
    }
    public final void setNobleType(int p0){
       this.nobleType = p0;
    }
}
