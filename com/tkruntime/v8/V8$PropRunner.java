package com.tkruntime.v8.V8$PropRunner;
import com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8ObjectProxy;

public class V8$PropRunner extends V8$SeqCommandRunner	// class@000fab
{
    public boolean isGetter;
    public String key;
    public Object value;

    public void V8$PropRunner(){
       super();
       this.isGetter = false;
    }
    public Object exec(V8 p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8$PropRunner.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.mReceiver.onPropCall(this.isGetter, this.key, this.value);
    }
}
