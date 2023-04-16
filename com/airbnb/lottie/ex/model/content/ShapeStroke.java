package com.airbnb.lottie.ex.model.content.ShapeStroke;
import i5.b;
import java.lang.String;
import h5.b;
import java.util.List;
import h5.a;
import h5.d;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.ex.model.content.ShapeStroke$LineJoinType;
import java.lang.Object;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import c5.c;
import c5.s;

public class ShapeStroke implements b	// class@000db3
{
    public final String a;
    public final b b;
    public final List c;
    public final a d;
    public final d e;
    public final b f;
    public final ShapeStroke$LineCapType g;
    public final ShapeStroke$LineJoinType h;
    public final float i;
    public final boolean j;

    public void ShapeStroke(String p0,b p1,List p2,a p3,d p4,b p5,ShapeStroke$LineCapType p6,ShapeStroke$LineJoinType p7,float p8,boolean p9){
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
    }
    public c a(f p0,a p1){
       return new s(p0, p1, this);
    }
}
