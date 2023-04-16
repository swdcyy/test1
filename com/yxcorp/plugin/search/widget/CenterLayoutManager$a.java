package com.yxcorp.plugin.search.widget.CenterLayoutManager$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.plugin.search.widget.CenterLayoutManager;
import android.content.Context;

public class CenterLayoutManager$a extends o	// class@0007be
{
    public final CenterLayoutManager q;

    public void CenterLayoutManager$a(CenterLayoutManager p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       return ((p2 + ((p3 - p2) / 2)) - (p0 + ((p1 - p0) / 2)));
    }
    public int x(int p0){
       return this.q.r;
    }
}
