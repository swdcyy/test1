package com.eclipsesource.v8.V8Array$Undefined;
import com.eclipsesource.v8.V8Array;
import java.lang.String;
import com.eclipsesource.v8.V8Object;
import java.lang.UnsupportedOperationException;
import com.eclipsesource.v8.V8Value;
import java.lang.Object;
import com.eclipsesource.v8.V8;
import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.JavaVoidCallback;
import java.lang.Class;

public class V8Array$Undefined extends V8Array	// class@000fdb
{

    public void V8Array$Undefined(){
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
    public int executeIntegerFunction(String p0,V8Array p1){
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
    public Object get(int p0){
       throw new UnsupportedOperationException();
    }
    public V8Array getArray(int p0){
       throw new UnsupportedOperationException();
    }
    public V8Array getArray(String p0){
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(int p0){
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(String p0){
       throw new UnsupportedOperationException();
    }
    public int getBooleans(int p0,int p1,boolean[] p2){
       throw new UnsupportedOperationException();
    }
    public boolean[] getBooleans(int p0,int p1){
       throw new UnsupportedOperationException();
    }
    public byte getByte(int p0){
       throw new UnsupportedOperationException();
    }
    public int getBytes(int p0,int p1,byte[] p2){
       throw new UnsupportedOperationException();
    }
    public byte[] getBytes(int p0,int p1){
       throw new UnsupportedOperationException();
    }
    public double getDouble(int p0){
       throw new UnsupportedOperationException();
    }
    public double getDouble(String p0){
       throw new UnsupportedOperationException();
    }
    public int getDoubles(int p0,int p1,double[] p2){
       throw new UnsupportedOperationException();
    }
    public double[] getDoubles(int p0,int p1){
       throw new UnsupportedOperationException();
    }
    public int getInteger(int p0){
       throw new UnsupportedOperationException();
    }
    public int getInteger(String p0){
       throw new UnsupportedOperationException();
    }
    public int getIntegers(int p0,int p1,int[] p2){
       throw new UnsupportedOperationException();
    }
    public int[] getIntegers(int p0,int p1){
       throw new UnsupportedOperationException();
    }
    public String[] getKeys(){
       throw new UnsupportedOperationException();
    }
    public V8Object getObject(int p0){
       throw new UnsupportedOperationException();
    }
    public V8Object getObject(String p0){
       throw new UnsupportedOperationException();
    }
    public V8 getRuntime(){
       throw new UnsupportedOperationException();
    }
    public String getString(int p0){
       throw new UnsupportedOperationException();
    }
    public String getString(String p0){
       throw new UnsupportedOperationException();
    }
    public int getStrings(int p0,int p1,String[] p2){
       throw new UnsupportedOperationException();
    }
    public String[] getStrings(int p0,int p1){
       throw new UnsupportedOperationException();
    }
    public int getType(){
       throw new UnsupportedOperationException();
    }
    public int getType(int p0){
       throw new UnsupportedOperationException();
    }
    public int getType(int p0,int p1){
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
    public int length(){
       throw new UnsupportedOperationException();
    }
    public V8Array push(double p0){
       throw new UnsupportedOperationException();
    }
    public V8Array push(int p0){
       throw new UnsupportedOperationException();
    }
    public V8Array push(V8Value p0){
       throw new UnsupportedOperationException();
    }
    public V8Array push(String p0){
       throw new UnsupportedOperationException();
    }
    public V8Array push(boolean p0){
       throw new UnsupportedOperationException();
    }
    public V8Array pushUndefined(){
       throw new UnsupportedOperationException();
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
    public V8Array$Undefined twin(){
       return super.twin();
    }
    public V8Array twin(){
       return this.twin();
    }
    public V8Object twin(){
       return this.twin();
    }
    public V8Value twin(){
       return this.twin();
    }
}
