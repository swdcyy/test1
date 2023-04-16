package com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment$b;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.setting.cache.fragment.ab.ClearCacheNewUiFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.SystemClock;
import java.lang.Long;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.setting.cache.activity.hide.TopCacheActivity;
import android.content.Intent;
import android.content.Context;
import android.app.Activity;

public final class ClearCacheNewUiFragment$b implements View$OnClickListener	// class@000834
{
    public final ClearCacheNewUiFragment b;

    public void ClearCacheNewUiFragment$b(ClearCacheNewUiFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ClearCacheNewUiFragment$b.class, str)) {
          return;
       }
       ClearCacheNewUiFragment s = this.b.S;
       System.arraycopy(s, 1, s, 0, (s.length - 1));
       s = this.b.S;
       s[(s.length - 1)] = Long.valueOf(SystemClock.uptimeMillis());
       s = this.b.S;
       s[(s.length - 1)].longValue();
       if ((SystemClock.uptimeMillis() - this.b.S[0].longValue()) - (long)1500 <= 0) {
          FragmentActivity activity = this.b.getActivity();
          if (!PatchProxy.applyVoidOneRefs(activity, null, TopCacheActivity.class, str)) {
             activity.startActivity(new Intent(activity, TopCacheActivity.class));
          }
       }
       return;
    }
}
