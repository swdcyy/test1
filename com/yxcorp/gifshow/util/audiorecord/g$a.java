package com.yxcorp.gifshow.util.audiorecord.g$a;
import com.yxcorp.gifshow.util.audiorecord.g;
import java.lang.Object;
import java.lang.Math;
import android.graphics.drawable.Drawable;

public class g$a	// class@001f57
{
    public float a;
    public float b;
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public g$a a(float p0){
       p0 = Math.max(this.b, p0);
       this.a = p0;
       if (p0 - this.b > 0) {
          this.c.invalidateSelf();
       }
       return this;
    }
}
