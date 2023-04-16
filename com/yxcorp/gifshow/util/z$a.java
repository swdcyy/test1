package com.yxcorp.gifshow.util.z$a;
import com.yxcorp.gifshow.util.z;
import java.lang.Object;
import android.graphics.Rect;

public abstract class z$a	// class@001fbb
{
    public final Rect a;
    public final Rect b;
    public final int c;
    public final int d;
    public final z e;

    public void z$a(z p0,int p1,int p2,int p3){
       this.e = p0;
       super();
       this.c = p3;
       this.d = p2;
       this.b = this.d(p1, p2, p3);
       this.a = this.e(p1, p2, p3);
    }
    public abstract void a();
    public Rect b(){
       return this.a;
    }
    public boolean c(){
       z$a ta = this.a;
       boolean b = (ta.bottom > ta.top && ta.right > ta.left)? true: false;
       return b;
    }
    public abstract Rect d(int p0,int p1,int p2);
    public abstract Rect e(int p0,int p1,int p2);
}
