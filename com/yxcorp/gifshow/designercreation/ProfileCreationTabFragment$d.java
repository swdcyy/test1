package com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$d;
import erd.g;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a3c.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ProfileCreationTabFragment$d implements g	// class@0012c8
{
    public final ProfileCreationTabFragment b;

    public void ProfileCreationTabFragment$d(ProfileCreationTabFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileCreationTabFragment$d.class, "1")) {
       }else if(a.b(p0, "MAIN_KEY") == 20 && this.b.K0()){
          this.b.oh();
       }
       PatchProxy.onMethodExit(ProfileCreationTabFragment$d.class, "1");
       return;
    }
}
