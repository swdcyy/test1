package com.kuaishou.merchant.home2.main.predict.Predict$activeTaskAndSetup$2$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a04.j;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import a04.l;
import java.util.Objects;
import ot3.u0;

public final class Predict$activeTaskAndSetup$2$b implements g	// class@001816
{
    public static final Predict$activeTaskAndSetup$2$b b;

    static {
       Predict$activeTaskAndSetup$2$b.b = new Predict$activeTaskAndSetup$2$b();
    }
    public void Predict$activeTaskAndSetup$2$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Predict$activeTaskAndSetup$2$b.class, "1")) {
       }else {
          j.c.onNext(Boolean.FALSE);
          p0 = l.i;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, l.class, "5")) {
             l.d = u0.b();
             l.f = -100;
          }
       }
       return;
    }
}
