package com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2;
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
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener$a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder$AutoFilterSeekBarChangeListener$b;

public class VolumeViewBinder$AutoFilterSeekBarChangeListener implements SeekBar$OnSeekBarChangeListener	// class@0010f2
{
    public final String b;
    public final p c;
    public int d;
    public int e;

    public void VolumeViewBinder$AutoFilterSeekBarChangeListener(){
       super();
       this.b = "VolumeViewBinder";
       this.c = s.c(VolumeViewBinder$AutoFilterSeekBarChangeListener$handler$2.INSTANCE);
       this.d = -1;
       this.e = -1;
    }
    public final Handler a(){
       Object obj = PatchProxy.apply(null, this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void c(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(VolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "7")) {
          return;
       }
       a.p(p0, "seekBar");
       return;
    }
    public final void d(SeekBar p0,Runnable p1,long p2){
       if (PatchProxy.isSupport(VolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "5")) {
          return;
       }
       this.a().removeCallbacksAndMessages(p0);
       Message message = Message.obtain(this.a(), p1);
       message.obj = p0;
       this.a().sendMessageDelayed(message, p2);
       return;
    }
    public final void e(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(VolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "6")) {
          return;
       }
       Log.b(this.b, "tryToHandleProgressChange\(\) called with: lastProgress = ["+this.d+"], seekBar = ["+p0.getProgress()+"], progress = ["+p1+']');
       if (this.d != p1) {
          this.d = p1;
          this.c(p0, p1, p2);
       }
       return;
    }
    public final void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(VolumeViewBinder$AutoFilterSeekBarChangeListener.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "2")) {
          return;
       }
       a.p(p0, "seekBar");
       Log.b(this.b, "onProgressChanged\(\) called with: seekBar = ["+p0.getProgress()+"], progress = ["+p1+"], fromUser = ["+p2+']');
       if (p2) {
          this.d(p0, new VolumeViewBinder$AutoFilterSeekBarChangeListener$a(this, p0, p1), 200);
       }else {
          this.d = p1;
       }
       return;
    }
    public final void onStartTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "3")) {
          return;
       }
       a.p(p0, "seekBar");
       Log.b(this.b, "onStartTrackingTouch\(\) called with: seekBar = ["+p0.getProgress()+']');
       this.e = p0.getProgress();
       return;
    }
    public final void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VolumeViewBinder$AutoFilterSeekBarChangeListener.class, "4")) {
          return;
       }
       a.p(p0, "seekBar");
       Log.b(this.b, "onStopTrackingTouch\(\) called with: seekBar = ["+p0.getProgress()+']');
       this.d(p0, new VolumeViewBinder$AutoFilterSeekBarChangeListener$b(this, p0), 0);
       return;
    }
}
