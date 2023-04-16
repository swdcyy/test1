package com.yxcorp.gifshow.util.z$c;
import com.yxcorp.gifshow.util.z$a;
import com.yxcorp.gifshow.util.z;
import android.graphics.Rect;
import java.lang.Math;

public class z$c extends z$a	// class@001fbd
{
    public final z f;

    public void z$c(z p0,int p1,int p2,int p3){
       this.f = p0;
       super(p0, p1, p2, p3);
    }
    public void a(){
       z$a ta = this.a;
       z$a tc = this.c;
       int i = ta.top - tc;
       ta.top = i;
       ta.bottom = ta.bottom - tc;
       ta.top = Math.max(i, 0);
       ta = this.a;
       ta.bottom = Math.max(ta.bottom, 0);
    }
    public Rect d(int p0,int p1,int p2){
       p1 = (int)((float)(p1 - p2) / 2.00f);
       return new Rect(0, p1, p0, (p2 + p1));
    }
    public Rect e(int p0,int p1,int p2){
       z$a td = this.d;
       return new Rect(0, (td - p2), p0, td);
    }
}
