package com.yxcorp.gifshow.activity.share.presenter.m2$e;
import com.yxcorp.gifshow.activity.share.presenter.m2$j;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import com.yxcorp.gifshow.activity.share.presenter.l2;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;

public class m2$e extends m2$j	// class@001407
{
    public final m2 d;

    public void m2$e(m2 p0){
       this.d = p0;
       super(p0, null);
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2$e.class, "1")) {
          return;
       }
       a.b().e("SharePreviewPresenter", "onFailure bindFeedCoverToPlayer", p1);
       return;
    }
}
