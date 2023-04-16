package com.yxcorp.gifshow.notice.box.setting.NoticeBoxSettingActivity;
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
import android.os.Bundle;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import java.util.ArrayList;
import com.yxcorp.gifshow.notice.box.setting.NoticeBoxSettingFragment;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class NoticeBoxSettingActivity extends SingleFragmentActivity	// class@002183
{
    public static final int y;

    public void NoticeBoxSettingActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, NoticeBoxSettingActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NoticeBoxSettingActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       return;
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, NoticeBoxSettingActivity.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = j0.e(this.getIntent(), "NOTICE_BOX_PLATE_SETTINGS");
       if (obj != null) {
          NoticeBoxSettingFragment noticeBoxSet = PatchProxy.applyOneRefs(obj, objArray, NoticeBoxSettingFragment.class, "6");
          if (noticeBoxSet != patchProxyRe) {
          }else {
             noticeBoxSet = new NoticeBoxSettingFragment();
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "NOTICE_BOX_PLATE_SETTINGS", obj);
             noticeBoxSet.setArguments(uBundle);
          }
          return noticeBoxSet;
       }else {
          this.finish();
          return objArray;
       }
    }
}
