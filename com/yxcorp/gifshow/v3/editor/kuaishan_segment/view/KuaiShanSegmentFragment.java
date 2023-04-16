package com.yxcorp.gifshow.v3.editor.kuaishan_segment.view.KuaiShanSegmentFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$d;
import kotlin.jvm.internal.a;
import lrc.c;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import faa.a;
import q87.c;
import w46.b;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Objects;
import mrc.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import krc.c;
import krc.a;
import java.util.Iterator;
import java.lang.Iterable;
import u80.f;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.action.KeyFrameAddClipAction;
import xvc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Number;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import i2b.a;
import java.util.HashMap;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.yxcorp.gifshow.v3.editor.kuaishan_segment.view.KuaiShanSegmentFragment$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.i;
import kwc.u;

public final class KuaiShanSegmentFragment extends BaseEditorFragment	// class@001027
{
    public final String G;
    public c H;
    public a I;
    public i J;
    public a K;
    public final PresenterV2 L;
    public HashMap M;

    public void KuaiShanSegmentFragment(){
       super();
       this.G = "KuaiShanSegmentFragment";
       this.L = new PresenterV2();
    }
    public void fh(){
       if (PatchProxy.applyVoid(null, this, KuaiShanSegmentFragment.class, "5")) {
          return;
       }
       Object[] objArray = new Object[]{this.hh()};
       this.L.i(objArray);
       KuaiShanSegmentFragment tH = this.H;
       if (tH == null) {
          a.S("mSegmentViewBinder");
       }
       tH.B();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KuaiShanSegmentFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(KuaiShanSegmentFragment.class, null);
       return objectsByTag;
    }
    public void gh(){
       if (PatchProxy.applyVoid(null, this, KuaiShanSegmentFragment.class, "6")) {
          return;
       }
       KuaiShanSegmentFragment tH = this.H;
       if (tH == null) {
          a.S("mSegmentViewBinder");
       }
       tH.C();
       this.L.unbind();
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(KuaiShanSegmentFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KuaiShanSegmentFragment.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(this.G, "onActivityResult: select media from album", objArray);
       if (p2 == null) {
          objArray1 = new Object[i];
          a.D().t(this.G, "onActivityResult: intent data is null", objArray1);
          return;
       }else if(p0 == 1000 && p1 == -1){
          List list = j0.e(p2, "album_data_list");
          if (list == null || list.isEmpty()) {
             objArray1 = new Object[i];
             a.D().t(this.G, "onActivityResult: no selected media return", objArray1);
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w(this.G, "onActivityResult: addClips with media list size = "+list.size(), objArray2);
             KuaiShanSegmentFragment tI = this.I;
             if (tI == null) {
                a.S("mSegmentViewModel");
             }
             Objects.requireNonNull(tI);
             if (!PatchProxy.applyVoidOneRefs(list, tI, a.class, "7")) {
                a.p(list, "mediaList");
                objArray2 = new Object[i];
                a.D().w("KuaiShanSegmentViewModel", "addClips with media size = "+list.size(), objArray2);
                int i1 = tI.o0().c().b().size();
                Iterator iterator = tI.o0().c().b().iterator();
                while (iterator.hasNext()) {
                   f uof = iterator.next();
                   if (uof.m()) {
                      if (!uof.p()) {
                         i = i + 1;
                      }
                      i1 = i;
                      break ;
                   }
                   i = i + 1;
                }
                tI.t0(new KeyFrameAddClipAction(list, i1));
             }
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KuaiShanSegmentFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       a.p(p0, "inflater");
       p2 = PatchProxy.apply(null, this, KuaiShanSegmentFragment.class, "2");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(PostExperimentUtils.U()){
          i = 0x7f0d04bb;
       }else {
          i = 0x7f0d04ba;
       }
       View view = a.g(p0, i, p1, false);
       this.q = view;
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KuaiShanSegmentFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       KuaiShanSegmentFragment tH = this.H;
       if (tH == null) {
          a.S("mSegmentViewBinder");
       }
       tH.C();
       this.L.destroy();
       if (!PatchProxy.applyVoid(null, this, KuaiShanSegmentFragment.class, "10")) {
          tH = this.M;
          if (tH != null) {
             tH.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KuaiShanSegmentFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       ViewModel viewModel = ViewModelProviders.of(this, new KuaiShanSegmentFragment$a(this)).get(a.class);
       a.o(viewModel, "ViewModelProviders.of\(th¡­entViewModel::class.java\)");
       this.I = viewModel;
       KuaiShanSegmentFragment tJ = this.J;
       if (tJ == null) {
          a.S("mEditorHelperContract");
       }
       KuaiShanSegmentFragment tI = this.I;
       if (tI == null) {
          a.S("mSegmentViewModel");
       }
       VideoSDKPlayerView videoSDKPlay = f.n(this.t);
       a.o(videoSDKPlay, "EditUtils.getPlayerView\(mEditorDelegate\)");
       c uoc = new c(this, tJ, tI, videoSDKPlay, p0);
       this.H = viewModel;
       this.L.U7(new u());
       this.L.f(p0);
       this.fh();
       return;
    }
}
