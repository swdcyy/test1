package dk1.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import td3.o;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import brd.t;
import dk1.a$a;
import erd.g;
import crd.b;

public final class a extends Model	// class@001fac
{

    public void a(o p0){
       a.p(p0, "userStatusManager");
       super("GiftSlotDisableModel", null, false, true, 6, null);
       p0.W().subscribe(new a$a(this));
    }
}
