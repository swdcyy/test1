package com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutPostPreviewFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutPostPreviewFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import kotlin.jvm.internal.a;
import u79.o;
import u79.a;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$a;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import com.yxcorp.gifshow.player.KsAudioPlayer;

public final class AICutPostPreviewFragment$a implements ViewPager$i	// class@001ae3
{
    public final AICutPostPreviewFragment b;

    public void AICutPostPreviewFragment$a(AICutPostPreviewFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       AICutPostPreviewFragment$a uoa = AICutPostPreviewFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       BaseTemplatePreviewFragment w = this.b.w;
       a.o(w, "mAdapter");
       o oo = w.C();
       if (!oo instanceof c$b) {
          oo = null;
       }
       if (oo != null) {
          oo.E(null);
       }
       this.b.w.I(p0);
       this.b.qh();
       AICutPostPreviewFragment h = this.b.H;
       if (h != null && h.k() == true) {
          h = this.b.H;
          if (h != null) {
             h.l();
          }
          h = this.b.H;
          if (h != null) {
             h.p();
          }
       }
    label_005a :
       this.b.oh();
       return;
    }
}
