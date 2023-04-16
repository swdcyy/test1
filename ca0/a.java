package ca0.a;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.lang.StringBuilder;

public final class a	// class@0002f6
{
    public static final SharedPreferences a;

    static {
       a.a = b.b("DefaultPreferenceHelper");
    }
    public static HashMap a(Type p0){
       String str = a.a.getString(b.d("user")+"merchant_audience_auction_bid_item_price_map", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static int b(){
       return a.a.getInt(b.d("user")+"merchant_sliding_next_view", 0);
    }
}
