package al4.b;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import androidx.fragment.app.Fragment;
import al4.f;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public interface abstract b	// class@000094
{

    void a(MerchantEventModel p0);
    void b(Fragment p0,MerchantEventModel p1,f p2,Map p3,ClientEvent$UrlPackage p4);
    void release();
}
