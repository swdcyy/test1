package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2$f;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.recommend.RecommendMusicViewBinderV2;
import java.lang.Object;
import nn9.b;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import mn9.a;
import src.i;
import com.yxcorp.gifshow.v3.editor.music_v2.model.EditorMusicButtonType;
import ooc.g1;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.f;
import urc.i;
import com.kuaishou.android.model.music.Music;
import lsc.g0;
import com.trello.rxlifecycle3.components.support.RxFragment;
import androidx.fragment.app.Fragment;
import lsc.f0;
import src.n;
import java.lang.CharSequence;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicItemClickedAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.music_v2.action.RapStyleSwitchAction;
import com.yxcorp.gifshow.component.postlistcomponent.view.PostListComponentView$a$a;

public final class RecommendMusicViewBinderV2$f implements PostListComponentView$a	// class@001112
{
    public final RecommendMusicViewBinderV2 a;

    public void RecommendMusicViewBinderV2$f(RecommendMusicViewBinderV2 p0){
       this.a = p0;
       super();
    }
    public boolean a(b p0,View p1,String p2){
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecommendMusicViewBinderV2$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "itemState");
       a.p(p1, "itemView");
       a.p(p2, "tag");
       obj = p0.g();
       if (obj instanceof i) {
          if (obj.a == EditorMusicButtonType.LIBRARY) {
             g1.v(3, "Music", "online_music");
             i oi = this.a.d.o0().s().i();
             Music music = (oi != null)? oi.g(): null;
             g0.k(music);
             f0.m(this.a.G());
          }
          return true;
       }else if(obj instanceof n){
          boolean b = false;
          if (p0.d()) {
             this.a.K(true);
             return b;
          }else {
             this.a.K(b);
             String id = obj.b().getId();
             RecommendMusicViewBinderV2$f uof = (id == null || !id.length())? 1: null;
             if (!uof) {
                return b;
             }else {
                this.a.d.t0(new MusicItemClickedAction());
                this.a.d.t0(new RapStyleSwitchAction());
                return true;
             }
          }
       }else {
          return PostListComponentView$a$a.a(this, p0, p1, p2);
       }
    }
}
