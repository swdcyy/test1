package com.kuaishou.live.fragment.LivePluginGrootPlayFragment;
import pw6.d;
import com.kuaishou.live.fragment.LivePluginLoadingFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import pw6.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import dw6.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.System;
import qs5.a;
import qs5.d;
import com.kuaishou.live.fragment.LivePluginGrootPlayFragment$a;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle$State;

public class LivePluginGrootPlayFragment extends LivePluginLoadingFragment implements d	// class@001bc8
{
    public final String p;
    public boolean q;
    public long r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public void LivePluginGrootPlayFragment(String p0){
       super();
       this.q = false;
       this.r = 0;
       this.s = false;
       this.p = p0;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "8")) {
          return;
       }
       PluginDownloadExtension.k.s("live_audience_plugin", 40);
       this.t = true;
       this.ih();
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "performViewItemWillAppear", "page2", this.p);
       if (LivePluginManager.c() && this.q == null) {
          this.hh();
       }
       return;
    }
    public int M(){
       return 5;
    }
    public void Mg(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginGrootPlayFragment.class, "10")) {
          return;
       }
       c.a(this, p0);
       return;
    }
    public void Q(){
    }
    public void U(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "9")) {
          return;
       }
       this.t = false;
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "performViewItemWillDisappear", "page2", this.p);
       this.ih();
       return;
    }
    public boolean Xg(){
       return false;
    }
    public void a0(){
    }
    public int ch(){
       Object obj = PatchProxy.apply(null, this, LivePluginGrootPlayFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 40;
       if (("LIVE_PREVIEW_PLUGIN").equals(this.p)) {
          i = 30;
       }
       LiveLogTag lIVE_PLUGIN = LiveLogTag.LIVE_PLUGIN;
       lIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment");
       LiveLogTag liveLogTag = lIVE_PLUGIN;
       b.T(liveLogTag, "getDownloadPriority", "mIsSelected", Boolean.valueOf(this.t), "priority", Integer.valueOf(i));
       return i;
    }
    public void f0(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "11")) {
          return;
       }
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "onSlidePlayComponentDestroy", "page2", this.p);
       return;
    }
    public Fragment g0(){
       return this;
    }
    public void hh(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "6")) {
          return;
       }
       String str = "page2";
       String str1 = "LivePluginGrootPlayFragment";
       if (this.getArguments() == null) {
          b.S(LiveLogTag.LIVE_PLUGIN.appendTag(str1), "onLoadSuccess, getArguments is null", str, this.p);
          return;
       }else {
          this.q = true;
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.getParentFragment());
          QPhoto qPhoto = b.j(this.getArguments()).b(QPhoto.class);
          int i = slidePlayVie.M(qPhoto);
          if (i < 0) {
             b.S(LiveLogTag.LIVE_PLUGIN.appendTag(str1), "onLoadSuccess, can not find QPhoto", str, this.p);
             return;
          }else {
             int i1 = slidePlayVie.q(i);
             LiveLogTag lIVE_PLUGIN = LiveLogTag.LIVE_PLUGIN;
             lIVE_PLUGIN.appendTag(str1);
             b.T(lIVE_PLUGIN, "onLoadSuccess", "index", Integer.valueOf(i1), "page2", this.p);
             slidePlayVie.G1(qPhoto, i1, false, "onLoadSuccess, replace LivePluginGrootPlayFragment");
             return;
          }
       }
    }
    public final void ih(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "4")) {
          return;
       }
       LivePluginGrootPlayFragment tv = this.v;
       boolean b = (this.u != null && this.t != null)? true: false;
       this.v = b;
       if (b != tv && (!PatchProxy.isSupport(LivePluginGrootPlayFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, LivePluginGrootPlayFragment.class, "5"))) {
          b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "onPageActiveStatusChanged", "isActive", Boolean.valueOf(b));
          if (b) {
             this.r = System.currentTimeMillis();
          }else {
             LivePluginGrootPlayFragment tr = this.r;
             long l = System.currentTimeMillis() - tr;
             if (tr > 0 && (l > 0 && this.q == null)) {
                a.c(a.a(this.p), l, this.s, false);
             }
          label_0071 :
             this.r = 0;
          }
       }
       return;
    }
    public String o(){
       return this.p;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePluginGrootPlayFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.s = d.c("live_audience_plugin");
       this.fh(new LivePluginGrootPlayFragment$a(this));
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "3")) {
          return;
       }
       super.onPause();
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "onPause", "page2", this.p);
       this.u = false;
       this.ih();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LivePluginGrootPlayFragment.class, "2")) {
          return;
       }
       super.onResume();
       b.S(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginGrootPlayFragment"), "onResume", "page2", this.p);
       this.u = true;
       this.ih();
       return;
    }
    public boolean yb(){
       Object obj = PatchProxy.apply(null, this, LivePluginGrootPlayFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getLifecycle().getCurrentState().isAtLeast(Lifecycle$State.CREATED);
    }
}
