package fy0.j;
import java.lang.Comparable;
import xl8.b;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.String;

public class j implements Comparable	// class@0023d9
{
    public int b;
    public b c;
    public int d;
    public View$OnClickListener e;
    public String f;
    public int g;
    public LivePayBulletTag h;
    public Drawable i;
    public Drawable j;

    public void j(int p0,int p1,b p2,View$OnClickListener p3){
       super();
       this.b = p0;
       this.c = p2;
       this.d = p1;
       this.e = p3;
    }
    public b a(){
       return this.c;
    }
    public int b(){
       return this.g;
    }
    public Drawable c(){
       return this.i;
    }
    public int compareTo(Object p0){
       return (this.d - p0.d);
    }
    public Drawable d(){
       return this.j;
    }
    public int e(){
       return this.b;
    }
    public String f(){
       return this.f;
    }
}
