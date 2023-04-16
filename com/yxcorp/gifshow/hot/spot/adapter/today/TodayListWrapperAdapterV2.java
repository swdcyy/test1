package com.yxcorp.gifshow.hot.spot.adapter.today.TodayListWrapperAdapterV2;
import uua.a;
import yua.b;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.spot.adapter.today.TodayListWrapperAdapterV2$onScrolled$1;
import android.content.Context;
import com.kwai.written.view.IWrittenLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jva.j;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.util.Collection;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import yua.c;
import androidx.recyclerview.widget.RecyclerView$r;
import android.widget.TextView;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import trd.t;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class TodayListWrapperAdapterV2 extends a	// class@001820
{
    public int f;
    public final l g;
    public final b h;
    public final HotSpotFeedPageList i;

    public void TodayListWrapperAdapterV2(b p0,HotSpotFeedPageList p1){
       a.p(p0, "adapter");
       a.p(p1, "cardPageList");
       super(p1);
       this.h = p0;
       this.i = p1;
       this.g = new TodayListWrapperAdapterV2$onScrolled$1(this);
    }
    public IWrittenLayout K0(Context p0){
       j oj = PatchProxy.applyOneRefs(p0, this, TodayListWrapperAdapterV2.class, "3");
       if (oj != PatchProxyResult.class) {
       }else {
          a.p(p0, "context");
          oj = new j(p0);
       }
       return oj;
    }
    public int M0(){
       return 9;
    }
    public void O0(IWrittenLayout p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TodayListWrapperAdapterV2.class, "2")) {
       }else {
          a.p(p0, "binding");
          a.p(p1, "item");
          HotSpotModel mHotSpotItem = p1.mHotSpotItems;
          int i = 1;
          mHotSpotItem = (mHotSpotItem == null || mHotSpotItem.isEmpty())? 1: null;
          int i1 = 4;
          if (!mHotSpotItem && p1.mHotSpotItems.size() < i1) {
             i1 = p1.mHotSpotItems.size();
          }
          p0.n1().setLayoutManager(new GridLayoutManager(p0.getContext(), i1, 0, 0));
          p0.n1().setAdapter(this.h);
          p0.n1().addOnScrollListener(new c(this));
          p1 = p1.mHotSpotItems;
          if (p1 != null && !p1.isEmpty()) {
             i = 0;
          }
          if (i) {
             p0.o1().setVisibility(8);
          }else {
             p0.o1().setVisibility(0);
          }
       }
       return;
    }
    public void R0(){
       Object[] objArray1;
       List list;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TodayListWrapperAdapterV2.class, "1")) {
          return;
       }
       HotSpotModel hotSpotModel = this.i.Z2();
       hotSpotModel = (hotSpotModel != null)? hotSpotModel.mHotSpotItems: objArray;
       int i = 0;
       TodayListWrapperAdapterV2 todayListWra = (hotSpotModel == null || hotSpotModel.isEmpty())? 1: null;
       if (!todayListWra) {
          hotSpotModel = this.i.Z2();
          hotSpotModel = (hotSpotModel != null)? hotSpotModel.mHotSpotItems: objArray;
          a.m(hotSpotModel);
          int i1 = hotSpotModel.size();
          for (; i < i1; i = i + 1) {
             HotSpotModel hotSpotModel1 = this.i.Z2();
             hotSpotModel1 = (hotSpotModel1 != null)? hotSpotModel1.mHotSpotItems: objArray;
             a.m(hotSpotModel1);
             hotSpotModel1.get(i).mPosition = i;
          }
       }
       hotSpotModel = this.i.Z2();
       if (hotSpotModel != null) {
          list = t.k(hotSpotModel);
          if (list != null) {
          label_0069 :
             this.Q0(list);
             todayListWra = this.h;
             HotSpotModel hotSpotModel2 = this.i.Z2();
             if (hotSpotModel2 != null) {
                hotSpotModel2 = hotSpotModel2.mHotSpotItems;
                if (hotSpotModel2 != null) {
                label_007f :
                   todayListWra.Q0(hotSpotModel2);
                   return;
                }
             }
             List list1 = CollectionsKt__CollectionsKt.E();
             goto label_007f ;
          }
       }
       list = CollectionsKt__CollectionsKt.E();
       goto label_0069 ;
    }
}
