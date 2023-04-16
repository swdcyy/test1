package hu8.b;
import g46.a;
import hu8.b$a;
import nsd.u;
import java.lang.Object;
import z36.d;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import y26.b;
import android.app.Activity;
import tkd.b;
import tkd.d;
import w26.a;
import java.util.Objects;
import w26.c;
import xnc.a;

public final class b implements a	// class@0025e3
{
    public static final b$a a;

    static {
       b.a = new b$a(null);
    }
    public void b(){
       super();
    }
    public void a(d p0,Context p1,int p2,Intent p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, b.class, "1")) {
          return;
       }
       a.p(p1, "context");
       int i = (p0 instanceof b && p1 instanceof Activity)? 1: 0;
       if (!i) {
          return;
       }else {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kwai.feature.post.api.feature.publish.model.SharePageParam");
          Intent intent = d.a(0x27e26f6e).Z00(p0);
          a.o(intent, "PluginManager.get\(Publis¡­s\n        SharePageParam\)");
          a.f(p1.getIntent(), intent);
          p1.startActivityForResult(intent, p2);
          return;
       }
    }
}
