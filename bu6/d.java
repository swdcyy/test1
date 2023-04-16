package bu6.d;
import au6.a;
import com.kwai.kwaishare.qq.QQBaseShare;
import bu6.d$a;
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
import android.os.Bundle;
import com.kwai.kwaishare.kit.ShareKitConfig;
import au6.d;
import au6.d$a;
import cu6.b;

public final class d extends QQBaseShare implements a	// class@000609
{
    public final boolean e;
    public static final d$a f;

    static {
       d.f = new d$a(null);
    }
    public void d(){
       super();
       this.e = true;
    }
    public void a(f p0){
       c uoc;
       b obj;
       Bundle uBundle;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       a.p(p0, "shareRequest");
       int i = p0.c();
       boolean b = true;
       if (i != b) {
          boolean b1 = 2;
          if (i != b1) {
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
             if (i != b && i != b1) {
                if (i != 3) {
                   if (i != 4) {
                      uoc = p0.b();
                      if (uoc != null) {
                         uoc.b();
                      }
                   }else {
                      obj = p0;
                      String obj1 = PatchProxy.applyOneRefs(obj, this, uod, "5");
                      if (obj1 != PatchProxyResult.class) {
                         b = obj1.booleanValue();
                      }else {
                         a.p(obj, "qqRequest");
                         obj1 = obj.n();
                         obj1 = (obj1 != null && obj1.length() > 0)? 1: null;
                         if (obj1) {
                            obj1 = obj.m();
                            obj1 = (obj1 != null && obj1.length() > 0)? 1: null;
                            if (obj1) {
                               obj1 = obj.l();
                               obj1 = (obj1 != null && obj1.length() > 0)? 1: null;
                               if (obj1) {
                                  obj1 = obj.h();
                                  obj1 = (obj1 != null && obj1.length() > 0)? 1: null;
                                  if (obj1) {
                                     obj1 = obj.i();
                                     obj1 = (obj1 != null && obj1.length() > 0)? 1: null;
                                     if (obj1) {
                                        obj1 = obj.j();
                                        obj1 = (obj1 != null && obj1.length() > 0)? 1: 0;
                                        if (!obj1) {
                                        label_00da :
                                           b = false;
                                        }
                                     }else {
                                        goto label_00da ;
                                     }
                                  }else {
                                     goto label_00da ;
                                  }
                               }else {
                                  goto label_00da ;
                               }
                            }else {
                               goto label_00da ;
                            }
                         }else {
                            goto label_00da ;
                         }
                      }
                      if (b) {
                         if (!PatchProxy.applyVoidOneRefs(obj, this, uod, "4")) {
                            uBundle = new Bundle();
                            uBundle.putString("appName", ShareKitConfig.k.a());
                            uBundle.putInt("req_type", 7);
                            uBundle.putString("title", obj.m());
                            uBundle.putString("summary", obj.n());
                            uBundle.putString(str1, obj.l());
                            uBundle.putString("mini_program_appid", obj.i());
                            uBundle.putString("mini_program_path", obj.j());
                            uBundle.putString("mini_program_type", obj.k());
                            uBundle.putString(str, obj.h());
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
                      if (!PatchProxy.applyVoidOneRefs(obj, this, uod, "3")) {
                         uBundle = new Bundle();
                         uBundle.putString("appName", ShareKitConfig.k.a());
                         uBundle.putInt("req_type", 5);
                         uBundle.putString("imageLocalUrl", obj.f());
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
                if (this.c(obj)) {
                   if (!PatchProxy.applyVoidOneRefs(obj, this, uod, "2")) {
                      Bundle uBundle1 = new Bundle();
                      uBundle1.putString("appName", ShareKitConfig.k.a());
                      uBundle1.putInt("req_type", b);
                      uBundle1.putString("title", obj.n());
                      uBundle1.putString("summary", obj.m());
                      uBundle1.putString(str1, obj.l());
                      uBundle1.putString(str, obj.h());
                      QQBaseShare.f(this, obj, uBundle1, false, 4, null);
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
    label_01ed :
       return;
    }
    public boolean d(){
       return this.e;
    }
}
