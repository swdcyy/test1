package com.tkruntime.v8.V8$SeqCommandRunner;
import com.tkruntime.v8.V8$CommandRunner;
import java.lang.Object;

public abstract class V8$SeqCommandRunner implements V8$CommandRunner	// class@000fad
{
    public boolean hasRef;
    public V8ObjectProxy mReceiver;
    public int seqNum;

    public void V8$SeqCommandRunner(){
       super();
       this.seqNum = -1;
       this.hasRef = false;
    }
    public boolean hasJSRef(){
       return this.hasRef;
    }
}
