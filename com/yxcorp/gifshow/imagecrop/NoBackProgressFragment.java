package com.yxcorp.gifshow.imagecrop.NoBackProgressFragment;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;

public final class NoBackProgressFragment extends AttrAnimProgressFragment	// class@001956
{
    public HashMap E;

    public void NoBackProgressFragment(){
       super();
    }
    public int getTheme(){
       return 0x7f11057d;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, NoBackProgressFragment.class, "2")) {
       }else {
          NoBackProgressFragment tE = this.E;
          if (tE != null) {
             tE.clear();
          }
       }
       return;
    }
}
