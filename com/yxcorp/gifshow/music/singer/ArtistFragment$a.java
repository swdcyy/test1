package com.yxcorp.gifshow.music.singer.ArtistFragment$a;
import s2b.a;
import com.yxcorp.gifshow.music.singer.ArtistFragment;
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

public class ArtistFragment$a implements a	// class@002077
{
    public final ArtistFragment a;

    public void ArtistFragment$a(ArtistFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArtistFragment$a.class, "1")) {
          return;
       }
       ArtistFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, ArtistFragment.class, "6")) {
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
