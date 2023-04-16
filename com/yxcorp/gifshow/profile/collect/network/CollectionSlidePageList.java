package com.yxcorp.gifshow.profile.collect.network.CollectionSlidePageList;
import o3c.p;
import com.yxcorp.gifshow.profile.collect.network.CollectionSlidePageList$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.collect.network.CollectionSlidePageList$Orientation;
import java.util.List;
import qvb.a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import qvb.n0;
import com.yxcorp.utility.Log;
import wkd.b;
import k2c.a;
import com.kwai.framework.model.user.QCurrentUser;
import n2c.g;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import cjd.e;
import erd.o;
import java.lang.Throwable;
import qvb.n0$a;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import la6.b;
import java.lang.Boolean;
import la6.a;
import kp.y1;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.PhotoMeta;
import r2c.a;
import java.lang.Void;
import qvb.f;
import java.util.ArrayList;

public final class CollectionSlidePageList extends p	// class@0012cd
{
    public CollectionSlidePageList$Orientation p;
    public String q;
    public String r;
    public final QPhoto s;
    public static final CollectionSlidePageList$a t;

    static {
       CollectionSlidePageList.t = new CollectionSlidePageList$a(null);
    }
    public void CollectionSlidePageList(QPhoto p0){
       a.p(p0, "mPhoto");
       super();
       this.s = p0;
       this.p = CollectionSlidePageList$Orientation.UNSPECIFIED;
       this.getItems().add(0, p0);
    }
    public t I1(){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CollectionSlidePageList uCollectionS = CollectionSlidePageList.class;
       Object[] objArray = null;
       QCurrentUser obj = PatchProxy.apply(objArray, this, uCollectionS, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       Log.g("CollectionSlidePageList", "request firstPage:"+this.K()+", orientation:"+this.p);
       Object obj1 = b.a(0x79c94a4a);
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       String id = obj.getId();
       String photoId = this.s.getPhotoId();
       String type = this.p.getType();
       Object obj2 = PatchProxy.apply(objArray, this, uCollectionS, "2");
       if (obj2 != patchProxyRe) {
          objArray1 = obj2;
       }else {
          int i = g.a[this.p.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i == 3) {
                   objArray = this.q;
                }else {
                   throw new NoWhenBranchMatchedException();
                }
             }else {
                objArray = this.r;
             }
          }
          objArray1 = objArray;
       }
       return obj1.d(id, photoId, type, objArray1, 10).map(new e());
    }
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionSlidePageList.class, "6")) {
          return;
       }
       super.J1(p0);
       Log.o("CollectionSlidePageList", "onError: ...", p0);
       this.p = CollectionSlidePageList$Orientation.UNSPECIFIED;
       return;
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionSlidePageList.class, "5")) {
          return;
       }
       super.K1(p0);
       Log.g("CollectionSlidePageList", "onLoadCompleted: ...");
       this.p = CollectionSlidePageList$Orientation.UNSPECIFIED;
       return;
    }
    public void M1(Object p0,List p1){
       this.l2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.l2(p0, p1);
    }
    public boolean i(){
       return false;
    }
    public final QPhoto i2(){
       return this.s;
    }
    public boolean isEmpty(){
       Object obj = PatchProxy.apply(null, this, CollectionSlidePageList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.g("CollectionSlidePageList", "isEmpty: ..."+super.isEmpty());
       return super.isEmpty();
    }
    public final boolean j2(CollectionSlidePageList$Orientation p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionSlidePageList.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = g.b[p0.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             b = a.a(this.r);
          }
       }else {
          b = a.a(this.q);
       }
       return b;
    }
    public final void k2(CollectionSlidePageList$Orientation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionSlidePageList.class, "12")) {
          return;
       }
       this.p = p0;
       Log.g("CollectionSlidePageList", "loadMore: orientation:"+p0);
       this.R1(this.j2(p0));
       this.load();
       return;
    }
    public void l2(ProfileFeedResponse p0,List p1){
       List items;
       CollectionSlidePageList uCollectionS = CollectionSlidePageList.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uCollectionS, "4")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "items");
       String str = "CollectionSlidePageList";
       Log.g(str, "onLoadItemFromResponse: ...");
       if (!PatchProxy.applyVoidOneRefs(p0, this, uCollectionS, "13")) {
          Log.g(str, "updateCursors: orientation:"+this.p);
          int i = g.c[this.p.ordinal()];
          if (i != 1) {
             if (i != 2) {
                this.r = p0.getCursor();
                this.q = p0.getPrevCursor();
             }else {
                this.q = p0.getPrevCursor();
             }
          }else {
             this.r = p0.getCursor();
          }
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uCollectionS, "14")) {
          items = p0.getItems();
          if (items.isEmpty()) {
             Log.g(str, "updateItems: new items is empty!");
          }else {
             y1.c(p0.getItems(), p0.getLlsid());
             Log.g(str, "updateItems: isFirstPage:"+this.K());
             str = "newItems";
             if (this.K()) {
                a.o(items, str);
                if (!PatchProxy.applyVoidOneRefs(items, this, uCollectionS, "16")) {
                   Iterator iterator = items.iterator();
                   uCollectionS = 0;
                   while (iterator.hasNext()) {
                      QPhoto qPhoto = iterator.next();
                      if ((qPhoto.getPhotoId()).equals(this.s.getPhotoId())) {
                         uCollectionS = 1;
                      }
                      PhotoMeta photoMeta = qPhoto.getPhotoMeta();
                      if (photoMeta != null) {
                         String photoId = qPhoto.getPhotoId();
                         a.o(photoId, "it.photoId");
                         photoMeta.setCollected(a.a(photoId, "isCollected", qPhoto.isCollected()));
                      }
                   }
                   if (!uCollectionS) {
                      items.add(0, this.s);
                   }
                   this.V1(items);
                }
             }else {
                a.o(items, str);
                if (!PatchProxy.applyVoidTwoRefs(items, p1, this, uCollectionS, "15")) {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator1 = items.iterator();
                   while (iterator1.hasNext()) {
                      Object obj = iterator1.next();
                      if (!p1.contains(obj)) {
                         uArrayList.add(obj);
                      }
                   }
                   this.V1(uArrayList);
                }
             }
          }
       }
       return;
    }
}
