package c.t.m.g.em$1;
import java.util.Comparator;
import java.lang.Object;
import android.net.wifi.ScanResult;

public final class em$1 implements Comparator	// class@000c6f
{

    public void em$1(){
       super();
    }
    public int a(ScanResult p0,ScanResult p1){
       return (p1.level - p0.level);
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
