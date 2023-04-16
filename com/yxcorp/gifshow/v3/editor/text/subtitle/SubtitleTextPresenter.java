package com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter$a;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter$b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleTextPresenter$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import dvc.g;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import aw9.c0;
import pwc.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b0;
import di0.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import oa0.a;
import android.content.SharedPreferences;
import lnc.a1;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$BackgroundColorType;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment;
import java.lang.Integer;
import java.lang.Long;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import android.widget.RadioButton;
import android.widget.FrameLayout;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import com.yxcorp.utility.n;
import im8.f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.util.List;
import dvc.n0;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import com.yxcorp.gifshow.v3.editor.text.subtitle.SubtitleHelper;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mrd.c;
import dvc.f0;
import dvc.q0;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import dvc.g0;
import com.yxcorp.gifshow.v3.editor.text.subtitle.t;
import t45.d;
import brd.z;
import dvc.h0;
import erd.o;
import dvc.o0;
import dvc.r0;
import dvc.e0;
import com.yxcorp.gifshow.v3.editor.text.subtitle.u;
import com.trello.rxlifecycle3.components.support.RxFragment;
import dvc.p0;
import com.yxcorp.gifshow.v3.editor.text.subtitle.v;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.v3.editor.text.i0;
import kotlin.jvm.internal.a;
import xuc.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import dvc.c0;
import com.kuaishou.edit.draft.Workspace$Type;
import dvc.s0;
import e17.i;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import k2b.e0;
import k2b.s;
import huc.n1;
import android.app.Activity;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import dvc.k0;
import android.view.View$OnClickListener;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.KwaiDialogFragment;
import dvc.m0;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import dvc.x;
import kuaishou.perf.page.impl.d;
import android.os.SystemClock;
import com.yxcorp.gifshow.v3.editor.text.subtitle.k;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils$AssetIdType;
import com.yxcorp.gifshow.edit.previewer.utils.AudioAssetUtils;
import yaa.c;
import prc.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$AudioFilterParam;
import android.util.Pair;
import dvc.i;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.editor.text.subtitle.o;
import dvc.t;
import dvc.s;
import crd.a;
import dvc.i0;
import erd.r;
import dvc.j0;
import brd.y;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import wba.h0;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import com.yxcorp.gifshow.v3.editor.text.subtitle.w;
import ekd.m1;
import dvc.d0;
import com.yxcorp.gifshow.v3.editor.text.subtitle.a0;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;

public class SubtitleTextPresenter extends PresenterV2	// class@00148e
{
    public i A;
    public Set B;
    public PublishSubject C;
    public f D;
    public f E;
    public PublishSubject F;
    public PublishSubject G;
    public TextEditorV3Fragment H;
    public f I;
    public EditDecorationContainerView J;
    public Observer K;
    public SubtitleHelper L;
    public c M;
    public AttrAnimProgressFragment N;
    public TextElementViewModel O;
    public VideoSDKPlayerView P;
    public boolean Q;
    public g R;
    public boolean S;
    public DecorationContainerView$e T;
    public y U;
    public final b V;
    public ExpandFoldHelperView p;
    public PostRadioGroupWithIndicator q;
    public RadioButton r;
    public RadioButton s;
    public FrameLayout t;
    public LinearLayout u;
    public LinearLayout v;
    public LinearLayout w;
    public Boolean x;
    public c y;
    public b z;

    public void SubtitleTextPresenter(){
       super();
       this.x = Boolean.FALSE;
       this.M = PublishSubject.g();
       this.S = true;
       this.T = new SubtitleTextPresenter$a(this);
       this.U = new SubtitleTextPresenter$b(this);
       this.V = new SubtitleTextPresenter$c(this);
    }
    public void E8(){
       SubtitleTextPresenter v;
       Object[] objArray1;
       SharedPreferences a;
       VideoSDKPlayerView videoSDKPlay = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SubtitleTextPresenter subtitleText = SubtitleTextPresenter.class;
       if (PatchProxy.applyVoid(null, videoSDKPlay, subtitleText, "5")) {
          return;
       }
       videoSDKPlay.R.f(videoSDKPlay.y);
       videoSDKPlay.P = videoSDKPlay.A.f().O().a();
       videoSDKPlay.J.d(videoSDKPlay.T);
       videoSDKPlay.B.add(videoSDKPlay.U);
       TextElementViewModel textElementV = k1.c(videoSDKPlay.A.f(), false);
       videoSDKPlay.O = textElementV;
       if (videoSDKPlay.K == null) {
          videoSDKPlay.K = new b0(videoSDKPlay);
          textElementV.R0().observe(videoSDKPlay.H, videoSDKPlay.K);
       }
       String str = "15";
       SubtitleTextPresenter subtitleText1 = 1;
       String str1 = 8;
       if (!PatchProxy.applyVoid(null, videoSDKPlay, subtitleText, str)) {
          a = a.a;
          String str3 = "IsAdvEditSubtitleGuide";
          if (!a.getBoolean(str3, false)) {
             SubtitleTextPresenter s = videoSDKPlay.s;
             String str4 = videoSDKPlay.n8(R.string.arg_RES_7f104b15);
             int i1 = a1.e(10.00f);
             BubbleHintNewStyleFragment$BackgroundColorType wHITE = BubbleHintNewStyleFragment$BackgroundColorType.WHITE;
             int i2 = 7;
             if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
                Object[] objArray2 = new Object[str1];
                objArray2[0] = s;
                objArray2[subtitleText1] = str4;
                objArray2[2] = Boolean.TRUE;
                objArray2[3] = Integer.valueOf(false);
                objArray2[4] = Integer.valueOf(i1);
                objArray2[5] = "showSubtitleTip";
                objArray2[6] = wHITE;
                objArray2[i2] = Long.valueOf(3000);
                if (PatchProxy.apply(objArray2, null, BubbleHintNewStyleFragment.class, "14") != patchProxyRe) {
                }else if(PatchProxy.isSupport(BubbleHintNewStyleFragment.class)){
                   objArray1 = new Object[9];
                   objArray1[0] = null;
                   objArray1[1] = s;
                   objArray1[2] = str4;
                   objArray1[3] = Boolean.TRUE;
                   objArray1[4] = Integer.valueOf(false);
                   objArray1[5] = Integer.valueOf(i1);
                   objArray1[6] = "showSubtitleTip";
                   objArray1[i2] = wHITE;
                   objArray1[8] = Long.valueOf(3000);
                   if (PatchProxy.apply(objArray1, null, BubbleHintNewStyleFragment.class, str) != patchProxyRe) {
                   }
                }
                FragmentActivity uFragmentAct = BubbleHintNewStyleFragment.Jh(s);
                if (uFragmentAct != null) {
                   j oj = new j(s, BubbleHintNewStyleFragment.Lh(str4, true, false, i1, wHITE), uFragmentAct.getSupportFragmentManager(), "showSubtitleTip", 3000);
                   s.getViewTreeObserver().addOnGlobalLayoutListener(objArray1);
                }
             }else {
                goto label_00c9 ;
             }
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(str3, true);
             g.a(uEditor);
          }
       }
       String str2 = "SubtitleEditorPresenter";
       if (!PatchProxy.applyVoid(null, videoSDKPlay, subtitleText, "6")) {
          this.V8();
          videoSDKPlay.p.setTitle("");
          videoSDKPlay.r.setText(videoSDKPlay.n8(R.string.arg_RES_7f104c2a));
          videoSDKPlay.s.setText(videoSDKPlay.n8(R.string.arg_RES_7f1041d2));
          videoSDKPlay.q.setVisibility(false);
          videoSDKPlay.q.setCorner((float)a1.e(0x3f800000));
          if (videoSDKPlay.S == null || (videoSDKPlay.O.E0() && !PatchProxy.applyVoid(null, videoSDKPlay, subtitleText, "7"))) {
             objArray1 = new Object[false];
             a.D().w(str2, "showSubtitle", objArray1);
             Action$Type sUBTITLE = Action$Type.SUBTITLE;
             n.Y(videoSDKPlay.t, false, false);
             n.Y(videoSDKPlay.v, 8, false);
             videoSDKPlay.x = Boolean.TRUE;
             videoSDKPlay.E.set(sUBTITLE);
             videoSDKPlay.F.onNext(sUBTITLE);
             this.R8();
             videoSDKPlay.C.onNext(new Object());
             videoSDKPlay.J.R();
             n.Y(videoSDKPlay.u, 8, false);
          }
       label_01c1 :
          float f = 17.00f;
          if (!videoSDKPlay.x.booleanValue()) {
             videoSDKPlay.r.setTextSize(f);
             videoSDKPlay.r.setChecked(true);
          }else {
             videoSDKPlay.s.setTextSize(f);
             videoSDKPlay.s.setChecked(true);
          }
          if (videoSDKPlay.D.f.size() > 0) {
             n.Y(videoSDKPlay.u, 8, false);
          }
          videoSDKPlay.q.setPostRadioGroupCheckChangedListener(new n0(videoSDKPlay));
       }
       SubtitleHelper subtitleHelp = new SubtitleHelper(videoSDKPlay.M, videoSDKPlay.A.f(), videoSDKPlay.D, videoSDKPlay.A.k(), videoSDKPlay.y, videoSDKPlay.R);
       videoSDKPlay.L = str;
       videoSDKPlay.I.set(str);
       if (!PatchProxy.applyVoid(null, videoSDKPlay, subtitleText, "10")) {
          videoSDKPlay.X7(videoSDKPlay.M.subscribe(new f0(videoSDKPlay), new q0(videoSDKPlay)));
          videoSDKPlay.X7(videoSDKPlay.z.h.subscribe(new g0(videoSDKPlay), t.b));
          videoSDKPlay.X7(videoSDKPlay.L.b.observeOn(d.a).map(new h0(videoSDKPlay)).subscribe(new o0(videoSDKPlay), new r0(videoSDKPlay)));
          videoSDKPlay.X7(videoSDKPlay.G.subscribe(new e0(videoSDKPlay), u.b));
          videoSDKPlay.X7(videoSDKPlay.H.m().subscribe(new p0(videoSDKPlay), v.b));
          Object[] objArray = new Object[false];
          a.D().w(str2, "initPublisher", objArray);
       }
       if (videoSDKPlay.S != null) {
          subtitleText = videoSDKPlay.O;
          SubtitleTextPresenter z = videoSDKPlay.z;
          Objects.requireNonNull(z);
          List list = PatchProxy.apply(null, z, b.class, "1");
          if (list != patchProxyRe) {
          }else {
             list = i0.g(z.j, QCurrentUser.me().isLogined(), 256);
          }
          v = videoSDKPlay.V;
          Objects.requireNonNull(subtitleText);
          if (!PatchProxy.applyVoidTwoRefs(list, v, subtitleText, TextElementViewModel.class, "66")) {
             a.p(list, "idList");
             a.p(v, "provider");
             TextElementViewModel i = (PostExperimentUtils.t1() && subtitleText.J != null)? subtitleText.I: null;
             subtitleText.o = new f(list, null, null, i);
             subtitleText.q = v;
          }
          videoSDKPlay.S = false;
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "4")) {
          return;
       }
       this.U7(new c0());
       this.R = new g();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "20")) {
          return;
       }
       this.Q = false;
       this.L.c();
       this.J.M(this.T);
       this.B.remove(this.U);
       return;
    }
    public final void P8(){
       int i;
       k ok1;
       EditorSdk2V2$AudioAsset[] uAudioAssetA1;
       boolean b6;
       t obj;
       AttrAnimProgressFragment uAttrAnimPro = this;
       SubtitleTextPresenter subtitleText = SubtitleTextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uAttrAnimPro, subtitleText, "16")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = uAttrAnimPro.A.k();
       Workspace$Type kUAISHAN = Workspace$Type.KUAISHAN;
       boolean b = false;
       int b1 = true;
       boolean b2 = (uAttrAnimPro.y.a1() == kUAISHAN)? true: false;
       if (SubtitleHelper.f(videoEditorP, b1, b2, s0.a(uAttrAnimPro.y))) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100c52);
          return;
       }else {
          uAttrAnimPro.u.setEnabled(b);
          s.j("835", uAttrAnimPro.H.getActivity(), 404, "subtitle_auto_recognition", objArray);
          n1.b(b1, 0);
          if (!PatchProxy.applyVoid(objArray, uAttrAnimPro, subtitleText, "17") && this.getActivity() != null) {
             Object[] objArray2 = new Object[b];
             a.D().s("SubtitleEditorPresenter", "showWaitDialog", objArray2);
             AttrAnimProgressFragment uAttrAnimPro1 = new AttrAnimProgressFragment();
             uAttrAnimPro.N = uAttrAnimPro1;
             uAttrAnimPro1.wh(uAttrAnimPro.n8(R.string.arg_RES_7f104b33));
             uAttrAnimPro.N.sh(uAttrAnimPro.n8(R.string.cancel));
             uAttrAnimPro.N.th(new k0(uAttrAnimPro));
             uAttrAnimPro.N.setCancelable(b);
             uAttrAnimPro.N.show(this.getActivity().getSupportFragmentManager(), "EditorActivityInit");
             uAttrAnimPro.p.postDelayed(new m0(uAttrAnimPro), 2000);
          }
          subtitleText = uAttrAnimPro.L;
          Objects.requireNonNull(subtitleText);
          SubtitleHelper subtitleHelp = SubtitleHelper.class;
          if (!PatchProxy.applyVoid(objArray, subtitleText, subtitleHelp, "2")) {
             d.d(x.a).n();
             d.d(x.a).g(x.b);
             subtitleText.m = SystemClock.elapsedRealtime();
             subtitleText.h.pause();
             SubtitleHelper c = subtitleText.c;
             Objects.requireNonNull(c);
             k ok = k.class;
             t ot = PatchProxy.apply(objArray, c, ok, "1");
             if (ot != PatchProxyResult.class) {
             }else {
                EditorSdk2V2$AudioAsset[] uAudioAssetA = c.c.audioAssets().toNormalArray();
                ArrayList uArrayList = new ArrayList();
                boolean b3 = (c.b.a1() == kUAISHAN)? true: false;
                boolean b4 = s0.a(c.b);
                boolean b5 = SubtitleHelper.f(c.c, b1, b3, b4);
                int len = uAudioAssetA.length;
                i = 0;
                while (i < len) {
                   object oobject = uAudioAssetA[i];
                   int i1 = oobject.assetAudioFlag() & 0x01;
                   if (i1 != b1) {
                      ok1 = ok;
                      if (oobject.assetId() - (long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.RECORD_AUDIO_ASSET) && (b3 || b4)) {
                      label_014c :
                         if (b4 || (b3 && AudioAssetUtils.g(oobject.assetId()))) {
                         label_015a :
                            uAudioAssetA1 = uAudioAssetA;
                            b6 = b4;
                         }else if(b3){
                            uAudioAssetA1 = uAudioAssetA;
                            b6 = b4;
                            if (oobject.assetId() - (long)AudioAssetUtils.a(AudioAssetUtils$AssetIdType.MUSIC_AUDIO_ASSET) || !b.a(c.b.J0())) {
                            }
                         }else {
                            uAudioAssetA1 = uAudioAssetA;
                            b6 = b4;
                         }
                      }else {
                         goto label_015a ;
                      }
                   }else {
                      ok1 = ok;
                      goto label_014c ;
                   }
                   i = i + 1;
                   uAudioAssetA = uAudioAssetA1;
                   b4 = b6;
                   ok = ok1;
                   b1 = true;
                }
                ok1 = ok;
                EditorSdk2V2$TrackAsset[] trackAssetAr = c.c.trackAssets().toNormalArray();
                ArrayList uArrayList1 = new ArrayList();
                b = trackAssetAr.length;
                for (b1 = 0; b1 < b; b1 = b1 + 1) {
                   EditorSdk2V2$TrackAsset trackAsset = trackAssetAr[b1].clone();
                   trackAsset.setAudioFilterParam(null);
                   trackAsset.setAssetSpeed(0x3ff0000000000000);
                   uArrayList1.add(trackAsset);
                }
                b = true;
                if (uArrayList1.size() <= b && uArrayList.size() <= b) {
                   if (uArrayList.size() == b) {
                      ot = c.b(uArrayList.get(0).assetPath(), uArrayList1, b5);
                   }else {
                      ot = c.b(null, uArrayList1, b5);
                   }
                }else if(PatchProxy.isSupport(ok1)){
                   b = b5;
                   obj = PatchProxy.applyThreeRefs(uArrayList, uArrayList1, Boolean.valueOf(b5), c, k.class, "2");
                   if (obj != PatchProxyResult.class) {
                      ot = obj;
                   }
                }else {
                   b = b5;
                }
                if (b) {
                   Object[] objArray1 = new Object[0];
                   a.D().s("SubtitleAudioAssetUploadHelper", "all mute", objArray1);
                   obj = t.just(new Pair(Integer.valueOf(16), new Pair(null, null)));
                }else {
                   obj = t.create(new i(c, uArrayList1, uArrayList)).subscribeOn(d.a);
                }
                ot = obj;
             }
             b uob = ot.flatMap(new o(subtitleText)).subscribe(new t(subtitleText), new s(subtitleText));
             subtitleText.d = uob;
             if (!PatchProxy.applyVoidOneRefs(uob, subtitleText, subtitleHelp, "11")) {
                subtitleText.a.c(uob);
             }
          }
          return;
       }
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "9")) {
          return;
       }
       boolean b = false;
       boolean b1 = (this.E.get() == Action$Type.SUBTITLE)? true: false;
       this.J.c0(new i0(b1), b);
       this.J.c0(new j0(b1), true);
       return;
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SubtitleTextPresenter.class, "14")) {
          return;
       }
       SubtitleTextPresenter tN = this.N;
       if (tN != null) {
          tN.dismiss();
          this.N = objArray;
       }
       this.u.setEnabled(true);
       objArray = new Object[0];
       a.D().w("SubtitleEditorPresenter", "hideProgressDialog", objArray);
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "19")) {
          return;
       }
       n.Y(this.w, 8, false);
       n.Y(this.u, false, false);
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "13")) {
          return;
       }
       if (this.D.f.size() > 0) {
          this.M.onNext(Integer.valueOf(10));
       }else {
          this.M.onNext(Integer.valueOf(12));
       }
       Object[] objArray = new Object[0];
       a.D().w("SubtitleEditorPresenter", "responseStatus", objArray);
       return;
    }
    public void X8(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "8")) {
          return;
       }
       int i = 0;
       if (this.Q != null) {
          objArray = new Object[i];
          a.D().w("SubtitleEditorPresenter", "auto recognized this panel session", objArray);
          return;
       }else {
          boolean b = true;
          this.Q = b;
          if (!TextUtils.x(this.O.V0())) {
             objArray = new Object[i];
             a.D().w("SubtitleEditorPresenter", "already has subtitle", objArray);
             return;
          }else {
             EditorSdk2V2$VideoEditorProject videoEditorP = this.A.k();
             boolean b1 = (this.y.a1() == Workspace$Type.KUAISHAN)? true: false;
             if (SubtitleHelper.f(videoEditorP, b, b1, s0.a(this.y))) {
                objArray = new Object[i];
                a.D().w("SubtitleEditorPresenter", "all mute", objArray);
                return;
             }else {
                b = this.R.d();
                ArrayList uArrayList = this.R.b();
                if (!b && uArrayList != null) {
                   if (!uArrayList.isEmpty()) {
                      Object[] objArray1 = new Object[i];
                      a.D().w("SubtitleEditorPresenter", "use cached not empty list", objArray1);
                      this.L.b.onNext(this.R.b());
                   }
                   objArray = new Object[i];
                   a.D().w("SubtitleEditorPresenter", "cached list is empty", objArray);
                   return;
                }else if(b){
                   objArray = new Object[i];
                   a.D().w("SubtitleEditorPresenter", "audio info changed, so clear cached subtitle list", objArray);
                   this.R.a();
                }
                this.P8();
                return;
             }
          }
       }
    }
    public void Y8(EditTextBaseElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextPresenter.class, "3")) {
          return;
       }
       if (!p0.y0()) {
          return;
       }
       h0 oh0 = new h0(p0.w(), p0.x(), p0.A(), p0.z(), StickerTextValueType.EditElement, p0.m(), p0.d(), p0.i0());
       v0.l(p0.q());
       this.O.o1(w.b, v0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubtitleTextPresenter.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a2894);
       this.q = m1.f(p0, 0x7f0a3e49);
       this.p = m1.f(p0, 0x7f0a2eff);
       this.t = m1.f(p0, 0x7f0a0ee1);
       this.r = m1.f(p0, 0x7f0a33cb);
       this.s = m1.f(p0, 0x7f0a33cc);
       this.v = m1.f(p0, 0x7f0a28b3);
       this.w = m1.f(p0, 0x7f0a3c07);
       m1.a(p0, new d0(this), R.id.ll_auto_add_subtitle);
       m1.a(p0, new a0(this), R.id.ll_clear_subtitle_update);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SubtitleTextPresenter.class, "1")) {
          return;
       }
       this.y = this.r8("WORKSPACE");
       this.z = this.r8("EDITOR_SUBTITLE_LIST_MANAGER");
       this.A = this.r8("EDITOR_HELPER_CONTRACT");
       this.B = this.r8("EDITOR_VIEW_LISTENERS");
       this.C = this.r8("DECORATION_TIMELINE_UPDATE");
       this.D = this.r8("TIME_LINE_SAVE_DATA");
       this.E = this.x8("TEXT_TYPE");
       this.F = this.r8("SWITCH_TEXT_TAB_EVENT");
       this.G = this.r8("TEXT_RESTORE_FINISH_EVENT");
       this.H = this.r8("FRAGMENT");
       this.I = this.x8("TIMELINE_RANGE_HANDLER_LISTENER");
       this.J = this.r8("DECORATION_CONTAINER_VIEW");
       return;
    }
}
