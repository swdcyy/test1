package com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public class CollectionPostFragment$c extends GridLayoutManager$b	// class@0012a4
{
    public final int e;
    public final CollectionPostFragment f;

    public void CollectionPostFragment$c(CollectionPostFragment p0,int p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int f(int p0){
       CollectionPostFragment$c uoc = CollectionPostFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 < this.f.ia().b1() || p0 >= (this.f.ia().getItemCount() - this.f.ia().Z0())) {
          return this.e;
       }else {
          return 1;
       }
    }
}
