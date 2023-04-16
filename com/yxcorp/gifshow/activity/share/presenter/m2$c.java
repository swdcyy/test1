package com.yxcorp.gifshow.activity.share.presenter.m2$c;
import ub.a;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;

public class m2$c extends a	// class@001405
{
    public final int b;
    public final int c;
    public final m2 d;

    public void m2$c(m2 p0,int p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2$c.class, "1")) {
          return;
       }
       a.b().e("SharePreviewPresenter", "initPreviewViews onFailure", p1);
       this.d.q9(this.b, this.c);
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2$c.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().t("SharePreviewPresenter", "initPreviewViews onIntermediateImageFailed", objArray);
       this.d.q9(this.b, this.c);
       return;
    }
}
