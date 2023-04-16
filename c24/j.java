package c24.j;
import z1.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import java.lang.Object;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import java.lang.String;

public final class j implements a	// class@000483
{
    public final LiveMerchantBaseContext a;

    public void j(LiveMerchantBaseContext p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       p0.putParcelable("MERCHANT_BASE_CONTEXT", b.c(this.a));
    }
}
