package com.kwai.performance.stability.crash.monitor.anr.config.BaseGsonAdapter;
import zk.i;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonArray;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;
import java.lang.Byte;
import java.lang.Short;
import java.lang.RuntimeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public abstract class BaseGsonAdapter implements i, b	// class@000e0c
{

    public void BaseGsonAdapter(){
       super();
    }
    public JsonArray a(int[] p0){
       JsonArray jsonArray = new JsonArray();
       if (p0 == null) {
          return jsonArray;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          jsonArray.N(Integer.valueOf(p0[i]));
       }
       return jsonArray;
    }
    public JsonArray b(List p0){
       if (p0 == null) {
          return null;
       }
       String[] stringArray = new String[0];
       return this.c(p0.toArray(stringArray));
    }
    public JsonArray c(String[] p0){
       JsonArray jsonArray = new JsonArray();
       if (p0 == null) {
          return jsonArray;
       }
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          jsonArray.a0(p0[i]);
       }
       return jsonArray;
    }
    public Object d(JsonElement p0,Class p1){
       if (p1 == Integer.class) {
          return Integer.valueOf(p0.p());
       }
       if (p1 == Long.class) {
          return Long.valueOf(p0.t());
       }
       if (p1 == Boolean.class) {
          return Boolean.valueOf(p0.d());
       }
       if (p1 == Float.class) {
          return Float.valueOf(p0.n());
       }
       if (p1 == Double.class) {
          return Double.valueOf(p0.m());
       }
       if (p1 == Byte.class) {
          return Byte.valueOf(p0.l());
       }
       if (p1 == Short.class) {
          return Short.valueOf(p0.v());
       }
       if (p1 == String.class) {
          return p0.w();
       }
       return null;
    }
    public Object e(JsonElement p0,Object p1){
       if (p0 == null) {
          return p1;
       }
       if (p1 == null) {
          throw new RuntimeException("Default value can\'t be null");
       }
       p0 = this.d(p0, p1.getClass());
       if (p0 == null) {
          return p1;
       }
       return p0;
    }
    public int[] f(JsonElement p0,int[] p1){
       if (p0 == null) {
          return p1;
       }
       JsonArray jsonArray = p0.q();
       p1 = new int[jsonArray.size()];
       for (int i = 0; i < jsonArray.size(); i = i + 1) {
          p1[i] = jsonArray.e0(i).p();
       }
       return p1;
    }
    public String[] g(JsonElement p0,String[] p1){
       if (p0 == null) {
          return p1;
       }
       JsonArray jsonArray = p0.q();
       p1 = new String[jsonArray.size()];
       for (int i = 0; i < jsonArray.size(); i = i + 1) {
          p1[i] = jsonArray.e0(i).w();
       }
       return p1;
    }
    public List h(JsonElement p0,List p1){
       String[] stringArray = this.g(p0, null);
       if (stringArray == null) {
          return p1;
       }
       return new ArrayList(Arrays.asList(stringArray));
    }
}
