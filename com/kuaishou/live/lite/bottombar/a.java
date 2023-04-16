package com.kuaishou.live.lite.bottombar.a;
import z1.a;
import com.kuaishou.live.lite.bottombar.f;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import i93.e;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.a;

public final class a implements a	// class@001eb5
{
    public final f a;

    public void a(f p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, f.class, "7")) {
       }else {
          ta.o.a("reloadBottomBarItems", new e(ta, p0));
       }
       return;
    }
}
