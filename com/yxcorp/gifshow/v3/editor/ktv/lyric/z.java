package com.yxcorp.gifshow.v3.editor.ktv.lyric.z;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z$a;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z$b;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z$c;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.z$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uaa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import hba.a;
import java.util.Set;
import dvc.g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import aw9.c0;
import pwc.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.y;
import di0.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mrd.c;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import im8.f;
import lnc.a1;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import android.view.View;
import com.yxcorp.utility.n;
import drc.g;
import drc.d;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import drc.h;
import lq.f;
import drc.f;
import com.trello.rxlifecycle3.components.support.RxFragment;
import drc.e;
import faa.a;
import q87.c;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import drc.c;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.a0;
import dvc.c0;
import android.widget.LinearLayout;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.model.Lyrics$Line;
import evc.b$a;
import brd.y;
import drc.i;
import erd.r;
import drc.j;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.FrameLayout;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import drc.a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import drc.o;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.ktv.lyric.KtvLyricEditorFragment;
import aw9.z;

public class z extends PresenterV2 implements g	// class@000fef
{
    public PublishSubject A;
    public f B;
    public f C;
    public KtvLyricEditorFragment D;
    public f E;
    public EditorDelegate F;
    public z G;
    public a H;
    public PublishSubject I;
    public f J;
    public PublishSubject K;
    public EditDecorationContainerView$b L;
    public Boolean M;
    public FontViewModel N;
    public KtvInfo O;
    public EditDecorationContainerView P;
    public Observer Q;
    public SubtitleHelper R;
    public c S;
    public AttrAnimProgressFragment T;
    public TextElementViewModel U;
    public c U0;
    public VideoSDKPlayerView V;
    public VideoSDKPlayerView$e V0;
    public boolean W;
    public y W0;
    public g X;
    public boolean Y;
    public Runnable Z;
    public RecyclerView p;
    public View q;
    public ExpandFoldHelperView r;
    public FrameLayout s;
    public LinearLayout t;
    public LinearLayout u;
    public SelectShapeLinearLayout v;
    public c w;
    public b x;
    public i y;
    public Set z;

    public void z(){
       super();
       this.L = new z$a(this);
       this.M = Boolean.FALSE;
       this.S = PublishSubject.g();
       this.Y = true;
       this.Z = new z$b(this);
       this.U0 = PublishSubject.g();
       this.V0 = new z$c(this);
       this.W0 = new z$d(this);
    }
    public void E8(){
       z oz = z.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz, "4")) {
          return;
       }
       this.w.E0().c0();
       this.w.E0().g0().c0();
       this.z.add(this.W0);
       this.X.f(this.w);
       this.P.setEnableDecorationView(false);
       this.P.Q(false);
       this.V = this.y.f().O().a();
       TextElementViewModel textElementV = k1.c(this.y.f(), false);
       this.U = textElementV;
       int b = true;
       textElementV.k1(b);
       this.R8();
       this.U.X0(this.w.E0().g0(), b);
       this.N.D0();
       if (this.Q == null) {
          this.Q = new y(this);
          this.U.R0().observe(this.D, this.Q);
       }
       SubtitleHelper subtitleHelp = new SubtitleHelper(this.S, this.y.f(), this.B, this.y.k(), this.w, this.X);
       this.R = textElementV;
       if (!PatchProxy.applyVoid(objArray, this, oz, "5")) {
          this.C.set(Action$Type.SUBTITLE);
          this.r.setTitle(a1.p(R.string.arg_RES_7f101b3d));
          b = 8;
          n.Y(this.v, b, false);
          n.Y(this.s, false, false);
          n.Y(this.p, b, false);
          n.Y(this.t, false, false);
          n.Y(this.u, b, false);
          n.Y(this.t, false, false);
       }
       String str = "KtvLyricEditPresenter";
       if (!PatchProxy.applyVoid(objArray, this, oz, "8")) {
          this.X7(this.S.subscribe(new g(this), new d(this)));
          this.X7(this.x.h.subscribe(new h(this), f.b));
          this.X7(this.K.subscribe(new f(this)));
          this.X7(this.D.m().subscribe(new e(this)));
          Object[] objArray1 = new Object[false];
          a.D().w(str, "initPublisher", objArray1);
       }
       this.X7(this.U0.throttleFirst(200, TimeUnit.MICROSECONDS).observeOn(d.a).subscribe(new c(this), f.b));
       this.V.setPreviewEventListener(str, this.V0);
       if (this.Y != null) {
          ViewModelProviders.of(this.D.getActivity()).get(DynamicTextViewModel.class).w0();
          this.Y = false;
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       this.U7(new a0());
       this.U7(new c0());
       this.X = new g();
       return;
    }
    public void J8(){
       z oz = z.class;
       if (PatchProxy.applyVoid(null, this, oz, "13")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, oz, "12")) {
          this.P.setEnableDecorationView(true);
          this.P.Q(true);
          this.W = false;
          this.R.c();
          this.U.R0().removeObserver(this.Q);
       }
       this.V.setPreviewEventListener("KtvLyricEditPresenter", null);
       return;
    }
    public final void P8(){
       z oz = z.class;
       if (PatchProxy.applyVoid(null, this, oz, "10")) {
          return;
       }
       boolean b = false;
       this.u.setEnabled(b);
       z tO = this.O;
       if (!PatchProxy.applyVoidOneRefs(tO, this, oz, "11")) {
          this.V.pause();
          ArrayList uArrayList = new ArrayList();
          if (tO != null && (tO.getClipLyric() != null && (tO.getClipLyric().mLines != null && tO.getClipLyric().mLines.size() > 0))) {
             if (tO.getKaraokeType() != 1) {
                b = true;
             }
             int realBegin = (b)? tO.getRealBegin(): tO.mSingStart;
             KtvInfo mSingDuratio = (b)? tO.mSingDuration: tO.mSingEnd - tO.mSingStart;
             Iterator iterator = tO.getClipLyric().mLines.iterator();
             while (iterator.hasNext()) {
                Lyrics$Line line = iterator.next();
                int i = line.mStart - realBegin;
                int i1 = line.mDuration + i;
                if (i1 > mSingDuratio) {
                   i1 = mSingDuratio;
                }
                if (i < i1) {
                   b$a uoa = new b$a();
                   uoa.f(line.mText);
                   i = i / 1000;
                   uoa.e((float)i);
                   i1 = i1 / 1000;
                   uoa.d((float)i1);
                   uArrayList.add(uoa);
                }
             }
          }
       label_009a :
          this.X.e(uArrayList);
          this.R.b.onNext(uArrayList);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, z.class, "7")) {
          return;
       }
       if (this.U.T0()) {
          return;
       }
       boolean b = false;
       boolean b1 = (this.C.get() == Action$Type.SUBTITLE)? true: false;
       this.P.c0(new i(b1), b);
       this.P.c0(new j(b1), true);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, z.class, "9")) {
          return;
       }
       z tT = this.T;
       if (tT != null) {
          tT.dismiss();
       }
       this.u.setEnabled(true);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a28e0);
       this.p = m1.f(p0, 0x7f0a0a70);
       this.u = m1.f(p0, 0x7f0a2894);
       this.r = m1.f(p0, 0x7f0a2eff);
       this.s = m1.f(p0, 0x7f0a0ee1);
       this.q = m1.f(p0, 0x7f0a163d);
       this.v = m1.f(p0, 0x7f0a289f);
       m1.a(p0, new a(this), R.id.ll_auto_add_subtitle);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, z.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(z.class, new o());
       }else {
          obj.put(z.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.w = this.r8("WORKSPACE");
       this.x = this.r8("EDITOR_SUBTITLE_LIST_MANAGER");
       this.y = this.r8("EDITOR_HELPER_CONTRACT");
       this.z = this.r8("EDITOR_VIEW_LISTENERS");
       this.A = this.r8("DECORATION_TIMELINE_UPDATE");
       this.B = this.r8("TIME_LINE_SAVE_DATA");
       this.C = this.x8("TEXT_TYPE");
       this.D = this.r8("FRAGMENT");
       this.E = this.x8("DECORATION_EDITING_ACTION");
       this.F = this.r8("EDITOR_DELEGATE");
       this.G = this.r8("DECORATION_PLAYER");
       this.H = this.r8("TEXT");
       this.I = this.r8("COVER_OUTFILE_EVENT");
       this.J = this.x8("DECORATION_IMPL");
       this.K = this.r8("TEXT_RESTORE_FINISH_EVENT");
       this.N = this.r8("FONT_VIEW_MODEL");
       this.O = this.t8("KTV_INFO");
       this.P = this.r8("DECORATION_CONTAINER_VIEW");
       return;
    }
}
