package com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment$a;
import com.yxcorp.gifshow.profile.collect.network.c;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.collect.fragment.k;
import erd.g;

public class CollectionSerialFragment$a extends c	// class@0012a7
{
    public final CollectionSerialFragment q;
    public static final int r;

    public void CollectionSerialFragment$a(CollectionSerialFragment p0,String p1){
       this.q = p0;
       super(p1);
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, CollectionSerialFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.I1().doOnNext(k.b);
    }
}
