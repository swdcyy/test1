package com.eclipsesource.v8.debug.mirror.Mirror;
import com.eclipsesource.v8.Releasable;
import com.eclipsesource.v8.V8Object;
import java.lang.Object;
import com.eclipsesource.v8.debug.mirror.ValueMirror;
import com.eclipsesource.v8.debug.mirror.NullMirror;
import com.eclipsesource.v8.debug.mirror.UndefinedMirror;
import com.eclipsesource.v8.debug.mirror.FunctionMirror;
import com.eclipsesource.v8.debug.mirror.ArrayMirror;
import com.eclipsesource.v8.debug.mirror.ObjectMirror;
import com.eclipsesource.v8.debug.mirror.StringMirror;
import com.eclipsesource.v8.debug.mirror.NumberMirror;
import com.eclipsesource.v8.debug.mirror.BooleanMirror;
import java.lang.String;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Value;

public class Mirror implements Releasable	// class@001001
{
    public V8Object v8Object;

    public void Mirror(V8Object p0){
       super();
       this.v8Object = p0.twin();
    }
    public static ValueMirror createMirror(V8Object p0){
       if (Mirror.isNull(p0)) {
          return new NullMirror(p0);
       }
       if (Mirror.isUndefined(p0)) {
          return new UndefinedMirror(p0);
       }
       if (Mirror.isFunction(p0)) {
          return new FunctionMirror(p0);
       }
       if (Mirror.isArray(p0)) {
          return new ArrayMirror(p0);
       }
       if (Mirror.isObject(p0)) {
          return new ObjectMirror(p0);
       }
       if (Mirror.isString(p0)) {
          return new StringMirror(p0);
       }
       if (Mirror.isNumber(p0)) {
          return new NumberMirror(p0);
       }
       if (Mirror.isBoolean(p0)) {
          return new BooleanMirror(p0);
       }
       return new ValueMirror(p0);
    }
    public static boolean isArray(V8Object p0){
       try{
          return p0.executeBooleanFunction("isArray", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isBoolean(V8Object p0){
       try{
          return p0.executeBooleanFunction("isBoolean", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isFunction(V8Object p0){
       try{
          return p0.executeBooleanFunction("isFunction", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isNull(V8Object p0){
       try{
          return p0.executeBooleanFunction("isNull", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isNumber(V8Object p0){
       try{
          return p0.executeBooleanFunction("isNumber", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isObject(V8Object p0){
       try{
          return p0.executeBooleanFunction("isObject", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isString(V8Object p0){
       try{
          return p0.executeBooleanFunction("isString", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isUndefined(V8Object p0){
       try{
          return p0.executeBooleanFunction("isUndefined", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public static boolean isValue(V8Object p0){
       try{
          return p0.executeBooleanFunction("isValue", null);
       }catch(com.eclipsesource.v8.V8ResultUndefined e0){
          return false;
       }
    }
    public void close(){
       Mirror tv8Object = this.v8Object;
       if (tv8Object != null && !tv8Object.isReleased()) {
          this.v8Object.close();
          this.v8Object = null;
       }
       return;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof Mirror) {
          return b;
       }
       return this.v8Object.equals(p0.v8Object);
    }
    public int hashCode(){
       return this.v8Object.hashCode();
    }
    public boolean isArray(){
       return false;
    }
    public boolean isBoolean(){
       return false;
    }
    public boolean isFrame(){
       return false;
    }
    public boolean isFunction(){
       return false;
    }
    public boolean isNull(){
       return false;
    }
    public boolean isNumber(){
       return false;
    }
    public boolean isObject(){
       return false;
    }
    public boolean isProperty(){
       return false;
    }
    public boolean isString(){
       return false;
    }
    public boolean isUndefined(){
       return this.v8Object.executeBooleanFunction("isUndefined", null);
    }
    public boolean isValue(){
       return false;
    }
    public void release(){
       this.close();
    }
    public String toString(){
       return this.v8Object.toString();
    }
}
