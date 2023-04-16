package com.kwai.nearby.local.presenter.e$a;
import mb5.a;
import com.kwai.nearby.local.presenter.e;
import com.yxcorp.gifshow.nearby.common.model.NearbyLiveCachePoolConfig;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.a;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager;
import java.lang.Math;
import android.view.View;
import rd7.b;
import com.kwai.framework.model.feed.BaseFeed;
import sc7.b0;
import java.util.Objects;
import ld7.e;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import trd.y;
import java.util.HashMap;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.System;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import qvb.o;

public class e$a extends a	// class@000fae
{
    public final e f;

    public void e$a(e p0){
       this.f = p0;
       super();
    }
    public boolean a(){
       boolean b = (this.f.u.cacheSize >= null)? true: false;
       return b;
    }
    public int b(){
       return this.f.u.cacheSize;
    }
    public int c(){
       return this.f.u.cacheValidInterval;
    }
    public void d(List p0){
       e uoe2;
       int i5;
       a uoa;
       ArrayList uArrayList2;
       e uoe3;
       e uoe4;
       int i6;
       QPhoto qPhoto1;
       int i7;
       Iterator iterator1;
       JsonObject jsonObject;
       JsonObject jsonObject1;
       QPhoto qPhoto2;
       Object obj1;
       long l;
       Object obj = this;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, e$a.class, str)) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       boolean b = false;
       boolean i1 = 1;
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (obj.f.p.A(qPhoto) < 0) {
             continue ;
          }else {
             int i2 = 2;
             if (qPhoto.isShowed() || qPhoto.isRecShowed()) {
                e$a f = obj.f;
                NearbyLiveCachePoolConfig visibleLiveE = f.u.visibleLiveEndStrategy;
                if (visibleLiveE == i1) {
                   e r = f.r;
                   if (r instanceof StaggeredGridLayoutManager && r.getSpanCount() > 0) {
                      i2 = obj.f.r.getSpanCount();
                   }
                   int[] ointArray = new int[i2];
                   HomeItemLayoutManager layoutManage = obj.f.q.h0().getLayoutManager();
                   if (layoutManage == null) {
                      continue ;
                   }else {
                      layoutManage.findFirstVisibleItemPositions(ointArray);
                      layoutManage.findLastVisibleItemPositions(ointArray);
                      int i3 = Math.max(ointArray[i], ointArray[i1]);
                      int i4 = obj.f.p.A(qPhoto);
                      if (Math.min(ointArray[i], ointArray[i1]) <= i4 && i4 <= i3) {
                         View view = layoutManage.findViewByPosition(i4);
                         e$a f1 = obj.f;
                         if (f1.v == null) {
                            f1.v = new b(f1.q);
                         }
                         obj.f.v.d(view, qPhoto.mEntity);
                      }else {
                         uArrayList.add(qPhoto);
                      }
                   }
                }else if(visibleLiveE == i2){
                   uArrayList1.add(qPhoto);
                }else {
                   b = true;
                }
             }else if(obj.f.u.notShowLiveEndStrategy == i2){
                uArrayList1.add(qPhoto);
             }else {
                uArrayList.add(qPhoto);
             }
          }
       }
       e$a f2 = obj.f;
       e p = f2.p;
       if (p instanceof b0) {
          e uoe = p;
          e x = f2.x;
          Objects.requireNonNull(uoe);
          e uoe1 = e.class;
          if (PatchProxy.isSupport(b0.class)) {
             uoe2 = uoe1;
             if (!PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), uArrayList, uArrayList1, x, uoe, b0.class, "37")) {
             }
          }else {
             uoe2 = uoe1;
          }
       }
    label_02ab :
       return;
    }
}
