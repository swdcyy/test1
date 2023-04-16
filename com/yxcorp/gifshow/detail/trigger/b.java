package com.yxcorp.gifshow.detail.trigger.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.trigger.b$a;
import com.yxcorp.gifshow.detail.trigger.b$b;
import com.yxcorp.gifshow.detail.trigger.b$c;
import com.yxcorp.gifshow.detail.trigger.b$d;
import com.yxcorp.gifshow.detail.trigger.b$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$b;
import java.util.Objects;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$e;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$Action;
import java.util.HashSet;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import io.reactivex.subjects.PublishSubject;
import im8.f;
import mrd.c;
import l9a.a;
import brd.t;
import mhc.j;
import com.kwai.framework.model.feed.BaseFeed;
import cda.b;
import com.yxcorp.gifshow.event.CommentsEvent;
import android.app.Activity;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import dda.g;
import m66.a;
import mhc.y1;
import zca.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gz5.b;
import z8a.c;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import mhc.o2;
import ohc.k;

public class b extends PresenterV2	// class@001a23
{
    public c A;
    public List B;
    public List C;
    public t D;
    public t E;
    public List F;
    public SlidePlayViewModel G;
    public long H;
    public List I;
    public final d J;
    public f K;
    public final IMediaPlayer$OnInfoListener L;
    public final t0 M;
    public final t0 N;
    public final a O;
    public final String p;
    public QPhoto q;
    public PhotoDetailParam r;
    public a s;
    public BaseFragment t;
    public a u;
    public PublishSubject v;
    public f w;
    public List x;
    public PublishSubject y;
    public c z;

    public void b(){
       super();
       this.p = "MORE";
       this.F = new ArrayList();
       this.J = new b$a(this);
       this.L = new b$b(this);
       this.M = new b$c(this);
       this.N = new b$d(this);
       this.O = new b$e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.t.getParentFragment());
       this.G = slidePlayVie;
       slidePlayVie.P(this.t, this.O);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       this.G.D(this.t, this.O);
       return;
    }
    public void P8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "18")) {
          return;
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          ActionTrigger$b uob1 = iterator.next().c();
          Objects.requireNonNull(uob1);
          ActionTrigger$b uob2 = ActionTrigger$b.class;
          if (PatchProxy.isSupport(uob2) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob1, uob2, "5") && uob1.a.b.h.get(p0))) {
             uob1.a.b.h.clear(p0);
             if (!uob1.a.d()) {
                uob1.a.b();
             }
          }
       }
       return;
    }
    public void R8(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "17")) {
          return;
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          ActionTrigger$b uob1 = iterator.next().c();
          Objects.requireNonNull(uob1);
          ActionTrigger$b uob2 = ActionTrigger$b.class;
          if (PatchProxy.isSupport(uob2) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob1, uob2, "3") && !uob1.a.b.h.get(p0))) {
             uob1.a.b.h.set(p0);
             if (uob1.a.d()) {
                uob1.a.a();
                ActionTrigger h = uob1.a.h;
                if (h != null) {
                   h.a(p0);
                }
             }
          }
       }
       return;
    }
    public void S8(ActionTrigger$Action p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "7")) {
          return;
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          ActionTrigger$b uob = iterator.next().c();
          Objects.requireNonNull(uob);
          if (PatchProxy.applyVoidOneRefs(p0, uob, ActionTrigger$b.class, "4")) {
             continue ;
          }else {
             uob.a.b.g.add(p0);
             uob.a.b();
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(PhotoDetailParam.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.u = this.q8(a.class);
       this.v = this.r8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       this.w = this.x8("SLIDE_PLAY_CLOSE_STATE");
       this.x = this.r8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.y = this.r8("SHOW_SHORT_WEAK_BOTTOM_BAR");
       this.z = this.t8("THANOS_CLEAR_SCREEN");
       this.s = this.r8("COMMON_ACTION_TRIGGER_HOLDER");
       this.A = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       this.B = this.t8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       this.C = this.t8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       this.I = this.s.a;
       this.D = this.t8("LONG_ATLAS_OPEN_STATE_CHANGE_OBSERVER");
       this.E = this.t8("FEATURED_LONG_ATLAS_OPEN");
       return;
    }
    public void onDownloadForwardEvent(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       if (p0.a() != null && p0.a().equals(this.q.mEntity)) {
          this.S8(ActionTrigger$Action.SHARE);
       }
       return;
    }
    public void onMainThread(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       if (p0.a == 1 && this.q.equals(p0.b)) {
          this.S8(ActionTrigger$Action.COLLECT);
       }
       return;
    }
    public void onMainThread(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       if (this.q.equals(p0.b) && (this.getActivity() != null && p0.a == this.getActivity().hashCode())) {
          p0 = p0.c;
          if (p0 == CommentsEvent$Operation.ADD || p0 == CommentsEvent$Operation.ADD_SUB) {
             this.S8(ActionTrigger$Action.COMMENT);
          }
       }
       return;
    }
    public void onMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       if (this.q.getEntity() != null && (this.q.getEntity().equals(p0.a) && this.q.isLiked())) {
          this.S8(ActionTrigger$Action.LIKE);
       }
    label_002e :
       return;
    }
    public void onMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       if (p0.a != null) {
          this.R8(6);
       }else {
          this.P8(6);
       }
       return;
    }
    public void onMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       if (p0.a != null && TextUtils.n(p0.b, this.q.getPhotoId())) {
          this.S8(ActionTrigger$Action.DOWNLOAD);
       }
       return;
    }
    public void onRewardEvent(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       if (this.q.equals(p0.a)) {
          this.S8(ActionTrigger$Action.REWARD);
       }
       return;
    }
    public void onShareEvent(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "9")) {
          return;
       }
       if (p0.a() == 1002 && (o2.k(p0.c().mActionUrl) && (!("MORE").equals(p0.c().mId) && this.q.equals(p0.b().K())))) {
          this.S8(ActionTrigger$Action.SHARE);
       }
    label_0042 :
       return;
    }
}
