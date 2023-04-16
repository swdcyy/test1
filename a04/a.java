package a04.a;
import kotlin.Pair;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import qrd.r0;
import java.util.Map;
import trd.s0;

public final class a	// class@000006
{
    public static final Pair a;
    public static final List b;
    public static final Map c;
    public static final a d;

    static {
       a.d = new a();
       a.a = new Pair("0.00", "0.00");
       String[] stringArray = new String[]{"MERCHANT_PURCHASE_PAGE","MERCHANT_ORDER_LIST","MY_PROFILE","SETTINGS"};
       a.b = CollectionsKt__CollectionsKt.P(stringArray);
       a.c = s0.k(r0.a("SettingRedDot", Integer.valueOf(1103)));
    }
    public void a(){
       super();
    }
    public final List a(){
       return a.b;
    }
    public final Pair b(){
       return a.a;
    }
}
