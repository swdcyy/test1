package com.yxcorp.gifshow.growth.kwaibubble.KBubblePluginImpl;
import mp5.a;
import java.lang.Object;
import zn.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.kwaibubble.KBubblePluginImpl$showTkDialogAsync$1;
import msd.a;
import com.kwai.android.common.ext.ContextExtKt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import rn.e;
import qrd.l1;
import rn.b;
import rn.a;
import rn.e$a;
import java.util.List;
import np5.c;
import com.yxcorp.gifshow.growth.kwaibubble.KBubblePluginImpl$b;
import tx4.f;
import com.kuaishou.tk.api.a;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.kwaibubble.KBubblePluginImpl$a;

public class KBubblePluginImpl implements a	// class@00141b
{

    public void KBubblePluginImpl(){
       super();
    }
    public void KI(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KBubblePluginImpl.class, "1")) {
          return;
       }
       a.p(p0, "builder");
       ContextExtKt.runOnUiThread(new KBubblePluginImpl$showTkDialogAsync$1(p0));
       return;
    }
    public boolean Lp(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KBubblePluginImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "builder");
       boolean b = true;
       p0.q(b);
       a uoa = e.a.a(p0);
       if (uoa == null || uoa.show() != b) {
          b = false;
       }
       return b;
    }
    public void Sr(List p0,boolean p1,c p2){
       if (PatchProxy.isSupport(KBubblePluginImpl.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, KBubblePluginImpl.class, "4")) {
          return;
       }
       a.p(p0, "bundleIdList");
       a.b(p0, p1, new KBubblePluginImpl$b(p2));
       return;
    }
    public void aW(String p0,Integer p1,boolean p2,c p3){
       if (PatchProxy.isSupport(KBubblePluginImpl.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, KBubblePluginImpl.class, "3")) {
          return;
       }
       a.p(p0, "bundleId");
       int i = (p1 != null)? p1.intValue(): -1;
       a.a(p0, i, p2, new KBubblePluginImpl$a(p3));
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
