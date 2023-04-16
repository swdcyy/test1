package aegon.chrome.net.impl.b;
import aegon.chrome.net.i;
import java.lang.String;
import java.util.regex.Pattern;
import android.content.Context;
import java.util.LinkedList;
import java.util.Set;
import java.util.Date;
import j0.o;
import aegon.chrome.net.d$a$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.net.IDN;
import java.util.HashMap;
import java.util.Iterator;
import android.util.Base64;
import java.lang.IllegalArgumentException;
import aegon.chrome.net.impl.b$a;
import java.util.Collection;
import java.util.List;
import java.lang.StringBuilder;
import aegon.chrome.net.impl.b$b;
import j0.q;
import java.io.File;

public abstract class b extends i	// class@0000c2
{
    public final Context a;
    public final List b;
    public final List c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public long l;
    public String m;
    public long n;
    public boolean o;
    public int p;
    public static final Pattern q;

    static {
       b.q = Pattern.compile("^[0-9\\.]*$");
    }
    public void b(Context p0){
       super();
       this.b = new LinkedList();
       this.c = new LinkedList();
       this.p = 20;
       this.a = p0;
       this.s(true);
       this.p(true);
       this.i = false;
       this.q(false, 0);
       this.o = false;
       this.r(true);
    }
    public b A(String p0){
       this.e = p0;
       return this;
    }
    public String B(){
       return this.f;
    }
    public i a(String p0,Set p1,boolean p2,Date p3){
       this.n(p0, p1, p2, p3);
       return this;
    }
    public i b(String p0,int p1,int p2){
       this.o(p0, p1, p2);
       return this;
    }
    public i d(boolean p0){
       this.p(p0);
       return this;
    }
    public i e(int p0,long p1){
       this.q(p0, p1);
       return this;
    }
    public i f(boolean p0){
       this.r(p0);
       return this;
    }
    public i g(boolean p0){
       this.s(p0);
       return this;
    }
    public i h(boolean p0){
       return this;
    }
    public String i(){
       return o.b(this.a);
    }
    public i j(String p0){
       this.x(p0);
       return this;
    }
    public i k(d$a$a p0){
       return this.y(p0);
    }
    public i l(String p0){
       this.z(p0);
       return this;
    }
    public i m(String p0){
       this.A(p0);
       return this;
    }
    public b n(String p0,Set p1,boolean p2,Date p3){
       Objects.requireNonNull(p0, "The hostname cannot be null");
       Objects.requireNonNull(p1, "The set of SHA256 pins cannot be null");
       Objects.requireNonNull(p3, "The pin expiration date cannot be null");
       String str = "Hostname ";
       if (b.q.matcher(p0).matches()) {
          throw new IllegalArgumentException(str+p0+" is illegal. A hostname should not consist of digits and/or dots only.");
       }
       if (p0.length() > 255) {
          throw new IllegalArgumentException(str+p0+" is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
       }
       int i = 2;
       try{
          p0 = IDN.toASCII(p0, i);
          HashMap hashMap = new HashMap();
          Iterator iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                byte[] uobyteArray = iterator.next();
                if (uobyteArray != null && uobyteArray.length == 32) {
                   hashMap.put(Base64.encodeToString(uobyteArray, 0), uobyteArray);
                }else {
                   break ;
                }
             }else {
                byte[][] uobyteArray1 = new byte[][hashMap.size()];
                this.c.add(new b$a(p0, hashMap.values().toArray(uobyteArray1), p2, p3));
                return this;
             }
          }
          throw new IllegalArgumentException("Public key pin is invalid");
       }catch(java.lang.IllegalArgumentException e0){
          throw new IllegalArgumentException(str+p0+" is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
       }
    }
    public b o(String p0,int p1,int p2){
       if (p0.contains("/")) {
          throw new IllegalArgumentException("Illegal QUIC Hint Host: "+p0);
       }
       this.b.add(new b$b(p0, p1, p2));
       return this;
    }
    public b p(boolean p0){
       this.h = p0;
       return this;
    }
    public b q(int p0,long p1){
       if (p0 == 3 || p0 == 2) {
          if (this.B() == null) {
             throw new IllegalArgumentException("Storage path must be set");
          }
       }else if(this.B() == null){
          throw new IllegalArgumentException("Storage path must not be set");
       }
       boolean b = (!p0 || p0 == 2)? true: false;
       this.j = b;
       this.l = p1;
       if (p0) {
          if (p0 != 1) {
             if (p0 == 2 || p0 == 3) {
                this.k = 1;
             }else {
                throw new IllegalArgumentException("Unknown cache mode");
             }
          }else {
             this.k = 2;
          }
       }else {
          this.k = 0;
       }
       return this;
    }
    public b r(boolean p0){
       this.d = p0;
       return this;
    }
    public b s(boolean p0){
       this.g = p0;
       return this;
    }
    public String t(){
       return this.e;
    }
    public int u(){
       return this.k;
    }
    public q v(){
       return null;
    }
    public boolean w(){
       return this.o;
    }
    public b x(String p0){
       this.m = p0;
       return this;
    }
    public b y(d$a$a p0){
       return this;
    }
    public b z(String p0){
       if (!new File(p0).isDirectory()) {
          throw new IllegalArgumentException("Storage path must be set to existing directory");
       }
       this.f = p0;
       return this;
    }
}
