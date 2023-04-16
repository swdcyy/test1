package mc.a;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.DebuggableJavaScriptExecutor;
import mc.b;
import java.lang.Object;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import java.lang.String;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import java.io.File;
import java.lang.UnsupportedOperationException;

public class a implements JavaScriptExecutorFactory, DebuggableJavaScriptExecutor	// class@0025c0
{
    public final b a;
    public boolean b;
    public String c;

    public void a(){
       super(null);
    }
    public void a(b p0){
       super();
       this.b = false;
       this.c = "";
       this.a = p0;
    }
    public JavaScriptExecutor create(){
       return new HermesExecutor(this.a);
    }
    public boolean getIsSampling(){
       return this.b;
    }
    public String getTraceFilePath(){
       return this.c;
    }
    public void startSamplingProfiler(){
       HermesSamplingProfiler.enable();
       this.b = true;
    }
    public void stopSamplingProfiler(String p0){
       try{
          new File(p0).createNewFile();
          HermesSamplingProfiler.dumpSampledTraceToFile(p0);
          HermesSamplingProfiler.disable();
          this.b = false;
          this.c = p0;
          return;
       }catch(java.io.IOException e0){
          throw new UnsupportedOperationException();
       }
    }
    public String toString(){
       return "JSIExecutor+HermesRuntime";
    }
}
