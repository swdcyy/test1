package com.kuaishou.merchant.home.mall.HomeMallProxyFragment;
import com.kuaishou.merchant.home.mall.HomeMallBaseProxyFragment;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yr3.e;
import yr3.a;
import yr3.f;
import android.os.Bundle;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.HashMap;

public final class HomeMallProxyFragment extends HomeMallBaseProxyFragment	// class@0016d9
{
    public HashMap l;

    public void HomeMallProxyFragment(){
       super();
    }
    public Fragment ch(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, HomeMallProxyFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.r(e.class);
       if (obj != null) {
          objArray = obj.I7(objArray);
       }
       return objArray;
    }
    public String eh(){
       return "HomeMallProxyFragment";
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, HomeMallProxyFragment.class, "3")) {
       }else {
          HomeMallProxyFragment tl = this.l;
          if (tl != null) {
             tl.clear();
          }
       }
       return;
    }
}
