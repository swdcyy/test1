package com.loc.ds;
import com.loc.dr;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class ds extends dr	// class@0013ef
{
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    public void ds(){
       super();
       this.j = 0;
       this.k = 0;
       this.l = 0;
    }
    public void ds(boolean p0,boolean p1){
       super(p0, p1);
       this.j = 0;
       this.k = 0;
       this.l = 0;
    }
    public final dr a(){
       ds uods = new ds(this.h, this.i);
       uods.a(this);
       uods.j = this.j;
       uods.k = this.k;
       uods.l = this.l;
       uods.m = this.m;
       uods.n = this.n;
       return uods;
    }
    public final Object clone(){
       return this.a();
    }
    public final String toString(){
       return "AmapCellCdma{sid="+this.j+", nid="+this.k+", bid="+this.l+", latitude="+this.m+", longitude="+this.n+", mcc=\'"+this.a+'''+", mnc=\'"+this.b+'''+", signalStrength="+this.c+", asuLevel="+this.d+", lastUpdateSystemMills="+this.e+", lastUpdateUtcMills="+this.f+", age="+this.g+", main="+this.h+", newApi="+this.i+'}';
    }
}
