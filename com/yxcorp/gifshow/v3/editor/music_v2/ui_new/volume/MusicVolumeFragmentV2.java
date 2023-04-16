package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2;
import hka.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2$musicViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.volume.MusicVolumeFragmentV2$a;
import msc.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.v3.editor.music_v2.action.VolumeHideAction;
import xvc.b;
import androidx.lifecycle.LifecycleOwner;
import com.yxcorp.gifshow.v3.editor.music_v2.action.VolumeShowAction;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lsc.f0;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.volume.vb.VolumeViewBinder;
import java.util.List;
import ksc.b;
import java.util.HashMap;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;

public final class MusicVolumeFragmentV2 extends PostBaseFragment implements a	// class@00111c
{
    public EditorDelegate p;
    public MusicRootFragment q;
    public final List r;
    public final p s;
    public final MusicVolumeFragmentV2$a t;
    public HashMap u;

    public void MusicVolumeFragmentV2(){
       super();
       this.r = new ArrayList();
       this.s = s.c(new MusicVolumeFragmentV2$musicViewModel$2(this));
       this.t = new MusicVolumeFragmentV2$a(this);
    }
    public final q eh(){
       Object obj = PatchProxy.apply(null, this, MusicVolumeFragmentV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final void fh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicVolumeFragmentV2.class, "10")) {
          return;
       }
       this.eh().r0().removeObserver(this.t);
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
       this.eh().t0(new VolumeHideAction());
       return;
    }
    public final void gh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicVolumeFragmentV2.class, "11")) {
          return;
       }
       this.eh().r0().observe(this, this.t);
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
       this.eh().t0(new VolumeShowAction());
       return;
    }
    public boolean onBackPressed(){
       boolean b;
       Object[] objArray = null;
       MusicVolumeFragmentV2 obj = PatchProxy.apply(objArray, this, MusicVolumeFragmentV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isAdded()) {
          if (!PatchProxy.applyVoid(objArray, this, MusicVolumeFragmentV2.class, "13")) {
             obj = this.p;
             if (obj == null) {
                a.S("editorDelegate");
             }
             BaseFragment uBaseFragmen = obj.q();
             a.o(uBaseFragmen, "editorDelegate.previewFragment");
             e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
             a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
             uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
             uoe.s(this).o();
          }
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicVolumeFragmentV2.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0372, p1, false);
       a.o(view, "rootView");
       p1.height = f0.j();
       MusicVolumeFragmentV2 tr = this.r;
       MusicVolumeFragmentV2 tq = this.q;
       if (tq == null) {
          a.S("musicRootFragment");
       }
       tr.add(new VolumeViewBinder(tq, view));
       tr = this.r;
       tq = this.q;
       if (tq == null) {
          a.S("musicRootFragment");
       }
       tr.add(new b(tq, view));
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MusicVolumeFragmentV2.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.fh();
       if (!PatchProxy.applyVoid(null, this, MusicVolumeFragmentV2.class, "16")) {
          MusicVolumeFragmentV2 tu = this.u;
          if (tu != null) {
             tu.clear();
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(MusicVolumeFragmentV2.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicVolumeFragmentV2.class, "9")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          this.fh();
       }else {
          this.gh();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicVolumeFragmentV2.class, "7")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.gh();
       return;
    }
}
