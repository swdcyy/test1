package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$b;
import kqb.d;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jn9.b;
import kotlin.jvm.internal.a;

public final class MusicFragmentCreator$b implements d	// class@00104c
{
    public final MusicFragmentCreator b;

    public void MusicFragmentCreator$b(MusicFragmentCreator p0){
       this.b = p0;
       super();
    }
    public void Y6(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator$b.class, "1")) {
          return;
       }
       if (this.b.a()) {
          this.b.k(p0);
       }
       return;
    }
    public void Z5(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator$b.class, "3")) {
          return;
       }
       if (this.b.a()) {
          this.b.k(p0);
       }
       return;
    }
    public void v3(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator$b.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0 = p0.mId;
          a.o(p0, "it.mId");
          this.b.e().A(p0);
       }
       return;
    }
}
