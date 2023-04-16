package com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import vrc.d;
import xvc.f;
import qrc.j;
import com.kwai.robust.PatchProxyResult;
import msc.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import qrc.r;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$musicRepo$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$rapRepo$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$localRepo$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$musicPlayTimeLogHelper$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$d;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$c;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$recommendListDataProvider$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$recommendListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$collectListDataProvider$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$collectListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$historyListDataProvider$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$historyListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$lyricRepo$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$lyricListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$localListAdapter$2;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$a;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator$b;
import jn9.b;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import ekd.j0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import msc.r;
import trc.x;
import com.yxcorp.gifshow.v3.editor.music_v2.network.RapRepo;
import trc.g;
import d46.d;
import qrc.e;
import android.view.View;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import msc.q;
import androidx.lifecycle.ViewModel;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicInitAction;
import xvc.b;
import jn9.b$b;
import kqb.d;
import com.yxcorp.gifshow.music.utils.m;
import com.yxcorp.gifshow.music.utils.f$a;
import com.yxcorp.gifshow.music.utils.f;
import urc.e;
import urc.f;
import urc.i;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import qrc.k;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import lsc.h0;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.widget.l;
import java.lang.Boolean;
import tvc.e;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicReleaseAction;
import com.kuaishou.android.model.music.MusicType;
import src.f;
import mn9.a;
import src.e;

public final class MusicFragmentCreator implements d	// class@00105c
{
    public final String b;
    public MusicRootFragment c;
    public final EditorDelegate d;
    public final FragmentActivity e;
    public q f;
    public final p g;
    public final p h;
    public final p i;
    public SwitchTab j;
    public final p k;
    public final MusicFragmentCreator$d l;
    public final MusicFragmentCreator$c m;
    public final p n;
    public final p o;
    public final p p;
    public final p q;
    public final p r;
    public final p s;
    public final p t;
    public final p u;
    public final p v;
    public a w;
    public final MusicFragmentCreator$a x;
    public final MusicFragmentCreator$b y;
    public final j z;

    public void MusicFragmentCreator(f p0,j p1){
       Object[] objArray;
       MusicFragmentCreator musicFragmen = this;
       String obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicFragmentCreator musicFragmen1 = MusicFragmentCreator.class;
       a uoa = a.class;
       a.p(obj, "option");
       super();
       musicFragmen.z = obj;
       musicFragmen.b = "MusicFragmentCreator";
       EditorDelegate uEditorDeleg = p1.b().a();
       musicFragmen.d = uEditorDeleg;
       musicFragmen.e = p1.b().b;
       musicFragmen.g = s.c(new MusicFragmentCreator$musicRepo$2(musicFragmen));
       p op = s.c(new MusicFragmentCreator$rapRepo$2(musicFragmen));
       musicFragmen.h = op;
       musicFragmen.i = s.c(MusicFragmentCreator$localRepo$2.INSTANCE);
       musicFragmen.j = SwitchTab.RECOMMEND;
       musicFragmen.k = s.c(MusicFragmentCreator$musicPlayTimeLogHelper$2.INSTANCE);
       MusicFragmentCreator$d uod = new MusicFragmentCreator$d(musicFragmen);
       musicFragmen.l = uod;
       MusicFragmentCreator$c uoc = new MusicFragmentCreator$c(musicFragmen);
       musicFragmen.m = uoc;
       musicFragmen.n = s.c(new MusicFragmentCreator$recommendListDataProvider$2(musicFragmen));
       musicFragmen.o = s.c(new MusicFragmentCreator$recommendListAdapter$2(musicFragmen));
       musicFragmen.p = s.c(new MusicFragmentCreator$collectListDataProvider$2(musicFragmen));
       musicFragmen.q = s.c(new MusicFragmentCreator$collectListAdapter$2(musicFragmen));
       musicFragmen.r = s.c(new MusicFragmentCreator$historyListDataProvider$2(musicFragmen));
       musicFragmen.s = s.c(new MusicFragmentCreator$historyListAdapter$2(musicFragmen));
       musicFragmen.t = s.c(new MusicFragmentCreator$lyricRepo$2(musicFragmen));
       musicFragmen.u = s.c(new MusicFragmentCreator$lyricListAdapter$2(musicFragmen));
       p op1 = s.c(new MusicFragmentCreator$localListAdapter$2(musicFragmen));
       musicFragmen.v = op1;
       musicFragmen.w = new a();
       MusicFragmentCreator$a uoa1 = new MusicFragmentCreator$a(musicFragmen);
       musicFragmen.x = uoa1;
       MusicFragmentCreator$b uob = new MusicFragmentCreator$b(musicFragmen);
       musicFragmen.y = uob;
       MusicFragmentCreator w = musicFragmen.w;
       b uob1 = this.j();
       Objects.requireNonNull(w);
       String str = "2";
       obj = "<set-?>";
       if (PatchProxy.applyVoidOneRefs(uob1, w, uoa, str)) {
       }else {
          a.p(uob1, obj);
          w.a = uob1;
       }
       w = musicFragmen.w;
       uob1 = this.d();
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(uob1, w, uoa, "6")) {
          a.p(uob1, obj);
          w.c = uob1;
       }
       w = musicFragmen.w;
       uob1 = this.e();
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(uob1, w, uoa, "8")) {
          a.p(uob1, obj);
          w.d = uob1;
       }
       w = musicFragmen.w;
       uob1 = this.g();
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(uob1, w, uoa, "4")) {
          a.p(uob1, obj);
          w.b = uob1;
       }
       w = musicFragmen.w;
       r obj1 = PatchProxy.apply(null, musicFragmen, musicFragmen1, "13");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = op1.getValue();
       }
       Objects.requireNonNull(w);
       if (!PatchProxy.applyVoidOneRefs(obj1, w, uoa, "10")) {
          a.p(obj1, obj);
          w.e = obj1;
       }
       obj = j0.f(uEditorDeleg.getIntent(), "SOURCE");
       if (obj == null) {
          obj = "";
       }
       a.o(obj, "IntentUtils.getStringExt\x20\x02INTENT_DATA_SOURCE\) ?: \"\"\x00");
       BaseFragment uBaseFragmen = uEditorDeleg.q();
       x ox = this.i();
       View obj2 = PatchProxy.apply(null, musicFragmen, musicFragmen1, str);
       RapRepo rapRepo = (obj2 != patchProxyRe)? obj2: op.getValue();
       g og = this.f();
       d uod1 = this.h();
       a.o(uod1, "musicPlayTimeLogHelper");
       e uoe = p1.a();
       obj2 = p1.b().a().z();
       if (!obj2 instanceof VideoSDKPlayerView) {
          objArray = null;
       }
       obj1 = new r(p0, ox, rapRepo, og, uod1, uoe, objArray);
       q oq = ViewModelProviders.of(uBaseFragmen, op1).get(q.class);
       musicFragmen.f = oq;
       if (oq != null) {
          f uof = oq.r0();
          if (uof != null) {
             uof.observeForever(uod);
          }
       }
       MusicFragmentCreator f = musicFragmen.f;
       if (f != null) {
          String taskId = uEditorDeleg.getTaskId();
          a.o(taskId, "delegate.taskId");
          f.t0(new MusicInitAction(obj, taskId));
       }
       boolean b = false;
       b.b(this.j(), uoc, b, 2, null);
       b.w(this.j(), false, false, null, 7, null);
       b.w(this.g(), b, false, null, 7, null);
       if (p1.b().d()) {
          b.w(this.e(), false, false, null, 7, null);
          m.h(uob);
       }
       f.d(uoa1);
       return;
    }
    public void Mb(e p0,e p1){
       h0 oh0;
       MusicFragmentCreator musicFragmen = MusicFragmentCreator.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, musicFragmen, "16")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       this.j = p0.s().c();
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, musicFragmen, "18")) {
          int i = 1;
          int i1 = 0;
          if (p0.s().i() != null) {
             Music music = p0.s().i().g();
             i oi = p1.s().i();
             Music music1 = (oi != null)? oi.g(): null;
             if ((a.g(music, music1) ^ i) || p0.s().i().h() != p1.s().i().h()) {
                oh0 = 1;
             label_0076 :
                if (oh0) {
                   boolean b = this.z.b().g().d();
                   MusicFragmentCreator tc = this.c;
                   boolean b1 = (tc != null && tc.isVisible() == i)? true: false;
                   i oi1 = p0.s().i();
                   SelectSource selectSource = (oi1 != null)? oi1.h(): null;
                   if (selectSource != SelectSource.AUTO_MUSIC) {
                      i = false;
                   }
                   Object[] objArray = new Object[i1];
                   a.D().s(this.b, "music changed isPreviewFragmentAlive = ["+b+"], isMusicFragmentOpened = ["+b1+"], isAutoMusic = ["+i+']', objArray);
                   if (oh0 && (b && (b1 || i))) {
                      h0.e(this.d);
                      if (i) {
                         MusicFragmentCreator td = this.d;
                         if (!PatchProxy.applyVoidOneRefs(td, null, h0.class, "9")) {
                            a.p(td, "delegate");
                            if (f.E(td.getType())) {
                               l ol = h0.a(td);
                               if (ol != null) {
                                  ol.v();
                               }
                            }
                         }
                      }else {
                         h0.d(this.d);
                      }
                   }
                }
             }
          }
          oh0 = null;
          goto label_0076 ;
       }
    label_0114 :
       return;
    }
    public final boolean a(){
       boolean b;
       Object[] objArray = null;
       MusicFragmentCreator obj = PatchProxy.apply(objArray, this, MusicFragmentCreator.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.j == SwitchTab.HISTORY) {
          obj = this.f;
          if (obj != null) {
             e uoe = obj.u0();
             if (uoe != null) {
                f uof = uoe.s();
                if (uof != null) {
                   i oi = uof.i();
                   if (oi != null) {
                      objArray = oi.h();
                   }
                }
             }
          }
          if (objArray != SelectSource.MUSIC_LIBRARY) {
             b = false;
          label_003e :
             return b;
          }
       }
       b = true;
       goto label_003e ;
    }
    public final MusicRootFragment b(){
       MusicRootFragment obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MusicRootFragment();
       MusicFragmentCreator tw = this.w;
       String str = "<set-?>";
       if (!PatchProxy.applyVoidOneRefs(tw, obj, MusicRootFragment.class, "4")) {
          a.p(tw, str);
          obj.J = tw;
       }
       r or = this.z.b();
       if (!PatchProxy.applyVoidOneRefs(or, obj, MusicRootFragment.class, "13")) {
          a.p(or, str);
          obj.W = or;
       }
       e uoe = this.z.a();
       if (!PatchProxy.applyVoidOneRefs(uoe, obj, MusicRootFragment.class, "15")) {
          a.p(uoe, str);
          obj.X = uoe;
       }
       d uod = this.h();
       a.o(uod, "musicPlayTimeLogHelper");
       if (!PatchProxy.applyVoidOneRefs(uod, obj, MusicRootFragment.class, "17")) {
          a.p(uod, "helper");
          obj.V = uod;
          uod.d(obj);
       }
       this.c = obj;
       return obj;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, MusicFragmentCreator.class, "20")) {
          return;
       }
       this.g().z();
       this.j().z();
       this.d().z();
       this.e().z();
       m.j(this.y);
       f.e(this.x);
       MusicFragmentCreator tf = this.f;
       if (tf != null) {
          tf.t0(new MusicReleaseAction());
       }
       tf = this.f;
       if (tf != null) {
          f uof = tf.r0();
          if (uof != null) {
             uof.removeObserver(this.l);
          }
       }
       return;
    }
    public final b d(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final b e(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final g f(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final b g(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final d h(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final x i(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final b j(){
       Object obj = PatchProxy.apply(null, this, MusicFragmentCreator.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public final void k(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragmentCreator.class, "15")) {
          return;
       }
       if (p0 != null) {
          if (p0.mType == MusicType.LOCAL) {
             this.e().s(new f(p0), 0);
          }else {
             this.e().s(new e(p0), 0);
          }
       }
       return;
    }
}
