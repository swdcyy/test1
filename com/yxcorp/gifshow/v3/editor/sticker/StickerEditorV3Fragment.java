package com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import kuaishou.perf.page.impl.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import itc.l0;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import itc.v;
import com.yxcorp.gifshow.v3.editor.sticker.y0;
import uld.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.yxcorp.gifshow.v3.editor.sticker.c1;
import itc.q1;
import com.yxcorp.gifshow.v3.editor.sticker.f1;
import com.yxcorp.gifshow.v3.editor.sticker.t0;
import com.yxcorp.gifshow.v3.editor.sticker.tag.a;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import i2b.a;
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
import itc.b2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import oa0.a;
import itc.c2;
import ekd.q$b;
import java.util.List;
import java.util.Collection;

public class StickerEditorV3Fragment extends BaseEditorFragment	// class@001208
{
    public StickerEditorV3Fragment$a G;
    public PresenterV2 H;
    public a I;
    public static final int J;

    public void StickerEditorV3Fragment(){
       super();
       this.G = new StickerEditorV3Fragment$a(this);
    }
    public String E7(){
       return "StickerPanel";
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, StickerEditorV3Fragment.class, "9")) {
          return;
       }
       super.Z();
       d.d("postStickerPanelMonitor").h("loadDataToRenderFinish");
       d.d("postStickerPanelMonitor").c();
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, StickerEditorV3Fragment.class, "6")) {
          return;
       }
       this.H = new PresenterV2();
       h oh = this.G.e.l();
       int i = 0;
       if (f.E(this.kh().getType())) {
          v.c(this.G);
          this.H.U7(new y0());
       }else {
          StickerEditorV3Fragment tG = this.G;
          tG.p = new i(f.q(tG.e), oh.C0(i));
          this.H.U7(new c1());
       }
       this.H.U7(new q1());
       this.H.U7(new f1());
       this.H.U7(new t0());
       this.H.U7(new a());
       this.H.f(this.q);
       Object[] objArray = new Object[]{this.G,this.hh()};
       this.H.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerEditorV3Fragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(StickerEditorV3Fragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, StickerEditorV3Fragment.class, "7")) {
          return;
       }
       StickerEditorV3Fragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = null;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StickerEditorV3Fragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       StickerEditorV3Fragment tG = this.G;
       tG.v = this;
       tG.d = this.getResources().getString(0x7f1009d0);
       tG.c = "stickerEditor";
       this.q = a.g(p0, 0x7f0d04c2, p1, false);
       if (!PatchProxy.applyVoid(null, this, StickerEditorV3Fragment.class, "3")) {
          a uoa = ViewModelProviders.of(this.kh().getContext(), new b(new EditStickerRepo())).get(a.class);
          this.I = uoa;
          if (uoa.s0().getValue() != null && this.I.s0().getValue().intValue() == 2) {
             this.yh();
          }else {
             this.I.s0().observe(this, new b2(this));
             this.I.o0();
          }
       }
       this.fh();
       a.F0(true);
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, StickerEditorV3Fragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.gh();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerEditorV3Fragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       d.d("postStickerPanelMonitor").h("clickToLoadData");
       d.d("postStickerPanelMonitor").g("loadDataToRenderFinish");
       return;
    }
    public final void yh(){
       if (PatchProxy.applyVoid(null, this, StickerEditorV3Fragment.class, "4")) {
          return;
       }
       this.G.g.addAll(this.I.r0(new c2(this)));
       return;
    }
}
