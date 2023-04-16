package com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups$b;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MixTimePositionLookups$b	// class@00155d
{
    public double a;
    public double b;
    public double c;
    public double d;

    public void MixTimePositionLookups$b(double p0,double p1,MixTimePositionLookups$a p2){
       super();
       this.c = p0;
       this.d = p1;
    }
    public static double a(double p0,double p1,double p2,double p3,double p4){
       if (!p0 - p2) {
          return p1;
       }
       return ((((p3 - p1) / (p2 - p0)) * (p4 - p0)) + p1);
    }
    public void b(double p0,double p1){
       this.a = p0;
       this.b = p0 + p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MixTimePositionLookups$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mStartTime = "+this.a+", mEndTime = "+this.b+", mStartX = "+this.c+", mEndX = "+this.d;
    }
}
