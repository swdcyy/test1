package com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment;
import hka.a;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$hiddenAbility$1;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import msd.a;
import java.lang.Number;
import lnc.a1;
import java.util.List;
import amd.c;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import tvc.f;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import androidx.lifecycle.Observer;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import voc.o;
import bvc.b;
import t36.f;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$d;
import t36.f$a;
import androidx.lifecycle.LifecycleOwner;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$e;
import java.lang.Boolean;
import tvc.e;
import xld.a;
import java.util.Map;
import com.yxcrop.gifshow.v3.editor.decoration_v2.action.PhotoMovieDecorationTimelineDetachAction;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.timeline.DecorationTimelineDetachAction;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.timeline.SubtitleTimelineFragment;
import android.os.Bundle;
import android.view.animation.Animation;
import java.lang.Integer;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$b;
import android.view.animation.Animation$AnimationListener;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.DecorationTimelineFragment$c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;

public abstract class DecorationTimelineFragment extends PostBaseFragment implements a	// class@000a37
{
    public c p;
    public final List q;
    public View r;
    public EditorDelegate s;
    public final a t;
    public final g u;
    public HashMap v;

    public void DecorationTimelineFragment(){
       super();
       this.q = new ArrayList();
       this.t = new DecorationTimelineFragment$hiddenAbility$1(this);
       this.u = new DecorationTimelineFragment$a(this);
    }
    public String Me(){
       return "DecorationTimelineFragment";
    }
    public void eh(){
       if (PatchProxy.applyVoid(null, this, DecorationTimelineFragment.class, "19")) {
          return;
       }
       DecorationTimelineFragment tv = this.v;
       if (tv != null) {
          tv.clear();
       }
       return;
    }
    public final EditorDelegate fh(){
       DecorationTimelineFragment obj = PatchProxy.apply(null, this, DecorationTimelineFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("editorDelegate");
       }
       return obj;
    }
    public final a gh(){
       return this.t;
    }
    public abstract int hh();
    public int ih(){
       Object obj = PatchProxy.apply(null, this, DecorationTimelineFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f0703a4);
    }
    public final List jh(){
       return this.q;
    }
    public final c kh(){
       DecorationTimelineFragment obj = PatchProxy.apply(null, this, DecorationTimelineFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("viewModel");
       }
       return obj;
    }
    public abstract c lh(Fragment p0);
    public final void mh(){
       if (PatchProxy.applyVoid(null, this, DecorationTimelineFragment.class, "15")) {
          return;
       }
       DecorationTimelineFragment ts = this.s;
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
    public void nh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DecorationTimelineFragment.class, "13")) {
          return;
       }
       DecorationTimelineFragment tp = this.p;
       if (tp == null) {
          a.S("viewModel");
       }
       tp.r0().removeObserver(this.u);
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       FragmentActivity activity = this.getActivity();
       if (!activity instanceof EditorActivity) {
          activity = objArray;
       }
       if (activity != null) {
          activity.Y3();
       }
       activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.l3(this);
       }
       tp = this.s;
       String str = "editorDelegate";
       if (tp == null) {
          a.S(str);
       }
       o oo = tp.x();
       a.o(oo, "editorDelegate.editorContext");
       oo.b().h(false);
       tp = this.s;
       if (tp == null) {
          a.S(str);
       }
       tp.M(false, false, false, true);
       tp = this.s;
       if (tp == null) {
          a.S(str);
       }
       tp.j().s0(DecorationTimelineFragment$d.a);
       return;
    }
    public final void oh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DecorationTimelineFragment.class, "14")) {
          return;
       }
       DecorationTimelineFragment tp = this.p;
       if (tp == null) {
          a.S("viewModel");
       }
       tp.r0().observe(this, this.u);
       Iterator iterator = this.q.iterator();
       while (iterator.hasNext()) {
          iterator.next().B();
       }
       FragmentActivity activity = this.getActivity();
       if (!activity instanceof EditorActivity) {
          activity = objArray;
       }
       if (activity != null) {
          activity.O3();
       }
       activity = this.getActivity();
       if (activity instanceof GifshowActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          objArray.F2(this);
       }
       tp = this.s;
       String str = "editorDelegate";
       if (tp == null) {
          a.S(str);
       }
       o oo = tp.x();
       a.o(oo, "editorDelegate.editorContext");
       oo.b().h(true);
       tp = this.s;
       if (tp == null) {
          a.S(str);
       }
       tp.M(this.ih(), 0, 0, true);
       tp = this.s;
       if (tp == null) {
          a.S(str);
       }
       tp.j().s0(DecorationTimelineFragment$e.a);
       return;
    }
    public boolean onBackPressed(){
       DecorationTimelineFragment obj = PatchProxy.apply(null, this, DecorationTimelineFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.isAdded()) {
          this.mh();
          obj = this.p;
          String str = "viewModel";
          if (obj == null) {
             a.S(str);
          }
          if (obj.o0().t()) {
             obj = this.p;
             if (obj == null) {
                a.S(str);
             }
             Map map = obj.o0().l();
             DecorationTimelineFragment tp = this.p;
             if (tp == null) {
                a.S(str);
             }
             tp.t0(new PhotoMovieDecorationTimelineDetachAction(b, b, map));
          }else {
             obj = this.p;
             if (obj == null) {
                a.S(str);
             }
             obj.t0(new DecorationTimelineDetachAction(b, this instanceof SubtitleTimelineFragment, b));
          }
          b = true;
       }
       return b;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationTimelineFragment.class, "7")) {
          return;
       }
       super.onCreate(p0);
       this.p = this.lh(this);
       return;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       Animation uAnimation;
       if (PatchProxy.isSupport(DecorationTimelineFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, DecorationTimelineFragment.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p2 && !p1) {
          uAnimation = AnimationUtils.loadAnimation(this.getContext(), p2);
          a.o(uAnimation, "animation");
          uAnimation.setDuration((long)300);
          uAnimation.setAnimationListener(new DecorationTimelineFragment$b(this));
          return uAnimation;
       }else if(p1 && p2){
          uAnimation = AnimationUtils.loadAnimation(this.getContext(), p2);
          a.o(uAnimation, "animation");
          uAnimation.setDuration((long)300);
          uAnimation.setAnimationListener(new DecorationTimelineFragment$c(this));
          return uAnimation;
       }else {
          return super.onCreateAnimation(p0, p1, p2);
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DecorationTimelineFragment.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, this.hh(), p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­urce\(\), container, false\)");
       this.r = view;
       if (view == null) {
          a.S("viewRoot");
       }
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.eh();
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(DecorationTimelineFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DecorationTimelineFragment.class, "12")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (p0) {
          this.nh();
       }else {
          this.oh();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationTimelineFragment.class, "9")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.oh();
       p0.setVisibility(0);
       return;
    }
    public final void ph(EditorDelegate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationTimelineFragment.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.s = p0;
       return;
    }
    public final void show(){
       if (PatchProxy.applyVoid(null, this, DecorationTimelineFragment.class, "16")) {
          return;
       }
       DecorationTimelineFragment ts = this.s;
       String str = "editorDelegate";
       if (ts == null) {
          a.S(str);
       }
       BaseFragment uBaseFragmen = ts.q();
       String str1 = "editorDelegate.previewFragment";
       a.o(uBaseFragmen, str1);
       e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
       a.o(uoe, "editorDelegate.previewFr¡­anager.beginTransaction\(\)");
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       if (this.isAdded()) {
          uoe.E(this).o();
       }else {
          DecorationTimelineFragment ts1 = this.s;
          if (ts1 == null) {
             a.S(str);
          }
          BaseFragment uBaseFragmen1 = ts1.q();
          a.o(uBaseFragmen1, str1);
          c childFragmen = uBaseFragmen1.getChildFragmentManager();
          Fragment uFragment = childFragmen.findFragmentByTag(this.Me());
          if (uFragment != null) {
             uoe.u(uFragment);
          }
          DecorationTimelineFragment ts2 = this.s;
          if (ts2 == null) {
             a.S(str);
          }
          uoe.g(ts2.m(), this, this.Me());
          uoe.o();
       }
       return;
    }
    public final View u1(){
       DecorationTimelineFragment obj = PatchProxy.apply(null, this, DecorationTimelineFragment.class, "3");
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
