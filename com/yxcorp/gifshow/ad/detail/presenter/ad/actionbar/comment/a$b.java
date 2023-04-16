package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a$b;
import ekd.f$k;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.view.View;

public class a$b extends f$k	// class@001568
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void f(float p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.p.setTranslationY(p0);
       return;
    }
}
