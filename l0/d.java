package l0.d;
import java.net.HttpURLConnection;
import java.lang.String;
import java.lang.Class;
import java.net.URL;
import aegon.chrome.net.d;
import l0.i;
import l0.f;
import java.util.ArrayList;
import java.io.OutputStream;
import aegon.chrome.net.q;
import android.os.Build$VERSION;
import android.net.TrafficStats;
import java.util.List;
import java.lang.Object;
import android.util.Pair;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.util.Collections;
import java.io.InputStream;
import aegon.chrome.net.r;
import java.io.IOException;
import java.io.FileNotFoundException;
import l0.b;
import java.lang.reflect.Field;
import l0.c;
import l0.a;
import java.lang.Long;
import java.net.ProtocolException;
import java.lang.IllegalStateException;
import java.util.AbstractMap$SimpleImmutableEntry;
import l0.g;
import java.util.Objects;
import java.lang.UnsupportedOperationException;
import java.lang.StringBuilder;
import l0.d$a;
import aegon.chrome.net.q$b;
import java.util.concurrent.Executor;
import aegon.chrome.net.q$a;
import aegon.chrome.net.h$a;
import aegon.chrome.net.o;
import aegon.chrome.net.h;

public class d extends HttpURLConnection	// class@0024e4
{
    public final d a;
    public final i b;
    public q c;
    public final List d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;
    public f i;
    public g j;
    public r k;
    public IOException l;
    public boolean m;
    public boolean n;
    public List o;
    public Map p;
    public static final String q;

    static {
       d.q = d.class.getSimpleName();
    }
    public void d(URL p0,d p1){
       super(p0);
       this.a = p1;
       this.b = new i();
       this.i = new f(this);
       this.d = new ArrayList();
    }
    public static URL a(d p0){
       return p0.url;
    }
    public static boolean b(d p0){
       return p0.instanceFollowRedirects;
    }
    public static URL c(d p0,URL p1){
       p0.url = p1;
       return p1;
    }
    public static boolean d(d p0){
       return p0.instanceFollowRedirects;
    }
    public final void addRequestProperty(String p0,String p1){
       this.l(p0, p1, false);
    }
    public void connect(){
       this.getOutputStream();
       this.m();
    }
    public void disconnect(){
       if (this.connected != null) {
          this.c.a();
       }
       return;
    }
    public final boolean e(){
       if (this.g != null) {
          return true;
       }
       if (Build$VERSION.SDK_INT < 28) {
          return false;
       }
       int threadStatsU = TrafficStats.getThreadStatsUid();
       if (threadStatsU != -1) {
          this.h = threadStatsU;
          this.g = true;
       }
       return this.g;
    }
    public final int f(String p0){
       int i = 0;
       while (true) {
          if (i >= this.d.size()) {
             return -1;
          }
          if ((this.d.get(i).first).equalsIgnoreCase(p0)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final Map g(){
       d tp = this.p;
       if (tp != null) {
          return tp;
       }
       TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
       Iterator iterator = this.h().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          ArrayList uArrayList = new ArrayList();
          if (treeMap.containsKey(uEntry.getKey())) {
             uArrayList.addAll(treeMap.get(uEntry.getKey()));
          }
          uArrayList.add(uEntry.getValue());
          treeMap.put(uEntry.getKey(), Collections.unmodifiableList(uArrayList));
       }
       Map map = Collections.unmodifiableMap(treeMap);
       this.p = map;
       return map;
    }
    public InputStream getErrorStream(){
       InputStream inputStream = null;
       try{
          this.j();
          if (this.k.c() >= 400) {
             inputStream = this.i;
          }
          return e0;
       }catch(java.io.IOException e0){
       }
    }
    public final String getHeaderField(int p0){
       Map$Entry uEntry = this.i(p0);
       if (uEntry == null) {
          return null;
       }
       return uEntry.getValue();
    }
    public final String getHeaderField(String p0){
       String str = null;
       try{
          this.j();
          Map map = this.g();
          if (!map.containsKey(p0)) {
             return str;
          }
          List list = map.get(p0);
          return list.get((list.size() - 1));
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public final String getHeaderFieldKey(int p0){
       Map$Entry uEntry = this.i(p0);
       if (uEntry == null) {
          return null;
       }
       return uEntry.getKey();
    }
    public Map getHeaderFields(){
       try{
          this.j();
          return this.g();
       }catch(java.io.IOException e0){
          return Collections.emptyMap();
       }
    }
    public InputStream getInputStream(){
       this.j();
       if (this.instanceFollowRedirects == null && this.m != null) {
          throw new IOException("Cannot read response body of a redirect.");
       }
       if (this.k.c() < 400) {
          return this.i;
       }
       throw new FileNotFoundException(this.url.toString());
    }
    public OutputStream getOutputStream(){
       if (this.j == null && this.doOutput != null) {
          if (this.connected == null) {
             try{
                if (this.k()) {
                   this.j = new b(this, this.chunkLength, this.b);
                   this.m();
                }else {
                   long l = (long)this.fixedContentLength;
                   c uoc = -1;
                   long longx = d.class.getField("fixedContentLengthLong").getLong(this);
                   if (longx - uoc) {
                      l = longx;
                   }
                label_0037 :
                   if (e0 - uoc) {
                      this.j = new c(this, e0, this.b);
                      this.m();
                   }else {
                      String requestPrope = this.getRequestProperty("Content-Length");
                      if (requestPrope == null) {
                         this.j = new a(this);
                      }else {
                         this.j = new a(this, Long.parseLong(requestPrope));
                      }
                   }
                }
             }catch(java.lang.NoSuchFieldException e0){
             }catch(java.lang.IllegalAccessException e0){
             }
          }else {
             throw new ProtocolException("Cannot write to OutputStream after receiving response.");
          }
       }
    }
    public Map getRequestProperties(){
       if (this.connected != null) {
          throw new IllegalStateException("Cannot access request headers after connection is set.");
       }
       TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
       Iterator iterator = this.d.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return Collections.unmodifiableMap(treeMap);
          }
          Pair pair = iterator.next();
          if (!treeMap.containsKey(pair.first)) {
             ArrayList uArrayList = new ArrayList();
             uArrayList.add(pair.second);
             treeMap.put(pair.first, Collections.unmodifiableList(uArrayList));
          }else {
             break ;
          }
       }
       throw new IllegalStateException("Should not have multiple values.");
    }
    public String getRequestProperty(String p0){
       int i = this.f(p0);
       if (i >= 0) {
          return this.d.get(i).second;
       }
       return null;
    }
    public int getResponseCode(){
       this.j();
       return this.k.c();
    }
    public String getResponseMessage(){
       this.j();
       return this.k.d();
    }
    public final List h(){
       d to = this.o;
       if (to != null) {
          return to;
       }
       this.o = new ArrayList();
       Iterator iterator = this.k.b().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!(uEntry.getKey()).equalsIgnoreCase("Content-Encoding")) {
             this.o.add(new AbstractMap$SimpleImmutableEntry(uEntry));
          }
       }
       List list = Collections.unmodifiableList(this.o);
       this.o = list;
       return list;
    }
    public final Map$Entry i(int p0){
       Map$Entry uEntry = null;
       try{
          this.j();
          List list = this.h();
          if (p0 >= list.size()) {
             return uEntry;
          }
          return list.get(p0);
       }catch(java.io.IOException e0){
          return e0;
       }
    }
    public final void j(){
       d tj = this.j;
       if (tj != null) {
          tj.e();
          if (this.k()) {
             this.j.close();
          }
       }
       if (this.n == null) {
          this.m();
          this.b.a();
       }
       if (this.n != null) {
          tj = this.l;
          if (tj == null) {
             Objects.requireNonNull(this.k, "Response info is null when there is no exception.");
             return;
          }else {
             throw tj;
          }
       }else {
          throw new IllegalStateException("No response.");
       }
    }
    public final boolean k(){
       boolean b = (this.chunkLength > null)? true: false;
       return b;
    }
    public final void l(String p0,String p1,boolean p2){
       if (this.connected != null) {
          throw new IllegalStateException("Cannot modify request property after connection is made.");
       }
       int i = this.f(p0);
       if (i >= 0) {
          if (p2) {
             this.d.remove(i);
          }else {
             throw new UnsupportedOperationException("Cannot add multiple headers of the same key, "+p0+". crbug.com/432719.");
          }
       }
       this.d.add(Pair.create(p0, p1));
       return;
    }
    public final void m(){
       d tj;
       if (this.connected != null) {
          return;
       }
       h$a uoa = this.a.d(this.getURL().toString(), new d$a(this), this.b);
       if (this.doOutput != null) {
          if ((this.method).equals("GET")) {
             this.method = "POST";
          }
          tj = this.j;
          String str = "Content-Length";
          if (tj != null) {
             uoa.q(tj.f(), this.b);
             if (this.getRequestProperty(str) == null && !this.k()) {
                this.addRequestProperty(str, Long.toString(this.j.f().a()));
             }
             this.j.g();
          }else if(this.getRequestProperty(str) == null){
             this.addRequestProperty(str, "0");
          }
          String str1 = "Content-Type";
          if (this.getRequestProperty(str1) == null) {
             this.addRequestProperty(str1, "application/x-www-form-urlencoded");
          }
       }
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          uoa.h(pair.first, pair.second);
       }
       if (!this.getUseCaches()) {
          uoa.k();
       }
       uoa.l(this.method);
       if (this.e != null) {
          tj = 1;
       }else {
          int threadStatsT = TrafficStats.getThreadStatsTag();
          if (threadStatsT != -1) {
             this.f = threadStatsT;
             this.e = true;
          }
          tj = this.e;
       }
       if (tj != null) {
          uoa.o(this.f);
       }
       if (this.e()) {
          uoa.p(this.h);
       }
       h oh = uoa.j();
       this.c = oh;
       oh.f();
       this.connected = true;
       return;
    }
    public void setConnectTimeout(int p0){
    }
    public final void setRequestProperty(String p0,String p1){
       this.l(p0, p1, true);
    }
    public boolean usingProxy(){
       return false;
    }
}
