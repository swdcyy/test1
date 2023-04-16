package c79.a$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import android.net.Uri;
import c79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import c79.e;
import c79.d;
import java.util.Objects;
import c79.c$b;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import g79.a;
import w69.r0;

public final class a$a	// class@0004f2
{

    public void a$a(){
       super();
    }
    public void a$a(u p0){
       super();
    }
    public final void a(CompatImageView p0,Uri p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "6")) {
          return;
       }
       a.q(p0, "imageView");
       a.q(p1, "uri");
       this.b(p0, p1, p2, null);
       return;
    }
    public final void b(CompatImageView p0,Uri p1,c p2,e p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a$a.class, "7")) {
          return;
       }
       a.q(p0, "imageView");
       a.q(p1, "uri");
       this.c(p0, p1, p2, p3, null);
       return;
    }
    public final void c(CompatImageView p0,Uri p1,c p2,e p3,d p4){
       c uoc;
       a$a uoa = a$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "8")) {
             return;
          }
       }
       a.q(p0, "imageView");
       a.q(p1, "uri");
       c$b p = c.p;
       c xmlParams = p0.getXmlParams();
       Objects.requireNonNull(p);
       String str = "1";
       String obj = PatchProxy.applyTwoRefs(xmlParams, p2, p, c$b.class, str);
       if (obj != PatchProxyResult.class) {
          p2 = obj;
       }else if(xmlParams == null){
          if (p2 != null) {
             if (p2.j() != null) {
                xmlParams.u(p2.j());
             }
             if (p2.c() != null) {
                xmlParams.b = p2.c();
             }
             if (p2.e() != null) {
                xmlParams.c = p2.e();
             }
             String str1 = -1;
             if (p2.n() != str1) {
                xmlParams.d = p2.n();
             }
             if (p2.f() != str1) {
                xmlParams.e = p2.f();
             }
             if (p2.l() != str1) {
                xmlParams.v(p2.l());
             }
             if (p2.d()) {
                xmlParams.g = p2.d();
             }
             if (p2.b() - null) {
                xmlParams.q(p2.b());
             }
             if (p2.a() != str1) {
                xmlParams.i = p2.a();
             }
             if (p2.k() != str1) {
                xmlParams.j = p2.k();
             }
             if (p2.o()) {
                xmlParams.k = p2.o();
             }
             if (a.g(p2.m(), "") ^ i) {
                obj = p2.m();
                if (!PatchProxy.applyVoidOneRefs(obj, xmlParams, c.class, str)) {
                   a.q(obj, "<set-?>");
                   xmlParams.l = obj;
                }
             }
             if (p2.h() > 0) {
                xmlParams.s(p2.h());
             }
             if (p2.i() > 0) {
                xmlParams.t(p2.i());
             }
             if (p2.g() > 0) {
                xmlParams.r(p2.g());
             }
          }
          uoc = xmlParams;
       label_0129 :
          a.c.e().a(p0, p1, uoc, p3, p4);
          return;
       }
       uoc = p2;
       goto label_0129 ;
    }
}
