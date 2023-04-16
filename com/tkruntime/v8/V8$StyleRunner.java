package com.tkruntime.v8.V8$StyleRunner;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8ObjectProxy;

public class V8$StyleRunner extends V8$SeqCommandRunner	// class@000faf
{
    public HashMap style;

    public void V8$StyleRunner(){
       super();
    }
    public Object exec(V8 p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8$StyleRunner.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.mReceiver.onPropCall(false, "style", this.style);
    }
}
