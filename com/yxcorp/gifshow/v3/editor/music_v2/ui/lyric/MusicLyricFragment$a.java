package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment$a;
import tvc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment;
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

public final class MusicLyricFragment$a extends g	// class@0010d5
{
    public final MusicLyricFragment c;

    public void MusicLyricFragment$a(MusicLyricFragment p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicLyricFragment$a.class, "1")) {
       }else {
          a.p(p0, "newState");
          e uoe = this.a();
          if (uoe == null) {
             uoe = this.c.fh().u0();
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
