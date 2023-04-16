package com.eclipsesource.v8.V8Object$Undefined;
import com.eclipsesource.v8.V8Object;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import com.eclipsesource.v8.V8Value;
import java.lang.Object;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.JavaVoidCallback;
import java.lang.Class;

public class V8Object$Undefined extends V8Object	// class@000fe1
{

    public void V8Object$Undefined(){
       super();
    }
    public V8Object add(String p0,double p1){
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,int p1){
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,V8Value p1){
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,String p1){
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,boolean p1){
       throw new UnsupportedOperationException();
    }
    public V8Object addUndefined(String p0){
       throw new UnsupportedOperationException();
    }
    public void close(){
    }
    public boolean contains(String p0){
       throw new UnsupportedOperationException();
    }
    public boolean equals(Object p0){
       if (p0 instanceof V8Object && p0.isUndefined()) {
          return true;
       }
       return false;
    }
    public V8Array executeArrayFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public boolean executeBooleanFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public double executeDoubleFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public Object executeFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public int executeIntegerFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public Object executeJSFunction(String p0,Object[] p1){
       throw new UnsupportedOperationException();
    }
    public V8Object executeObjectFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public String executeStringFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public void executeVoidFunction(String p0,V8Array p1){
       throw new UnsupportedOperationException();
    }
    public V8Array getArray(String p0){
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(String p0){
       throw new UnsupportedOperationException();
    }
    public double getDouble(String p0){
       throw new UnsupportedOperationException();
    }
    public int getInteger(String p0){
       throw new UnsupportedOperationException();
    }
    public String[] getKeys(){
       throw new UnsupportedOperationException();
    }
    public V8Object getObject(String p0){
       throw new UnsupportedOperationException();
    }
    public V8 getRuntime(){
       throw new UnsupportedOperationException();
    }
    public String getString(String p0){
       throw new UnsupportedOperationException();
    }
    public int getType(String p0){
       throw new UnsupportedOperationException();
    }
    public int hashCode(){
       return 919;
    }
    public boolean isReleased(){
       return false;
    }
    public boolean isUndefined(){
       return true;
    }
    public V8Object registerJavaMethod(JavaCallback p0,String p1){
       throw new UnsupportedOperationException();
    }
    public V8Object registerJavaMethod(JavaVoidCallback p0,String p1){
       throw new UnsupportedOperationException();
    }
    public V8Object registerJavaMethod(Object p0,String p1,String p2,Class[] p3,boolean p4){
       throw new UnsupportedOperationException();
    }
    public void release(){
    }
    public V8Object setPrototype(V8Object p0){
       throw new UnsupportedOperationException();
    }
    public String toString(){
       return "undefined";
    }
    public V8Object$Undefined twin(){
       return super.twin();
    }
    public V8Object twin(){
       return this.twin();
    }
    public V8Value twin(){
       return this.twin();
    }
}
