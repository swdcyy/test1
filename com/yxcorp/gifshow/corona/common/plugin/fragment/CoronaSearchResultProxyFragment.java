package com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaSearchResultProxyFragment;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaBasePluginProxyFragment;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import cm5.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import kotlin.jvm.internal.a;
import java.util.HashMap;

public final class CoronaSearchResultProxyFragment extends CoronaBasePluginProxyFragment	// class@001260
{
    public HashMap k;

    public void CoronaSearchResultProxyFragment(){
       super();
    }
    public Fragment ch(){
       BaseFragment obj = PatchProxy.apply(null, this, CoronaSearchResultProxyFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-241623919).fu();
       a.o(obj, "PluginManager.get\(Corona¡­deoSearchResultFragment\(\)");
       return obj;
    }
    public String fh(){
       return "LongVideoSearchResultFragment";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, CoronaSearchResultProxyFragment.class, "3")) {
       }else {
          CoronaSearchResultProxyFragment tk = this.k;
          if (tk != null) {
             tk.clear();
          }
       }
       return;
    }
}
