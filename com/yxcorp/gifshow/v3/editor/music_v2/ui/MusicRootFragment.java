package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import vrc.d;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$musicViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$tabHostFragment$2;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$collectListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$historyListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$recommendListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$localListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$searchMusicPanelInteraction$1;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$lyricFragment$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$volumeFragment$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$audioDataManager$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$localMusicObserver$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$c;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$b;
import jn9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import msc.a;
import kotlin.jvm.internal.a;
import lsc.n;
import msc.q;
import qrc.r;
import java.lang.Boolean;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import android.content.Intent;
import java.lang.Integer;
import qrc.k;
import lnc.r5;
import java.io.Serializable;
import ekd.j0;
import com.kuaishou.android.model.music.Music;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kuaishou.android.model.music.MusicType;
import com.yxcorp.gifshow.v3.editor.music_v2.action.UpdateLocalMusicFromResultAction;
import xvc.b;
import lsc.u;
import lsc.r;
import jn9.b$b;
import com.yxcorp.gifshow.v3.editor.music_v2.action.SwitchTabAction;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import com.yxcorp.gifshow.v3.editor.music_v2.action.LoadLibraryMusicAction;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import okd.b;
import lob.t;
import tkd.b;
import tkd.d;
import a46.b;
import android.content.Context;
import n3d.d;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import lsc.h0;
import android.view.View;
import android.animation.ObjectAnimator;
import voc.o;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import kuaishou.perf.page.impl.d;
import tvc.f;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicAttachUIAction;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicAttachAction;
import osc.b;
import voc.b0;
import java.util.HashSet;
import voc.b0$a;
import java.util.Objects;
import android.os.FileObserver;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicDetachAction;
import osc.b$a;
import lsc.q;
import lsc.s;
import java.lang.StringBuilder;
import urc.f;
import urc.i;
import src.b;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import vrc.a;
import java.lang.Enum;
import mn9.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.ClipMusicAction;
import urc.k;
import urc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import qrc.v;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicContainerType;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import d46.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment$d;
import java.lang.Runnable;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment;

public final class MusicRootFragment extends BaseEditorFragment implements d	// class@0010d0
{
    public final p G;
    public final p H;
    public final List I;
    public a J;
    public final p K;
    public final p L;
    public final p M;
    public final p N;
    public String O;
    public boolean P;
    public boolean Q;
    public SearchMusicPanelInteraction R;
    public final p S;
    public final p T;
    public final p U;
    public final MusicRootFragment$c U0;
    public d V;
    public final MusicRootFragment$b V0;
    public r W;
    public HashMap W0;
    public e X;
    public final MusicRootFragment$a Y;
    public final p Z;

    public void MusicRootFragment(){
       super();
       this.G = s.c(new MusicRootFragment$musicViewModel$2(this));
       this.H = s.c(MusicRootFragment$tabHostFragment$2.INSTANCE);
       this.I = new ArrayList();
       this.K = s.c(new MusicRootFragment$collectListAdapter$2(this));
       this.L = s.c(new MusicRootFragment$historyListAdapter$2(this));
       this.M = s.c(new MusicRootFragment$recommendListAdapter$2(this));
       this.N = s.c(new MusicRootFragment$localListAdapter$2(this));
       this.R = new MusicRootFragment$searchMusicPanelInteraction$1(this);
       this.S = s.c(new MusicRootFragment$lyricFragment$2(this));
       this.T = s.c(new MusicRootFragment$volumeFragment$2(this));
       this.U = s.c(new MusicRootFragment$audioDataManager$2(this));
       this.Y = new MusicRootFragment$a(this);
       this.Z = s.c(MusicRootFragment$localMusicObserver$2.INSTANCE);
       this.U0 = new MusicRootFragment$c(this);
       this.V0 = new MusicRootFragment$b(this);
    }
    public final b Ah(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public final a Bh(){
       MusicRootFragment obj = PatchProxy.apply(null, this, MusicRootFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       if (obj == null) {
          a.S("listComponentAdapterSet");
       }
       return obj;
    }
    public final b Ch(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.getValue();
    }
    public final n Dh(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Z.getValue();
    }
    public final q Eh(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
    public final b Fh(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.M.getValue();
    }
    public final r Gh(){
       MusicRootFragment obj = PatchProxy.apply(null, this, MusicRootFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W;
       if (obj == null) {
          a.S("uiOption");
       }
       return obj;
    }
    public final boolean Hh(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Eh().o0().z();
    }
    public final void Ih(int p0,Intent p1){
       if (PatchProxy.isSupport(MusicRootFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, MusicRootFragment.class, "41")) {
          return;
       }
       MusicRootFragment tW = this.W;
       String str = "uiOption";
       if (tW == null) {
          a.S(str);
       }
       tW.g().a(p1);
       r5.b().d(this.O);
       Music music = j0.e(p1, "music");
       long l = j0.c(p1, "musicClippedStart", 0);
       if (music == null) {
          i1.c(new RuntimeException("AddLibraryMusicAction music is null"));
          return;
       }else if(music.mType == MusicType.LOCAL && p0 == 256){
          MusicRootFragment tW1 = this.W;
          if (tW1 == null) {
             a.S(str);
          }
          if (tW1.b()) {
             this.Eh().t0(new UpdateLocalMusicFromResultAction(p1, p0));
             b uob = this.Ch();
             String id = music.getId();
             Object obj = null;
             if (!PatchProxy.applyVoidTwoRefs(uob, id, obj, u.class, "11")) {
                a.p(uob, "postListAdapter");
                b.b(uob, new r(uob, id), false, 2, obj);
                b.w(uob, false, false, null, 7, null);
             }
             this.Eh().t0(new SwitchTabAction(SwitchTab.LOCAL));
             this.P = true;
             this.Q = false;
             return;
          }
       }
    label_00af :
       this.Eh().t0(new LoadLibraryMusicAction(music, l));
       return;
    }
    public final void Jh(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment.class, "30")) {
          return;
       }
       MusicRootFragment tR = this.R;
       if (tR != null) {
          tR.onPanelBackPressed();
       }
       return;
    }
    public final void Kh(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment.class, "33")) {
          return;
       }
       this.Lh(0);
       return;
    }
    public final void Lh(int p0){
       Intent intent;
       if (PatchProxy.isSupport(MusicRootFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MusicRootFragment.class, "32")) {
          return;
       }
       MusicRootFragment tW = this.W;
       if (tW == null) {
          a.S("uiOption");
       }
       int i = 0;
       if (tW.g().b()) {
          Object[] objArray = new Object[i];
          a.D().w("MusicRootFragment", "openMusicLibrary by out listener", objArray);
          return;
       }else {
          BaseEditorFragment tt = this.t;
          a.o(tt, "mEditorDelegate");
          this.O = this.Mh(tt);
          e uoe = this.Eh().o0();
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             intent = activity.getIntent();
             if (intent != null) {
             label_0062 :
                t ot = b.a(-1033494876).V(this.getActivity(), 1, uoe.r(), d.a(0x500192b6)).a(j0.f(intent, "photo_task_id")).b(i).n(i).o(1).f(uoe.d()).u(p0).C(i).g(this.O).K(256).s(j0.e(intent, "MUSIC_RECO_PARAMS"));
                if (uoe.y()) {
                   ot.g0(new int[2]{-3,-1});
                }
                ot.h();
                FragmentActivity activity1 = this.getActivity();
                if (activity1 != null) {
                   activity1.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
                }
                return;
             }
          }
          intent = new Intent();
          goto label_0062 ;
       }
    }
    public void Mb(e p0,e p1){
       BaseEditorFragment tt;
       float[] uofloatArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicRootFragment.class, "29")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       if (p0.z() != p1.z()) {
          String str = "mEditorDelegate";
          if (p0.z()) {
             tt = this.t;
             a.o(tt, str);
             h0.c(tt);
          }else {
             tt = this.t;
             a.o(tt, str);
             h0.d(tt);
          }
       }
       View view = this.getView();
       int height = (view != null)? view.getHeight(): 0;
       if (!p0.w() || (!p1.w() || (p0.C() && !p1.C()))) {
          uofloatArray = new float[]{0,(float)height * 0x3f800000};
          ObjectAnimator.ofFloat(this.getView(), "translationY", uofloatArray).setDuration(300).start();
       }else if(p0.w() || (p1.w() || (!p0.C() && p1.C()))){
          uofloatArray = new float[]{(float)height * 0x3f800000,0};
          ObjectAnimator.ofFloat(this.getView(), "translationY", uofloatArray).setDuration(300).start();
       }
       return;
    }
    public final String Mh(EditorDelegate p0){
       String str;
       o obj = PatchProxy.applyOneRefs(p0, this, MusicRootFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.x() != null) {
          obj = p0.x();
          a.o(obj, "editorDelegate.editorContext");
          if (obj.f() != null) {
             o oo = p0.x();
             a.o(oo, "editorDelegate.editorContext");
             str = r5.b().c(oo.f());
          label_003a :
             return str;
          }
       }
       str = null;
       goto label_003a ;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment.class, "44")) {
          return;
       }
       super.Z();
       d.d("postMusicPanelMonitor").h("loadDataToRenderFinish");
       d.d("postMusicPanelMonitor").c();
       return;
    }
    public void fh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicRootFragment.class, "23")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, MusicRootFragment.class, "21")) {
          this.Eh().r0().observe(this, this.U0);
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       q oq = this.Eh();
       MusicRootFragment tW = this.W;
       if (tW == null) {
          a.S("uiOption");
       }
       oq.t0(new MusicAttachUIAction(tW.o));
       this.Eh().t0(new MusicAttachAction(this.yh()));
       b0.a.a().add(this.V0);
       n on = this.Dh();
       MusicRootFragment tY = this.Y;
       Objects.requireNonNull(on);
       if (!PatchProxy.applyVoidOneRefs(tY, on, n.class, "1")) {
          a.p(tY, "l");
          on.a = tY;
          on.b = 0;
          on.startWatching();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicRootFragment.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MusicRootFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicRootFragment.class, "24")) {
          return;
       }
       Iterator iterator = this.I.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       this.Eh().t0(new MusicDetachAction(this.Eh().o0(), this.yh().d()));
       if (!PatchProxy.applyVoid(objArray, this, MusicRootFragment.class, "22")) {
          this.Eh().r0().removeObserver(this.U0);
       }
       b0.a.a().remove(this.V0);
       this.Dh().stopWatching();
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       Object this;
       SelectSource selectSource;
       a uoa;
       MusicRootFragment musicRootFra = this;
       boolean i = p0;
       int i1 = p1;
       Intent intent = p2;
       u ou = u.class;
       if (PatchProxy.isSupport(MusicRootFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MusicRootFragment.class, "40")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       String str = "postListAdapter";
       int i2 = 2;
       this = null;
       boolean b = false;
       if (musicRootFra.Q != null) {
          b uob = this.Ch();
          if (!PatchProxy.applyVoidOneRefs(uob, this, ou, "13")) {
             a.p(uob, str);
             b.b(uob, new q(uob, uob.p()), b, i2, this);
             b.w(uob, false, false, null, 7, null);
          }
          musicRootFra.Q = b;
       }
       if (i1 == -1 && intent) {
          MusicRootFragment w = musicRootFra.W;
          String str1 = "uiOption";
          if (w == null) {
             a.S(str1);
          }
          if (w.g().d()) {
             if (this.Hh()) {
                w = musicRootFra.R;
                if (w != null) {
                   w.onPanelBackPressed();
                }
             }
             if (i != 256) {
                int i3 = 1;
                if (i != 257 && i != 1001) {
                   if (i == 1004) {
                      r5.b().d(musicRootFra.O);
                      b uob1 = this.Ch();
                      if (!PatchProxy.isSupport(ou) || !PatchProxy.applyVoidTwoRefs(uob1, Integer.valueOf(i3), this, ou, "12")) {
                         a.p(uob1, str);
                         b.b(uob1, new s(uob1, i3), b, i2, this);
                         b.w(uob1, false, false, null, 7, null);
                      }
                   }
                }else {
                   w = musicRootFra.W;
                   if (w == null) {
                      a.S(str1);
                   }
                   w.g().Z3(intent);
                   r5.b().d(musicRootFra.O);
                   Object[] objArray = new Object[b];
                   a.D().w("MusicRootFragment", "onAddOrClipMusic requestCode:"+i+",resultCode:"+i1+",data:"+intent, objArray);
                   e uoe = this.Eh().o0();
                   long l = j0.c(intent, "musicClippedStart", 0);
                   Music music = j0.e(intent, "music");
                   i = j0.a(intent, "EXTRA_IS_FROM_CLIP", i3);
                   i oi = uoe.s().i();
                   String obj = PatchProxy.applyOneRefs(oi, musicRootFra, MusicRootFragment.class, "45");
                   if (obj != PatchProxyResult.class) {
                      this = obj;
                   }else if(oi == null){
                      obj = oi.g().getId();
                      i1 = a.a[oi.h().ordinal()];
                      String str2 = "musicId";
                      if (i1 != i3) {
                         if (i1 != i2) {
                            if (i1 != 3) {
                               a.o(obj, str2);
                               uoa = this.Fh().i(obj);
                               if (uoa instanceof b) {
                                  this = uoa;
                               }
                            }else {
                               a.o(obj, str2);
                               uoa = this.Ah().i(obj);
                               if (uoa instanceof b) {
                                  this = uoa;
                               }
                            }
                         }else {
                            a.o(obj, str2);
                            uoa = this.Ch().i(obj);
                            if (uoa instanceof b) {
                               this = uoa;
                            }
                         }
                      }else {
                         a.o(obj, str2);
                         uoa = this.zh().i(obj);
                         if (uoa instanceof b) {
                            this = uoa;
                         }
                      }
                   }
                   if (i && this != null) {
                      q oq = this.Eh();
                      int i4 = uoe.v().c();
                      int i5 = uoe.r();
                      double d = uoe.t();
                      b uob2 = uoe.s().e();
                      i oi1 = uoe.s().i();
                      if (oi1 != null) {
                         selectSource = oi1.h();
                         if (selectSource != null) {
                         label_01f4 :
                            ClipMusicAction uClipMusicAc = new ClipMusicAction(p2, this, i4, i5, d, uob2, selectSource);
                            oq.t0(i2);
                            musicRootFra.P = true;
                         }
                      }
                      selectSource = SelectSource.RECOMMEND_LIST;
                      goto label_01f4 ;
                   }else if(music != null){
                      this.Eh().t0(new LoadLibraryMusicAction(music, l));
                   }else {
                      i1.c(new RuntimeException("AddLibraryMusicAction music is null"));
                   }
                }
             }else {
                musicRootFra.Ih(i, intent);
             }
          }
       }
    label_0220 :
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicRootFragment.class, "18");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d036d, p1, false);
       this.q = view;
       a.o(view, "mViewRoot");
       this.I.addAll(v.a.a(MusicContainerType.ROOT, this, view));
       this.fh();
       return this.q;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment.class, "20")) {
          return;
       }
       super.onDestroyView();
       this.R = null;
       if (!PatchProxy.applyVoid(null, this, MusicRootFragment.class, "48")) {
          MusicRootFragment tW0 = this.W0;
          if (tW0 != null) {
             tW0.clear();
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       MusicRootFragment tV;
       if (PatchProxy.isSupport(MusicRootFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicRootFragment.class, "25")) {
          return;
       }
       super.onHiddenChanged(p0);
       Object[] objArray = new Object[0];
       a.D().w("MusicRootFragment", "onHiddenChanged\(\) called with: hidden = ["+p0+']', objArray);
       String str = "musicPlayTimeLogHelper";
       if (p0) {
          tV = this.V;
          if (tV == null) {
             a.S(str);
          }
          tV.b();
       }else {
          tV = this.V;
          if (tV == null) {
             a.S(str);
          }
          i oi = this.Eh().o0().s().i();
          Music music = (oi != null)? oi.g(): null;
          tV.e(music);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment.class, "28")) {
          return;
       }
       super.onPause();
       MusicRootFragment tV = this.V;
       if (tV == null) {
          a.S("musicPlayTimeLogHelper");
       }
       tV.c();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MusicRootFragment.class, "27")) {
          return;
       }
       super.onResume();
       MusicRootFragment tV = this.V;
       if (tV == null) {
          a.S("musicPlayTimeLogHelper");
       }
       tV.f();
       if (this.P != null) {
          this.P = false;
          View view = this.getView();
          if (view != null) {
             view.post(new MusicRootFragment$d(this));
          }
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicRootFragment.class, "26")) {
          return;
       }
       super.onStart();
       MusicRootFragment tV = this.V;
       if (tV == null) {
          a.S("musicPlayTimeLogHelper");
       }
       i oi = this.Eh().o0().s().i();
       if (oi != null) {
          objArray = oi.g();
       }
       tV.e(objArray);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicRootFragment.class, "19")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       e uoe = this.getChildFragmentManager().beginTransaction();
       int i = 0x7f0a2cd9;
       MusicTabHostFragment musicTabHost = PatchProxy.apply(null, this, MusicRootFragment.class, "2");
       if (musicTabHost == PatchProxyResult.class) {
          musicTabHost = this.H.getValue();
       }
       uoe.v(i, musicTabHost);
       uoe.l();
       d.d("postMusicPanelMonitor").h("clickToLoadData");
       d.d("postMusicPanelMonitor").g("loadDataToRenderFinish");
       BaseEditorFragment tt = this.t;
       a.o(tt, "mEditorDelegate");
       h0.d(tt);
       return;
    }
    public final b yh(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U.getValue();
    }
    public final b zh(){
       Object obj = PatchProxy.apply(null, this, MusicRootFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.K.getValue();
    }
}
