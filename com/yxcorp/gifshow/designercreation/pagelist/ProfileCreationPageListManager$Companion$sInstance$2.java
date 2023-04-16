package com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager$Companion$sInstance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ProfileCreationPageListManager$Companion$sInstance$2 extends Lambda implements a	// class@001303
{
    public static final ProfileCreationPageListManager$Companion$sInstance$2 INSTANCE;

    static {
       ProfileCreationPageListManager$Companion$sInstance$2.INSTANCE = new ProfileCreationPageListManager$Companion$sInstance$2();
    }
    public void ProfileCreationPageListManager$Companion$sInstance$2(){
       super(0);
    }
    public final ProfileCreationPageListManager invoke(){
       Object obj = PatchProxy.apply(null, this, ProfileCreationPageListManager$Companion$sInstance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ProfileCreationPageListManager();
    }
    public Object invoke(){
       return this.invoke();
    }
}
