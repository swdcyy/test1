package old.soloader.h$a;
import java.io.FileDescriptor;
import android.system.Os;
import java.lang.Exception;
import java.lang.String;
import android.os.Build;

public final class h$a	// class@002016
{

    public static void a(FileDescriptor p0,long p1){
       long l = 0;
       try{
          Os.posix_fallocate(p0, l, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
    public static String[] b(){
       return Build.SUPPORTED_ABIS;
    }
}
