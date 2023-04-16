package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import com.kuaishou.live.bridge.commands.migrated.LiveJsCmdMockSelfSendGiftEffect$Param;
import java.lang.CharSequence;
import java.lang.Integer;
import lk1.a;
import lp3.c;
import lm1.i;

public final class LiveJsCmdMockSelfSendGiftEffect extends AbstractLiveJsCommand	// class@000e11
{

    public void LiveJsCmdMockSelfSendGiftEffect(){
       super();
    }
    public Class a(){
       return LiveJsCmdMockSelfSendGiftEffect$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdMockSelfSendGiftEffect.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       String str = "invalid params";
       if (!p0 instanceof LiveJsCmdMockSelfSendGiftEffect$a) {
          return m.g.c(str);
       }
       p0 = p0.param;
       if (p0 != null) {
          String str1 = p0.d();
          int i = 1;
          str1 = (str1 == null || !str1.length())? 1: null;
          if (!str1) {
             str1 = p0.c();
             str1 = (str1 == null || !str1.length())? 1: null;
             if (!str1) {
                str1 = p0.b();
                if (str1 != null && str1.length()) {
                   i = 0;
                }
                if (i || (p0.a() != null && p0.a().intValue() > 0)) {
                   this.g(a.class).Li(null, p0.d(), p0.b(), p0.a().intValue(), p0.c(), null);
                   return m$a.g(m.g, null, false, 3, null);
                }
             }
          }
       }
    label_0096 :
       return m.g.c(str);
    }
}
