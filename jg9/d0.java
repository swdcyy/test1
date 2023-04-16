package jg9.d0;
import erd.o;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import kotlin.Pair;
import qrd.r0;
import jg9.b0;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$d;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import kaa.v;
import wba.i;
import java.lang.Integer;
import com.kuaishou.edit.draft.Beauty;
import qr4.k$b;
import w0c.r;
import qr4.k$c;
import lnc.m8;
import com.yxcorp.gifshow.camera.record.base.d;
import je9.e;
import je9.e$a;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.Map;
import com.yxcorp.gifshow.model.CustomMagicInfo;
import jg9.c0;
import ekd.q$b;
import lnc.p7;
import java.util.Objects;
import qr4.i;
import qr4.m$l;
import qr4.m$k0;
import com.kwai.gifshow.post.api.core.camerasdk.model.ExifInfo;

public final class d0 implements o	// class@002a8e
{
    public final MultiTakePictureController b;

    public void d0(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj2;
       int i;
       Iterator obj3;
       int b;
       Iterator iterator;
       ArrayList uArrayList10;
       Iterator iterator1;
       int b1;
       boolean[] uobooleanArr1;
       ArrayList uArrayList11;
       ArrayList uArrayList12;
       BeautifyConfig uBeautifyCon1;
       Beauty uBeauty;
       d0 uod01;
       m$l[] obj6;
       d0 uod02;
       Object obj = this;
       Iterator obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       VideoContext videoContext = PatchProxy.applyOneRefs(obj1, obj, d0.class, str);
       if (videoContext != patchProxyRe) {
       }else {
          a.p(obj1, "asyncData");
          videoContext = new VideoContext();
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          ArrayList uArrayList2 = new ArrayList();
          ArrayList uArrayList3 = new ArrayList();
          ArrayList uArrayList4 = new ArrayList();
          ArrayList uArrayList5 = new ArrayList();
          ArrayList uArrayList6 = new ArrayList();
          ArrayList uArrayList7 = new ArrayList();
          MultiTakePictureController x = obj.b.x;
          if (x != null) {
             CopyOnWriteArrayList uCopyOnWrite = x.K0();
             if (uCopyOnWrite != null) {
                if (uCopyOnWrite.size() == obj.b.G.size()) {
                   obj2 = obj1;
                   ArrayList uArrayList8 = new ArrayList(u.Y(uCopyOnWrite, 10));
                   obj1 = uCopyOnWrite.iterator();
                   i = 0;
                   while (obj1.hasNext()) {
                      obj3 = obj1.next();
                      int i1 = i + 1;
                      if (i < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      uArrayList8.add(r0.a(obj3, obj.b.G.get(i)));
                      obj1 = obj1;
                      i = i1;
                      b = 10;
                   }
                   ArrayList uArrayList9 = new ArrayList();
                   iterator = uArrayList8.iterator();
                   while (iterator.hasNext()) {
                      Object obj4 = iterator.next();
                      obj3 = iterator;
                      iterator = (obj4.getFirst().b() > -1)? 1: null;
                      if (iterator) {
                         uArrayList9.add(obj4);
                      }
                      iterator = obj3;
                   }
                   List list = CollectionsKt___CollectionsKt.f5(uArrayList9, new b0());
                   uArrayList10 = new ArrayList(u.Y(list, 10));
                   obj1 = list.iterator();
                   while (obj1.hasNext()) {
                      uArrayList10.add(obj1.next().getSecond());
                   }
                }else {
                   obj2 = obj1;
                   uArrayList10 = obj.b.G;
                }
                if (uArrayList10 != null) {
                label_0110 :
                   boolean[] uobooleanArr = new boolean[uArrayList10.size()];
                   iterator = uArrayList10.iterator();
                   int i2 = 0;
                   int i3 = 1;
                   VideoContext videoContext1 = videoContext;
                   while (iterator.hasNext()) {
                      MultiTakePictureController$d uod = iterator.next();
                      if (uod.c() != null && uod.d() != null) {
                         iterator1 = iterator;
                         if (a.g(uod.d(), Boolean.TRUE)) {
                            b1 = true;
                         label_014a :
                            uobooleanArr[i2] = b1;
                            i2 = i2 + 1;
                            uArrayList.add(uod.c());
                            MagicEmoji$MagicFace magicFace = uod.c();
                            SimpleMagicFace mId = (magicFace != null)? magicFace.mId: null;
                            uArrayList2.add(mId);
                            uArrayList1.add(uod.b);
                            if (uod.a() == null) {
                               uArrayList3.add(null);
                               uobooleanArr1 = uobooleanArr;
                               uArrayList11 = uArrayList;
                               uArrayList12 = uArrayList1;
                            }else {
                               BeautifyConfig uBeautifyCon = uod.a();
                               b1 = v.a(uod.a().mId);
                               uArrayList12 = uArrayList1;
                               i oi = i.class;
                               if (PatchProxy.isSupport(oi)) {
                                  uArrayList11 = uArrayList;
                                  uobooleanArr1 = uobooleanArr;
                                  uBeautifyCon1 = null;
                                  uBeauty = PatchProxy.applyTwoRefs(uBeautifyCon, Integer.valueOf(b1), uBeautifyCon1, oi, str);
                                  if (uBeauty != patchProxyRe) {
                                  label_01ae :
                                     int i4 = uArrayList3.size() + 1;
                                     uArrayList3.add(i.b(uBeauty, i4));
                                  }
                               }else {
                                  uobooleanArr1 = uobooleanArr;
                                  uArrayList11 = uArrayList;
                                  uBeautifyCon1 = null;
                               }
                               uBeauty = i.c(uBeautifyCon, b1, uBeautifyCon1);
                               goto label_01ae ;
                            }
                            uArrayList4.add(uod.d);
                            k$c uoc = uod.b().a();
                            if (uoc != null) {
                               uoc.a = i2;
                            }
                            i3 = (i3 && uod.b().b != null)? 1: 0;
                            uArrayList5.add(uod.b().a());
                            uArrayList6.add(uod.f);
                            uArrayList7.add(uod.h);
                            videoContext = videoContext1;
                            iterator = iterator1;
                            uArrayList1 = uArrayList12;
                            uArrayList = uArrayList11;
                            uobooleanArr = uobooleanArr1;
                         }
                      }else {
                         iterator1 = iterator;
                      }
                      b1 = false;
                      goto label_014a ;
                   }
                   uobooleanArr1 = uobooleanArr;
                   uArrayList11 = uArrayList;
                   uArrayList12 = uArrayList1;
                   d0 uod0 = null;
                   MultiTakePictureController h = obj.b.H;
                   if (h != null) {
                      a.p(uArrayList2, "magicFaces");
                      h.x = uArrayList2;
                   }
                   h = obj.b.H;
                   if (h != null) {
                      boolean[] uobooleanArr2 = uobooleanArr1;
                      a.p(uobooleanArr2, "pEffectValidates");
                      h.y = uobooleanArr2;
                   }
                   CustomMagicInfo obj5 = obj.b.d.d(e.c.a());
                   a.o(obj5, "mCallerContext.getData\(C¡­omMagicData.defaultValue\)");
                   Iterator iterator2 = uArrayList2.iterator();
                   while (true) {
                      if (iterator2.hasNext()) {
                         uod01 = iterator2.next();
                         uArrayList = (uod01 != null)? 1: null;
                         if (!uArrayList) {
                            continue ;
                         }
                      }else {
                         uod01 = uod0;
                      }
                      obj5 = obj5.a().get(uod01);
                      MultiTakePictureController h1 = obj.b.H;
                      if (h1 != null) {
                         h1.z = obj5;
                      }
                      Iterator iterator3 = uArrayList11.iterator();
                      while (true) {
                         if (iterator3.hasNext()) {
                            obj6 = iterator3.next();
                            VideoContext videoContext2 = (obj6 != null)? 1: null;
                            if (videoContext2) {
                               uod02 = obj6;
                            }else {
                               continue ;
                            }
                         }else {
                            uod02 = uod0;
                         }
                         if (uod02 != null) {
                            MultiTakePictureController h2 = obj.b.H;
                            if (h2 != null) {
                               h2.A = uod02.mChildId;
                            }
                         }
                         videoContext1.n1(uArrayList11, null, c0.a, uArrayList12, false);
                         obj6 = obj2;
                         VideoContext videoContext3 = videoContext1;
                         p7.b(videoContext3, obj.b.d.c(BeautifyConfig.class), obj6.a, uArrayList3);
                         videoContext3.q1(uArrayList4);
                         k$c[] uocArray = new k$c[0];
                         Object[] objArray = uArrayList5.toArray(uocArray);
                         Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
                         videoContext3.u0(objArray, (i3 ^ 0x01));
                         videoContext3.J1(uArrayList6);
                         videoContext3.F1(uArrayList7);
                         MultiTakePictureController$e b2 = obj6.b;
                         if (PatchProxy.applyOneRefs(b2, videoContext3, VideoContext.class, "152") != patchProxyRe) {
                         }else {
                            VideoContext.b();
                            videoContext3.e0();
                            obj6 = new m$l[b2.size()];
                            videoContext3.a.b.Q0 = obj6;
                            for (b = 0; b < videoContext3.a.b.Q0.length; b = b + 1) {
                               videoContext3.a.b.Q0[b] = b2.get(b).toPhotoMeta();
                            }
                         }
                         videoContext = videoContext3;
                         break ;
                      }
                   }
                }else {
                label_010c :
                   uArrayList10 = obj.b.G;
                   goto label_0110 ;
                }
             }
          }
          obj2 = obj1;
          goto label_010c ;
       }
       return videoContext;
    }
}
