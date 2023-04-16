package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$b;
import ok.h;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import y3c.i;
import com.gifshow.tuna.player.poi.e;
import erd.g;

public class CollectionMusicFragment$b implements h	// class@0013f4
{
    public final CollectionMusicFragment b;

    public void CollectionMusicFragment$b(CollectionMusicFragment p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, CollectionMusicFragment$b.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b.J.j().subscribe(new i(this), e.b);
       }
       return p0;
    }
}
