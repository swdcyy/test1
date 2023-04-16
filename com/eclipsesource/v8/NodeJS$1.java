package com.eclipsesource.v8.NodeJS$1;
import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.NodeJS;
import java.lang.Object;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Value;

public final class NodeJS$1 implements JavaVoidCallback	// class@000fcc
{
    public final NodeJS val$node;

    public void NodeJS$1(NodeJS p0){
       this.val$node = p0;
       super();
    }
    public void invoke(V8Object p0,V8Array p1){
       V8Function v8Function = p1.get(0);
       this.val$node.init(v8Function.twin());
       v8Function.close();
    }
}
