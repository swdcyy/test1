package com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.fragment.user.LocalAlbumGridGroupHeaderAdapter;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.List;
import m8c.e;
import ika.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import ika.o;
import com.yxcorp.gifshow.fragment.user.h;
import g9c.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Integer;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Number;
import ika.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1 extends Lambda implements l	// class@00127b
{
    public final List $headerCounts;
    public final Ref$IntRef $index;
    public final LocalAlbumGridGroupHeaderAdapter this$0;

    public void LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1(LocalAlbumGridGroupHeaderAdapter p0,Ref$IntRef p1,List p2){
       this.this$0 = p0;
       this.$index = p1;
       this.$headerCounts = p2;
       super(1);
    }
    public final a$b invoke(e p0){
       String obj = PatchProxy.applyOneRefs(p0, this, LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "it";
       try{
          a.p(p0, obj);
          LocalAlbumGridGroupHeaderAdapter$getPostTestKSelector$1 t$index = this.$index;
          Ref$IntRef element = t$index.element;
          t$index.element = element + 1;
          int i = element % this.this$0.M0().Q0().size();
          t$index = this.$headerCounts;
          ArrayList uArrayList = new ArrayList(u.Y(t$index, 10));
          Iterator iterator = t$index.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(Integer.valueOf(Integer.parseInt(iterator.next())));
          }
          int i1 = uArrayList.size() - 1;
          int i2 = 0;
          while (i2 < i1) {
             int i3 = i2 + 1;
             Iterator iterator1 = CollectionsKt___CollectionsKt.u5(uArrayList, i3).iterator();
             int i4 = 0;
             while (iterator1.hasNext()) {
                i4 = i4 + iterator1.next().intValue();
             }
             if (i < i4) {
                return this.this$0.S0().get(i2);
             }
             i2 = i3;
          }
       }catch(java.lang.Exception e9){
          PostUtils.D("LocalAlbumGridGroupHeaderAdapter", "getPostTestKSelector", e9);
       }
       return CollectionsKt___CollectionsKt.Y2(this.this$0.S0());
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
