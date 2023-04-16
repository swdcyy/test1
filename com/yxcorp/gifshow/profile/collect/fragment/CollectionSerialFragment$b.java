package com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment$b;
import j2c.j;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import lkd.b;
import lnc.a1;

public class CollectionSerialFragment$b extends j	// class@0012a8
{
    public final CollectionSerialFragment z;

    public void CollectionSerialFragment$b(CollectionSerialFragment p0,RecyclerFragment p1,r0 p2){
       this.z = p0;
       super(p1, p2);
    }
    public CharSequence B(){
       Object obj = PatchProxy.apply(null, this, CollectionSerialFragment$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f10394f);
    }
    public CharSequence C(){
       Object obj = PatchProxy.apply(null, this, CollectionSerialFragment$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getString(0x7f100753);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, CollectionSerialFragment$b.class, "1")) {
          return;
       }
       super.i();
       this.D(null);
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, CollectionSerialFragment$b.class, "4")) {
          return;
       }
       this.E(a1.e(16.00f));
       super.p();
       return;
    }
    public int z(){
       return 0x7f0822c1;
    }
}
