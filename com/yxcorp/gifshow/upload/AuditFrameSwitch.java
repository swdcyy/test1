package com.yxcorp.gifshow.upload.AuditFrameSwitch;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import gq.a;
import java.lang.Throwable;
import w46.b;

public class AuditFrameSwitch implements Serializable	// class@001e3e
{
    public boolean mAiCutEnabled;
    public boolean mAlbumMovieEnabled;
    public boolean mKuaiShanEnabled;
    public boolean mPhotoMovieEnabled;
    public static final long serialVersionUID = 0x5b8f9c1a6410e155;

    public void AuditFrameSwitch(){
       super();
    }
    public static AuditFrameSwitch getSwitch(){
       Object obj = PatchProxy.apply(null, null, AuditFrameSwitch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return a.t().getValue("auditFrameSwitch", AuditFrameSwitch.class, new AuditFrameSwitch());
       }catch(com.google.gson.JsonSyntaxException e0){
          a.D().e("AuditFrameSwitch", "getSwitch: ", e0);
          return new AuditFrameSwitch();
       }
    }
}
