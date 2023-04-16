package com.kuaishou.recruit.pluginLoading.RecruitLivePluginLoadingFragment$a;
import com.kuaishou.live.fragment.LivePluginLoadingFragment$a;
import com.kuaishou.recruit.pluginLoading.RecruitLivePluginLoadingFragment;
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
import gs4.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.fragment.LivePluginLoadingFragment;

public class RecruitLivePluginLoadingFragment$a implements LivePluginLoadingFragment$a	// class@000ee6
{
    public final RecruitLivePluginLoadingFragment a;

    public void RecruitLivePluginLoadingFragment$a(RecruitLivePluginLoadingFragment p0){
       this.a = p0;
       super();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RecruitLivePluginLoadingFragment$a.class, "1")) {
          return;
       }
       LiveLogTag lIVE_RECRUIT = LiveLogTag.LIVE_RECRUIT;
       String str = "RecruitLivePluginLoadingFragment";
       lIVE_RECRUIT.appendTag(str);
       b.P(lIVE_RECRUIT, "onLivePluginLoadSuccess");
       BaseFragment uBaseFragmen = d.a(0x330ddec).Bl();
       if (this.a.getArguments() != null) {
          b.P(lIVE_RECRUIT.appendTag(str), "onLivePluginLoadSuccess, setArguments");
          uBaseFragmen.setArguments(this.a.getArguments());
       }
       this.a.gh(uBaseFragmen);
       return;
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, RecruitLivePluginLoadingFragment$a.class, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_RECRUIT.appendTag("RecruitLivePluginLoadingFragment"), "onLivePluginLoadFail");
       return;
    }
}
