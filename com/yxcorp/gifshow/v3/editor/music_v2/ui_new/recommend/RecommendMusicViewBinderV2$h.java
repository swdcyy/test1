package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$h;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicItemClickedAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$b$a;
import mn9.a;
import tvc.e;
import urc.e;
import src.b;
import src.o;
import jn9.b;
import com.kuaishou.android.model.music.Music;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.content.Context;
import androidx.fragment.app.Fragment;
import k2b.e0;
import lsc.g0;
import ooc.g1;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicSelectedAction;
import urc.k;
import src.n;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import urc.f;
import urc.b;
import trc.t0;
import urc.i;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction;
import pn9.d;

public final class RecommendMusicViewBinderV2$h implements PostListComponentView$b	// class@001114
{
    public final RecommendMusicViewBinderV2 a;

    public void RecommendMusicViewBinderV2$h(RecommendMusicViewBinderV2 p0){
       this.a = p0;
       super();
    }
    public void a(b p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RecommendMusicViewBinderV2$h.class, "3")) {
          return;
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       this.a.d.t0(new MusicItemClickedAction());
       return;
    }
    public void b(LoadingStatus p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecommendMusicViewBinderV2$h.class, "4")) {
          return;
       }
       a.p(p0, "newLoadingStatus");
       a.p(p1, "tag");
       PostListComponentView$b$a.a(this, p0, p1);
       return;
    }
    public void c(a p0,View p1,String p2){
       b uob3;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RecommendMusicViewBinderV2$h.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "tag");
       e uoe = this.a.d.o0();
       b uob = p0;
       b uob1 = null;
       int i = 1;
       if (uob instanceof o) {
          RecommendMusicViewBinderV2$h ta = this.a;
          int i1 = ta.D(ta.e.f(p0));
          ta.index = i1;
          Context context = this.a.G().getContext();
          if (!context instanceof e0) {
             context = uob1;
          }
          g0.l(context, uob.b(), 448, String.valueOf(i1));
          g1.n(uob.b(), 11, i);
          g0.e(uob.b(), "CLICK_MUSIC", i, false);
       }
       RecommendMusicViewBinderV2 d = this.a.d;
       int i2 = uoe.v().c();
       int i3 = uoe.r();
       SelectSource rAP_MUSIC = (v5 = uob instanceof n)? SelectSource.RAP_MUSIC: SelectSource.RECOMMEND_LIST;
       double d1 = uoe.t();
       if (v5) {
          b uob2 = uoe.s().f();
          if (uob2 != null) {
             uob3 = uob2;
          label_00b3 :
             MusicSelectedAction musicSelecte = new MusicSelectedAction(uob, i2, i3, rAP_MUSIC, d1, uob3, (uoe.v().g() ^ i));
             d.t0(false);
             return;
          }else {
             t0 ot0 = uob.c();
             if (ot0 != null) {
                uob1 = ot0.b();
             }
          }
       }else {
          uob1 = uoe.s().e();
       }
       uob3 = uob1;
       goto label_00b3 ;
    }
    public void d(a p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RecommendMusicViewBinderV2$h.class, "2")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       i oi = this.a.d.o0().s().i();
       if (oi != null) {
          SelectSource selectSource = oi.h();
          if (selectSource != null) {
             int i = this.a.d.o0().v().d();
             Context context = this.a.G().getContext();
             if (!context instanceof e0) {
                context = null;
             }
             g0.h(context, p0.b());
             this.a.d.t0(new MusicUnSelectedAction(i, selectSource));
          }
       }
       return;
    }
    public void e(b p0,b p1,String p2){
       d.a(this, p0, p1, p2);
    }
}
