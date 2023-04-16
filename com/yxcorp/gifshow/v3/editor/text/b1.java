package com.yxcorp.gifshow.v3.editor.text.b1;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.text.b1$a;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.b1$b;
import com.yxcorp.gifshow.v3.editor.text.b1$c;
import huc.z0;
import com.yxcorp.gifshow.v3.editor.text.b1$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import wpc.a0;
import t36.f;
import java.util.Set;
import com.yxcorp.gifshow.decoration.widget.f$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.text.y0;
import com.yxcorp.gifshow.decoration.widget.f$b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Objects;
import java.util.LinkedList;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import hba.a;
import com.yxcorp.gifshow.v3.editor.text.b1$e;
import im8.f;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import tyc.f2;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import huc.x0;
import com.yxcorp.gifshow.v3.editor.text.z0;
import erd.g;
import crd.b;
import brd.t;
import huc.b0;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import dvc.z;
import android.widget.LinearLayout;
import faa.a;
import q87.c;
import jba.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Tts;
import java.util.concurrent.CountDownLatch;
import huc.v0;
import java.lang.Runnable;
import t45.c;
import android.view.View;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import huc.y0;
import com.yxcorp.gifshow.v3.editor.text.a1;
import com.yxcorp.gifshow.v3.editor.text.element.c;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.v3.editor.text.tts.e$c;
import com.yxcorp.gifshow.v3.editor.text.tts.g;
import java.lang.StringBuilder;
import com.kwai.chat.sdk.signal.f;
import com.yxcorp.gifshow.v3.editor.text.tts.e;
import j85.e;
import zt7.d;
import java.io.FileOutputStream;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import haa.a;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.tts.TTSFragment;
import aw9.z;
import com.yxcorp.gifshow.activity.GifshowActivity;
import huc.w0;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Integer;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.widget.adv.Action;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.edit.draft.TtsAudio;
import a17.c$a;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.util.Collections;
import com.yxcorp.gifshow.v3.editor.text.x0;
import a17.b$b;
import com.yxcorp.gifshow.v3.editor.text.w0;
import a17.b$a;
import a17.f;
import com.yxcorp.gifshow.v3.editor.text.b1$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c$b;
import a17.c;
import ekd.m1;
import huc.j1;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public class b1 extends PresenterV2 implements g	// class@0013b1
{
    public PublishSubject A;
    public PublishSubject B;
    public a C;
    public Set D;
    public f E;
    public PublishSubject F;
    public PublishSubject G;
    public EditDecorationContainerView$b H;
    public Boolean I;
    public FontViewModel J;
    public f K;
    public EditDecorationContainerView L;
    public PublishSubject M;
    public TextElementViewModel N;
    public boolean O;
    public boolean P;
    public TTSFragment Q;
    public a R;
    public b0 S;
    public z T;
    public EditorSdk2V2$AudioAsset[] U;
    public y U0;
    public Tts V;
    public final r V0;
    public CountDownLatch W;
    public final a0 W0;
    public AttrAnimProgressFragment X;
    public f2 X0;
    public c Y;
    public DecorationContainerView$e Z;
    public LinearLayout p;
    public LinearLayout q;
    public TextEditorV3Fragment r;
    public c s;
    public f t;
    public f u;
    public f v;
    public t w;
    public i x;
    public EditorDelegate y;
    public z z;

    public void b1(){
       super();
       this.G = PublishSubject.g();
       this.H = new b1$a(this);
       this.I = Boolean.FALSE;
       this.O = true;
       this.P = false;
       this.W = null;
       this.Y = null;
       this.Z = new b1$b(this);
       this.U0 = new b1$c(this);
       this.V0 = new z0(this);
       this.W0 = new b1$d(this);
    }
    public void E8(){
       b1 uob1 = b1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob1, "11")) {
          return;
       }
       this.C.c0();
       f.o0(this.W0, this.y.u(), a0.class);
       this.D.add(this.U0);
       b1 tL = this.L;
       f$a uoa = new f$a();
       boolean b = (this.y.getType() != Workspace$Type.SINGLE_PICTURE && (this.y.getType() != Workspace$Type.KTV_SONG && !f.E(this.y.getType())))? true: false;
       uoa.b(b);
       uoa.a(false);
       uoa.c(a1.p(R.string.arg_RES_7f105058));
       uoa.d(false);
       tL.X(uoa, y0.a);
       tL = this.L;
       b1 tZ = this.Z;
       Objects.requireNonNull(tL);
       if (!PatchProxy.applyVoidOneRefs(tZ, tL, DecorationContainerView.class, "28") && tZ != null) {
          tL.m.remove(tZ);
          tL.m.add(false, tZ);
       }
       TextElementViewModel textElementV = k1.c(this.y, this.I.booleanValue());
       this.N = textElementV;
       textElementV.X0(this.C, false);
       this.E.set(new b1$e(this));
       this.J.D0();
       if (this.X0 == null) {
          this.X0 = new f2(this.y.getContext(), this.N.I0());
       }
       this.X0.d();
       this.X7(this.w.subscribe(new x0(this), z0.b));
       this.S = new b0(this.u, this.K, this.s, this.v);
       this.T = new z(this.u, this.p, this.q);
       tL = (this.V8())? this.T: this.S;
       this.R = tL;
       if (!this.S8()) {
          if (!PatchProxy.applyVoid(objArray, this, uob1, "6")) {
             Object[] objArray1 = new Object[false];
             a.D().w("TextCommonPresenter", "saveOriginTtsDraft: ", objArray1);
             if (this.R8().v() == null) {
                objArray1 = new Object[false];
                a.D().w("TextCommonPresenter", "saveOriginTtsDraft:  ttsdraft is null", objArray1);
                this.V = objArray;
             }else if(!this.R8().v().getTtsAudiosCount()){
                objArray1 = new Object[false];
                a.D().w("TextCommonPresenter", "saveOriginTtsDraft:  ttsdraft size is 0", objArray1);
                this.V = objArray;
             }else {
                this.W = new CountDownLatch(1);
                c.a(new v0(this));
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uob1, "4")) {
             this.U = this.y.z().getVideoProject().audioAssets().toNormalArray();
          }
       }
       this.X7(this.G.subscribe(new y0(this), a1.b));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "10")) {
          return;
       }
       this.U7(new c());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "19")) {
          return;
       }
       if (this.C.D() && p.i(this.s.a1())) {
          this.C.j();
       }
       f.t0(this.W0, this.y.u(), a0.class);
       this.L.M(this.Z);
       this.D.remove(this.U0);
       b1 tX0 = this.X0;
       if (tX0 != null) {
          tX0.b();
          this.X0 = null;
       }
       tX0 = this.Y;
       if (tX0 != null) {
          tX0.o();
          this.Y = null;
       }
       tX0 = this.S;
       Objects.requireNonNull(tX0);
       if (!PatchProxy.applyVoid(null, tX0, b0.class, "1")) {
          tX0.c();
          b0 i = tX0.i;
          if (i != null) {
             i.l(null);
             i = tX0.i;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoid(null, i, g.class, "2")) {
                Object[] objArray = new Object[0];
                a.D().w("TtsDownloadManager", "destroy: "+i, objArray);
                f.e().w(i.e);
                i.a.p();
                if (!i.a.c()) {
                   i.a.h();
                   i.b(i.b, i.c);
                }
                i.a.a();
                i.a = null;
                i.e = null;
                i.j = null;
                i.i.set(0);
                i.g = null;
                i.h();
                i.f = null;
             }
             tX0.i = null;
          }
       }
       this.S = null;
       this.T = null;
       this.R = null;
       return;
    }
    public List P8(boolean p0){
       f f = (p0)? this.u.f: this.u.e;
       return f;
    }
    public a R8(){
       Object obj = PatchProxy.apply(null, this, b1.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t(this.s);
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, b1.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.s.a1());
    }
    public boolean V8(){
       Object obj = PatchProxy.apply(null, this, b1.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.v.get() == Action$Type.SUBTITLE)? true: false;
       return b;
    }
    public void W8(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "3")) {
          return;
       }
       if (this.Q == null) {
          this.Q = new TTSFragment();
       }
       b1 tQ = this.Q;
       tQ.m = this.s;
       tQ.o = this.x;
       tQ.eh(this.S.f());
       VideoSDKPlayerView player = this.z.getPlayer();
       if (player.isPlaying()) {
          player.pause();
       }
       tQ = this.Q;
       Activity uActivity = this.getActivity();
       w0 ow0 = new w0(this, p0);
       String decorationId = p0.getDecorationId();
       Objects.requireNonNull(tQ);
       if (!PatchProxy.isSupport(TTSFragment.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(0x7f0a40a0), uActivity, ow0, decorationId, tQ, TTSFragment.class, "9")) {
          tQ.p = ow0;
          tQ.q = decorationId;
          Object[] objArray = new Object[0];
          a.D().w("ttsFragment", "showFragmentWithCallback: decorationId = "+decorationId, objArray);
          if (!PatchProxy.isSupport(TTSFragment.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(0x7f0a40a0), uActivity, tQ, TTSFragment.class, "8")) {
             c supportFragm = uActivity.getSupportFragmentManager();
             e uoe = supportFragm.beginTransaction();
             uoe.y(R.anim.arg_RES_7f010133, 0x7f010134);
             if (tQ.isAdded()) {
                uoe.E(tQ);
             }else {
                Fragment uFragment = supportFragm.findFragmentByTag("ttsFragment");
                if (uFragment != null) {
                   uoe.u(uFragment);
                }
                uoe.g(R.id.tts_container, tQ, "ttsFragment");
             }
             uoe.m();
          }
       }
       return;
    }
    public void X8(){
       boolean b;
       Object[] objArray = null;
       String str = "12";
       if (PatchProxy.applyVoid(objArray, this, b1.class, str)) {
          return;
       }
       if (this.t.get() == null || (this.getActivity() != null && this.P == null)) {
          EditDecorationBaseDrawer uEditDecorat = this.t.get().d().k();
          b1 tS = this.S;
          Objects.requireNonNull(tS);
          b0 obj = PatchProxy.apply(objArray, tS, b0.class, str);
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tS.h;
             if (obj == null) {
                b = false;
             }else {
                b0 g = tS.g;
                if (g == null) {
                   tS.g = obj.getText();
                   b = TextUtils.x(tS.h.getText()) ^ 0x01;
                }else {
                   b = g.equals(obj.getText()) ^ 0x01;
                   tS.g = tS.h.getText();
                }
             }
          }
          if (!b || (uEditDecorat != null && this.S.e(uEditDecorat.getDecorationId()) != null)) {
             if (this.S.i()) {
                return;
             }else {
                c$a uoa = new c$a(this.getActivity());
                uoa.l0(R.string.arg_RES_7f100cbc);
                uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f100cb9), SheetItemStatus.Primary)));
                uoa.g0(R.string.cancel);
                uoa.i0(new x0(this));
                uoa.d0(w0.a);
                this.Y = f.a(uoa).Y(new b1$f(this));
             }
          }
       }
    label_00d9 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2894);
       this.p = m1.f(p0, 0x7f0a28e0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b1.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b1.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b1.class, new j1());
       }else {
          obj.put(b1.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b1.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("WORKSPACE");
       this.t = this.x8("DECORATION_EDITING_ACTION");
       this.u = this.r8("TIME_LINE_SAVE_DATA");
       this.v = this.x8("TEXT_TYPE");
       this.w = this.r8("SWITCH_TEXT_TAB_EVENT");
       this.x = this.r8("EDITOR_HELPER_CONTRACT");
       this.y = this.r8("EDITOR_DELEGATE");
       this.z = this.r8("DECORATION_PLAYER");
       this.A = this.r8("COVER_OUTFILE_EVENT");
       this.B = this.r8("DECORATION_TIMELINE_UPDATE");
       this.C = this.r8("TEXT");
       this.D = this.r8("EDITOR_VIEW_LISTENERS");
       this.E = this.x8("DECORATION_IMPL");
       this.F = this.r8("TEXT_RESTORE_FINISH_EVENT");
       this.J = this.r8("FONT_VIEW_MODEL");
       this.K = this.x8("TIMELINE_DELEGATE");
       this.L = this.r8("DECORATION_CONTAINER_VIEW");
       this.M = this.r8("CLICK_ADD_TEXT_BUTTON");
       return;
    }
}
