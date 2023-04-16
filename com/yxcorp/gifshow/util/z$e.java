package com.yxcorp.gifshow.util.z$e;
import com.yxcorp.gifshow.util.z$a;
import com.yxcorp.gifshow.util.z;
import android.graphics.Rect;
import java.lang.Math;

public class z$e extends z$a	// class@001fbf
{
    public final z f;

    public void z$e(z p0,int p1,int p2,int p3){
       this.f = p0;
       super(p0, p1, p2, p3);
    }
    public void a(){
       z$a ta = this.a;
       z$a tc = this.c;
       int i = ta.left + tc;
       ta.left = i;
       ta.right = ta.right + tc;
       ta.left = Math.min(i, this.d);
       ta = this.a;
       ta.right = Math.min(ta.right, this.d);
    }
    public boolean c(){
       z$a ta = this.a;
       boolean b = (ta.bottom > ta.top && ta.right > ta.left)? true: false;
       return b;
    }
    public Rect d(int p0,int p1,int p2){
       p1 = (int)((float)(p1 - p2) / 2.00f);
       return new Rect(p1, 0, (p2 + p1), p0);
    }
    public Rect e(int p0,int p1,int p2){
       return new Rect(0, 0, p2, p0);
    }
}
