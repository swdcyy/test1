package com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.sticker.SinglePicStickerEditorFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import kuaishou.perf.page.impl.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import wpc.b;
import uwc.b;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.p0;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import qtc.b;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qtc.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import itc.j0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import oa0.a;
import itc.k0;
import ekd.q$b;
import java.util.Collection;

public class SinglePicStickerEditorFragment extends BaseEditorFragment	// class@001206
{
    public SinglePicStickerEditorFragment$a G;
    public PresenterV2 H;
    public a I;
    public static final int J;

    public void SinglePicStickerEditorFragment(){
       super();
       this.G = new SinglePicStickerEditorFragment$a(this);
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, SinglePicStickerEditorFragment.class, "9")) {
          return;
       }
       super.Z();
       d.d("postStickerPanelMonitor").h("loadDataToRenderFinish");
       d.d("postStickerPanelMonitor").c();
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, SinglePicStickerEditorFragment.class, "6")) {
          return;
       }
       this.H = new PresenterV2();
       h oh = this.G.d.l();
       if (this.G.d.i() == null) {
          i1.c(new RuntimeException("SinglePicStickerEditor attach presenter failed, getTimelineSavedData = null"));
       }
       SinglePicStickerEditorFragment tG = this.G;
       tG.i = new b(tG.d.b(), oh.w0());
       this.H.U7(new p0());
       this.H.f(this.q);
       Object[] objArray = new Object[]{this.G,this.hh()};
       this.H.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SinglePicStickerEditorFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SinglePicStickerEditorFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, SinglePicStickerEditorFragment.class, "7")) {
          return;
       }
       SinglePicStickerEditorFragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = null;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SinglePicStickerEditorFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       p2.b = this;
       this.q = a.g(p0, 0x7f0d0511, p1, false);
       if (!PatchProxy.applyVoid(null, this, SinglePicStickerEditorFragment.class, "3")) {
          a uoa = ViewModelProviders.of(this.kh().getContext(), new b(new EditStickerRepo())).get(a.class);
          this.I = uoa;
          if (uoa.s0().getValue() != null && this.I.s0().getValue().intValue() == 2) {
             this.yh();
          }else {
             this.I.s0().observe(this, new j0(this));
             this.I.o0();
          }
       }
       this.fh();
       a.F0(true);
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SinglePicStickerEditorFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.gh();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SinglePicStickerEditorFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       d.d("postStickerPanelMonitor").h("clickToLoadData");
       d.d("postStickerPanelMonitor").g("loadDataToRenderFinish");
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, SinglePicStickerEditorFragment.class, "4")) {
          return;
       }
       this.G.f.addAll(this.I.r0(new k0(this)));
       return;
    }
}
