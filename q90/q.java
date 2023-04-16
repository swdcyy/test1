package q90.q;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import q90.q$a;
import nsd.u;
import lnc.a1;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.widget.TextView;
import android.widget.FrameLayout$LayoutParams;
import qrd.l1;
import q90.q$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.CDNUrl;
import w36.b;
import v36.a;
import w36.a;
import crd.b;
import lnc.b9;
import mrd.a;
import q90.z;
import q90.t;
import erd.g;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import q90.u;
import java.lang.Boolean;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.ViewParent;
import ub.b;
import q90.s;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.feature.post.api.magic.webp.vm.MagicBaseWebpVM;

public final class q extends PagerSlidingTabStrip$d	// class@00299d
{
    public boolean j;
    public boolean k;
    public boolean l;
    public View$OnClickListener m;
    public GifshowActivity n;
    public FrameLayout o;
    public EmojiTextView p;
    public KwaiImageView q;
    public b r;
    public Bitmap s;
    public z t;
    public a u;
    public b v;
    public b w;
    public static final int x;
    public static final int y;
    public static final q$a z;

    static {
       q.z = new q$a(null);
       q.x = a1.e(50.00f);
       q.y = a1.e(22.00f);
    }
    public void q(String p0,CharSequence p1){
       a.p(p0, "id");
       super(p0, p1);
    }
    public View a(Context p0,int p1,ViewPager p2){
       FrameLayout obj;
       b uob;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, q.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "context");
       Object[] objArray = new Object[0];
       e.D().s("KSFeedTab", "buildTabView, position:"+p1+", name:"+this.f(), objArray);
       obj = new FrameLayout(p0);
       int i = -2;
       obj.setLayoutParams(new ViewGroup$LayoutParams(i, i));
       this.o = obj;
       EmojiTextView uEmojiTextVi = new EmojiTextView(p0);
       this.p = uEmojiTextVi;
       uEmojiTextVi.setId(R.id.tab_text);
       q tp = this.p;
       if (tp != null) {
          tp.setText(this.f());
       }
       tp = this.p;
       if (tp != null) {
          tp.setFocusable(true);
       }
       tp = this.p;
       if (tp != null) {
          tp.setGravity(17);
       }
       tp = this.p;
       if (tp != null) {
          tp.setSingleLine();
       }
       tp = this.p;
       if (tp != null) {
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(i, i);
          layoutParams.gravity = 17;
          tp.setLayoutParams(layoutParams);
       }
       obj.addView(this.p);
       obj.setOnClickListener(new q$b(this, p2, p1));
       if (!p0 instanceof GifshowActivity) {
          return obj;
       }else {
          this.n = p0;
          q tr = this.r;
          if (tr != null) {
             Object[] objArray1 = new Object[0];
             e.D().s("KSFeedTab", "magicWebpData:"+this.r+", tab:"+this.f(), objArray1);
             if (tr.e() != null) {
                Object[] objArray2 = null;
                if (!PatchProxy.applyVoid(objArray2, this, oq, "7")) {
                   Object[] objArray3 = new Object[0];
                   e.D().s("KSFeedTab", "registerPublishers", objArray3);
                   if (this.t != null) {
                      if (this.u == null) {
                         q tt = this.t;
                         a.m(tt);
                         this.u = new a(tt);
                      }
                      b9.a(this.v);
                      q tt1 = this.t;
                      if (tt1 != null) {
                         a uoa = tt1.t0();
                         if (uoa != null) {
                            uob = uoa.subscribe(new t(this));
                         label_0128 :
                            this.v = uob;
                            b9.a(this.w);
                            tt1 = this.n;
                            if (tt1 != null) {
                               t ot = tt1.m();
                               if (ot != null) {
                                  objArray2 = ot.subscribe(new u(this));
                               }
                            }
                            this.w = objArray2;
                         }
                      }
                      uob = objArray2;
                      goto label_0128 ;
                   }
                }
             }
          }
          return obj;
       }
    }
    public void g(boolean p0){
       this.k = p0;
    }
    public void h(boolean p0){
       this.j = p0;
    }
    public void i(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "1")) {
          return;
       }
       this.j(p0, false);
       return;
    }
    public void j(View$OnClickListener p0,boolean p1){
       this.m = p0;
       this.l = p1;
    }
    public void k(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       q tp = this.p;
       if (tp != null) {
          tp.setText(p0);
       }
       return;
    }
    public final void l(boolean p0){
       q tq1;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().s("KSFeedTab", "bindImage", objArray);
       if (this.o == null) {
          return;
       }
       q tr = this.r;
       if (tr != null) {
          long l = a1.k();
          b uob = null;
          if (tr.e() != null && (tr.d() - l <= 0 && l - tr.c() <= 0)) {
             if (this.q == null) {
                KwaiImageView kwaiImageVie = new KwaiImageView(this.n);
                kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(i, i, 17));
                this.q = kwaiImageVie;
             }
             q tq = this.q;
             a.m(tq);
             if (tq.getParent() == null) {
                tq = this.o;
                if (tq != null) {
                   tq.addView(this.q);
                }
             }
             if (p0) {
                tq1 = this.q;
                a.m(tq1);
                s os = PatchProxy.applyOneRefs(tq1, this, oq, "5");
                if (os != PatchProxyResult.class) {
                }else {
                   os = new s(this, tq1);
                }
                uob = os;
             }
             tq1 = this.q;
             if (tq1 != null) {
                CDNUrl[] uCDNUrlArray = tr.e();
                a.m(uCDNUrlArray);
                tq1.b0(uCDNUrlArray, uob, q.x, q.y);
             }
          }else {
             tq1 = this.q;
             if (tq1 != null && a.g(tq1.getParent(), this.o)) {
                oq = this.o;
                if (oq != null) {
                   oq.removeView(tq1);
                }
             }
             tq1 = this.p;
             if (tq1 != null) {
                tq1.setVisibility(i);
             }
             this.s = uob;
             tq1 = this.t;
             if (tq1 != null) {
                tq1.E(tr);
             }
          }
       }
       return;
    }
}
