package com.kwai.player.KwaiPlayerConfig$a;
import java.lang.Object;
import com.kwai.player.KwaiPlayerConfig$EnumBufferStrategy;
import com.kwai.player.KwaiPlayerConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class KwaiPlayerConfig$a	// class@0012d4
{
    public boolean a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public KwaiPlayerConfig$EnumBufferStrategy l;

    public void KwaiPlayerConfig$a(){
       super();
       this.a = false;
       this.b = 0x2710;
       this.c = false;
       this.d = false;
       this.e = 2000;
       this.f = 100;
       this.g = 100;
       this.h = 5000;
       this.i = 100;
       this.j = 0x4e20;
       this.k = 0x1d4c0;
       this.l = KwaiPlayerConfig$EnumBufferStrategy.LINEAR_INCREASE_BUFFER_STRATEGY;
    }
    public KwaiPlayerConfig a(){
       Object obj = PatchProxy.apply(null, this, KwaiPlayerConfig$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiPlayerConfig(this);
    }
    public KwaiPlayerConfig$a b(boolean p0){
       this.d = p0;
       return this;
    }
    public KwaiPlayerConfig$a c(boolean p0){
       this.c = p0;
       return this;
    }
    public KwaiPlayerConfig$a d(boolean p0){
       this.a = p0;
       return this;
    }
    public KwaiPlayerConfig$a e(long p0){
       this.e = p0;
       return this;
    }
    public KwaiPlayerConfig$a f(long p0){
       this.b = p0;
       return this;
    }
}
