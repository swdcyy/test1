package com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$b;
import com.yxcorp.gifshow.profile.collect.network.b;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.collect.fragment.f;
import erd.g;

public class CollectionPostFragment$b extends b	// class@0012a3
{
    public final CollectionPostFragment q;
    public static final int r;

    public void CollectionPostFragment$b(CollectionPostFragment p0,String p1){
       this.q = p0;
       super(p1);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.I1().doOnNext(f.b);
    }
}
