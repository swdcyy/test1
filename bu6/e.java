package bu6.e;
import au6.a;
import com.kwai.kwaishare.qq.QQBaseShare;
import bu6.e$a;
import nsd.u;
import au6.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import au6.c;
import bu6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Collection;
import android.os.Bundle;
import com.kwai.kwaishare.kit.ShareKitConfig;
import au6.d;
import au6.d$a;
import cu6.b;

public final class e extends QQBaseShare implements a	// class@00060b
{
    public final boolean e;
    public static final e$a f;

    static {
       e.f = new e$a(null);
    }
    public void e(){
       super();
    }
    public void a(f p0){
       boolean b;
       c uoc;
       b obj;
       Bundle uBundle;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
          return;
       }
       a.p(p0, "shareRequest");
       int i = p0.c();
       int i1 = 1;
       if (i != i1) {
          b = 2;
          if (i != b) {
             uoc = p0.b();
             if (uoc != null) {
                uoc.b();
             }
          }else if(!p0 instanceof b){
             uoc = p0.b();
             if (uoc != null) {
                uoc.b();
             }
             return;
          }else {
             i = p0.d();
             String str = "imageUrl";
             String str1 = "targetUrl";
             if (i != i1 && i != b) {
                if (i != 3) {
                   if (i != 4) {
                      uoc = p0.b();
                      if (uoc != null) {
                         uoc.b();
                      }
                   }else {
                      obj = p0;
                      ArrayList obj1 = PatchProxy.applyOneRefs(obj, this, uoe, "5");
                      if (obj1 != PatchProxyResult.class) {
                         b = obj1.booleanValue();
                      }else {
                         obj1 = obj.g();
                         String str2 = (obj1 != null && !obj1.isEmpty())? 1: null;
                         if (str2) {
                            str2 = obj.i();
                            str2 = (str2 != null && str2.length() > 0)? 1: null;
                            if (str2) {
                               str2 = obj.j();
                               str2 = (str2 != null && str2.length() > 0)? 1: 0;
                               if (str2) {
                                  b = true;
                               }
                            }
                         }
                      label_00a4 :
                         b = false;
                      }
                      if (b) {
                         if (!PatchProxy.applyVoidOneRefs(obj, this, uoe, "4")) {
                            a.p(obj, "qqRequest");
                            uBundle = new Bundle();
                            uBundle.putString("appName", ShareKitConfig.k.a());
                            uBundle.putInt("cflag", i1);
                            uBundle.putInt("req_type", 7);
                            uBundle.putString("title", obj.n());
                            uBundle.putString("summary", obj.m());
                            uBundle.putString(str1, obj.l());
                            uBundle.putString("mini_program_appid", obj.i());
                            uBundle.putString("mini_program_path", obj.j());
                            uBundle.putString("mini_program_type", obj.k());
                            uBundle.putStringArrayList(str, obj.g());
                            QQBaseShare.f(this, obj, uBundle, false, 4, null);
                         }
                      }else {
                         uoc = p0.b();
                         if (uoc != null) {
                            uoc.b();
                         }
                      }
                   }
                }else {
                   obj = p0;
                   if (this.b(obj)) {
                      if (!PatchProxy.applyVoidOneRefs(obj, this, uoe, "3")) {
                         uBundle = new Bundle();
                         uBundle.putString("appName", ShareKitConfig.k.a());
                         uBundle.putInt("cflag", i1);
                         uBundle.putInt("req_type", 5);
                         uBundle.putString("imageLocalUrl", obj.f());
                         this.e(obj, uBundle, i1);
                      }
                   }else {
                      uoc = p0.b();
                      if (uoc != null) {
                         uoc.b();
                      }
                   }
                }
             }else {
                obj = p0;
                if (this.c(obj)) {
                   if (!PatchProxy.applyVoidOneRefs(obj, this, uoe, "2")) {
                      uBundle = new Bundle();
                      uBundle.putString("appName", ShareKitConfig.k.a());
                      uBundle.putInt("cflag", i1);
                      uBundle.putInt("req_type", i1);
                      uBundle.putString("title", obj.n());
                      uBundle.putString("summary", obj.m());
                      uBundle.putString(str1, obj.l());
                      uBundle.putStringArrayList(str, obj.g());
                      QQBaseShare.f(this, obj, uBundle, false, 4, null);
                   }
                }else {
                   uoc = p0.b();
                   if (uoc != null) {
                      uoc.b();
                   }
                }
             }
          }
       }else {
          a uoa = d.b.a().b("more");
          if (!p0 instanceof b || uoa == null) {
             uoc = p0.b();
             if (uoc != null) {
                uoc.b();
             }
             return;
          }else {
             uoa.a(p0);
          }
       }
    label_01c2 :
       return;
    }
    public boolean d(){
       return this.e;
    }
}
