package cp8.c;
import tx4.j;
import java.lang.Object;
import java.util.Map;
import tx4.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import java.net.HttpURLConnection;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.StringBuilder;
import java.util.Base64$Encoder;
import java.util.Base64;
import java.io.InputStream;
import com.kwai.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Thread;
import cp8.a;
import java.lang.Runnable;
import cp8.b;

public class c implements j	// class@001fed
{
    public String a;
    public String b;
    public String c;
    public Map d;
    public Map e;
    public Map f;
    public Map g;
    public int h;
    public static String i = "GET";
    public static String j = "POST";

    public void c(){
       super();
    }
    public void a(Map p0){
       this.d = p0;
    }
    public void b(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       HashMap hashMap = (this.f != null)? new HashMap(this.f): new HashMap();
       HashMap hashMap1 = hashMap;
       hashMap = (this.d != null)? new HashMap(this.d): new HashMap();
       HashMap hashMap2 = hashMap;
       c tb = this.b;
       String str = (tb != null)? (this.a).concat(tb): this.a;
       this.n(str, c.j, this.h, hashMap1, hashMap2, p0);
       return;
    }
    public void c(String p0){
       this.c = p0;
    }
    public void d(int p0){
       this.h = p0;
    }
    public void e(Map p0){
       this.g = p0;
    }
    public void f(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       HashMap hashMap = (this.f != null)? new HashMap(this.f): new HashMap();
       HashMap hashMap1 = hashMap;
       hashMap = (this.d != null)? new HashMap(this.d): new HashMap();
       HashMap hashMap2 = hashMap;
       c tb = this.b;
       String str = (tb != null)? (this.a).concat(tb): this.a;
       this.n(str, c.i, this.h, hashMap1, hashMap2, p0);
       return;
    }
    public void g(Map p0){
       this.e = p0;
    }
    public void h(String p0){
       this.a = p0;
    }
    public void j(Map p0){
       this.f = p0;
    }
    public void k(HttpURLConnection p0,HashMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String str = uEntry.getKey().toString();
          String value = uEntry.getValue();
          if (str.equals("Authorization")) {
             value = "Basic "+new String(Base64.getEncoder().encode(("username:password").getBytes()));
          }
          p0.setRequestProperty(str, value);
       }
       return;
    }
    public String l(InputStream p0){
       BufferedReader obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BufferedReader(new InputStreamReader(p0));
       StringBuilder str = "";
       try{
          String str1 = obj.readLine();
          while (str1 != null) {
             str = str+str1+"\n";
          }
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       return str;
    }
    public final String m(HashMap p0){
       String obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 == null) {
          return obj;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          obj = obj+"&"+uEntry.getKey().toString()+"="+uEntry.getValue().toString();
       }
       return obj;
    }
    public void n(String p0,String p1,int p2,HashMap p3,HashMap p4,i p5){
       Object[] objArray;
       a uoa;
       b uob;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       c uoc = c.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       if (PatchProxy.isSupport(uoc)) {
          objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),p3,oobject2,p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
             return;
          }
       }
       if ((c.i).equals(oobject1)) {
          if (PatchProxy.isSupport(uoc)) {
             objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),p3,oobject2,p5};
             if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             }
          }else {
          }
       }else if((c.j).equals(oobject1)){
          if (PatchProxy.isSupport(uoc)) {
             objArray = new Object[]{oobject,oobject1,Integer.valueOf(p2),p3,oobject2,p5};
             if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             }
          }else {
          }
       }
    label_00d4 :
       return;
    }
    public void setPath(String p0){
       this.b = p0;
    }
}
