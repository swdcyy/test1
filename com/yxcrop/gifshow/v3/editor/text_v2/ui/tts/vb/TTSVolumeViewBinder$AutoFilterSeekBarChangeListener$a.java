package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$a;
import java.lang.Runnable;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener;
import android.widget.SeekBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$a implements Runnable	// class@000b64
{
    public final TTSVolumeViewBinder$AutoFilterSeekBarChangeListener b;
    public final SeekBar c;
    public final int d;

    public void TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$a(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener p0,SeekBar p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$a.class, "1")) {
          return;
       }
       this.b.e(this.c, this.d, false);
       return;
    }
}
