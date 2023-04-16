package com.tkruntime.v8.V8$RTMethodRunner;
import com.tkruntime.v8.V8$MethodRunner;
import com.tkruntime.v8.V8;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8Object;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8ObjectProxy;
import java.lang.Throwable;

public class V8$RTMethodRunner extends V8$MethodRunner	// class@000fac
{

    public void V8$RTMethodRunner(){
       super();
    }
    public Object exec(V8 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8$RTMethodRunner.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.callObjectJavaMethod(this.methId, this.mReceiver, this.args);
    }
}
