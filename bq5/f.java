package bq5.f;
import java.lang.Comparable;
import bq5.f$a;
import java.lang.Object;
import java.lang.System;
import bq5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class f implements Comparable	// class@000569
{
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public boolean g;
    public d h;

    public void f(f$a p0){
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.e = p0.c;
       this.h = p0.e;
       this.d = System.currentTimeMillis();
       this.f = p0.d;
    }
    public long a(){
       return this.e;
    }
    public d b(){
       return this.h;
    }
    public Object c(){
       return this.b;
    }
    public int compareTo(Object p0){
       f tc = this.c;
       f c = p0.c;
       int i = (tc == c)? (int)(this.d - p0.d): c - tc;
       return i;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.e(-1);
       return;
    }
    public void e(long p0){
       this.e = p0;
    }
    public void f(d p0){
       this.h = p0;
    }
    public void g(int p0){
       this.c = p0;
    }
    public int getPriority(){
       return this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveBottomBubbleItemInfo{mLiveBottomBubbleWidget="+this.b+", mPriority="+this.c+", mTimestampMs="+this.d+", mLeftTimeMs="+this.e+", mIsShowInLandscape="+this.f+", mEnableForceBreakup="+this.g+", mLiveBottomBubbleCallback="+this.h+'}';
    }
}
