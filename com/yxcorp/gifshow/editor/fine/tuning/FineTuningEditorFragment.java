package com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$b;
import java.util.ArrayList;
import com.yxcorp.gifshow.editor.fine.tuning.FineTuningEditorFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import ei0.a;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import fca.c;
import com.yxcorp.gifshow.editor.fine.tuning.l;
import erd.g;
import crd.b;
import brd.t;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.i;
import wpc.b;
import uwc.b;
import java.util.List;
import zpc.j;
import kca.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.editor.fine.tuning.vm.FineTuningViewModel;
import androidx.lifecycle.ViewModel;
import jca.a;
import rwc.j;

public class FineTuningEditorFragment extends BaseEditorFragment	// class@001b9b
{
    public FineTuningEditorFragment$b G;
    public PresenterV2 H;
    public FineTuningViewModel I;
    public ArrayList J;
    public final Runnable K;
    public static final int L;

    public void FineTuningEditorFragment(){
       super();
       this.G = new FineTuningEditorFragment$b(this);
       this.J = new ArrayList();
       this.K = new FineTuningEditorFragment$a(this);
    }
    public String E7(){
       return "Tune";
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, FineTuningEditorFragment.class, "3")) {
          return;
       }
       this.qh().add(this.I);
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       this.q.post(this.K);
       Object[] objArray = new Object[]{this.G,this.hh()};
       this.H.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FineTuningEditorFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FineTuningEditorFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, FineTuningEditorFragment.class, "4")) {
          return;
       }
       Iterator iterator = this.J.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.qh().remove(this.I);
       this.H.unbind();
       this.q.removeCallbacks(this.K);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FineTuningEditorFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d04b9, p1, false);
       this.q = view;
       return view;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FineTuningEditorFragment.class, "5")) {
          return;
       }
       super.onDestroyView();
       FineTuningEditorFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = objArray;
       }
       this.q.removeCallbacks(this.K);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FineTuningEditorFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       FineTuningEditorFragment tG = this.G;
       tG.b = this;
       tG.d = this.getResources().getString(0x7f100b6e);
       this.G.i.subscribe(new c(this), l.b);
       FineTuningEditorFragment tG1 = this.G;
       tG1.g = new b(tG1.e.b(), this.G.e.l().w0());
       PresenterV2 presenterV2 = new PresenterV2();
       this.H = presenterV2;
       presenterV2.U7(new j());
       this.H.f(this.q);
       FineTuningViewModel uFineTuningV = ViewModelProviders.of(this, new b(this.t.N(), this.G.e.b())).get(FineTuningViewModel.class);
       this.I = uFineTuningV;
       this.J.add(new a(this, p0, uFineTuningV, this.G.j));
       this.fh();
       return;
    }
    public void yh(i p0){
       this.G.e = p0;
    }
}
