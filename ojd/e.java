package ojd.e;
import java.lang.String;
import okhttp3.MediaType;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.RequestBody;
import okhttp3.MultipartBody$Part;
import ojd.f;
import ojd.a;
import java.io.File;
import ojd.b;
import com.kuaishou.webkit.MimeTypeMap;
import android.content.Context;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import ojd.h;
import java.lang.StringBuilder;
import java.lang.Integer;

public class e	// class@001f22
{
    public static final MediaType a;
    public static final MediaType b;

    static {
       e.a = MediaType.parse("text/plain");
       e.b = MediaType.parse("multipart/form-data");
    }
    public static Map a(Map p0){
       HashMap hashMap = new HashMap();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!TextUtils.isEmpty(uEntry.getValue())) {
             hashMap.put(uEntry.getKey(), RequestBody.create(e.a, uEntry.getValue()));
          }
       }
       return hashMap;
    }
    public static MultipartBody$Part b(String p0,byte[] p1,String p2){
       return e.c(p0, p1, p2, null);
    }
    public static MultipartBody$Part c(String p0,byte[] p1,String p2,f p3){
       a uoa = new a(null, p1, 0, (long)p1.length, e.b);
       return MultipartBody$Part.createFormData(p0, p2, p3);
    }
    public static MultipartBody$Part d(String p0,File p1){
       return e.f(p0, p1, null);
    }
    public static MultipartBody$Part e(String p0,File p1,int p2,long p3,f p4,MediaType p5){
       b uob = new b(p4, p1, (long)p2, p3, p5);
       return MultipartBody$Part.createFormData(p0, e.h(p1.getName()), v9);
    }
    public static MultipartBody$Part f(String p0,File p1,f p2){
       String mimeTypeFrom = MimeTypeMap.getSingleton().getMimeTypeFromExtension(e.i(p1.getName()));
       MediaType mediaType = (!TextUtils.isEmpty(mimeTypeFrom))? MediaType.parse(mimeTypeFrom): null;
       if (mediaType == null) {
          mediaType = e.b;
       }
       return e.e(p0, p1, 0, p1.length(), p2, mediaType);
    }
    public static MultipartBody$Part g(String p0,Context p1,Uri p2){
       String lastPathSegm;
       String str = "file";
       MediaType mediaType = null;
       if (str.equals(p2.getScheme())) {
          lastPathSegm = p2.getLastPathSegment();
          lastPathSegm = (!TextUtils.isEmpty(lastPathSegm))? MimeTypeMap.getSingleton().getMimeTypeFromExtension(e.i(lastPathSegm)): mediaType;
       }else {
          lastPathSegm = p1.getContentResolver().getType(p2);
       }
       if (lastPathSegm != null) {
          mediaType = MediaType.parse(lastPathSegm);
       }
       MediaType b = (mediaType == null)? e.b: mediaType;
       String str1 = "";
       if (str.equals(p2.getScheme())) {
          str1 = p2.getLastPathSegment();
       }else {
          String[] stringArray = new String[]{"_display_name"};
          Cursor uCursor = p1.getContentResolver().query(p2, stringArray, null, null, null);
          if (uCursor != null) {
             if (uCursor.moveToFirst()) {
                str1 = uCursor.getString(0);
             }
             uCursor.close();
          }
       }
       h oh = new h(null, p1, p2, b, 0);
       return MultipartBody$Part.createFormData(p0, e.h(str1), str);
    }
    public static String h(String p0){
       int i = (TextUtils.isEmpty(p0))? 0: p0.length();
       StringBuilder str = "";
       int i1 = 0;
       while (i1 < i) {
          char c = p0.charAt(i1);
          if (c <= 31 || c >= 127) {
             Object[] objArray = new Object[]{Integer.valueOf(c)};
             str = str+String.format("\\u%04x", objArray);
          }else {
             str = str+c;
          }
          i1 = i1 + 1;
       }
       return str;
    }
    public static String i(String p0){
       int i = p0.lastIndexOf(46);
       if (i >= 0) {
          return p0.substring((i + 1));
       }
       return "";
    }
}
