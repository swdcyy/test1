package com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList;
import com.kwai.library.slide.base.pagelist.a;
import com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList$Orientation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import ip.c;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import ip.a;
import qvb.n0;
import om9.b;
import java.lang.Integer;
import cjd.e;
import erd.o;
import com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList$onCreateRequest$1;
import zy6.b;
import msd.l;
import erd.g;
import kotlin.jvm.internal.a;
import com.kwai.library.slide.base.pagelist.DetailProfileFeedBidirectionalPageList$onCreateRequest$2;
import java.lang.Throwable;
import zy6.e;
import qvb.n0$a;
import yy6.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import java.util.List;
import java.lang.Boolean;
import qvb.a;
import la6.b;
import zy6.a;
import java.lang.Enum;
import tca.h;
import zy6.c;
import java.util.Collection;
import qk.g0;
import tca.v2;
import kp.y1;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qvb.f;
import java.lang.IllegalStateException;
import android.util.Log;
import org.json.JSONObject;
import java.lang.Number;
import ekd.q;
import la6.a;
import qrd.l1;

public final class DetailProfileFeedBidirectionalPageList extends a	// class@0008eb
{
    public boolean A;
    public l B;
    public String C;
    public String D;
    public DetailProfileFeedBidirectionalPageList$Orientation E;
    public e F;
    public String G;
    public boolean H;
    public final String x;
    public final int y;
    public int z;

    public void DetailProfileFeedBidirectionalPageList(){
       super();
       this.x = "ProfileFeedBidirectionalPL";
       this.y = 20;
       this.z = -1;
       this.C = "";
       this.D = "";
    }
    public void DetailProfileFeedBidirectionalPageList(int p0){
       super();
       this.z = p0;
       this.E = DetailProfileFeedBidirectionalPageList$Orientation.UNSPECIFIED;
       this.A = false;
    }
    public final void B0(){
       if (PatchProxy.applyVoid(null, this, DetailProfileFeedBidirectionalPageList.class, "11")) {
          return;
       }
       this.w2(DetailProfileFeedBidirectionalPageList$Orientation.NEXT);
       return;
    }
    public t I1(){
       String photoId;
       String userId;
       t ot;
       Object[] objArray = null;
       QPhoto obj = PatchProxy.apply(objArray, this, DetailProfileFeedBidirectionalPageList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k2();
       if (obj == null) {
          return objArray;
       }
       int i = 0x188c3889;
       if (b.a(i).a(obj.getAdvertisement())) {
          a uoa = b.a(i).d(obj.getAdvertisement());
          if (uoa != null) {
             QPhoto sidePhoto = uoa.getSidePhoto();
             if (sidePhoto != null) {
                photoId = sidePhoto.getPhotoId();
                if (photoId != null) {
                label_004a :
                   if (uoa != null) {
                      QPhoto sidePhoto1 = uoa.getSidePhoto();
                      if (sidePhoto1 != null) {
                         userId = sidePhoto1.getUserId();
                         if (userId == null) {
                         }
                      }else {
                      }
                   }else {
                   }
                }
             }
          }
          photoId = obj.getPhotoId();
          goto label_004a ;
       }else {
          photoId = obj.getPhotoId();
          userId = obj.getUserId();
       }
       String str = userId;
       String str1 = photoId;
       i = -1194651878;
       if (this.K()) {
          ot = b.a(i).c(str1, str, null, this.z, this.s2(), this.t2()).map(new e()).doOnNext(new b(new DetailProfileFeedBidirectionalPageList$onCreateRequest$1(this)));
       }else {
          Object obj1 = b.a(i);
          DetailProfileFeedBidirectionalPageList tE = this.E;
          if (tE == null) {
             a.S("orientation");
          }
          ot = obj1.a(str1, str, null, tE.getType(), this.C, this.D, this.z, this.s2(), this.t2()).map(new e()).doOnNext(new b(new DetailProfileFeedBidirectionalPageList$onCreateRequest$2(this)));
       }
       return ot;
    }
    public void J1(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "7")) {
          return;
       }
       super.J1(p0);
       this.E = DetailProfileFeedBidirectionalPageList$Orientation.UNSPECIFIED;
       DetailProfileFeedBidirectionalPageList tF = this.F;
       if (tF != null) {
          tF.n2(this.K(), p0);
       }
       return;
    }
    public void K1(n0$a p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "6")) {
          return;
       }
       super.K1(p0);
       int i = 0;
       if (this.k2() != null) {
          QPhoto qPhoto = this.k2();
          a.m(qPhoto);
          qPhoto = this.k2();
          a.m(qPhoto);
          objArray = new Object[i];
          b.C().w("GROOT", this.x+" , request finish -- currentPhotoID = "+qPhoto.getPhotoId()+"     currentUserID = "+qPhoto.getUserId(), objArray);
       }else {
          objArray = new Object[i];
          b.C().w("GROOT", this.x+" , request finish -- currentPhoto = null", objArray);
       }
       if (p0 != null && (p0.a() != null && (p0.a().getItems() != null && (!p0.a().getItems().isEmpty() && p0.a().getItems().get(i) != null)))) {
          Object[] objArray1 = new Object[i];
          b.C().w("GROOT", this.x+" ,  requestUserID = "+p0.a().getItems().get(i).getUserId(), objArray1);
       }
    label_00d8 :
       this.E = DetailProfileFeedBidirectionalPageList$Orientation.UNSPECIFIED;
       return;
    }
    public void M1(Object p0,List p1){
       this.m2(p0, p1);
    }
    public final boolean Q0(){
       Object obj = PatchProxy.apply(null, this, DetailProfileFeedBidirectionalPageList.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.u2(DetailProfileFeedBidirectionalPageList$Orientation.NEXT);
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "18")) {
          return;
       }
       a.p(p0, "list");
       super.b(p0);
       this.r2();
       return;
    }
    public void d2(b p0,List p1){
       this.m2(p0, p1);
    }
    public void e(int p0,List p1){
       DetailProfileFeedBidirectionalPageList uDetailProfi = DetailProfileFeedBidirectionalPageList.class;
       if (PatchProxy.isSupport(uDetailProfi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uDetailProfi, "19")) {
          return;
       }
       a.p(p1, "list");
       super.e(p0, p1);
       this.r2();
       return;
    }
    public void l0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "17")) {
          return;
       }
       a.p(p0, "list");
       super.l0(p0);
       this.r2();
       return;
    }
    public void m2(ProfileFeedResponse p0,List p1){
       List items;
       PhotoMeta photoMeta1;
       DetailProfileFeedBidirectionalPageList tF;
       String obj;
       String prevCursor;
       DetailProfileFeedBidirectionalPageList uDetailProfi = DetailProfileFeedBidirectionalPageList.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uDetailProfi, "5")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "items");
       if (this.h2(p0)) {
          Object[] objArray = new Object[0];
          b.C().w("GROOT", this.x+", onLoadItemFromResponse... is current user ", objArray);
          String str = "orientation";
          int i = 1;
          if (!PatchProxy.applyVoidOneRefs(p0, this, uDetailProfi, "15")) {
             DetailProfileFeedBidirectionalPageList tE1 = this.E;
             if (tE1 == null) {
                a.S(str);
             }
             int i2 = a.b[tE1.ordinal()];
             obj = "response.prevCursor";
             if (i2 != i) {
                String str1 = "response.cursor";
                if (i2 != 2) {
                   if (i2 == 3) {
                      prevCursor = p0.getPrevCursor();
                      a.o(prevCursor, obj);
                      this.C = prevCursor;
                      prevCursor = p0.getCursor();
                      a.o(prevCursor, str1);
                      this.D = prevCursor;
                   }
                }else {
                   prevCursor = p0.getCursor();
                   a.o(prevCursor, str1);
                   this.D = prevCursor;
                }
             }else {
                prevCursor = p0.getPrevCursor();
                a.o(prevCursor, obj);
                this.C = prevCursor;
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uDetailProfi, "16")) {
             items = p0.getItems();
             if (!items.isEmpty()) {
                h[] ohArray = new h[i];
                ohArray[0] = new c();
                0.a(items, ohArray);
                y1.c(p0.getItems(), p0.getLlsid());
                a.o(items, "newItems");
                Iterator iterator = items.iterator();
                PhotoMeta photoMeta = null;
                while (iterator.hasNext()) {
                   QPhoto qPhoto = iterator.next();
                   a.o(qPhoto, "it");
                   photoMeta1 = qPhoto.getPhotoMeta();
                   if (photoMeta1 != null) {
                      QPhoto qPhoto1 = this.k2();
                      if (qPhoto1 != null) {
                         PhotoMeta photoMeta2 = qPhoto1.getPhotoMeta();
                         if (photoMeta2 != null) {
                            photoMeta = Integer.valueOf(photoMeta2.mPhotoFollowingIntensify);
                         }
                      }
                      photoMeta1.mPhotoFollowingIntensify = photoMeta.intValue();
                   }
                   QPhoto qPhoto2 = this.k2();
                   if (qPhoto2 != null) {
                      BaseFeed entity = qPhoto2.getEntity();
                      if (entity != null) {
                         qPhoto.setFeedStreamType(r1.P0(entity));
                      }
                   }
                }
                QPhoto qPhoto3 = this.k2();
                if (qPhoto3 != null) {
                   PhotoMeta photoMeta3 = qPhoto3.getPhotoMeta();
                   if (photoMeta3 != null) {
                      photoMeta3 = photoMeta3.mOperationBarInfo;
                      if (photoMeta3 != null) {
                         Iterator iterator1 = items.iterator();
                         while (iterator1.hasNext()) {
                            QPhoto qPhoto4 = iterator1.next();
                            if (a.g(qPhoto4, this.k2()) && qPhoto4 != null) {
                               photoMeta1 = qPhoto4.getPhotoMeta();
                               if (photoMeta1 != null) {
                                  photoMeta1.mOperationBarInfo = photoMeta3;
                               }
                            }
                         }
                      }
                   }
                }
                if (this.K()) {
                   this.H = i;
                   int i1 = items.indexOf(this.k2());
                   if (i1 >= 0) {
                      QPhoto qPhoto5 = this.k2();
                      a.o(qPhoto5, "newPhoto");
                      PhotoMeta photoMeta4 = qPhoto5.getPhotoMeta();
                      if (photoMeta4 != null) {
                         QPhoto qPhoto6 = items.get(i1);
                         if (qPhoto6 != null) {
                            PhotoMeta photoMeta5 = qPhoto6.getPhotoMeta();
                            if (photoMeta5 != null) {
                               photoMeta = Boolean.valueOf(photoMeta5.mIsPhotoTop);
                            }
                         }
                         photoMeta4.mIsPhotoTop = photoMeta.booleanValue();
                      }
                      items.set(i1, qPhoto5);
                   }
                   if (!items.contains(this.k2())) {
                      Object[] objArray1 = new Object[0];
                      b.C().w("GROOT", "OptProfilePageList, first page response not contains current photo", objArray1);
                      items.add(0, this.k2());
                   }
                   b.a(0x188c3889).j(items);
                   this.l0(items);
                   tF = this.F;
                   if (tF != null) {
                      tF.L4(items);
                   }
                }else {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator2 = items.iterator();
                   while (iterator2.hasNext()) {
                      obj = iterator2.next();
                      if (!p1.contains(obj)) {
                         uArrayList.add(obj);
                      }
                   }
                   if (!this.getItems().contains(this.k2()) && !uArrayList.contains(this.k2())) {
                      Object[] objArray2 = new Object[0];
                      b.C().w("GROOT", "OptProfilePageList, items and filteredItems not contains current photo", objArray2);
                      CollectionsKt___CollectionsKt.J5(uArrayList).add(0, this.k2());
                   }
                   b.a(0x188c3889).j(uArrayList);
                   this.V1(uArrayList);
                   DetailProfileFeedBidirectionalPageList tE = this.E;
                   if (tE == null) {
                      a.S(str);
                   }
                   if (tE == DetailProfileFeedBidirectionalPageList$Orientation.PREV) {
                      this.H = i;
                      this.e(0, uArrayList);
                      tE = this.F;
                      if (tE != null) {
                         tE.U2(uArrayList);
                      }
                   }else {
                      tE = this.E;
                      if (tE == null) {
                         a.S(str);
                      }
                      if (tE == DetailProfileFeedBidirectionalPageList$Orientation.NEXT) {
                         this.H = i;
                         this.b(uArrayList);
                         tE = this.F;
                         if (tE != null) {
                            tE.p5(uArrayList);
                         }
                      }
                   }
                }
             }
          }
       }else {
          Object[] objArray3 = new Object[0];
          b.C().w("GROOT", this.x+", onLoadItemFromResponse... is not current user ", objArray3);
          if (!PatchProxy.applyVoidOneRefs(p1, this, uDetailProfi, "14") && !this.getItems().contains(this.k2())) {
             Object[] objArray4 = new Object[0];
             b.C().w("GROOT", this.x+", response not contains current photo", objArray4);
             this.add(0, this.k2());
             if (this.K()) {
                tF = this.F;
                if (tF != null) {
                   tF.L4(p1);
                }
             }else {
                tF = this.F;
                if (tF != null) {
                   tF.p5(p1);
                }
             }
          }
       }
       return;
    }
    public final void r2(){
       if (PatchProxy.applyVoid(null, this, DetailProfileFeedBidirectionalPageList.class, "20")) {
          return;
       }
       if (this.H == null) {
          this.G = Log.getStackTraceString(new IllegalStateException("unknown update data source"));
          Object[] objArray = new Object[0];
          b.C().w("NasaSlideLogger", this.G, objArray);
       }
       this.H = false;
       return;
    }
    public final String s2(){
       String str = (this.z == null)? "3": null;
       return str;
    }
    public final String t2(){
       String str;
       int insertType;
       int i;
       int i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DetailProfileFeedBidirectionalPageList uDetailProfi = DetailProfileFeedBidirectionalPageList.class;
       Object[] objArray = null;
       QPhoto obj = PatchProxy.apply(objArray, this, uDetailProfi, "22");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.K()) {
          str = PatchProxy.apply(objArray, this, uDetailProfi, "23");
          if (str != patchProxyRe) {
          }else {
             JSONObject jSONObject = new JSONObject();
             obj = this.k2();
             a.o(obj, "photo");
             if (b.a(0x188c3889).h(obj.getAdvertisement())) {
                jSONObject.put("isSoftAd", true);
             }
             obj = this.k2();
             a.o(obj, "photo");
             if (b.a(0x188c3889).a(obj.getAdvertisement())) {
                QPhoto qPhoto = this.k2();
                a.o(qPhoto, "photo");
                a uoa = b.a(0x188c3889).d(qPhoto.getAdvertisement());
                qPhoto = this.k2();
                a.o(qPhoto, "photo");
                jSONObject.put("adPhotoId", qPhoto.getPhotoId());
                if (uoa != null) {
                   insertType = uoa.getInsertType();
                   if (insertType > 0) {
                      jSONObject.put("adInsertType", insertType);
                   }
                }
                str = jSONObject.toString();
             }else if(!jSONObject.length()){
                objArray = jSONObject.toString();
             }
             str = objArray;
          }
       }else {
          JSONObject obj1 = PatchProxy.apply(objArray, this, uDetailProfi, "24");
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else {
             obj1 = new JSONObject();
             Object obj2 = PatchProxy.apply(objArray, this, uDetailProfi, "25");
             if (obj2 != patchProxyRe) {
                i = obj2.intValue();
             }else {
                i = this.b.size();
                str = null;
                int i1 = 0;
                while (str < i) {
                   DetailProfileFeedBidirectionalPageList tE = this.E;
                   if (tE == null) {
                      a.S("orientation");
                   }
                   if (tE == DetailProfileFeedBidirectionalPageList$Orientation.PREV) {
                      i2 = str;
                   }else {
                      i2 = i - 1;
                      i2 = i2 - str;
                   }
                   QPhoto qPhoto1 = q.d(this.b, i2);
                   c uoc = b.a(0x188c3889);
                   PhotoAdvertisementInterface advertisemen = (qPhoto1 != null)? qPhoto1.getAdvertisement(): objArray;
                   if (uoc.a(advertisemen)) {
                      break ;
                   }else {
                      i1 = i1 + 1;
                      if (i1 == this.y) {
                         break ;
                      }
                   }
                   insertType = str + 1;
                }
                i = i1;
             }
             obj1.put("photoCountAfterLastAd", i);
             String str1 = obj1.toString();
             a.o(str1, "jsonObject.toString\(\)");
             str = str1;
          }
       }
       return str;
    }
    public final boolean u2(DetailProfileFeedBidirectionalPageList$Orientation p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = a.a[p0.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             b = a.a(this.D);
          }
       }else {
          b = a.a(this.C);
       }
       return b;
    }
    public final boolean v2(){
       Object obj = PatchProxy.apply(null, this, DetailProfileFeedBidirectionalPageList.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.u2(DetailProfileFeedBidirectionalPageList$Orientation.PREV);
    }
    public final void w2(DetailProfileFeedBidirectionalPageList$Orientation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "13")) {
          return;
       }
       this.E = p0;
       this.R1(this.u2(p0));
       this.load();
       return;
    }
    public final void x2(){
       if (PatchProxy.applyVoid(null, this, DetailProfileFeedBidirectionalPageList.class, "10")) {
          return;
       }
       this.w2(DetailProfileFeedBidirectionalPageList$Orientation.PREV);
       return;
    }
    public final void y2(e p0){
       this.F = p0;
    }
    public final void z2(ProfileFeedResponse p0){
       List items;
       DetailProfileFeedBidirectionalPageList obj;
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailProfileFeedBidirectionalPageList.class, "4")) {
          return;
       }
       if (this.A != null && p0.getItems() != null) {
          items = p0.getItems();
          a.o(items, "response.items");
          if (items.isEmpty() ^ 1) {
             obj = p0.getItems().get(0);
             a.o(obj, "response.items[0]");
             if (obj.isLiveStream()) {
                p0.getItems().remove(0);
                this.t = true;
             }
          }
       }
       items = p0.getItems();
       if (items != null && (items.isEmpty() ^ 1) == 1) {
          obj = this.B;
          if (obj != null) {
             List items1 = p0.getItems();
             a.o(items1, "response.items");
             obj.invoke(items1);
          }
       }
       return;
    }
}
