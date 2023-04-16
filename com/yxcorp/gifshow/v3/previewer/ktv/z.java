package com.yxcorp.gifshow.v3.previewer.ktv.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.util.HashMap;
import t36.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.v3.previewer.ktv.p$b;
import brd.t;
import eoc.e;
import brd.z;
import mwc.j0;
import com.yxcorp.gifshow.v3.previewer.ktv.y;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.previewer.ktv.v;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.v3.previewer.ktv.w;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.lang.Boolean;
import im8.f;
import maa.a;
import com.yxcorp.gifshow.v3.previewer.ktv.p;
import com.yxcorp.gifshow.v3.EditorManager;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import voc.o;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.yxcorp.gifshow.v3.editor.k;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Karaoke;
import com.yxcorp.gifshow.v3.previewer.ktv.z$b;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.utility.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import com.yxcorp.gifshow.edit.draft.model.DraftEditException;
import faa.a;
import q87.c;
import android.view.View;
import mwc.m0;
import java.lang.Runnable;
import com.kwai.feature.post.api.util.g;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import ekd.m1;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.previewer.ktv.z$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import uaa.a;
import qaa.a;
import taa.a;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import nwc.c;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;

public class z extends PresenterV2	// class@0015da
{
    public EditorManager A;
    public PublishSubject B;
    public PublishSubject C;
    public PublishSubject D;
    public PublishSubject E;
    public f F;
    public Map G;
    public f H;
    public KtvInfo I;
    public String J;
    public b K;
    public b L;
    public b M;
    public LinearLayout p;
    public TextView q;
    public VideoSDKPlayerView r;
    public View s;
    public c t;
    public a u;
    public a v;
    public a w;
    public a x;
    public KtvSongEditPreviewFragment y;
    public o z;
    public static final int N;

    static {
       z.N = a1.d(0x7f07051a);
    }
    public void z(){
       super();
       this.G = new HashMap();
       this.H = new f();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       this.M = RxBus.f.f(p$b.class).observeOn(e.c).subscribe(new j0(this), y.b);
       this.K = b9.c(this.K, new v(this));
       this.L = b9.c(this.L, new w(this));
       if (this.u.z().isEmpty()) {
          this.F.set(Boolean.FALSE);
       }else if(!this.w.E() || this.u.z().size() > 1){
          this.F.set(Boolean.TRUE);
       }else {
          this.F.set(Boolean.valueOf(p.j(this.u)));
       }
       this.S8();
       if (this.F.get().booleanValue()) {
          this.A.I();
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       b9.a(this.K);
       b9.a(this.L);
       b9.a(this.M);
       return;
    }
    public void P8(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "9")) {
          return;
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = this.z.f();
       videoEditorP.setAudioAssets(p0.audioAssets());
       videoEditorP.setTrackAssets(p0.trackAssets());
       videoEditorP.setIsKwaiPhotoMovie(p0.isKwaiPhotoMovie());
       videoEditorP.setProjectOutputWidth(p0.projectOutputWidth());
       videoEditorP.setProjectOutputHeight(p0.projectOutputHeight());
       videoEditorP.setAnimatedSubAssets(p0.animatedSubAssets());
       k.f().k(videoEditorP);
       return;
    }
    public final void R8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "8")) {
          return;
       }
       Karaoke karaoke = this.v.v();
       if (karaoke == null || !karaoke.hasAsset()) {
          throw new DraftEditException("Karaoke not set.");
       }
       z$b uob = new z$b(this, this.getActivity(), p0);
       uob.s(false);
       Void[] voidArray = new Void[false];
       uob.e(AsyncTask.l, voidArray);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       int i = 0;
       if (this.getActivity() == null) {
          Object[] objArray = new Object[i];
          a.D().A("KtvSongCoverPresenter", "updateCoverUI activity is null", objArray);
          return;
       }else if(!g.s(this.m8(), this.getActivity(), new m0(this))){
          return;
       }else {
          this.y.gi();
          z tp = this.p;
          int i1 = (this.F.get().booleanValue())? 8: 0;
          tp.setVisibility(i1);
          if (g.o()) {
             ViewGroup$MarginLayoutParams layoutParams = this.q.getLayoutParams();
             layoutParams.topMargin = z.N + n.A(this.getActivity());
             this.q.setLayoutParams(layoutParams);
          }
          tp = this.q;
          if (!this.F.get().booleanValue()) {
             i = 8;
          }
          tp.setVisibility(i);
          this.s.setAlpha(0x3f800000);
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a30f6);
       this.q = m1.f(p0, 0x7f0a1668);
       this.s = m1.f(p0, 0x7f0a2dc7);
       this.p = m1.f(p0, 0x7f0a166b);
       m1.a(p0, new z$a(this), R.id.ktv_song_init_mv);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.t = this.r8("WORKSPACE");
       this.u = this.r8("ASSET");
       this.v = this.r8("KARAOKE");
       this.w = this.r8("COVER");
       this.x = this.r8("PREVIEW");
       this.y = this.r8("FRAGMENT");
       this.z = this.r8("EDITOR_CONTEXT");
       this.A = this.r8("EDITOR_MANAGER");
       this.B = this.r8("KTV_SONG_SET_COVER_EVENT");
       this.C = this.r8("KTV_SONG_COVER_CHANGE_EVENT");
       this.D = this.r8("KTV_SONG_EDITOR_TOGGLE_EVENT");
       this.E = this.r8("KTV_SONG_RELOAD_COMPLETE_EVENT");
       this.F = this.x8("HAS_KTV_SONG_COVER");
       Map map = this.r8("LISTENERS_MAP");
       this.G = map;
       this.H = f.p0(map, c.class);
       this.I = this.r8("KTV_INFO");
       this.J = this.r8("TASK_ID");
       return;
    }
}
