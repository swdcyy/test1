package com.yxcorp.gifshow.profile.music.CollectionMusicFragment$c;
import j2c.j;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import k2b.e0;
import java.util.List;
import l2c.b;

public class CollectionMusicFragment$c extends j	// class@0013f5
{
    public final CollectionMusicFragment z;

    public void CollectionMusicFragment$c(CollectionMusicFragment p0,RecyclerFragment p1,r0 p2){
       this.z = p0;
       super(p1, p2);
    }
    public CharSequence B(){
       Object obj = PatchProxy.apply(null, this, CollectionMusicFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f10394f);
    }
    public CharSequence C(){
       Object obj = PatchProxy.apply(null, this, CollectionMusicFragment$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f100753);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment$c.class, "1")) {
          return;
       }
       super.i();
       Fragment uFragment = this.z.Hh();
       if (uFragment instanceof e0) {
       }else {
          uFragment = null;
       }
       b.b(null, uFragment);
       return;
    }
    public int z(){
       return 0x7f0822c1;
    }
}
