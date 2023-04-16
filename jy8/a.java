package jy8.a;
import erd.a;
import com.yxcorp.gifshow.ad.award.scheme.NeoSchemeDispatchActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a implements a	// class@0029d6
{
    public final NeoSchemeDispatchActivity b;

    public void a(NeoSchemeDispatchActivity p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.finish();
       return;
    }
}
