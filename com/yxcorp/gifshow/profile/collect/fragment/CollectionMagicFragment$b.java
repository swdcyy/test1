package com.yxcorp.gifshow.profile.collect.fragment.CollectionMagicFragment$b;
import j2c.j;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionMagicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public class CollectionMagicFragment$b extends j	// class@00129e
{
    public final CollectionMagicFragment z;

    public void CollectionMagicFragment$b(CollectionMagicFragment p0,RecyclerFragment p1,r0 p2){
       this.z = p0;
       super(p1, p2);
    }
    public CharSequence B(){
       Object obj = PatchProxy.apply(null, this, CollectionMagicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f10394f);
    }
    public CharSequence C(){
       Object obj = PatchProxy.apply(null, this, CollectionMagicFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f100753);
    }
    public int z(){
       return 0x7f0822c1;
    }
}
