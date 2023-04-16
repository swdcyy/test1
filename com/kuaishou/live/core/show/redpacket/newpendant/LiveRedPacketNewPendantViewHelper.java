package com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper;
import ml8.d;
import vw1.b;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$Mode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import tw1.f;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.view.ViewPropertyAnimator;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.basic.widget.LiveTextView;
import java.lang.Enum;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$d;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketNewPendantViewHelper$c;
import com.kuaishou.live.core.show.redpacket.newpendant.b;

public class LiveRedPacketNewPendantViewHelper implements d, b	// class@000ee8
{
    public ImageView b;
    public KwaiImageView c;
    public LiveTextView d;
    public KwaiImageView e;
    public TextView f;
    public CountDownTimer g;
    public LiveRedPacketNewPendantViewHelper$Mode h;
    public LiveRedPacketNewPendantViewHelper$c i;
    public LiveRedPacketNewPendantViewHelper$d j;

    public void LiveRedPacketNewPendantViewHelper(){
       super();
       this.h = LiveRedPacketNewPendantViewHelper$Mode.CountDown;
    }
    public static long c(){
       Object obj = PatchProxy.apply(null, null, LiveRedPacketNewPendantViewHelper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return f.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketNewPendantViewHelper.class, "12")) {
          return;
       }
       LiveRedPacketNewPendantViewHelper tg = this.g;
       if (tg != null) {
          tg.cancel();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketNewPendantViewHelper.class, "14")) {
          return;
       }
       this.a();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketNewPendantViewHelper.class, "3")) {
          return;
       }
       this.f.setAlpha(0);
       this.f.setScaleX(0.20f);
       this.f.setScaleY(0.20f);
       this.f.animate().withLayer().alpha(0x3f800000).scaleX(0x3f800000).scaleY(0x3f800000).start();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketNewPendantViewHelper.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a24f3);
       this.c = m1.f(p0, 0x7f0a24e2);
       this.d = m1.f(p0, 0x7f0a250b);
       this.e = m1.f(p0, 0x7f0a24ea);
       this.f = m1.f(p0, 0x7f0a24e9);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketNewPendantViewHelper.class, "4")) {
          return;
       }
       int i = (this.h.ordinal() > LiveRedPacketNewPendantViewHelper$Mode.Opening.ordinal())? 8: 0;
       this.d.setVisibility(i);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveRedPacketNewPendantViewHelper.class, "5")) {
          return;
       }
       this.d.setVisibility(8);
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketNewPendantViewHelper.class, "2")) {
          return;
       }
       if (TextUtils.x(p0)) {
          this.f.setVisibility(4);
       }else {
          this.f.setVisibility(0);
          this.f.setText(p0);
       }
       return;
    }
    public void h(LiveRedPacketNewPendantViewHelper$Mode p0){
       LiveRedPacketNewPendantViewHelper tj;
       LiveRedPacketNewPendantViewHelper liveRedPacke = LiveRedPacketNewPendantViewHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveRedPacke, "10")) {
          return;
       }
       if (p0 != this.h) {
          tj = this.j;
          if (tj != null) {
             tj.a(p0);
          }
       }
       this.h = p0;
       LiveRedPacketNewPendantViewHelper$Mode countDown = LiveRedPacketNewPendantViewHelper$Mode.CountDown;
       if (p0 != countDown) {
          this.a();
       }
       if (p0 == countDown) {
          tj = this.i;
          if (!PatchProxy.applyVoidOneRefs(tj, this, liveRedPacke, "11")) {
             this.a();
             b uob = new b(this, ((tj.c() - LiveRedPacketNewPendantViewHelper.c()) + 1000), 1000);
             this.g = liveRedPacke;
             liveRedPacke.start();
          }
       }
       p0.bind(this, this.i);
       return;
    }
    public void i(LiveRedPacketNewPendantViewHelper$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRedPacketNewPendantViewHelper.class, "9")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.i = p0;
       this.h(p0.b());
       return;
    }
}
