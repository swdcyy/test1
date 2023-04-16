package com.kwai.live.gzone.promotion.LiveGzonePromotionGameRecyclerFragment$a;
import qvb.n0;
import java.util.List;
import java.lang.Object;
import t67.a;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;

public class LiveGzonePromotionGameRecyclerFragment$a extends n0	// class@000dad
{
    public int m;
    public List n;

    public void LiveGzonePromotionGameRecyclerFragment$a(List p0){
       super();
       this.n = p0;
       this.m = -1;
       for (int i = 0; i < p0.size() && p0.get(i).a == 1; i = i + 1) {
          this.m = i;
       }
       return;
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveGzonePromotionGameRecyclerFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(this.n);
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzonePromotionGameRecyclerFragment$a.class, "2")) {
       }else {
          p1.clear();
          p1.addAll(p0);
       }
       return;
    }
    public int V1(){
       return this.m;
    }
}
