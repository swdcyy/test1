package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$f;

public final class SerialEpisodePanelFragment$f implements Runnable	// class@0019f1
{
    public final SerialEpisodePanelFragment b;

    public void SerialEpisodePanelFragment$f(SerialEpisodePanelFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, SerialEpisodePanelFragment$f.class, "1")) {
          return;
       }
       if (this.b.ci() != null) {
          TabLayout$f uof = this.b.ci().v(((this.b.z1 - 1) / 30));
          if (uof != null) {
             uof.h();
          }
       }
       this.b.Qh();
       return;
    }
}
