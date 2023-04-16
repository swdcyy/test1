package com.tkruntime.v8.V8$MethodRunner;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Object;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8ObjectProxy;
import java.lang.Throwable;

public class V8$MethodRunner extends V8$SeqCommandRunner	// class@000faa
{
    public Object[] args;
    public String funcName;
    public long methId;

    public void V8$MethodRunner(){
       super();
    }
    public Object exec(V8 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8$MethodRunner.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0.callVoidJavaMethod(this.methId, this.mReceiver, this.args);
       return null;
    }
}
