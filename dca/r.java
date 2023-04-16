package dca.r;
import com.yxcorp.gifshow.bubble.b$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;

public final class r implements b$c	// class@001f00
{
    public static final r a;

    static {
       r.a = new r();
    }
    public void r(){
       super();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (EditBubbleItem.AI_CUT_RECOMMEND.couldShow() ^ 0x01);
    }
}
