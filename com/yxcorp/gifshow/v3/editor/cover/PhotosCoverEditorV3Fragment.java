package com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditor$a;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$b;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment$a;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import ppc.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Iterator;
import ei0.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.View;
import io.reactivex.subjects.PublishSubject;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.view.ViewParent;
import vpc.b;
import t36.f;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.lifecycle.ViewModel;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import upc.o;
import upc.i;
import wpc.a0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.cover.q0;

public class PhotosCoverEditorV3Fragment extends CoverEditorFragment implements CoverEditor$a	// class@000e2a
{
    public ArrayList H;
    public q0 I;
    public PhotosCoverEditorV3Fragment$b J;
    public final b K;

    public void PhotosCoverEditorV3Fragment(){
       super();
       this.H = new ArrayList();
       this.J = new PhotosCoverEditorV3Fragment$b();
       this.K = new PhotosCoverEditorV3Fragment$a(this);
       this.setArguments(new Bundle());
    }
    public void R6(){
       d.b(this);
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, PhotosCoverEditorV3Fragment.class, "7")) {
          return;
       }
       super.Z();
       d.d("postCoverMonitor").h("loadDataToRenderFinish");
       d.d("postCoverMonitor").c();
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, PhotosCoverEditorV3Fragment.class, "2")) {
          return;
       }
       this.J.e = this.t.x().d();
       Object[] objArray = new Object[]{this.J,this.G,this.hh()};
       this.I.i(objArray);
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
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotosCoverEditorV3Fragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(PhotosCoverEditorV3Fragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, PhotosCoverEditorV3Fragment.class, "4")) {
          return;
       }
       this.I.unbind();
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, PhotosCoverEditorV3Fragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PostExperimentUtils.s() || !this.q.findViewById(0x7f0a0a00).getHeight()) {
          return false;
       }
       this.J.k.onNext(Boolean.TRUE);
       return true;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PhotosCoverEditorV3Fragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       BaseEditorFragment tq = this.q;
       if (tq == null) {
          this.q = a.g(p0, 0x7f0d1144, p1, false);
       }else if(tq.getParent() != null && this.q.getParent() instanceof ViewGroup){
          this.q.getParent().removeView(this.q);
       }
       f.o0(this.K, this.t.u(), b.class);
       this.yh();
       PhotosCoverEditorV3Fragment tJ = this.J;
       tJ.b = this;
       tJ.g = ViewModelProviders.of(this.jh()).get(FontViewModel.class);
       if (!f.A(this.t.getType())) {
          i oi = new i(ViewModelProviders.of(this.t.q()).get(o.class), this, this.kh(), this.q, this.J.j, f.p0(this.t.u(), a0.class));
          this.H.add(o.class);
       }
       q0 oq0 = new q0();
       this.I = oq0;
       oq0.f(this.q);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PhotosCoverEditorV3Fragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       f.t0(this.K, this.t.u(), b.class);
       this.I.destroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotosCoverEditorV3Fragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       d.d("postCoverMonitor").h("clickToLoadData");
       d.d("postCoverMonitor").g("loadDataToRenderFinish");
       return;
    }
}
