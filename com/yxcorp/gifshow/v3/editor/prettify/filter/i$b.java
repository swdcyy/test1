package com.yxcorp.gifshow.v3.editor.prettify.filter.i$b;
import qsc.g;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.v4.magic.filter.FilterFragment;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class i$b implements g	// class@001172
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       i$b uob = i$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          this.a.b9(false);
          i c = this.a.C;
          if (c instanceof FilterFragment) {
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(objArray, c, FilterFragment.class, "12")) {
                c.u.onNext(Boolean.TRUE);
             }
          }
       }
       return;
    }
}
