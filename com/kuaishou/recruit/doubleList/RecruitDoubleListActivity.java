package com.kuaishou.recruit.doubleList.RecruitDoubleListActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.kuaishou.recruit.doubleList.RecruitDoubleListFragment$RecruitDoubleListParams;
import android.content.Intent;
import com.kuaishou.recruit.doubleList.a;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import android.net.Uri;
import ekd.x0;
import lg2.e;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lg2.a;
import wkd.b;
import lg2.m;
import com.kuaishou.recruit.doubleList.RecruitDoubleListContainerFragment;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class RecruitDoubleListActivity extends SingleFragmentActivity	// class@000e9b
{

    public void RecruitDoubleListActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, RecruitDoubleListActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecruitDoubleListActivity recruitDoubl = RecruitDoubleListActivity.class;
       Object[] objArray = null;
       RecruitDoubleListFragment$RecruitDoubleListParams obj = PatchProxy.apply(objArray, this, recruitDoubl, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, recruitDoubl, "2");
       if (obj != patchProxyRe) {
       }else {
          Uri uri = k0.a(this.getIntent(), a.a).orNull();
          if (uri == null || !uri.isHierarchical()) {
             objArray1 = objArray;
          }else {
             obj = new RecruitDoubleListFragment$RecruitDoubleListParams(false).setTitle(x0.b(uri, "title", "")).setServerExtraInfo(x0.a(uri, "server_extra_info"));
             String str = PatchProxy.apply(objArray, this, recruitDoubl, "3");
             if (str != patchProxyRe) {
             }else {
                Uri uri1 = k0.a(this.getIntent(), a.a).orNull();
                str = (uri1 == null || !uri1.isHierarchical())? objArray: x0.a(uri1, "page_source");
             }
             objArray1 = obj.setPageSource(str).setLogCategory(5).setLogPage2("POST_LIVE_GROUP_PAGE");
          }
       }
       if (obj == null) {
          return objArray;
       }else if(PatchProxy.applyVoid(objArray, this, recruitDoubl, "4") || (e.b() && (this.getIntent() == null || this.getIntent().getData() == null))){
          b.Z(LiveLogTag.LIVE_RECRUIT_TASK, "LiveNearByAggregationActivity, addRecruitTaskIfNecessary");
          a uoa = e.c(this.getIntent().getData());
          if (uoa != null) {
             b.a(-1498019239).b(uoa);
          }
       }
    label_00d3 :
       RecruitDoubleListContainerFragment recruitDoubl1 = PatchProxy.applyOneRefs(obj, objArray, RecruitDoubleListContainerFragment.class, "1");
       if (recruitDoubl1 != patchProxyRe) {
       }else {
          recruitDoubl1 = new RecruitDoubleListContainerFragment();
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "KEY_RECRUIT_DOUBLE_LIST_PARAMS", obj);
          recruitDoubl1.setArguments(uBundle);
       }
       return recruitDoubl1;
    }
}
