package com.gifshow.twitter.widget.Extractor$Entity;
import java.lang.String;
import com.gifshow.twitter.widget.Extractor$Entity$Type;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Enum;
import java.lang.StringBuilder;

public class Extractor$Entity	// class@0015f8
{
    public int a;
    public int b;
    public final String c;
    public final String d;
    public final Extractor$Entity$Type e;
    public String f;
    public String g;

    public void Extractor$Entity(int p0,int p1,String p2,Extractor$Entity$Type p3){
       super();
       this.f = null;
       this.g = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = null;
       this.e = p3;
    }
    public Integer a(){
       return Integer.valueOf(this.b);
    }
    public Integer b(){
       return Integer.valueOf(this.a);
    }
    public Extractor$Entity$Type c(){
       return this.e;
    }
    public String d(){
       return this.c;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof Extractor$Entity) {
          return false;
       }
       if (this.e.equals(p0.e) && (this.a == p0.a && (this.b == p0.b && (this.c).equals(p0.c)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       return (((this.e.hashCode() + (this.c).hashCode()) + this.a) + this.b);
    }
    public String toString(){
       return this.c+"\("+this.e+"\) ["+this.a+","+this.b+"]";
    }
}
