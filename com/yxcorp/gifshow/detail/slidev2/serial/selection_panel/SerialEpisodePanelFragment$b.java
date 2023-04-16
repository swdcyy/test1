package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$b;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import androidx.fragment.app.Fragment;

public final class SerialEpisodePanelFragment$b implements Animator$AnimatorListener	// class@0019ed
{
    public final SerialEpisodePanelFragment a;

    public void SerialEpisodePanelFragment$b(SerialEpisodePanelFragment p0,SerialEpisodePanelFragment p1){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment$b.class, "3")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment$b.class, "2")) {
          return;
       }
       a.p(p0, "animator");
       View view = this.a.getView();
       if (view != null) {
          view.setTranslationY(0);
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment$b.class, "1")) {
          return;
       }
       a.p(p0, "animator");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialEpisodePanelFragment$b.class, "4")) {
          return;
       }
       a.p(p0, "animator");
       View view = this.a.getView();
       if (view != null) {
          view.setAlpha(0x3f800000);
       }
       return;
    }
}
