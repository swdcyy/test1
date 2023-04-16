package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.os.Handler;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.SeekBar;
import java.lang.Integer;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import java.lang.Long;
import android.os.Message;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b;

public class TTSVolumeViewBinder$AutoFilterSeekBarChangeListener implements SeekBar$OnSeekBarChangeListener	// class@000b67
{
    public final p b;
    public int c;
    public int d;

    public void TTSVolumeViewBinder$AutoFilterSeekBarChangeListener(){
       super();
       this.b = s.c(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2.INSTANCE);
       this.c = -1;
       this.d = -1;
    }
    public final Handler a(){
       Object obj = PatchProxy.apply(null, this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public void c(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "7")) {
          return;
       }
       a.p(p0, "seekBar");
       return;
    }
    public final void d(SeekBar p0,Runnable p1,long p2){
       if (PatchProxy.isSupport(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "5")) {
          return;
       }
       this.a().removeCallbacksAndMessages(p0);
       Message message = Message.obtain(this.a(), p1);
       message.obj = p0;
       this.a().sendMessageDelayed(message, p2);
       return;
    }
    public final void e(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("TTSVolumeViewBinder", "tryToHandleProgressChange\(\) called with: lastProgress = ["+this.c+"], seekBar = ["+p0.getProgress()+"], progress = ["+p1+']', objArray);
       if (this.c != p1) {
          this.c = p1;
          this.c(p0, p1, p2);
       }
       return;
    }
    public final void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "2")) {
          return;
       }
       a.p(p0, "seekBar");
       Object[] objArray = new Object[0];
       a.D().s("TTSVolumeViewBinder", "onProgressChanged\(\) called with: seekBar = ["+p0.getProgress()+"], progress = ["+p1+"], fromUser = ["+p2+']', objArray);
       if (p2) {
          this.d(p0, new TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$a(this, p0, p1), 200);
       }else {
          this.c = p1;
       }
       return;
    }
    public final void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "3")) {
          return;
       }
       a.p(p0, "seekBar");
       Object[] objArray = new Object[0];
       a.D().s("TTSVolumeViewBinder", "onStartTrackingTouch\(\) called with: seekBar = ["+p0.getProgress()+']', objArray);
       this.d = p0.getProgress();
       return;
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TTSVolumeViewBinder$AutoFilterSeekBarChangeListener.class, "4")) {
          return;
       }
       a.p(p0, "seekBar");
       Object[] objArray = new Object[0];
       a.D().s("TTSVolumeViewBinder", "onStopTrackingTouch\(\) called with: seekBar = ["+p0.getProgress()+']', objArray);
       this.d(p0, new TTSVolumeViewBinder$AutoFilterSeekBarChangeListener$b(this, p0), 0);
       return;
    }
}
