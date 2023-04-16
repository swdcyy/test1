package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment$tabType$2;
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

public final class ProfileCreationTemplateFragment$tabType$2 extends Lambda implements a	// class@0012da
{
    public final ProfileCreationTemplateFragment this$0;

    public void ProfileCreationTemplateFragment$tabType$2(ProfileCreationTemplateFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Bundle obj = PatchProxy.apply(null, this, ProfileCreationTemplateFragment$tabType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.this$0.getArguments();
       int i = 2;
       if (obj != null) {
          i = obj.getInt("TAB_TYPE", i);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
