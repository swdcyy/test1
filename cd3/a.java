package cd3.a;
import hx1.b;
import aq5.d;
import td3.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import brd.t;
import cd3.a$a;
import erd.g;
import crd.b;
import krd.a;

public final class a extends b	// class@0004f4
{
    public final a d;

    public void a(d p0,o p1){
       a.p(p0, "bizRelationService");
       a.p(p1, "statusObtainService");
       super();
       a uoa = new a();
       this.d = uoa;
       this.r(p0);
       b uob = p1.W().subscribe(new a$a(this));
       a.o(uob, "statusObtainService.time¡­fos = it.mRoleInfos\n    }");
       a.b(uoa, uob);
    }
}
