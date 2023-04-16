package c7.a;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;

public class a	// class@000ce3
{
    public final String key;
    public final String tid;
    public final long time;

    public void a(String p0,String p1,long p2){
       super();
       this.tid = p0;
       this.key = p1;
       this.time = p2;
    }
    public static boolean isEmpty(a p0){
       boolean b = (p0 == null || TextUtils.isEmpty(p0.tid))? true: false;
       return b;
    }
    public String getTid(){
       return this.tid;
    }
    public String getTidSeed(){
       return this.key;
    }
    public long getTimestamp(){
       return this.time;
    }
}
