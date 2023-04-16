package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$e;
import y3c.z;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import npb.c;

public class CollectionMusicFragment$e extends z	// class@0013f8
{
    public final CollectionMusicFragment i;

    public void CollectionMusicFragment$e(CollectionMusicFragment p0){
       this.i = p0;
       super();
    }
    public List a(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, CollectionMusicFragment$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (q.f(p0)) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Music music = iterator.next();
          if (music != null && !music.isOffline()) {
             obj.add(new c(music));
          }
       }
       return obj;
    }
}
