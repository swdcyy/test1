package com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness$c;
import fr6.g;
import com.yxcorp.gifshow.home.block.BlockTabLifecycleAwareness;
import java.lang.Object;
import wq6.h;
import xr6.c;
import fr6.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import co5.g;

public final class BlockTabLifecycleAwareness$c implements g	// class@001641
{
    public final BlockTabLifecycleAwareness a;

    public void BlockTabLifecycleAwareness$c(BlockTabLifecycleAwareness p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,h p1,c p2){
       f.b(this, p0, p1, p2);
    }
    public void b(boolean p0,h p1,h p2,c p3){
       if (PatchProxy.isSupport(BlockTabLifecycleAwareness$c.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, BlockTabLifecycleAwareness$c.class, "1")) {
          return;
       }
       a.p(p1, "triggerContainer");
       a.p(p2, "fromOrTo");
       a.p(p3, "exParams");
       if (p0) {
          Log.b("BlockLifecycle", "x block recur selected");
          BlockTabLifecycleAwareness$c ta = this.a;
          ta.e = true;
          BlockTabLifecycleAwareness f = ta.f;
          if (f != null) {
             f.l = 0;
          }
       }
       return;
    }
}
