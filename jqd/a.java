package jqd.a;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import io.netty.channel.g;
import io.netty.channel.d;
import lqd.h;
import java.lang.String;
import java.util.Objects;
import java.lang.StringBuilder;
import zqd.w;

public abstract class a implements Cloneable	// class@001729
{
    public n b;
    public d c;
    public SocketAddress d;
    public final Map e;
    public final Map f;
    public g g;

    public void a(){
       super();
       this.e = new LinkedHashMap();
       this.f = new LinkedHashMap();
    }
    public void a(a p0){
       super();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       this.e = linkedHashMa;
       LinkedHashMap linkedHashMa1 = new LinkedHashMap();
       this.f = linkedHashMa1;
       this.b = p0.b;
       this.c = p0.c;
       this.g = p0.g;
       this.d = p0.d;
       a e = p0.e;
       _monitor_enter(e);
       linkedHashMa.putAll(p0.e);
       _monitor_exit(e);
       a f = p0.f;
       _monitor_enter(f);
       linkedHashMa1.putAll(p0.f);
       _monitor_exit(f);
    }
    public abstract a a();
    public final g b(){
       return this.g;
    }
    public abstract void c(d p0);
    public Object clone(){
       return this.a();
    }
    public a d(h p0,Object p1){
       a te;
       Objects.requireNonNull(p0, "option");
       if (p1 == null) {
          te = this.e;
          _monitor_enter(te);
          this.e.remove(p0);
          _monitor_exit(te);
       }else {
          te = this.e;
          _monitor_enter(te);
          this.e.put(p0, p1);
          _monitor_exit(te);
       }
       return this;
    }
    public String toString(){
       char c = '(';
       StringBuilder str = w.b(this)+c;
       if (this.b != null) {
          str = str+"group: "+w.b(this.b)+", ";
       }
       if (this.c != null) {
          str = str+"channelFactory: "+this.c+", ";
       }
       if (this.d != null) {
          str = str+"localAddress: "+this.d+", ";
       }
       a te = this.e;
       _monitor_enter(te);
       if (!this.e.isEmpty()) {
          str = str+"options: "+this.e+", ";
       }
       _monitor_exit(te);
       a tf = this.f;
       _monitor_enter(tf);
       if (!this.f.isEmpty()) {
          str = str+"attrs: "+this.f+", ";
       }
       _monitor_exit(tf);
       if (this.g != null) {
          str = str+"handler: "+this.g+", ";
       }
       if (str.charAt((str.length() - 1)) == c) {
          str = str+')';
       }else {
          str.setCharAt((str.length() - 2), ')');
          str.setLength((str.length() - 1));
       }
       return str;
    }
}
