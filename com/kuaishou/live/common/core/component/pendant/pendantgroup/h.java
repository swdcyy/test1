package com.kuaishou.live.common.core.component.pendant.pendantgroup.h;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import cw1.d0;
import java.lang.Number;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i$d;
import java.lang.Enum;
import lnc.a1;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import p91.m;
import lp3.e;
import rd1.f;
import lp3.c;
import xd1.c;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import java.util.HashMap;
import java.lang.Integer;
import pp.c;
import com.kuaishou.live.common.core.component.pendant.LivePendantLogTag;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import com.kuaishou.android.live.log.b;
import cw1.o0;
import android.view.View;
import cs3.a;
import java.lang.Math;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.LiveRightPendantView;
import android.widget.RelativeLayout$LayoutParams;

public final class h implements Runnable	// class@00171e
{
    public final i b;
    public final String c;

    public void h(i p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int i;
       int i1;
       HashMap obj1;
       int i2;
       boolean b2;
       int i3;
       int i4;
       i m;
       Object[] objArray1;
       h oh = this;
       h b = oh.b;
       h c = oh.c;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, oi, "37")) {
       }else {
          LivePendantContainerScene livePendantC = b.q.b();
          LivePendantContainerScene obj = PatchProxy.applyOneRefs(livePendantC, b, oi, "40");
          String str = "scene";
          LiveSceneType liveSceneTyp = 0x7f0a1e9a;
          i = 2;
          if (obj != patchProxyRe) {
             i1 = obj.intValue();
          }else {
             String str1 = 0x42c80000;
             int i5 = 0x7f0a3fd0;
             obj1 = 0x7f0a26b7;
             switch (i$d.a[livePendantC.ordinal()]){
                 case 1:
                   i2 = b.t1(i5, a1.e(60.00f));
                   break;
                 case 2:
                   i2 = b.t1(obj1, a1.e(8.00f));
                   break;
                 case 3:
                   i2 = b.t1(i5, a1.e(40.00f));
                   break;
                 case 4:
                   i2 = b.t1(obj1, a1.e(8.00f));
                   break;
                 case 5:
                   i2 = b.P(R.id.live_line_area_float_container);
                   break;
                 case 6:
                   i2 = b.P(R.id.live_multi_line_render_area);
                   break;
                 case 7:
                 case 8:
                   m = b.m;
                   i4 = a1.e(8.00f);
                label_00ff :
                   i2 = m + i4;
                   break;
                 case 9:
                 case 11:
                 case 12:
                 case 10:
                   m = b.m;
                   break;
                 case 13:
                 case 15:
                 case 14:
                   if (b.J2() > 0) {
                      i2 = b.t1(obj1, a1.e(8.00f));
                   }else {
                      i2 = b.P(R.id.play_view_wrapper);
                   }
                   break;
                 case 16:
                   i2 = b.P(R.id.live_gzone_tabs_container);
                   break;
                 case 17:
                   if (b.t4()) {
                      i2 = a1.e(str1);
                   }else {
                      i2 = b.t1(obj1, a1.e(8.00f));
                   }
                   break;
                 case 18:
                   i2 = b.t1(liveSceneTyp, a1.e(8.00f));
                   break;
                 case 19:
                   i2 = b.t1(R.id.live_gzone_activity_banner_anchor_view, a1.e(8.00f));
                   break;
                 case 20:
                   c obj5 = PatchProxy.apply(objArray, b, oi, "47");
                   if (obj5 != patchProxyRe) {
                      m = obj5.intValue();
                   }else {
                      m = b.b;
                      if (m != null && m.u5() == LiveSceneType.Anchor) {
                         obj5 = b.b.t5().a(f.class).p();
                      }else {
                         m = b.b;
                         obj5 = (m != null && m.u5() == LiveSceneType.Audience)? b.b.t5().a(LiveAudienceChatService.class).p(): objArray;
                      }
                      if (obj5 != null) {
                         m = obj5.B();
                      }else {
                         m = 0;
                      }
                   }
                   i4 = a1.e(8.00f);
                   goto label_00ff ;
                   break;
                 default:
                   i2 = a1.e(str1);
             }
             obj1 = new HashMap();
             obj1.put(str, livePendantC.name());
             obj1.put("topPosition", Integer.valueOf(i2));
             c[] uocArray1 = new c[i];
             uocArray1[0] = LivePendantLogTag.LIVE_PENDANT;
             uocArray1[1] = LivePendantLogTag.LIVE_RIGHT_BOTTOM_PENDANT;
             b.X(Arrays.asList(uocArray1), "adjustTopPosition", obj1);
             i1 = i2;
          }
          obj = b.q.a();
          i q = b.q;
          Objects.requireNonNull(q);
          o0 oo0 = new o0(q);
          obj1 = PatchProxy.applyTwoRefs(obj, oo0, b, oi, "43");
          if (obj1 != patchProxyRe) {
             i2 = obj1.intValue();
             obj1 = 1;
          }else {
             i = 0x7f0a220a;
             switch (i$d.a[obj.ordinal()]){
                 case 2:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                 case 10:
                 case 11:
                 case 12:
                 case 13:
                 case 14:
                 case 16:
                 case 17:
                   i3 = b.N(i, 0);
                   break;
                 case 15:
                   if (oo0.apply(LivePendantContainerScene.ANCHOR_CHAT)) {
                      i3 = b.y1();
                   }else if(oo0.apply(LivePendantContainerScene.AUDIENCE_VIDEO_CHAT) || oo0.apply(LivePendantContainerScene.AUDIENCE_CHAT)){
                      i3 = b.C1();
                   }else {
                      i3 = b.N(i, 0);
                   }
                   break;
                 case 20:
                   Object obj4 = PatchProxy.apply(objArray, b, oi, "46");
                   if (obj4 != patchProxyRe) {
                      i3 = obj4.intValue();
                   }else if(b.t4()){
                      i3 = b.N(R.id.bottom_bar, a1.e(8.00f));
                   }else {
                      i3 = b.N(i, a1.e(8.00f));
                   }
                   break;
                 case 21:
                   i3 = b.N(R.id.live_bottom_bubble_container, a1.e(8.00f));
                   break;
                 case 22:
                   i3 = b.y1();
                   break;
                 case 23:
                 case 24:
                   i3 = b.C1();
                   break;
                 case 25:
                   i3 = b.N(R.id.live_chat_apply_button, a1.e(8.00f));
                   break;
                 case 26:
                   i3 = b.N(liveSceneTyp, a1.e(8.00f));
                   break;
                 default:
                label_0196 :
                   i3 = a1.e(63.00f);
             }
             if (i3 >= b.e.getHeight() || (i3 <= 0 && !b.t4())) {
                i3 = a1.e(63.00f);
             }
             HashMap hashMap = new HashMap();
             hashMap.put(str, obj.name());
             hashMap.put("bottomPosition", Integer.valueOf(i3));
             c[] uocArray = new c[]{LivePendantLogTag.LIVE_PENDANT,LivePendantLogTag.LIVE_RIGHT_BOTTOM_PENDANT};
             i4 = 1;
             b.X(Arrays.asList(uocArray), "adjustBottomPosition", hashMap);
             i2 = i3;
          }
          b.j = (b.e.getHeight() - i2) - i1;
          i b1 = b.b;
          if (b1 != null && b1.u5() == LiveSceneType.Anchor) {
             b1 = b.c;
             if (b1 != null && (b1.d() && b.q.b() == LivePendantContainerScene.PK)) {
                b.j = Math.max(b.j, a1.d(0x7f070292));
                i1 = (b.e.getHeight() - i2) - b.j;
             }
          }
       label_029e :
          ViewGroup$MarginLayoutParams layoutParams = b.f.getLayoutParams();
          layoutParams.topMargin = i1;
          View obj2 = PatchProxy.apply(objArray, b, oi, "38");
          if (obj2 != patchProxyRe) {
             i1 = obj2.intValue();
          }else if(b.t4()){
             obj2 = m1.f(b.e, R.id.bottom_bar);
             if (obj2 != null && !obj2.getVisibility()) {
                i1 = obj2.getHeight() + a1.e(8.00f);
             }
          }
          i1 = 0;
          i2 = i2 - i1;
          if (i2 < 0) {
             i2 = 0;
          }
          layoutParams.bottomMargin = i2;
          Object obj3 = PatchProxy.apply(objArray, b, oi, "39");
          if (obj3 != patchProxyRe) {
             b2 = obj3.booleanValue();
          }else if(b.q.b() != LivePendantContainerScene.GZONE_NEW_TAB_STYLE_SCREEN_LANDSCAPE && (b.q.b() == LivePendantContainerScene.GZONE_BANNER || b.q.b() == LivePendantContainerScene.MULTI_TAB_STYLE)){
             obj1 = 0;
          }
       label_030b :
          b2 = obj1;
          if (b2) {
             b.i.getTopContainerLayoutParams().addRule(2, R.id.live_right_bottom_pendant_container);
             b.f.setGravity(80);
          }else {
             b.i.getTopContainerLayoutParams().removeRule(2);
             b.f.setGravity(48);
          }
          b.f.setLayoutParams(layoutParams);
       }
       b.Rk(c);
       return;
    }
}
