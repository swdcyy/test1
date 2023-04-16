package com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$a;
import nsd.u;
import com.kwai.framework.model.user.User$FollowStatus;
import java.util.BitSet;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$mUiHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$b;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e50.m;
import java.util.Objects;
import ff6.d;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import g50.c;
import com.kuaishou.eve.kit.rerank.config.RankABParam;
import java.util.Collection;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.FragmentActivity;
import hf6.b;
import hf6.b$a;
import java.lang.Integer;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import pf5.h;
import erd.r;
import pf5.i;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import pf5.j;
import pf5.k;
import com.kwai.framework.model.user.User;
import pf5.f;
import pf5.g;
import vy6.a;
import lnc.u1;
import wkd.b;
import l66.a;
import l66.c;
import dda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$onBind$3;
import pf5.e;
import msd.l;
import im8.f;
import android.os.Handler;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import j50.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.util.Map;
import pf5.d;
import com.kuaishou.eve.kit.rerank.BizPage;
import j50.b;

public final class RankExtraTriggerPresenter extends PresenterV2	// class@000aa4
{
    public BitSet A;
    public final List B;
    public final p C;
    public final RankExtraTriggerPresenter$b D;
    public final Runnable E;
    public QPhoto p;
    public User q;
    public f r;
    public BaseFragment s;
    public PublishSubject t;
    public d u;
    public boolean v;
    public User$FollowStatus w;
    public b x;
    public SlidePlayViewModel y;
    public long z;
    public static final RankExtraTriggerPresenter$a F;

    static {
       RankExtraTriggerPresenter.F = new RankExtraTriggerPresenter$a(null);
    }
    public void RankExtraTriggerPresenter(){
       super();
       this.w = User$FollowStatus.UNFOLLOW;
       this.A = new BitSet();
       this.B = new ArrayList();
       this.C = s.c(RankExtraTriggerPresenter$mUiHandler$2.INSTANCE);
       this.D = new RankExtraTriggerPresenter$b(this);
       this.E = new RankExtraTriggerPresenter$c(this);
    }
    public void E8(){
       RankExtraTriggerPresenter rankExtraTri = RankExtraTriggerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, rankExtraTri, "11")) {
          return;
       }
       RankExtraTriggerPresenter tu = this.u;
       if (tu != null) {
          a.m(tu);
          if (tu.isEnabled()) {
             tu = this.u;
             a.m(tu);
             Objects.requireNonNull(tu);
             List list = PatchProxy.apply(objArray, tu, d.class, "4");
             if (list != PatchProxyResult.class) {
             }else {
                list = tu.d().c().getExtraTriggers();
             }
             if (list != null) {
                this.B.addAll(list);
                tu = this.s;
                String str = "mFragment";
                if (tu == null) {
                   a.S(str);
                }
                Fragment parentFragme = tu.getParentFragment();
                if (parentFragme != null) {
                   a.o(parentFragme, "mFragment.parentFragment ?: return");
                   this.y = SlidePlayViewModel.B0(parentFragme);
                   FragmentActivity activity = parentFragme.getActivity();
                   if (activity != null) {
                      a.o(activity, "it");
                      this.x = b.b.a(activity);
                   }
                   if (this.B.contains(Integer.valueOf(1)) && !PatchProxy.applyVoid(objArray, this, rankExtraTri, "14")) {
                      tu = this.p;
                      if (tu == null) {
                         a.S("mPhoto");
                      }
                      PhotoMeta photoMeta = tu.getPhotoMeta();
                      if (photoMeta != null) {
                         a.o(photoMeta, "mPhoto.photoMeta ?: return");
                         this.v = photoMeta.isLiked();
                         this.X7(photoMeta.observable().filter(new h(this)).flatMap(new i(this)).subscribe(Functions.d(), Functions.d()));
                      }
                   }
                label_00c7 :
                   if (this.B.contains(Integer.valueOf(5)) && !PatchProxy.applyVoid(objArray, this, rankExtraTri, "13")) {
                      tu = this.t;
                      if (tu == null) {
                         a.S("mProfileTrigger");
                      }
                      this.X7(tu.filter(new j(this)).flatMap(new k(this)).subscribe(Functions.d(), Functions.d()));
                   }
                   tu = this.y;
                   if (tu != null) {
                      if (!tu.C() || (this.B.contains(Integer.valueOf(3)) && !PatchProxy.applyVoid(objArray, this, rankExtraTri, "15"))) {
                         rankExtraTri = this.q;
                         String str1 = "mUser";
                         if (rankExtraTri == null) {
                            a.S(str1);
                         }
                         User mFollowStatu = rankExtraTri.mFollowStatus;
                         a.o(mFollowStatu, "mUser.mFollowStatus");
                         this.w = mFollowStatu;
                         rankExtraTri = this.q;
                         if (rankExtraTri == null) {
                            a.S(str1);
                         }
                         this.X7(rankExtraTri.observable().filter(new f(this)).flatMap(new g(this)).subscribe(Functions.d(), Functions.d()));
                      }
                   label_0165 :
                      rankExtraTri = this.s;
                      if (rankExtraTri == null) {
                         a.S(str);
                      }
                      tu.P(rankExtraTri, this.D);
                   }
                   u1.a(this);
                   b.a(0x6d2a4fdd).a(this);
                   this.X7(c.a().c(l.class, RxBus$ThreadMode.MAIN, new e(new RankExtraTriggerPresenter$onBind$3(this))));
                }
             }
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RankExtraTriggerPresenter.class, "12")) {
          return;
       }
       u1.b(this);
       b.a(0x6d2a4fdd).c(this);
       RankExtraTriggerPresenter ty = this.y;
       if (ty != null) {
          RankExtraTriggerPresenter ts = this.s;
          if (ts == null) {
             a.S("mFragment");
          }
          ty.D(ts, this.D);
       }
       this.B.clear();
       return;
    }
    public final f P8(){
       RankExtraTriggerPresenter obj = PatchProxy.apply(null, this, RankExtraTriggerPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mLogger");
       }
       return obj;
    }
    public final QPhoto R8(){
       RankExtraTriggerPresenter obj = PatchProxy.apply(null, this, RankExtraTriggerPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final Handler S8(){
       Object obj = PatchProxy.apply(null, this, RankExtraTriggerPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public void j8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RankExtraTriggerPresenter.class, "10")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.s = obj;
       obj = this.x8("DETAIL_LOGGER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_LOGGER\)");
       this.r = obj;
       Object obj1 = this.t8("rerank_controller");
       if (obj1 instanceof d) {
          objArray = obj1;
       }
       this.u = objArray;
       obj1 = this.r8("SLIDE_PLAY_PROFILE_PUBLISHER");
       a.o(obj1, "inject\(AccessIds.SLIDE_PLAY_PROFILE_PUBLISHER\)");
       this.t = obj1;
       return;
    }
    public final void onComment(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RankExtraTriggerPresenter.class, "16")) {
          return;
       }
       a.p(p0, "event");
       RankExtraTriggerPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if ((a.g(tp, p0.b) ^ 0x01) || (this.B.contains(Integer.valueOf(4)) && p0.c == CommentsEvent$Operation.ADD)) {
          RankExtraTriggerPresenter tx = this.x;
          if (tx != null) {
             RankExtraTriggerPresenter tp1 = this.p;
             if (tp1 == null) {
                a.S(str);
             }
             QPhoto mEntity = tp1.mEntity;
             a.o(mEntity, "mPhoto.mEntity");
             e uoe = new e(mEntity);
             tp1 = this.r;
             if (tp1 == null) {
                a.S("mLogger");
             }
             Object obj = tp1.get();
             RankExtraTriggerPresenter tp2 = this.p;
             if (tp2 == null) {
                a.S(str);
             }
             uoe.h(d.a(obj, tp2, 0, 0, 12, null));
             RankExtraTriggerPresenter tu = this.u;
             a.m(tu);
             tx.o0(tu.b().getBizId(), "user_feature", uoe);
             tx = this.u;
             a.m(tx);
             tx.a(4).subscribe(Functions.d(), Functions.d());
          }
       }
       return;
    }
}
