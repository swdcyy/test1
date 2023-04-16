package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$subTab$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ProfileCreationContainerFragment$subTab$2 extends Lambda implements a	// class@0012cf
{
    public final ProfileCreationContainerFragment this$0;

    public void ProfileCreationContainerFragment$subTab$2(ProfileCreationContainerFragment p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       Object[] objArray = null;
       Bundle obj = PatchProxy.apply(objArray, this, ProfileCreationContainerFragment$subTab$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getArguments();
       Serializable serializable = (obj != null)? SerializableHook.getSerializable(obj, "SUB_TAB"): objArray;
       if (serializable instanceof ArrayList) {
          objArray = serializable;
       }
       if (objArray == null) {
          objArray = CollectionsKt__CollectionsKt.E();
       }
       return objArray;
    }
}
