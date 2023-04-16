package com.kuaishou.merchant.krn.cover.LinkBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.krn.cover.LinkBridge$a;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.krn.cover.LinkBridge$b;

public class LinkBridge extends KrnBridge	// class@001862
{
    public ReactApplicationContext context;

    public void LinkBridge(ReactApplicationContext p0){
       super(p0);
       this.context = p0;
    }
    public void close(int p0){
       LinkBridge linkBridge = LinkBridge.class;
       if (PatchProxy.isSupport(linkBridge) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, linkBridge, "2")) {
          return;
       }
       k1.o(new LinkBridge$a(this, p0));
       return;
    }
    public void closeV2(int p0,String p1){
       if (PatchProxy.isSupport(LinkBridge.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LinkBridge.class, "1")) {
          return;
       }
       this.close(p0);
       return;
    }
    public void closeWidget(int p0,String p1){
       LinkBridge linkBridge = LinkBridge.class;
       if (PatchProxy.isSupport(linkBridge) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, linkBridge, "3")) {
          return;
       }
       k1.o(new LinkBridge$b(this, p1, p0));
       return;
    }
    public String getName(){
       return "LNKRenderKrnBridge";
    }
}
