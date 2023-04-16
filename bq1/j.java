package bq1.j;
import com.kuaishou.live.common.core.component.multichat.render.cell.audience.LiveMultiChatAudienceBaseCellController;
import java.lang.String;
import yp1.b;
import zp1.i;
import zp1.l;
import java.lang.Object;
import kotlin.jvm.internal.a;

public abstract class j extends LiveMultiChatAudienceBaseCellController	// class@0003ed
{
    public final String O;
    public final b P;
    public final i Q;
    public final l R;

    public void j(String p0,b p1,i p2,l p3){
       a.p(p0, "cellUserId");
       a.p(p1, "renderModel");
       a.p(p2, "chatCellBaseDelegate");
       a.p(p3, "chatCellRendDelegate");
       super(p0, p1, p2, p3);
       this.O = p0;
       this.P = p1;
       this.Q = p2;
       this.R = p3;
    }
    public boolean z3(){
       return true;
    }
}
