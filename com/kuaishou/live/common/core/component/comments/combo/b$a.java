package com.kuaishou.live.common.core.component.comments.combo.b$a;
import oe1.j;
import com.kuaishou.live.common.core.component.comments.combo.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Collection;
import ekd.q;
import io.reactivex.subjects.PublishSubject;

public class b$a implements j	// class@001067
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "2")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "8")) {
          ta.A.setVisibility(4);
       }
       return;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$a.class, "3")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, b.class, "9")) {
          ta.A.setVisibility(0);
       }
       return;
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, b.class, "6") && (!q.f(p0) && !ta.A.getVisibility())) {
          ta.G.onNext(p0);
          ta.X8();
       }
    label_0031 :
       return;
    }
}
