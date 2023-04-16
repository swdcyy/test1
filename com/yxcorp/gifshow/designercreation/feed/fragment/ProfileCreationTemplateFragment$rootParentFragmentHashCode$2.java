package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$rootParentFragmentHashCode$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.Integer;

public final class ProfileCreationTemplateFragment$rootParentFragmentHashCode$2 extends Lambda implements a	// class@0012d9
{
    public final ProfileCreationTemplateFragment this$0;

    public void ProfileCreationTemplateFragment$rootParentFragmentHashCode$2(ProfileCreationTemplateFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       int intx;
       Bundle obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment$rootParentFragmentHashCode$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.getArguments();
       if (obj != null) {
          intx = obj.getInt("ROOT_FRAGMENT_HASH_CODE");
       }else {
          Fragment parentFragme = this.this$0.getParentFragment();
          intx = (parentFragme != null)? parentFragme.hashCode(): 0;
       }
       return intx;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
