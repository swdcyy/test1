package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$a;
import com.yxcorp.gifshow.music.utils.f$a;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.List;
import com.yxcorp.gifshow.music.utils.o;

public class CollectionMusicFragment$a implements f$a	// class@0013f3
{
    public final CollectionMusicFragment a;

    public void CollectionMusicFragment$a(CollectionMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment$a.class, "2")) {
          return;
       }
       i oi = this.a.q();
       int i = o.j(oi.getItems(), p0);
       if (i >= 0 && i < oi.getCount()) {
          this.a.S = true;
          oi.remove(oi.getItem(i));
       }
       return;
    }
    public void b(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment$a.class, "1")) {
          return;
       }
       this.a.S = true;
       this.a.q().add(0, p0);
       return;
    }
}
