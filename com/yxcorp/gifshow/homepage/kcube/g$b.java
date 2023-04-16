package com.yxcorp.gifshow.homepage.kcube.g$b;
import hka.g;
import com.yxcorp.gifshow.homepage.kcube.g;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import gsa.l;
import io.reactivex.subjects.PublishSubject;

public class g$b implements g	// class@001732
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Configuration p1){
       if (PatchProxy.isSupport(g$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, g$b.class, "1")) {
          return;
       }
       this.a.h.g.onNext(Boolean.valueOf(p0));
       return;
    }
}
