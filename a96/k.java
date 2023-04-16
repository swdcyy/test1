package a96.k;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableNativeMap;
import java.lang.Boolean;
import java.lang.String;
import td.a;

public final class k implements Callback	// class@00004d
{
    public final Object[] a;

    public void k(Object[] p0){
       this.a = p0;
    }
    public final void invoke(Object[] p0){
       k ta = this.a;
       WritableNativeArray writableNati = Arguments.fromJavaArgs(p0);
       if (writableNati.size() > 0) {
          ta[0] = writableNati.getMap(0);
       }
       return;
    }
    public void invokeNew(Boolean p0,String[] p1){
       a.a(this, p0, p1);
    }
}
