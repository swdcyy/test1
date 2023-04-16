package com.airbnb.lottie.model.content.ShapeTrimPath;
import r5.b;
import java.lang.String;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import q5.b;
import java.lang.Object;
import w4.h;
import com.airbnb.lottie.model.layer.a;
import y4.c;
import y4.t;
import java.lang.StringBuilder;

public class ShapeTrimPath implements b	// class@000dcf
{
    public final String a;
    public final ShapeTrimPath$Type b;
    public final b c;
    public final b d;
    public final b e;
    public final boolean f;

    public void ShapeTrimPath(String p0,ShapeTrimPath$Type p1,b p2,b p3,b p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public c a(h p0,a p1){
       return new t(p1, this);
    }
    public String toString(){
       return "Trim Path: {start: "+this.c+", end: "+this.d+", offset: "+this.e+"}";
    }
}
