package com.yxcorp.gifshow.detailbubble.LikeBubbleView$a;
import android.view.animation.Interpolator;
import java.lang.Object;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Bitmap;

public class LikeBubbleView$a	// class@001a90
{
    public int A;
    public float B;
    public int C;
    public final Matrix a;
    public final Paint b;
    public final Interpolator c;
    public LikeBubbleView$a d;
    public Bitmap e;
    public long f;
    public long g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public double w;
    public double x;
    public float y;
    public int z;

    public void LikeBubbleView$a(Interpolator p0){
       super();
       this.a = new Matrix();
       this.b = new Paint();
       this.v = 0;
       this.y = 0;
       this.c = p0;
    }
    public int a(){
       LikeBubbleView$a obj = PatchProxy.apply(null, this, LikeBubbleView$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e;
       if (obj == null) {
          return 0;
       }
       return obj.getWidth();
    }
}
