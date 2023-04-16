package com.kwai.live.gzone.follow.fullscreen.a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.follow.fullscreen.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import lnc.a1;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import va1.d0;
import g57.a;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class a implements View$OnClickListener	// class@000cf7
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "4")) {
       }else if(!QCurrentUser.me().isLogined()){
          d.a(-1712118428).ne(tb.getActivity(), d0.a(tb.v), "live_gzone_wonderful_moment_portrait_follow_tip", 40, a1.p(R.string.arg_RES_7f103077), tb.v.mEntity, null, null, new a(tb)).h();
       }else {
          tb.P8();
       }
       return;
    }
}
