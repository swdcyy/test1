package com.heytap.mcssdk.c.b;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Object;

public class b extends BaseMode	// class@000528
{
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public int h;
    public String i;

    public void b(){
       this.h = -2;
    }
    public static String a(List p0){
       StringBuilder str = "";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          str = str+iterator.next()+"&";
       }
       return str;
    }
    public String a(){
       return this.b;
    }
    public void a(int p0){
       this.f = p0;
    }
    public void a(String p0){
       this.b = p0;
    }
    public String b(){
       return this.c;
    }
    public void b(int p0){
       this.h = p0;
    }
    public void b(String p0){
       this.c = p0;
    }
    public String c(){
       return this.d;
    }
    public void c(String p0){
       this.d = p0;
    }
    public String d(){
       return this.e;
    }
    public void d(String p0){
       this.e = p0;
    }
    public int e(){
       return this.f;
    }
    public void e(String p0){
       this.g = p0;
    }
    public String f(){
       return this.g;
    }
    public void f(String p0){
       this.i = p0;
    }
    public int g(){
       return this.h;
    }
    public int getType(){
       return 4105;
    }
    public String h(){
       return this.i;
    }
    public String toString(){
       return "CallBackResult{, mRegisterID=\'"+this.d+'''+", mSdkVersion=\'"+this.e+'''+", mCommand="+this.f+'''+", mContent=\'"+this.g+'''+", mAppPackage="+this.i+'''+", mResponseCode="+this.h+'}';
    }
}
