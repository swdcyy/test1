package com.cmic.sso.sdk.a.a;
import java.lang.Cloneable;
import java.lang.Object;
import com.cmic.sso.sdk.a.a$1;
import java.lang.String;

public class a implements Cloneable	// class@000f1d
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;

    public void a(){
       super();
       this.a = "rcs.cmpassport.com";
       this.b = "rcs.cmpassport.com";
       this.c = "config2.cmpassport.com";
       this.d = "log2.cmpassport.com:9443";
       this.e = false;
       this.f = false;
       this.g = false;
       this.h = false;
       this.i = false;
       this.j = false;
       this.k = 3;
       this.l = 1;
    }
    public void a(a$1 p0){
       super();
    }
    public static int a(a p0,int p1){
       p0.k = p1;
       return p1;
    }
    public static String a(a p0,String p1){
       p0.a = p1;
       return p1;
    }
    public static boolean a(a p0,boolean p1){
       p0.e = p1;
       return p1;
    }
    public static int b(a p0,int p1){
       p0.l = p1;
       return p1;
    }
    public static String b(a p0,String p1){
       p0.b = p1;
       return p1;
    }
    public static boolean b(a p0,boolean p1){
       p0.f = p1;
       return p1;
    }
    public static String c(a p0,String p1){
       p0.c = p1;
       return p1;
    }
    public static boolean c(a p0,boolean p1){
       p0.g = p1;
       return p1;
    }
    public static String d(a p0,String p1){
       p0.d = p1;
       return p1;
    }
    public static boolean d(a p0,boolean p1){
       p0.h = p1;
       return p1;
    }
    public static boolean e(a p0,boolean p1){
       p0.i = p1;
       return p1;
    }
    public static boolean f(a p0,boolean p1){
       p0.j = p1;
       return p1;
    }
    public String a(){
       return this.a;
    }
    public String b(){
       return this.b;
    }
    public String c(){
       return this.c;
    }
    public Object clone(){
       return this.m();
    }
    public String d(){
       return this.d;
    }
    public boolean e(){
       return this.e;
    }
    public boolean f(){
       return this.f;
    }
    public boolean g(){
       return this.g;
    }
    public boolean h(){
       return this.h;
    }
    public boolean i(){
       return this.i;
    }
    public boolean j(){
       return this.j;
    }
    public int k(){
       return this.k;
    }
    public int l(){
       return this.l;
    }
    public a m(){
       return super.clone();
    }
}
