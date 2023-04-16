package com.kuaishou.life_plugin_common.fragment.LifeProxyFragment;
import com.kuaishou.life_plugin_common.fragment.LifeBasePluginProxyFragment;
import com.kuaishou.life_plugin_common.fragment.LifeProxyFragment$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gl0.a;
import q87.c;
import tkd.b;
import tkd.d;
import hn5.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class LifeProxyFragment extends LifeBasePluginProxyFragment	// class@000931
{
    public static final LifeProxyFragment$a k;

    static {
       LifeProxyFragment.k = new LifeProxyFragment$a(null);
    }
    public void LifeProxyFragment(){
       super();
    }
    public Fragment ch(){
       Object obj = PatchProxy.apply(null, this, LifeProxyFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.C().w("LifeProxyFragment", "createRealFragment", objArray);
       return d.a(-119680890).Nw();
    }
    public String eh(){
       return "LifeProxyFragment";
    }
}
