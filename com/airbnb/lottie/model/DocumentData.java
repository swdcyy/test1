package com.airbnb.lottie.model.DocumentData;
import java.lang.String;
import com.airbnb.lottie.model.DocumentData$Justification;
import java.lang.Object;
import java.lang.Enum;
import java.lang.Double;

public class DocumentData	// class@000dc2
{
    public final String a;
    public final String b;
    public final double c;
    public final DocumentData$Justification d;
    public final int e;
    public final double f;
    public final double g;
    public final int h;
    public final int i;
    public final double j;
    public final boolean k;

    public void DocumentData(String p0,String p1,double p2,DocumentData$Justification p3,int p4,double p5,double p6,int p7,int p8,double p9,boolean p10){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
    }
    public int hashCode(){
       long l = Double.doubleToLongBits(this.f);
       return (((((((((int)((double)((((this.a).hashCode() * 31) + (this.b).hashCode()) * 31) + this.c) * 31) + this.d.ordinal()) * 31) + this.e) * 31) + (int)(l ^ (l >> 32))) * 31) + this.h);
    }
}
