package ekd.j0;
import android.content.Intent;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.os.Parcelable;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class j0	// class@000d53
{

    public static boolean a(Intent p0,String p1,boolean p2){
       try{
          return p0.getBooleanExtra(p1, p2);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when getBooleanExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return p2;
       }
    }
    public static int b(Intent p0,String p1,int p2){
       try{
          return p0.getIntExtra(p1, p2);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when getIntExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return p2;
       }
    }
    public static long c(Intent p0,String p1,long p2){
       try{
          return p0.getLongExtra(p1, p2);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when getLongExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return p2;
       }
    }
    public static Parcelable d(Intent p0,String p1){
       try{
          return p0.getParcelableExtra(p1);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when getParcelableExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return null;
       }
    }
    public static Serializable e(Intent p0,String p1){
       try{
          return SerializableHook.getSerializableExtra(p0, p1);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when getSerializableExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return null;
       }
    }
    public static String f(Intent p0,String p1){
       try{
          return p0.getStringExtra(p1);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when getStringExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return null;
       }
    }
    public static boolean g(Intent p0,String p1){
       try{
          return p0.hasExtra(p1);
       }catch(java.lang.RuntimeException e0){
          e0.printStackTrace();
          Log.e("IntentUtils", "throw exception when hasExtra£¬with intent.getExtras\(\) = "+p0.getExtras()+" ,name: "+p1, e0);
          return false;
       }
    }
}
