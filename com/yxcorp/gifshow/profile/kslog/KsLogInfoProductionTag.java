package com.yxcorp.gifshow.profile.kslog.KsLogInfoProductionTag;
import v2c.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import v2c.d;

public final class KsLogInfoProductionTag extends Enum implements e	// class@001379
{
    public final String mName;
    public static final KsLogInfoProductionTag[] $VALUES;
    public static final KsLogInfoProductionTag BG_IMAGE_PUBLISH;
    public static final KsLogInfoProductionTag BG_VIDEO_PUBLISH;
    public static final KsLogInfoProductionTag PROFILE_INFO_API;
    public static final KsLogInfoProductionTag STATUS_PUBLISH;

    static {
       KsLogInfoProductionTag ksLogInfoPro1;
       KsLogInfoProductionTag[] ksLogInfoPro = new KsLogInfoProductionTag[]{ksLogInfoPro1,ksLogInfoPro1,ksLogInfoPro1,ksLogInfoPro1};
       ksLogInfoPro1 = new KsLogInfoProductionTag("STATUS_PUBLISH", 0, "STATUS_PUBLISH");
       KsLogInfoProductionTag.STATUS_PUBLISH = ksLogInfoPro1;
       ksLogInfoPro1 = new KsLogInfoProductionTag("BG_VIDEO_PUBLISH", 1, "BG_VIDEO_PUBLISH");
       KsLogInfoProductionTag.BG_VIDEO_PUBLISH = ksLogInfoPro1;
       ksLogInfoPro1 = new KsLogInfoProductionTag("BG_IMAGE_PUBLISH", 2, "BG_IMAGE_PUBLISH");
       KsLogInfoProductionTag.BG_IMAGE_PUBLISH = ksLogInfoPro1;
       ksLogInfoPro1 = new KsLogInfoProductionTag("PROFILE_INFO_API", 3, "PROFILE_INFO_API");
       KsLogInfoProductionTag.PROFILE_INFO_API = ksLogInfoPro1;
       KsLogInfoProductionTag.$VALUES = ksLogInfoPro;
    }
    public void KsLogInfoProductionTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static KsLogInfoProductionTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsLogInfoProductionTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsLogInfoProductionTag.class, p0);
    }
    public static KsLogInfoProductionTag[] values(){
       Object obj = PatchProxy.apply(null, null, KsLogInfoProductionTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsLogInfoProductionTag.$VALUES.clone();
    }
    public List a(String p0,String p1){
       return d.b(this, p0, p1);
    }
    public List appendTag(String p0){
       return d.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
