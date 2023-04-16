package h22.a;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import o22.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import fg6.a;
import com.google.gson.Gson;

public class a	// class@002beb
{
    public r1 a;
    public a0 b;
    public b c;
    public String d;
    public a e;

    public void a(){
       super();
       this.e = a.b;
    }
    public int a(){
       LiveTreasureBoxMessage$LiveTreasureBoxShow obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c.c.getValue();
       if (obj == null) {
          return 0;
       }
       return obj.bizType;
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.c.getValue().boxType;
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c.c.getValue() != null) {
          return a.a.q(this.c.c.getValue().extraMessage);
       }
       return "";
    }
    public String d(){
       LiveTreasureBoxMessage$LiveTreasureBoxShow obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.c.getValue();
       if (obj == null) {
          return "";
       }
       return obj.treasureBoxId;
    }
}
