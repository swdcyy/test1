package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2$a;
import tvc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2;
import java.lang.Object;
import urc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import msc.q;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import vrc.d;

public final class MusicVolumeFragmentV2$a extends g	// class@00111a
{
    public final MusicVolumeFragmentV2 c;

    public void MusicVolumeFragmentV2$a(MusicVolumeFragmentV2 p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicVolumeFragmentV2$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          e uoe = this.a();
          if (uoe == null) {
             uoe = this.c.eh().u0();
          }
          Iterator iterator = this.c.r.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof d) {
                uoa.Mb(p0, uoe);
             }
          }
       }
       return;
    }
}
