package com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager$a;
import aha.b;
import com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager;
import android.content.Context;
import android.util.DisplayMetrics;

public class PymiLayoutManager$a extends b	// class@001082
{
    public final PymiLayoutManager q;

    public void PymiLayoutManager$a(PymiLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public float v(DisplayMetrics p0){
       return (this.q.r / (float)p0.densityDpi);
    }
}
