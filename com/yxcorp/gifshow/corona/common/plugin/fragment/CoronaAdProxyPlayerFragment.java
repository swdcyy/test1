package com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaAdProxyPlayerFragment;
import com.yxcorp.gifshow.corona.common.plugin.fragment.CoronaBasePluginProxyFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import cm5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;

public final class CoronaAdProxyPlayerFragment extends CoronaBasePluginProxyFragment	// class@00125e
{
    public final QPhoto k;
    public HashMap l;

    public void CoronaAdProxyPlayerFragment(QPhoto p0){
       a.p(p0, "photo");
       super();
       this.k = p0;
    }
    public Fragment ch(){
       Fragment obj = PatchProxy.apply(null, this, CoronaAdProxyPlayerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x822e1c2).W30(this.k);
       a.o(obj, "PluginManager.get\(Corona¡­etAdPlayerFragment\(photo\)");
       return obj;
    }
    public String fh(){
       return "CoronaProxyPlayerFragment";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, CoronaAdProxyPlayerFragment.class, "3")) {
       }else {
          CoronaAdProxyPlayerFragment tl = this.l;
          if (tl != null) {
             tl.clear();
          }
       }
       return;
    }
}
