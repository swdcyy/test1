package ig.a;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.DebuggableJavaScriptExecutor;
import java.lang.Object;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.v8.liteexecutor.V8LiteExecutor;
import java.util.TimeZone;
import java.lang.String;

public class a implements JavaScriptExecutorFactory, DebuggableJavaScriptExecutor	// class@0021e6
{
    public final String a;
    public final boolean b;
    public boolean c;

    public void a(){
       super();
       this.a = "";
       this.b = false;
       this.c = false;
    }
    public JavaScriptExecutor create(){
       return new V8LiteExecutor(TimeZone.getDefault().getID(), this.a, this.b);
    }
    public boolean getIsSampling(){
       return this.c;
    }
    public String getTraceFilePath(){
       return this.a;
    }
    public void startSamplingProfiler(){
       Object a = V8LiteExecutor.a;
       _monitor_enter(a);
       V8LiteExecutor.jniStartTracing("");
       _monitor_exit(a);
       this.c = true;
    }
    public void stopSamplingProfiler(String p0){
       p0 = V8LiteExecutor.a;
       _monitor_enter(p0);
       V8LiteExecutor.jniStopTracing();
       _monitor_exit(p0);
       this.c = false;
    }
    public String toString(){
       return "JSIExecutor+V8LiteRuntime";
    }
}
