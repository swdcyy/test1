package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder;
import vrc.d;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder$a;
import nsd.u;
import lnc.a1;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder$mMusicViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.MusicBubbleViewBinder$b;
import t36.f;
import urc.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import urc.f;
import urc.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.AutoMusicStatus;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import msc.q;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.kuaishou.edit.draft.Workspace$Type;
import urc.i;
import com.kuaishou.android.model.music.Music;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.EditorManager;
import zrc.e;
import java.lang.Runnable;
import ekd.k1;
import poc.a;
import android.app.Activity;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import android.view.View;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import ra9.c;
import zrc.a;
import com.yxcorp.gifshow.bubble.b$b;
import zrc.b;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import zrc.c;
import com.yxcorp.gifshow.bubble.b$c;
import zrc.d;
import java.lang.StringBuilder;
import com.kwai.sdk.switchconfig.a;
import zrc.g;
import zrc.h;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.util.List;
import ooc.c;
import zrc.f;
import android.animation.Animator$AnimatorListener;
import android.content.Context;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.f;

public final class MusicBubbleViewBinder implements d	// class@0010e4
{
    public View b;
    public List c;
    public View d;
    public final p e;
    public final PostBubbleManager f;
    public final s g;
    public final EditorActivity h;
    public final EditorDelegate i;
    public static final int j;
    public static final MusicBubbleViewBinder$a k;

    static {
       MusicBubbleViewBinder.k = new MusicBubbleViewBinder$a(null);
       MusicBubbleViewBinder.j = a1.e(8.00f);
    }
    public void MusicBubbleViewBinder(EditorActivity p0,EditorDelegate p1){
       a.p(p0, "requireActivity");
       a.p(p1, "delegate");
       super();
       this.h = p0;
       this.i = p1;
       this.e = s.c(new MusicBubbleViewBinder$mMusicViewModel$2(this));
       PostBubbleManager postBubbleMa = PostBubbleManager.e(p0);
       a.o(postBubbleMa, "PostBubbleManager.get\(requireActivity\)");
       this.f = postBubbleMa;
       MusicBubbleViewBinder$b uob = new MusicBubbleViewBinder$b(this);
       this.g = uob;
       p1.j().d(uob);
    }
    public void Mb(e p0,e p1){
       int b;
       Music music;
       SelectSource selectSource;
       b uob;
       Object[] objArray;
       EditorManager uEditorManag1;
       b uob1;
       MusicBubbleViewBinder td;
       Object[] objArray2;
       q oq;
       MusicBubbleViewBinder musicBubbleV = MusicBubbleViewBinder.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, musicBubbleV, "2")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       a uoa = p0.s().b();
       AutoMusicStatus uAutoMusicSt = (uoa != null)? uoa.b(): null;
       int i = 0;
       if (uAutoMusicSt == AutoMusicStatus.FINISH) {
          i obj = PatchProxy.apply(null, this, musicBubbleV, "12");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             String str = "autoMusicTips";
             if (a.a().c()) {
                oq = (g.A())? 1: f.a(str);
             }else {
                oq = f.a(str);
             }
             if (oq) {
                if (this.d(this.c().o0().k())) {
                   str = "musicTipsScope";
                   if (a.a().c()) {
                      b = (!g.v0())? f.e(str): g.v0();
                   }else {
                      b = f.e(str);
                   }
                   if (b != 2) {
                   label_0099 :
                      b = false;
                   }
                }
                b = true;
             }
          }
          if (b) {
             if (p0.R == null) {
                obj = p0.s().i();
                music = (obj != null)? obj.g(): null;
                if (!PatchProxy.applyVoidOneRefs(music, this, musicBubbleV, "13")) {
                   objArray = new Object[i];
                   a.D().w("MusicBubbleViewBinder", "tryToShowAutoSelectMusicBubbleV2\(\) show", objArray);
                   if (music != null) {
                      uEditorManag1 = this.b();
                      if (uEditorManag1 != null && !uEditorManag1.s()) {
                         k1.r(new e(this), 0);
                         this.f.n(new a(this.h, music, this.b()));
                      }
                   }
                }
             }
          }else {
             obj = p0.s().i();
             selectSource = (obj != null)? obj.h(): null;
             if (!PatchProxy.applyVoidOneRefs(selectSource, this, musicBubbleV, "4")) {
                td = this.b;
                if (td != null) {
                   EditorManager uEditorManag2 = this.b();
                   if (uEditorManag2 != null && (!td.getVisibility() && (uEditorManag2.s() || (selectSource == SelectSource.AUTO_MUSIC && !PatchProxy.applyVoid(null, this, musicBubbleV, "5"))))) {
                      uob1 = (this.d(this.c().o0().k()))? new b(EditBubbleItem.AUTO_MUSIC_PICTURE): new b(EditBubbleItem.AUTO_MUSIC_VIDEO);
                      b uob2 = uob1.b(this.b);
                      uob2.k(a.a);
                      uob2.j(new b(this));
                      this.f.n(uob1);
                   }
                }
             }
          }
       label_016e :
          obj = p0.s().i();
          selectSource = (obj != null)? obj.h(): null;
          if (!PatchProxy.applyVoidOneRefs(selectSource, this, musicBubbleV, "11")) {
             td = this.d;
             if (td == null || (!td.getVisibility() && selectSource == SelectSource.AUTO_MUSIC)) {
                uob1 = new b(EditBubbleItem.AUTO_MUSIC_SETTINGS);
                uob1.b(td);
                uob1.l(new c(this));
                uob1.k(d.a);
                this.f.n(uob1);
             }
          }
       }
    label_01b2 :
       if (p0.m() == null || (p1.m() == null && !PatchProxy.applyVoidOneRefs(p0, this, musicBubbleV, "8"))) {
          Music music1 = p0.m();
          if (music1 != null) {
             objArray = new Object[i];
             a.D().w("MusicBubbleViewBinder", "tryToShowGuideBubble, music = "+music1.mName, objArray);
             if (!a.t().d("disableMusicGuideBubble", i)) {
                MusicBubbleViewBinder tb = this.b;
                if (tb != null) {
                   uEditorManag1 = this.b();
                   if (uEditorManag1 == null || (uEditorManag1.s() != true && (p0.g() && !tb.getVisibility()))) {
                      Object[] objArray1 = new Object[i];
                      a.D().w("MusicBubbleViewBinder", "show music bubble, start show music = "+music1.mName, objArray1);
                      uob1 = new b(EditBubbleItem.RECOMMEND_MUSIC);
                      uob1.b(this.b);
                      uob1.j(new g(this, music1));
                      uob1.k(new h(this, music1));
                      this.f.n(uob1);
                   }
                }
             }
          }
       }
       if (p0.l() && !PatchProxy.applyVoid(null, this, musicBubbleV, "3")) {
          EditorManager uEditorManag = this.b();
          if (uEditorManag != null && (!uEditorManag.s() && this.c != null)) {
             int i1 = PostExperimentUtils.r0();
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 == 3) {
                      uob = new b(EditBubbleItem.BEAT_SYNC_NO_ICON);
                      uob.b(c.b(this.c, EditorItemFunc.MUSIC_V2));
                      this.f.n(uob);
                   }
                }else {
                   uob = new b(EditBubbleItem.BEAT_SYNC_WITH_ICON.setContent(a1.p(0x7f100b48)));
                   uob.b(c.b(this.c, EditorItemFunc.BEAT_SYNC));
                   uob.k(f.a);
                   this.f.n(uob);
                }
             }else {
                uob = new b(EditBubbleItem.BEAT_SYNC_WITH_ICON.setContent(a1.p(0x7f100b4e)));
                uob.b(c.b(this.c, EditorItemFunc.BEAT_SYNC));
                this.f.n(uob);
             }
          }
       }
       return;
    }
    public final void a(View p0,Animator$AnimatorListener p1,boolean p2){
       if (PatchProxy.isSupport(MusicBubbleViewBinder.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, MusicBubbleViewBinder.class, "10")) {
          return;
       }
       View view = p0.findViewById(R.id.arrow);
       a.o(view, "arrow");
       p0.setPivotX((((float)view.getLeft() + view.getTranslationX()) + ((float)view.getWidth() / (float)2)));
       p0.setPivotY((float)p0.getHeight());
       int i = (p2)? 0x7f010016: 0x7f010015;
       Animator uAnimator = AnimatorInflater.loadAnimator(this.h, i);
       if (p1 != null) {
          uAnimator.addListener(p1);
       }
       uAnimator.setTarget(p0);
       uAnimator.start();
       return;
    }
    public final EditorManager b(){
       Object[] objArray1;
       Object[] objArray = null;
       BaseFragment obj = PatchProxy.apply(objArray, this, MusicBubbleViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i.q();
       if (!obj instanceof BaseEditorFragment) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.B;
       }
       return objArray;
    }
    public final q c(){
       Object obj = PatchProxy.apply(null, this, MusicBubbleViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final boolean d(Workspace$Type p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicBubbleViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.E(p0) || p0 == Workspace$Type.PHOTO_MOVIE)? true: false;
       return b;
    }
}
