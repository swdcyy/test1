package com.cmic.sso.sdk.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.cmic.sso.sdk.d.a;
import com.cmic.sso.sdk.a.a;
import java.lang.String;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Boolean;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.a.a$a;

public class a	// class@000f24
{
    public ConcurrentHashMap a;

    public void a(int p0){
       super();
       this.a = new ConcurrentHashMap(p0);
    }
    public a a(){
       a uoa = this.a.get("logBean");
       if (uoa != null) {
          return uoa;
       }
       return new a();
    }
    public void a(a p0){
       if (p0 != null) {
          this.a.put("current_config", p0);
       }
       return;
    }
    public void a(a p0){
       if (p0 != null) {
          this.a.put("logBean", p0);
       }
       return;
    }
    public void a(String p0,int p1){
       if (p0 != null) {
          this.a.put(p0, Integer.valueOf(p1));
       }
       return;
    }
    public void a(String p0,long p1){
       if (p0 != null) {
          this.a.put(p0, Long.valueOf(p1));
       }
       return;
    }
    public void a(String p0,String p1){
       if (p0 != null && p1 != null) {
          this.a.put(p0, p1);
       }
       return;
    }
    public void a(String p0,boolean p1){
       if (p0 != null) {
          this.a.put(p0, Boolean.valueOf(p1));
       }
       return;
    }
    public void a(String p0,byte[] p1){
       if (p0 != null && p1 != null) {
          this.a.put(p0, p1);
       }
       return;
    }
    public byte[] a(String p0){
       if (p0 != null) {
          return this.a.get(p0);
       }
       return null;
    }
    public int b(String p0,int p1){
       if (p0 != null && this.a.containsKey(p0)) {
          return this.a.get(p0).intValue();
       }
       return p1;
    }
    public long b(String p0,long p1){
       if (p0 != null && this.a.containsKey(p0)) {
          return this.a.get(p0).longValue();
       }
       return p1;
    }
    public a b(){
       a uoa = this.a.get("current_config");
       if (uoa != null) {
          return uoa;
       }
       c.a("UmcConfigBeanÎª¿Õ", "ÇëºË²é");
       return new a$a().a();
    }
    public String b(String p0){
       return this.b(p0, "");
    }
    public String b(String p0,String p1){
       if (p0 != null && this.a.containsKey(p0)) {
          return this.a.get(p0);
       }
       return p1;
    }
    public boolean b(String p0,boolean p1){
       if (p0 != null && this.a.containsKey(p0)) {
          return this.a.get(p0).booleanValue();
       }
       return p1;
    }
    public int c(String p0){
       return this.b(p0, 0);
    }
}
