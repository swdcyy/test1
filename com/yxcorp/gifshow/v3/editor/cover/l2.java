package com.yxcorp.gifshow.v3.editor.cover.l2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.cover.proportion.RecommendCoverViewModel;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import androidx.lifecycle.LiveData;
import faa.a;
import q87.c;
import tpc.a;
import java.lang.StringBuilder;
import ppc.l2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import ppc.m2;
import com.yxcorp.gifshow.v3.editor.cover.k2;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Float;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qaa.a;

public class l2 extends PresenterV2	// class@000e7e
{
    public boolean p;
    public Observer q;
    public RecommendCoverViewModel r;
    public PublishSubject s;
    public PublishSubject t;
    public EditorDelegate u;
    public VideoCoverEditorV3Fragment v;
    public c w;
    public a x;

    public void l2(){
       super();
       this.p = false;
       this.q = null;
    }
    public void E8(){
       boolean b1;
       l2 ol2 = l2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol2, "2")) {
          return;
       }
       this.r = ViewModelProviders.of(this.u.q()).get(RecommendCoverViewModel.class);
       boolean b = false;
       this.p = b;
       a obj = PatchProxy.apply(objArray, this, ol2, "8");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          Cover uCover = this.x.v();
          if (uCover != null && uCover.getVideoCoverParam() != null) {
             VideoCoverParam videoCoverPa = uCover.getVideoCoverParam();
             String str = (videoCoverPa.getTimePointsCount() > 0 && !videoCoverPa.getTimePoints(b))? 1: null;
             if (videoCoverPa.getCoverManualSelected() || !str) {
                b1 = false;
             }
          }
       label_0068 :
          b1 = true;
       }
       if (b1) {
          if (!PatchProxy.applyVoid(objArray, this, ol2, "4")) {
             if (this.r.q0() == null) {
                objArray = new Object[b];
                a.D().w("VideoCoverRecommendASP", "handleAutoSelectRecommendCover getScoreResult = null", objArray);
             }else {
                obj = this.r.q0().getValue();
                if (obj != null) {
                   Object[] objArray1 = new Object[b];
                   a.D().w("VideoCoverRecommendASP", "handleAutoSelectRecommendCover getScoreResult: time = "+obj.a+", progress = "+obj.b, objArray1);
                   this.P8(obj);
                }else if(PatchProxy.applyVoid(objArray, this, ol2, "5")){
                   if (this.q == null) {
                      this.q = new l2(this);
                   }
                   this.r.q0().observe(this.v, this.q);
                }
             }
          }
          this.X7(this.s.subscribe(new m2(this), k2.b));
       }
       return;
    }
    public void J8(){
       l2 ol2 = l2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol2, "3")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, this, ol2, "6") || (this.r.q0() != null && this.q != null)) {
          this.r.q0().removeObserver(this.q);
       }
    label_002d :
       return;
    }
    public final void P8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l2.class, "7")) {
          return;
       }
       this.t.onNext(Float.valueOf(p0.a()));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l2.class, "1")) {
          return;
       }
       this.s = this.r8("COVER_EDIT_CHANGE_PUBLISHER");
       this.v = this.r8("FRAGMENT");
       this.u = this.r8("EDITOR_DELEGATE");
       this.w = this.r8("WORKSPACE");
       this.x = this.r8("COVER");
       this.t = this.r8("COVER_AUTO_SELECT_RECOMMEND_PUBLISHER");
       return;
    }
}
