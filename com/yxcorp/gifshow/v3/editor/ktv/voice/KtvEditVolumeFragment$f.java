package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$f;
import com.kwai.plugin.dva.work.c$c;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.Throwable;
import w46.b;
import sj7.d;
import java.util.List;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import q87.c;
import com.yxcorp.gifshow.util.PostUtils;

public class KtvEditVolumeFragment$f implements c$c	// class@000ffa
{
    public final KtvEditVolumeFragment a;

    public void KtvEditVolumeFragment$f(KtvEditVolumeFragment p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvEditVolumeFragment$f.class, "2")) {
          return;
       }
       a.D().e("KtvEditVolumeFragment", "load denoise model failed", p0);
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvEditVolumeFragment$f.class, "1")) {
       }else {
          try{
             EditorSdk2Utils.loadAudioProcessorPlugin();
             p0.s = true;
             Object[] objArray = new Object[0];
             a.D().w("KtvEditVolumeFragment", "load denoise model success", objArray);
          }catch(java.lang.Exception e4){
             PostUtils.D("KtvEditVolumeFragment", "ktv TaskListener onSucceed  ", e4);
             a.D().e("KtvEditVolumeFragment", "load AudioProcessorPlugin failed", e4);
          }
       }
    }
}
