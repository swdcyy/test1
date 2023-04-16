package f0a.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f0a.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.i;
import java.util.Objects;
import f0a.d;
import android.view.View;
import qvb.q;
import qvb.a;
import qvb.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Runnable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class c extends PresenterV2	// class@00226b
{
    public PhotoDetailParam p;
    public Runnable q;
    public BaseFragment r;
    public View s;
    public View t;
    public View u;
    public d v;
    public SlidePlayViewModel w;
    public final q x;

    public void c(){
       super();
       this.x = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tp = this.p;
       if (tp == null) {
          a.S("mPhotoDetailParam");
       }
       b uob = b.e(tp.mSlidePlayId);
       if (uob != null) {
          a.o(uob, "SlidePlayDataFetcherImpl\x20\x02m.mSlidePlayId\) ?: return\x00");
          c tr = this.r;
          if (tr == null) {
             a.S("mFragment");
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(tr);
          this.w = slidePlayVie;
          if (slidePlayVie == null) {
             return;
          }else {
             i oi = uob.M7();
             Objects.requireNonNull(oi, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.findclassmate.SchoolFindClassmatesPageList");
             this.v = oi;
             tp = this.s;
             if (tp != null) {
                tp.setVisibility(0);
             }
             tp = this.v;
             if (tp != null) {
                tp.h(this.x);
             }
             tp = this.v;
             if (tp != null) {
                tp.A1();
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tv = this.v;
       if (tv != null) {
          tv.f(this.x);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       View view = null;
       View view1 = (p0 != null)? p0.findViewById(R.id.fragment_loading_progress): view;
       this.s = view1;
       view1 = (p0 != null)? p0.findViewById(R.id.slide_play_view_pager): view;
       this.t = view1;
       if (p0 != null) {
          View view2 = p0.findViewById(R.id.nasa_groot_view_pager);
          if (view2 != null) {
             view = view2;
          }else if(p0 != null){
             view = p0.findViewById(R.id.nasa_groot_view_pager);
          }
       }else {
          goto label_0033 ;
       }
       this.u = view;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       Object obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FLOW_END_LISTENER");
       a.o(obj, "inject\(AccessIds.DETAIL_FLOW_END_LISTENER\)");
       this.q = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.r = obj;
       return;
    }
}
