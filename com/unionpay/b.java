package com.unionpay.b;
import java.util.Comparator;
import java.lang.String;
import java.lang.Object;
import org.json.JSONObject;

public final class b implements Comparator	// class@000ff4
{
    public String a;

    public void b(String p0){
       super();
       this.a = "";
       this.a = p0;
    }
    public final int compare(Object p0,Object p1){
       if ((v2 = p0.optLong(this.a) - p1.optLong(this.a)) < 0) {
          return -1;
       }
       if (v2 > 0) {
          return 1;
       }
       return 0;
    }
}
