package com.cmic.sso.sdk.e.k$a;
import android.content.SharedPreferences$Editor;
import java.lang.Object;
import oe6.g;
import java.lang.String;
import com.cmic.sso.sdk.e.d;

public class k$a	// class@000f64
{
    public final SharedPreferences$Editor a;

    public void k$a(SharedPreferences$Editor p0){
       super();
       this.a = p0;
    }
    public void a(){
       g.a(this.a);
    }
    public void a(String p0){
       this.a.remove(d.a(p0));
    }
    public void a(String p0,int p1){
       this.a.putInt(d.a(p0), p1);
    }
    public void a(String p0,long p1){
       this.a.putLong(d.a(p0), p1);
    }
    public void a(String p0,String p1){
       this.a.putString(d.a(p0), p1);
    }
    public void b(){
       g.b(this.a);
    }
    public void c(){
       this.a.clear();
    }
}
