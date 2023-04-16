package com.yxcorp.gifshow.upload.ExtraInfoUploadManager;
import com.yxcorp.gifshow.upload.ExtraInfoUploadManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.yxcorp.gifshow.upload.ExtraInfoUploadManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.upload.ExtraInfoUploadManager$mExtraInfoUploadService$2;
import crd.a;
import gnc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.Boolean;
import j80.f;
import com.yxcorp.gifshow.upload.o1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public final class ExtraInfoUploadManager	// class@001e42
{
    public final HashMap a;
    public final p b;
    public a c;
    public static final p d;
    public static final ExtraInfoUploadManager$a e;

    static {
       ExtraInfoUploadManager.e = new ExtraInfoUploadManager$a(null);
       ExtraInfoUploadManager.d = s.b(LazyThreadSafetyMode.SYNCHRONIZED, ExtraInfoUploadManager$Companion$instance$2.INSTANCE);
    }
    public void ExtraInfoUploadManager(){
       super();
       this.a = new HashMap();
       this.b = s.c(ExtraInfoUploadManager$mExtraInfoUploadService$2.INSTANCE);
       this.c = new a();
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, ExtraInfoUploadManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void b(boolean p0,File p1,String p2){
       if (PatchProxy.isSupport(ExtraInfoUploadManager.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, ExtraInfoUploadManager.class, "4")) {
          return;
       }
       if (p1 == null || !p1.exists()) {
          p1 = null;
       }
       f.a(p1);
       o1 oo1 = o1.class;
       if (!PatchProxy.isSupport(oo1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p2, null, oo1, "35")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "USER_DEFINED_MAGIC_FACE_UPLOAD_PHOTO";
          i3 oi3 = i3.f();
          String str = (p0)? "success": "fail";
          oi3.d("status", str);
          oi3.d("magic_face_id", p2);
          uElementPack.params = oi3.e();
          int i = (p0)? 7: 8;
          h$b uob = h$b.e(i, "USER_DEFINED_MAGIC_FACE_UPLOAD_PHOTO");
          uob.k(uElementPack);
          u1.p0("", null, uob);
       }
       return;
    }
}
