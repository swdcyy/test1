package com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment$a;
import s2b.a;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import kob.n;
import k2b.e0;
import jqb.k;
import com.kuaishou.android.model.music.Music;

public class LocalMusicFragment$a implements a	// class@002024
{
    public final LocalMusicFragment a;

    public void LocalMusicFragment$a(LocalMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalMusicFragment$a.class, "1")) {
          return;
       }
       LocalMusicFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LocalMusicFragment.class, "7")) {
          k.q(p0, String.valueOf(ta.H), ta.J, ta.L.f(), 1, ta);
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.mShowed != null) {
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
