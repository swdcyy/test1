package com.yxcorp.gifshow.v3.editor.sticker.h0;
import com.yxcorp.gifshow.v3.editor.j;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import lnc.n1;
import itc.s1;
import erd.g;
import voc.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kuaishou.perf.page.impl.d;
import com.yxcorp.gifshow.v3.editor.sticker.StickerEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import itc.l0;
import aw9.c0;
import android.view.View;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import lq.i;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import oa0.a;
import uwc.b;
import com.yxcorp.gifshow.widget.adv.model.f;
import itc.v;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import io.reactivex.subjects.PublishSubject;

public class h0 extends j	// class@001253
{
    public final n1 t;
    public final EditDecorationContainerView u;

    public void h0(EditDecorationContainerView p0){
       super();
       this.t = new n1(new s1(this), 1000);
       this.u = p0;
    }
    public void C(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "9")) {
          return;
       }
       if (this.f != null) {
          this.T();
       }
       return;
    }
    public void D(boolean p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "6")) {
          return;
       }
       this.t.a(Boolean.valueOf(p0));
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, h0.class, "8")) {
          return;
       }
       h1.b();
       BaseEditor tf = this.f;
       if (tf != null && tf.isAdded()) {
          this.d.q().getChildFragmentManager().beginTransaction().u(this.f).m();
       }
       this.f = null;
       return;
    }
    public void H(){
       h0 oh0 = h0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh0, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oh0, "1")) {
          String str1 = f.m(this.d.getType());
          if (!TextUtils.x(str1)) {
             d.d("postStickerPanelMonitor").n();
             d.d("postStickerPanelMonitor").l(str1);
             d.d("postStickerPanelMonitor").g("clickToLoadData");
          }
       }
       c childFragmen = this.d.q().getChildFragmentManager();
       String str = "stickerEditor";
       if (this.f == null) {
          BaseEditorFragment uBaseEditorF = this.f(childFragmen, str, StickerEditorV3Fragment.class);
          this.f = uBaseEditorF;
          if (uBaseEditorF == null) {
             uBaseEditorF = new StickerEditorV3Fragment();
          }
          this.f = uBaseEditorF;
          uBaseEditorF.uh(this.d, this.i);
       }
       e uoe = childFragmen.beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       this.a(str, uoe);
       this.f.G.t = this.u;
       this.S(this.d.x(), this.d.O());
       this.T();
       h1.o();
       this.c(this.q(), true);
       if (this.d.C() instanceof PassThroughEventView && f.E(this.d.getType())) {
          this.d.C().setUndersideView(objArray);
       }
       if (i.h() && (i.g().getStickerParam().get() != null && i.m().z("STICKER_PANEL_HAS_OPEND") == null)) {
          i.m().Q("STICKER_PANEL_HAS_OPEND", Boolean.TRUE);
          a.A1((a.x0() + true));
       }
    label_00f2 :
       return;
    }
    public void Q(o p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h0.class, "12")) {
          return;
       }
       super.Q(p0, p1);
       v.b(this.u, this.q);
       return;
    }
    public void R(o p0,VideoSDKPlayerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h0.class, "11")) {
          return;
       }
       super.R(p0, p1);
       v.b(this.u, this.q);
       return;
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, h0.class, "5")) {
          return;
       }
       this.f.G.e = this.s;
       return;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, h0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 7, this.i);
    }
    public String l(){
       return "sticker";
    }
    public int q(){
       Object obj = PatchProxy.apply(null, this, h0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.i().getType() != Workspace$Type.KTV_SONG || (!this.v() || this.i().getType() == Workspace$Type.SINGLE_PICTURE)) {
          return 0x7f070383;
       }
       return 0x7f07039e;
    }
    public boolean s(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       BaseEditor obj = PatchProxy.apply(objArray, this, h0.class, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.f;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, StickerEditorV3Fragment.class, "5");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(!obj.q.findViewById(0x7f0a2eff).isShown()){
          obj.G.i.onNext(Boolean.TRUE);
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return true;
       }else {
          return super.s();
       }
    }
    public boolean y(){
       Object obj = PatchProxy.apply(null, this, h0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (f.E(this.d.getType()) ^ 0x01);
    }
}
