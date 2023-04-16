package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$f;
import tvc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import java.lang.Object;
import urc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import voc.n;
import tvc.e;

public final class MusicEditor$f extends g	// class@001047
{
    public final MusicEditor c;

    public void MusicEditor$f(MusicEditor p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicEditor$f.class, "1")) {
       }else {
          a.p(p0, "newState");
          e uoe = this.a();
          if (uoe == null) {
             uoe = this.c.T().u0();
          }
          this.c.Mb(p0, uoe);
       }
       return;
    }
}
