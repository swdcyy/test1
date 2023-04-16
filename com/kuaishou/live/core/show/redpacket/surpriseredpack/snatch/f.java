package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.f;
import ki2.a;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.a$a;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import d61.c0;
import android.net.Uri;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.core.show.redpacket.LiveRedPacketResourcePathConstant;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.model.LiveSurpriseRedPackGrabResult;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import d61.h;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.e;
import android.view.View$OnClickListener;
import java.lang.CharSequence;
import ki2.f;
import android.widget.ImageView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import d71.a;

public class f extends a	// class@000fb7
{
    public KwaiImageView c;
    public View d;
    public TextView e;
    public TextView f;
    public TextView g;
    public final a$a h;
    public Animatable i;
    public AnimatorSet j;
    public LottieAnimationView k;
    public boolean l;
    public View m;
    public View n;
    public final LiveSurpriseRedPackResultViewBinder o;

    public void f(ViewGroup p0,a$a p1){
       super(p0);
       LiveSurpriseRedPackResultViewBinder liveSurprise = new LiveSurpriseRedPackResultViewBinder();
       this.o = liveSurprise;
       this.h = p1;
       View view = this.b();
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(view, this, uof, "1")) {
       }else if(view == null){
          KwaiImageView kwaiImageVie = m1.f(view, R.id.live_surprise_red_pack_opened_img);
          c0 a = c0.a;
          kwaiImageVie.setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_result_lucky_snatch_btn.webp"));
          m1.f(view, R.id.live_surprise_red_pack_back_img).setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_result_back_red.webp"));
          m1.f(view, R.id.live_surprise_red_pack_bottom_img).setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_opened_bottom_bg.webp"));
          m1.f(view, R.id.live_surprise_red_pack_top_img).setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_result_top_back.webp"));
          this.c = m1.f(view, 0x7f0a2673);
          this.m = m1.f(view, 0x7f0a267c);
          this.n = m1.f(view, 0x7f0a267b);
          this.d = m1.f(view, 0x7f0a266a);
          this.e = m1.f(view, 0x7f0a267e);
          this.f = m1.f(view, 0x7f0a2675);
          this.g = m1.f(view, 0x7f0a2667);
          LottieAnimationView lottieAnimat = m1.f(view, R.id.live_surprise_red_pack_pack_animation);
          this.k = lottieAnimat;
          lottieAnimat.setAnimationFromUrl(a.b(LiveRedPacketResourcePathConstant.LIVE_RED_PACK_STAR.getResourcePath()));
          this.f = m1.f(view, 0x7f0a2675);
          this.g = m1.f(view, 0x7f0a2667);
          this.m.setAlpha(0);
          this.g.setAlpha(0);
          this.n.setAlpha(0);
          this.d.measure(0, 0);
          f td = this.d;
          td.setPivotX((float)(td.getMeasuredWidth() / 2));
          td = this.d;
          td.setPivotY((float)td.getMeasuredHeight());
          this.d.setScaleY(0x3f733333);
          this.m.setScaleX(0x3f666666);
          this.m.setScaleY(0x3f666666);
          LiveSurpriseRedPackGrabResult liveSurprise1 = p1.a();
          if (liveSurprise1 != null) {
             LiveSurpriseRedPackResultViewBinder$Mode mode = liveSurprise.d(liveSurprise1.mPrizeList);
             if (mode == LiveSurpriseRedPackResultViewBinder$Mode.UNLUCKY) {
                if (!PatchProxy.applyVoidOneRefs(view, this, uof, "4")) {
                   h.f(view, R.id.live_red_pack_rain_unlucky_layout_view_stub, 0x7f0a24d9);
                   this.e.setText(R.string.arg_RES_7f102672);
                   this.f.setText(R.string.arg_RES_7f10266d);
                   this.g.setVisibility(8);
                   this.f.setOnClickListener(new e(this));
                }
             }else if(PatchProxy.applyVoidOneRefs(liveSurprise1, this, uof, "3")){
                this.e.setText(liveSurprise1.mTitle);
                if (liveSurprise1.mLinkActionType == 3) {
                   boolean b = this.c();
                   this.l = b;
                   if (b) {
                      this.f.setText(liveSurprise1.mAckTips);
                   }else {
                      this.f.setText(R.string.arg_RES_7f102665);
                   }
                }else {
                   this.f.setText(liveSurprise1.mAckTips);
                }
                this.g.setText(liveSurprise1.mPrizeDesc);
             }
             mode.bind(view, liveSurprise1.mPrizeList);
             kwaiImageVie.setOnClickListener(new f(this, liveSurprise1));
          }
       }
       return;
    }
    public int a(){
       return 0x7f0d0e01;
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.h.e() == null) {
          return false;
       }
       if (this.h.e().a2 == null) {
          return false;
       }
       return this.h.e().a2.i();
    }
}
