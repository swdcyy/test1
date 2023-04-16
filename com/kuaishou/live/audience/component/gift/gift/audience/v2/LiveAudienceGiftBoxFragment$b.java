package com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment$b;
import oh1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.LiveAudienceGiftBoxFragment;
import java.lang.Object;
import lj1.b;
import oh1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.framework.abtest.f;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ow0.a;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ez0.k;
import java.lang.Runnable;
import ekd.k1;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class LiveAudienceGiftBoxFragment$b implements c	// class@000af7
{
    public final LiveAudienceGiftBoxFragment a;

    public void LiveAudienceGiftBoxFragment$b(LiveAudienceGiftBoxFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(b p0){
       b.d(this, p0);
    }
    public void c(){
       b.b(this);
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceGiftBoxFragment$b.class, "1")) {
          return;
       }
       LiveAudienceGiftBoxFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, LiveAudienceGiftBoxFragment.class, "2") && ta.ch()) {
          if (!f.a("disableComboSendAutoDismissPanel")) {
             b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [showCloseGiftBoxGuide]: Experiment is false ");
          }else {
             SharedPreferences a = a.a;
             int intx = a.getInt("ShowCloseGiftBoxGuideCount", 0);
             if (intx >= 1) {
                b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [showCloseGiftBoxGuide]: isFirstShowCloseGiftBoxGuide is false ");
             }else {
                ta.D = ta.w.findViewById(0x7f0a0793);
                KwaiImageView kwaiImageVie = ta.w.findViewById(R.id.close_gift_box_guide);
                ta.C = kwaiImageVie;
                kwaiImageVie.M("https://p4-live.a.yximgs.com/udata/pkg/kwai-client-image/pengtianao_online/live_close_giftbox_guide.png", objArray);
                ta.D.setVisibility(0);
                k1.r(new k(ta), 3000);
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putInt("ShowCloseGiftBoxGuideCount", (intx + 1));
                g.a(uEditor);
                b.Z(LiveLogTag.GIFT, "[LiveAudienceGiftBoxFragment] [showCloseGiftBoxGuide]: isFirstShowCloseGiftBoxGuide is true ");
             }
          }
       }
       return;
    }
    public void e(int p0,b p1){
       b.a(this, p0, p1);
    }
    public void f(int p0,b p1){
       b.c(this, p0, p1);
    }
    public void g(){
       b.e(this);
    }
}
