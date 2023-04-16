package com.kuaishou.live.core.show.redpacket.krn.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import android.content.Context;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.krn.f$a;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;
import ch2.d;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.os.CountDownTimer;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPackShowPage;
import com.kuaishou.android.live.log.b;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.core.show.redpacket.krn.f$b;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tw1.f;
import java.lang.Math;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import ekd.q;
import com.kuaishou.live.core.show.redpacket.krn.d;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import com.kuaishou.live.core.show.redpacket.krn.e;
import a2.i0;

public class f	// class@000ed8
{
    public final LiveActivityRedPacketPendantView a;
    public final String b;
    public CountDownTimer c;
    public long d;
    public boolean e;
    public LiveKrnRedPackMessage$LiveKrnRedPackShowPage f;
    public LiveKrnRedPackMessage$LiveKrnRedPackShowPage g;
    public f$c h;
    public final LiveActivityRedPacketPendantView$b i;
    public static final List j;

    static {
       f.j = a.a(LiveLogTag.KRN_LEEE, "LiveKrnRedPacketPendant");
    }
    public void f(Context p0,String p1,int p2,boolean p3){
       super();
       f$a uoa = new f$a(this);
       this.i = uoa;
       this.e = p3;
       this.b = p1;
       LiveActivityRedPacketPendantView liveActivity = new LiveActivityRedPacketPendantView(p0, p2);
       this.a = liveActivity;
       liveActivity.setSupportDisplayTextColorFromServer((p3 ^ 0x01));
       liveActivity.setOnClickListener(new d(this, p1));
       liveActivity.a(uoa);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
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
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       f tc = this.c;
       if (tc == null) {
          return;
       }
       tc.cancel();
       this.c = null;
       return;
    }
    public void e(LiveKrnRedPackMessage$LiveKrnRedPackShowPage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "6")) {
          return;
       }
       b.S(f.j, "setOpeningMode...", "mRedPacketId", this.b);
       this.d();
       f ta = this.a;
       LiveKrnRedPackMessage$LiveKrnRedPackShowPage bgPictV2 = (this.e != null)? p0.bgPictV2: p0.bgPict;
       ta.b(e0.i(bgPictV2), e0.i(p0.iconPict), a1.f(R.drawable.arg_RES_7f081441), p0.capsuleColor, p0.fontColor, null);
       this.a.h(p0.contentText, a1.d(R.dimen.arg_RES_7f070981));
       return;
    }
    public void f(){
       long l;
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "5")) {
          return;
       }
       this.d();
       f td = this.d;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(td), this, uof, "8");
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          label_0039 :
             f$b uob = new f$b(this, l, 100);
             this.c = v1;
             b.S(f.j, "krn startCountDownTimer", "mRedPacketId", this.b);
             this.c.start();
             return;
          }
       }
       l = Math.max((td - f.a()), 0);
       goto label_0039 ;
    }
    public void g(String p0,LiveKrnRedPackMessage$LiveKrnRedPackShowPage[] p1,long p2){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, f.class, "1")) {
          return;
       }
       if (!TextUtils.equals(p0, this.b)) {
          b.P(f.j, "updatePendantFailed, invalid redPacketId, redPacketId = "+p0);
          return;
       }else if(p1 == null || p1.length <= 0){
          b.P(f.j, "updatePendantFailed, invalid LiveKrnRedPackShowPage, redPacketId = "+p0);
          return;
       }else {
          List j = f.j;
          b.P(j, "updatePendant, setViewMode, redPacketId = "+p0);
          if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(p1, Long.valueOf(p2), this, uof, "3")) {
             List list = q.a(p1);
             this.f = y.y(list, d.b).orNull();
             LiveKrnRedPackMessage$LiveKrnRedPackShowPage liveKrnRedPa = y.y(list, e.b).orNull();
             this.g = liveKrnRedPa;
             f tf = this.f;
             if (tf != null) {
                if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(tf, Long.valueOf(p2), this, uof, "4")) {
                   b.P(j, "setCountDownMode..., redPacketId = "+this.b);
                   f ta = this.a;
                   liveKrnRedPa = (this.e != null)? tf.bgPictV2: tf.bgPict;
                   ta.b(e0.i(liveKrnRedPa), e0.i(tf.iconPict), a1.f(R.drawable.arg_RES_7f081149), tf.capsuleColor, tf.fontColor, tf.iconBorderColor);
                   if (p2 - this.d || this.c == null) {
                      this.d = p2;
                      if (i0.X(this.a)) {
                         b.P(j, "setCountDownMode, startCountDownTimer, redPacketId = "+this.b);
                         this.f();
                      }
                   }
                }
             label_0109 :
                b.P(j, "updatePendantSucceed countDownState, redPacketId = "+this.b);
             }else if(liveKrnRedPa != null){
                this.e(liveKrnRedPa);
                b.P(j, "updatePendantSucceed openingState, redPacketId = "+this.b);
             }else {
                b.P(j, "updatePendantFailed noValidPage, redPacketId = "+this.b);
             }
          }
          return;
       }
    }
}
