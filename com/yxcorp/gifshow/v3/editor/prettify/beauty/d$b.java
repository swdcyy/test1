package com.yxcorp.gifshow.v3.editor.prettify.beauty.d$b;
import qsc.g;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p0c.a;
import p0c.h;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import com.yxcorp.gifshow.prettify.beauty.BeautifyFilterFragment;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class d$b implements g	// class@001153
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       d$b uob = d$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "2")) {
          this.a.P8();
          uob = this.a;
          if (uob.x != null && !uob.s.a().n()) {
             d x = this.a.x;
             Objects.requireNonNull(x);
             if (!PatchProxy.applyVoid(null, x, PrettifyBaseFragment.class, "10")) {
                PrettifyBaseFragment p = x.p;
                int len = p.length;
                int i = 0;
                while (i < len) {
                   object oobject = p[i];
                   if (oobject instanceof BeautifyFilterFragment) {
                      Objects.requireNonNull(oobject);
                      if (!PatchProxy.applyVoid(null, oobject, BeautifyFilterFragment.class, "13")) {
                         oobject.s.onNext(Boolean.TRUE);
                      }
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
}
