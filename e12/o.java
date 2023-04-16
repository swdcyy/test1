package e12.o;
import c51.h;
import c51.e;
import e12.c;
import e12.o$a;
import e12.o$b;
import ub2.j;
import wg3.b;
import java.util.List;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import bw6.a;
import d61.g;
import qvb.j;
import qvb.q;

public class o extends h	// class@002607
{
    public c k;
    public final q l;

    public void o(e p0,c p1){
       super(p0);
       this.l = new o$a(this);
       this.k = p1;
       p1.l1(new o$b(this));
    }
    public static boolean D0(o p0,b p1){
       return super.s(p1);
    }
    public static boolean E0(o p0,List p1){
       return super.m(p1);
    }
    public boolean F0(LiveStreamFeed p0){
       o obj = PatchProxy.applyOneRefs(p0, this, o.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj == null) {
          return false;
       }
       return obj.i0(new QPhoto(p0));
    }
    public boolean W(a p0){
       return this.F0(p0);
    }
    public boolean d(List p0){
       o obj = PatchProxy.applyOneRefs(p0, this, o.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj == null) {
          return false;
       }
       return obj.Y(g.k(p0));
    }
    public boolean m(List p0){
       o obj = PatchProxy.applyOneRefs(p0, this, o.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.k;
       if (obj == null) {
          return false;
       }
       return obj.Y(g.k(p0));
    }
    public boolean s(b p0){
       return this.F0(p0);
    }
    public void w0(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       super.w0();
       o tk = this.k;
       if (tk != null) {
          tk.g0().f(this.l);
          this.k = null;
       }
       return;
    }
}
