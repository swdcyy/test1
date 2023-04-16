package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$d;
import tvc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import java.lang.Object;
import urc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class MusicFragmentCreator$d extends g	// class@001050
{
    public final MusicFragmentCreator c;

    public void MusicFragmentCreator$d(MusicFragmentCreator p0){
       this.c = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator$d.class, "1")) {
       }else {
          a.p(p0, "newState");
          e uoe = this.a();
          if (uoe == null) {
             MusicFragmentCreator f = this.c.f;
             uoe = (f != null)? f.u0(): null;
          }
       label_0029 :
          if (uoe != null) {
             this.c.Mb(p0, uoe);
          }
       }
       return;
    }
}
