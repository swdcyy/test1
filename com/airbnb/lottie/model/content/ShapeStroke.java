package com.airbnb.lottie.model.content.ShapeStroke;
import r5.b;
import java.lang.String;
import q5.b;
import java.util.List;
import q5.a;
import q5.d;
import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;
import java.lang.Object;
import w4.h;
import com.airbnb.lottie.model.layer.a;
import y4.c;
import y4.s;

public class ShapeStroke implements b	// class@000dcd
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
    public c a(h p0,a p1){
       return new s(p0, p1, this);
    }
}
