package jg.a;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.DebuggableJavaScriptExecutor;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.v8.reactexecutor.V8Executor;
import java.util.TimeZone;

public class a implements JavaScriptExecutorFactory, DebuggableJavaScriptExecutor	// class@002414
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
    public void a(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
       if (p1) {
          this.c = true;
       }
       return;
    }
    public JavaScriptExecutor create(){
       return new V8Executor(TimeZone.getDefault().getID(), this.a, this.b);
    }
    public boolean getIsSampling(){
       return this.c;
    }
    public String getTraceFilePath(){
       return this.a;
    }
    public void startSamplingProfiler(){
       Object a = V8Executor.a;
       _monitor_enter(a);
       V8Executor.jniStartTracing("");
       _monitor_exit(a);
       this.c = true;
    }
    public void stopSamplingProfiler(String p0){
       p0 = V8Executor.a;
       _monitor_enter(p0);
       V8Executor.jniStopTracing();
       _monitor_exit(p0);
       this.c = false;
    }
    public String toString(){
       return "JSIExecutor+V8Runtime";
    }
}
