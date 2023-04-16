package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.i;
import th2.d;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainTopLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView;
import android.widget.TextView;
import ph2.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import ekd.j;
import th2.o;
import com.yxcorp.gifshow.model.CDNUrl;
import ub.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import th2.p;
import d61.c0;
import android.net.Uri;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import th2.k;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainText;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.h;
import com.kuaishou.live.core.show.redpacket.redpackrain2.widget.LiveRedPackRainSnatchView$b;
import tw1.f;
import com.kwai.robust.PatchProxyResult;
import uh2.e;
import java.lang.Boolean;
import java.util.HashMap;
import java.lang.reflect.Type;
import java.util.Map;
import pm8.a;
import android.text.TextUtils;

public class i extends d	// class@000f2c
{
    public View c;
    public LiveRedPackRainTopLayout d;
    public View e;
    public KwaiImageView f;
    public KwaiImageView g;
    public KwaiImageView h;
    public LiveRedPackRainSnatchView i;
    public TextView j;
    public c$b k;
    public b l;
    public ObjectAnimator m;

    public void i(ViewGroup p0,c$b p1){
       int i;
       boolean b;
       c0 a;
       super(p0);
       this.k = p1;
       View view = this.b();
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(view, this, oi, "1")) {
       }else if(view == null){
          this.c = m1.f(view, 0x7f0a24d6);
          this.d = m1.f(view, 0x7f0a24d7);
          this.e = m1.f(view, 0x7f0a24b2);
          this.f = m1.f(view, 0x7f0a24d5);
          this.g = m1.f(view, 0x7f0a24b1);
          this.h = m1.f(view, 0x7f0a24d8);
          this.i = m1.f(view, 0x7f0a24cf);
          this.j = m1.f(view, 0x7f0a24ce);
          a uoa = this.k.i();
          if (uoa != null) {
             uoa = uoa.m;
             if (!PatchProxy.applyVoidOneRefs(uoa, this, oi, "3")) {
                if (uoa == null) {
                   b.Z(LiveLogTag.LIVE_RED_PACK_RAIN, "LiveRedPackRainPrepareSnatchComponent updateResource: resource is null");
                }else if(!j.h(uoa.mGrabPopCoverTopImage) && !j.h(uoa.mGrabPopCoverBottomImage)){
                   this.f.a0(uoa.mGrabPopCoverTopImage, new o(this));
                   this.g.a0(uoa.mGrabPopCoverBottomImage, new p(this));
                }else {
                   a = c0.a;
                   this.f.setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_redbag_up.webp"));
                   this.g.setImageURI(a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_redbag_down.webp"));
                }
                if (!j.h(uoa.mGrabPrepareTitleImage)) {
                   this.h.U(uoa.mGrabPrepareTitleImage);
                }else {
                   this.h.setImageURI(c0.a.a("udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_logo.png"));
                }
                this.i.setResource(uoa);
                LiveLogTag lIVE_RED_PAC = LiveLogTag.LIVE_RED_PACK_RAIN;
                b.c0(lIVE_RED_PAC, "rulebutton", "mGrabPrepareRuleButton", uoa.mGrabPrepareRuleButton);
                LiveRedPackRainResource mGrabPrepare = uoa.mGrabPrepareRuleButton;
                if (mGrabPrepare != null) {
                   b.d0(lIVE_RED_PAC, "rulebutton", "ruleButton.mLink", mGrabPrepare.mLink, "ruleButton.mRedPackRainText", mGrabPrepare.mRedPackRainText);
                   this.j.setOnClickListener(new k(this, mGrabPrepare));
                   LiveRedPackRainResource$RedPackRainButton mRedPackRain = mGrabPrepare.mRedPackRainText;
                   if (mRedPackRain != null) {
                      this.j.setText(mRedPackRain.mText);
                      LiveRedPackRainResource$RedPackRainText mTextColor = mRedPackRain.mTextColor;
                      if (mTextColor != null) {
                         this.j.setTextColor(mTextColor);
                      }
                   }
                }
             }
             this.i.setOnSnatchViewListener(new h(this));
             this.i.c(false, this.k.i().b(), this.k.i().b);
             if ((this.k.i().b - f.a()) - 0x493e0 > 0) {
                i ti = this.i;
                i = 1;
                String[] stringArray = new String[i];
                stringArray[0] = this.k.i().a;
                Object obj = PatchProxy.applyOneRefs(stringArray, null, e.class, "6");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else if(j.h(stringArray)){
                   int i1 = 0;
                   while (i1 < i) {
                      object oobject = stringArray[i1];
                      Map obj1 = PatchProxy.applyOneRefs(oobject, null, e.class, "7");
                      if (obj1 != PatchProxyResult.class) {
                         b = obj1.booleanValue();
                      }else if(e.a == null){
                         obj1 = a.X(HashMap.class);
                         e.a = obj1;
                         if (obj1 == null) {
                            e.a = new HashMap();
                         }
                      }
                      b = TextUtils.isEmpty(e.a.get(oobject)) ^ i;
                      if (b) {
                         i1 = i1 + 1;
                      }
                   }
                }
                i = false;
                ti.f(i);
             }
          }
       }
       return;
    }
    public int a(){
       return 0x7f0d0d8a;
    }
}
