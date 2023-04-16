package com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$c;
import erd.g;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hw9.a;
import hw9.a$a;
import java.lang.StringBuilder;
import w46.b;

public final class ProfileCreationTabFragment$c implements g	// class@0012c7
{
    public final ProfileCreationTabFragment b;

    public void ProfileCreationTabFragment$c(ProfileCreationTabFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCreationTabFragment$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.c.a().t("ProfileCreationTabFragment", "init subtab failed: "+p0, objArray);
          this.b.x4();
       }
       return;
    }
}
