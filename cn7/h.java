package cn7.h;
import cn7.g;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;

public class h implements g	// class@00057c
{
    public final List b;

    public void h(){
       super();
       this.b = new ArrayList();
    }
    public List H(){
       return this.b;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.H().isEmpty() ^ 0x01);
    }
}
