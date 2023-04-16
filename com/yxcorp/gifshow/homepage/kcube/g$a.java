package com.yxcorp.gifshow.homepage.kcube.g$a;
import hka.b;
import com.yxcorp.gifshow.homepage.kcube.g;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gsa.l;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public class g$a implements b	// class@001731
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.a.h.h.onNext(Boolean.FALSE);
       return;
    }
}
