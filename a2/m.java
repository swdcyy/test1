package a2.m;
import android.view.LayoutInflater;
import a2.n;
import a2.m$a;
import android.view.LayoutInflater$Factory2;

public final class m	// class@00008e
{
    public static Field a;
    public static boolean b;

    public static void a(LayoutInflater p0,n p1){
       p0.setFactory2(new m$a(p1));
    }
    public static void b(LayoutInflater p0,LayoutInflater$Factory2 p1){
       p0.setFactory2(p1);
    }
}
