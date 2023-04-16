package com.airbnb.lottie.ex.model.layer.Layer;
import java.util.List;
import a5.e;
import java.lang.String;
import com.airbnb.lottie.ex.model.layer.Layer$LayerType;
import h5.l;
import h5.j;
import h5.k;
import com.airbnb.lottie.ex.model.layer.Layer$MatteType;
import h5.b;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import a5.g;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Integer;
import java.util.Iterator;

public class Layer	// class@000db9
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
    public String b(){
       if (this.e == Layer$LayerType.IMAGE && !TextUtils.isEmpty(this.g)) {
          Layer tb = this.b;
          if (tb == null) {
             return null;
          }else {
             Map map = tb.g();
             if (map != null) {
                g og = map.get(this.g);
                if (og != null) {
                   return og.b();
                }
             }
          }
       }
       return null;
    }
    public List c(){
       return this.t;
    }
    public Layer$LayerType d(){
       return this.e;
    }
    public List e(){
       return this.h;
    }
    public Layer$MatteType f(){
       return this.u;
    }
    public String g(){
       return this.c;
    }
    public long h(){
       return this.f;
    }
    public String i(){
       return this.g;
    }
    public int j(){
       return this.l;
    }
    public int k(){
       return this.k;
    }
    public int l(){
       return this.j;
    }
    public float m(){
       return this.m;
    }
    public String n(String p0){
       StringBuilder str = p0+this.g()+"\n";
       Layer layer = this.b.o(this.h());
       if (layer != null) {
          str = str+"\t\tParents: "+layer.g();
          for (layer = this.b.o(layer.h()); layer != null; layer = this.b.o(layer.h())) {
             str = str+"->"+layer.g();
          }
          str = str+p0+"\n";
       }
       if (!this.e().isEmpty()) {
          str = str+p0+"\tMasks: "+this.e().size()+"\n";
       }
       if (this.l() && this.k()) {
          Object[] objArray = new Object[]{Integer.valueOf(this.l()),Integer.valueOf(this.k()),Integer.valueOf(this.j())};
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
       return this.n("");
    }
}
