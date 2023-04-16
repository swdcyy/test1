package com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b90.d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.mediascene.MediaSceneLaunchParams;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import kotlin.jvm.internal.a;
import i2b.a;
import crd.b;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.mediascene.MediaSceneConfig;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import z80.c;
import b90.b;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import b90.e;
import androidx.lifecycle.ViewModel;
import z80.b;
import java.util.Objects;
import k2b.e0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class MediaSceneLoadingFragment extends BaseFragment	// class@001a84
{
    public View j;
    public b k;
    public d l;
    public String m;
    public MediaSceneConfig n;
    public MediaSceneLaunchParams o;
    public static final MediaSceneLoadingFragment$a p;

    static {
       MediaSceneLoadingFragment.p = new MediaSceneLoadingFragment$a(null);
    }
    public void MediaSceneLoadingFragment(){
       super(null, null, null, null, 15, null);
    }
    public final void d0(){
       if (PatchProxy.applyVoid(null, this, MediaSceneLoadingFragment.class, "3")) {
          return;
       }
       MediaSceneLoadingFragment tl = this.l;
       if (tl != null) {
          tl.C();
       }
       return;
    }
    public String getPageParams(){
       MediaSceneLoadingFragment obj = PatchProxy.apply(null, this, MediaSceneLoadingFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       boolean b = false;
       MediaSceneLaunchParams mSceneType = (obj != null)? obj.mSceneType: null;
       String str = (mSceneType > null)? "videoSceneType="+mSceneType: "";
       MediaSceneLoadingFragment tm = this.m;
       if (tm == null || !tm.length()) {
          b = true;
       }
       if (b) {
          return str;
       }else if(TextUtils.x(str)){
          str = "task_id="+this.m;
       }else {
          str = str+"&"+"task_id="+this.m;
       }
       return str;
    }
    public String o(){
       return "USUAL_PLACE_LOADING";
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MediaSceneLoadingFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d0eec, p1, false);
       a.o(view, "KwaiLayoutInflater\n     ¡­agment, container, false\)");
       this.j = view;
       if (view == null) {
          a.S("mRootView");
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MediaSceneLoadingFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       MediaSceneLoadingFragment tk = this.k;
       if (tk != null && !tk.isDisposed()) {
          tk.dispose();
       }
       tk = this.l;
       if (tk != null) {
          tk.C();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       b a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MediaSceneLoadingFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Bundle arguments = this.getArguments();
       String str = null;
       Serializable serializable = (arguments != null)? SerializableHook.getSerializable(arguments, "KEY_MEDIA_SCENE_CONFIG"): str;
       if (!serializable instanceof MediaSceneConfig) {
          serializable = str;
       }
       Bundle arguments1 = this.getArguments();
       Serializable serializable1 = (arguments1 != null)? SerializableHook.getSerializable(arguments1, "KEY_MEDIA_SCENE_LAUNCH_PARAMS"): str;
       if (!serializable1 instanceof MediaSceneLaunchParams) {
          serializable1 = str;
       }
       if (serializable == null && serializable1 == null) {
          PostUtils.D("MediaSceneLoadingFragment", "Both config and launchParams are null", new IllegalArgumentException("Both config and launchParams are null"));
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             activity.finish();
          }
          return;
       }else {
          Bundle arguments2 = this.getArguments();
          String str1 = "photo_task_id";
          String str2 = (arguments2 != null)? arguments2.getString(str1): str;
          this.m = str2;
          this.n = serializable;
          this.o = serializable1;
          if (!PatchProxy.applyVoid(str, this, MediaSceneLoadingFragment.class, "7")) {
             c j = c.j;
             MediaSceneLoadingFragment tn = this.n;
             arguments2 = this.getArguments();
             str2 = (arguments2 != null)? arguments2.getString(str1): str;
             j.x(tn, str2, this.o);
             ViewModel viewModel = ViewModelProviders.of(this, new b(this)).get(e.class);
             a.o(viewModel, "ViewModelProviders.of\(th¡­ingViewModel::class.java\)");
             MediaSceneLoadingFragment tj = this.j;
             if (tj == null) {
                a.S("mRootView");
             }
             d uod = new d(this, viewModel, tj);
             this.l = uod;
             uod.B();
          }
          a = b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(this, a, b.class, "1")) {
             a.p(this, "logPage");
             u1.C0(str, this, 1, str, str);
          }
          return;
       }
    }
}
