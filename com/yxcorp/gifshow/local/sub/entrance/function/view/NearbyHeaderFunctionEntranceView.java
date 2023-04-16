package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$mAdapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$mLayoutManager$2;
import b2b.e;
import x1b.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.res.Configuration;
import rkd.b;
import java.util.List;
import g9c.a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.LocalLifeWeakStyleRecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$n;
import b2b.f;
import com.yxcorp.gifshow.local.sub.entrance.function.model.FunctionCardResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import java.util.Collection;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;

public final class NearbyHeaderFunctionEntranceView extends FrameLayout	// class@001abb
{
    public LocalLifeWeakStyleRecyclerView b;
    public final p c;
    public final p d;
    public final e e;
    public NearbyHeaderFunctionEntranceView$a f;

    public void NearbyHeaderFunctionEntranceView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NearbyHeaderFunctionEntranceView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NearbyHeaderFunctionEntranceView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d108c, this);
       this.c = s.c(new NearbyHeaderFunctionEntranceView$mAdapter$2(this));
       this.d = s.c(new NearbyHeaderFunctionEntranceView$mLayoutManager$2(p0));
       this.e = new e();
    }
    public void NearbyHeaderFunctionEntranceView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final a getMAdapter(){
       Object obj = PatchProxy.apply(null, this, NearbyHeaderFunctionEntranceView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final LinearLayoutManager getMLayoutManager(){
       Object obj = PatchProxy.apply(null, this, NearbyHeaderFunctionEntranceView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public void onConfigurationChanged(Configuration p0){
       a mAdapter;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyHeaderFunctionEntranceView.class, "11")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (!b.g() || (this.getMAdapter().Q0().size() > 0 && !PatchProxy.applyVoid(null, this, NearbyHeaderFunctionEntranceView.class, "6"))) {
          NearbyHeaderFunctionEntranceView te = this.e;
          Context context = this.getContext();
          a.m(context);
          List list = this.getMAdapter().Q0();
          a.o(list, "mAdapter.list");
          mAdapter = this.getMAdapter();
          NearbyHeaderFunctionEntranceView tb = this.b;
          if (tb == null) {
             a.S("mFunctionListRecyclerView");
          }
          te.a(context, list, mAdapter, tb);
          te = this.b;
          if (te == null) {
             a.S("mFunctionListRecyclerView");
          }
          te.setAdapter(this.getMAdapter());
          this.getMAdapter().k0();
       }
    label_0069 :
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NearbyHeaderFunctionEntranceView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       View view = this.findViewById(R.id.nearby_function_list);
       a.o(view, "findViewById\(R.id.nearby_function_list\)");
       this.b = view;
       this.getMLayoutManager().setItemPrefetchEnabled(false);
       NearbyHeaderFunctionEntranceView tb = this.b;
       String str = "mFunctionListRecyclerView";
       if (tb == null) {
          a.S(str);
       }
       tb.setLayoutManager(this.getMLayoutManager());
       tb = this.b;
       if (tb == null) {
          a.S(str);
       }
       NearbyHeaderFunctionEntranceView te = this.e;
       Objects.requireNonNull(te);
       f uof = PatchProxy.apply(objArray, te, e.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       tb.addItemDecoration(uof);
       return;
    }
    public final void setDate(FunctionCardResponse p0){
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyHeaderFunctionEntranceView.class, "9")) {
          return;
       }
       NearbyHeaderFunctionEntranceView te = this.e;
       String str = null;
       p0 = (p0 != null)? p0.mNearbyTopCards: str;
       Objects.requireNonNull(te);
       String str1 = PatchProxy.applyOneRefs(p0, te, e.class, "2");
       int i = 0;
       int i1 = 1;
       if (str1 != PatchProxyResult.class) {
       }else if(p0 != null){
          str = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = obj;
             obj1 = (obj1.mTitleV2 == null && (obj1.mType != 21 || (MapExperimentUtils.g.b() || (obj1.mType == 22 && MapExperimentUtils.g.f()))))? 1: null;
             if (obj1) {
                str.add(obj);
             }
          }
       }
       str1 = str;
       NearbyHeaderFunctionEntranceView nearbyHeader = (str1 == null || str1.isEmpty())? 1: null;
       if (nearbyHeader) {
          return;
       }else if(PatchProxy.applyVoidOneRefs(str1, this, NearbyHeaderFunctionEntranceView.class, "5")){
          View[] viewArray = new View[i1];
          NearbyHeaderFunctionEntranceView tb = this.b;
          if (tb == null) {
             a.S("mFunctionListRecyclerView");
          }
          viewArray[i] = tb;
          n.Z(i, viewArray);
          nearbyHeader = this.e;
          Context context = this.getContext();
          a.m(context);
          a mAdapter = this.getMAdapter();
          NearbyHeaderFunctionEntranceView tb1 = this.b;
          if (tb1 == null) {
             a.S("mFunctionListRecyclerView");
          }
          nearbyHeader.a(context, str1, mAdapter, tb1);
          nearbyHeader = this.b;
          if (nearbyHeader == null) {
             a.S("mFunctionListRecyclerView");
          }
          nearbyHeader.setAdapter(this.getMAdapter());
          this.getMAdapter().W0(str1);
          this.getMAdapter().k0();
       }
       return;
    }
    public final void setItemCardClickListener(NearbyHeaderFunctionEntranceView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyHeaderFunctionEntranceView.class, "10")) {
          return;
       }
       a.p(p0, "listener");
       this.f = p0;
       return;
    }
}
