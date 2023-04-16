package com.yxcorp.gifshow.map.MapLogger$a;
import java.lang.Runnable;
import java.util.List;
import java.lang.Double;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import fi5.s;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;
import com.yxcorp.gifshow.map.MapLogger;
import java.util.Objects;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public final class MapLogger$a implements Runnable	// class@001c61
{
    public final List b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;

    public void MapLogger$a(List p0,Double p1,Double p2,Double p3,Double p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapLogger$a.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          s a = s.a;
          CommonMeta commonMeta = (qPhoto != null)? qPhoto.getCommonMeta(): objArray;
          NearbyMapFeed nearbyMapFee = a.f(commonMeta);
          if (nearbyMapFee != null) {
             if (nearbyMapFee.latitude - this.c.doubleValue() >= 0 && nearbyMapFee.latitude - this.d.doubleValue() <= 0) {
                if (this.e.doubleValue() - this.f.doubleValue() < 0) {
                   if (nearbyMapFee.longitude - this.e.doubleValue() >= 0 && nearbyMapFee.longitude - this.f.doubleValue() <= 0) {
                   }
                }else {
                   NearbyMapFeed longitude = nearbyMapFee.longitude;
                   double d = (double)i;
                   if (longitude - d <= 0 || longitude - this.e.doubleValue() >= 0) {
                      nearbyMapFee = nearbyMapFee.longitude;
                      if (nearbyMapFee - d >= 0 || nearbyMapFee - this.f.doubleValue() <= 0) {
                      }
                   }
                }
             }
             i1 = i1 + 1;
          }
       }
       MapLogger a1 = MapLogger.a;
       int i2 = this.b.size();
       Objects.requireNonNull(a1);
       MapLogger mapLogger = MapLogger.class;
       if (!PatchProxy.isSupport(mapLogger) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i2), Integer.valueOf(i1), a1, mapLogger, "21")) {
          i3 oi3 = i3.f();
          oi3.c("count", Integer.valueOf(i2));
          oi3.c("outBoundsCount", Integer.valueOf(i1));
          u1.R("KSLocalPhotoMapFeedOutBounds", oi3.e(), 15);
       }
       return;
    }
}
