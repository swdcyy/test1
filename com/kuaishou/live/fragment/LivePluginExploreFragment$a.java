package com.kuaishou.live.fragment.LivePluginExploreFragment$a;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import com.kuaishou.live.fragment.LivePluginExploreFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import g33.a;
import os5.l;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.fragment.LivePluginLoadingFragment;

public class LivePluginExploreFragment$a implements LivePluginLoadingFragment$a	// class@001bc5
{
    public final LivePluginExploreFragment a;

    public void LivePluginExploreFragment$a(LivePluginExploreFragment p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePluginExploreFragment$a.class, "1")) {
          return;
       }
       LiveLogTag lIVE_PLUGIN = LiveLogTag.LIVE_PLUGIN;
       String str = "LivePluginExploreFragment";
       lIVE_PLUGIN.appendTag(str);
       b.P(lIVE_PLUGIN, "onLoadSuccess");
       BaseFragment uBaseFragmen = d.a(-1577615329).l9().Mg();
       if (this.a.getArguments() != null) {
          b.P(lIVE_PLUGIN.appendTag(str), "onLoadSuccess, setArguments");
          uBaseFragmen.setArguments(this.a.getArguments());
       }
       this.a.gh(uBaseFragmen);
       return;
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, LivePluginExploreFragment$a.class, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_PLUGIN.appendTag("LivePluginExploreFragment"), "onLoadFail");
       return;
    }
}
