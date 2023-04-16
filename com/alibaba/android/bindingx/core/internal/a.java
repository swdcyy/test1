package com.alibaba.android.bindingx.core.internal.a;
import java.lang.String;
import java.lang.Object;
import org.json.JSONTokener;
import org.json.JSONObject;
import y5.i;
import java.lang.Boolean;
import java.util.Map;
import org.json.JSONArray;
import java.util.Objects;
import java.lang.Double;
import java.lang.Math;
import com.alibaba.android.bindingx.core.internal.b;
import java.util.ArrayList;

public class a	// class@000ddf
{
    public JSONObject a;

    public void a(String p0){
       super();
       this.a = new JSONTokener(p0).nextValue();
    }
    public void a(JSONObject p0){
       super();
       this.a = p0;
    }
    public final boolean a(Object p0,Object p1){
       boolean b = true;
       if (p0 instanceof i && p1 instanceof i) {
          if (p0 != p1) {
             b = false;
          }
          return b;
       }else if(p0 instanceof String && p1 instanceof String){
          return p0.equals(p1);
       }else if(p0 instanceof Boolean && p1 instanceof Boolean){
          if (this.e(p0) != this.e(p1)) {
             b = false;
          }
          return b;
       }else if(!this.f(p0) - this.f(p1)){
          b = false;
       }
       return b;
    }
    public Object b(Map p0){
       return this.c(this.a, p0);
    }
    public final Object c(JSONObject p0,Map p1){
       String str = p0.getString("type");
       String str1 = "children";
       JSONArray jSONArray = p0.optJSONArray(str1);
       Objects.requireNonNull(str);
       int i = 0;
       int i1 = -1;
       switch (str.hashCode()){
           case 0x97ebd7b6:
             if (str.equals("CallExpression")) {
                i1 = 0;
             }
             break;
           case '!':
             if (str.equals("!")) {
                i1 = 1;
             }
             break;
           case '%':
             if (str.equals("%")) {
                i1 = 2;
             }
             break;
           case '*':
             if (str.equals("*")) {
                i1 = 3;
             }
             break;
           case '+':
             if (str.equals("+")) {
                i1 = 4;
             }
             break;
           case '-':
             if (str.equals("-")) {
                i1 = 5;
             }
             break;
           case '/':
             if (str.equals("/")) {
                i1 = 6;
             }
             break;
           case '<':
             if (str.equals("<")) {
                i1 = 7;
             }
             break;
           case '>':
             if (str.equals(">")) {
                i1 = 8;
             }
             break;
           case '?':
             if (str.equals("?")) {
                i1 = 9;
             }
             break;
           case 1084:
             if (str.equals("!=")) {
                i1 = 10;
             }
             break;
           case 1216:
             if (str.equals("&&")) {
                i1 = 11;
             }
             break;
           case 1344:
             if (str.equals("**")) {
                i1 = 12;
             }
             break;
           case 1921:
             if (str.equals("<=")) {
                i1 = 13;
             }
             break;
           case 1952:
             if (str.equals("==")) {
                i1 = 14;
             }
             break;
           case 1983:
             if (str.equals(">=")) {
                i1 = 15;
             }
             break;
           case 3968:
             if (str.equals("||")) {
                i1 = 16;
             }
             break;
           case 0x8381:
             if (str.equals("!==")) {
                i1 = 17;
             }
             break;
           case 0xec9d:
             if (str.equals("===")) {
                i1 = 18;
             }
             break;
           case 0xb465102:
             if (str.equals("NumericLiteral")) {
                i1 = 19;
             }
             break;
           case 0x165a88c9:
             if (str.equals("Identifier")) {
                i1 = 20;
             }
             break;
           case 0x400a833e:
             if (str.equals("StringLiteral")) {
                i1 = 21;
             }
             break;
           case 0x6c419b87:
             if (str.equals("BooleanLiteral")) {
                i1 = 22;
             }
             break;
           default:
       }
    label_0145 :
       str = "value";
       switch (i1){
           case 0:
             b uob = this.c(jSONArray.getJSONObject(i), p1);
             ArrayList uArrayList = new ArrayList();
             JSONArray jSONArray1 = jSONArray.getJSONObject(1).getJSONArray(str1);
             for (; i < jSONArray1.length(); i = i + 1) {
                uArrayList.add(this.c(jSONArray1.getJSONObject(i), p1));
             }
             return uob.a(uArrayList);
             break;
           case 1:
             return Boolean.valueOf((this.e(this.c(jSONArray.getJSONObject(i), p1)) ^ 1));
           case 2:
             return Double.valueOf((this.f(this.c(jSONArray.getJSONObject(i), p1)) % this.f(this.c(jSONArray.getJSONObject(1), p1))));
           case 3:
             return Double.valueOf((this.f(this.c(jSONArray.getJSONObject(i), p1)) * this.f(this.c(jSONArray.getJSONObject(1), p1))));
           case 4:
             return Double.valueOf((this.f(this.c(jSONArray.getJSONObject(i), p1)) + this.f(this.c(jSONArray.getJSONObject(1), p1))));
           case 5:
             return Double.valueOf((this.f(this.c(jSONArray.getJSONObject(i), p1)) - this.f(this.c(jSONArray.getJSONObject(1), p1))));
           case 6:
             return Double.valueOf((this.f(this.c(jSONArray.getJSONObject(i), p1)) / this.f(this.c(jSONArray.getJSONObject(1), p1))));
           case 7:
             if (this.f(this.c(jSONArray.getJSONObject(i), p1)) - this.f(this.c(jSONArray.getJSONObject(1), p1)) < 0) {
                i = true;
             }
             return Boolean.valueOf(i);
             break;
           case 8:
             if (this.f(this.c(jSONArray.getJSONObject(i), p1)) - this.f(this.c(jSONArray.getJSONObject(1), p1)) > 0) {
                i = true;
             }
             return Boolean.valueOf(i);
             break;
           case 9:
             if (this.c(jSONArray.getJSONObject(i), p1).booleanValue()) {
                return this.c(jSONArray.getJSONObject(1), p1);
             }else {
                return this.c(jSONArray.getJSONObject(2), p1);
             }
             break;
           case 10:
             return Boolean.valueOf((this.a(this.c(jSONArray.getJSONObject(i), p1), this.c(jSONArray.getJSONObject(1), p1)) ^ 1));
           case 11:
             p0 = this.c(jSONArray.getJSONObject(i), p1);
             if (!this.e(p0)) {
                return p0;
             }else {
                return this.c(jSONArray.getJSONObject(1), p1);
             }
             break;
           case 12:
             return Double.valueOf(Math.pow(this.f(this.c(jSONArray.getJSONObject(i), p1)), this.f(this.c(jSONArray.getJSONObject(1), p1))));
           case 13:
             if (this.f(this.c(jSONArray.getJSONObject(i), p1)) - this.f(this.c(jSONArray.getJSONObject(1), p1)) <= 0) {
                i = true;
             }
             return Boolean.valueOf(i);
             break;
           case 14:
             return Boolean.valueOf(this.a(this.c(jSONArray.getJSONObject(i), p1), this.c(jSONArray.getJSONObject(1), p1)));
           case 15:
             if (this.f(this.c(jSONArray.getJSONObject(i), p1)) - this.f(this.c(jSONArray.getJSONObject(1), p1)) >= 0) {
                i = true;
             }
             return Boolean.valueOf(i);
             break;
           case 16:
             p0 = this.c(jSONArray.getJSONObject(i), p1);
             if (this.e(p0)) {
                return p0;
             }
             return this.c(jSONArray.getJSONObject(1), p1);
             break;
           case 17:
             return Boolean.valueOf((this.d(this.c(jSONArray.getJSONObject(i), p1), this.c(jSONArray.getJSONObject(1), p1)) ^ 1));
           case 18:
             return Boolean.valueOf(this.d(this.c(jSONArray.getJSONObject(i), p1), this.c(jSONArray.getJSONObject(1), p1)));
           case 19:
             return Double.valueOf(p0.getDouble(str));
           case 20:
             return p1.get(p0.getString(str));
           case 21:
             return p0.getString(str);
           case 22:
             return Boolean.valueOf(p0.getBoolean(str));
           default:
             return null;
       }
    }
    public final boolean d(Object p0,Object p1){
       boolean b = false;
       if (p0 instanceof i && !p1 instanceof i) {
          return b;
       }
       if (p0 instanceof Boolean && !p1 instanceof Boolean) {
          return b;
       }
       if (p0 instanceof Double && !p1 instanceof Double) {
          return b;
       }
       if (p0 instanceof String && !p1 instanceof String) {
          return b;
       }
       if (p0 == p1) {
          b = true;
       }
       return b;
    }
    public final boolean e(Object p0){
       if (p0 instanceof String) {
          return ("").equals(p0);
       }
       if (!p0 instanceof Double) {
          return p0.booleanValue();
       }
       boolean b = (p0.doubleValue())? true: false;
       return b;
    }
    public final double f(Object p0){
       if (p0 instanceof String) {
          return Double.parseDouble(p0);
       }
       if (!p0 instanceof Boolean) {
          return p0.doubleValue();
       }
       double d = (p0.booleanValue())? 0x3ff0000000000000: 0;
       return d;
    }
}
