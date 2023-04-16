package com.yxcorp.gifshow.homepage.kcube.l$b;
import hka.g;
import com.yxcorp.gifshow.homepage.kcube.l;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import gsa.l;
import io.reactivex.subjects.PublishSubject;

public class l$b implements g	// class@00173c
{
    public final l a;

    public void l$b(l p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Configuration p1){
       if (PatchProxy.isSupport(l$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, l$b.class, "1")) {
          return;
       }
       this.a.h.g.onNext(Boolean.valueOf(p0));
       return;
    }
}
