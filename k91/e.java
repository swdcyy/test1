package k91.e;
import k91.c;
import k91.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k91.b;
import q00.b;
import java.lang.Boolean;
import java.util.Objects;
import k91.c$b;
import java.lang.ref.WeakReference;
import com.kwai.plugin.dva.Dva;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$LiveResourceFileType;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil$d;
import java.io.File;
import com.kuaishou.live.common.core.basic.resource.LiveResourceFileUtil;
import qkd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public class e	// class@002ce3
{
    public static c a;
    public static b b;
    public static b c;
    public static boolean d;

    static {
       e.a = new c();
       f uof = new f();
       e.b = uof;
       e.c = uof;
       e.d = false;
    }
    public void e(){
       super();
    }
    public static String a(){
       b obj = PatchProxy.apply(null, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.c;
       String str = (obj == null)? "": obj.a();
       return str;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, e.class, "2")) {
          return;
       }
       if (e.a == null) {
          e.a = new c();
       }
       if (e.b == null) {
          e.b = new f();
       }
       return;
    }
    public static boolean c(){
       return e.d;
    }
    public static void d(b p0,boolean p1){
       boolean b;
       b b1;
       boolean b2;
       c uoc = c.class;
       e uoe = e.class;
       String str = "1";
       Object obj = null;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), obj, uoe, str)) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e.b();
       e.b.b(p0, p1);
       if (p1) {
          c a = e.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(p0, a, uoc, "4") && a.c()) {
             a = a.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p0, a, c$b.class, str)) {
                c$b b3 = a.b;
                b uob = (b3 == null)? obj: b3.get();
                if (uob != p0) {
                   a.b = new WeakReference(p0);
                   a.a();
                }
             }
          }
          a = e.a;
          Objects.requireNonNull(a);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          Object obj1 = PatchProxy.apply(obj, a, uoc, str);
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(a.c()){
             Object obj2 = PatchProxy.apply(obj, obj, uoc, "7");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else if(Dva.instance().isLoaded("tflite") && Dva.instance().isLoaded("ks_audio_process_so")){
                b2 = true;
             }else {
                b2 = false;
             }
             if (b2) {
                LiveResourceFileUtil$LiveResourceFileType obj3 = PatchProxy.apply(obj, obj, uoc, "8");
                if (obj3 != patchProxyRe) {
                   b = obj3.booleanValue();
                }else {
                   obj3 = LiveResourceFileUtil$LiveResourceFileType.LIVE_ARYA_AI_DENOISE_MODEL;
                   b2 = b.S(LiveResourceFileUtil.j(obj3, obj3.mFilePathInfo.b()));
                   if (!b2) {
                      LiveResourceFileUtil.h(obj3);
                   }
                   b.Z(LiveLogTag.LIVE_ARYA, "模型文件："+b2);
                   b = b2;
                }
                if (b) {
                   b = true;
                }
             }
          }
       label_00e9 :
          b = false;
          uoc = (b)? e.a: e.b;
          e.c = uoc;
       }
       if (e.c == null) {
          e.c = e.b;
       }
       e.c.b(p0, p1);
       b.Z(LiveLogTag.LIVE_ARYA, "降噪，应用"+e.c.a()+", "+p1);
       e.d = p1;
       return;
    }
}
