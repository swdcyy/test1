package com.yxcorp.gifshow.util.z$d;
import com.yxcorp.gifshow.util.z$a;
import com.yxcorp.gifshow.util.z;
import android.graphics.Rect;
import java.lang.Math;

public class z$d extends z$a	// class@001fbe
{
    public final z f;

    public void z$d(z p0,int p1,int p2,int p3){
       this.f = p0;
       super(p0, p1, p2, p3);
    }
    public void a(){
       z$a ta = this.a;
       z$a tc = this.c;
       int i = ta.left - tc;
       ta.left = i;
       ta.right = ta.right - tc;
       ta.left = Math.max(i, 0);
       ta = this.a;
       ta.right = Math.max(ta.right, 0);
    }
    public Rect d(int p0,int p1,int p2){
       p1 = (int)((float)(p1 - p2) / 2.00f);
       return new Rect(p1, 0, (p2 + p1), p0);
    }
    public Rect e(int p0,int p1,int p2){
       z$a td = this.d;
       return new Rect((td - p2), 0, td, p0);
    }
}
