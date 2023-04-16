package com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.view.FriendPymkBigCardView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.ja;
import android.widget.TextView;
import java.util.Objects;
import com.yxcorp.gifshow.relation.explore.view.BaseCardView;
import lac.c;
import fac.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;
import y6c.e;

public class FriendPymkBigCardView$c extends m	// class@001889
{
    public final FriendPymkBigCardView c;

    public void FriendPymkBigCardView$c(FriendPymkBigCardView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendPymkBigCardView$c.class, "1")) {
          return;
       }
       ja.a();
       FriendPymkBigCardView$c tc = this.c;
       Object obj = p0;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(obj, tc, FriendPymkBigCardView.class, "3") && tc.c != null) {
          BaseCardView d = tc.d;
          c uoc = new c(tc, tc.d.a.getActivity(), tc.c, d.i, true, d.c, obj);
          tc.c.b(false, false);
          ja.a();
       }
       return;
    }
}
