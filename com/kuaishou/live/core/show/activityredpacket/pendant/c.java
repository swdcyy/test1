package com.kuaishou.live.core.show.activityredpacket.pendant.c;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.pendant.c$a;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;
import s22.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.os.CountDownTimer;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShowPage;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.core.show.activityredpacket.pendant.c$b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tw1.f;
import java.lang.Math;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import ekd.q;
import com.kuaishou.live.core.show.activityredpacket.pendant.a;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kuaishou.live.core.show.activityredpacket.pendant.b;
import a2.i0;

public class c	// class@000972
{
    public final LiveActivityRedPacketPendantView a;
    public final String b;
    public CountDownTimer c;
    public long d;
    public boolean e;
    public LiveTreasureBoxMessage$LiveTreasureBoxShowPage f;
    public LiveTreasureBoxMessage$LiveTreasureBoxShowPage g;
    public c$c h;
    public final LiveActivityRedPacketPendantView$b i;

    public void c(Context p0,String p1,int p2,boolean p3){
       super();
       c$a uoa = new c$a(this);
       this.i = uoa;
       this.e = p3;
       this.b = p1;
       LiveActivityRedPacketPendantView liveActivity = new LiveActivityRedPacketPendantView(p0, p2);
       this.a = liveActivity;
       liveActivity.setSupportDisplayTextColorFromServer((p3 ^ 0x01));
       liveActivity.setOnClickListener(new a(this));
       liveActivity.a(uoa);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.a.c(this.i);
       this.d();
       this.d = 0;
       this.f = null;
       this.g = null;
       return;
    }
    public View b(){
       return this.a;
    }
    public String c(){
       return this.b;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       c tc = this.c;
       if (tc == null) {
          return;
       }
       tc.cancel();
       this.c = null;
       return;
    }
    public void e(LiveTreasureBoxMessage$LiveTreasureBoxShowPage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       this.d();
       c ta = this.a;
       LiveTreasureBoxMessage$LiveTreasureBoxShowPage bgPictV2 = (this.e != null)? p0.bgPictV2: p0.bgPict;
       ta.b(e0.i(bgPictV2), e0.i(p0.iconPict), a1.f(R.drawable.arg_RES_7f081441), p0.capsuleColor, p0.fontColor, null);
       this.a.h(p0.contentText, a1.d(R.dimen.arg_RES_7f070981));
       return;
    }
    public void f(){
       long l;
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, this, uoc, "5")) {
          return;
       }
       this.d();
       c td = this.d;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(td), this, uoc, "8");
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          label_0039 :
             c$b uob = new c$b(this, l, 100);
             this.c = v1;
             v1.start();
             return;
          }
       }
       l = Math.max((td - f.a()), 0);
       goto label_0039 ;
    }
    public void g(String p0,LiveTreasureBoxMessage$LiveTreasureBoxShowPage[] p1,long p2){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, c.class, "1")) {
          return;
       }
       if (!TextUtils.equals(p0, this.b)) {
          b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "updatePendantFailed invalid redPacketId");
          return;
       }else if(p1 == null || p1.length <= 0){
          b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "updatePendantFailed invalid treasureBoxShowPageInfo");
          return;
       }else if(PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p1, Long.valueOf(p2), this, uoc, "3")){
          List list = q.a(p1);
          this.f = y.y(list, a.b).orNull();
          LiveTreasureBoxMessage$LiveTreasureBoxShowPage liveTreasure = y.y(list, b.b).orNull();
          this.g = liveTreasure;
          c tf = this.f;
          if (tf != null) {
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(tf, Long.valueOf(p2), this, uoc, "4")) {
                uoc = this.a;
                liveTreasure = (this.e != null)? tf.bgPictV2: tf.bgPict;
                uoc.b(e0.i(liveTreasure), e0.i(tf.iconPict), a1.f(R.drawable.arg_RES_7f081149), tf.capsuleColor, tf.fontColor, tf.iconBorderColor);
                if (p2 - this.d || this.c == null) {
                   this.d = p2;
                   if (i0.X(this.a)) {
                      this.f();
                   }
                }
             }
          label_00b8 :
             b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "updatePendantSucceed countDownState");
          }else if(liveTreasure != null){
             this.e(liveTreasure);
             b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "updatePendantSucceed openingState");
          }else {
             b.Z(LiveLogTag.LIVE_ACTIVITY_RED_PACKET, "updatePendantFailed noValidPage");
          }
       }
       return;
    }
}
