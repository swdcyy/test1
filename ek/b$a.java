package ek.b$a;
import o1.f$a;
import ek.b;
import android.text.TextPaint;
import android.graphics.Typeface;

public class b$a extends f$a	// class@001f52
{
    public final TextPaint a;
    public final f$a b;
    public final b c;

    public void b$a(b p0,TextPaint p1,f$a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void d(int p0){
       this.c.a();
       this.c.n = true;
       this.b.d(p0);
    }
    public void e(Typeface p0){
       b$a tc = this.c;
       tc.o = Typeface.create(p0, tc.e);
       this.c.f(this.a, p0);
       this.c.n = true;
       this.b.e(p0);
    }
}
