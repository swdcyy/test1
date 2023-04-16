package n7a.f;
import n7a.a;
import n7a.f$a;
import n7a.f$b;
import n7a.f$c;
import n7a.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jta.c;
import r7a.f;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup;
import uc6.c;
import sd5.d;
import o7a.e;
import android.app.Activity;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import ekd.j;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import o7a.d;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import n7a.e;
import erd.g;
import crd.b;
import brd.t;
import n7a.c;
import n7a.d;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import nm6.e;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo$Frame;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import ekd.m1;
import sd5.c;
import im8.a;
import io.reactivex.subjects.PublishSubject;

public class f extends a	// class@0030f9
{
    public PublishSubject A;
    public List B;
    public boolean C;
    public long D;
    public boolean E;
    public RecyclerView F;
    public String G;
    public RecyclerView$r H;
    public RecyclerView$o I;
    public d J;
    public final t0 K;
    public final c L;
    public final ViewTreeObserver$OnPreDrawListener M;
    public final e N;
    public List v;
    public List w;
    public t x;
    public f y;
    public PublishSubject z;

    public void f(){
       super();
       this.K = new f$a(this);
       this.L = new f$b(this);
       this.M = new f$c(this);
       this.N = new b(this);
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "4")) {
          return;
       }
       super.J8();
       this.y.c(this.L);
       this.v.remove(this.K);
       this.w.remove(this.K);
       this.B.remove(this.N);
       f tF = this.F;
       if (tF != null) {
          f tI = this.I;
          if (tI != null) {
             tF.removeOnChildAttachStateChangeListener(tI);
          }
          tF = this.H;
          if (tF != null) {
             this.F.removeOnScrollListener(tF);
          }
       }
       this.F = objArray;
       this.I = objArray;
       this.H = objArray;
       this.G = objArray;
       this.u = objArray;
       View view = this.m8().findViewById(R.id.poster);
       if (view != null && view.getViewTreeObserver().isAlive()) {
          view.getViewTreeObserver().removeOnPreDrawListener(this.M);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       int i = this.p.isImageType() ^ 0x01;
       View view = this.m8().findViewById(R.id.player);
       if (!view instanceof ViewGroup) {
          return;
       }
       if (!this.W8(this.p)) {
          View view1 = (i)? this.J.N().m(): this.m8().findViewById(R.id.poster);
          e uoe = new e(this.getActivity(), view, view1, this.m8().findViewById(0x7f0a3e7f), this.p, this.s);
          this.u = view1;
          if (this.p.isSinglePhoto()) {
             f uof = null;
             if (this.p.getDetailRealAspectRatio() - uof > 0) {
                ImageMeta$SinglePicture singlePictur = this.p.getSinglePicture();
                if (!j.h(singlePictur.mSize)) {
                   singlePictur = singlePictur.mSize;
                   if (singlePictur[0].mHeight - uof > 0 && singlePictur[0].mWidth - uof > 0) {
                      this.B.add(this.N);
                   }
                }
             }
          }
          this.u.i();
       }else {
          Log.g("SlidePlayDetailTagStick", "photo is fake atlas: "+this.p);
       }
       this.y.a(this.L);
       this.v.add(this.K);
       this.w.add(this.K);
       this.X7(this.x.subscribe(new e(this)));
       if (this.W8(this.p) && this.z != null) {
          f tA = this.A;
          if (tA != null) {
             this.X7(tA.subscribe(new c(this)));
             this.X7(this.z.subscribe(new d(this)));
          }
       }
       return;
    }
    public boolean S8(long p0){
       Iterator obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uof, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (e.a(this.p) == null) {
          return false;
       }else if(this.p.isImageType()){
          if (this.W8(this.p)) {
             return this.E;
          }else {
             return (this.X8() ^ 1);
          }
       }else if(q.f(e.a(this.p).mFrames)){
          return false;
       }else {
          obj = e.a(this.p).mFrames.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return false;
             }
             TagStickerInfo$Frame uFrame = obj.next();
             double d = (double)p0;
             double d1 = uFrame.startTime * 0x408f400000000000;
             if (d - d1 >= 0) {
                d1 = uFrame.endTime * 0x408f400000000000;
                if (d - d1 <= 0) {
                   break ;
                }
             }
          }
          return 1;
       }
    }
    public final ViewGroup V8(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() == null) {
          return objArray;
       }
       return this.getActivity().findViewById(0x1020002);
    }
    public final boolean W8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isAtlasPhotos() || p0.isLongPhotos())? true: false;
       return b;
    }
    public boolean X8(){
       a obj = PatchProxy.apply(null, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.t;
       boolean b = (obj != null && obj.r())? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.J = uod;
       this.W7(uod);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       super.i2();
       if (!this.W8(this.p) && (this.p.isImageType() && (this.u != null && !this.X8()))) {
          this.u.setEnabled(true);
       }
    label_002f :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       super.j8();
       this.v = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       this.w = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       this.x = this.r8("DETAIL_PROCESS_EVENT");
       this.y = this.r8("NASA_SIDEBAR_STATUS");
       this.z = this.t8("FEATURED_LONG_ATLAS_OPEN");
       this.A = this.t8("SLIDE_PLAY_ATLAS_RV_ID");
       this.B = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       return;
    }
}
