package com.kuaishou.activity.kwaibubble.tk.bridge.KwaiPopTkBridge;
import tx4.l;
import com.kuaishou.activity.kwaibubble.tk.bridge.KwaiPopTkBridge$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import rn.a;
import kotlin.jvm.internal.a;
import tx4.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import rn.a$a;
import sn.a;
import com.kuaishou.activity.kwaibubble.tk.bridge.KwaiPopTkBridge$invoke$commend$1;
import msd.l;
import sn.b;
import tx4.k;

public final class KwaiPopTkBridge implements l	// class@000796
{
    public final a a;
    public static final List b;
    public static final KwaiPopTkBridge$a c;

    static {
       KwaiPopTkBridge.c = new KwaiPopTkBridge$a(null);
       String[] stringArray = new String[]{"closeDialog","KwaiBubble.closeDialog"};
       KwaiPopTkBridge.b = CollectionsKt__CollectionsKt.L(stringArray);
    }
    public void KwaiPopTkBridge(a p0){
       a.p(p0, "kwaiPop");
       super();
       this.a = p0;
    }
    public Object a(String p0,String p1,h p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiPopTkBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Integer integer = null;
       if (CollectionsKt___CollectionsKt.H1(KwaiPopTkBridge.b, p0)) {
          a$a.a(this.a, integer, 1, integer);
          return integer;
       }else {
          b uob = a.c.b(p0, p1, new KwaiPopTkBridge$invoke$commend$1(p2));
          if (uob != null) {
             integer = uob.e();
          }
          return integer;
       }
    }
    public Object b(String p0,String p1,String p2,h p3){
       return k.a(this, p0, p1, p2, p3);
    }
}
