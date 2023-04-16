package com.yxcorp.gifshow.homepage.kcube.presenter.a$d;
import wq6.c;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gr6.b;
import lr6.f;
import qsa.b;
import java.util.Objects;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class a$d extends c	// class@001750
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$d.class, "1")) {
          return;
       }
       b uob = this.a.C.c();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(objArray, uob, b.class, "3")) {
          uob.c.onNext(Boolean.TRUE);
       }
       return;
    }
}
