package e1.e;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;

public abstract class e	// class@001e81
{
    public int a;
    public int b;
    public String c;
    public int d;
    public HashMap e;
    public static int f = 255;

    public void e(){
       super();
       int f = e.f;
       this.a = f;
       this.b = f;
       this.c = null;
    }
    public abstract void a(HashMap p0);
    public abstract void b(HashSet p0);
    public abstract void c(Context p0,AttributeSet p1);
    public boolean d(String p0){
       e tc = this.c;
       if (tc == null || p0 == null) {
          return false;
       }
       return p0.matches(tc);
    }
    public void e(HashMap p0){
    }
    public abstract void f(String p0,Object p1);
    public boolean g(Object p0){
       boolean b = (p0 instanceof Boolean)? p0.booleanValue(): Boolean.parseBoolean(p0.toString());
       return b;
    }
    public float h(Object p0){
       float f = (p0 instanceof Float)? p0.floatValue(): Float.parseFloat(p0.toString());
       return f;
    }
    public int i(Object p0){
       int i = (p0 instanceof Integer)? p0.intValue(): Integer.parseInt(p0.toString());
       return i;
    }
}
