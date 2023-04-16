package com.yxcorp.gifshow.v3.editor.cover.s$d;
import uv8.i2;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class s$d implements i2	// class@000ed2
{
    public final s a;

    public void s$d(s p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, s$d.class, "1")) {
          return;
       }
       s$d ta = this.a;
       if (ta.M != null) {
          ta.N.onNext(Boolean.TRUE);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, s$d.class, "2")) {
          return;
       }
       s$d ta = this.a;
       if (ta.M != null) {
          ta.N.onNext(Boolean.TRUE);
       }
       return;
    }
}
