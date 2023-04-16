package com.yxcorp.gifshow.activity.share.presenter.m2$g;
import com.yxcorp.gifshow.activity.share.presenter.m2$h;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import zw8.c5;
import java.lang.Runnable;
import ekd.k1;

public class m2$g implements m2$h	// class@001409
{
    public final m2 a;

    public void m2$g(m2 p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m2$g.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().u("SharePreviewPresenter", p0, objArray);
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, m2$g.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("SharePreviewPresenter", "autoCropCoverIfNeeded\(\) coverCrop success", objArray);
       k1.o(new c5(this));
       return;
    }
}
