package aegon.chrome.net.AndroidNetworkLibrary$b;
import java.io.FileDescriptor;
import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;

public class AndroidNetworkLibrary$b	// class@000184
{
    public static final Method a;

    static {
       try{
          Class[] uClassArray = new Class[]{Integer.TYPE};
          AndroidNetworkLibrary$b.a = FileDescriptor.class.getMethod("setInt$", uClassArray);
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.SecurityException e0){
       }
       throw new RuntimeException("Unable to get FileDescriptor.setInt$", e0);
    }
    public static FileDescriptor a(int p0){
       String str = "FileDescriptor.setInt$\(\) failed";
       try{
          FileDescriptor uFileDescrip = new FileDescriptor();
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          AndroidNetworkLibrary$b.a.invoke(uFileDescrip, objArray);
          return uFileDescrip;
       }catch(java.lang.IllegalAccessException e5){
          throw new RuntimeException(str, e5);
       }catch(java.lang.reflect.InvocationTargetException e5){
          throw new RuntimeException(str, e5);
       }
    }
}
