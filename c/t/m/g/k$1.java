package c.t.m.g.k$1;
import java.util.Comparator;
import java.lang.Object;
import android.net.wifi.ScanResult;

public final class k$1 implements Comparator	// class@000c9a
{

    public void k$1(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i = (int)(((p1.timestamp / 1000) / 1000) - ((p0.timestamp / 1000) / 1000));
       if (!i) {
          i = p1.level - p0.level;
       }
       return i;
    }
}
