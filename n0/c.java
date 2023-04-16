package n0.c;
import z1.g;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextPaint;
import android.text.Layout$Alignment;
import android.text.TextDirectionHeuristics;
import android.os.Build$VERSION;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextUtils$TruncateAt;
import n0.a;

public class c	// class@0026a8
{
    public CharSequence a;
    public int b;
    public int c;
    public TextPaint d;
    public int e;
    public Layout$Alignment f;
    public TextDirectionHeuristic g;
    public float h;
    public float i;
    public boolean j;
    public int k;
    public TextUtils$TruncateAt l;
    public int m;
    public int n;
    public int o;
    public int[] p;
    public int[] q;
    public static final g r;

    static {
       c.r = new g(3);
    }
    public void c(){
       super();
       this.m = Integer.MAX_VALUE;
    }
    public static c b(CharSequence p0,int p1,int p2,TextPaint p3,int p4){
       c uoc = c.r.q();
       if (uoc == null) {
          uoc = new c();
       }
       uoc.a = p0;
       uoc.b = p1;
       uoc.c = p2;
       uoc.d = p3;
       uoc.e = p4;
       uoc.f = Layout$Alignment.ALIGN_NORMAL;
       uoc.g = TextDirectionHeuristics.FIRSTSTRONG_LTR;
       if (Build$VERSION.SDK_INT >= 23) {
          int i = 0;
          uoc.n = i;
          uoc.o = i;
       }
       uoc.h = 0x3f800000;
       uoc.i = 0;
       uoc.j = true;
       uoc.k = p4;
       uoc.l = null;
       uoc.m = Integer.MAX_VALUE;
       return uoc;
    }
    public static void c(c p0){
       p0.d = null;
       p0.a = null;
       p0.p = null;
       p0.q = null;
       c.r.a(p0);
    }
    public StaticLayout a(){
       StaticLayout staticLayout;
       if (Build$VERSION.SDK_INT >= 23) {
          StaticLayout$Builder uBuilder = StaticLayout$Builder.obtain(this.a, this.b, this.c, this.d, this.e);
          uBuilder.setAlignment(this.f).setBreakStrategy(this.n).setIndents(this.p, this.q).setHyphenationFrequency(this.o).setTextDirection(this.g).setLineSpacing(this.i, this.h).setIncludePad(this.j).setEllipsizedWidth(this.k).setEllipsize(this.l).setMaxLines(this.m);
          staticLayout = uBuilder.build();
       }else {
          StaticLayout staticLayout1 = new StaticLayout(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.l, this.k, this.m);
       }
       c.c(this);
       return staticLayout;
    }
    public c d(Layout$Alignment p0){
       this.f = p0;
       return this;
    }
    public c e(TextUtils$TruncateAt p0){
       this.l = p0;
       return this;
    }
    public c f(int p0){
       this.k = p0;
       return this;
    }
    public c g(boolean p0){
       this.j = p0;
       return this;
    }
    public c h(float p0,float p1){
       this.i = p0;
       this.h = p1;
       return this;
    }
    public c i(int p0){
       this.m = p0;
       return this;
    }
    public c j(CharSequence p0){
       this.k(p0, 0, p0.length());
       return this;
    }
    public c k(CharSequence p0,int p1,int p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return this;
    }
}
