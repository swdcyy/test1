package com.tachikoma.core.utility.e;
import io.reactivex.i;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import brd.c0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import iq8.u;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.utility.b;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import iq8.b;
import iq8.d;
import tx4.x;
import java.lang.Throwable;
import zp8.a;

public final class e implements i	// class@000dd9
{
    public final String a;
    public final Context b;
    public final String c;
    public final int d;
    public final int e;

    public void e(String p0,Context p1,String p2,int p3,int p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(c0 p0){
       e e;
       String obj4;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, e.class, "1")) {
          return;
       }
       Bitmap uBitmap = u.b().a(obj.a);
       if (uBitmap != null && !uBitmap.isRecycled()) {
          obj1.onSuccess(uBitmap);
          return;
       }else {
          e b = obj.b;
          e a = obj.a;
          e c = obj.c;
          e d = obj.d;
          e = obj.e;
          b uob = b.class;
          int i = 0;
          String obj2 = null;
          int i1 = 2;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[]{b,a,c,Integer.valueOf(d),Integer.valueOf(e)};
             String obj3 = PatchProxy.apply(objArray, obj2, uob, "12");
             if (obj3 != PatchProxyResult.class) {
                obj2 = obj3;
             }else if(TextUtils.isEmpty(a)){
                int i2 = a.indexOf(58);
                if (i2 == -1) {
                   obj2 = b.a(a, c, d, e);
                }else {
                   obj3 = a.substring(i, i2)+"://";
                   int i3 = obj3.hashCode();
                   obj2 = "file://";
                   if (i3 != -855037794) {
                      if (i3 != -373240150) {
                         if (i3 == 0x5604d7b0 && obj3.equals("data://")) {
                            i = 2;
                         }else {
                         label_00bf :
                            i = -1;
                         }
                      }else if(obj3.equals("asset://")){
                         i = 0;
                      }else {
                         goto label_00bf ;
                      }
                   }else if(obj3.equals(obj2)){
                      i = 1;
                   }else {
                      goto label_00bf ;
                   }
                   if (i) {
                      if (i != 1) {
                         if (i != i1) {
                            obj2 = b.a(a, c, d, e);
                         }else {
                            obj2 = b.c(a);
                         }
                      }else if(PatchProxy.isSupport(uob)){
                         obj4 = PatchProxy.applyThreeRefs(a, Integer.valueOf(d), Integer.valueOf(e), null, b.class, "16");
                         if (obj4 != PatchProxyResult.class) {
                            obj2 = obj4;
                         }
                      }
                      if (!d.a(a)) {
                         obj4 = x.a(a, obj2);
                         if (d.a(obj4)) {
                            obj2 = b.b(obj4, d, e, 1);
                         }
                      }
                      obj2 = null;
                   }else {
                      obj2 = b.d(b, a);
                   }
                }
             }
          }else {
             goto label_0061 ;
          }
          if (obj2 == null) {
             obj1.onError(new Throwable("getPresetBitmapInner is null, uri is "+b.c(obj.a)));
          }else if(!obj2.isRecycled()){
             u.b().c(obj.a, obj2);
             obj1.onSuccess(obj2);
          }else {
             obj1.onError(new Throwable("bitmap is recycled"));
          }
          return;
       }
    }
}
