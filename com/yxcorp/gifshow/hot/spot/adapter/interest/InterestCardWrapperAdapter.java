package com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter;
import uua.a;
import xua.a;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.spot.adapter.interest.InterestCardWrapperAdapter$onScrolled$1;
import android.content.Context;
import com.kwai.written.view.IWrittenLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jva.e;
import java.util.List;
import fva.p;
import trd.t;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.util.Collection;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import xua.b;
import androidx.recyclerview.widget.RecyclerView$r;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class InterestCardWrapperAdapter extends a	// class@00181e
{
    public int f;
    public final l g;
    public final a h;
    public final HotSpotFeedPageList i;

    public void InterestCardWrapperAdapter(a p0,HotSpotFeedPageList p1){
       a.p(p0, "adapter");
       a.p(p1, "cardPageList");
       super(p1);
       this.h = p0;
       this.i = p1;
       this.g = new InterestCardWrapperAdapter$onScrolled$1(this);
    }
    public IWrittenLayout K0(Context p0){
       e uoe = PatchProxy.applyOneRefs(p0, this, InterestCardWrapperAdapter.class, "6");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p0, "context");
          uoe = new e(p0);
       }
       return uoe;
    }
    public int M0(){
       return 3;
    }
    public List N0(){
       Object obj = PatchProxy.apply(null, this, InterestCardWrapperAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k(new p(this, this.h));
    }
    public void O0(IWrittenLayout p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InterestCardWrapperAdapter.class, "4")) {
       }else {
          a.p(p0, "binding");
          a.p(p1, "item");
          HotSpotModel mHotSpotItem = p1.mHotSpotItems;
          Context uContext = 1;
          TextView textView = (mHotSpotItem == null || mHotSpotItem.isEmpty())? 1: null;
          if (textView) {
             p0.p1().setVisibility(8);
             p0.o1().setVisibility(8);
          }else {
             p0.p1().setVisibility(0);
             p0.o1().setVisibility(0);
          }
          if (TextUtils.isEmpty(p1.mTitleName)) {
             p0.p1().setVisibility(8);
          }else {
             mHotSpotItem = p1.mHotSpotItems;
             if (mHotSpotItem != null && !mHotSpotItem.isEmpty()) {
                uContext = null;
             }
             if (uContext == null) {
                p0.p1().setVisibility(0);
             }
          }
          p0.p1().setText(p1.mTitleName);
          p0.n1().setLayoutManager(new LinearLayoutManager(p0.getContext(), 0, 0));
          p0.n1().setAdapter(this.h);
          p0.n1().addOnScrollListener(new b(this));
       }
       return;
    }
    public void R0(){
       List list;
       if (PatchProxy.applyVoid(null, this, InterestCardWrapperAdapter.class, "1")) {
          return;
       }
       HotSpotModel hotSpotModel = this.i.X2();
       if (hotSpotModel != null) {
          list = t.k(hotSpotModel);
          if (list != null) {
          label_001f :
             this.Q0(list);
             InterestCardWrapperAdapter th = this.h;
             HotSpotModel hotSpotModel1 = this.i.X2();
             if (hotSpotModel1 != null) {
                hotSpotModel1 = hotSpotModel1.mHotSpotItems;
                if (hotSpotModel1 != null) {
                label_0035 :
                   th.Q0(hotSpotModel1);
                   return;
                }
             }
             List list1 = CollectionsKt__CollectionsKt.E();
             goto label_0035 ;
          }
       }
       list = CollectionsKt__CollectionsKt.E();
       goto label_001f ;
    }
}
