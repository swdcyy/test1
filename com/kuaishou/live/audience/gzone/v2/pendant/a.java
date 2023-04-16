package com.kuaishou.live.audience.gzone.v2.pendant.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.common.gzone.pendant.LiveGzonePendant;
import z31.b;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import z31.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class a implements View$OnClickListener	// class@000c3b
{
    public final LiveGzoneActivityPendantView b;

    public void a(LiveGzoneActivityPendantView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveGzoneActivityPendantView.class, "3")) {
       }else {
          Activity uActivity = n.d(tb);
          if (tb.d == null || (tb.getContext() != null && uActivity instanceof GifshowActivity)) {
             LiveGzonePendant mLink = tb.d.mLink;
             LiveGzoneActivityPendantView g = tb.g;
             if (g != null) {
                g.a();
             }
             if (!QCurrentUser.me().isLogined()) {
                d.a(-1712118428).ne(tb.getContext(), uActivity.getUrl(), "live_pendant", 0, "", null, null, null, new a(tb, mLink)).h();
             }else {
                tb.c(mLink);
             }
          }
       }
       return;
    }
}
