package com.kuaishou.live.core.show.closepage.audience.basicinfo.l;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import f52.d0;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.m;
import erd.o;
import f52.b0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lu7.f;
import java.lang.CharSequence;
import android.widget.TextView;
import f52.c0;
import java.lang.Runnable;
import ekd.k1;
import f52.y;

public final class l implements g	// class@000a41
{
    public final n b;
    public final LiveStreamFeedWrapper c;

    public void l(n p0,LiveStreamFeedWrapper p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l tb = this.b;
       l tc = this.c;
       Objects.requireNonNull(tb);
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(tc, tb, on, "5")) {
       }else {
          tb.w.setLayoutResource(R.layout.arg_RES_7f0d0d13);
          View view = tb.w.inflate();
          if (!PatchProxy.applyVoidTwoRefs(tc, view, tb, on, "7") && view != null) {
             KwaiImageView kwaiImageVie = view.findViewById(R.id.live_play_closed_v3_avatar_view);
             kwaiImageVie.bringToFront();
             g.b(kwaiImageVie, tc.getUser(), HeadImageSize.MIDDLE);
             kwaiImageVie.setOnClickListener(new d0(tb, tc));
          }
       }
       User user = tc.getUser();
       p0 = p0.mEnableShowUserOperationModule;
       if (!PatchProxy.isSupport(on) || !PatchProxy.applyVoidThreeRefs(tc, user, Boolean.valueOf(p0), tb, n.class, "6")) {
          tb.X7(user.observable().distinctUntilChanged(m.b).subscribe(new b0(tb, p0)));
          tb.r.setText(f.b(tc.getUserId(), tc.getUserName()));
          n t = tb.t;
          int i = (tc.getUser().isFollowingOrFollowRequesting() || p0 != null)? 8: 0;
          t.setVisibility(i);
          if (!tb.t.getVisibility()) {
             k1.r(new c0(tb), 500);
          }
          tb.t.setOnClickListener(new y(tb));
       }
       return;
    }
}
