package em4.a;
import com.google.gson.JsonObject;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;

public interface abstract a	// class@00205a
{

    void Pc();
    void Qc(JsonObject p0);
    void U7(int p0,String p1);
    void e5(int p0,JsonObject p1);
    void f1(String p0);
    void ha(PaymentMethodInfo p0);
    void l7();
}
