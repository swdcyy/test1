package a96.j;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import java.lang.Boolean;
import java.lang.String;
import td.a;

public final class j implements Callback	// class@00004c
{
    public final Object[] a;

    public void j(Object[] p0){
       this.a = p0;
    }
    public final void invoke(Object[] p0){
       this.a[0] = Arguments.fromJavaArgs(p0);
    }
    public void invokeNew(Boolean p0,String[] p1){
       a.a(this, p0, p1);
    }
}
