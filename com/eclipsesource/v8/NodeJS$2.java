package com.eclipsesource.v8.NodeJS$2;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.NodeJS;
import java.io.File;
import java.lang.Object;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8;
import java.lang.String;
import com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Value;

public class NodeJS$2 implements JavaCallback	// class@000fcd
{
    public final NodeJS this$0;
    public final File val$file;

    public void NodeJS$2(NodeJS p0,File p1){
       this.this$0 = p0;
       this.val$file = p1;
       super();
    }
    public Object invoke(V8Object p0,V8Array p1){
       V8Array v8Array = new V8Array(this.this$0.v8);
       v8Array.push(this.val$file.getAbsolutePath());
       v8Array.close();
       return this.this$0.require.call(null, v8Array);
    }
}
