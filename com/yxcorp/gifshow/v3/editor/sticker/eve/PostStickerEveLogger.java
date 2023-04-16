package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger;
import lnc.a1;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$sampleRate$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ssd.e;
import ssd.e$a;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$TaskType;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Long;
import lnc.i3;
import java.lang.CharSequence;
import zsd.u;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$ErrorInfo;

public final class PostStickerEveLogger	// class@00123f
{
    public static long a;
    public static Map b;
    public static final p c;
    public static final PostStickerEveLogger d;

    static {
       PostStickerEveLogger.d = new PostStickerEveLogger();
       PostStickerEveLogger.a = a1.k();
       PostStickerEveLogger.b = new LinkedHashMap();
       PostStickerEveLogger.c = s.c(PostStickerEveLogger$sampleRate$2.INSTANCE);
    }
    public void PostStickerEveLogger(){
       super();
    }
    public final boolean a(double p0){
       PostStickerEveLogger postStickerE = PostStickerEveLogger.class;
       if (PatchProxy.isSupport(postStickerE)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, postStickerE, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p0 - (double)i <= 0 && e.b.g() - p0 >= 0) {
          i = false;
       }
       return i;
    }
    public final double b(){
       Object obj = PatchProxy.apply(null, this, PostStickerEveLogger.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = PostStickerEveLogger.c.getValue();
       }
       return obj.doubleValue();
    }
    public final void c(PostStickerEveLogger$TaskType p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostStickerEveLogger.class, "4")) {
          return;
       }
       String str = "taskType";
       a.p(p0, str);
       if (!this.a(this.b())) {
          return;
       }
       Long longx = PostStickerEveLogger.b.get(p0);
       long l = (longx != null)? a1.k() - longx.longValue(): a1.k() - PostStickerEveLogger.a;
       i3 oi3 = i3.f();
       oi3.d(str, p0.getDescription());
       oi3.c("costTime", Double.valueOf(((double)l / (double)1000)));
       boolean b = (p1 == null || u.S1(p1))? true: false;
       oi3.a("executeSuccess", Boolean.valueOf(b));
       oi3.d("failedReason", p1);
       u1.R("POST_CLIENT_EVE_MONITOR", oi3.e(), 2);
       return;
    }
    public final void d(PostStickerEveLogger$TaskType p0,PostStickerEveLogger$ErrorInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostStickerEveLogger.class, "5")) {
          return;
       }
       String str = "taskType";
       a.p(p0, str);
       a.p(p1, "errorInfo");
       if (!this.a(this.b())) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d(str, p0.getDescription());
       oi3.d("failedReason", p1.getDescription());
       u1.R("POST_CLIENT_EVE_MONITOR", oi3.e(), 2);
       return;
    }
    public final void e(PostStickerEveLogger$TaskType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostStickerEveLogger.class, "2")) {
          return;
       }
       a.p(p0, "taskType");
       PostStickerEveLogger.a = a1.k();
       PostStickerEveLogger.b.put(p0, Long.valueOf(a1.k()));
       return;
    }
}
