package j79.x;
import s79.a;
import j79.x$a;
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
import j79.x$g;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import j79.z;
import androidx.viewpager.widget.ViewPager$i;
import j79.a0;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$d;
import ha9.c;
import j79.b0;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import j79.c0;
import androidx.fragment.app.FragmentActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import kotlin.TypeCastException;
import brd.t;
import j79.x$b;
import j79.x$c;
import erd.g;
import crd.b;
import j79.x$d;
import j79.x$e;
import j79.x$f;
import u79.a;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import u79.o;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import com.yxcorp.gifshow.album.preview.c;
import com.yxcorp.gifshow.album.preview.a;
import ekd.b0;
import java.lang.Boolean;
import com.yxcorp.gifshow.album.widget.preview.c;
import com.yxcorp.gifshow.album.widget.preview.f;

public final class x extends a	// class@00279f
{
    public final d e;
    public int f;
    public a g;
    public boolean h;
    public int i;
    public final Observer j;
    public final l0 k;
    public final d l;
    public final AbsPreviewFragmentViewBinder m;
    public final boolean n;
    public HashMap o;
    public static final String p = "PreviewSwipePresenterV2";
    public static final int q = 1;
    public static final x$a r;

    static {
       x.r = new x$a(null);
       x.p = "PreviewSwipePresenterV2";
       x.q = 1;
    }
    public void x(l0 p0,d p1,MediaPreviewFragment p2,AbsPreviewFragmentViewBinder p3,boolean p4){
       a.q(p0, "mManager");
       a.q(p1, "mAlbumAssetViewModel");
       a.q(p2, "host");
       a.q(p3, "viewBinder");
       super(p2);
       this.k = p0;
       this.l = p1;
       this.m = p3;
       this.n = p4;
       this.e = new d(this.e(), p0, p1);
       this.f = -1;
       this.g = new a();
       this.h = true;
       this.j = new x$g(this);
    }
    public void b(ViewModel p0){
       MediaPreviewFragment mediaPreview;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ox, "2")) {
          return;
       }
       super.b(p0);
       PreviewViewPager previewViewP = this.m.p();
       if (previewViewP != null) {
          previewViewP.setAdapter(this.e);
       }
       previewViewP = this.m.p();
       if (previewViewP != null) {
          previewViewP.setOffscreenPageLimit(x.q);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ox, "5")) {
          this.e.z();
          PreviewViewPager previewViewP1 = this.m.p();
          if (previewViewP1 != null) {
             previewViewP1.addOnPageChangeListener(new z(this));
          }
          previewViewP1 = this.m.p();
          if (previewViewP1 != null) {
             previewViewP1.m(this.n);
          }
          previewViewP1 = this.m.p();
          if (previewViewP1 != null) {
             previewViewP1.setIAnimClose(new a0(this));
          }
          this.k.A0().observe(this.e(), new b0(this));
          previewViewP1 = this.m.p();
          if (previewViewP1 != null) {
             previewViewP1.addOnPageChangeListener(new c0(this));
          }
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
          this.g.c(objArray.m().subscribe(new x$b(this), x$c.b));
       }
       this.g.c(this.k.H.subscribe(new x$d(this), x$e.b));
       this.k.E0().observe(this.e(), this.j);
       if (p0 instanceof d) {
          p0.E0().observe(this.e(), new x$f(this));
       }
       return;
    }
    public void g(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, x.class, "4")) {
          return;
       }
       this.e.H();
       this.e.z();
       PreviewViewPager previewViewP = this.m.p();
       if (previewViewP != null) {
          previewViewP.clearOnPageChangeListeners();
       }
       previewViewP = this.m.p();
       int childCount = (previewViewP != null)? previewViewP.getChildCount(): 0;
       int i = 0;
       while (i < childCount) {
          PreviewViewPager previewViewP1 = this.m.p();
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
    public final void h(){
       x ox = x.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox, "6")) {
          return;
       }
       o oo = this.e.C();
       Object obj = PatchProxy.applyOneRefs(oo, this, ox, "7");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(oo instanceof c){
          objArray = oo.j();
          if (objArray == null) {
             a.L();
          }
       }else if(oo instanceof a){
          objArray = oo.j();
          if (objArray == null) {
             a.L();
          }
       }
       if (oo != null && objArray != null) {
          boolean b = (!oo.k())? true: false;
          this.e().sh(objArray.b, b, objArray.d);
       }
       return;
    }
    public final void i(boolean p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ox, "8")) {
          return;
       }
       o oo = this.e.C();
       int i = (p0)? 4: this.i;
       if (oo instanceof c) {
          this.i = oo.C(i);
       }
       if (oo instanceof f) {
          this.i = oo.C(i);
       }
       return;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, x.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().getView();
    }
}
