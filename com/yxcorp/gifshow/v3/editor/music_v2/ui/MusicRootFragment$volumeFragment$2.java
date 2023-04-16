package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$volumeFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import kotlin.jvm.internal.a;

public final class MusicRootFragment$volumeFragment$2 extends Lambda implements a	// class@0010cf
{
    public final MusicRootFragment this$0;

    public void MusicRootFragment$volumeFragment$2(MusicRootFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final MusicVolumeFragmentV2 invoke(){
       MusicVolumeFragmentV2 obj = PatchProxy.apply(null, this, MusicRootFragment$volumeFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MusicVolumeFragmentV2();
       BaseEditorFragment t = this.this$0.t;
       a.o(t, "mEditorDelegate");
       if (!PatchProxy.applyVoidOneRefs(t, obj, MusicVolumeFragmentV2.class, "2")) {
          a.p(t, "<set-?>");
          obj.p = t;
       }
       MusicRootFragment$volumeFragment$2 tthis$0 = this.this$0;
       if (!PatchProxy.applyVoidOneRefs(tthis$0, obj, MusicVolumeFragmentV2.class, "4")) {
          a.p(tthis$0, "<set-?>");
          obj.q = tthis$0;
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
