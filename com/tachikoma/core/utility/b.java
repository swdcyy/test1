package com.tachikoma.core.utility.b;
import java.lang.Object;
import java.lang.String;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import tx4.x;
import java.lang.CharSequence;
import android.text.TextUtils;
import iq8.d;
import iq8.b;
import com.yxcorp.image.callercontext.a;
import zp8.a;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.SubSolution;
import android.content.Context;
import android.content.res.Resources;
import com.tachikoma.core.utility.f;
import android.graphics.drawable.Drawable;
import java.lang.Throwable;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Boolean;
import no8.e;
import oo8.s;
import java.lang.StringBuilder;
import brd.a0;
import com.tachikoma.core.utility.e;
import io.reactivex.i;
import brd.z;
import lrd.b;
import iq8.k;
import erd.o;
import iq8.f;
import erd.g;
import com.tachikoma.core.utility.d;
import com.tachikoma.core.utility.b$a;
import iq8.j;
import iq8.e;

public class b	// class@000dd5
{
    public static Boolean a;

    public void b(){
       super();
    }
    public static Bitmap a(String p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, b.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = x.a(p0, "bundle://");
       if (TextUtils.isEmpty(p0)) {
          return null;
       }else if(!TextUtils.isEmpty(p1)){
          p0 = p1.concat(p0);
       }
       if (!d.a(p0)) {
          return null;
       }else {
          return b.b(p0, p2, p3, true);
       }
    }
    public static a b(String p0){
       a$a obj = PatchProxy.applyOneRefs(p0, null, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          a.i("ImageLoadModule", "bundleId is null");
          p0 = "";
       }
       obj = a.d();
       obj.b(":ks-components:kwai-tach");
       obj.c(p0);
       obj.e(SubSolution.TK);
       return obj.a();
    }
    public static String c(String p0){
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public static Bitmap d(Context p0,String p1){
       Resources obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p1)) {
          return null;
       }
       obj = p0.getResources();
       Drawable drawable = obj.getDrawable(f.a(b.e(p1), "drawable", null));
       if (drawable instanceof BitmapDrawable) {
          return drawable.getBitmap();
       }
       Bitmap uBitmap = b.a(SplitAssetHelper.open(p0.getAssets(), x.a(p1, "asset://")));
       if (uBitmap != null) {
          return uBitmap;
       }
       uBitmap = b.a(obj.openRawResource(f.a(b.e(p1), "raw", null)));
       return uBitmap;
    }
    public static String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = x.a(p0, "asset://");
       if (p0 != null && p0.length() > 0) {
          int i = p0.lastIndexOf(".");
          if (-1 == i) {
             return p0;
          }else {
             p0 = p0.substring(0, i);
          }
       }
       return p0;
    }
    public static boolean f(){
       boolean b;
       Boolean obj = PatchProxy.apply(null, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (b.a == null && e.b().d() != null) {
          b.a = Boolean.valueOf(e.b().d().d("isLoadBitmapByCopy", b));
          a.i("ImageLoadModule", "get kswitch isLoadBitmapByCopy "+b.a);
       }
       obj = b.a;
       if (obj != null && obj.booleanValue()) {
          b = true;
       }
       return b;
    }
    public static a0 g(Context p0,String p1,String p2,String p3,int p4,int p5){
       Object[] objArray;
       a0 uoa0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       b uob = b.class;
       Object obj = null;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       if (PatchProxy.isSupport(uob)) {
          objArray = new Object[]{p0,oobject,oobject1,oobject2,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj1 = PatchProxy.apply(objArray, obj, uob, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (TextUtils.isEmpty(p1)) {
          return a0.s(new Throwable("uri is empty"));
       }else if(p1.startsWith("http://") || p1.startsWith("https://")){
          if (PatchProxy.isSupport(uob)) {
             uoa0 = PatchProxy.applyFourRefs(p1, Integer.valueOf(p4), Integer.valueOf(p5), p3, null, b.class, "8");
             if (uoa0 != PatchProxyResult.class) {
             label_00e1 :
                return uoa0.u(new b$a(oobject1)).C(new j(p1)).p(new e(p1));
             }
          }
          uoa0 = a0.k(new d(p1, p4, p5, oobject2)).T(b.a());
          goto label_00e1 ;
       }else if(PatchProxy.isSupport(uob)){
          objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = oobject;
          objArray[i3] = oobject2;
          objArray[i2] = Integer.valueOf(p4);
          objArray[i1] = Integer.valueOf(p5);
          uoa0 = PatchProxy.apply(objArray, obj, uob, "11");
          if (uoa0 != PatchProxyResult.class) {
          label_009a :
             return uoa0.C(new k(p1)).p(new f(p1));
          }
       }
       e uoe = new e(p1, p0, p3, p4, p5);
       uoa0 = a0.k(i3).T(b.c());
       goto label_009a ;
    }
}
