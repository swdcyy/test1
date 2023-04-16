package com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$a;
import nsd.u;
import java.util.BitSet;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$mUiHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$b;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import g50.c;
import e50.m;
import com.kuaishou.eve.kit.rerank.config.RankABParam;
import java.util.List;
import java.util.Collection;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import pf5.b;
import erd.r;
import brd.t;
import pf5.c;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import vy6.a;
import l66.c;
import dda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$onBind$1;
import pf5.a;
import msd.l;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import io.reactivex.subjects.PublishSubject;

public final class EveRankExtraTriggerPresenter extends PresenterV2	// class@000a9e
{
    public final EveRankExtraTriggerPresenter$b A;
    public final Runnable B;
    public QPhoto p;
    public User q;
    public f r;
    public BaseFragment s;
    public PublishSubject t;
    public m u;
    public SlidePlayViewModel v;
    public long w;
    public BitSet x;
    public final List y;
    public final p z;
    public static final EveRankExtraTriggerPresenter$a C;

    static {
       EveRankExtraTriggerPresenter.C = new EveRankExtraTriggerPresenter$a(null);
    }
    public void EveRankExtraTriggerPresenter(){
       super();
       this.x = new BitSet();
       this.y = new ArrayList();
       this.z = s.c(EveRankExtraTriggerPresenter$mUiHandler$2.INSTANCE);
       this.A = new EveRankExtraTriggerPresenter$b(this);
       this.B = new EveRankExtraTriggerPresenter$c(this);
    }
    public void E8(){
       EveRankExtraTriggerPresenter uEveRankExtr = EveRankExtraTriggerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEveRankExtr, "11")) {
          return;
       }
       EveRankExtraTriggerPresenter tu = this.u;
       if (tu == null) {
          return;
       }
       a.m(tu);
       List extraTrigger = tu.d().c().getExtraTriggers();
       if (extraTrigger != null) {
          this.y.addAll(extraTrigger);
          EveLog.d$default("EveRankExtraTriggerPresenter: "+this.y, false, 2, objArray);
          tu = this.s;
          String str = "mFragment";
          if (tu == null) {
             a.S(str);
          }
          Fragment parentFragme = tu.getParentFragment();
          if (parentFragme != null) {
             a.o(parentFragme, "mFragment.parentFragment ?: return");
             this.v = SlidePlayViewModel.B0(parentFragme);
             if (this.y.contains(Integer.valueOf(5)) && !PatchProxy.applyVoid(objArray, this, uEveRankExtr, "13")) {
                uEveRankExtr = this.t;
                if (uEveRankExtr == null) {
                   a.S("mProfileTrigger");
                }
                this.X7(uEveRankExtr.filter(new b(this)).map(new c(this)).subscribe(Functions.d(), Functions.d()));
             }
             uEveRankExtr = this.v;
             if (uEveRankExtr != null) {
                EveRankExtraTriggerPresenter ts = this.s;
                if (ts == null) {
                   a.S(str);
                }
                uEveRankExtr.P(ts, this.A);
             }
             this.X7(c.a().c(l.class, RxBus$ThreadMode.MAIN, new a(new EveRankExtraTriggerPresenter$onBind$1(this))));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, EveRankExtraTriggerPresenter.class, "12")) {
          return;
       }
       EveRankExtraTriggerPresenter tv = this.v;
       if (tv != null) {
          EveRankExtraTriggerPresenter ts = this.s;
          if (ts == null) {
             a.S("mFragment");
          }
          tv.D(ts, this.A);
       }
       this.y.clear();
       return;
    }
    public final Handler P8(){
       Object obj = PatchProxy.apply(null, this, EveRankExtraTriggerPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, EveRankExtraTriggerPresenter.class, "10")) {
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
       this.u = this.t8("rerank_controller");
       Object obj1 = this.r8("SLIDE_PLAY_PROFILE_PUBLISHER");
       a.o(obj1, "inject\(AccessIds.SLIDE_PLAY_PROFILE_PUBLISHER\)");
       this.t = obj1;
       return;
    }
}
