package me9.m$g;
import java.lang.Runnable;
import java.util.Map$Entry;
import com.google.gson.JsonObject;
import me9.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class m$g implements Runnable	// class@003007
{
    public final Map$Entry b;
    public final JsonObject c;
    public final m d;

    public void m$g(Map$Entry p0,JsonObject p1,m p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, m$g.class, "1")) {
          return;
       }
       this.d.j(this.b.getKey(), this.c);
       PatchProxy.onMethodExit(m$g.class, "1");
       return;
    }
}
