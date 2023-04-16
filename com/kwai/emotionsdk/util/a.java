package com.kwai.emotionsdk.util.a;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.lang.IllegalStateException;

public class a	// class@000db8
{

    public void a(){
       super();
    }
    public static void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "10")) {
          return;
       }
       if (!p0.exists()) {
          return;
       }
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          return;
       }
       int len = uFileArray.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = uFileArray[i];
          if (oobject.isDirectory()) {
             a.a(oobject);
          }
          oobject.delete();
       }
       return;
    }
    public static File b(File p0,String p1){
       File obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0, p1);
       if (obj.exists()) {
          a.a(obj);
          obj.delete();
       }
       return obj;
    }
    public static Charset c(){
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Charset.forName("8859_1");
       }catch(java.lang.Exception e0){
          return Charset.defaultCharset();
       }
    }
    public static File d(String p0,String p1,Charset p2){
       File obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "6");
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
          obj = new File(obj, a.f(stringArray[i], p2));
       }
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return new File(obj, a.f(stringArray[(stringArray.length - 1)], p2));
    }
    public static String e(ZipEntry p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String name = p0.getName();
       if (!name.contains("../")) {
          return name;
       }
       throw new IllegalStateException("file name can\'t contains ../");
    }
    public static String f(String p0,Charset p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && p1.equals(a.c())) {
          return new String(p0.getBytes("8859_1"), "GB2312");
       }
       return p0;
    }
}
