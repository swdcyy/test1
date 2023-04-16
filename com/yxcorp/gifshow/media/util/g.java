package com.yxcorp.gifshow.media.util.g;
import java.lang.Object;
import hxc.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import q6b.d$b;
import q6b.d;
import ykd.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.media.model.WatermarkEncodeConfig;
import q87.c;
import com.yxcorp.gifshow.media.util.g$a;
import java.lang.Throwable;
import com.kwai.feature.post.api.encode.d;
import com.kwai.video.editorsdk2.ExportTask;
import android.content.Context;
import brd.t;
import x6b.g;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.media.util.e;
import erd.o;

public class g	// class@001d26
{
    public a a;
    public static String b = "ShareNormalVideoHandler";

    public void g(){
       super();
    }
    public static void b(a p0,EditorSdk2$ExportOptions p1,long p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, g.class, "3")) {
          return;
       }
       p0.b = p1.width();
       p0.a = p1.height();
       p0.c = p1.videoBitrate();
       p0.d = p2;
       return;
    }
    public static EditorSdk2$ExportOptions c(EncodeConfig p0,Pair p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!d.a().c()) {
          return null;
       }
       int i = 0;
       try{
          Object[] objArray = new Object[i];
          a.C().w(g.b, "generateNormalVideoExportOptions FrameRatePromote,getForceTranscodeIfFpsLessThan:"+g.d().n()+",getForceTranscodeTargetFps:"+g.d().o(), objArray);
          return g$a.a(p0, p1);
       }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e6){
          obj = new Object[i];
          a.C().u("ShareNormalVideoHandler", e6, obj);
          return v1;
       }
    }
    public static WatermarkEncodeConfig d(){
       return d.a;
    }
    public static void e(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "4")) {
          return;
       }
       if (p0 != null) {
          p0.release();
       }
       return;
    }
    public t a(EncodeConfig p0,String p1,String p2,Context p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = new e(this, p1, p0, p3, p2);
       return t.fromCallable(new g(p1)).subscribeOn(d.c).observeOn(d.a).flatMap(v7);
    }
}
