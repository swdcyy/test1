package com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener;
import android.widget.SeekBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class VolumeViewBinder$AutoFilterSeekBarChangeListener$a implements Runnable	// class@0010ef
{
    public final VolumeViewBinder$AutoFilterSeekBarChangeListener b;
    public final SeekBar c;
    public final int d;

    public void VolumeViewBinder$AutoFilterSeekBarChangeListener$a(VolumeViewBinder$AutoFilterSeekBarChangeListener p0,SeekBar p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VolumeViewBinder$AutoFilterSeekBarChangeListener$a.class, "1")) {
          return;
       }
       this.b.e(this.c, this.d, false);
       return;
    }
}
