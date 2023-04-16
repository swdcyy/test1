package com.yxcorp.gifshow.childprotect.ChildProtectActivity;
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
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.childprotect.fragment.ChildProtectSettingListFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ak9.c;
import java.util.List;
import wh5.c;
import com.yxcorp.gifshow.childprotect.holder.EntryHolderFactory$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import uj9.l;
import ak9.b;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import java.util.ArrayList;
import com.kwai.component.uiconfig.childlock.model.TeenageToolsConfig;
import ak9.a;
import k2b.e0;
import com.yxcorp.gifshow.settings.holder.EntryListFragment;
import androidx.fragment.app.Fragment;

public class ChildProtectActivity extends GifshowActivity	// class@001088
{
    public static final int y;

    public void ChildProtectActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ChildProtectActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildProtectActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       e uoe = this.getSupportFragmentManager().beginTransaction();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = null;
       String str = "1";
       ChildProtectSettingListFragment uChildProtec = PatchProxy.applyOneRefs(this, obj, ChildProtectSettingListFragment.class, str);
       if (uChildProtec != patchProxyRe) {
       }else {
          uChildProtec = new ChildProtectSettingListFragment();
          obj = PatchProxy.applyTwoRefs(this, uChildProtec, obj, c.class, str);
          if (obj != patchProxyRe) {
          }else {
             boolean b = c.b();
             List list = l.d(new EntryHolderFactory$1().getType());
             if (list != null) {
                q.c(list, new b(b));
             }
             ArrayList uArrayList = new ArrayList();
             if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i = i + 1) {
                   a uoa = new a(this, list.get(i), b, i, uChildProtec);
                   uArrayList.add(v12);
                }
             }
             obj = uArrayList;
          }
          uChildProtec.dh(obj);
          uChildProtec.eh(R.string.arg_RES_7f10471d);
       }
       uoe.v(0x1020002, uChildProtec);
       uoe.m();
       return;
    }
}
