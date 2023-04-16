package com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter$a;
import nsd.u;
import com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter$taskManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.kuaishou.growth.taskcenter.presenter.LivePreviewTaskWatcherPresenter$b;
import erd.g;
import crd.b;
import java.lang.Boolean;
import yt5.f;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;

public final class LivePreviewTaskWatcherPresenter extends PresenterV2	// class@00075c
{
    public final p p;
    public BaseFragment q;
    public QPhoto r;
    public static final LivePreviewTaskWatcherPresenter$a s;

    static {
       LivePreviewTaskWatcherPresenter.s = new LivePreviewTaskWatcherPresenter$a(null);
    }
    public void LivePreviewTaskWatcherPresenter(){
       super();
       this.p = s.c(LivePreviewTaskWatcherPresenter$taskManager$2.INSTANCE);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewTaskWatcherPresenter.class, "3")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "LivePreviewTaskWatcherPresenter", "onBind", false, 4, null);
       LivePreviewTaskWatcherPresenter tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       this.X7(tq.Vg().g().subscribe(new LivePreviewTaskWatcherPresenter$b(this)));
       tq = this.q;
       if (tq == null) {
          a.S("mFragment");
       }
       this.P8(tq.Vg().a());
       return;
    }
    public final void P8(boolean p0){
       f uof;
       Activity activity;
       LivePreviewTaskWatcherPresenter tr;
       LivePreviewTaskWatcherPresenter livePreviewT = LivePreviewTaskWatcherPresenter.class;
       if (PatchProxy.isSupport(livePreviewT) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, livePreviewT, "4")) {
          return;
       }
       String str = "mPhoto";
       if (p0) {
          uof = this.R8();
          activity = this.getActivity();
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          uof.a(activity, tr.getEntity());
          uof = this.R8();
          activity = this.getActivity();
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          uof.b(activity, tr.getEntity());
       }else {
          uof = this.R8();
          activity = this.getActivity();
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          uof.c(activity, tr.getEntity());
       }
       return;
    }
    public final f R8(){
       Object obj = PatchProxy.apply(null, this, LivePreviewTaskWatcherPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewTaskWatcherPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       return;
    }
}
