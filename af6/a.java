package af6.a;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qkd.b;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.zip.ZipFile;
import java.util.Enumeration;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.Log;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import ekd.p;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.Throwable;

public class a	// class@000098
{

    public void a(){
       super();
    }
    public static File a(File p0,String p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0, p1);
       if (obj.exists()) {
          b.m(obj);
          obj.delete();
       }
       return obj;
    }
    public static Charset b(){
       Object obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Charset.forName("8859_1");
       }catch(java.lang.Exception e0){
          return Charset.defaultCharset();
       }
    }
    public static File c(String p0,String p1,Charset p2){
       File obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = p1.split("/");
       obj = new File(p0);
       if (stringArray.length < 1) {
          return obj;
       }
       int i = 0;
       int i1 = stringArray.length - 1;
       while (i < i1) {
          i++;
          obj = new File(obj, a.e(stringArray[i], p2));
       }
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return new File(obj, a.e(stringArray[(stringArray.length - 1)], p2));
    }
    public static String d(ZipEntry p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = p0.getName();
       if (!name.contains("../")) {
          return name;
       }
       throw new IllegalStateException("file name can\'t contains ../");
    }
    public static String e(String p0,Charset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && p1.equals(a.b())) {
          return new String(p0.getBytes("8859_1"), "GB2312");
       }
       return p0;
    }
    public static void f(File p0,String p1,boolean p2){
       String str;
       File uFile;
       ZipFile zipFile;
       Enumeration uEnumeration;
       int i2;
       byte[] uobyteArray;
       ZipEntry zipEntry;
       String str1;
       BufferedOutputStream uBufferedOut;
       BufferedInputStream uBufferedInp;
       int i3;
       File[] uFileArray;
       int len;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, a.class, "1")) {
          return;
       }
       Charset uCharset = a.b();
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidFourRefs(p0, p1, uCharset, Boolean.valueOf(p2), null, a.class, "2")) {
          int i = 0;
          object oobject = null;
          int i1 = 1;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[]{p0,p1,oobject,uCharset,Boolean.valueOf(p2)};
             if (!PatchProxy.applyVoid(objArray, oobject, uoa, "3")) {
             }
          }else {
          }
       }
    }
}
