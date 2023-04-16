package jod.f;
import java.lang.String;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class f	// class@001725
{
    public final String a;
    public final String b;
    public final TextStyleAttrs c;
    public final TextStyleValue d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public void f(String p0,String p1,TextStyleAttrs p2,TextStyleValue p3,int p4,int p5,String p6,String p7){
       a.p(p0, "textStyleId");
       a.p(p1, "fontFileName");
       a.p(p2, "styleAttrs");
       a.p(p3, "customStyle");
       a.p(p6, "text");
       a.p(p7, "hintText");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public final String a(){
       return this.b;
    }
    public final String b(){
       return this.h;
    }
    public final String c(){
       return this.g;
    }
    public final String d(){
       return this.a;
    }
}
