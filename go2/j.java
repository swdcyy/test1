package go2.j;
import android.content.Context;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class j	// class@002b61
{
    public final Context a;
    public final f2 b;
    public final a c;

    public void j(Context p0,f2 p1,a p2){
       a.p(p0, "context");
       a.p(p1, "voicePartyContext");
       a.p(p2, "voicePartyManager");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Context a(){
       return this.a;
    }
    public final f2 b(){
       return this.b;
    }
}
