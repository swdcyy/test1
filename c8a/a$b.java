package c8a.a$b;
import d6a.a;
import c8a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import c8a.c;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Math;

public final class a$b extends a	// class@00056c
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       if (c.c() == null) {
          return;
       }
       a r = this.b.r;
       if (r == null) {
          a.S("mPhoto");
       }
       c.f(r);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       if (c.c() == null) {
          return;
       }
       a q = this.b.q;
       if (q == null) {
          a.S("mSlidePlayViewModel");
       }
       int i = q.a0();
       QPhoto qPhoto = c.c();
       a.m(qPhoto);
       if (Math.abs((this.b.P8(qPhoto) - i)) > 5) {
          c.f(objArray);
          c.e(objArray);
          return;
       }else if(c.d() == null){
          return;
       }else {
          QPhoto qPhoto1 = c.d();
          a.m(qPhoto1);
          int i1 = this.b.P8(qPhoto1);
          if (i < i1) {
             c.d = c.g() + 1;
          }
          if (c.g() >= 3 && !c.c) {
             this.b.S8();
             c.c = true;
          }
          return;
       }
    }
}
