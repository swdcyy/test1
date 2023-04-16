package com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.designercreation.ProfileCreationTabFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class ProfileCreationTabFragment$f implements Runnable	// class@0012ca
{
    public final ProfileCreationTabFragment b;
    public final View c;

    public void ProfileCreationTabFragment$f(ProfileCreationTabFragment p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ProfileCreationTabFragment$f.class, "1")) {
          return;
       }
       this.b.ph(this.c.getHeight());
       return;
    }
}
