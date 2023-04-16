package com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment$b;
import lkd.b;
import com.yxcorp.gifshow.profile.acfun.ProfileAcFunFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

public final class ProfileAcFunFragment$b implements b	// class@0011ea
{
    public final ProfileAcFunFragment a;

    public void ProfileAcFunFragment$b(ProfileAcFunFragment p0){
       this.a = p0;
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, ProfileAcFunFragment$b.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = this.a.getResources().getString(R.string.arg_RES_7f100d28);
       }
       return str;
    }
}
