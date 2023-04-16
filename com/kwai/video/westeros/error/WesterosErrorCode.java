package com.kwai.video.westeros.error.WesterosErrorCode;
import java.lang.Object;
import com.kwai.video.westeros.error.WesterosErrorCode$Level;
import com.kwai.video.westeros.error.WesterosErrorCode$Module;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.video.westeros.error.WesterosErrorCode$Project;
import java.lang.Math;
import com.kwai.video.westeros.error.WesterosErrorCode$Result;

public class WesterosErrorCode	// class@000e7c
{

    public void WesterosErrorCode(){
       super();
    }
    public static int genWesterosRetCode(WesterosErrorCode$Level p0,WesterosErrorCode$Module p1,int p2){
       if (PatchProxy.isSupport(WesterosErrorCode.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, WesterosErrorCode.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return WesterosErrorCode.generateResultCode(WesterosErrorCode$Project.kWesteros, p0, p1, p2);
    }
    public static int generateResultCode(WesterosErrorCode$Project p0,WesterosErrorCode$Level p1,WesterosErrorCode$Module p2,int p3){
       if (PatchProxy.isSupport(WesterosErrorCode.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), null, WesterosErrorCode.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return ((((p0.getCode() << 18) | (p1.getCode() << 16)) | (p2.getCode() << 10)) | (1023 & Math.max(p3, 1023)));
    }
    public static int getDetailCode(WesterosErrorCode$Result p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (p0.getCode() & 0x03ff);
    }
    public static WesterosErrorCode$Level getLevel(WesterosErrorCode$Result p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Level.fromCode(((p0.getCode() & 0x30000) >> 16));
    }
    public static WesterosErrorCode$Module getModule(WesterosErrorCode$Result p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Module.fromCode(((p0.getCode() & 0xfc00) >> 10));
    }
    public static WesterosErrorCode$Project getProject(WesterosErrorCode$Result p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WesterosErrorCode.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WesterosErrorCode$Project.fromCode(((p0.getCode() & 0xfc0000) >> 18));
    }
}
