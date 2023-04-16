package com.loc.du;
import com.loc.dr;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class du extends dr	// class@0013f1
{
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public void du(){
       super();
       this.j = 0;
       this.k = 0;
       this.l = Integer.MAX_VALUE;
       this.m = Integer.MAX_VALUE;
       this.n = Integer.MAX_VALUE;
    }
    public void du(boolean p0){
       super(p0, true);
       this.j = 0;
       this.k = 0;
       this.l = Integer.MAX_VALUE;
       this.m = Integer.MAX_VALUE;
       this.n = Integer.MAX_VALUE;
    }
    public final dr a(){
       du uodu = new du(this.h);
       uodu.a(this);
       uodu.j = this.j;
       uodu.k = this.k;
       uodu.l = this.l;
       uodu.m = this.m;
       uodu.n = this.n;
       return uodu;
    }
    public final Object clone(){
       return this.a();
    }
    public final String toString(){
       return "AmapCellLte{tac="+this.j+", ci="+this.k+", pci="+this.l+", earfcn="+this.m+", timingAdvance="+this.n+", mcc=\'"+this.a+'''+", mnc=\'"+this.b+'''+", signalStrength="+this.c+", asuLevel="+this.d+", lastUpdateSystemMills="+this.e+", lastUpdateUtcMills="+this.f+", age="+this.g+", main="+this.h+", newApi="+this.i+'}';
    }
}
