package com.yxcorp.gifshow.HomeUiMode$1;
import com.yxcorp.gifshow.HomeUiMode;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import kn5.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homeroot.HomeRootFragment;

public final class HomeUiMode$1 extends HomeUiMode	// class@0012f0
{

    public void HomeUiMode$1(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public void applyTheme(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeUiMode$1.class, "2")) {
          return;
       }
       p0.setTheme(R.style.arg_RES_7f11016a);
       HomeUiMode.handelImmersiveMode(p0);
       return;
    }
    public c createHomeFragment(FragmentActivity p0){
       p0 = PatchProxy.applyOneRefs(p0, this, HomeUiMode$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return HomeRootFragment.fh(2);
    }
}
