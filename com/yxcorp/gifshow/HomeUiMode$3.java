package com.yxcorp.gifshow.HomeUiMode$3;
import com.yxcorp.gifshow.HomeUiMode;
import java.lang.String;
import com.yxcorp.gifshow.HomeUiMode$1;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import kn5.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homeroot.HomeRootFragment;

public final class HomeUiMode$3 extends HomeUiMode	// class@0012f2
{

    public void HomeUiMode$3(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public void applyTheme(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeUiMode$3.class, "2")) {
          return;
       }
       p0.setTheme(R.style.arg_RES_7f11016e);
       HomeUiMode.handelImmersiveMode(p0);
       return;
    }
    public c createHomeFragment(FragmentActivity p0){
       p0 = PatchProxy.applyOneRefs(p0, this, HomeUiMode$3.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return HomeRootFragment.fh(4);
    }
}
