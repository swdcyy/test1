package com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor;
import vrc.d;
import voc.n;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$a;
import nsd.u;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.editor.music_v2.item.MusicIcon;
import com.yxcorp.gifshow.v3.editor.music_v2.item.BeatSyncIcon;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.n1;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$d;
import erd.g;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$f;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$e;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$c;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$frameChangeListener$1;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicEditor$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import xvc.h;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import xvc.f;
import msc.s;
import xvc.m;
import xvc.j;
import qrc.e$a;
import tvc.c;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import oa0.a;
import qrc.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import qrc.r$a;
import androidx.fragment.app.FragmentActivity;
import qrc.k;
import java.util.Objects;
import k2b.e0;
import qrc.r;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import qrc.j$a;
import qrc.j;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.EditAbilityConfig;
import com.kuaishou.android.post.PostPageArg;
import pb9.r;
import faa.a;
import q87.c;
import java.util.Map;
import pb9.q;
import t36.f;
import qrc.g;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder;
import com.yxcorp.gifshow.v3.previewer.listener.VideoFrameChangeListener;
import com.yxcorp.gifshow.v3.EditorManager$b;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import ooc.j0;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import tvc.f;
import androidx.lifecycle.Observer;
import voc.o;
import urc.e;
import lsc.h0;
import com.yxcorp.gifshow.widget.l;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import urc.f;
import urc.i;
import urc.a;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.v3.editor.music_v2.action.AutoMusicStatus;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import msc.q;
import java.util.List;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import android.os.Bundle;
import tvc.e;
import lsc.g0;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import voc.y;
import lnc.i1;
import androidx.fragment.app.e;

public final class MusicEditor extends n implements d	// class@00104a
{
    public final MusicEditor$c A;
    public final MusicEditor$frameChangeListener$1 B;
    public final r0 C;
    public final EditorActivity D;
    public final MusicIcon E;
    public final BeatSyncIcon F;
    public boolean u;
    public final n1 v;
    public MusicFragmentCreator w;
    public MusicBubbleViewBinder x;
    public final MusicEditor$f y;
    public final MusicEditor$e z;
    public static final MusicEditor$a G;

    static {
       MusicEditor.G = new MusicEditor$a(null);
    }
    public void MusicEditor(EditorActivity p0,MusicIcon p1,BeatSyncIcon p2){
       a.p(p0, "requireActivity");
       a.p(p1, "musicIcon");
       a.p(p2, "beatSyncIcon");
       super();
       this.D = p0;
       this.E = p1;
       this.F = p2;
       this.v = new n1(new MusicEditor$d(this), 1000);
       this.y = new MusicEditor$f(this);
       this.z = new MusicEditor$e(this);
       this.A = new MusicEditor$c(this);
       this.B = new MusicEditor$frameChangeListener$1(this);
       this.C = new MusicEditor$b(this);
    }
    public void B(EditorDelegate p0,String p1){
       f uof;
       h oh;
       boolean b;
       Workspace$Type type;
       MusicEditor musicEditor = MusicEditor.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, musicEditor, "1")) {
          return;
       }
       String str = "delegate";
       a.p(p0, str);
       a.p(p1, "subType");
       if (!PatchProxy.applyVoidOneRefs(p0, this, musicEditor, "4")) {
          this.d = p0;
          String str1 = "delegate.editRepo";
          if (f.E(p0.getType())) {
             uof = p0.f();
             a.o(uof, str1);
             oh = new h(EditorItemFunc.MUSIC_V2, uof, s.a);
          }else {
             uof = p0.f();
             a.o(uof, str1);
             oh = new j(EditorItemFunc.MUSIC_V2, uof, s.a);
          }
          e$a uoa = new e$a().c(oh);
          uoa.b(j0.e(p0.getIntent(), "MUSIC_RECO_PARAMS"));
          r$a obj = PatchProxy.apply(null, this, musicEditor, "23");
          int i = 1;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!PostExperimentUtils.B0(this.D) && !a.w0()){
             EditorDelegate uEditorDeleg = this.i();
             a.o(uEditorDeleg, str);
             if (j0.a(uEditorDeleg.getIntent(), "pic_template_exist", 0)) {
                uEditorDeleg = this.i();
                a.o(uEditorDeleg, str);
                type = uEditorDeleg.getType();
                if (type != Workspace$Type.SINGLE_PICTURE) {
                }
             }else {
             }
          }
          b = true;
          uoa.d(b);
          e uoe = uoa.a();
          c uoc = p0.N();
          a.o(uoc, "delegate.workspaceDraft");
          int i1 = (uoc.T0() == Workspace$Source.REEDIT)? 1: 0;
          obj = new r$a().a(this.D).d(p0);
          i1 = i1 ^ i;
          obj.f(i1);
          obj.j(i1);
          obj.l(i1);
          obj.k(i1);
          obj.m(i);
          r$a uoa1 = obj.n(this.z);
          uoa1.h(i);
          MusicEditor tD = this.D;
          Objects.requireNonNull(tD, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          this.w = new MusicFragmentCreator(p0.f(), new j$a().c(uoa1.c(tD).b()).b(uoe).a());
          if (!PatchProxy.applyVoidOneRefs(p0, this, musicEditor, "7")) {
             c uoc1 = p0.N();
             a.o(uoc1, "workspaceDraft");
             EditAbilityConfig dEFAULT = EditAbilityConfig.DEFAULT;
             a.o(dEFAULT, "EditAbilityConfig.DEFAULT");
             if (!r.a(uoc1.a1(), uoc1.T0(), 0, p0.getIntent(), i.g().getEditAbilityConfig().get(dEFAULT))) {
                Object[] objArray = new Object[0];
                a.D().w("musicEditor", "observeFrameUploadResultIfNeeded: not support frame upload", objArray);
             }else {
                f.p0(p0.u(), q.class).d(new g(this, uoc1, p0));
             }
          }
          this.x = new MusicBubbleViewBinder(this.D, p0);
          f.o0(this.B, p0.u(), VideoFrameChangeListener.class);
          f.o0(this.A, p0.u(), EditorManager$b.class);
          ViewModelProviders.of(this.D).get(j0.class).o0().d(this.C);
       }
       super.B(p0, p1);
       this.T().r0().observeForever(this.y);
       return;
    }
    public void C(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicEditor.class, "15")) {
          return;
       }
       a.p(p0, "newContext");
       return;
    }
    public void D(boolean p0){
       MusicEditor musicEditor = MusicEditor.class;
       if (PatchProxy.isSupport(musicEditor) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, musicEditor, "11")) {
          return;
       }
       this.t(p0);
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, MusicEditor.class, "12")) {
          return;
       }
       MusicEditor tw = this.w;
       if (tw == null) {
          a.S("musicFragmentCreator");
       }
       tw.c();
       EditorDelegate uEditorDeleg = this.i();
       a.o(uEditorDeleg, "delegate");
       f.t0(this.B, uEditorDeleg.u(), VideoFrameChangeListener.class);
       uEditorDeleg = this.i();
       a.o(uEditorDeleg, "delegate");
       f.t0(this.A, uEditorDeleg.u(), EditorManager$b.class);
       this.T().r0().removeObserver(this.y);
       ViewModelProviders.of(this.D).get(j0.class).o0().c(this.C);
       this.E.clearMusicAnimController();
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, MusicEditor.class, "8")) {
          return;
       }
       this.v.a(Boolean.TRUE);
       this.u = true;
       return;
    }
    public void Mb(e p0,e p1){
       boolean b1;
       MusicEditor tE;
       int i1;
       int i2;
       MusicEditor musicEditor = MusicEditor.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, musicEditor, "21")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       EditorDelegate uEditorDeleg = this.i();
       String str = "delegate";
       a.o(uEditorDeleg, str);
       Music music = null;
       a obj = PatchProxy.applyOneRefs(uEditorDeleg, music, h0.class, "6");
       boolean b = false;
       int i = 1;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          a.p(uEditorDeleg, str);
          if (f.E(uEditorDeleg.getType())) {
             l ol = h0.a(uEditorDeleg);
             if (ol != null && ol.h() == i) {
             label_005a :
                b1 = true;
             }
          }else {
             VideoSDKPlayerView videoSDKPlay = h0.b(uEditorDeleg);
             if (videoSDKPlay != null && videoSDKPlay.isPlaying() == i) {
                goto label_005a ;
             }
          }
          b1 = false;
       }
       if (b1 && p0.z()) {
          uEditorDeleg = this.i();
          a.o(uEditorDeleg, str);
          h0.c(uEditorDeleg);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, musicEditor, "22")) {
          i oi = p0.s().i();
          obj = p0.s().b();
          a uoa = p1.s().b();
          if (a.g(oi, p1.s().i()) ^ i) {
             if (oi != null) {
                music = oi.g();
             }
             this.E.setSelectedMusic(music);
             tE = this.E;
             i1 = (music != null)? 3: 1;
             tE.setCurrentState(i1);
          }else if(a.g(obj, uoa) ^ i){
             tE = this.E;
             uoa = (obj != null)? obj.c: 0;
             tE.setCurrentPercent(((float)uoa / 100.00f));
             tE = this.E;
             if (obj != null) {
                music = obj.b();
             }
             i1 = (music == AutoMusicStatus.LOADING)? 2: 1;
             tE.setCurrentState(i1);
          }else {
             i = 0;
          }
          if (i) {
             this.i().i(EditorItemFunc.MUSIC_V2);
          }
          uEditorDeleg = this.i();
          a.o(uEditorDeleg, str);
          if (uEditorDeleg.getType() == Workspace$Type.PHOTO_MOVIE) {
             this.F.setBeatSyncEnabled(p0.l());
             tE = this.F;
             if (oi != null) {
                b = oi.i();
             }
             tE.setBeatSyncApplied(b);
             this.i().i(EditorItemFunc.BEAT_SYNC);
          }
       }
       musicEditor = this.x;
       if (musicEditor != null) {
          musicEditor.Mb(p0, p1);
       }
       return;
    }
    public EditReduxViewModel U(){
       EditorDelegate obj = PatchProxy.apply(null, this, MusicEditor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i();
       a.o(obj, "delegate");
       ViewModel viewModel = ViewModelProviders.of(obj.q()).get(q.class);
       a.o(viewModel, "ViewModelProviders.of\(de¡­sicViewModel::class.java\)");
       return viewModel;
    }
    public List V(){
       EditorItemFunc[] obj = PatchProxy.apply(null, this, MusicEditor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditorItemFunc[]{EditorItemFunc.CLIP_V3,EditorItemFunc.EFFECT_V2,EditorItemFunc.AICUT};
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public BaseEditorFragment W(){
       BaseEditor tf;
       MusicEditor musicEditor = MusicEditor.class;
       g0 obj = PatchProxy.apply(null, this, musicEditor, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null && !PatchProxy.applyVoid(null, this, musicEditor, "10")) {
          EditorDelegate uEditorDeleg = this.i();
          a.o(uEditorDeleg, "delegate");
          BaseFragment uBaseFragmen = uEditorDeleg.q();
          a.o(uBaseFragmen, "delegate.previewFragment");
          BaseEditorFragment uBaseEditorF = this.f(uBaseFragmen.getChildFragmentManager(), "musicEditor", MusicRootFragment.class);
          this.f = uBaseEditorF;
          if (uBaseEditorF == null) {
             musicEditor = this.w;
             if (musicEditor == null) {
                a.S("musicFragmentCreator");
             }
             this.f = musicEditor.b();
          }
          tf = this.f;
          a.o(tf, "mFragment");
          if (tf.getArguments() == null) {
             tf = this.f;
             a.o(tf, "mFragment");
             tf.setArguments(new Bundle());
          }
          this.f.uh(this.d, this.i);
       }
       boolean b = (this.T().o0().s().i() != null)? true: false;
       obj = g0.class;
       if (!PatchProxy.isSupport(obj) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, obj, "17")) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("have_play_music", Boolean.valueOf(b));
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECORD_VIDEO_EDIT_OPERATION";
          uElementPack.name = "click_music";
          uElementPack.params = jsonObject.toString();
          u1.u(6, uElementPack, null);
       }
       tf = this.f;
       a.o(tf, "mFragment");
       return tf;
    }
    public final boolean X(){
       boolean b;
       BaseEditor obj = PatchProxy.apply(null, this, MusicEditor.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       if (obj instanceof MusicRootFragment) {
          a.o(obj, "mFragment");
          View view = obj.getView();
          a.m(view);
          a.o(view, "mFragment.view!!");
          if (view.getVisibility() == 8) {
             b = true;
          label_0036 :
             return b;
          }
       }
       b = false;
       goto label_0036 ;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, MusicEditor.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 3, this.i);
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, MusicEditor.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.X() ^ 0x01);
    }
    public View p(){
       Object[] objArray = null;
       BaseEditor obj = PatchProxy.apply(objArray, this, MusicEditor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj != null) {
          a.o(obj, "mFragment");
          objArray = obj.mh();
       }
       return objArray;
    }
    public int q(){
       return 0;
    }
    public boolean s(){
       BaseEditor tf;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicEditor musicEditor = MusicEditor.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, musicEditor, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.X()) {
          return b;
       }
       if (this.T().o0().z()) {
          tf = this.f;
          Objects.requireNonNull(tf, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment");
          tf.Jh();
       }else if(!TextUtils.isEmpty(this.k)){
          Object[] obj1 = PatchProxy.apply(objArray, this, musicEditor, "20");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             obj1 = new Object[0];
             String str = "musicEditor";
             a.D().s(str, "handleBackPressedInner\(\) called", obj1);
             tf = this.f;
             a.o(tf, "mFragment");
             Iterator iterator = tf.qh().iterator();
             while (iterator.hasNext()) {
                iterator.next().yd();
             }
             this.J(2);
             tf = this.d;
             a.o(tf, "mDelegate");
             BaseFragment uBaseFragmen = tf.q();
             a.o(uBaseFragmen, "mDelegate.previewFragment");
             c childFragmen = uBaseFragmen.getChildFragmentManager();
             a.o(childFragmen, "mDelegate.previewFragment.childFragmentManager");
             Fragment uFragment = childFragmen.findFragmentByTag(this.k);
             if (uFragment == null) {
                i1.a(str, "handleBackPressedInner ");
                b1 = false;
             }else {
                e uoe = childFragmen.beginTransaction();
                uoe.y(R.anim.arg_RES_7f01004a, 0x7f01010d);
                uoe.s(this.f).E(uFragment).m();
                b1 = true;
             }
          }
          if (!b1 && !super.s()) {
             b = false;
          }
       }else {
          b = super.s();
       }
       return b;
    }
    public boolean x(){
       Object obj = PatchProxy.apply(null, this, MusicEditor.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.X() ^ 0x01);
    }
    public boolean y(){
       return false;
    }
}
