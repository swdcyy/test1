package ws8.p5;
import java.util.Locale;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.text.DateFormat;
import java.lang.StringBuilder;
import ws8.x5;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import ws8.n5;
import java.util.List;
import com.xiaomi.push.f;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;
import java.lang.Class;
import java.util.Set;
import java.util.HashSet;
import ws8.q5;
import ws8.m0;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.Exception;

public abstract class p5	// class@003e48
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List g;
    public final Map h;
    public f i;
    public static final String j;
    public static String k;
    public static final DateFormat l;
    public static String m;
    public static long n;

    static {
       p5.j = (Locale.getDefault().getLanguage()).toLowerCase();
       p5.k = null;
       SimpleDateFormat simpleDateFo = new SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'");
       p5.l = simpleDateFo;
       simpleDateFo.setTimeZone(TimeZone.getTimeZone("UTC"));
       p5.m = x5.a(5)+"-";
       p5.n = 0;
    }
    public void p5(){
       super();
       this.a = p5.k;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = new CopyOnWriteArrayList();
       this.h = new HashMap();
       this.i = null;
    }
    public void p5(Bundle p0){
       super();
       this.a = p5.k;
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = new CopyOnWriteArrayList();
       this.h = new HashMap();
       this.i = null;
       this.c = p0.getString("ext_to");
       this.d = p0.getString("ext_from");
       this.e = p0.getString("ext_chid");
       this.b = p0.getString("ext_pkt_id");
       Parcelable[] parcelableAr = p0.getParcelableArray("ext_exts");
       if (parcelableAr != null) {
          this.g = new ArrayList(parcelableAr.length);
          int len = parcelableAr.length;
          for (int i = 0; i < len; i = i + 1) {
             this.g.add(n5.e(parcelableAr[i]));
          }
       }
       p0 = p0.getBundle("ext_ERROR");
       if (p0 != null) {
          this.i = new f(p0);
       }
       return;
    }
    public static synchronized String k(){
       _monitor_enter(p5.class);
       long n = p5.n;
       p5.n = 1 + n;
       _monitor_exit(p5.class);
       return p5.m+Long.toString(n);
    }
    public Bundle a(){
       Bundle uBundle = new Bundle();
       if (!TextUtils.isEmpty(this.a)) {
          uBundle.putString("ext_ns", this.a);
       }
       if (!TextUtils.isEmpty(this.d)) {
          uBundle.putString("ext_from", this.d);
       }
       if (!TextUtils.isEmpty(this.c)) {
          uBundle.putString("ext_to", this.c);
       }
       if (!TextUtils.isEmpty(this.b)) {
          uBundle.putString("ext_pkt_id", this.b);
       }
       if (!TextUtils.isEmpty(this.e)) {
          uBundle.putString("ext_chid", this.e);
       }
       p5 ti = this.i;
       if (ti != null) {
          uBundle.putBundle("ext_ERROR", ti.a());
       }
       ti = this.g;
       if (ti != null) {
          Bundle[] uBundleArray = new Bundle[ti.size()];
          int i = 0;
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             int i1 = i + 1;
             uBundleArray[i] = iterator.next().a();
             i = i1;
          }
          uBundle.putParcelableArray("ext_exts", uBundleArray);
       }
       return uBundle;
    }
    public f b(){
       return this.i;
    }
    public synchronized Object c(String p0){
       p5 th = this.h;
       if (th == null) {
          return null;
       }
       return th.get(p0);
    }
    public abstract String d();
    public synchronized Collection e(){
       if (this.g == null) {
          return Collections.emptyList();
       }
       return Collections.unmodifiableList(new ArrayList(this.g));
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       p5 ti = this.i;
       if (ti != null) {
          if (!ti.equals(p0.i)) {
          label_0026 :
             return false;
          }
       }else if(p0.i != null){
          goto label_0026 ;
       }
       ti = this.d;
       if (ti != null) {
          if (!ti.equals(p0.d)) {
          label_0038 :
             return false;
          }
       }else if(p0.d != null){
          goto label_0038 ;
       }
       if (!this.g.equals(p0.g)) {
          return false;
       }else {
          ti = this.b;
          if (ti != null) {
             if (!ti.equals(p0.b)) {
             label_0055 :
                return false;
             }
          }else if(p0.b != null){
             goto label_0055 ;
          }
          ti = this.e;
          if (ti != null) {
             if (!ti.equals(p0.e)) {
             label_0067 :
                return false;
             }
          }else if(p0.e != null){
             goto label_0067 ;
          }
          ti = this.h;
          if (ti != null) {
             if (!ti.equals(p0.h)) {
             label_0079 :
                return false;
             }
          }else if(p0.h != null){
             goto label_0079 ;
          }
          ti = this.c;
          if (ti != null) {
             if (!ti.equals(p0.c)) {
             label_008b :
                return false;
             }
          }else if(p0.c != null){
             goto label_008b ;
          }
          ti = this.a;
          p0 = p0.a;
          if (ti != null) {
             if (!ti.equals(p0)) {
             label_009c :
                b = false;
             }
          }else if(p0 == null){
          }
          return b;
       }
    }
    public n5 f(String p0){
       return this.g(p0, null);
    }
    public n5 g(String p0,String p1){
       n5 on5;
       Iterator iterator = this.g.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          on5 = iterator.next();
          if (p0.equals(on5.c())) {
             break ;
          }
       }
       return on5;
    }
    public void h(f p0){
       this.i = p0;
    }
    public int hashCode(){
       p5 ta = this.a;
       int i = 0;
       int i1 = (ta != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       p5 tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.e;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
       tb = this.i;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public void i(n5 p0){
       this.g.add(p0);
    }
    public synchronized Collection j(){
       if (this.h == null) {
          return Collections.emptySet();
       }
       return Collections.unmodifiableSet(new HashSet(this.h.keySet()));
    }
    public String l(){
       if (("ID_NOT_AVAILABLE").equals(this.b)) {
          return null;
       }
       if (this.b == null) {
          this.b = p5.k();
       }
       return this.b;
    }
    public String m(){
       return this.e;
    }
    public void n(String p0){
       this.b = p0;
    }
    public String o(){
       return this.c;
    }
    public void p(String p0){
       this.e = p0;
    }
    public String q(){
       return this.d;
    }
    public void r(String p0){
       this.c = p0;
    }
    public String s(){
       return this.f;
    }
    public void t(String p0){
       this.d = p0;
    }
    public synchronized String u(){
       ByteArrayOutputStream uByteArrayOu;
       ObjectOutputStream objectOutput;
       Exception uException;
       StringBuilder str = "";
       Iterator iterator = this.e().iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next().d();
       }
       p5 th = this.h;
       if (th != null && !th.isEmpty()) {
          str = str+m0.g("PHByb3BlcnRpZXMgeG1sbnM9Imh0dHA6Ly93d3cuaml2ZXNvZnR3YXJlLmNvbS94bWxucy94bXBwL3Byb3BlcnRpZXMiPg==");
          iterator = this.j().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             Object obj = this.c(str1);
             str = str+"<property>"+"<name>"+x5.b(str1)+"</name>"+"<value type=\"";
             if (obj instanceof Integer) {
                str = str+"integer\">"+obj;
                str1 = "</value>";
             }else if(obj instanceof Long){
                str = str+"long\">"+obj;
                str1 = "</value>";
             }else if(obj instanceof Float){
                str = str+"float\">"+obj;
                str1 = "</value>";
             }else if(obj instanceof Double){
                str = str+"double\">"+obj;
                str1 = "</value>";
             }else if(obj instanceof Boolean){
                str = str+"boolean\">"+obj;
                str1 = "</value>";
             }else if(obj instanceof String){
                str = str+"string\">"+x5.b(obj);
                str1 = "</value>";
             }else {
                str1 = null;
                try{
                   try{
                      uByteArrayOu = new ByteArrayOutputStream();
                      try{
                         objectOutput = new ObjectOutputStream(uByteArrayOu);
                         objectOutput.writeObject(obj);
                         str = str+"java-object\">"+x5.d(uByteArrayOu.toByteArray());
                         str1 = "</value>";
                         str+str1;
                         objectOutput.close();
                         try{
                         label_00f2 :
                            uByteArrayOu.close();
                         }catch(java.lang.Exception e0){
                         }
                      }catch(java.lang.Exception e2){
                      }
                      uException.printStackTrace();
                      if (objectOutput) {
                         try{
                            objectOutput.close();
                         }catch(java.lang.Exception e0){
                         }
                      }
                   }catch(java.lang.Exception e3){
                      objectOutput = str1;
                   }
                   uException = e3;
                   goto label_0104 ;
                }catch(java.lang.Exception e3){
                   uByteArrayOu = str1;
                   objectOutput = uByteArrayOu;
                   goto label_0103 ;
                }
             }
             str = str+str1;
             str = str+"</property>";
          }
          str = str+"</properties>";
       }
       return str;
    }
    public void v(String p0){
       this.f = p0;
    }
    public String w(){
       return this.a;
    }
}
