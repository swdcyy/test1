package com.yxcorp.gifshow.ad.challenge.ranklist.RankListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import jp5.c;
import java.util.Map;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.TagChallengeBannerInfo;
import java.util.HashMap;
import y8c.g;
import py8.m;
import qvb.i;
import py8.k;

public final class RankListFragment extends RecyclerFragment	// class@001536
{
    public TagChallengeBannerInfo F;
    public HashMap G;

    public void RankListFragment(){
       super();
    }
    public t Bh(){
       t obj = PatchProxy.apply(null, this, RankListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getView() == null) {
          obj = super.Bh();
          a.o(obj, "super.onCreateTipsHelper\(\)");
       }else {
          View view = this.getView();
          a.m(view);
          obj = d.a(0x6a218f5d).ah(this, false, view);
          a.o(obj, "PluginManager.get\(TagPlu¡­alse,\n            view!!\)");
       }
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RankListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(RankListFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RankListFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          p0 = this.getArguments();
          TagChallengeBannerInfo tagChallenge = null;
          Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "tag_challenge_banner_response"): tagChallenge;
          if (serializable instanceof TagChallengeBannerInfo) {
             tagChallenge = serializable;
          }
          this.F = tagChallenge;
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, RankListFragment.class, "6")) {
       }else {
          RankListFragment tG = this.G;
          if (tG != null) {
             tG.clear();
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, RankListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this.F);
    }
    public i yh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RankListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RankListFragment tF = this.F;
       if (tF != null) {
          objArray = tF.mActivityId;
       }
       return new k(objArray);
    }
}
