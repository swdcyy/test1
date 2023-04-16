package ho8.c;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import tx4.x;
import java.lang.CharSequence;
import android.text.TextUtils;
import iq8.d;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.graphics.Bitmap;
import iq8.b;
import brd.a0;
import ho8.b;
import java.util.concurrent.Callable;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import com.tachikoma.core.utility.f;
import java.lang.Throwable;
import zp8.a;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;

public class c	// class@0025c4
{

    public void c(){
       super();
    }
    public static Drawable a(Context p0,String p1,String p2,int p3,int p4,boolean p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),Boolean.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uoc, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1 = x.a(p1, "bundle://");
       if (TextUtils.isEmpty(p1)) {
          return null;
       }else if(!TextUtils.isEmpty(p2)){
          p1 = p2.concat(p1);
       }
       if (!d.a(p1)) {
          return null;
       }else {
          return new BitmapDrawable(p0.getResources(), b.b(p1, p3, p4, p5));
       }
    }
    public static Drawable b(Context p0,String p1,int p2,int p3,boolean p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uoc, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (d.a(p1)) {
          return null;
       }else {
          p1 = x.a(p1, "file://");
          if (!d.a(p1)) {
             return null;
          }else {
             return new BitmapDrawable(p0.getResources(), b.b(p1, p2, p3, p4));
          }
       }
    }
    public static a0 c(Context p0,String p1,String p2,int p3,int p4){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       b uob = new b(p0, p1, p2, p3, p4);
       return a0.y(obj).T(b.c()).G(a.c());
    }
    public static Drawable d(Context p0,String p1){
       Resources obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p1)) {
          return null;
       }
       obj = p0.getResources();
       Drawable drawable = obj.getDrawable(f.a(c.e(p1), "drawable", null));
       if (drawable != null) {
          return drawable;
       }
       BitmapDrawable uBitmapDrawa = new BitmapDrawable(obj, b.a(SplitAssetHelper.open(p0.getAssets(), x.a(p1, "asset://"))));
       if (uBitmapDrawa != null) {
          return uBitmapDrawa;
       }
       uBitmapDrawa = new BitmapDrawable(obj, b.a(obj.openRawResource(f.a(c.e(p1), "raw", null))));
       return uBitmapDrawa;
    }
    public static String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "8");
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
}
