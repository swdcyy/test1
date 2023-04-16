package com.cmic.sso.sdk.b.b$b;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class b$b	// class@000416
{
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;

    public void b$b(){
       super();
       this.a = "";
       this.b = "";
       this.c = "";
       this.d = "";
       this.e = -1;
       this.f = -1;
       this.g = "";
       this.h = "";
       this.i = -1;
       this.j = -1;
    }
    public static int a(b$b p0){
       return p0.j;
    }
    public static int a(b$b p0,int p1){
       p0.i = p1;
       return p1;
    }
    public static String a(b$b p0,String p1){
       p0.a = p1;
       return p1;
    }
    public static int b(b$b p0){
       return p0.i;
    }
    public static int b(b$b p0,int p1){
       p0.j = p1;
       return p1;
    }
    public static String b(b$b p0,String p1){
       p0.g = p1;
       return p1;
    }
    public static int c(b$b p0){
       return p0.e;
    }
    public static int c(b$b p0,int p1){
       p0.e = p1;
       return p1;
    }
    public static String c(b$b p0,String p1){
       p0.b = p1;
       return p1;
    }
    public static int d(b$b p0,int p1){
       p0.f = p1;
       return p1;
    }
    public static String d(b$b p0){
       return p0.g;
    }
    public static String d(b$b p0,String p1){
       p0.h = p1;
       return p1;
    }
    public static int e(b$b p0){
       return p0.f;
    }
    public static String f(b$b p0){
       return p0.h;
    }
    public static String g(b$b p0){
       return p0.a;
    }
    public static String h(b$b p0){
       return p0.b;
    }
    public String a(){
       return this.c;
    }
    public String a(int p0){
       if (this.e == p0) {
          return this.a;
       }
       if (this.f == p0) {
          return this.b;
       }
       return "";
    }
    public void a(String p0){
       if (p0 != null) {
          this.c = p0;
       }
       return;
    }
    public String b(){
       return this.d;
    }
    public void b(int p0){
       this.i = p0;
    }
    public void b(String p0){
       if (p0 != null) {
          this.d = p0;
       }
       return;
    }
    public String c(){
       return this.h;
    }
    public void c(int p0){
       this.e = p0;
    }
    public void c(String p0){
       if (p0 != null) {
          this.g = p0;
       }
       return;
    }
    public int d(){
       return this.i;
    }
    public void d(int p0){
       this.f = p0;
    }
    public void d(String p0){
       this.h = p0;
    }
    public int e(){
       return this.j;
    }
    public String e(int p0){
       if (this.e == p0) {
          return this.c;
       }
       if (this.f == p0) {
          return this.d;
       }
       return "";
    }
    public int f(){
       return this.e;
    }
    public String f(int p0){
       if (this.e == p0) {
          return this.g;
       }
       if (this.f == p0) {
          return this.h;
       }
       return "";
    }
    public int g(){
       return this.f;
    }
    public int h(){
       if (TextUtils.isEmpty(this.d) || (!TextUtils.isEmpty(this.c) || (!TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.h)))) {
          return 2;
       }
       if (TextUtils.isEmpty(this.c) && (TextUtils.isEmpty(this.d) && (!TextUtils.isEmpty(this.g) || !TextUtils.isEmpty(this.h)))) {
          return 1;
       }
       return 0;
    }
}
