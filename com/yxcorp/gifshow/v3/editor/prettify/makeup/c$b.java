package com.yxcorp.gifshow.v3.editor.prettify.makeup.c$b;
import qsc.g;
import com.yxcorp.gifshow.v3.editor.prettify.makeup.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import com.yxcorp.gifshow.prettify.makeup.MakeupFragment;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class c$b implements g	// class@001192
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       c$b uob = c$b.class;
       if (PatchProxy.applyVoid(null, this, uob, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "2")) {
          uob = this.a;
          if (uob.v != null) {
             uob.V8();
             c v = this.a.v;
             Objects.requireNonNull(v);
             if (!PatchProxy.applyVoid(null, v, PrettifyBaseFragment.class, "12")) {
                PrettifyBaseFragment p = v.p;
                int len = p.length;
                int i = 0;
                while (i < len) {
                   object oobject = p[i];
                   if (oobject instanceof MakeupFragment) {
                      Objects.requireNonNull(oobject);
                      if (!PatchProxy.applyVoid(null, oobject, MakeupFragment.class, "9")) {
                         oobject.t.onNext(Boolean.TRUE);
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
