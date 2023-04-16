package kz2.c;
import pz2.c;
import g03.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import bz2.a;
import pz2.b;
import java.util.Set;
import iy2.e;
import oz2.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import sz2.b;
import com.kwai.robust.PatchProxyResult;
import pz2.a;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import mz2.a;
import brd.t;
import java.lang.Boolean;
import kz2.b;
import erd.o;
import iy2.b;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.List;

public abstract class c implements c	// class@00352d
{
    public List b;
    public boolean c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public final a h;
    public final Map i;
    public final long j;
    public a k;

    public void c(a p0){
       super();
       this.i = new ConcurrentHashMap();
       this.j = a.a();
       this.h = p0;
    }
    public void A(long p0){
       this.e = p0;
    }
    public boolean B(){
       return b.a(this);
    }
    public Set C(){
       return b.b(this);
    }
    public e D(){
       return b.g(this);
    }
    public int E(){
       return 0;
    }
    public boolean F(int p0,e p1){
       return b.l(this, p0, p1);
    }
    public int G(){
       return b.d(this);
    }
    public void H(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       this.i.put(p0, p1);
       return;
    }
    public b I(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.a(String.valueOf(this.b()), null);
    }
    public abstract a J();
    public t a(){
       c obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.s();
       }
       obj = this.k;
       t ot = (obj == null)? t.just(Boolean.TRUE): obj.a().map(new b(this));
       return ot;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       boolean b = (e.b().he().g(String.valueOf(this.b())) != null)? true: false;
       p0.a(b);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tk = this.k;
       if (tk != null) {
          tk.c();
       }
       this.c = false;
       return;
    }
    public boolean d(){
       return this.g;
    }
    public long f(){
       return this.d;
    }
    public void g(String p0,int p1){
       b.n(this, p0, p1);
    }
    public String getExtraInfo(){
       return b.f(this);
    }
    public long getTrackId(){
       return this.j;
    }
    public void i(boolean p0){
       this.f = p0;
    }
    public void j(long p0){
       this.d = p0;
    }
    public void l(){
       b.h(this);
    }
    public void m(){
       b.j(this);
    }
    public boolean o(int p0,e p1){
       return b.m(this, p0, p1);
    }
    public void q(boolean p0,String p1){
       b.i(this, p0, p1);
    }
    public String r(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.get(p0);
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.c = true;
       a uoa = this.J();
       this.k = uoa;
       if (uoa != null) {
          uoa.b();
       }
       return;
    }
    public boolean t(){
       return this.f;
    }
    public List u(){
       return this.b;
    }
    public void v(boolean p0){
       this.g = p0;
    }
    public void w(){
       b.k(this);
    }
    public int x(){
       return b.e(this);
    }
    public long y(){
       return this.e;
    }
}
