package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$a;
import com.yxcorp.gifshow.music.utils.f$a;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.CollectMusicResultAction;
import java.lang.Throwable;
import nsd.u;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import jn9.b;
import src.d;
import mn9.a;

public final class MusicFragmentCreator$a implements f$a	// class@00104b
{
    public final MusicFragmentCreator a;

    public void MusicFragmentCreator$a(MusicFragmentCreator p0){
       this.a = p0;
       super();
    }
    public void a(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator$a.class, "2")) {
          return;
       }
       a.p(p0, "music");
       MusicFragmentCreator f = this.a.f;
       if (f != null) {
          CollectMusicResultAction uCollectMusi = new CollectMusicResultAction(p0, false, null, 4, null);
          f.t0(v7);
       }
       p0 = p0.mId;
       a.o(p0, "music.mId");
       this.a.d().A(p0);
       return;
    }
    public void b(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator$a.class, "1")) {
          return;
       }
       a.p(p0, "music");
       MusicFragmentCreator f = this.a.f;
       if (f != null) {
          CollectMusicResultAction uCollectMusi = new CollectMusicResultAction(p0, true, null, 4, null);
          f.t0(v7);
       }
       this.a.d().s(new d(p0), 0);
       return;
    }
}
