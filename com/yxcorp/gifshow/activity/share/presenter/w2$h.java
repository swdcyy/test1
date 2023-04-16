package com.yxcorp.gifshow.activity.share.presenter.w2$h;
import a2.n0;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class w2$h implements n0	// class@001449
{
    public final w2 a;

    public void w2$h(w2 p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$h.class, "1")) {
          return;
       }
       w2$h ta = this.a;
       if (ta.S != null) {
          ta.E.setTranslationY(0);
       }else {
          ta.E.setVisibility(8);
       }
       return;
    }
    public void b(View p0){
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$h.class, "2")) {
          return;
       }
       w2$h ta = this.a;
       if (ta.S != null) {
          ta.E.setTranslationY(0);
       }else {
          ta.E.setVisibility(8);
       }
       return;
    }
}
