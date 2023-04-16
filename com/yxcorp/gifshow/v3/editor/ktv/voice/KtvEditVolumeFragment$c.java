package com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.editor.ktv.voice.KtvEditVolumeFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import com.yxcorp.gifshow.v3.previewer.ktv.p;

public class KtvEditVolumeFragment$c implements Runnable	// class@000ff7
{
    public final KtvEditVolumeFragment b;

    public void KtvEditVolumeFragment$c(KtvEditVolumeFragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KtvEditVolumeFragment$c.class, "1")) {
          return;
       }
       KtvEditVolumeFragment$c tb = this.b;
       tb.y.removeCallbacks(tb.z);
       p.r(this.b.t.e(), this.b.v);
       p.q(this.b.t);
       return;
    }
}
