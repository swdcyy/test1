package com.airbnb.lottie.ex.model.content.ShapeTrimPath;
import i5.b;
import java.lang.String;
import com.airbnb.lottie.ex.model.content.ShapeTrimPath$Type;
import h5.b;
import java.lang.Object;
import a5.f;
import com.airbnb.lottie.ex.model.layer.a;
import c5.c;
import c5.t;
import java.lang.StringBuilder;

public class ShapeTrimPath implements b	// class@000db5
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
    public c a(f p0,a p1){
       return new t(p1, this);
    }
    public String toString(){
       return "Trim Path: {start: "+this.c+", end: "+this.d+", offset: "+this.e+"}";
    }
}
