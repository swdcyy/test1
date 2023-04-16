package ck0.b;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import fk0.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import lj0.c;

public final class b extends KrnLogCommonParams	// class@0004d1
{
    public String eventSource;
    public String warningType;

    public void b(a p0,String p1,String p2){
       a.p(p0, "bundleMeta");
       a.p(p1, "eventSource");
       a.p(p2, "warningType");
       super(p0, null, 2, null);
       this.eventSource = p1;
       this.warningType = p2;
    }
    public void b(c p0,String p1,String p2){
       a.p(p1, "eventSource");
       a.p(p2, "warningType");
       super(p0, null, 2, null);
       this.eventSource = p1;
       this.warningType = p2;
    }
}
