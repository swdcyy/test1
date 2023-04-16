package com.kuaishou.android.security.base.util.c;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import oe6.g;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class c	// class@0006b1
{
    public SharedPreferences a;
    public SharedPreferences$Editor b;

    public void c(Context p0){
       super();
       SharedPreferences sharedPrefer = o.c(p0, "ksdlpcfp", 0);
       this.a = sharedPrefer;
       this.b = sharedPrefer.edit();
    }
    public void a(float p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "9")) {
          return;
       }
       this.b.putFloat("sam", p0);
       g.b(this.b);
       return;
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "15")) {
          return;
       }
       this.b.putInt("ljsl", p0);
       g.b(this.b);
       return;
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "13")) {
          return;
       }
       this.b.putString("ljp", p0);
       g.b(this.b);
       return;
    }
    public void a(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.b.putBoolean("dsw", p0);
       g.b(this.b);
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("dsw", false);
    }
    public void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "24")) {
          return;
       }
       this.b.putInt("sdt", p0);
       g.b(this.b);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "11")) {
          return;
       }
       this.b.putString("ljs", p0);
       g.b(this.b);
       return;
    }
    public void b(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "22")) {
          return;
       }
       this.b.putBoolean("infs", p0);
       g.b(this.b);
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("infs", false);
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("ljp", "");
    }
    public void c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "27")) {
          return;
       }
       this.b.putInt("s_e_vv_s", p0);
       g.b(this.b);
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       this.b.putString("srs", p0);
       g.b(this.b);
       return;
    }
    public void c(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "25")) {
          return;
       }
       this.b.putBoolean("ljsu", p0);
       g.b(this.b);
       return;
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("ljs", "");
    }
    public void d(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "23")) {
          return;
       }
       this.b.putInt("udt", p0);
       g.b(this.b);
       return;
    }
    public void d(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "3")) {
          return;
       }
       this.b.putBoolean("rsw", p0);
       g.b(this.b);
       return;
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("ljsl", 0);
    }
    public void e(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "5")) {
          return;
       }
       this.b.putBoolean("rsw2", p0);
       g.b(this.b);
       return;
    }
    public void f(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "26")) {
          return;
       }
       this.b.putBoolean("s3dgsw_4.5.2", p0);
       g.b(this.b);
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("ljsu", true);
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("rsw", false);
    }
    public boolean h(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("rsw2", false);
    }
    public float i(){
       Object obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.a.getFloat("sam", 0);
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, c.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("sdt", 0x1869f);
    }
    public int k(){
       Object obj = PatchProxy.apply(null, this, c.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("s_e_vv_s", -1);
    }
    public String l(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getString("srs", "");
    }
    public boolean m(){
       Object obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.getBoolean("s3dgsw_4.5.2", false);
    }
    public int n(){
       Object obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.getInt("udt", 0x1869f);
    }
}
