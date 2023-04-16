package com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8ResultUndefined;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.Class;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.JavaVoidCallback;
import java.lang.reflect.Method;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public class V8Object extends V8Value	// class@000fe2
{

    public void V8Object(){
       super();
    }
    public void V8Object(V8 p0){
       super(p0, null);
    }
    public void V8Object(V8 p0,Object p1){
       super(p0);
       if (p0 != null) {
          this.v8.checkThread();
          this.initialize(this.v8.getV8RuntimePtr(), p1);
       }
       return;
    }
    public V8Object add(String p0,double p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.add(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return this;
    }
    public V8Object add(String p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.add(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return this;
    }
    public V8Object add(String p0,V8Value p1){
       V8Value v8;
       V8Value v8Value = this;
       V8Value v8Value1 = p1;
       v8Value.v8.checkThread();
       this.checkReleased();
       v8Value.v8.checkRuntime(v8Value1);
       if (v8Value1 == null) {
          v8 = v8Value.v8;
          v8.addNull(v8.getV8RuntimePtr(), v8Value.objectHandle, p0);
       }else if(v8Value1.equals(V8.getUndefined())){
          v8 = v8Value.v8;
          v8.addUndefined(v8.getV8RuntimePtr(), v8Value.objectHandle, p0);
       }else {
          V8Value v81 = v8Value.v8;
          v81.addObject(v81.getV8RuntimePtr(), v8Value.objectHandle, p0, p1.getHandle());
       }
       return v8Value;
    }
    public V8Object add(String p0,String p1){
       V8Value tv8;
       this.v8.checkThread();
       this.checkReleased();
       if (p1 == null) {
          tv8 = this.v8;
          tv8.addNull(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       }else if(p1.equals(V8.getUndefined())){
          tv8 = this.v8;
          tv8.addUndefined(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       }else {
          V8Value tv81 = this.v8;
          tv81.add(tv81.getV8RuntimePtr(), this.objectHandle, p0, p1);
       }
       return this;
    }
    public V8Object add(String p0,boolean p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.add(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return this;
    }
    public V8Object addNull(String p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addNull(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       return this;
    }
    public V8Object addUndefined(String p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addUndefined(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       return this;
    }
    public final void checkKey(String p0){
       if (p0 != null) {
          return;
       }
       throw new IllegalArgumentException("Key cannot be null");
    }
    public boolean contains(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.contains(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public V8Value createTwin(){
       return new V8Object(this.v8);
    }
    public V8Array executeArrayFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       p0 = tv8.executeFunction(tv8.getV8RuntimePtr(), 5, this.objectHandle, p0, i);
       if (p0 instanceof V8Array) {
          return p0;
       }else {
          throw new V8ResultUndefined();
       }
    }
    public boolean executeBooleanFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       return tv8.executeBooleanFunction(tv8.getV8RuntimePtr(), this.getHandle(), p0, i);
    }
    public double executeDoubleFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       return tv8.executeDoubleFunction(tv8.getV8RuntimePtr(), this.getHandle(), p0, i);
    }
    public Object executeFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       return tv8.executeFunction(tv8.getV8RuntimePtr(), 0, this.objectHandle, p0, i);
    }
    public int executeIntegerFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       return tv8.executeIntegerFunction(tv8.getV8RuntimePtr(), this.getHandle(), p0, i);
    }
    public Object executeJSFunction(String p0){
       return this.executeFunction(p0, null);
    }
    public Object executeJSFunction(String p0,Object[] p1){
       object oobject;
       if (p1 == null) {
          return this.executeFunction(p0, null);
       }
       V8Array v8Array = new V8Array(this.v8.getRuntime());
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = p1[i];
             if (oobject == null) {
                v8Array.pushNull();
             }else if(oobject instanceof V8Value){
                v8Array.push(oobject);
             }else if(oobject instanceof Integer){
                v8Array.push(oobject);
             }else if(oobject instanceof Double){
                v8Array.push(oobject);
             }else if(oobject instanceof Long){
                v8Array.push(oobject.doubleValue());
             }else if(oobject instanceof Float){
                v8Array.push((double)oobject.floatValue());
             }else if(oobject instanceof Boolean){
                v8Array.push(oobject);
             }else if(oobject instanceof String){
                v8Array.push(oobject);
             }else {
                break ;
             }
             i = i + 1;
          }else {
             v8Array.close();
             return this.executeFunction(p0, v8Array);
          }
       }
       throw new IllegalArgumentException("Unsupported Object of type: "+oobject.getClass());
    }
    public V8Object executeObjectFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       p0 = tv8.executeFunction(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0, i);
       if (p0 instanceof V8Object) {
          return p0;
       }else {
          throw new V8ResultUndefined();
       }
    }
    public String executeStringFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       return tv8.executeStringFunction(tv8.getV8RuntimePtr(), this.getHandle(), p0, i);
    }
    public void executeVoidFunction(String p0,V8Array p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       int i = (p1 == null)? 0: p1.getHandle();
       V8Value tv8 = this.v8;
       tv8.executeVoidFunction(tv8.getV8RuntimePtr(), this.objectHandle, p0, i);
       return;
    }
    public Object get(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.get(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
    }
    public V8Array getArray(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       p0 = tv8.get(tv8.getV8RuntimePtr(), 5, this.objectHandle, p0);
       if (p0 == null || p0 instanceof V8Array) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public boolean getBoolean(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getBoolean(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public double getDouble(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getDouble(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public int getInteger(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getInteger(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public String[] getKeys(){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.getKeys(tv8.getV8RuntimePtr(), this.objectHandle);
    }
    public V8Object getObject(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       p0 = tv8.get(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
       if (p0 == null || p0 instanceof V8Object) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public String getString(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getString(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public int getType(String p0){
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getType(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public V8Object registerJavaMethod(JavaCallback p0,String p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.registerCallback(p0, this.getHandle(), p1);
       return this;
    }
    public V8Object registerJavaMethod(JavaVoidCallback p0,String p1){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.registerVoidCallback(p0, this.getHandle(), p1);
       return this;
    }
    public V8Object registerJavaMethod(Object p0,String p1,String p2,Class[] p3){
       return this.registerJavaMethod(p0, p1, p2, p3, false);
    }
    public V8Object registerJavaMethod(Object p0,String p1,String p2,Class[] p3,boolean p4){
       this.v8.checkThread();
       try{
          this.checkReleased();
          Method method = p0.getClass().getMethod(p1, p3);
          method.setAccessible(true);
          this.v8.registerCallback(p0, method, this.getHandle(), p2, p4);
          return this;
       }catch(java.lang.NoSuchMethodException e9){
          throw new IllegalStateException(e9);
       }catch(java.lang.SecurityException e9){
          throw new IllegalStateException(e9);
       }
    }
    public V8Object setPrototype(V8Object p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.setPrototype(tv8.getV8RuntimePtr(), this.objectHandle, p0.getHandle());
       return this;
    }
    public String toString(){
       if (this.isReleased() || this.v8.isReleased()) {
          return "[Object released]";
       }
       this.v8.checkThread();
       V8Value tv8 = this.v8;
       return tv8.toString(tv8.getV8RuntimePtr(), this.getHandle());
    }
    public V8Object twin(){
       return super.twin();
    }
    public V8Value twin(){
       return this.twin();
    }
}
