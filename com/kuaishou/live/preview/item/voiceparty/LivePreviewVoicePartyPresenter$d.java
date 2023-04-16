package com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter$d;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.preview.item.voiceparty.LivePreviewVoicePartyPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import pl3.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.preview.log.LivePreviewLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Float;
import java.lang.Math;
import java.lang.StringBuilder;

public final class LivePreviewVoicePartyPresenter$d extends ViewPager$l	// class@000e5c
{
    public final LivePreviewVoicePartyPresenter b;

    public void LivePreviewVoicePartyPresenter$d(LivePreviewVoicePartyPresenter p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       LivePreviewVoicePartyPresenter$d uod = LivePreviewVoicePartyPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       if (!p0) {
          LivePreviewVoicePartyPresenter$d tb = this.b;
          tb.I = 0;
          if (!a.a.a(LivePreviewVoicePartyPresenter.S8(tb)) && this.b.F != null) {
             b.Z(LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY, "onPageScrollStateChanged destroy logic");
             this.b.W8();
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(LivePreviewVoicePartyPresenter$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, LivePreviewVoicePartyPresenter$d.class, "1")) {
          return;
       }
       LivePreviewVoicePartyPresenter$d tb = this.b;
       if (tb.F != null) {
          return;
       }
       LivePreviewVoicePartyPresenter i = tb.I;
       if ((double)i <= 0) {
          tb.I = p1;
          return;
       }else {
          p1 = p1 - i;
          boolean b = false;
          tb = (Math.abs(p1) - 0x3d4ccccd > 0)? 1: 0;
          if (tb) {
             if (p1 - null > 0) {
                b = true;
             }
             String str = "onPageScrolled preLoad ";
             if (b && this.b.H == (p0 + 1)) {
                b.Z(LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY, str+b);
                this.b.V8();
             }else if(!b && this.b.H == p0){
                b.Z(LivePreviewLogTag.LIVE_PREVIEW_VOICE_PARTY, str+b);
                this.b.V8();
             }
          }
       label_0093 :
          return;
       }
    }
}
