package f19.e;
import xe5.p;
import xe5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import xe5.r;
import f19.h;
import java.util.Objects;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import yx.j0;
import mxb.c;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo;
import f19.i;
import nsd.u;
import android.view.View;

public final class e extends p	// class@002285
{

    public void e(){
       super();
    }
    public boolean a(b p0){
       int b1;
       r h;
       r c;
       float f1;
       int i2;
       c a;
       PhotoAdvertisement$VideoClipInfo mClipType;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, uoe, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       a.p(obj1, "textureViewSizeAdapterParam");
       obj2 = "2";
       i obj3 = PatchProxy.applyOneRefs(obj1, obj, uoe, obj2);
       float f = 0x3f800000;
       boolean b = false;
       if (obj3 != patchProxyRe) {
          b1 = obj3.booleanValue();
       }else if(!obj1 instanceof r){
          r obj4 = obj1;
          r f2 = obj4.F;
          if (f2 == null || !(a.g(f2, obj) ^ true)) {
             h b4 = h.b;
             Objects.requireNonNull(b4);
             if (!PatchProxy.applyVoidOneRefs(obj4, b4, h.class, obj2)) {
                a.p(obj4, "param");
                if (SystemUtil.I()) {
                   c = obj4.c;
                   float f3 = (c == null)? 0: ((float)obj4.b * f) / (float)c;
                   String str = ", ";
                   Object[] objArray2 = new Object[b];
                   j0.a("AdTextureViewSizeAdapt", "photo width -> "+obj4.b+str+"photo height -> "+obj4.c+str+"photo width/height -> "+f3+str+"rootWidth -> "+obj4.h+str+"rootHeight -> "+obj4.i+str+"topBarHeight -> "+obj4.m+str+"bottomBarHeight-> "+obj4.n+','+"statusBarHeight -> "+n.A(a.B), objArray2);
                }
             }
             a = c.a;
             obj4 = obj4.a;
             a.o(obj4, "adapterParam.mPhoto");
             Objects.requireNonNull(a);
             Object obj5 = PatchProxy.applyOneRefs(obj4, a, c.class, "57");
             if (obj5 != patchProxyRe) {
                b1 = obj5.intValue();
             }else {
                a.p(obj4, "photo");
                PhotoAdvertisement photoAdverti = k.B(obj4);
                if (photoAdverti != null) {
                   PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                   if (adData != null) {
                      adData = adData.mVideoClipInfo;
                      if (adData != null) {
                         mClipType = adData.mClipType;
                      }
                   }
                }
                mClipType = null;
             }
             if (b1 == true) {
                b1 = true;
             }
          }
       }
       b1 = false;
       if (!b1) {
          return b;
       }else {
          Object[] objArray = new Object[b];
          j0.a("AdTextureViewSizeAdapt", "ad adapt with AdFullScreenSizeAdapter", objArray);
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoe, "3")) {
             h = obj1.h;
             h b2 = h.b;
             int i = b2.a(obj1);
             r b3 = obj1.b;
             if (b3 != null) {
                c = obj1.c;
                if (c != null) {
                   f1 = ((float)b3 * f) / (float)c;
                label_0152 :
                   v4 = f1 - (float)b;
                   int i1 = (c > 0)? (int)((float)i * f1): h;
                   if (i1 < h) {
                      i2 = (c > 0)? (int)((float)h / f1): i;
                      i1 = h;
                   }else {
                      i2 = i;
                   }
                   i oi = new i(h, i, 48, 0, 8, null);
                   int i3 = i1;
                   i oi1 = new i(i3, i2, 17, 0, 8, null);
                   oi1 = v15;
                   obj3 = v15;
                   oi1 = new i(i3, i2, 17, 0, 8, 0);
                   if (SystemUtil.I()) {
                      Object[] objArray1 = new Object[b];
                      j0.a("AdTextureViewSizeAdapt", "frame layoutParam is "+c+" \n "+"video layoutParam is "+f+10+"poster layoutParam is "+obj3, objArray1);
                   }
                   b2.b(obj1.e, c);
                   b2.b(obj1.f, f);
                   b2.b(obj1.u, obj3);
                   obj1.F = obj;
                }
             }
             f1 = 0xbf800000;
             goto label_0152 ;
          }
          return true;
       }
    }
    public String b(){
       return "AdFullScreenSizeAdapter";
    }
}
