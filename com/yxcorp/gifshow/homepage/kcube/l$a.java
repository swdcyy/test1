package com.yxcorp.gifshow.homepage.kcube.l$a;
import hka.b;
import com.yxcorp.gifshow.homepage.kcube.l;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gsa.l;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class l$a implements b	// class@00173b
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       this.a.h.h.onNext(Boolean.FALSE);
       return;
    }
}
