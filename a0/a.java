package a0.a;
import android.content.Context;
import java.lang.String;

public class a	// class@000007
{
    public static final boolean a;

    public static int a(Context p0,String p1,int p2,int p3){
       try{
          return p0.checkPermission(p1, p2, p3);
       }catch(java.lang.RuntimeException e0){
          return -1;
       }
    }
}
