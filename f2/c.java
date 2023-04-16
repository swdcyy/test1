package f2.c;
import f2.a;
import android.content.Context;
import android.database.Cursor;
import java.lang.String;
import java.lang.Object;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;

public abstract class c extends a	// class@001fb4
{
    public int l;
    public int m;
    public LayoutInflater n;

    public void c(Context p0,int p1,Cursor p2,boolean p3){
       super(p0, null, p3);
       this.m = p1;
       this.l = p1;
       this.n = p0.getSystemService("layout_inflater");
    }
    public View f(Context p0,Cursor p1,ViewGroup p2){
       return a.c(this.n, this.m, p2, false);
    }
    public View g(Context p0,Cursor p1,ViewGroup p2){
       return a.c(this.n, this.l, p2, false);
    }
}
