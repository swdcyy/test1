package com.kuaishou.live.core.show.activityredpacket.user.f$a;
import com.kuaishou.live.core.show.activityredpacket.user.f$c;
import com.kuaishou.live.core.show.activityredpacket.user.f;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView;
import o22.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import z12.x;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.kuaishou.live.core.show.activityredpacket.user.a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import h22.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.kuaishou.live.core.show.activityredpacket.user.f$a$a;
import com.kuaishou.live.core.show.activityredpacket.user.LiveActivityRedPacketBaseUserInfoView$a;
import com.kuaishou.live.common.core.component.follow.cache.c;
import brd.t;
import x22.c;
import x22.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class f$a implements f$c	// class@0009a4
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(LiveActivityRedPacketBaseUserInfoView p0,i p1,boolean p2){
       User user;
       i c;
       LiveActivityRedPacketBaseUserInfoView b;
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, f$a.class, "1")) {
          return;
       }
       f$a ta = this.a;
       ta.t = p0;
       ta.u = p1;
       if (p1.c() != null) {
          f$a ta1 = this.a;
          f t = ta1.t;
          user = UserInfo.convertToQUser(ta1.u.c());
          c = p1.c;
          Objects.requireNonNull(t);
          if (!PatchProxy.isSupport(LiveActivityRedPacketBaseUserInfoView.class) || !PatchProxy.applyVoidTwoRefs(user, Integer.valueOf(c), t, LiveActivityRedPacketBaseUserInfoView.class, "1")) {
             b = t.b;
             if (b != null) {
                x.c(b, user);
                t.b.setBorderColor(c);
                t.b.setOnClickListener(new a(t));
             }
          }
       }else {
          b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "user info is Empty,redPacketId is "+this.a.r.d());
       }
       f t1 = this.a.t;
       i d = p1.d;
       c = p1.e;
       Objects.requireNonNull(t1);
       if (!PatchProxy.isSupport(LiveActivityRedPacketBaseUserInfoView.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(d), c, t1, LiveActivityRedPacketBaseUserInfoView.class, "4") && t1.d != null)) {
          if (!TextUtils.x(c)) {
             t1.d.setVisibility(0);
             t1.d.setTextColor(d);
             t1.d.setText(c);
          }else {
             t1.d.setVisibility(8);
          }
       }
       this.a.t.setUserInfoListener(new f$a$a(this, p2));
       this.a.X7(c.b().d(p1.c().mId).take(1).subscribe(new c(this), new d(this)));
       return;
    }
}
