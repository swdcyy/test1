package com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment$a;
import com.yxcorp.gifshow.music.utils.f$a;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Set;

public class CollectMusicFragment$a implements f$a	// class@001ff6
{
    public final CollectMusicFragment a;

    public void CollectMusicFragment$a(CollectMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectMusicFragment$a.class, "2")) {
          return;
       }
       if (this.a.c1()) {
          this.a.U.add(p0);
       }else {
          this.a.a();
       }
       return;
    }
    public void b(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectMusicFragment$a.class, "1")) {
          return;
       }
       if (this.a.c1()) {
          this.a.U.remove(p0);
       }else {
          this.a.a();
       }
       return;
    }
}
