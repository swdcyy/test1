package hb2.m;
import ks5.b;
import hb2.n;
import android.view.View;
import java.lang.Object;
import ks5.a;
import android.view.ViewGroup;
import ks5.e;
import ks5.d;
import java.lang.String;

public class m implements b	// class@002d4e
{
    public final View a;
    public final n b;

    public void m(n p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void D(){
       a.d(this);
    }
    public void a(int p0){
       a.f(this, p0);
    }
    public View b(ViewGroup p0){
       return this.a;
    }
    public boolean c(){
       return true;
    }
    public void d(ViewGroup p0){
       d.b(this, p0);
    }
    public void e(ViewGroup p0){
       d.c(this, p0);
    }
    public int getBizId(){
       return 3;
    }
    public boolean i(){
       return a.c(this);
    }
    public String k(){
       return a.a(this);
    }
    public void onShow(){
       a.e(this);
    }
    public int[] p(){
       return a.b(this);
    }
}
