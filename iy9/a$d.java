package iy9.a$d;
import qp7.y0;
import iy9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.HashSet;
import tkd.b;
import tkd.d;
import eyb.c;

public final class a$d extends y0	// class@0028bc
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a$d.class, "2")) {
          return;
       }
       this.a.p0();
       return;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$d.class, "1")) {
          return;
       }
       if (this.a.n0()) {
          a$d ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, a.class, "4")) {
             a t = ta.t;
             if (t != null) {
                HashSet y = a.y;
                if (!y.contains(t.getPhotoId())) {
                   y.add(t.getPhotoId());
                   d.a(0x7a941161).FE();
                }
             }
             ta.o0(8);
          }
       }else {
          this.a.p0();
       }
       return;
    }
}
