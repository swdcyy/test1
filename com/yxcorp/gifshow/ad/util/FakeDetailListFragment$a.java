package com.yxcorp.gifshow.ad.util.FakeDetailListFragment$a;
import qvb.a;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class FakeDetailListFragment$a extends a	// class@00186b
{
    public final List d;

    public void FakeDetailListFragment$a(List p0){
       a.p(p0, "list");
       super();
       this.d = p0;
       this.b.addAll(p0);
    }
    public void F(int p0,Object p1){
    }
    public Object L0(){
       Object obj = PatchProxy.apply(null, this, FakeDetailListFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Object();
    }
    public void a(){
    }
    public List d1(){
       a obj = PatchProxy.apply(null, this, FakeDetailListFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       a.o(obj, "mItems");
       return CollectionsKt___CollectionsKt.J5(obj);
    }
    public boolean hasMore(){
       return false;
    }
    public void invalidate(){
    }
    public void load(){
    }
}
