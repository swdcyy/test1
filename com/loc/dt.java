package com.loc.dt;
import com.loc.dr;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class dt extends dr	// class@0013f0
{
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public void dt(){
       super();
       this.j = 0;
       this.k = 0;
       this.l = Integer.MAX_VALUE;
       this.m = Integer.MAX_VALUE;
       this.n = Integer.MAX_VALUE;
       this.o = Integer.MAX_VALUE;
    }
    public void dt(boolean p0,boolean p1){
       super(p0, p1);
       this.j = 0;
       this.k = 0;
       this.l = Integer.MAX_VALUE;
       this.m = Integer.MAX_VALUE;
       this.n = Integer.MAX_VALUE;
       this.o = Integer.MAX_VALUE;
    }
    public final dr a(){
       dt uodt = new dt(this.h, this.i);
       uodt.a(this);
       uodt.j = this.j;
       uodt.k = this.k;
       uodt.l = this.l;
       uodt.m = this.m;
       uodt.n = this.n;
       uodt.o = this.o;
       return uodt;
    }
    public final Object clone(){
       return this.a();
    }
    public final String toString(){
       return "AmapCellGsm{lac="+this.j+", cid="+this.k+", psc="+this.l+", arfcn="+this.m+", bsic="+this.n+", timingAdvance="+this.o+", mcc=\'"+this.a+'''+", mnc=\'"+this.b+'''+", signalStrength="+this.c+", asuLevel="+this.d+", lastUpdateSystemMills="+this.e+", lastUpdateUtcMills="+this.f+", age="+this.g+", main="+this.h+", newApi="+this.i+'}';
    }
}
