package c.t.m.g.ch;
import c.t.m.g.cg;
import java.lang.String;
import android.util.LruCache;
import android.os.Bundle;
import android.os.Parcelable;
import android.location.Location;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import android.util.Pair;
import java.lang.Double;
import c.t.m.g.ej;

public class ch extends cg	// class@000c0e
{
    public LruCache a;

    public void ch(String p0){
       super(p0, "check cell");
       this.a = new LruCache(100);
    }
    public void a(){
       super.a();
       this.a.evictAll();
    }
    public boolean b(Bundle p0){
       String str = p0.getString("cellkey");
       Location parcelable = p0.getParcelable("location");
       boolean b = true;
       if (parcelable == null) {
          return b;
       }
       boolean b1 = false;
       if (TextUtils.isEmpty(str)) {
          return b1;
       }
       Pair pair = this.a.get(str);
       if (pair == null) {
          this.a.put(str, Pair.create(Double.valueOf(parcelable.getLatitude()), Double.valueOf(parcelable.getLongitude())));
          return b;
       }else if(ej.a(parcelable.getLatitude(), parcelable.getLongitude(), pair.first.doubleValue(), pair.second.doubleValue()) - 0x40b7700000000000 < 0){
          b = false;
       }
       return b;
    }
}
