package hp8.j;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tachikoma.core.utility.f;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Throwable;
import zp8.a;
import android.content.res.Resources;
import iq8.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

public class j	// class@0025d1
{

    public void j(){
       super();
    }
    public static Drawable a(Context p0,String p1){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, oj, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (p0 == null || TextUtils.isEmpty(p1)) {
          return null;
       }
       String str = PatchProxy.applyOneRefs(p1, null, oj, "1");
       if (str != patchProxyRe) {
       }else {
          str = j.d(p1, "asset://");
          if (str != null && str.length() > 0) {
             i = str.lastIndexOf(".");
             if (-1 != i) {
                str = str.substring(0, i);
             }
          }
       }
       i = f.a(str, "drawable", null);
       if (!i) {
          a.g("getAssetDrawable", new Exception(p1+" not exist"));
          return null;
       }else {
          return p0.getResources().getDrawable(i);
       }
    }
    public static Drawable b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0) || TextUtils.isEmpty(p1)) {
          return null;
       }
       p1 = p1.concat(j.d(p0, "bundle://"));
       if (!d.a(p1)) {
          a.g("getFileDrawable", new Exception(p0+" not exist"));
          return null;
       }else {
          Bitmap uBitmap = BitmapFactory.decodeFile(p1);
          if (uBitmap == null) {
             return null;
          }
          return new BitmapDrawable(uBitmap);
       }
    }
    public static Drawable c(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = j.d(p0, "file://");
       if (!d.a(obj)) {
          a.g("getFileDrawable", new Exception(p0+" not exist"));
          return null;
       }else {
          Bitmap uBitmap = BitmapFactory.decodeFile(obj);
          if (uBitmap == null) {
             return null;
          }
          return new BitmapDrawable(uBitmap);
       }
    }
    public static String d(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length() > 0) {
          if (!p0.startsWith(p1)) {
             return p0;
          }else {
             p0 = p0.substring(p1.length());
          }
       }
       return p0;
    }
}
