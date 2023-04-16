package com.ta.utdid2.b.a.d;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.io.File;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.ta.utdid2.b.a.b;
import com.ta.utdid2.b.a.d$a;
import java.io.FileInputStream;
import java.io.InputStream;
import com.ta.utdid2.b.a.e;
import java.util.Map;
import java.lang.IllegalArgumentException;

public class d	// class@000ccf
{
    public File a;
    public final Object a;
    public HashMap a;
    public static final Object b;

    static {
       d.b = new Object();
    }
    public void d(String p0){
       super();
       this.a = new Object();
       this.a = new HashMap();
       if (p0 == null || p0.length() <= 0) {
          throw new RuntimeException("Directory can not be empty");
       }
       this.a = new File(p0);
       return;
    }
    public static File a(File p0){
       return new File(p0.getPath()+".bak");
    }
    public static Object a(){
       return d.b;
    }
    public static File b(File p0){
       return d.a(p0);
    }
    public b a(String p0,int p1){
       int i;
       FileInputStream uFileInputSt;
       byte[] uobyteArray;
       File uFile = this.b(p0);
       File b = d.b;
       _monitor_enter(b);
       d$a uoa = this.a.get(uFile);
       if (uoa != null && !uoa.d()) {
          _monitor_exit(b);
          return uoa;
       }else {
          _monitor_exit(b);
          b = d.a(uFile);
          if (b.exists()) {
             uFile.delete();
             b.renameTo(uFile);
          }
          HashMap hashMap = null;
          if (uFile.exists() && uFile.canRead()) {
             try{
                try{
                   FileInputStream uFileInputSt2 = new FileInputStream(uFile);
                   hashMap = e.a(uFileInputSt2);
                   uFileInputSt2.close();
                   uFileInputSt2.close();
                }catch(org.xmlpull.v1.XmlPullParserException e0){
                   i = hashMap;
                }catch(java.lang.Exception e0){
                   FileInputStream uFileInputSt1 = e0;
                   i = hashMap;
                }
                if (hashMap) {
                   hashMap.close();
                }
             label_005c :
                hashMap = e0;
             }catch(org.xmlpull.v1.XmlPullParserException e0){
                i = hashMap;
             }catch(java.lang.Exception e0){
                i = hashMap;
                goto label_0057 ;
             }
          }
       label_0093 :
          Object b1 = d.b;
          _monitor_enter(b1);
          if (uoa != null) {
             uoa.a(hashMap);
          }else {
             uoa = this.a.get(uFile);
             if (uoa == null) {
                uoa = new d$a(uFile, p1, hashMap);
                this.a.put(uFile, uoa);
             }
          }
          _monitor_exit(b1);
          return uoa;
       }
    }
    public final File a(){
       d ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return this.a;
    }
    public final File a(File p0,String p1){
       if (p1.indexOf(File.separatorChar) < 0) {
          return new File(p0, p1);
       }
       throw new IllegalArgumentException("File "+p1+" contains a path separator");
    }
    public final File b(String p0){
       return this.a(this.a(), p0+".xml");
    }
}
