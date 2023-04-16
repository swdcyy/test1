package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor$a;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorV3Fragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.Objects;
import tpc.e0;
import kotlin.jvm.internal.a;
import tpc.v;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.util.Set;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ei0.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.View;
import io.reactivex.subjects.PublishSubject;
import android.os.Bundle;
import tpc.f0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kuaishou.ax2c.PreLoader;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import android.view.ViewParent;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import h69.j;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.cover.proportion.a;
import java.util.LinkedHashSet;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import upc.o;
import upc.i;
import wpc.a0;
import t36.f;
import tpc.p;
import android.app.Activity;
import android.content.Intent;

public class VideoCoverEditorV3Fragment extends CoverEditorFragment implements CoverEditor$a	// class@000e34
{
    public ArrayList H;
    public List I;
    public VideoCoverEditorPresenter J;
    public VideoCoverEditorV3Fragment$a K;
    public e0 L;

    public void VideoCoverEditorV3Fragment(){
       super();
       this.H = new ArrayList();
       this.I = new ArrayList();
       this.K = new VideoCoverEditorV3Fragment$a(this);
    }
    public void R6(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorV3Fragment.class, "8")) {
          return;
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().R6();
       }
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorV3Fragment.class, "3")) {
          return;
       }
       this.K.d = this.t.x().d();
       VideoCoverEditorV3Fragment tL = this.L;
       VideoCoverEditorV3Fragment$a d = this.K.d;
       Objects.requireNonNull(tL);
       if (!PatchProxy.applyVoidOneRefs(d, tL, e0.class, "8")) {
          String str = "timelineSavedData";
          a.p(d, str);
          e0 i = tL.i;
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoidOneRefs(d, i, v.class, "16")) {
             a.p(d, str);
             i.g = d;
          }
       }
       BaseEditorFragment$d uod = this.hh();
       uod.b = this.qh();
       Object[] objArray = new Object[]{this,this.K,this.G,uod};
       this.J.i(objArray);
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoCoverEditorV3Fragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VideoCoverEditorV3Fragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorV3Fragment.class, "4")) {
          return;
       }
       this.J.unbind();
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, VideoCoverEditorV3Fragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PostExperimentUtils.s() || !this.q.findViewById(0x7f0a0a00).getHeight()) {
          return false;
       }
       this.K.i.onNext(Boolean.TRUE);
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverEditorV3Fragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.L = ViewModelProviders.of(this, new f0(this.hh().f, this.t.x().d())).get(e0.class);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoCoverEditorV3Fragment.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       BaseEditorFragment tq = this.q;
       boolean b = false;
       if (tq == null) {
          this.q = PreLoader.getInstance().getOrWait(this.jh(), 0x7f0d0231, p1, b);
       }else if(tq.getParent() != null && this.q.getParent() instanceof ViewGroup){
          this.q.getParent().removeView(this.q);
       }
       this.yh();
       VideoCoverEditorV3Fragment tK = this.K;
       tK.b = this;
       tK.e = ViewModelProviders.of(this.getActivity()).get(FontViewModel.class);
       if (PostExperimentUtils.c0() || j.j(this.t.N())) {
          b = true;
       }
       VideoCoverEditorPresenter videoCoverEd = new VideoCoverEditorPresenter(b);
       this.J = videoCoverEd;
       videoCoverEd.f(this.q);
       VideoCoverProportionViewBinder videoCoverPr = new VideoCoverProportionViewBinder(this, this.q, this.t, this.qh(), this.L, this.K.g, this.I);
       this.H.add(this.q);
       this.H.add(new a(this, this.q, this.kh(), this.qh()));
       if (!f.A(this.t.getType())) {
          i oi = new i(ViewModelProviders.of(this.t.q()).get(o.class), this, this.kh(), this.q, this.K.g, f.p0(this.t.u(), a0.class));
          this.H.add(o.class);
       }
       p op = new p(this, this.q, this.t, this.L, this.qh(), this.K.g);
       this.H.add(o.class);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorV3Fragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       this.J.destroy();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorV3Fragment.class, "6")) {
          return;
       }
       super.onPause();
       this.t.getContext().getIntent().putExtra("enableShowRecommendCoverToast", false);
       return;
    }
}
