package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment$isSubFragment$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class ProfileCreationMagicFragment$isSubFragment$2 extends Lambda implements a	// class@0012d2
{
    public final ProfileCreationMagicFragment this$0;

    public void ProfileCreationMagicFragment$isSubFragment$2(ProfileCreationMagicFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Bundle obj = PatchProxy.apply(null, this, ProfileCreationMagicFragment$isSubFragment$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.this$0.getArguments();
       boolean b = true;
       if (obj != null) {
          b = obj.getBoolean("IS_SUB_FRAGMENT", b);
       }
       return b;
    }
}
