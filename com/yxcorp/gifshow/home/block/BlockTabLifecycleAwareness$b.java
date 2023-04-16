package com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$b;
import fr6.j;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness;
import java.lang.Object;
import wq6.h;
import xr6.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import zq6.r;
import zr6.e;
import bo5.a;
import zq6.p;
import com.kwai.kcube.TabIdentifier;
import java.lang.Boolean;
import tra.a;
import wq6.f;

public final class BlockTabLifecycleAwareness$b implements j	// class@001640
{
    public final BlockTabLifecycleAwareness a;

    public void BlockTabLifecycleAwareness$b(BlockTabLifecycleAwareness p0){
       this.a = p0;
       super();
    }
    public void a(h p0,h p1,c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, BlockTabLifecycleAwareness$b.class, "1")) {
          return;
       }
       a.p(p0, "from");
       a.p(p1, "to");
       a.p(p2, "extParams");
       p s = a.s;
       a.o(s, "HomeTopStateId.TAB_TEXT");
       this.a.c().a(s, p1.q("KEY_TAB_NAME_DEST"));
       if ((a.g(p0.M2().getType(), "ato_operate") ^ 0x01) && (a.g(p1.M2().getType(), "ato_operate") ^ 0x01)) {
          a.j(Boolean.TRUE);
       }
       f uof = this.a.d();
       if (uof != null) {
          this.a.p(uof);
       }
       return;
    }
}
