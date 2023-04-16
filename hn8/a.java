package hn8.a;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

public class a	// class@0025b5
{

    public static int a(ReadableMap p0,String p1,String p2){
       try{
          return p0.getInt(p1);
       }catch(com.facebook.react.bridge.NoSuchKeyException e0){
          throw new JSApplicationCausedNativeException(p2);
       }
    }
}
