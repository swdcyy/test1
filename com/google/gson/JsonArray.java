package com.google.gson.JsonArray;
import java.lang.Iterable;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import zk.f;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import zk.g;
import java.lang.Number;
import java.lang.String;
import java.util.Iterator;
import java.util.Collection;
import java.lang.IllegalStateException;

public final class JsonArray extends JsonElement implements Iterable	// class@000554
{
    public final List b;

    public void JsonArray(){
       super();
       this.b = new ArrayList();
    }
    public void JsonArray(int p0){
       super();
       this.b = new ArrayList(p0);
    }
    public void G(JsonElement p0){
       f a;
       if (p0 == null) {
          a = f.a;
       }
       this.b.add(a);
       return;
    }
    public void H(Boolean p0){
       JsonArray tb = this.b;
       f a = (p0 == null)? f.a: new g(p0);
       tb.add(a);
       return;
    }
    public void N(Number p0){
       JsonArray tb = this.b;
       f a = (p0 == null)? f.a: new g(p0);
       tb.add(a);
       return;
    }
    public void a0(String p0){
       JsonArray tb = this.b;
       f a = (p0 == null)? f.a: new g(p0);
       tb.add(a);
       return;
    }
    public JsonElement b(){
       JsonArray jsonArray;
       if (!this.b.isEmpty()) {
          jsonArray = new JsonArray(this.b.size());
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             jsonArray.G(iterator.next().b());
          }
       }else {
          jsonArray = new JsonArray();
       }
       return jsonArray;
    }
    public void c0(JsonArray p0){
       this.b.addAll(p0.b);
    }
    public boolean d(){
       if (this.b.size() == 1) {
          return this.b.get(0).d();
       }
       throw new IllegalStateException();
    }
    public boolean d0(JsonElement p0){
       return this.b.contains(p0);
    }
    public JsonElement e0(int p0){
       return this.b.get(p0);
    }
    public boolean equals(Object p0){
       boolean b = (p0 == this || (p0 instanceof JsonArray && p0.b.equals(this.b)))? true: false;
       return b;
    }
    public JsonElement g0(int p0){
       return this.b.remove(p0);
    }
    public int hashCode(){
       return this.b.hashCode();
    }
    public Iterator iterator(){
       return this.b.iterator();
    }
    public byte l(){
       if (this.b.size() == 1) {
          return this.b.get(0).l();
       }
       throw new IllegalStateException();
    }
    public double m(){
       if (this.b.size() == 1) {
          return this.b.get(0).m();
       }
       throw new IllegalStateException();
    }
    public float n(){
       if (this.b.size() == 1) {
          return this.b.get(0).n();
       }
       throw new IllegalStateException();
    }
    public int p(){
       if (this.b.size() == 1) {
          return this.b.get(0).p();
       }
       throw new IllegalStateException();
    }
    public int size(){
       return this.b.size();
    }
    public long t(){
       if (this.b.size() == 1) {
          return this.b.get(0).t();
       }
       throw new IllegalStateException();
    }
    public Number u(){
       if (this.b.size() == 1) {
          return this.b.get(0).u();
       }
       throw new IllegalStateException();
    }
    public short v(){
       if (this.b.size() == 1) {
          return this.b.get(0).v();
       }
       throw new IllegalStateException();
    }
    public String w(){
       if (this.b.size() == 1) {
          return this.b.get(0).w();
       }
       throw new IllegalStateException();
    }
}
