package ik8.a;
import java.lang.Object;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.Canvas;

public class a	// class@00269e
{
    public Bitmap a;
    public float b;
    public float c;
    public float d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Matrix l;
    public Paint m;
    public float n;
    public float o;
    public float p;
    public long q;
    public long r;
    public int s;
    public int t;
    public List u;

    public void a(){
       super();
       this.d = 0x3f800000;
       this.e = 255;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.l = new Matrix();
       this.m = new Paint();
    }
    public void a(Bitmap p0){
       super();
       this.d = 0x3f800000;
       this.e = 255;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.i = 0;
       this.l = new Matrix();
       this.m = new Paint();
       this.a = p0;
    }
    public void a(Canvas p0){
       this.l.reset();
       this.l.postRotate(this.p, (float)this.s, (float)this.t);
       this.l.postScale(this.d, this.d, (float)this.s, (float)this.t);
       this.l.postTranslate(this.b, this.c);
       this.m.setAlpha(this.e);
       p0.drawBitmap(this.a, this.l, this.m);
    }
}
