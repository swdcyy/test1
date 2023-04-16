package com.yxcorp.gifshow.photoad.g;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import vq4.c;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.Integer;
import g19.p;
import java.lang.StringBuilder;
import yx.j0;
import p49.c;
import p49.f;
import p49.e;
import mxb.c0;
import p49.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Map;
import qx.b;

public class g	// class@000f8d
{
    public static final Map a;

    static {
       g.a = new ConcurrentHashMap();
    }
    public void g(){
       super();
    }
    public static void a(QPhoto p0,c p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "2")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       if (photoAdverti == null || (photoAdverti.mAdTypeForGap != null && photoAdverti.mHasAdGapReported == null)) {
          int i = p2.indexOf(p0);
          if (i < 0) {
             return;
          }else {
             int i1 = 9999;
             if (!i) {
                g.b(photoAdverti, p1, i1, i1, i1);
                return;
             }else {
                QPhoto qPhoto = null;
                PhotoAdvertisement mAdTypeForGa = photoAdverti.mAdTypeForGap;
                int i2 = i - 1;
                int i3 = -1;
                int i4 = -1;
                while (true) {
                   if (i2 >= 0) {
                      QPhoto qPhoto1 = p2.get(i2);
                      if (qPhoto1.isAd()) {
                         PhotoAdvertisement mAdTypeForGa1 = k.B(qPhoto1).mAdTypeForGap;
                         if (mAdTypeForGa1 != null) {
                            if (i3 == -1) {
                               i3 = i2;
                               qPhoto = qPhoto1;
                               i4 = mAdTypeForGa1;
                            }
                            if (mAdTypeForGa == mAdTypeForGa1) {
                            label_005a :
                               int i5 = (i2 == -1)? 9999: (i - i2) - 1;
                               int i6 = (i3 == -1)? 9999: (i - i3) - 1;
                               if (i4 != -1) {
                                  i1 = i4;
                               }
                               g.b(photoAdverti, p1, i5, i6, i1);
                               if (qPhoto != null && !((i - i3) - 1)) {
                                  g.d(p0, i, qPhoto, i3);
                                  break ;
                               }
                            }
                         }
                      }
                      i2 = i2 - 1;
                   }else {
                      i2 = -1;
                      goto label_005a ;
                   }
                }
             }
          }
       }
       return;
    }
    public static void b(PhotoAdvertisement p0,c p1,int p2,int p3,int p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, og, "4")) {
             return;
          }
       }
       p1.k0 = p0.mAdTypeForGap;
       p1.i0 = p2;
       if (p.a() >= 0) {
          p1.t0 = p.a() + p2;
       }
       p1.j0 = p3;
       p0.mHasAdGapReported = true;
       p1.q0 = p4;
       Object[] objArray1 = new Object[0];
       j0.f("calcAdGap", "gapInSameType="+p2+",gapAll="+p3, objArray1);
       return;
    }
    public static boolean c(int p0){
       boolean b = (p0 != 82 && (p0 != 8 && (p0 != 9 && (p0 == 16 || p0 == 90))))? true: false;
       return b;
    }
    public static void d(QPhoto p0,int p1,QPhoto p2,int p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), null, g.class, "3")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(p0);
       PhotoAdvertisement photoAdverti1 = k.B(p2);
       if (photoAdverti != null && photoAdverti1 != null) {
          c0 uoc0 = new c0(photoAdverti, p1, p0, p3, photoAdverti1, p2);
          e.a(c.n).g(v8);
       }
       return;
    }
    public static void e(int p0,c p1,BaseFeed p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, g.class, "1")) {
          return;
       }
       if (p0 != 10 && (p0 != 1 && (p0 == 60 || p0 == 68))) {
          b uob = g.a.remove(p2.getId());
          if (uob != null) {
             uob.a(p2, p1);
          }
       }
       return;
    }
}
