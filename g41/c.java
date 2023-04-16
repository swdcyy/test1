package g41.c;
import java.lang.String;
import java.lang.Object;
import g41.c$a;
import g41.c$b;
import g41.a;
import g41.c$c;
import g41.b;
import g41.c$d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import v99.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import g41.e;
import java.lang.Boolean;
import s99.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import zf6.l;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.Runnable;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;
import android.view.View;
import t99.w;
import s99.i;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import t99.y;
import w99.g;
import ba9.a;
import com.yxcorp.gifshow.autoplay.state.NetworkState$a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.TextureView$SurfaceTextureListener;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.autoplay.listener.AutoPlayCardPlayChecker;
import android.view.ViewGroup;
import t99.w$a;
import com.yxcorp.utility.n;
import java.util.HashMap;
import u99.d;

public class c	// class@00241e
{
    public final String a;
    public QPhoto b;
    public BaseFragment c;
    public a d;
    public LiveAutoPlayModule e;
    public PublishSubject f;
    public NetworkState g;
    public b h;
    public e i;
    public Boolean j;
    public d k;
    public View l;
    public LivePlayTextureView m;
    public KwaiImageView n;
    public FrameAutoPlayCard o;
    public ImageView p;
    public ImageView q;
    public final Runnable r;
    public final i s;
    public final d t;
    public final y u;
    public final NetworkState$a v;
    public final TextureView$SurfaceTextureListener w;

    public void c(String p0){
       super();
       this.r = new c$a(this);
       this.s = new c$b(this);
       this.t = new a(this);
       this.u = new c$c(this);
       this.v = new b(this);
       this.w = new c$d(this);
       this.a = p0;
    }
    public void a(QPhoto p0,BaseFragment p1,a p2,LiveAutoPlayModule p3,PublishSubject p4,b p5,e p6,Boolean p7,d p8){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
             return;
          }
       }
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       this.g = b.a(0x43d75a86);
       this.p.setBackground(new ColorDrawable(l.m(a1.a(R.color.arg_RES_7f061d82), r1.t0(this.b.mEntity))));
       this.n.post(this.r);
       w.d(this.o, this.o, this.b.getEntity());
       this.o.y(this.s);
       this.o.B(this.t);
       this.e.h0(this.m);
       this.e.O(this.u);
       this.o.setAutoPlayModule(this.e);
       this.d.a(this.o);
       this.f();
       this.g.a(this.v);
       return;
    }
    public void b(View p0,LivePlayTextureView p1,KwaiImageView p2,FrameAutoPlayCard p3,ImageView p4,ImageView p5){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
             return;
          }
       }
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       p1.a(this.w);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.m.g(this.w);
       return;
    }
    public Boolean d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Boolean.valueOf(AutoPlayCardPlayChecker.BOTTOM_HALF_TOP_HALF.checkPlay(null, null, this.l));
    }
    public void e(int p0,int p1,int p2,FrameAutoPlayCard p3,LivePlayTextureView p4,KwaiImageView p5){
       Object[] objArray;
       c uoc = this;
       c uoc1 = c.class;
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 3;
       int i4 = 2;
       int i5 = 1;
       int i6 = 0;
       if (PatchProxy.isSupport(uoc1)) {
          objArray = new Object[i];
          objArray[i6] = Integer.valueOf(p0);
          objArray[i5] = Integer.valueOf(p1);
          objArray[i4] = Integer.valueOf(p2);
          objArray[i3] = p3;
          objArray[i2] = p4;
          objArray[i1] = p5;
          if (PatchProxy.applyVoid(objArray, this, uoc1, "6")) {
             return;
          }
       }
       c q = uoc.q;
       c p = uoc.p;
       w ow = w.class;
       if (PatchProxy.isSupport(ow)) {
          objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p3,p4,p5,q,p};
          if (PatchProxy.applyVoid(objArray, null, ow, "4")) {
          label_0073 :
             return;
          }
       }
       w.a.e(p0, p1, p3, p4, p5, q, p);
       goto label_0073 ;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "10")) {
          return;
       }
       View[] viewArray = new View[]{this.n};
       n.Z(0, viewArray);
       View[] viewArray1 = new View[]{this.q};
       n.Z(8, viewArray1);
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       d.h(this.a, "stopPlay", d.c(this.b.mEntity, this.e, this.c, "reason", p0));
       this.d.v(p0, this.o);
       return;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       d.d(this.a, "onUnbind");
       this.n.removeCallbacks(this.r);
       this.g("unbind");
       this.o.v(this.t);
       this.e.e0(this.u);
       this.o.A(this.s);
       this.o.q();
       this.d.n(this.o);
       this.g.c(this.v);
       return;
    }
}
