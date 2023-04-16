package com.tkruntime.v8.V8Array$Undefined;
import com.tkruntime.v8.V8Array;
import java.lang.String;
import com.tkruntime.v8.V8Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.UnsupportedOperationException;
import java.lang.Integer;
import com.tkruntime.v8.V8Value;
import java.lang.Boolean;
import java.lang.Number;
import com.tkruntime.v8.V8;

public class V8Array$Undefined extends V8Array	// class@000fb1
{

    public void V8Array$Undefined(){
       super();
    }
    public V8Object add(String p0,double p1){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, V8Array$Undefined.class, "4");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,int p1){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, V8Array$Undefined.class, "5");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,V8Value p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Array$Undefined.class, "7");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Array$Undefined.class, "6");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Object add(String p0,boolean p1){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, V8Array$Undefined.class, "3");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object addUndefined(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public void close(){
    }
    public boolean contains(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "9");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof V8Object && p0.isUndefined()) {
          return true;
       }
       return false;
    }
    public V8Array executeArrayFunction(String p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Array$Undefined.class, "10");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Object executeObjectFunction(String p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8Array$Undefined.class, "11");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public void executeVoidFunction(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, V8Array$Undefined.class, "12")) {
          return;
       }
       throw new UnsupportedOperationException();
    }
    public Object get(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Array getArray(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Array getArray(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "13");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       throw new UnsupportedOperationException();
    }
    public boolean getBoolean(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "14");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       throw new UnsupportedOperationException();
    }
    public double getDouble(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "15");
       if (p0 != PatchProxyResult.class) {
          return p0.doubleValue();
       }
       throw new UnsupportedOperationException();
    }
    public int getInteger(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       throw new UnsupportedOperationException();
    }
    public int getInteger(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "16");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       throw new UnsupportedOperationException();
    }
    public V8Object getObject(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Object getObject(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "17");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8 getRuntime(){
       Object obj = PatchProxy.apply(null, this, V8Array$Undefined.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException();
    }
    public String getString(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public String getString(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "18");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public int getType(){
       Object obj = PatchProxy.apply(null, this, V8Array$Undefined.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
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
    public int length(){
       Object obj = PatchProxy.apply(null, this, V8Array$Undefined.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       throw new UnsupportedOperationException();
    }
    public V8Array push(double p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, V8Array$Undefined.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Array push(int p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array$Undefined.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Array push(V8Value p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "31");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Array push(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, V8Array$Undefined.class, "30");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new UnsupportedOperationException();
    }
    public V8Array push(boolean p0){
       if (PatchProxy.isSupport(V8Array$Undefined.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, V8Array$Undefined.class, "27");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       throw new UnsupportedOperationException();
    }
    public V8Array pushUndefined(){
       Object obj = PatchProxy.apply(null, this, V8Array$Undefined.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new UnsupportedOperationException();
    }
    public void release(){
    }
    public String toString(){
       return "undefined";
    }
}
