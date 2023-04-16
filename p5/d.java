package p5.d;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.String;
import java.util.List;
import java.util.Arrays;
import p5.e;
import java.lang.StringBuilder;

public class d	// class@0028bb
{
    public final List a;
    public e b;

    public void d(d p0){
       super();
       this.a = new ArrayList(p0.a);
       this.b = p0.b;
    }
    public void d(String[] p0){
       super();
       this.a = Arrays.asList(p0);
    }
    public d a(String p0){
       d uod = new d(this);
       uod.a.add(p0);
       return uod;
    }
    public final boolean b(){
       d ta = this.a;
       return (ta.get((ta.size() - 1))).equals("**");
    }
    public boolean c(String p0,int p1){
       boolean b = false;
       if (p1 >= this.a.size()) {
          return b;
       }
       d uod = (p1 == (this.a.size() - 1))? 1: null;
       String str = this.a.get(p1);
       if (!str.equals("**")) {
          int i = (str.equals(p0) || str.equals("*"))? 1: 0;
          if (uod || (p1 == (this.a.size() - 2) && (this.b() && i))) {
             b = true;
          }
       label_004e :
          return b;
       }else if(uod == null && (this.a.get((p1 + 1))).equals(p0)){
          str = 1;
       }else {
          str = 0;
       }
       if (str) {
          if (p1 == (this.a.size() - 2) || (p1 == (this.a.size() - 3) && this.b())) {
             b = true;
          }
          return b;
       }else if(uod != null){
          return 1;
       }else {
          p1 = p1 + 1;
          if (p1 < (this.a.size() - 1)) {
             return b;
          }else {
             return (this.a.get(p1)).equals(p0);
          }
       }
    }
    public e d(){
       return this.b;
    }
    public int e(String p0,int p1){
       if (this.f(p0)) {
          return 0;
       }
       if (!(this.a.get(p1)).equals("**")) {
          return 1;
       }
       if (p1 == (this.a.size() - 1)) {
          return 0;
       }
       if ((this.a.get((p1 + 1))).equals(p0)) {
          return 2;
       }
       return 0;
    }
    public final boolean f(String p0){
       return ("__container").equals(p0);
    }
    public boolean g(String p0,int p1){
       if (this.f(p0)) {
          return true;
       }
       if (p1 >= this.a.size()) {
          return false;
       }
       if (!(this.a.get(p1)).equals(p0) && ((this.a.get(p1)).equals("**") || (this.a.get(p1)).equals("*"))) {
          return true;
       }
       return false;
    }
    public boolean h(String p0,int p1){
       boolean b = true;
       if (("__container").equals(p0)) {
          return b;
       }
       if (p1 >= (this.a.size() - b) && !(this.a.get(p1)).equals("**")) {
          b = false;
       }
       return b;
    }
    public d i(e p0){
       d uod = new d(this);
       uod.b = p0;
       return uod;
    }
    public String toString(){
       StringBuilder str = "KeyPath{keys="+this.a+",resolved=";
       boolean b = (this.b != null)? true: false;
       return str+b+'}';
    }
}
