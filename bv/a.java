package bv.a;
import com.kuaishou.bowl.data.center.network.AggregationMaterialRequest;
import brd.t;
import java.util.Map;
import java.lang.String;
import com.kuaishou.bowl.data.center.network.UpdateProtocolRequest;
import com.kuaishou.bowl.data.center.network.LiveMaterialRequest;
import com.kuaishou.bowl.data.center.network.PersonalAgreementRequest;
import okhttp3.RequestBody;

public interface abstract a	// class@0002c2
{

    t a(AggregationMaterialRequest p0);
    t b(Map p0,String p1,Map p2);
    t c(UpdateProtocolRequest p0);
    t d(String p0,long p1);
    t e(LiveMaterialRequest p0);
    t f(PersonalAgreementRequest p0);
    t g(String p0,String p1,String p2);
    t h(RequestBody p0);
    t i(String p0);
    t j(Map p0,String p1,RequestBody p2);
    t k(String p0,String p1,String p2,long p3);
    t l(String p0,String p1,String p2,String p3);
}
