package com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;
import c35.i;
import c35.c;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment$a;
import java.lang.String;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcorp.gifshow.v3.editor.text.vb.AbsTextEditorFragmentVB;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.app.Activity;
import q46.t;
import qxc.c;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import kuaishou.perf.page.impl.d;
import voc.o;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.model.f;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import androidx.lifecycle.ViewModel;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.text.b1;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.f;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import wpc.b;
import uwc.b;
import java.util.List;
import io.reactivex.subjects.PublishSubject;
import zpc.j;
import uld.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import uld.z;
import uld.s;
import com.yxcorp.gifshow.v3.editor.text.n0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import huc.t;
import java.lang.Boolean;
import h80.c;
import h80.k;
import h80.m;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import com.yxcorp.gifshow.v3.editor.text.subtitle.r;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter;
import com.kuaishou.viewbinder.BaseViewBinder;

public class TextEditorV3Fragment extends BaseEditorFragment implements i, c	// class@0013a3
{
    public TextEditorV3Fragment$a G;
    public PresenterV2 H;

    public void TextEditorV3Fragment(){
       super();
       this.G = new TextEditorV3Fragment$a(this);
    }
    public String E7(){
       return "TextPanel";
    }
    public IViewBinder O1(){
       return this.yh();
    }
    public IViewBinder V5(int p0){
       AbsTextEditorFragmentVB uAbsTextEdit;
       if (PatchProxy.isSupport(TextEditorV3Fragment.class)) {
          uAbsTextEdit = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TextEditorV3Fragment.class, "1");
          if (uAbsTextEdit != PatchProxyResult.class) {
          label_002f :
             return uAbsTextEdit;
          }
       }
       uAbsTextEdit = c.a(t.c(this.getActivity().getIntent()), AbsTextEditorFragmentVB.class, this);
       goto label_002f ;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, TextEditorV3Fragment.class, "7")) {
          return;
       }
       super.Z();
       d.d("postTextPanelMonitor").h("loadDataToRenderFinish");
       d.d("postTextPanelMonitor").c();
       return;
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, TextEditorV3Fragment.class, "4")) {
          return;
       }
       this.G.q = this.t.x().d();
       this.G.m.l();
       Object[] objArray = new Object[]{this.G,this.hh()};
       this.H.i(objArray);
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextEditorV3Fragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(TextEditorV3Fragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, TextEditorV3Fragment.class, "5")) {
          return;
       }
       this.H.unbind();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TextEditorV3Fragment tG1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextEditorV3Fragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       TextEditorV3Fragment tG = this.G;
       tG.b = this;
       tG.e = this.getResources().getString(0x7f104c2a);
       tG.g = new b(p.i(this.kh().getType()));
       tG.w = ViewModelProviders.of(this.jh()).get(FontViewModel.class);
       boolean b = false;
       this.q = a.g(p0, 0x7f0d04c3, p1, b);
       PresenterV2 presenterV2 = new PresenterV2();
       this.H = presenterV2;
       presenterV2.U7(new b1());
       h oh = this.G.f.l();
       if (f.E(this.kh().getType())) {
          if (this.G.f.i() == null) {
             i1.c(new RuntimeException("textEditor attach presenter failed, getTimelineSavedData = null"));
             tG1 = this.G;
             tG1.m = new b(tG1.f.b(), oh.w0());
          }else {
             tG1 = this.G;
             tG1.m = new b(tG1.f.b(), oh.w0());
          }
          oh.r = PublishSubject.g();
          this.H.U7(new j());
       }else {
          tG1 = this.G;
          tG1.m = new i(f.q(tG1.f), oh.C0(b));
          this.H.U7(new z());
          this.H.U7(new s());
       }
       this.H.U7(new n0(this.yh()));
       Workspace$Type type = this.kh().N().a1();
       tG1 = PatchProxy.applyOneRefs(type, null, t.class, "1");
       if (tG1 != PatchProxyResult.class) {
          b = tG1.booleanValue();
       }else if(k.a().b().i != null && (type != Workspace$Type.ATLAS && (type != Workspace$Type.LONG_PICTURE && (type != Workspace$Type.SINGLE_PICTURE && (type != Workspace$Type.KTV_MV && (type == Workspace$Type.KTV_SONG || type == Workspace$Type.PHOTO_MOVIE)))))){
          b = true;
       }
    label_0144 :
       if (b) {
          this.H.U7(new SubtitleTextPresenter());
       }
       if (p.i(this.kh().getType())) {
          this.H.U7(new r());
       }
       this.H.U7(new ReEditCoverPresenter());
       this.H.f(this.q);
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, TextEditorV3Fragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       TextEditorV3Fragment tH = this.H;
       if (tH != null) {
          tH.destroy();
          this.H = null;
       }
       this.yh().onDestroy();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextEditorV3Fragment.class, "3")) {
          return;
       }
       d.d("postTextPanelMonitor").h("clickToLoadData");
       d.d("postTextPanelMonitor").g("loadDataToRenderFinish");
       super.onViewCreated(p0, p1);
       return;
    }
    public AbsTextEditorFragmentVB yh(){
       return this.n;
    }
}
