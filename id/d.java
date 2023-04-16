package id.d;
import id.c0;
import java.lang.String;
import java.lang.Object;
import com.facebook.common.internal.ImmutableSet;
import com.facebook.imagepipeline.request.ImageRequest;
import id.e0;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import com.facebook.imagepipeline.common.Priority;
import vc.h;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import java.util.HashMap;
import java.util.Map;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import id.d0;
import java.util.Set;
import java.util.Map$Entry;
import java.util.Collection;

public class d implements c0	// class@0021a0
{
    public final ImageRequest a;
    public final String b;
    public final String c;
    public final e0 d;
    public final Object e;
    public final ImageRequest$RequestLevel f;
    public final Map g;
    public boolean h;
    public Priority i;
    public boolean j;
    public boolean k;
    public final List l;
    public final h m;
    public EncodedImageOrigin n;
    public static final Set o;

    static {
       String[] stringArray = new String[]{"id","uri_source"};
       d.o = ImmutableSet.of(stringArray);
    }
    public void d(ImageRequest p0,String p1,e0 p2,Object p3,ImageRequest$RequestLevel p4,boolean p5,boolean p6,Priority p7,h p8){
       super(p0, p1, null, p2, p3, p4, p5, p6, p7, p8);
    }
    public void d(ImageRequest p0,String p1,String p2,e0 p3,Object p4,ImageRequest$RequestLevel p5,boolean p6,boolean p7,Priority p8,h p9){
       super();
       this.n = EncodedImageOrigin.NOT_SET;
       this.a = p0;
       this.b = p1;
       HashMap hashMap = new HashMap();
       this.g = hashMap;
       hashMap.put("id", p1);
       String str = (p0 == null)? "null-request": p0.s();
       hashMap.put("uri_source", str);
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.h = p6;
       this.i = p8;
       this.j = p7;
       this.k = false;
       this.l = new ArrayList();
       this.m = p9;
       return;
    }
    public static void a(List p0){
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public static void r(List p0){
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
    public static void s(List p0){
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       return;
    }
    public ImageRequest b(){
       return this.a;
    }
    public h c(){
       return this.m;
    }
    public Object d(String p0,Object p1){
       p0 = this.g.get(p0);
       if (p0 == null) {
          return p1;
       }
       return p0;
    }
    public EncodedImageOrigin e(){
       return this.n;
    }
    public void f(Map p0){
       if (p0 == null) {
          return;
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          this.m(key, uEntry.getValue());
       }
       return;
    }
    public String g(){
       return this.c;
    }
    public Object getExtra(String p0){
       return this.g.get(p0);
    }
    public Map getExtras(){
       return this.g;
    }
    public String getId(){
       return this.b;
    }
    public synchronized Priority getPriority(){
       return this.i;
    }
    public Object h(){
       return this.e;
    }
    public synchronized boolean i(){
       return this.j;
    }
    public void j(EncodedImageOrigin p0){
       this.n = p0;
    }
    public void k(d0 p0){
       _monitor_enter(this);
       this.l.add(p0);
       _monitor_exit(this);
       if (this.k != null) {
          p0.c();
       }
       return;
    }
    public e0 l(){
       return this.d;
    }
    public void m(String p0,Object p1){
       if (d.o.contains(p0)) {
          return;
       }
       this.g.put(p0, p1);
       return;
    }
    public void n(String p0,String p1){
       this.g.put("origin", p0);
       this.g.put("origin_sub", p1);
    }
    public void o(String p0){
       this.n(p0, "default");
    }
    public synchronized boolean p(){
       return this.h;
    }
    public ImageRequest$RequestLevel q(){
       return this.f;
    }
    public void t(){
       List list;
       _monitor_enter(this);
       if (this.k != null) {
          list = null;
          _monitor_exit(this);
       }else {
          this.k = true;
          list = new ArrayList(this.l);
          _monitor_exit(this);
       }
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().c();
          }
       }
       return;
    }
    public synchronized List u(Priority p0){
       if (p0 == this.i) {
          return null;
       }
       this.i = p0;
       return new ArrayList(this.l);
    }
}
