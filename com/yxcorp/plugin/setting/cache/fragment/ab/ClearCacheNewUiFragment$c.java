package com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$c;
import erd.g;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment;
import java.lang.Object;
import bgd.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import v56.g;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class ClearCacheNewUiFragment$c implements g	// class@000835
{
    public final ClearCacheNewUiFragment b;

    public void ClearCacheNewUiFragment$c(ClearCacheNewUiFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClearCacheNewUiFragment$c.class, "1")) {
       }else {
          this.b.We();
          p0 = g.a.edit();
          p0.putLong("LastManualClearTs", System.currentTimeMillis());
          g.a(p0);
       }
       return;
    }
}
