package j79.q;
import s79.a;
import j79.q$a;
import nsd.u;
import j79.l0;
import q79.d;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.album.preview.d;
import androidx.fragment.app.Fragment;
import crd.a;
import j79.q$e;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import j79.s;
import androidx.viewpager.widget.ViewPager$i;
import j79.t;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$d;
import j79.u;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$a;
import j79.v;
import ha9.c;
import j79.w;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import androidx.fragment.app.FragmentActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kotlin.TypeCastException;
import brd.t;
import j79.q$b;
import j79.q$c;
import erd.g;
import crd.b;
import r79.a;
import j79.a;
import j79.q$d;
import u79.a;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import java.lang.Boolean;
import u79.o;
import com.yxcorp.gifshow.album.widget.preview.f;
import android.widget.SeekBar;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import p79.c;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import com.yxcorp.gifshow.album.preview.c;
import com.yxcorp.gifshow.album.preview.a;
import ekd.b0;
import com.yxcorp.gifshow.album.widget.preview.c;

public final class q extends a	// class@002790
{
    public final d e;
    public int f;
    public a g;
    public boolean h;
    public boolean i;
    public int j;
    public final Observer k;
    public final l0 l;
    public final d m;
    public final AbsPreviewFragmentViewBinder n;
    public final boolean o;
    public HashMap p;
    public static final String q = "MediaPreviewSwipeP";
    public static final int r = 1;
    public static final q$a s;

    static {
       q.s = new q$a(null);
       q.q = "MediaPreviewSwipeP";
       q.r = 1;
    }
    public void q(l0 p0,d p1,MediaPreviewFragment p2,AbsPreviewFragmentViewBinder p3,boolean p4){
       a.q(p0, "mManager");
       a.q(p1, "mAlbumAssetViewModel");
       a.q(p2, "host");
       a.q(p3, "viewBinder");
       super(p2);
       this.l = p0;
       this.m = p1;
       this.n = p3;
       this.o = p4;
       this.e = new d(this.e(), p0, p1);
       this.f = -1;
       this.g = new a();
       this.h = true;
       this.k = new q$e(this);
    }
    public void b(ViewModel p0){
       MediaPreviewFragment mediaPreview;
       q oq = q.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oq, "2")) {
          return;
       }
       super.b(p0);
       PreviewViewPager previewViewP = this.n.p();
       if (previewViewP != null) {
          previewViewP.setAdapter(this.e);
       }
       previewViewP = this.n.p();
       if (previewViewP != null) {
          previewViewP.setOffscreenPageLimit(q.r);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, oq, "5")) {
          this.e.z();
          PreviewViewPager previewViewP1 = this.n.p();
          if (previewViewP1 != null) {
             previewViewP1.addOnPageChangeListener(new s(this));
          }
          previewViewP1 = this.n.p();
          if (previewViewP1 != null) {
             previewViewP1.m(this.o);
          }
          previewViewP1 = this.n.p();
          if (previewViewP1 != null) {
             previewViewP1.setIAnimClose(new t(this));
          }
          previewViewP1 = this.n.p();
          if (previewViewP1 != null) {
             previewViewP1.setAttachmentDismissListener(new u(this));
          }
          previewViewP1 = this.n.p();
          if (previewViewP1 != null) {
             previewViewP1.addOnPageChangeListener(new v(this));
          }
          this.l.A0().observe(this.e(), new w(this));
       }
       FragmentActivity activity = this.e().getActivity();
       v0 = (activity != null)? activity instanceof RxFragmentActivity: 1;
       if (activity) {
          activity = this.e().getActivity();
          if (activity != null) {
             objArray = activity;
          }else {
             throw new TypeCastException("null cannot be cast to non-null type com.trello.rxlifecycle3.components.support.RxFragmentActivity");
          }
       }
       if (objArray != null) {
          this.g.c(objArray.m().subscribe(new q$b(this), q$c.b));
       }
       if (p0 instanceof d) {
          if (p0.s0().i().b()) {
             p0.B().observe(this.e(), this.k);
          }else {
             this.l.E0().observe(this.e(), this.k);
          }
          p0.E0().observe(this.e(), new q$d(this));
       }
       return;
    }
    public void g(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       this.e.H();
       this.e.z();
       PreviewViewPager previewViewP = this.n.p();
       if (previewViewP != null) {
          previewViewP.clearOnPageChangeListeners();
       }
       previewViewP = this.n.p();
       int childCount = (previewViewP != null)? previewViewP.getChildCount(): 0;
       int i = 0;
       while (i < childCount) {
          PreviewViewPager previewViewP1 = this.n.p();
          View childAt = (previewViewP1 != null)? previewViewP1.getChildAt(i): null;
          if (!childAt instanceof ViewGroup) {
             childAt = null;
          }
          childAt = (childAt != null)? childAt.getChildAt(0): null;
          if (!childAt instanceof KsAlbumVideoPlayerView) {
             objArray = null;
          }
          if (objArray != null) {
             objArray.f();
          }
          i = i + 1;
       }
       this.g.dispose();
       return;
    }
    public final void h(boolean p0){
       float f;
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "8")) {
          return;
       }
       int i = 0;
       int i1 = this.e.j();
       while (i < i1) {
          o oo = this.e.D(i);
          if (!oo instanceof f) {
             oo = null;
          }
          if (oo != null) {
             f uof = f.class;
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), oo, uof, "17")) {
                uof = oo.b;
                if (uof != null) {
                   int i2 = 300;
                   f = 0x3f800000;
                   c.k(uof.o(), p0, i2, f);
                   c.k(oo.b.n(), p0, i2, f);
                   c.k(oo.b.v(), p0, i2, f);
                }
             }
          }
          i = i + 1;
       }
       this.i = p0;
       return;
    }
    public final void i(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "7")) {
          return;
       }
       PreviewViewPager previewViewP = this.n.p();
       int childCount = (previewViewP != null)? previewViewP.getChildCount(): 0;
       int i = 0;
       while (i < childCount) {
          PreviewViewPager previewViewP1 = this.n.p();
          View view = null;
          View childAt = (previewViewP1 != null)? previewViewP1.getChildAt(i): view;
          if (!childAt instanceof ViewGroup) {
             childAt = view;
          }
          childAt = (childAt != null)? childAt.getChildAt(0): view;
          if (childAt instanceof KsAlbumVideoPlayerView) {
             view = childAt;
          }
          if (view != null && (!PatchProxy.isSupport(KsAlbumVideoPlayerView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), view, KsAlbumVideoPlayerView.class, "25"))) {
             c.k(view.e, p0, 300, 0x3f800000);
          }
          i = i + 1;
       }
       this.i = p0;
       return;
    }
    public final void j(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "9")) {
          return;
       }
       o oo = this.e.C();
       MediaPreviewGenerateCoverManager$a uoa = PatchProxy.applyOneRefs(oo, this, oq, "12");
       if (uoa != PatchProxyResult.class) {
       }else if(oo instanceof c){
          uoa = oo.j();
          if (uoa == null) {
             a.L();
          }
       }else if(oo instanceof a){
          uoa = oo.j();
          if (uoa == null) {
             a.L();
          }
       }else {
          uoa = objArray;
       }
       boolean b = false;
       if (oo != null && uoa != null) {
          if (!oo.k()) {
             b = true;
          }
          this.e().sh(uoa.b, b, uoa.d);
       }else {
          this.e().sh(objArray, b, objArray);
       }
       return;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().getView();
    }
    public final void k(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "11")) {
          return;
       }
       o oo = this.e.C();
       int i = (p0)? 4: this.j;
       if (oo instanceof c) {
          this.j = oo.C(i);
       }
       if (oo instanceof f) {
          this.j = oo.C(i);
       }
       return;
    }
}
