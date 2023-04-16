package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2$musicViewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2;
import java.lang.Object;
import msc.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModel;

public final class MusicVolumeFragmentV2$musicViewModel$2 extends Lambda implements a	// class@00111b
{
    public final MusicVolumeFragmentV2 this$0;

    public void MusicVolumeFragmentV2$musicViewModel$2(MusicVolumeFragmentV2 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final q invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MusicVolumeFragmentV2$musicViewModel$2 obj = PatchProxy.apply(objArray, this, MusicVolumeFragmentV2$musicViewModel$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       MusicVolumeFragmentV2 musicVolumeF = PatchProxy.apply(objArray, obj, MusicVolumeFragmentV2.class, "1");
       if (musicVolumeF != patchProxyRe) {
       }else {
          musicVolumeF = obj.p;
          if (musicVolumeF == null) {
             a.S("editorDelegate");
          }
       }
       return musicVolumeF.s(q.class);
    }
}
