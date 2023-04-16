package com.tkruntime.v8.V8ExternalObject;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8;
import java.lang.Object;

public class V8ExternalObject extends V8Object	// class@000fb4
{
    public Object mExternal;

    public void V8ExternalObject(V8 p0,Object p1){
       super(p0);
       this.mExternal = null;
       this.mExternal = p1;
    }
    public Object getExternalObject(){
       return this.mExternal;
    }
}
