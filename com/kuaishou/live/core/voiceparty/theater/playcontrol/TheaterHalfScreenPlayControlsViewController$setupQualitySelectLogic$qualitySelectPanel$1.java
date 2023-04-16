package com.kuaishou.live.core.voiceparty.theater.playcontrol.TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.widget.TextView;
import java.lang.Object;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public final class TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$1 extends Lambda implements l	// class@00199d
{
    public final TextView $button;

    public void TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$1(TextView p0){
       this.$button = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LiveQualityItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterHalfScreenPlayControlsViewController$setupQualitySelectLogic$qualitySelectPanel$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.$button.setVisibility(0);
          this.$button.setText(p0.getShortName());
       }else {
          this.$button.setVisibility(8);
       }
       return;
    }
}
