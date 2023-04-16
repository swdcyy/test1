package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1;
import qvb.q;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import qvb.a;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1$onPageListDataModified$1;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1$onPageListDataModified$3;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$1;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3;

public final class MapBottomFeedPresenter$pageListObserver$1 implements q	// class@001c8e
{
    public final MapBottomFeedPresenter b;

    public void MapBottomFeedPresenter$pageListObserver$1(MapBottomFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       String str1;
       MapBottomFeedPresenter$pageListObserver$1 opageListObs = MapBottomFeedPresenter$pageListObserver$1.class;
       if (PatchProxy.isSupport(opageListObs) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, opageListObs, "2")) {
          return;
       }
       p.c(this, p0);
       MapBottomFeedPresenter$pageListObserver$1 tb = this.b;
       MapBottomFeedPresenter r = tb.r;
       String str = "";
       if (r != null) {
          List items = r.getItems();
          if (items != null) {
             str1 = CollectionsKt___CollectionsKt.V2(items, ",", null, null, 0, null, MapBottomFeedPresenter$pageListObserver$1$onPageListDataModified$1.INSTANCE, 30, null);
             if (str1 != null) {
             label_0039 :
                MapBottomFeedPresenter r1 = this.b.r;
                if (r1 != null) {
                   items = r1.getItems();
                   if (items != null) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = items.iterator();
                      while (iterator.hasNext()) {
                         Object obj = iterator.next();
                         Object obj1 = obj;
                         a.o(obj1, "it");
                         if (obj1.isVideoType()) {
                            uArrayList.add(obj);
                         }
                      }
                      String str2 = CollectionsKt___CollectionsKt.V2(uArrayList, ",", null, null, 0, null, MapBottomFeedPresenter$pageListObserver$1$onPageListDataModified$3.INSTANCE, 30, null);
                      if (str2 != null) {
                         str = str2;
                      }
                   }
                }
                tb.R8(str1, str);
                return;
             }
          }
       }
       str1 = str;
       goto label_0039 ;
    }
    public void v2(boolean p0,boolean p1){
       String str1;
       MapBottomFeedPresenter$pageListObserver$1 opageListObs = MapBottomFeedPresenter$pageListObserver$1.class;
       if (PatchProxy.isSupport(opageListObs) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, opageListObs, "1")) {
          return;
       }
       p.b(this, p0, p1);
       MapBottomFeedPresenter$pageListObserver$1 tb = this.b;
       MapBottomFeedPresenter r = tb.r;
       String str = "";
       if (r != null) {
          List items = r.getItems();
          if (items != null) {
             str1 = CollectionsKt___CollectionsKt.V2(items, ",", null, null, 0, null, MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$1.INSTANCE, 30, null);
             if (str1 != null) {
             label_003d :
                MapBottomFeedPresenter r1 = this.b.r;
                if (r1 != null) {
                   items = r1.getItems();
                   if (items != null) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = items.iterator();
                      while (iterator.hasNext()) {
                         Object obj = iterator.next();
                         Object obj1 = obj;
                         a.o(obj1, "it");
                         if (obj1.isVideoType()) {
                            uArrayList.add(obj);
                         }
                      }
                      String str2 = CollectionsKt___CollectionsKt.V2(uArrayList, ",", null, null, 0, null, MapBottomFeedPresenter$pageListObserver$1$onFinishLoading$3.INSTANCE, 30, null);
                      if (str2 != null) {
                         str = str2;
                      }
                   }
                }
                tb.R8(str1, str);
                return;
             }
          }
       }
       str1 = str;
       goto label_003d ;
    }
}
