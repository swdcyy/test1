package com.loc.dv;
import com.loc.dr;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class dv extends dr	// class@0013f2
{
    public int j;
    public int k;
    public int l;
    public int m;

    public void dv(){
       super();
       this.j = 0;
       this.k = 0;
       this.l = Integer.MAX_VALUE;
       this.m = Integer.MAX_VALUE;
    }
    public void dv(boolean p0,boolean p1){
       super(p0, p1);
       this.j = 0;
       this.k = 0;
       this.l = Integer.MAX_VALUE;
       this.m = Integer.MAX_VALUE;
    }
    public final dr a(){
       dv uodv = new dv(this.h, this.i);
       uodv.a(this);
       uodv.j = this.j;
       uodv.k = this.k;
       uodv.l = this.l;
       uodv.m = this.m;
       return uodv;
    }
    public final Object clone(){
       return this.a();
    }
    public final String toString(){
       return "AmapCellWcdma{lac="+this.j+", cid="+this.k+", psc="+this.l+", uarfcn="+this.m+", mcc=\'"+this.a+'''+", mnc=\'"+this.b+'''+", signalStrength="+this.c+", asuLevel="+this.d+", lastUpdateSystemMills="+this.e+", lastUpdateUtcMills="+this.f+", age="+this.g+", main="+this.h+", newApi="+this.i+'}';
    }
}
