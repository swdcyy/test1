package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener;
import android.widget.SeekBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b implements Runnable	// class@000b65
{
    public final TTSVolumeViewBinder$AutoFilterSeekBarChangeListener b;
    public final SeekBar c;

    public void TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener p0,SeekBar p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b.class, "1")) {
          return;
       }
       TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b tc = this.c;
       this.b.e(tc, tc.getProgress(), true);
       return;
    }
}
