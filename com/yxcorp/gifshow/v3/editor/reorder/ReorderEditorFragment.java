package com.yxcorp.gifshow.v3.editor.reorder.ReorderEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.Iterator;
import ei0.a;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import i2b.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.yxcorp.gifshow.v3.editor.reorder.ReorderEditorFragment$a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import ooc.h1;

public class ReorderEditorFragment extends BaseEditorFragment	// class@0011ac
{
    public ReorderViewModel G;
    public ArrayList H;
    public i I;

    public void ReorderEditorFragment(){
       super();
       this.H = new ArrayList();
    }
    public String E7(){
       return "Sort";
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, ReorderEditorFragment.class, "4")) {
          return;
       }
       this.qh().add(this.G);
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
       Object obj = PatchProxy.applyOneRefs(p0, this, ReorderEditorFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ReorderEditorFragment.class, null);
       return objectsByTag;
    }
    public String getTitle(){
       Object obj = PatchProxy.apply(null, this, ReorderEditorFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f100b70);
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, ReorderEditorFragment.class, "5")) {
          return;
       }
       this.qh().remove(this.G);
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       return;
    }
    public int lh(){
       return 0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReorderEditorFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       p2 = PatchProxy.apply(null, this, ReorderEditorFragment.class, "2");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(PostExperimentUtils.U()){
          i = 0x7f0d04bf;
       }else {
          i = 0x7f0d04be;
       }
       View view = a.g(p0, i, p1, false);
       this.q = view;
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReorderEditorFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.G = ViewModelProviders.of(this, new ReorderEditorFragment$a(this)).get(ReorderViewModel.class);
       ReorderPanelViewBinder reorderPanel = new ReorderPanelViewBinder(this, p0, this.I.b(), this.G, this.I.f());
       this.H.add(ViewModelProviders.of(this, new ReorderEditorFragment$a(this)).get(ReorderViewModel.class));
       this.H.add(new h1(this, this.q));
       this.fh();
       return;
    }
}
