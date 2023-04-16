package com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationPageListManager$Companion$sInstance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class ProfileCreationPageListManager	// class@001305
{
    public final HashMap a;
    public static final p b;
    public static final ProfileCreationPageListManager$a c;

    static {
       ProfileCreationPageListManager.c = new ProfileCreationPageListManager$a(null);
       ProfileCreationPageListManager.b = s.b(LazyThreadSafetyMode.SYNCHRONIZED, ProfileCreationPageListManager$Companion$sInstance$2.INSTANCE);
    }
    public void ProfileCreationPageListManager(){
       super();
       this.a = new HashMap();
    }
    public final ProfileCreationTemplatePageList a(String p0){
       ProfileCreationTemplatePageList obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationPageListManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       obj = this.a.get(p0);
       if (obj != null) {
          return obj;
       }
       obj = new ProfileCreationTemplatePageList(p0);
       this.a.put(p0, obj);
       return obj;
    }
}
