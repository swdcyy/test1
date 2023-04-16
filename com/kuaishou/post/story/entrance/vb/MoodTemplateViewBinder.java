package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import ei0.a;
import androidx.fragment.app.Fragment;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.widget.StoryHollowTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.yxcorp.gifshow.v3.widget.FadingEdgeContainer;
import android.widget.ImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import com.yxcorp.gifshow.widget.FakePieLoadingView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.post.story.widget.PureTextBackgroundView;
import mq4.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import k17.b;
import mq4.e;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$o;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$p;
import lq4.a;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import pi9.e;
import lnc.s6;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.facebook.drawee.generic.RoundingParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.feature.post.api.util.g;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$l;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$m;
import java.lang.Runnable;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$n;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$b;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$c;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$d;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$e;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$f;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$g;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$h;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$i;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$j;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$k;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$mRefreshAlbumObserver$1;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$mRefreshDataObserver$1;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.entrance.e;
import java.lang.StringBuilder;
import kotlin.Pair;
import java.lang.Boolean;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import nq4.b;
import erd.g;
import crd.b;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n3d.a;
import hka.a;
import crd.a;
import jb7.b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import android.widget.RelativeLayout;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.n;
import mq4.b;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Integer;
import android.view.ViewTreeObserver;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.Iterator;
import java.lang.Iterable;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import nq4.a;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import qkd.b;
import java.lang.CharSequence;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import android.graphics.Color;
import kb.h;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ab.h;
import com.facebook.drawee.controller.AbstractDraweeController;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import xb.t$b;
import rp4.n$a;
import rp4.n$b;
import android.app.Activity;
import rp4.n;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;

public final class MoodTemplateViewBinder extends a	// class@000b6e
{
    public final ImageView A;
    public final View B;
    public final TextView C;
    public final f D;
    public ImageRequest E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final b K;
    public StoryTemplateDataStickerDrawer L;
    public final a M;
    public AttrAnimProgressFragment N;
    public final a O;
    public final LifecycleObserver P;
    public final LifecycleObserver Q;
    public final Fragment R;
    public final MoodTemplateViewModel S;
    public final View c;
    public final StoryHollowTextView d;
    public final KwaiImageView e;
    public final VideoSDKPlayerView f;
    public final FadingEdgeContainer g;
    public final View h;
    public final View i;
    public final KwaiImageView j;
    public final ImageView k;
    public final TextView l;
    public final TextView m;
    public final KwaiActionBar n;
    public final StoryDecorationContainerView o;
    public final KwaiImageView p;
    public final View q;
    public final TextView r;
    public final FakePieLoadingView s;
    public final ViewGroup t;
    public final ImageView u;
    public final View v;
    public final View w;
    public final RecyclerView x;
    public final View y;
    public final PureTextBackgroundView z;

    public void MoodTemplateViewBinder(Fragment p0,MoodTemplateViewModel p1,View p2){
       a hierarchy;
       ViewGroup$LayoutParams obj3;
       ViewGroup$LayoutParams layoutParams;
       MoodTemplateViewModel moodTemplate;
       View view16;
       LifecycleOwner lifecycleOwn;
       View obj = p0;
       View obj1 = p1;
       f obj2 = p2;
       a.p(obj, "fragment");
       a.p(obj1, "moodTemplateViewModel");
       a.p(obj2, "rootView");
       super(obj2);
       this.R = obj;
       this.S = obj1;
       View view = obj2.findViewById(R.id.click_to_show_text_edit);
       this.c = view;
       StoryHollowTextView storyHollowT = obj2.findViewById(R.id.done_btn);
       this.d = storyHollowT;
       View view1 = obj2.findViewById(R.id.image_showing_view);
       a.o(view1, "rootView.findViewById\(R.id.image_showing_view\)");
       this.e = view1;
       this.f = obj2.findViewById(0x7f0a3120);
       view1 = obj2.findViewById(R.id.fading_edge_container);
       a.o(view1, "rootView.findViewById\(R.¡­  .fading_edge_container\)");
       this.g = view1;
       View view2 = obj2.findViewById(R.id.click_to_close_remote_panel);
       a.o(view2, "rootView.findViewById\(R.¡­ck_to_close_remote_panel\)");
       this.h = view2;
       View view3 = obj2.findViewById(R.id.button_story_import_color_bg);
       this.i = view3;
       KwaiImageView kwaiImageVie = obj2.findViewById(R.id.background_image_view);
       this.j = kwaiImageVie;
       ImageView imageView = obj2.findViewById(R.id.border_image_view);
       this.k = imageView;
       TextView textView = obj2.findViewById(R.id.import_local_tv);
       this.l = textView;
       this.m = obj2.findViewById(0x7f0a395d);
       View view4 = obj2.findViewById(R.id.title_root);
       a.o(view4, "rootView.findViewById\(R.id.title_root\)");
       this.n = view4;
       View view5 = obj2.findViewById(R.id.decoration_editor_view);
       a.o(view5, "rootView.findViewById\(R.id.decoration_editor_view\)");
       this.o = view5;
       view5 = obj2.findViewById(R.id.remote_template_switch);
       a.o(view5, "rootView.findViewById\(R.id.remote_template_switch\)");
       this.p = view5;
       View view6 = obj2.findViewById(R.id.remote_template_switch_bg);
       this.q = view6;
       TextView textView1 = obj2.findViewById(R.id.remote_template_tv);
       this.r = textView1;
       StoryHollowTextView storyHollowT1 = storyHollowT;
       View view7 = obj2.findViewById(R.id.fake_loading_view);
       a.o(view7, "rootView.findViewById\(R.id\n  .fake_loading_view\)");
       this.s = view7;
       obj = obj2.findViewById(R.id.remote_template_container);
       a.o(obj, "rootView.findViewById\(R.¡­emote_template_container\)");
       this.t = obj;
       view7 = obj2.findViewById(R.id.template_panel_close);
       View view8 = view1;
       a.o(view7, "rootView.findViewById\(R.id.template_panel_close\)");
       this.u = view7;
       view1 = obj2.findViewById(R.id.remote_template_panel);
       View view9 = view7;
       a.o(view1, "rootView.findViewById\(R.id.remote_template_panel\)");
       this.v = view1;
       view7 = obj2.findViewById(R.id.mood_action_container);
       View view10 = view2;
       a.o(view7, "rootView.findViewById\(R.id.mood_action_container\)");
       this.w = view7;
       view2 = obj2.findViewById(R.id.template_recyclerview);
       a.o(view2, "rootView.findViewById\(R.¡­  .template_recyclerview\)");
       this.x = view2;
       obj1 = obj2.findViewById(R.id.import_local_template_container);
       View view11 = view2;
       a.o(obj1, "rootView.findViewById\(R.¡­local_template_container\)");
       this.y = obj1;
       view2 = obj2.findViewById(R.id.pure_text_view);
       View view12 = view;
       a.o(view2, "rootView.findViewById\(R.id\n  .pure_text_view\)");
       this.z = view2;
       this.A = obj2.findViewById(0x7f0a01c1);
       this.B = obj2.findViewById(0x7f0a06a8);
       this.C = obj2.findViewById(0x7f0a01c0);
       obj2 = new f();
       this.D = obj2;
       this.H = PostExperimentUtils.r();
       f uof = obj2;
       View view13 = view2;
       View view14 = view1;
       int b = e.b;
       View view15 = view7;
       int i = 0;
       b uob = new b(i, e.d, e.c, b);
       this.K = uob;
       this.M = new MoodTemplateViewBinder$o(this);
       this.O = new MoodTemplateViewBinder$p(this);
       if (this.H == null) {
          view5.y(a.d.d().l(), i, i);
       }
       int i1 = 8;
       String str = 1;
       if (e.e()) {
          if (s6.y() != str) {
             if (kwaiImageVie != null) {
                hierarchy = kwaiImageVie.getHierarchy();
                if (hierarchy != null) {
                   hierarchy.L(this.F());
                }
             }
             if (view3 != null) {
                view3.setVisibility(i1);
             }
          }else {
             RoundingParams roundingPara = new RoundingParams();
             roundingPara.q(str);
             if (kwaiImageVie != null) {
                a hierarchy1 = kwaiImageVie.getHierarchy();
                if (hierarchy1 != null) {
                   hierarchy1.L(roundingPara);
                }
             }
          }
          if (imageView != null) {
             imageView.setImageResource(R.drawable.arg_RES_7f081ca0);
          }
          e.b(imageView, view3, textView);
          e.j(kwaiImageVie);
          e.g(obj1);
          if (s6.y() != str) {
             hierarchy = view5.getHierarchy();
             if (hierarchy != null) {
                hierarchy.L(this.F());
             }
             obj3 = null;
             layoutParams = (view6 != null)? view6.getLayoutParams(): obj3;
             int i2 = -2;
             if (layoutParams != null) {
                layoutParams.height = i2;
             }
             if (layoutParams) {
                layoutParams.width = i2;
             }
             if (view6 != null) {
                view6.setLayoutParams(layoutParams);
             }
             if (!PatchProxy.applyVoidTwoRefs(view5, textView1, obj3, e.class, "7") && (!e.e() || (view5 != null && textView1 != null))) {
                e.j(view5);
                e.h(textView1);
             }
          }else if(view6 != null){
             view6.setBackgroundResource(R.drawable.arg_RES_7f081caf);
          }
          e.b(view5, view6, textView1);
       label_026c :
          e.g(obj);
       }else if(s6.m()){
          int i3 = 0x7f070313;
          if (kwaiImageVie != null) {
             layoutParams = kwaiImageVie.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = a1.d(i3);
                layoutParams.height = a1.d(i3);
                kwaiImageVie.setLayoutParams(layoutParams);
             }
          }
          if (imageView != null) {
             ViewGroup$LayoutParams layoutParams2 = imageView.getLayoutParams();
             if (layoutParams2 != null) {
                layoutParams2.width = a1.d(i3);
                layoutParams2.height = a1.d(i3);
                imageView.setLayoutParams(layoutParams2);
             }
          }
          if (imageView != null) {
             imageView.setImageResource(R.drawable.arg_RES_7f081bd5);
          }
          i = 0x7f07031b;
          if (textView != null) {
             textView.setPadding(0, a1.d(i), 0, 0);
          }
          if (view6 != null) {
             layoutParams = view6.getLayoutParams();
             if (layoutParams != null) {
                layoutParams.width = a1.d(i3);
                layoutParams.height = a1.d(i3);
                view6.setLayoutParams(layoutParams);
                view6.setBackgroundResource(R.drawable.arg_RES_7f081c10);
             }
          }
          if (view5 != null) {
             obj3 = view5.getLayoutParams();
             if (obj3 != null) {
                obj3.width = a1.d(0x7f0702e2);
                obj3.height = a1.d(0x7f0702e2);
                view5.setLayoutParams(obj3);
             }
          }
          if (textView1 != null) {
             textView1.setPadding(0, a1.d(i), 0, 0);
          }
          if (s6.m() && view4.getLeftButton() instanceof ImageView) {
             View leftButton = view4.getLeftButton();
             Objects.requireNonNull(leftButton, "null cannot be cast to non-null type android.widget.ImageView");
             leftButton.setImageResource(R.drawable.arg_RES_7f081be8);
          }
       }
       str = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
       if (!p1.z0()) {
          obj3 = view15.getLayoutParams();
          Objects.requireNonNull(obj3, str);
          obj3.bottomMargin = g.e;
          view3 = view15;
          view3.setLayoutParams(obj3);
          view3.setVisibility(0);
          obj3 = view14.getLayoutParams();
          Objects.requireNonNull(obj3, str);
          obj3.bottomMargin = g.e;
          view3 = view14;
          view3.setLayoutParams(obj3);
          if (view12 != null) {
             obj3 = view12.getLayoutParams();
             Objects.requireNonNull(obj3, str);
             obj3.bottomMargin = g.e + a1.e(80.00f);
             view12.setLayoutParams(obj3);
          }
          if (this.H != null) {
             moodTemplate = p1;
             if (moodTemplate.l != null) {
                view16 = view13;
                view16.setVisibility(i1);
             }
          }else {
             moodTemplate = p1;
          }
          view16 = view13;
       }else {
          moodTemplate = p1;
          view16 = view13;
          view3 = view14;
       }
       ViewGroup$LayoutParams layoutParams1 = view3.getLayoutParams();
       Objects.requireNonNull(layoutParams1, str);
       layoutParams = view10.getLayoutParams();
       Objects.requireNonNull(layoutParams, str);
       layoutParams.bottomMargin = g.e + layoutParams1.height;
       view7 = view10;
       view7.setLayoutParams(layoutParams);
       if (!view11.getItemDecorationCount()) {
          view2 = view11;
          view2.addItemDecoration(uob);
       }else {
          view2 = view11;
       }
       view2.setLayoutManager(new CenterLayoutManager(p0.getContext(), 0, 0, b));
       f uof1 = uof;
       view2.setAdapter(uof1);
       uof1.g = new MoodTemplateViewBinder$l(this);
       view8.a(1, e.e);
       if (kwaiImageVie != null) {
          lifecycleOwn = p0;
          p1.t0().observe(lifecycleOwn, new MoodTemplateViewBinder$a(this));
       }else {
          lifecycleOwn = p0;
       }
       if (storyHollowT1 != null) {
          storyHollowT1.setEnabled(false);
       }
       view16.postDelayed(new MoodTemplateViewBinder$m(this), 4000);
       p1.u0().observe(lifecycleOwn, new MoodTemplateViewBinder$n(this));
       moodTemplate.b.observe(lifecycleOwn, new MoodTemplateViewBinder$b(this));
       p1.v0().observe(lifecycleOwn, new MoodTemplateViewBinder$c(this));
       moodTemplate.d.observe(lifecycleOwn, MoodTemplateViewBinder$d.b);
       p1.w0().observe(lifecycleOwn, new MoodTemplateViewBinder$e(this));
       p1.x0().observe(lifecycleOwn, new MoodTemplateViewBinder$f(this));
       moodTemplate.c.observe(lifecycleOwn, new MoodTemplateViewBinder$g(this));
       obj.setOnClickListener(new MoodTemplateViewBinder$h(this));
       view9.setOnClickListener(new MoodTemplateViewBinder$i(this));
       view7.setOnClickListener(new MoodTemplateViewBinder$j(this));
       obj1.setOnClickListener(new MoodTemplateViewBinder$k(this));
       this.P = new MoodTemplateViewBinder$mRefreshAlbumObserver$1(this);
       this.Q = new MoodTemplateViewBinder$mRefreshDataObserver$1(this);
       return;
    }
    public void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MoodTemplateViewBinder.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "onBind";
       a.D().w("MoodTemplateViewBinder", str, objArray1);
       MoodTemplateViewBinder tS = this.S;
       Objects.requireNonNull(tS);
       if (!PatchProxy.applyVoid(objArray, tS, MoodTemplateViewModel.class, "1")) {
          Object[] objArray2 = new Object[i];
          a.D().w("MoodTemplateViewModel", str, objArray2);
          MoodTemplateViewModel n = tS.n;
          if (n.m != null) {
             boolean b = (n.l != null)? true: false;
             Object[] objArray3 = new Object[i];
             a.D().w("MoodTemplateViewModel", "isMoodEdit hasAIVideoData:"+b, objArray3);
             e k = tS.n.k;
             if (k != null) {
                int i1 = 2;
                if (k.w() == i1) {
                   Object[] objArray4 = new Object[i];
                   a.D().w("MoodTemplateViewModel", "LOCAL_PICTURE_TEMPLATE_TYPE", objArray4);
                   if (!b) {
                      MoodTemplateViewModel.p0(tS, k.q(), objArray, i1, objArray);
                   }
                }else {
                   objArray3 = new Object[i];
                   a.D().w("MoodTemplateViewModel", "type: "+k.w(), objArray3);
                   tS.g.setValue(new Pair(Boolean.valueOf(b), new MoodTemplateUiData(k)));
                }
                Object[] objArray5 = new Object[i];
                a.D().w("MoodTemplateViewModel", "fetchAllData data:"+k, objArray5);
             }
          }
          tS.m.l(CachePolicy.CACHE_ELSE_NETWORK, new b(tS), true);
          tS.s0();
       }
       this.R.getLifecycle().addObserver(this.P);
       this.R.getLifecycle().addObserver(this.Q);
       FragmentActivity activity = this.R.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.e(this.M);
       activity = this.R.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.F2(this.O);
       return;
    }
    public void C(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MoodTemplateViewBinder.class, "20")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("MoodTemplateViewBinder", "onUnbind", objArray1);
       this.R.getLifecycle().removeObserver(this.P);
       this.R.getLifecycle().removeObserver(this.Q);
       MoodTemplateViewBinder tS = this.S;
       Objects.requireNonNull(tS);
       if (!PatchProxy.applyVoid(objArray, tS, MoodTemplateViewModel.class, "19")) {
          Object[] objArray2 = new Object[i];
          a.D().w("MoodTemplateViewModel", "onUnbind", objArray2);
          tS.i.dispose();
          MoodTemplateViewModel m = tS.m;
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoid(objArray, m, MoodTemplateRepo.class, "14")) {
             objArray2 = new Object[i];
             a.D().w(m.f(), "onUnbind", objArray2);
             m.o.i(i);
             m.o.c();
             MoodTemplateRepo r = m.r;
             if (r != null) {
                r.dispose();
             }
             MoodTemplateRepo s = m.s;
             if (s != null) {
                s.dispose();
             }
          }
       }
       FragmentActivity activity = this.R.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.s(this.M);
       activity = this.R.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.l3(this.O);
       return;
    }
    public final void D(){
       MoodTemplateViewBinder moodTemplate = MoodTemplateViewBinder.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, moodTemplate, "17")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.D().w("MoodTemplateViewBinder", "closeTemplatePanel", objArray1);
       this.w.setVisibility(0);
       this.n.setVisibility(0);
       this.h.setVisibility(8);
       if (!PatchProxy.applyVoid(objArray, this, moodTemplate, "18")) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          float[] uofloatArray = new float[]{0,(float)e.f};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.v, "translationY", uofloatArray);
          a.o(objectAnimat, "panelTranslationY");
          objectAnimat.setInterpolator(new e());
          objectAnimat.setDuration(300);
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.v, "alpha", new float[2]{0x3f800000,0});
          a.o(objectAnimat1, "panelAlpha");
          objectAnimat1.setInterpolator(new n());
          objectAnimat1.setDuration(240);
          uAnimatorSet.addListener(new b(this));
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.start();
          this.w.setAlpha(0);
          uAnimatorSet = new AnimatorSet();
          objectAnimat = ObjectAnimator.ofFloat(this.w, "alpha", new float[2]{0,0x3f800000});
          a.o(objectAnimat, "actionAlpha");
          objectAnimat.setInterpolator(new e());
          objectAnimat.setDuration(300);
          Animator[] uAnimatorArr1 = new Animator[true];
          uAnimatorArr1[0] = objectAnimat;
          uAnimatorSet.playTogether(uAnimatorArr1);
          uAnimatorSet.start();
       }
       this.J(true);
       return;
    }
    public final Fragment E(){
       return this.R;
    }
    public final RoundingParams F(){
       RoundingParams roundingPara;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MoodTemplateViewBinder moodTemplate = MoodTemplateViewBinder.class;
       Object obj = PatchProxy.apply(null, this, moodTemplate, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = s6.y();
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                roundingPara = new RoundingParams();
             }else {
                roundingPara = e.a(2.70f, 0x3fc00000);
                a.o(roundingPara, "ColorPickUIUtil.getRound¡­_RING_BORDER_WIDTH_SMALL\)");
             }
          }else {
             roundingPara = e.a(3.00f, 0x3fe66666);
             a.o(roundingPara, "ColorPickUIUtil.getRound¡­ ALBUM_RING_BORDER_WIDTH\)");
          }
       }else {
          Object obj1 = PatchProxy.apply(null, this, moodTemplate, "1");
          if (obj1 != patchProxyRe) {
             roundingPara = obj1;
          }else {
             roundingPara = new RoundingParams();
             roundingPara.q(true);
          }
       }
       return roundingPara;
    }
    public final void G(Pair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder.class, "4")) {
          return;
       }
       this.G = true;
       if (p0.getFirst().booleanValue()) {
          if (p0.getSecond().m().isEmpty()) {
             this.p.y(p0.getSecond().l(), this.p.getWidth(), this.p.getHeight());
          }else {
             this.p.P(p0.getSecond().m());
          }
       }else {
          this.I(p0.getSecond());
       }
       return;
    }
    public final void H(int p0,boolean p1){
       RecyclerView$LayoutManager layoutManage1;
       MoodTemplateViewBinder moodTemplate = MoodTemplateViewBinder.class;
       if (PatchProxy.isSupport(moodTemplate) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, moodTemplate, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "selectItemToCenter selectedIndex:"+p0, objArray);
       if (!(a.g(this.S.x0().getValue(), Boolean.TRUE) ^ 1) && p0 >= 0) {
          if (!this.x.getWidth() || !this.x.getChildCount()) {
             this.x.getViewTreeObserver().addOnGlobalLayoutListener(new MoodTemplateViewBinder$q(this, p0, p1));
          }
          RecyclerView$LayoutManager layoutManage = this.x.getLayoutManager();
          String str = "null cannot be cast to non-null type com.yxcorp.gifshow.v3.widget.CenterLayoutManager";
          Objects.requireNonNull(layoutManage, str);
          layoutManage.H(1);
          if (p1) {
             layoutManage1 = this.x.getLayoutManager();
             Objects.requireNonNull(layoutManage1, str);
             layoutManage1.W0(100.00f);
             this.x.smoothScrollToPosition(p0);
          }else {
             layoutManage1 = this.x.getLayoutManager();
             Objects.requireNonNull(layoutManage1, str);
             layoutManage1.W0(10.00f);
             this.x.smoothScrollToPosition(p0);
          }
          MoodTemplateViewBinder tS = this.S;
          Objects.requireNonNull(tS);
          MoodTemplateViewModel moodTemplate1 = MoodTemplateViewModel.class;
          if (!PatchProxy.isSupport(moodTemplate1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(1), tS, moodTemplate1, "14")) {
             ListHolder value = tS.c.getValue();
             if (value != null) {
                List list = value.c();
                if (list != null && (!PatchProxy.isSupport(moodTemplate1) || !PatchProxy.applyVoidTwoRefs(list, Integer.valueOf(1), tS, moodTemplate1, "17"))) {
                   objArray = new Object[0];
                   a.D().w("MoodTemplateViewModel", "preLoadRemotePictureTemplate", objArray);
                   Iterator iterator = list.iterator();
                   int i = 0;
                   while (iterator.hasNext()) {
                      MoodTemplateData moodTemplate2 = iterator.next();
                      if (moodTemplate2.w() == 1 && !new File(moodTemplate2.q()).exists()) {
                         tS.m.p(moodTemplate2, 0, null);
                         i = i + 1;
                         Object[] objArray1 = new Object[0];
                         a.D().w("MoodTemplateViewModel", "preLoadRemotePictureTemplate it:"+moodTemplate2+", preLoadedSize:"+i, objArray1);
                      }
                      if (i < 1) {
                      }
                   }
                }
             }
          }
       }
    label_0148 :
       return;
    }
    public final void I(MoodTemplateUiData p0){
       MoodTemplateViewBinder tS;
       Object[] objArray2;
       MoodTemplateViewModel moodTemplate = MoodTemplateViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "selectRemoteTemplate", objArray);
       String str = "MoodTemplateViewModel";
       String str1 = "moodTemplateUiData";
       if (!p0.w()) {
          tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoidOneRefs(p0, tS, moodTemplate, "9")) {
             a.p(p0, str1);
             objArray2 = new Object[0];
             a.D().w(str, "choosePureRemoteTemplate moodTemplateUiData:"+p0, objArray2);
             tS.j = p0;
             tS.n.k = p0;
             tS.a.setValue(new Pair(p0, Boolean.TRUE));
          }
       }else {
          tS = this.S;
          Objects.requireNonNull(tS);
          if (!PatchProxy.applyVoidOneRefs(p0, tS, moodTemplate, "8")) {
             a.p(p0, str1);
             objArray2 = new Object[0];
             a.D().w(str, "chooseNotPureRemoteTemplate moodTemplateUiData:"+p0, objArray2);
             tS.j = p0;
             int i = 2;
             Bitmap uBitmap = null;
             PostTaskManager$PostTaskState postTaskStat = tS.m.p(p0, i, uBitmap);
             int i1 = a.a[postTaskStat.ordinal()];
             if (i1 != 1) {
                if (i1 != i) {
                   if (i1 != 3) {
                      i1.c(new RuntimeException("runRemoteTemplateTask no such state taskState:"+postTaskStat));
                   }else {
                      tS.d.setValue(a1.p(R.string.arg_RES_7f1038e3));
                   }
                }
             }else {
                MoodTemplateViewModel.C0(tS, p0, 0, i, uBitmap);
             }
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("MoodTemplateViewBinder", "mFirstLoadRemoteTemplate moodTemplateUiData:"+p0, objArray1);
       return;
    }
    public final void J(boolean p0){
       MoodTemplateViewBinder moodTemplate = MoodTemplateViewBinder.class;
       if (PatchProxy.isSupport(moodTemplate) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, moodTemplate, "6")) {
          return;
       }
       if (this.R.getActivity() instanceof CameraActivity) {
          FragmentActivity activity = this.R.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.camera.record.CameraActivity");
          int i = (p0)? 0: 4;
          activity.V0(i, false);
       }
       return;
    }
    public final void K(MoodTemplateData p0){
       EditorSdk2V2$AudioAsset uAudioAsset;
       MoodTemplateViewBinder moodTemplate = MoodTemplateViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, moodTemplate, "11")) {
          return;
       }
       if (this.S.z0() && b.S(new File(p0.q()))) {
          MoodTemplateViewModel n = this.S.n;
          a uoa = (n.b == 1 && n.l != null)? 1: null;
          if (uoa) {
             Object[] objArray = new Object[0];
             a.D().w("MoodTemplateViewBinder", "updatePlayerViewAndResetAIVideoEditorState", objArray);
             if (!PatchProxy.applyVoid(null, this, moodTemplate, "8")) {
                moodTemplate = this.B;
                if (moodTemplate != null) {
                   moodTemplate.setVisibility(8);
                }
                moodTemplate = this.A;
                if (moodTemplate != null) {
                   moodTemplate.setVisibility(0);
                }
                moodTemplate = this.C;
                if (moodTemplate != null) {
                   moodTemplate.setText(a1.p(R.string.arg_RES_7f104aca));
                }
             }
             moodTemplate = this.f;
             if (moodTemplate != null) {
                EditorSdk2V2$VideoEditorProject videoProject = moodTemplate.getVideoProject();
                if (videoProject != null) {
                   EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
                   trackAsset.setAssetId(EditorSdk2Utils.getRandomID());
                   trackAsset.setAssetPath(p0.q());
                   trackAsset.setAssetSpeed(0x3ff0000000000000);
                   double d = (double)140;
                   trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, d));
                   EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[]{trackAsset};
                   videoProject.setTrackAssets(trackAssetAr);
                   if (videoProject.audioAssets() != null) {
                      ImmutableArray immutableArr = videoProject.audioAssets();
                      a.o(immutableArr, "it.audioAssets\(\)");
                      if (immutableArr.isNotEmpty()) {
                         uAudioAsset = videoProject.audioAssets(0);
                         EditorSdk2V2$TimeRangeV2 timeRangeV2 = videoProject.audioAssets(0).clippedRange();
                         double d1 = (timeRangeV2 != null)? timeRangeV2.start(): 0;
                         uAudioAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(d1, d));
                      }
                   }
                   this.f.setLoop(1);
                   this.f.sendChangeToPlayer(0, 0);
                }
             }
          }
       }
    label_00d9 :
       uAudioAsset.b = 0;
       return;
    }
    public final void L(MoodTemplateUiData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "updatePreviewColor moodTemplateUiData:moodTemplateUiData", objArray);
       if (p0.w() == 1) {
          MoodTemplateViewBinder tm = this.m;
          if (tm != null) {
             tm.setTextColor(Color.parseColor(p0.d()));
          }
       }else {
          MoodTemplateViewBinder tm1 = this.m;
          if (tm1 != null) {
             tm1.setTextColor(Color.parseColor("#80FFFFFF"));
          }
       }
       return;
    }
    public final void M(MoodTemplateUiData p0){
       String tag;
       a hierarchy;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MoodTemplateViewBinder", "updateShowingView moodTemplateUiData:moodTemplateUiData", objArray);
       if (!p0.w()) {
          this.e.setVisibility(8);
       }else {
          Object obj = null;
          if (this.e.getTag() != null) {
             tag = this.e.getTag();
             Objects.requireNonNull(tag, "null cannot be cast to non-null type com.facebook.datasource.RetainingDataSourceSupplier<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>>");
          }else {
             tag = obj;
          }
          if (tag == null) {
             tag = new h();
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(this.e.getController());
             uod.t(tag);
             a.o(uod, "Fresco.newDraweeControll¡­aSourceSupplier\(supplier\)");
             this.e.setController(uod.e());
             this.e.setTag(tag);
          }
          tag.b(Fresco.getImagePipeline().getDataSourceSupplier(ImageRequestBuilder.k(w0.c(new File(p0.q()))).a(), obj, ImageRequest$RequestLevel.FULL_FETCH));
          int i = p0.c();
          tag = "mShowingView.hierarchy";
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   hierarchy = this.e.getHierarchy();
                   a.o(hierarchy, tag);
                   hierarchy.u(t$b.e);
                }else {
                   hierarchy = this.e.getHierarchy();
                   a.o(hierarchy, tag);
                   hierarchy.u(n$a.l);
                }
             }else {
                hierarchy = this.e.getHierarchy();
                a.o(hierarchy, tag);
                hierarchy.u(t$b.i);
             }
          }else {
             hierarchy = this.e.getHierarchy();
             a.o(hierarchy, tag);
             hierarchy.u(n$b.l);
          }
          this.e.setVisibility(0);
       }
       return;
    }
    public final void N(MoodTemplateUiData p0){
       MoodTemplateViewBinder to;
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder.class, "5")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MoodTemplateViewBinder", "addTemplateDateSticker moodTemplateUiData:"+p0, objArray);
       if (p0.w() != 1 || p0.f() == -1) {
          MoodTemplateViewBinder tL = this.L;
          if (tL != null) {
             to = this.o;
             Objects.requireNonNull(to);
             Object obj = PatchProxy.applyOneRefs(tL, to, StoryDecorationContainerView.class, "7");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }else {
                to.m(tL, null);
             }
             this.L = null;
          }
          return;
       }else {
          to = this.L;
          if (to != null) {
             if (to != null) {
                to.setMoodTemplateUiData(n.d(this.R.getActivity(), p0));
             }
             this.o.e0(this.L);
          }else {
             StoryTemplateDataStickerDrawer storyTemplat = StoryTemplateDataStickerDrawer.generateTemplateDateStickerDrawer(n.d(this.R.getActivity(), p0));
             this.o.R();
             this.o.Z(storyTemplat);
             this.L = storyTemplat;
          }
          Object[] objArray1 = new Object[i];
          a.D().w("MoodTemplateViewBinder", "addTemplateDateSticker ", objArray1);
          return;
       }
    }
}
