package com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import fac.b;
import com.kwai.framework.model.user.RecoUser;
import io.reactivex.subjects.PublishSubject;
import y6c.i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.widget.RelativeLayout;
import f7c.c;

public class FriendPymkBigCardView$a extends m	// class@001887
{
    public final FriendPymkBigCardView c;

    public void FriendPymkBigCardView$a(FriendPymkBigCardView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView$a.class, "1")) {
          return;
       }
       FriendPymkBigCardView$a tc = this.c;
       tc.d.e.onNext(tc.c.mUser);
       FriendPymkBigCardView$a tc1 = this.c;
       new i(this.c.d.a.getActivity(), this.c.getRootView(), tc1.c, tc1.d.i).b();
       return;
    }
}
