package com.yxcorp.gifshow.relation.explore.presenter.n$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.presenter.n;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import java.util.Objects;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import android.animation.AnimatorSet;
import hac.z0;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import a7c.h;
import f7c.c;
import y6c.e;

public class n$b extends m	// class@001858
{
    public final n c;

    public void n$b(n p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "1")) {
          return;
       }
       ja.a();
       n$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, n.class, "9")) {
          Object obj = tc.Z0.N0(0);
          if (obj != null) {
             if (obj.mType == 2) {
                tc.b1.onNext(Integer.valueOf(7));
             }else {
                n e1 = tc.e1;
                if (e1 != null && (!e1.isRunning() && tc.f1 == null)) {
                   z0 oz0 = new z0(tc, tc.z.getActivity(), obj, tc.x, true, tc.y.t(), obj);
                   tc.f1.b(0, 0);
                }
             }
          }
       }
       return;
    }
}
