package com.google.gson.internal.bind.a;
import com.google.gson.stream.a;
import com.google.gson.internal.bind.a$a;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.io.Reader;
import java.lang.String;
import java.lang.StringBuilder;
import com.google.gson.stream.JsonToken;
import java.lang.IllegalStateException;
import zk.g;
import java.util.Iterator;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.lang.AssertionError;
import zk.f;
import java.util.Arrays;
import java.util.Set;
import java.lang.Class;
import java.lang.Double;
import java.lang.NumberFormatException;
import java.util.Map$Entry;

public final class a extends a	// class@0005b3
{
    public Object[] r;
    public int s;
    public String[] t;
    public int[] u;
    public static final Reader v;
    public static final Object w;

    static {
       a.v = new a$a();
       a.w = new Object();
    }
    public void a(JsonElement p0){
       super(a.v);
       Object[] objArray = new Object[32];
       this.r = objArray;
       this.s = 0;
       String[] stringArray = new String[32];
       this.t = stringArray;
       int[] ointArray = new int[32];
       this.u = ointArray;
       this.V(p0);
    }
    private String r(){
       return " at path "+this.getPath();
    }
    public void A(){
       this.S(JsonToken.NULL);
       this.U();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return;
    }
    public String E(){
       JsonToken jsonToken = this.J();
       JsonToken sTRING = JsonToken.STRING;
       if (jsonToken != sTRING && jsonToken != JsonToken.NUMBER) {
          throw new IllegalStateException("Expected "+sTRING+" but was "+jsonToken+this.r());
       }
       String str = this.U().w();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return str;
    }
    public JsonToken J(){
       if (this.s == null) {
          return JsonToken.END_DOCUMENT;
       }
       JsonToken obj = this.T();
       if (obj instanceof Iterator) {
          v1 = this.r[(this.s - 2)] instanceof JsonObject;
          if (obj.hasNext()) {
             if (v1) {
                return JsonToken.NAME;
             }else {
                this.V(obj.next());
                return this.J();
             }
          }else if(v1){
             obj = JsonToken.END_OBJECT;
          }else {
             obj = JsonToken.END_ARRAY;
          }
          return obj;
       }else if(obj instanceof JsonObject){
          return JsonToken.BEGIN_OBJECT;
       }else if(obj instanceof JsonArray){
          return JsonToken.BEGIN_ARRAY;
       }else if(obj instanceof g){
          if (obj.a0()) {
             return JsonToken.STRING;
          }
          if (obj.G()) {
             return JsonToken.BOOLEAN;
          }
          if (obj.N()) {
             return JsonToken.NUMBER;
          }
          throw new AssertionError();
       }else if(obj instanceof f){
          return JsonToken.NULL;
       }else if(obj == a.w){
          throw new IllegalStateException("JsonReader is closed");
       }else {
          throw new AssertionError();
       }
    }
    public void Q(){
       a ts;
       String str = "null";
       if (this.J() == JsonToken.NAME) {
          this.y();
          this.t[(this.s - 2)] = str;
       }else {
          this.U();
          ts = this.s;
          if (ts > null) {
             this.t[(ts - 1)] = str;
          }
       }
       ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return;
    }
    public final void S(JsonToken p0){
       if (this.J() == p0) {
          return;
       }
       throw new IllegalStateException("Expected "+p0+" but was "+this.J()+this.r());
    }
    public final Object T(){
       return this.r[(this.s - 1)];
    }
    public final Object U(){
       a tr = this.r;
       int i = this.s - 1;
       this.s = i;
       object oobject = tr[i];
       tr[i] = null;
       return oobject;
    }
    public final void V(Object p0){
       a ts = this.s;
       a tr = this.r;
       if (ts == tr.length) {
          int i = ts * 2;
          this.r = Arrays.copyOf(tr, i);
          this.u = Arrays.copyOf(this.u, i);
          this.t = Arrays.copyOf(this.t, i);
       }
       tr = this.s;
       this.s = tr + 1;
       this.r[tr] = p0;
       return;
    }
    public void a(){
       this.S(JsonToken.BEGIN_ARRAY);
       this.V(this.T().iterator());
       this.u[(this.s - 1)] = 0;
    }
    public void c(){
       this.S(JsonToken.BEGIN_OBJECT);
       this.V(this.T().entrySet().iterator());
    }
    public void close(){
       Object[] objArray = new Object[]{a.w};
       this.r = objArray;
       this.s = 1;
    }
    public void g(){
       this.S(JsonToken.END_ARRAY);
       this.U();
       this.U();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return;
    }
    public String getPath(){
       StringBuilder str = '$';
       int i = 0;
       while (i < this.s) {
          a tr = this.r;
          if (tr[i] instanceof JsonArray) {
             i = i + 1;
             if (tr[i] instanceof Iterator) {
                str = str+'['+this.u[i]+']';
             }
          }else if(tr[i] instanceof JsonObject){
             i = i + 1;
             if (tr[i] instanceof Iterator) {
                str = str+'.';
                tr = this.t;
                if (tr[i] != null) {
                   str = str+tr[i];
                }
             }
          }
          i = i + 1;
       }
       return str;
    }
    public void j(){
       this.S(JsonToken.END_OBJECT);
       this.U();
       this.U();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return;
    }
    public boolean l(){
       JsonToken jsonToken = this.J();
       boolean b = (jsonToken != JsonToken.END_OBJECT && jsonToken != JsonToken.END_ARRAY)? true: false;
       return b;
    }
    public boolean s(){
       this.S(JsonToken.BOOLEAN);
       boolean b = this.U().d();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return b;
    }
    public String toString(){
       return a.class.getSimpleName();
    }
    public double u(){
       JsonToken jsonToken = this.J();
       JsonToken nUMBER = JsonToken.NUMBER;
       if (jsonToken != nUMBER && jsonToken != JsonToken.STRING) {
          throw new IllegalStateException("Expected "+nUMBER+" but was "+jsonToken+this.r());
       }
       double d = this.T().m();
       if (!this.o() && (Double.isNaN(d) || Double.isInfinite(d))) {
          throw new NumberFormatException("JSON forbids NaN and infinities: "+d);
       }
       this.U();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return d;
    }
    public int v(){
       JsonToken jsonToken = this.J();
       JsonToken nUMBER = JsonToken.NUMBER;
       if (jsonToken != nUMBER && jsonToken != JsonToken.STRING) {
          throw new IllegalStateException("Expected "+nUMBER+" but was "+jsonToken+this.r());
       }
       int i = this.T().p();
       this.U();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i1 = ts - 1;
          tu[i1] = tu[i1] + 1;
       }
       return i;
    }
    public long x(){
       JsonToken jsonToken = this.J();
       JsonToken nUMBER = JsonToken.NUMBER;
       if (jsonToken != nUMBER && jsonToken != JsonToken.STRING) {
          throw new IllegalStateException("Expected "+nUMBER+" but was "+jsonToken+this.r());
       }
       long l = this.T().t();
       this.U();
       a ts = this.s;
       if (ts > null) {
          a tu = this.u;
          int i = ts - 1;
          tu[i] = tu[i] + 1;
       }
       return l;
    }
    public String y(){
       this.S(JsonToken.NAME);
       Map$Entry uEntry = this.T().next();
       String key = uEntry.getKey();
       this.t[(this.s - 1)] = key;
       this.V(uEntry.getValue());
       return key;
    }
}
