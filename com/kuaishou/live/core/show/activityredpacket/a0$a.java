package com.kuaishou.live.core.show.activityredpacket.a0$a;
import com.kuaishou.live.core.show.activityredpacket.a0$b;
import com.kuaishou.live.core.show.activityredpacket.a0;
import java.lang.Object;
import o22.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import java.util.Objects;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import android.widget.ImageView;
import v22.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y22.q;
import com.kwai.robust.PatchProxyResult;
import o22.h;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinInnerInfo;
import z12.x;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import ekd.j;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import w22.a$b;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable$Orientation;
import android.graphics.drawable.Drawable;

public class a0$a implements a0$b	// class@00093a
{
    public final a0 a;

    public void a0$a(a0 p0){
       this.a = p0;
       super();
    }
    public void a(b p0,boolean p1){
       a0 u;
       a0$a uoa = a0$a.class;
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "showRewardListView");
       uoa = this.a;
       uoa.Q = p1;
       uoa.S = p0;
       p0.b.setValue(Integer.valueOf(2));
       p1.t = p0.c.getValue();
       a0$a ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = null;
       int i = 8;
       int i1 = 0;
       if (!PatchProxy.applyVoid(objArray, ta, uoa0, "4") && (ta.v == null || (ta.u != null && ta.y == null))) {
          a.c(ta.getContext(), R.layout.arg_RES_7f0d09bc, ta.u);
          ta.y = ta.u.findViewById(0x7f0a1865);
          ta.D = ta.u.findViewById(0x7f0a1832);
          ta.F = ta.y.findViewById(0x7f0a1866);
          ta.G = ta.y.findViewById(0x7f0a1867);
          ta.z = ta.u.findViewById(0x7f0a186b);
          ta.A = ta.u.findViewById(0x7f0a1869);
          ta.B = ta.u.findViewById(0x7f0a186a);
          ta.H = ta.y.findViewById(0x7f0a186c);
          ta.E = ta.v.findViewById(0x7f0a182f);
          ta.J = ta.y.findViewById(0x7f0a2dec);
          ta.K = ta.y.findViewById(0x7f0a2deb);
          ta.L = ta.y.findViewById(0x7f0a2ded);
          ta.N = new c();
          ta.G.setLayoutManager(new LinearLayoutManager(ta.getContext(), 1, i1));
          ta.G.setAdapter(ta.N);
          u = ta.t;
          h oh = PatchProxy.applyOneRefs(u, objArray, q.class, "8");
          if (oh != PatchProxyResult.class) {
          }else if(u != null){
             LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme1 = u.skinTheme;
             if (skinTheme1 != null && skinTheme1.innerInfo != null) {
                oh = new h();
                oh.a = x.z(u.skinTheme.innerInfo.luckyTitleColor);
                oh.b = x.z(u.skinTheme.innerInfo.resultFontColor);
                oh.c = x.z(u.skinTheme.innerInfo.subscriptFontColor);
                oh.e = x.A(u.skinTheme.innerInfo.topLuckyEmptyColor, 0x7f061566);
                LiveRedPackSkinMessage$RedPackSkinInnerInfo bgSubscriptC = u.skinTheme.innerInfo.bgSubscriptColor;
                if (bgSubscriptC != null && bgSubscriptC.length > 0) {
                   oh.d = x.y(bgSubscriptC);
                }
             }
          }
          oh = objArray;
          ta.O = oh;
          ta.N.f = oh;
          if (oh != null) {
             ta.z.setTextColor(oh.b());
             ta.A.setBackgroundColor(ta.O.b());
             ta.B.setBackgroundColor(ta.O.b());
          }
          ta.w.setVisibility(i);
          ta.x.setVisibility(i);
       }
    label_01b3 :
       this.a.R8();
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uoa0, "9")) {
          ta.I.setVisibility(i);
          u = ta.u;
          if (u != null) {
             u.bringToFront();
          }
          ta.D.setVisibility(i1);
          ta.E.setVisibility(i1);
          ViewGroup$LayoutParams layoutParams = ta.D.getLayoutParams();
          layoutParams.height = a1.d(0x7f07093e);
          ta.D.setLayoutParams(layoutParams);
          CDNUrl[] uCDNUrlArray = (j.h(ta.t.skinTheme.coverTopPict))? e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_TOP_BACKGROUND.getResourcePath())): e0.i(ta.t.skinTheme.coverTopPict);
          ta.p.a(ta.D, uCDNUrlArray, -1);
          uCDNUrlArray = (j.h(ta.t.skinTheme.coverBottomPict))? e0.h(c0.a.b(LiveRedPacketResourcePathConstant.LIVE_ACTIVITY_RED_PACKET_PREPARE_BOTTOM_BACKGROUND.getResourcePath())): e0.i(ta.t.skinTheme.coverBottomPict);
          ta.p.a(ta.E, uCDNUrlArray, -1);
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uoa0, "10")) {
          LiveTreasureBoxMessage$LiveTreasureBoxShow skinTheme = ta.t.skinTheme;
          if (skinTheme != null && skinTheme.innerInfo != null) {
             GradientDrawable gradientDraw = new GradientDrawable(GradientDrawable$Orientation.TOP_BOTTOM, x.y(ta.t.skinTheme.innerInfo.gbInnerColor));
             gradientDraw.setCornerRadius((float)a1.e(28.00f));
             gradientDraw.setStroke(a1.e(0x3f800000), q.e(x.y(ta.t.skinTheme.innerInfo.borderColor)));
             ta.H.setBackground(gradientDraw);
          }
       }
       return;
    }
}
