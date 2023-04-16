package com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment$a;
import s2b.a;
import com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment;
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

public class HistoryMusicFragment$a implements a	// class@00201b
{
    public final HistoryMusicFragment a;

    public void HistoryMusicFragment$a(HistoryMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HistoryMusicFragment$a.class, "1")) {
          return;
       }
       HistoryMusicFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, HistoryMusicFragment.class, "8")) {
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
