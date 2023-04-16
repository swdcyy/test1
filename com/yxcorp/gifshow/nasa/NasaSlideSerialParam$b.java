package com.yxcorp.gifshow.nasa.NasaSlideSerialParam$b;
import java.lang.Object;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$a;

public class NasaSlideSerialParam$b	// class@0020c9
{
    public boolean a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j;
    public QPhoto k;

    public void NasaSlideSerialParam$b(){
       super();
    }
    public NasaSlideSerialParam a(){
       Object obj = PatchProxy.apply(null, this, NasaSlideSerialParam$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new NasaSlideSerialParam(this, null);
    }
    public NasaSlideSerialParam$b b(String p0){
       this.f = p0;
       return this;
    }
    public NasaSlideSerialParam$b c(boolean p0){
       this.g = p0;
       return this;
    }
    public NasaSlideSerialParam$b d(boolean p0){
       this.h = p0;
       return this;
    }
    public NasaSlideSerialParam$b e(boolean p0){
       this.a = p0;
       return this;
    }
    public NasaSlideSerialParam$b f(boolean p0){
       this.i = p0;
       return this;
    }
    public NasaSlideSerialParam$b g(String p0){
       this.e = p0;
       return this;
    }
    public NasaSlideSerialParam$b h(String p0){
       this.b = p0;
       return this;
    }
    public NasaSlideSerialParam$b i(int p0){
       this.c = p0;
       return this;
    }
}
