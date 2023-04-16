package com.eclipsesource.v8.debug.mirror.PropertiesArray;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Array;
import java.lang.Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.debug.mirror.PropertyMirror;
import com.eclipsesource.v8.V8Object;

public class PropertiesArray implements Releasable	// class@001006
{
    public V8Array v8Array;

    public void PropertiesArray(V8Array p0){
       super();
       this.v8Array = p0.twin();
    }
    public void close(){
       if (!this.v8Array.isReleased()) {
          this.v8Array.close();
       }
       return;
    }
    public PropertyMirror getProperty(int p0){
       V8Object object = this.v8Array.getObject(p0);
       object.close();
       return new PropertyMirror(object);
    }
    public int length(){
       return this.v8Array.length();
    }
    public void release(){
       this.close();
    }
}
