package com.kuaishou.live.core.show.redpacket.krn.l$a;
import ch2.n;
import com.kuaishou.live.core.show.redpacket.krn.l;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveKrnRedPackMessage$LiveKrnRedPack;
import java.util.Map;
import lp3.e;
import lp3.c;
import lp3.b;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import qk.m;
import java.util.ArrayList;

public class l$a implements n	// class@000ede
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public t D3(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.r.hide();
    }
    public void Vm(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "4")) {
          return;
       }
       this.b.P8(p0);
       return;
    }
    public LiveKrnRedPackMessage$LiveKrnRedPack Z2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.p.get(p0);
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public List v4(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       m.s(this.b.p.values()).n(uArrayList);
       return uArrayList;
    }
}
