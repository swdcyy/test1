package vq.c;
import android.content.Context;
import com.kuaishou.android.vader.Channel;
import tq.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.lang.Enum;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class c	// class@0026d3
{
    public final Context a;
    public final Channel b;
    public final f c;

    public void c(Context p0,Channel p1,f p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       g.b(this.c.a(this.a, "ChannelDelayedState", 0).edit().remove(this.b.name()));
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.a(this.a, "ChannelDelayedState", 0).getBoolean(this.b.name(), 0);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       g.b(this.c.a(this.a, "ChannelDelayedState", 0).edit().putBoolean(this.b.name(), true));
       return;
    }
}
