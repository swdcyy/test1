package com.airbnb.lottie.model.layer.Layer;
import java.util.List;
import w4.e;
import java.lang.String;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import q5.l;
import q5.j;
import q5.k;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import q5.b;
import java.lang.Object;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Integer;
import java.util.Iterator;

public class Layer	// class@000dd3
{
    public final List a;
    public final e b;
    public final String c;
    public final long d;
    public final Layer$LayerType e;
    public final long f;
    public final String g;
    public final List h;
    public final l i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final j q;
    public final k r;
    public final b s;
    public final List t;
    public final Layer$MatteType u;
    public final boolean v;

    public void Layer(List p0,e p1,String p2,long p3,Layer$LayerType p4,long p5,String p6,List p7,l p8,int p9,int p10,int p11,float p12,float p13,int p14,int p15,j p16,k p17,List p18,Layer$MatteType p19,b p20,boolean p21){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
       i.r = p17;
       i.t = p18;
       i.u = p19;
       i.s = p20;
       i.v = p21;
    }
    public long a(){
       return this.d;
    }
    public List b(){
       return this.t;
    }
    public Layer$LayerType c(){
       return this.e;
    }
    public List d(){
       return this.h;
    }
    public Layer$MatteType e(){
       return this.u;
    }
    public String f(){
       return this.c;
    }
    public long g(){
       return this.f;
    }
    public String h(){
       return this.g;
    }
    public int i(){
       return this.l;
    }
    public int j(){
       return this.k;
    }
    public int k(){
       return this.j;
    }
    public float l(){
       return this.m;
    }
    public String m(String p0){
       StringBuilder str = p0+this.f()+"\n";
       Layer layer = this.b.o(this.g());
       if (layer != null) {
          str = str+"\t\tParents: "+layer.f();
          for (layer = this.b.o(layer.g()); layer != null; layer = this.b.o(layer.g())) {
             str = str+"->"+layer.f();
          }
          str = str+p0+"\n";
       }
       if (!this.d().isEmpty()) {
          str = str+p0+"\tMasks: "+this.d().size()+"\n";
       }
       if (this.k() && this.j()) {
          Object[] objArray = new Object[]{Integer.valueOf(this.k()),Integer.valueOf(this.j()),Integer.valueOf(this.i())};
          str = str+p0+"\tBackground: "+String.format(Locale.US, "%dx%d %X\n", objArray);
       }
       if (!this.a.isEmpty()) {
          str = str+p0+"\tShapes:\n";
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             str = str+p0+"\t\t"+iterator.next()+"\n";
          }
       }
       return str;
    }
    public String toString(){
       return this.m("");
    }
}
