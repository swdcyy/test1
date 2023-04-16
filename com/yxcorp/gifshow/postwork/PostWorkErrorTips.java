package com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips$NoSpaceLeftException;
import java.lang.Integer;
import lnc.a1;
import e17.i;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class PostWorkErrorTips	// class@0010af
{

    public void PostWorkErrorTips(){
       super();
    }
    public static boolean a(Throwable p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostWorkErrorTips.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       String message = p0.getMessage();
       Log.g("PostWorkErrorTips", "isDiskNoSpace msg: "+message);
       if ((p0.getClass().getSimpleName()).equals("ErrnoException") && (message == null || (message.contains("ENOSPC") || (message == null || (message.contains("No space left on device") || p0 instanceof PostWorkErrorTips$NoSpaceLeftException))))) {
          b = true;
       }
       return b;
    }
    public static void b(int p0){
       PostWorkErrorTips postWorkErro = PostWorkErrorTips.class;
       if (PatchProxy.isSupport(postWorkErro) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, postWorkErro, "1")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(p0));
       if (!PatchProxy.applyVoid(null, null, postWorkErro, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TOAST_OUT_OF_MEMORY";
          u1.u0(4, uElementPack, null);
       }
       return;
    }
}
