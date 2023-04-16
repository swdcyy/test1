package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment;
import hka.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment$lyricContainerView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment$musicViewModel$2;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment$hiddenAbility$1;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.MusicLyricFragment$a;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import msc.q;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.music_v2.action.LyricHideAction;
import xvc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lsc.f0;
import wrc.e;
import jn9.b;
import java.util.List;
import wrc.c;
import wrc.f;
import java.util.Objects;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import wrc.g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.HashMap;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;

public final class MusicLyricFragment extends PostBaseFragment implements a	// class@0010d9
{
    public EditorDelegate p;
    public b q;
    public final List r;
    public final p s;
    public final p t;
    public final a u;
    public final MusicLyricFragment$a v;
    public HashMap w;

    public void MusicLyricFragment(){
       super();
       this.r = new ArrayList();
       this.s = s.c(new MusicLyricFragment$lyricContainerView$2(this));
       this.t = s.c(new MusicLyricFragment$musicViewModel$2(this));
       this.u = new MusicLyricFragment$hiddenAbility$1(this);
       this.v = new MusicLyricFragment$a(this);
    }
    public final EditorDelegate eh(){
       MusicLyricFragment obj = PatchProxy.apply(null, this, MusicLyricFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("editorDelegate");
       }
       return obj;
    }
    public final q fh(){
       Object obj = PatchProxy.apply(null, this, MusicLyricFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public final void gh(){
       if (PatchProxy.applyVoid(null, this, MusicLyricFragment.class, "13")) {
          return;
       }
       MusicLyricFragment tp = this.p;
       if (tp == null) {
          a.S("editorDelegate");
       }
       BaseFragment uBaseFragmen = tp.q();
       a.o(uBaseFragmen, "editorDelegate.previewFragment");
       e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
       a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
       uoe.y(R.anim.arg_RES_7f01004a, 0x7f01010d);
       uoe.s(this).m();
       return;
    }
    public final void hh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicLyricFragment.class, "11")) {
          return;
       }
       this.fh().r0().observe(this, this.v);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       FragmentActivity activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.F2(this);
       }
       MusicLyricFragment tp = this.p;
       if (tp == null) {
          a.S("editorDelegate");
       }
       tp.M(a1.d(R.dimen.arg_RES_7f070397), 0, 0, true);
       return;
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, MusicLyricFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.isAdded()) {
          this.gh();
          this.fh().t0(new LyricHideAction(b));
          b = true;
       }
       return b;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicLyricFragment.class, "7");
       if (p2 != patchProxyRe) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0365, p1, false);
       a.o(view, "rootView");
       p1.height = f0.j();
       MusicLyricFragment tr = this.r;
       q oq = this.fh();
       String str = "musicViewModel";
       a.o(oq, str);
       MusicLyricFragment tq = this.q;
       if (tq == null) {
          a.S("lyricListAdapter");
       }
       tr.add(new e(this, view, oq, tq));
       oq = this.fh();
       a.o(oq, str);
       this.r.add(new c(this, view, oq, this.u));
       tr = this.r;
       oq = this.fh();
       a.o(oq, str);
       tq = this.p;
       String str1 = "editorDelegate";
       if (tq == null) {
          a.S(str1);
       }
       View view1 = tq.z();
       String str2 = "null cannot be cast to non-null type com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView";
       Objects.requireNonNull(view1, str2);
       tr.add(new f(this, view, oq, view1));
       tr = this.r;
       oq = this.fh();
       a.o(oq, str);
       g obj = PatchProxy.apply(null, this, MusicLyricFragment.class, "5");
       EditDecorationContainerView uEditDecorat = (obj != patchProxyRe)? obj: this.s.getValue();
       a.o(uEditDecorat, "lyricContainerView");
       MusicLyricFragment tp = this.p;
       if (tp == null) {
          a.S(str1);
       }
       View view2 = tp.z();
       Objects.requireNonNull(view2, str2);
       obj = new g(this, view, oq, uEditDecorat, view2);
       tr.add(new f(this, view, oq, view1));
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, MusicLyricFragment.class, "16")) {
       }else {
          MusicLyricFragment tw = this.w;
          if (tw != null) {
             tw.clear();
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MusicLyricFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicLyricFragment.class, "9")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, MusicLyricFragment.class, "10")) {
             this.fh().r0().removeObserver(this.v);
             Iterator iterator = this.r.iterator();
             while (iterator.hasNext()) {
                iterator.next().C();
             }
             FragmentActivity activity = this.getActivity();
             if (activity instanceof GifshowActivity) {
                objArray = activity;
             }
             if (objArray != null) {
                objArray.l3(this);
             }
             MusicLyricFragment tp = this.p;
             if (tp == null) {
                a.S("editorDelegate");
             }
             tp.M(0, 0, 0, 0);
          }
       }else {
          this.hh();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicLyricFragment.class, "8")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.hh();
       return;
    }
}
