package com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener;
import android.widget.SeekBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class VolumeViewBinder$AutoFilterSeekBarChangeListener$b implements Runnable	// class@0010f0
{
    public final VolumeViewBinder$AutoFilterSeekBarChangeListener b;
    public final SeekBar c;

    public void VolumeViewBinder$AutoFilterSeekBarChangeListener$b(VolumeViewBinder$AutoFilterSeekBarChangeListener p0,SeekBar p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VolumeViewBinder$AutoFilterSeekBarChangeListener$b.class, "1")) {
          return;
       }
       VolumeViewBinder$AutoFilterSeekBarChangeListener$b tc = this.c;
       this.b.e(tc, tc.getProgress(), true);
       return;
    }
}
