package com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$PostCardPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.relation.user.adapter.MissUProfileAndNoticeAdapter$PostCardPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.feature.post.api.postcard.PostCardView;
import lnc.p3;
import q87.c;
import java.util.List;

public class MissUProfileAndNoticeAdapter$PostCardPresenter$1 implements LifecycleObserver	// class@0019e4
{
    public final MissUProfileAndNoticeAdapter$PostCardPresenter b;

    public void MissUProfileAndNoticeAdapter$PostCardPresenter$1(MissUProfileAndNoticeAdapter$PostCardPresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MissUProfileAndNoticeAdapter$PostCardPresenter$1.class, "1")) {
          return;
       }
       if (this.b.q.booleanValue()) {
          MissUProfileAndNoticeAdapter$PostCardPresenter p = this.b.p;
          Objects.requireNonNull(p);
          if (!PatchProxy.applyVoid(objArray, p, PostCardView.class, "4")) {
             Object[] objArray1 = new Object[0];
             p3.D().w("PostCardView", "refresh", objArray1);
             p.a(p.d);
          }
       }else {
          this.b.q = Boolean.TRUE;
       }
       return;
    }
}
