package com.tkruntime.v8.V8Object$Undefined;
import com.tkruntime.v8.V8Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.UnsupportedOperationException;
import java.lang.Integer;
import com.tkruntime.v8.V8Value;
import java.lang.Boolean;
import com.tkruntime.v8.V8Array;
import java.lang.Number;
import com.tkruntime.v8.V8;

public class V8Object$Undefined extends V8Object	// class@000fc0
{

    public void V8Object$Undefined(){
       super();
    }
    public V8Object add(String p0,double p1){
       if (PatchProxy.isSupport(V8Object$Undefined.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, V8Object$Undefined.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,int p1){
       if (PatchProxy.isSupport(V8Object$Undefined.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, V8Object$Undefined.class, "5");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,V8Value p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Object$Undefined.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Object$Undefined.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,boolean p1){
       if (PatchProxy.isSupport(V8Object$Undefined.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, V8Object$Undefined.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object addUndefined(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public void close(){
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof V8Object && p0.isUndefined()) {
          return true;
       }
       return false;
    }
    public V8Array executeArrayFunction(String p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Object$Undefined.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public Object executeFunction(String p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Object$Undefined.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public Object executeJSFunction(String p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Object$Undefined.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Object executeObjectFunction(String p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Object$Undefined.class, "12");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public void executeVoidFunction(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, V8Object$Undefined.class, "13")) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public V8Array getArray(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "15");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException();
    }
    public double getDouble(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "16");
       if (p0 != PatchProxyResult.class) {
          return p0.doubleValue();
       }
       throw new UnsupportedOperationException();
    }
    public int getInteger(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "17");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       throw new UnsupportedOperationException();
    }
    public V8Object getObject(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "18");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8 getRuntime(){
       Object obj = PatchProxy.apply(null, this, V8Object$Undefined.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException();
    }
    public String getString(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Object$Undefined.class, "19");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
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
    public void release(){
    }
    public String toString(){
       return "undefined";
    }
}
