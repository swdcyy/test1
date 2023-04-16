package com.yxcorp.gifshow.profile.collect.fragment.CollectionPOIFragment$a;
import j2c.j;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPOIFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;

public class CollectionPOIFragment$a extends j	// class@0012a0
{
    public final CollectionPOIFragment z;

    public void CollectionPOIFragment$a(CollectionPOIFragment p0,RecyclerFragment p1,r0 p2){
       this.z = p0;
       super(p1, p2);
    }
    public CharSequence B(){
       Object obj = PatchProxy.apply(null, this, CollectionPOIFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f10394f);
    }
    public CharSequence C(){
       Object obj = PatchProxy.apply(null, this, CollectionPOIFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f100753);
    }
    public int z(){
       return 0x7f0822c1;
    }
}
