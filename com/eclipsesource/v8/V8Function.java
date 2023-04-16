package com.eclipsesource.v8.V8Function;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.JavaCallback;
import java.lang.Object;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;
import java.lang.String;

public class V8Function extends V8Object	// class@000fdf
{

    public void V8Function(V8 p0){
       super(p0, null);
    }
    public void V8Function(V8 p0,JavaCallback p1){
       super(p0, p1);
    }
    public Object call(V8Object p0,V8Array p1){
       V8Value tv8;
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p0);
       this.v8.checkRuntime(p1);
       if (p0 != null) {
       }else {
          tv8 = this.v8;
       }
       int i = (p1 == null)? 0: p1.getHandle();
       long l = i;
       if (p0.isUndefined()) {
          tv8 = this.v8;
       }
       V8Value tv81 = this.v8;
       return tv81.executeFunction(tv81.getV8RuntimePtr(), tv8.getHandle(), this.objectHandle, l);
    }
    public V8Value createTwin(){
       return new V8Function(this.v8);
    }
    public void initialize(long p0,Object p1){
       if (p1 == null) {
          super.initialize(p0, null);
          return;
       }else {
          long[] olongArray = this.v8.initNewV8Function(p0);
          this.v8.createAndRegisterMethodDescriptor(p1, olongArray[1]);
          this.released = false;
          this.addObjectReference(olongArray[0]);
          return;
       }
    }
    public String toString(){
       if (this.released != null || this.v8.isReleased()) {
          return "[Function released]";
       }
       return super.toString();
    }
    public V8Function twin(){
       return super.twin();
    }
    public V8Object twin(){
       return this.twin();
    }
    public V8Value twin(){
       return this.twin();
    }
}
