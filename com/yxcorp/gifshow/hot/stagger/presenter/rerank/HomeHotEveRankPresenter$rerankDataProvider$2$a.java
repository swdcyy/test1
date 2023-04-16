package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$rerankDataProvider$2$a;
import e50.o;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$rerankDataProvider$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import e50.n;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import qvb.n0;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import qvb.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import android.graphics.Rect;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import qrd.p;
import java.lang.Boolean;
import qvb.o;

public final class HomeHotEveRankPresenter$rerankDataProvider$2$a implements o	// class@0018bd
{
    public final HomeHotEveRankPresenter$rerankDataProvider$2 b;

    public void HomeHotEveRankPresenter$rerankDataProvider$2$a(HomeHotEveRankPresenter$rerankDataProvider$2 p0){
       this.b = p0;
       super();
    }
    public int c(){
       HomeHotEveRankPresenter$rerankDataProvider$2 obj = PatchProxy.apply(null, this, HomeHotEveRankPresenter$rerankDataProvider$2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.this$0;
       return obj.S8(HomeHotEveRankPresenter.R8(obj));
    }
    public List f0(){
       return n.c(this);
    }
    public List getItems(){
       List obj = PatchProxy.apply(null, this, HomeHotEveRankPresenter$rerankDataProvider$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = HomeHotEveRankPresenter.P8(this.b.this$0).d1();
       a.o(obj, "pageList.originItems");
       return obj;
    }
    public List i0(){
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomeHotEveRankPresenter$rerankDataProvider$2 obj = PatchProxy.apply(objArray, this, HomeHotEveRankPresenter$rerankDataProvider$2$a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b.this$0;
       RecyclerView recyclerView = HomeHotEveRankPresenter.R8(obj);
       Objects.requireNonNull(obj);
       List obj1 = PatchProxy.applyOneRefs(recyclerView, obj, HomeHotEveRankPresenter.class, "11");
       int i = 0;
       int i1 = 1;
       if (obj1 != patchProxyRe) {
          i2 = obj1.intValue();
       }else {
          RecyclerView$LayoutManager layoutManage1 = recyclerView.getLayoutManager();
          if (layoutManage1 instanceof LinearLayoutManager) {
             i2 = layoutManage1.i0();
          }else if(layoutManage1 instanceof StaggeredGridLayoutManager){
             int[] ointArray = layoutManage1.findFirstVisibleItemPositions(objArray);
             a.o(ointArray, "into");
             int i5 = (!ointArray.length)? 1: 0;
             if (i5 ^ i1) {
                i5 = ointArray[i];
                int len = ointArray.length;
                for (int i6 = 0; i6 < len; i6 = i6 + 1) {
                   i5 = Math.min(ointArray[i6], i5);
                }
                i2 = i5;
             }
          }
          i2 = -1;
       }
       obj = this.b.this$0;
       obj1 = HomeHotEveRankPresenter.P8(this.b.this$0).getItems().subList(i2, (obj.S8(HomeHotEveRankPresenter.R8(obj)) + i1));
       Iterator iterator = obj1.iterator();
       while (iterator.hasNext()) {
          Object obj2 = iterator.next();
          i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          RecyclerView$LayoutManager layoutManage = HomeHotEveRankPresenter.R8(this.b.this$0).getLayoutManager();
          Rect rect = null;
          if (layoutManage != null) {
             i = i + i2;
             View view = layoutManage.findViewByPosition(i);
             if (view != null) {
                Rect rect1 = new Rect();
                if (view.getLocalVisibleRect(rect1)) {
                   int i3 = rect1.bottom - rect1.top;
                   int i4 = rect1.right - rect1.left;
                   i3 = i3 * i4;
                   float f = (float)i3;
                   a.o(view, "it");
                   i3 = view.getWidth() * view.getHeight();
                   f = f / (float)i3;
                   rect = f;
                }
             }
          }
          r1.S4(obj2.mEntity, rect);
          i = i1;
       }
       return obj1;
    }
    public void m0(List p0,List p1){
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeHotEveRankPresenter$rerankDataProvider$2$a.class, str)) {
          return;
       }
       HomeHotEveRankPresenter.P8(this.b.this$0).p1();
       if (HomeHotEveRankPresenter.P8(this.b.this$0).d(p0)) {
          HomeHotEveRankPresenter.P8(this.b.this$0).b(p1);
       }
       HomeHotEveRankPresenter$rerankDataProvider$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       Boolean uBoolean = PatchProxy.apply(null, this$0, HomeHotEveRankPresenter.class, str);
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = this$0.s.getValue();
       }
       if (uBoolean.booleanValue()) {
          j oj = HomeHotEveRankPresenter.P8(this.b.this$0);
          Objects.requireNonNull(oj);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, oj, uoa, "4")) {
             a c = oj.c;
             Objects.requireNonNull(c);
             o oo = o.class;
             if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidOneRefs(Boolean.FALSE, c, oo, "10")) {
                c.b = false;
                c.k(false);
             }
          }
       }else {
          HomeHotEveRankPresenter.P8(this.b.this$0).J();
       }
       return;
    }
}
