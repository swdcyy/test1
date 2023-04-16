package com.yxcorp.gifshow.v3.editor.text.b1$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.text.b1;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import dvc.z;
import android.view.View;
import aw9.z;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.util.Objects;
import huc.b0;
import java.lang.Integer;
import jba.a;
import hvc.m;
import im8.f;
import com.yxcorp.gifshow.v3.widget.EditorTimeLineView$e;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import huc.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.Action;
import com.yxcorp.gifshow.v3.widget.gestures.TimelineAssetInfo;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.Collection;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.gifshow.widget.adv.Action$a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import huc.c0;

public class b1$b extends DecorationContainerView$e	// class@0013aa
{
    public final b1 a;

    public void b1$b(b1 p0){
       this.a = p0;
       super();
    }
    public void d(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b1$b.class, "6")) {
       }else {
          super.d(p0, p1);
          boolean b = p0.getEditTextBaseElementData().y0();
          Iterator iterator = this.a.P8(b).iterator();
          a uoa = null;
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             if (uoa1.e() == p0.getLayerIndex()) {
                uoa = uoa1;
             }
          }
          if (b) {
             this.a.T.c(p1);
          }else {
             View player = this.a.z.getPlayer();
             if (!this.a.S8() && player instanceof VideoSDKPlayerView) {
                b1 s = this.a.S;
                View view = player;
                Objects.requireNonNull(s);
                if (PatchProxy.applyVoidThreeRefs(p0, view, p1, s, b0.class, "10") || (p1 != null && (p1.equals(Integer.valueOf(10)) || (p1 != null && (!p1.equals(Integer.valueOf(11)) && (p1 != null && (!p1.equals(Integer.valueOf(19)) && s.h(p0.getDecorationId())))))))) {
                   m.a(p0.getDecorationId(), s.d, view);
                }
             }
          label_00b5 :
             this.a.S.j(null);
          }
          this.a.P8(b).remove(uoa);
          this.a.t.set(null);
          if (this.a.K.get() != null) {
             this.a.K.get().a(Lists.b());
          }
          this.a.B.onNext(new Object());
       }
       return;
    }
    public void h(BaseDrawer p0){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidOneRefs(p0, this, b1$b.class, "8")) {
       }else {
          super.h(p0);
          this.a.z.pause();
          b1$b ta = this.a;
          Objects.requireNonNull(ta);
          Object[] objArray = null;
          List list = PatchProxy.apply(objArray, ta, b1.class, "14");
          if (list != PatchProxyResult.class) {
          }else {
             list = ta.R.a();
          }
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.e() == p0.getLayerIndex()) {
                if (uoa.d().k() != p0) {
                   uoa.d().m(p0);
                }
                objArray = uoa;
             }
          }
          if (objArray != null) {
             boolean b = true;
             objArray.B(b);
             this.a.t.set(objArray);
             if (this.a.z.getPlayer() instanceof VideoSDKPlayerView && this.a.K.get() != null) {
                TimelineAssetInfo timelineAsse = this.a.S.d(p0.getDecorationId(), this.a.z.getPlayer());
                EditorTimeLineView$e uoe = this.a.K.get();
                if (timelineAsse == null) {
                   uArrayList = Lists.b();
                }else {
                   TimelineAssetInfo[] timelineAsse1 = new TimelineAssetInfo[b];
                   timelineAsse1[0] = timelineAsse;
                   uArrayList = Lists.e(timelineAsse1);
                }
                uoe.a(uArrayList);
             }
             this.a.B.onNext(new Object());
             this.a.S.j(p0);
          }else {
             i1.c(new RuntimeException("onSelect error selectedDefaultRangeData is null decorationDrawer:"+p0));
          }
       }
       return;
    }
    public void j(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b1$b.class, "3")) {
       }else if(p1 == null || !p1.equals(Integer.valueOf(12))){
          this.z(p0, p1, false, true);
          if (p1 != null && p1.equals(Integer.valueOf(15))) {
             p1 = this.a.y.x().d();
             if (p1 != this.a.u) {
                boolean b = p0.getEditTextBaseElementData().y0();
                f f = (b)? this.a.u.f: this.a.u.e;
                f f1 = (b)? p1.f: p1.e;
                f1.clear();
                f1.addAll(f);
             }
          }
       }
       return;
    }
    public void l(BaseDrawer p0){
       boolean b;
       b1$b uob = b1$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "9")) {
       }else {
          super.l(p0);
          if (this.a.t.get() == null) {
             i1.c(new RuntimeException("onSelect error selectedDefaultRangeData is null decorationDrawer:"+p0));
          }
          this.a.X8();
          if (this.a.S.i()) {
             if (this.a.z.getPlayer() instanceof VideoSDKPlayerView) {
                m.a(p0.getDecorationId(), this.a.R8(), this.a.z.getPlayer());
             }
             Object obj = PatchProxy.applyOneRefs(p0, this, uob, "10");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(p0 != null && ((p0.getText()).isEmpty() && (PostExperimentUtils.t1() && (PostExperimentUtils.u1() && this.a.N.M0())))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
             label_00a0 :
                this.a.t.get().B(false);
                this.a.t.set(null);
                if (this.a.K.get() != null) {
                   this.a.K.get().a(Lists.b());
                }
                this.a.B.onNext(new Object());
                this.a.S.j(null);
             }
          }else {
             goto label_00a0 ;
          }
       }
       return;
    }
    public void m(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b1$b.class, "7")) {
          return;
       }
       super.m(p0, p1);
       this.a.T.c(p0);
       this.a.P8(true).removeAll(this.a.P8(true));
       this.a.t.set(null);
       if (this.a.K.get() != null) {
          this.a.K.get().a(Lists.b());
       }
       this.a.B.onNext(new Object());
       return;
    }
    public void o(List p0,Object p1,int p2){
       if (PatchProxy.isSupport(b1$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b1$b.class, "2")) {
          return;
       }
       super.o(p0, p1, p2);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          EditTextBaseElement uEditTextBas = iterator.next();
          boolean b = (uEditTextBas.getEditTextBaseElementData().l0() == p2)? true: false;
          this.z(uEditTextBas, p1, b, false);
       }
       this.a.B.onNext(new Object());
       return;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b1$b.class, "1")) {
       }else {
          super.t(p0, p1);
          this.z(p0, p1, true, true);
          Object[] objArray = new Object[0];
          a.D().w("TextCommonPresenter", "onAdd decorationDrawer:"+p0+",isInSubtitle:"+this.a.V8(), objArray);
       }
       return;
    }
    public final void z(EditTextBaseElement p0,Object p1,boolean p2,boolean p3){
       b1$b uob = b1$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, b1$b.class, "4")) {
          return;
       }
       p1 = p0.getEditTextBaseElementData();
       Action$Type sUBTITLE = (p1.y0())? Action$Type.SUBTITLE: Action$Type.TEXT;
       Action$a uoa = new Action$a(sUBTITLE, p1.l0());
       uoa.b(p0);
       uoa.c(p1.m0());
       uoa.d(p1.j0());
       Action uAction = uoa.a();
       b1 obj = PatchProxy.applyTwoRefs(p1, uAction, this, uob, "5");
       if (obj != PatchProxyResult.class) {
       }else if(!p1.y0() && (this.a.getContext() == null || !this.a.z.getPlayer() instanceof VideoSDKPlayerView)){
          obj = this.a.T;
          Objects.requireNonNull(obj);
          obj = PatchProxy.applyTwoRefs(p1, uAction, obj, z.class, "3");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = new a(uAction);
          }
       }else {
          uob = this.a;
          b1 s = uob.S;
          Context context = uob.getContext();
          View view = this.a.z.getPlayer();
          Objects.requireNonNull(s);
          c0 obj1 = PatchProxy.applyFourRefs(p1, uAction, context, view, s, b0.class, "4");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else {
             obj1 = new c0(s, uAction, p1, context, view);
             obj = v7;
          }
       }
       f f = (p1.y0())? this.a.u.f: this.a.u.e;
       f.add(obj);
       if (p2) {
          this.a.t.set(obj);
       }
       if (p3) {
          this.a.B.onNext(new Object());
       }
       return;
    }
}
