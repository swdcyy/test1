package com.yxcorp.gifshow.corona.common.widget.CenterLayoutManager$b;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.corona.common.widget.CenterLayoutManager;
import android.content.Context;
import android.util.DisplayMetrics;

public class CenterLayoutManager$b extends o	// class@00127a
{
    public final CenterLayoutManager q;

    public void CenterLayoutManager$b(CenterLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       CenterLayoutManager$b tq = this.q;
       return ((((p2 + ((p3 - p2) / 2)) - (p0 + ((p1 - p0) / 2))) - (tq.s / 2)) - tq.t);
    }
    public float v(DisplayMetrics p0){
       return (this.q.r / (float)p0.densityDpi);
    }
}
