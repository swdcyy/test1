package com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.V8ResultUndefined;
import java.lang.IndexOutOfBoundsException;
import java.lang.String;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;

public class V8Array extends V8Object	// class@000fdc
{

    public void V8Array(){
       super();
    }
    public void V8Array(V8 p0){
       super(p0);
       p0.checkThread();
    }
    public void V8Array(V8 p0,Object p1){
       super(p0, p1);
    }
    public V8Value createTwin(){
       return new V8Array(this.v8);
    }
    public Object get(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGet(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
    }
    public V8Array getArray(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       Object obj = tv8.arrayGet(tv8.getV8RuntimePtr(), 5, this.objectHandle, p0);
       if (obj == null || obj instanceof V8Array) {
          return obj;
       }
       throw new V8ResultUndefined();
    }
    public boolean getBoolean(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetBoolean(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getBooleans(int p0,int p1,boolean[] p2){
       this.v8.checkThread();
       this.checkReleased();
       if (p1 > p2.length) {
          throw new IndexOutOfBoundsException();
       }
       V8Value tv8 = this.v8;
       return tv8.arrayGetBooleans(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1, p2);
    }
    public boolean[] getBooleans(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetBooleans(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1);
    }
    public byte getByte(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetByte(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getBytes(int p0,int p1,byte[] p2){
       this.v8.checkThread();
       this.checkReleased();
       if (p1 > p2.length) {
          throw new IndexOutOfBoundsException();
       }
       V8Value tv8 = this.v8;
       return tv8.arrayGetBytes(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1, p2);
    }
    public byte[] getBytes(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetBytes(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1);
    }
    public double getDouble(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetDouble(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getDoubles(int p0,int p1,double[] p2){
       this.v8.checkThread();
       this.checkReleased();
       if (p1 > p2.length) {
          throw new IndexOutOfBoundsException();
       }
       V8Value tv8 = this.v8;
       return tv8.arrayGetDoubles(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1, p2);
    }
    public double[] getDoubles(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetDoubles(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1);
    }
    public int getInteger(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetInteger(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getIntegers(int p0,int p1,int[] p2){
       this.v8.checkThread();
       this.checkReleased();
       if (p1 > p2.length) {
          throw new IndexOutOfBoundsException();
       }
       V8Value tv8 = this.v8;
       return tv8.arrayGetIntegers(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1, p2);
    }
    public int[] getIntegers(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetIntegers(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1);
    }
    public V8Object getObject(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       Object obj = tv8.arrayGet(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
       if (obj == null || obj instanceof V8Object) {
          return obj;
       }
       throw new V8ResultUndefined();
    }
    public String getString(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetString(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getStrings(int p0,int p1,String[] p2){
       this.v8.checkThread();
       this.checkReleased();
       if (p1 > p2.length) {
          throw new IndexOutOfBoundsException();
       }
       V8Value tv8 = this.v8;
       return tv8.arrayGetStrings(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1, p2);
    }
    public String[] getStrings(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetStrings(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1);
    }
    public int getType(){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.getArrayType(tv8.getV8RuntimePtr(), this.getHandle());
    }
    public int getType(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.getType(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getType(int p0,int p1){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.getType(tv8.getV8RuntimePtr(), this.getHandle(), p0, p1);
    }
    public void initialize(long p0,Object p1){
       this.released = false;
       this.addObjectReference(this.v8.initNewV8Array(p0));
    }
    public int length(){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetSize(tv8.getV8RuntimePtr(), this.getHandle());
    }
    public V8Array push(double p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       return this;
    }
    public V8Array push(int p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayIntItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       return this;
    }
    public V8Array push(V8Value p0){
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p0);
       if (p0 == null) {
          p0 = this.v8;
          p0.addArrayNullItem(p0.getV8RuntimePtr(), this.getHandle());
       }else if(p0.equals(V8.getUndefined())){
          p0 = this.v8;
          p0.addArrayUndefinedItem(p0.getV8RuntimePtr(), this.getHandle());
       }else {
          V8Value tv8 = this.v8;
          tv8.addArrayObjectItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.getHandle());
       }
       return this;
    }
    public V8Array push(Object p0){
       V8Value tv8;
       this.v8.checkThread();
       this.checkReleased();
       if (p0 instanceof V8Value) {
          this.v8.checkRuntime(p0);
       }
       if (p0 == null) {
          p0 = this.v8;
          p0.addArrayNullItem(p0.getV8RuntimePtr(), this.getHandle());
       }else if(p0.equals(V8.getUndefined())){
          p0 = this.v8;
          p0.addArrayUndefinedItem(p0.getV8RuntimePtr(), this.getHandle());
       }else if(p0 instanceof Double){
          tv8 = this.v8;
          tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.doubleValue());
       }else if(p0 instanceof Integer){
          tv8 = this.v8;
          tv8.addArrayIntItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.intValue());
       }else if(p0 instanceof Float){
          tv8 = this.v8;
          tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.doubleValue());
       }else if(p0 instanceof Number){
          tv8 = this.v8;
          tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.doubleValue());
       }else if(p0 instanceof Boolean){
          tv8 = this.v8;
          tv8.addArrayBooleanItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.booleanValue());
       }else if(p0 instanceof String){
          tv8 = this.v8;
          tv8.addArrayStringItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       }else if(p0 instanceof V8Value){
          tv8 = this.v8;
          tv8.addArrayObjectItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.getHandle());
       }else {
          throw new IllegalArgumentException();
       }
       return this;
    }
    public V8Array push(String p0){
       V8Value tv8;
       this.v8.checkThread();
       this.checkReleased();
       if (p0 == null) {
          tv8 = this.v8;
          tv8.addArrayNullItem(tv8.getV8RuntimePtr(), this.getHandle());
       }else if(p0.equals(V8.getUndefined())){
          tv8 = this.v8;
          tv8.addArrayUndefinedItem(tv8.getV8RuntimePtr(), this.getHandle());
       }else {
          V8Value tv81 = this.v8;
          tv81.addArrayStringItem(tv81.getV8RuntimePtr(), this.getHandle(), p0);
       }
       return this;
    }
    public V8Array push(boolean p0){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayBooleanItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       return this;
    }
    public V8Array pushNull(){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayNullItem(tv8.getV8RuntimePtr(), this.getHandle());
       return this;
    }
    public V8Array pushUndefined(){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayUndefinedItem(tv8.getV8RuntimePtr(), this.getHandle());
       return this;
    }
    public String toString(){
       if (this.released != null || this.v8.isReleased()) {
          return "[Array released]";
       }
       return super.toString();
    }
    public V8Array twin(){
       return super.twin();
    }
    public V8Object twin(){
       return this.twin();
    }
    public V8Value twin(){
       return this.twin();
    }
}
