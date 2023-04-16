package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$rerankDataProvider$2$a;
import e50.o;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter$rerankDataProvider$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jia.g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import e50.n;
import qvb.i;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Math;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import android.graphics.Rect;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Collection;

public final class HomeFollowEveRankPresenter$rerankDataProvider$2$a implements o	// class@0011ed
{
    public final HomeFollowEveRankPresenter$rerankDataProvider$2 b;

    public void HomeFollowEveRankPresenter$rerankDataProvider$2$a(HomeFollowEveRankPresenter$rerankDataProvider$2 p0){
       this.b = p0;
       super();
    }
    public int c(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, HomeFollowEveRankPresenter$rerankDataProvider$2$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.this$0.w.g7();
       if (obj instanceof g) {
          objArray = obj;
       }
       int i = (objArray != null)? objArray.t1(): 0;
       HomeFollowEveRankPresenter$rerankDataProvider$2 this$0 = this.b.this$0;
       return (this$0.S8(HomeFollowEveRankPresenter.R8(this$0)) - i);
    }
    public List f0(){
       return n.c(this);
    }
    public List getItems(){
       List obj = PatchProxy.apply(null, this, HomeFollowEveRankPresenter$rerankDataProvider$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = HomeFollowEveRankPresenter.P8(this.b.this$0).d1();
       a.o(obj, "pageList.originItems");
       return obj;
    }
    public List i0(){
       int i2;
       int i3;
       int i5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HomeFollowEveRankPresenter$rerankDataProvider$2 obj = PatchProxy.apply(objArray, this, HomeFollowEveRankPresenter$rerankDataProvider$2$a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b.this$0;
       RecyclerView recyclerView = HomeFollowEveRankPresenter.R8(obj);
       Objects.requireNonNull(obj);
       List obj1 = PatchProxy.applyOneRefs(recyclerView, obj, HomeFollowEveRankPresenter.class, "8");
       int i = 1;
       int i1 = 0;
       if (obj1 != patchProxyRe) {
          i2 = obj1.intValue();
       }else {
          RecyclerView$LayoutManager layoutManage1 = recyclerView.getLayoutManager();
          if (layoutManage1 instanceof LinearLayoutManager) {
             i2 = layoutManage1.i0();
          }else if(layoutManage1 instanceof StaggeredGridLayoutManager){
             int[] ointArray = layoutManage1.findFirstVisibleItemPositions(objArray);
             a.o(ointArray, "into");
             i3 = (!ointArray.length)? 1: 0;
             if (i3 ^ i) {
                i3 = ointArray[i1];
                i5 = ointArray.length;
                for (int i8 = 0; i8 < i5; i8 = i8 + 1) {
                   i3 = Math.min(ointArray[i8], i3);
                }
                i2 = i3;
             }
          }
          i2 = -1;
       }
       obj = this.b.this$0;
       i3 = obj.S8(HomeFollowEveRankPresenter.R8(obj));
       g og = this.b.this$0.w.g7();
       if (og instanceof g) {
          objArray = og;
       }
       int i4 = (objArray != null)? objArray.t1(): 0;
       i5 = Math.max(i1, (i2 - i4));
       i3 = Math.max(i1, (i3 - i4));
       if (i2 < i4) {
          i2 = i2 + i4;
       }
       obj1 = HomeFollowEveRankPresenter.P8(this.b.this$0).getItems().subList(i5, (i3 + i));
       Iterator iterator = obj1.iterator();
       while (iterator.hasNext()) {
          Object obj2 = iterator.next();
          i = i1 + 1;
          if (i1 < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          RecyclerView$LayoutManager layoutManage = HomeFollowEveRankPresenter.R8(this.b.this$0).getLayoutManager();
          Rect rect = null;
          if (layoutManage != null) {
             i1 = i1 + i2;
             View view = layoutManage.findViewByPosition(i1);
             if (view != null) {
                Rect rect1 = new Rect();
                if (view.getLocalVisibleRect(rect1)) {
                   int i6 = rect1.bottom - rect1.top;
                   int i7 = rect1.right - rect1.left;
                   i6 = i6 * i7;
                   float f = (float)i6;
                   a.o(view, "it");
                   i6 = view.getWidth() * view.getHeight();
                   f = f / (float)i6;
                   rect = f;
                }
             }
          }
          r1.S4(obj2.mEntity, rect);
          i1 = i;
       }
       return obj1;
    }
    public void m0(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeFollowEveRankPresenter$rerankDataProvider$2$a.class, "2")) {
          return;
       }
       a.p(p0, "originItems");
       a.p(p1, "replaceItems");
       if (HomeFollowEveRankPresenter.P8(this.b.this$0).d1().removeAll(p0)) {
          HomeFollowEveRankPresenter.P8(this.b.this$0).b(p1);
       }
       return;
    }
}
