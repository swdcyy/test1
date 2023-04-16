package com.yxcorp.gifshow.activity.share.presenter.m2$d;
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

public class m2$d extends m2$j	// class@001406
{
    public final m2 d;

    public void m2$d(m2 p0){
       this.d = p0;
       super(p0, null);
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m2$d.class, "1")) {
          return;
       }
       a.b().e("SharePreviewPresenter", "onFailure bindFeedCover", p1);
       return;
    }
}
