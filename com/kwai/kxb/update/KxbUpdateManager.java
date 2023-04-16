package com.kwai.kxb.update.KxbUpdateManager;
import com.kwai.kxb.PlatformType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import cv6.g;
import java.util.LinkedHashMap;
import com.kwai.kxb.update.model.DownloadPriority;
import xu6.j;
import brd.a0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ev6.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.Map;
import ru6.o;
import com.kwai.kxb.service.BaseServiceProviderKt;
import java.lang.Throwable;
import ru6.o$b;
import io.reactivex.subjects.SingleSubject;
import xu6.k;
import wu6.a;
import com.kwai.kxb.update.KxbUpdateManager$a;
import erd.g;
import com.kwai.kxb.update.KxbUpdateManager$b;
import com.kwai.kxb.update.KxbUpdateManager$c;
import com.kwai.kxb.update.KxbUpdateManager$update$4;
import erd.a;
import java.lang.IllegalStateException;

public final class KxbUpdateManager	// class@000807
{
    public final String a;
    public final g b;
    public final Map c;
    public final PlatformType d;

    public void KxbUpdateManager(PlatformType p0){
       a.p(p0, "platformType");
       super();
       this.d = p0;
       this.a = '['+p0.name()+']';
       this.b = new g(p0);
       this.c = new LinkedHashMap();
    }
    public final a0 a(String p0,DownloadPriority p1,boolean p2,boolean p3,int p4,j p5){
       Object[] objArray;
       a0 obj;
       KxbUpdateManager kxbUpdateMan = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p5;
       KxbUpdateManager kxbUpdateMan1 = KxbUpdateManager.class;
       String str = "1";
       int i = 2;
       if (PatchProxy.isSupport(kxbUpdateMan1)) {
          objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),oobject2};
          obj = PatchProxy.apply(objArray, this, kxbUpdateMan1, str);
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "bundleId");
       a.p(p1, "downloadPriority");
       objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, f.class, str) || f.b()) {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          obj = kxbUpdateMan.c.get(p0);
          objectRef.element = obj;
          if (obj != null) {
             o$b.d(BaseServiceProviderKt.a(), kxbUpdateMan.a+" found update task in the air ==> "+p0, objArray, i, objArray);
             return objectRef.element;
          }else {
             o$b.d(BaseServiceProviderKt.a(), kxbUpdateMan.a+" start update task ==> "+p0, objArray, i, objArray);
             objectRef.element = SingleSubject.k0();
             a0 uoa0 = kxbUpdateMan.b.i(p0, p1, p2, p3, false, p4, new k(kxbUpdateMan.d, oobject2)).q(new KxbUpdateManager$a(this, objectRef, p0)).r(new KxbUpdateManager$b(objectRef)).p(new KxbUpdateManager$c(objectRef)).n(new KxbUpdateManager$update$4(this, p0));
             a.o(uoa0, "mRemoteUpdateManager.upd¡­ndleId\)\n        }\n      }");
             return uoa0;
          }
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
}
