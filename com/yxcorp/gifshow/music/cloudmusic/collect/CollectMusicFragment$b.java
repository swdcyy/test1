package com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment$b;
import s2b.a;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment;
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

public class CollectMusicFragment$b implements a	// class@001ff7
{
    public final CollectMusicFragment a;

    public void CollectMusicFragment$b(CollectMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectMusicFragment$b.class, "1")) {
          return;
       }
       CollectMusicFragment$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, CollectMusicFragment.class, "9")) {
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
