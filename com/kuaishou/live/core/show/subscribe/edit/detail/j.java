package com.kuaishou.live.core.show.subscribe.edit.detail.j;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment$d;
import com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeSelectItemView;
import java.lang.Object;
import android.widget.CompoundButton;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.edit.detail.LiveSubscribeDetailFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tk2.a0;
import tk2.b0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import d61.g;
import ok.x;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import wk2.s;
import u07.t$a;
import u07.f;
import tk2.h;
import u07.u;
import tk2.i;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public final class j implements CompoundButton$OnCheckedChangeListener	// class@00110f
{
    public final LiveSubscribeDetailFragment$d b;
    public final LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo c;
    public final LiveSubscribeSelectItemView d;

    public void j(LiveSubscribeDetailFragment$d p0,LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo p1,LiveSubscribeSelectItemView p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onCheckedChanged(CompoundButton p0,boolean p1){
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(LiveSubscribeDetailFragment$d.class) || !PatchProxy.applyVoidThreeRefs(tc, td, Boolean.valueOf(p1), tb, LiveSubscribeDetailFragment$d.class, "2")) {
          LiveAnchorSubscriberCreateConfig$LiveSubscribeSuccessInfo liveSubscrib = null;
          if (p1) {
             if (tc.mIsPhotoRelated != null) {
                LiveSubscribeDetailFragment s = tb.a.s;
                if (s != null) {
                   liveSubscrib = s.mSubscribeId;
                }
                if (!TextUtils.n(liveSubscrib, tc.mSubscribeId)) {
                   LiveSubscribeDetailFragment$d a = tb.a;
                   a0 uoa0 = new a0(tb, tc);
                   b0 uob0 = new b0(td);
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidTwoRefs(uoa0, uob0, a, LiveSubscribeDetailFragment.class, "27")) {
                      FragmentActivity activity = a.getActivity();
                      if (!g.h(activity)) {
                         s.o(0, a.m.get(), a.n.get());
                         t$a uoa = f.e(new t$a(activity));
                         uoa.W0(R.string.arg_RES_7f102cbb);
                         uoa.y0(R.string.arg_RES_7f102cba);
                         uoa.S0(R.string.arg_RES_7f102cb9);
                         uoa.Q0(R.string.cancel);
                         uoa.u0(new h(uoa0));
                         uoa.t0(new i(uob0));
                         uoa.v(true);
                         uoa.Y(PopupInterface.a);
                      }
                   }
                }
             }
             tb.a.jh(tc);
          }else {
             LiveSubscribeDetailFragment$d a1 = tb.a;
             if (a1.s == tc) {
                a1.jh(liveSubscrib);
             }
          }
       }
       return;
    }
}
