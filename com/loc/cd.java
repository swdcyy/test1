package com.loc.cd;
import com.loc.cg;
import android.content.Context;
import java.lang.String;
import com.loc.o;
import java.lang.System;
import com.loc.x;
import com.loc.al;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public final class cd extends cg	// class@0013b5
{
    public String a;
    public Context b;
    public boolean d;
    public int e;
    public int f;
    public int g;

    public void cd(Context p0,boolean p1,int p2,int p3,String p4){
       super();
       this.a = "iKey";
       this.g = 0;
       this.a(p0, p1, p2, p3, p4, 0);
    }
    public void cd(Context p0,boolean p1,int p2,int p3,String p4,int p5){
       super();
       this.a = "iKey";
       this.g = 0;
       this.a(p0, p1, p2, p3, p4, p5);
    }
    public final void a(int p0){
       cd uocd = 1;
       if (o.o(this.b) == uocd) {
          return;
       }
       String str = x.a(System.currentTimeMillis(), "yyyyMMdd");
       String str1 = al.a(this.b, this.a);
       if (!TextUtils.isEmpty(str1)) {
          String[] stringArray = str1.split("\\|");
          if (stringArray == null || stringArray.length < 2) {
             al.b(this.b, this.a);
          }else if(str.equals(stringArray[0])){
             p0 = p0 + Integer.parseInt(stringArray[uocd]);
          }
       }
       al.a(this.b, this.a, str+"|"+p0);
       return;
    }
    public final void a(Context p0,boolean p1,int p2,int p3,String p4,int p5){
       this.b = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = p4;
       this.g = p5;
    }
    public final boolean a(){
       if (o.o(this.b) == 1) {
          return true;
       }
       boolean b = false;
       if (this.d == null) {
          return b;
       }
       String str = al.a(this.b, this.a);
       if (TextUtils.isEmpty(str)) {
          return true;
       }
       String[] stringArray = str.split("\\|");
       if (stringArray == null || stringArray.length < 2) {
          al.b(this.b, this.a);
          return true;
       }else if((x.a(System.currentTimeMillis(), "yyyyMMdd")).equals(stringArray[b]) && Integer.parseInt(stringArray[1]) >= this.f){
          return b;
       }else {
          return true;
       }
    }
    public final int b(){
       cd te;
       int i = Integer.MAX_VALUE;
       if (o.o(this.b) != 1) {
          te = this.e;
          if (te > null) {
          label_0011 :
             i = te;
          label_001a :
             cg tc = this.c;
             if (tc != null) {
                return Math.max(i, tc.b());
             }else {
                return i;
             }
          }
       }
       te = this.g;
       if (te > null && te < i) {
          goto label_0011 ;
       }else {
          goto label_001a ;
       }
    }
}
