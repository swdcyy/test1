package com.yxcorp.gifshow.detail.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.presenter.j$a;
import y4a.s;
import y4a.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import m9a.y;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.mix.TubeMeta;
import com.yxcorp.gifshow.tube.TubeInfo;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import nm6.e;
import vy6.a;
import java.util.List;
import ekd.y0;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import rd5.e;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.android.model.mix.PosterSpecialEffect;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.Long;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class j extends PresenterV2	// class@0016dc
{
    public final b$b A;
    public final IMediaPlayer$OnInfoListener B;
    public PublishSubject p;
    public QPhoto q;
    public a r;
    public e s;
    public PhotoDetailParam t;
    public List u;
    public SlidePlayViewModel v;
    public BaseFragment w;
    public MilanoContainerEventBus x;
    public final a y;
    public y0 z;

    public void j(){
       super();
       this.y = new j$a(this);
       this.A = new s(this);
       this.B = new t(this);
    }
    public void E8(){
       boolean b;
       boolean b1;
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "2")) {
          return;
       }
       this.v = SlidePlayViewModel.B0(this.w.getParentFragment());
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(objArray, this, oj, "3");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!y.a(this.q)){
          obj = PatchProxy.apply(objArray, this, oj, "4");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(this.q.getPlcEntryStyleInfo() != null || !this.q.isNoNeedToRequestPlcEntryStyleInfo()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1 && !this.t.mPhoto.enableMissYou()) {
             Object obj1 = PatchProxy.apply(objArray, this, oj, "7");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(this.q.getTubeMeta() != null && (this.q.getTubeMeta().mTubeInfo != null && this.q.getTubeMeta().mTubeInfo.mTubeId != null)){
                b = true;
             }else {
                b = false;
             }
             if (!b && e.a(this.q) == null) {
                b = false;
             }
          }
       }
    label_00a0 :
       b = true;
       if (b) {
          oj = this.v;
          if (oj != null) {
             oj.P(this.w, this.y);
          }else {
             oj = this.u;
             if (oj != null) {
                oj.add(this.y);
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       j tz = this.z;
       if (tz != null) {
          tz.e();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       long currentPosit = this.r.getPlayer().getCurrentPosition();
       long duration = this.r.getPlayer().getDuration();
       if (!duration - null) {
          return;
       }
       j ts = this.s;
       ts.a = currentPosit;
       ts.b = duration;
       this.p.onNext(ts);
       j oj = (this.q.getPosterSpecialEffect() == null || (this.q.getPosterSpecialEffect().mHighLightTimePhoto != null || this.t.isSearchEpisodeSerial()))? 1: null;
       if (oj) {
          oj = this.x;
          if (oj != null) {
             oj.U.onNext(Long.valueOf(currentPosit));
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, j.class, "9")) {
          return;
       }
       j tz = this.z;
       if (tz != null) {
          tz.d();
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, j.class, "10")) {
          return;
       }
       j tz = this.z;
       if (tz != null) {
          tz.e();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_PROCESS_EVENT");
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(a.class);
       this.s = this.q8(e.class);
       this.t = this.q8(PhotoDetailParam.class);
       this.u = this.t8("DETAIL_ATTACH_LISTENERS");
       this.w = this.r8("DETAIL_FRAGMENT");
       this.x = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
