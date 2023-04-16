package com.kwai.platform.krouter.handler.ChainedHandler;
import rh7.a;
import zh7.a;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.AbstractList;
import com.kwai.platform.krouter.handler.ChainedHandler$a;

public class ChainedHandler extends a	// class@00128c
{
    public final a b;

    public void ChainedHandler(){
       super();
       this.b = new a(0);
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ChainedHandler.class, "4")) {
          return;
       }
       this.e(this.b.iterator(), p0, p1);
       return;
    }
    public boolean d(b p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ChainedHandler.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return (this.b.isEmpty() ^ 0x01);
    }
    public void e(Iterator p0,b p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ChainedHandler.class, "5")) {
          return;
       }
       if (p0.hasNext()) {
          p0.next().b(p1, new ChainedHandler$a(this, p0, p1, p2));
       }else {
          p2.b();
       }
       return;
    }
}
