package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$rerankDataProvider$2$a;
import e50.o;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$rerankDataProvider$2;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import java.util.List;
import e50.n;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import qvb.n0;
import qvb.a;

public final class HomeHotRankPresenter$rerankDataProvider$2$a implements o	// class@0018cc
{
    public final HomeHotRankPresenter$rerankDataProvider$2 b;

    public void HomeHotRankPresenter$rerankDataProvider$2$a(HomeHotRankPresenter$rerankDataProvider$2 p0){
       this.b = p0;
       super();
    }
    public int c(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomeHotRankPresenter$rerankDataProvider$2 obj = PatchProxy.apply(objArray, this, HomeHotRankPresenter$rerankDataProvider$2$a.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.b.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, HomeHotRankPresenter.class, "17");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          HomeHotRankPresenter s = obj.s;
          if (s == null) {
             a.S("recyclerView");
          }
          RecyclerView$LayoutManager layoutManage = s.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             i = layoutManage.c();
          }else if(layoutManage instanceof StaggeredGridLayoutManager){
             int[] ointArray = layoutManage.findLastVisibleItemPositions(objArray);
             a.o(ointArray, "into");
             int i1 = 0;
             int i2 = 1;
             int i3 = (!ointArray.length)? 1: 0;
             if (i3 ^ i2) {
                i3 = ointArray[i1];
                int len = ointArray.length;
                for (; i1 < len; i1 = i1 + 1) {
                   i3 = Math.max(ointArray[i1], i3);
                }
                i = i3;
             }
          }
          i = -1;
       }
       return i;
    }
    public List f0(){
       return n.c(this);
    }
    public List getItems(){
       List obj = PatchProxy.apply(null, this, HomeHotRankPresenter$rerankDataProvider$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.this$0.S8().d1();
       a.o(obj, "pageList.originItems");
       return obj;
    }
    public List i0(){
       return n.b(this);
    }
    public void m0(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeHotRankPresenter$rerankDataProvider$2$a.class, "2")) {
          return;
       }
       this.b.this$0.S8().p1();
       if (this.b.this$0.S8().d(p0)) {
          this.b.this$0.S8().b(p1);
       }
       this.b.this$0.S8().J();
       return;
    }
}
