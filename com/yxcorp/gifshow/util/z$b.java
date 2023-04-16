package com.yxcorp.gifshow.util.z$b;
import com.yxcorp.gifshow.util.z$a;
import com.yxcorp.gifshow.util.z;
import android.graphics.Rect;
import java.lang.Math;

public class z$b extends z$a	// class@001fbc
{
    public final z f;

    public void z$b(z p0,int p1,int p2,int p3){
       this.f = p0;
       super(p0, p1, p2, p3);
    }
    public void a(){
       z$a ta = this.a;
       z$a tc = this.c;
       int i = ta.top + tc;
       ta.top = i;
       ta.bottom = ta.bottom + tc;
       ta.top = Math.min(i, this.d);
       ta = this.a;
       ta.bottom = Math.min(ta.bottom, this.d);
    }
    public Rect d(int p0,int p1,int p2){
       p1 = (int)((float)(p1 - p2) / 2.00f);
       return new Rect(0, p1, p0, (p2 + p1));
    }
    public Rect e(int p0,int p1,int p2){
       return new Rect(0, 0, p0, p2);
    }
}
