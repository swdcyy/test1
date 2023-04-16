package gha.p;
import lnc.a1;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.model.FollowTabNotify;
import lha.b;
import androidx.fragment.app.Fragment;
import ro5.a;
import xa5.a;
import bo5.a;
import zq6.p;
import co5.m;
import co5.j;
import co5.n;
import co5.f;
import co5.h;
import co5.q;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import pr6.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class p	// class@002ae1
{
    public static String a;
    public static FollowTabNotify b;
    public static b c;
    public static b d;
    public static final int e;

    static {
       p.e = a1.e(24.00f);
    }
    public void p(){
       super();
    }
    public static boolean a(Bitmap p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && !p0.isRecycled()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public static Bitmap b(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       boolean b = true;
       try{
          return p0.copy(p0.getConfig(), b);
       }catch(java.lang.OutOfMemoryError e0){
          return Bitmap.createScaledBitmap(p0, (p0.getWidth() / 2), (p0.getHeight() / 2), e0);
       }catch(java.lang.Exception e0){
       }
    }
    public static FollowTabNotify c(){
       return p.b;
    }
    public static b d(){
       return p.c;
    }
    public static b e(){
       return p.d;
    }
    public static String f(){
       return p.a;
    }
    public static boolean g(Fragment p0){
       boolean b1;
       boolean b2;
       a uoa = a.class;
       q obj = PatchProxy.applyOneRefs(p0, null, p.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.h(p0)) {
          obj = PatchProxy.applyOneRefs(p0, null, uoa, "29");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             m om = a.f(p0, a.z);
             om = (om != null)? om.a: null;
          }
          if (b1 == null) {
             obj = PatchProxy.applyOneRefs(p0, null, uoa, "34");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                j oj = a.f(p0, a.A);
                oj = (oj != null)? oj.a: null;
             }
             if (b1 == null) {
                obj = PatchProxy.applyOneRefs(p0, null, uoa, "23");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else {
                   n on = a.f(p0, a.y);
                   on = (on != null)? on.a: null;
                }
                if (b1 == null) {
                   obj = PatchProxy.applyOneRefs(p0, null, uoa, "42");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   }else {
                      f uof = a.f(p0, a.G);
                      uof = (uof != null)? uof.a: null;
                   }
                   if (b1 == null) {
                      obj = PatchProxy.applyOneRefs(p0, null, uoa, "51");
                      if (obj != PatchProxyResult.class) {
                         b1 = obj.booleanValue();
                      }else {
                         h oh = a.f(p0, a.J);
                         oh = (oh != null)? oh.a: null;
                      }
                      if (b1 == null) {
                         obj = PatchProxy.applyOneRefs(p0, null, uoa, "55");
                         if (obj != PatchProxyResult.class) {
                            b1 = obj.booleanValue();
                         }else {
                            obj = a.f(p0, a.K);
                            obj = (obj != null)? obj.a: null;
                         }
                         if (b1 == null) {
                            Object obj1 = PatchProxy.applyOneRefs(p0, null, uoa, "30");
                            if (obj1 != PatchProxyResult.class) {
                               b2 = obj1.booleanValue();
                            }else {
                               FollowTabNotify uFollowTabNo = a.f(p0, a.L);
                               b2 = (uFollowTabNo != null)? uFollowTabNo.valid(): false;
                            }
                            if (!b2) {
                            label_00f9 :
                               return b;
                            }
                         }
                      }
                   }
                }
             }
          }
       label_00f8 :
          b = true;
          goto label_00f9 ;
       }else {
          goto label_00f9 ;
       }
    }
    public static void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "18")) {
          return;
       }
       a.a().c();
       c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag("FollowTabNotify"), p0);
       return;
    }
    public static void i(d p0,FollowTabNotify p1){
       String str;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, p.class, "14")) {
          return;
       }
       if (p0 != null) {
          Objects.requireNonNull(p0);
          str = PatchProxy.apply(obj, p0, d.class, "9");
          if (str != PatchProxyResult.class) {
          }else {
             str = p0.b.getClass().getName();
             a.o(str, "fragment.javaClass.name");
          }
       }else {
          str = "fragment param is null";
       }
       String str1 = (p1 != null)? p1.toString(): "followTabNotify param is null";
       p.h(str+": receive new "+str1);
       return;
    }
    public static void j(FollowTabNotify p0){
       p.b = p0;
    }
    public static void k(b p0){
       p.c = p0;
    }
    public static void l(b p0){
       p.d = p0;
    }
}
