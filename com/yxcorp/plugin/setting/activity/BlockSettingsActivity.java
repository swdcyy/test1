package com.yxcorp.plugin.setting.activity.BlockSettingsActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import yfd.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.plugin.setting.fragment.BlockSettingListFragment;
import java.util.ArrayList;
import jgd.v;
import xgc.c;
import xgc.c$a;
import jgd.i;
import jgd.c;
import android.view.View$OnClickListener;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.Fragment;

public class BlockSettingsActivity extends GifshowActivity	// class@0007fe
{

    public void BlockSettingsActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, BlockSettingsActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, BlockSettingsActivity.class, str)) {
          return;
       }
       super.onCreate(p0);
       w9.a(this);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       BlockSettingListFragment uBlockSettin = PatchProxy.applyOneRefs(this, obj, d.class, "5");
       if (uBlockSettin != patchProxyRe) {
       }else {
          uBlockSettin = new BlockSettingListFragment();
          ArrayList uArrayList = new ArrayList();
          c uoc = PatchProxy.applyOneRefs(this, obj, v.class, str);
          if (uoc != patchProxyRe) {
          }else {
             c$a uoa = new c$a().c(0, this.getString(R.string.arg_RES_7f1003c3), null, null, R.drawable.arg_RES_7f081084);
             uoa.b(true);
             uoa.a.d = i.a;
             uoa.d(new c(this));
             uoc = uoa.a();
          }
          uArrayList.add(uoc);
          uBlockSettin.dh(uArrayList);
          uBlockSettin.eh(R.string.arg_RES_7f1003c7);
       }
       uoe.v(0x1020002, uBlockSettin);
       uoe.m();
       return;
    }
}
