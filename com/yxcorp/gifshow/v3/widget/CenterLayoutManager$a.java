package com.yxcorp.gifshow.v3.widget.CenterLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.v3.widget.CenterLayoutManager;
import android.content.Context;
import android.util.DisplayMetrics;

public class CenterLayoutManager$a extends o	// class@00162b
{
    public final CenterLayoutManager q;

    public void CenterLayoutManager$a(CenterLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public float v(DisplayMetrics p0){
       return (0x3f800000 / (float)p0.densityDpi);
    }
}
