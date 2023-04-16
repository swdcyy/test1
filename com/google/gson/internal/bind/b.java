package com.google.gson.internal.bind.b;
import com.google.gson.stream.b;
import com.google.gson.internal.bind.b$a;
import zk.g;
import java.lang.String;
import java.io.Writer;
import java.util.ArrayList;
import zk.f;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import java.lang.IllegalStateException;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import java.io.IOException;

public final class b extends b	// class@001958
{
    public final List m;
    public String n;
    public JsonElement o;
    public static final Writer p;
    public static final g q;

    static {
       b.p = new b$a();
       b.q = new g("closed");
    }
    public void b(){
       super(b.p);
       this.m = new ArrayList();
       this.o = f.a;
    }
    public b J(double p0){
       if (!this.o() && (Double.isNaN(p0) || Double.isInfinite(p0))) {
          throw new IllegalArgumentException("JSON forbids NaN and infinities: "+p0);
       }
       this.T(new g(Double.valueOf(p0)));
       return this;
    }
    public b K(long p0){
       this.T(new g(Long.valueOf(p0)));
       return this;
    }
    public b L(Boolean p0){
       if (p0 == null) {
          this.u();
          return this;
       }else {
          this.T(new g(p0));
          return this;
       }
    }
    public b M(Number p0){
       if (p0 == null) {
          this.u();
          return this;
       }else if(!this.o()){
          double d = p0.doubleValue();
          if (Double.isNaN(d) || Double.isInfinite(d)) {
             throw new IllegalArgumentException("JSON forbids NaN and infinities: "+p0);
          }
       }
       this.T(new g(p0));
       return this;
    }
    public b O(String p0){
       if (p0 == null) {
          this.u();
          return this;
       }else {
          this.T(new g(p0));
          return this;
       }
    }
    public b P(boolean p0){
       this.T(new g(Boolean.valueOf(p0)));
       return this;
    }
    public JsonElement R(){
       if (this.m.isEmpty()) {
          return this.o;
       }
       throw new IllegalStateException("Expected one JSON element but was "+this.m);
    }
    public final JsonElement S(){
       b tm = this.m;
       return tm.get((tm.size() - 1));
    }
    public final void T(JsonElement p0){
       if (this.n != null) {
          if (!p0.D() || this.k()) {
             this.S().G(this.n, p0);
          }
          this.n = null;
       }else if(this.m.isEmpty()){
          this.o = p0;
       }else {
          JsonElement jsonElement = this.S();
          if (jsonElement instanceof JsonArray) {
             jsonElement.G(p0);
          }else {
             throw new IllegalStateException();
          }
       }
       return;
    }
    public b c(){
       JsonArray jsonArray = new JsonArray();
       this.T(jsonArray);
       this.m.add(jsonArray);
       return this;
    }
    public void close(){
       if (!this.m.isEmpty()) {
          throw new IOException("Incomplete document");
       }
       this.m.add(b.q);
       return;
    }
    public b e(){
       JsonObject jsonObject = new JsonObject();
       this.T(jsonObject);
       this.m.add(jsonObject);
       return this;
    }
    public void flush(){
    }
    public b g(){
       if (this.m.isEmpty() || this.n != null) {
          throw new IllegalStateException();
       }
       if (!this.S() instanceof JsonArray) {
          throw new IllegalStateException();
       }
       b tm = this.m;
       tm.remove((tm.size() - 1));
       return this;
    }
    public b j(){
       if (this.m.isEmpty() || this.n != null) {
          throw new IllegalStateException();
       }
       if (!this.S() instanceof JsonObject) {
          throw new IllegalStateException();
       }
       b tm = this.m;
       tm.remove((tm.size() - 1));
       return this;
    }
    public b r(String p0){
       if (this.m.isEmpty() || this.n != null) {
          throw new IllegalStateException();
       }
       if (!this.S() instanceof JsonObject) {
          throw new IllegalStateException();
       }
       this.n = p0;
       return this;
    }
    public b u(){
       this.T(f.a);
       return this;
    }
}
