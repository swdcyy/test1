package com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3;
import hka.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$textViewModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$hiddenAbility$1;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$a;
import amd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import faa.a;
import q87.c;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TTSAttachAction;
import xvc.b;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import java.lang.Boolean;
import tvc.e;
import xld.c;
import xld.b;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TTSCancelDownloadAction;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TTSDetachAction;
import android.view.animation.Animation;
import java.lang.Integer;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$b;
import android.view.animation.Animation$AnimationListener;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.TextTTSFragmentV3$c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import java.util.HashMap;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import com.yxcrop.gifshow.v3.editor.text_v2.action.TTSAuditionStopAction;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.tts.vb.TTSVolumeViewBinder;
import java.util.List;
import rnd.b;
import rnd.k;
import rnd.e;

public final class TextTTSFragmentV3 extends PostBaseFragment implements a	// class@000b63
{
    public final p p;
    public final List q;
    public View r;
    public EditorDelegate s;
    public final a t;
    public final TextTTSFragmentV3$a u;
    public final boolean v;
    public HashMap w;

    public void TextTTSFragmentV3(boolean p0){
       super();
       this.v = p0;
       this.p = s.c(new TextTTSFragmentV3$textViewModel$2(this));
       this.q = new ArrayList();
       this.t = new TextTTSFragmentV3$hiddenAbility$1(this);
       this.u = new TextTTSFragmentV3$a(this);
    }
    public final c eh(){
       Object obj = PatchProxy.apply(null, this, TextTTSFragmentV3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final void fh(){
       if (PatchProxy.applyVoid(null, this, TextTTSFragmentV3.class, "14")) {
          return;
       }
       TextTTSFragmentV3 ts = this.s;
       if (ts == null) {
          a.S("editorDelegate");
       }
       BaseFragment uBaseFragmen = ts.q();
       a.o(uBaseFragmen, "editorDelegate.previewFragment");
       e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
       a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
       uoe.y(R.anim.arg_RES_7f01004a, 0x7f01010d);
       uoe.s(this).m();
       return;
    }
    public final void gh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextTTSFragmentV3.class, "13")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("TextTTSFragmentV3", "onTTSFragmentShowed", objArray1);
       this.eh().r0().observe(this, this.u);
       this.eh().t0(new TTSAttachAction());
       Iterator iterator = this.q.iterator();
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
       TextTTSFragmentV3 ts = this.s;
       if (ts == null) {
          a.S("editorDelegate");
       }
       ts.M(a1.d(R.dimen.arg_RES_7f0703a7), 0, 0, true);
       return;
    }
    public boolean onBackPressed(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, TextTTSFragmentV3.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isAdded()) {
          if (this.eh().o0().E().e()) {
             this.eh().t0(new TTSCancelDownloadAction());
          }else {
             this.fh();
             this.eh().t0(new TTSDetachAction());
          }
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       Animation uAnimation;
       if (PatchProxy.isSupport(TextTTSFragmentV3.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, TextTTSFragmentV3.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 && !p1) {
          uAnimation = AnimationUtils.loadAnimation(this.getContext(), p2);
          a.o(uAnimation, "animation");
          uAnimation.setDuration((long)300);
          uAnimation.setAnimationListener(new TextTTSFragmentV3$b(this));
          return uAnimation;
       }else if(p1 && p2){
          uAnimation = AnimationUtils.loadAnimation(this.getContext(), p2);
          a.o(uAnimation, "animation");
          uAnimation.setDuration((long)300);
          uAnimation.setAnimationListener(new TextTTSFragmentV3$c(this));
          return uAnimation;
       }else {
          return super.onCreateAnimation(p0, p1, p2);
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TextTTSFragmentV3.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d04c5, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­ech_v2, container, false\)");
       this.r = view;
       if (view == null) {
          a.S("viewRoot");
       }
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TextTTSFragmentV3.class, "17")) {
       }else {
          TextTTSFragmentV3 tw = this.w;
          if (tw != null) {
             tw.clear();
          }
       }
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(TextTTSFragmentV3.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, TextTTSFragmentV3.class, "11")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, TextTTSFragmentV3.class, "12")) {
             Object[] objArray1 = new Object[0];
             a.D().w("TextTTSFragmentV3", "onTTSFragmentHidden", objArray1);
             this.eh().r0().removeObserver(this.u);
             Iterator iterator = this.q.iterator();
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
             TextTTSFragmentV3 ts = this.s;
             if (ts == null) {
                a.S("editorDelegate");
             }
             ts.M(a1.d(R.dimen.arg_RES_7f0703a4), 0, 0, true);
          }
       }else {
          this.gh();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, TextTTSFragmentV3.class, "10")) {
          return;
       }
       super.onPause();
       this.eh().t0(new TTSAuditionStopAction());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTTSFragmentV3.class, "7")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.q.add(new TTSVolumeViewBinder(this, p0, this.v));
       this.q.add(new b(this, p0, this.v));
       this.q.add(new k(this, p0, this.v));
       this.q.add(new e(this, p0, this.t, this.v));
       this.gh();
       return;
    }
    public final View u1(){
       TextTTSFragmentV3 obj = PatchProxy.apply(null, this, TextTTSFragmentV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("viewRoot");
       }
       return obj;
    }
}
