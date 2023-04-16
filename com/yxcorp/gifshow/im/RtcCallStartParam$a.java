package com.yxcorp.gifshow.im.RtcCallStartParam$a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.im.RtcCallStartParam;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class RtcCallStartParam$a	// class@00191f
{
    public final int a;
    public final String b;
    public String c;
    public final String d;
    public String e;
    public String f;
    public final int g;
    public String h;
    public int i;

    public void RtcCallStartParam$a(int p0,String p1,String p2,int p3){
       super();
       this.c = "0";
       this.h = "UNKNOWN";
       this.i = 0;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.g = p3;
    }
    public void RtcCallStartParam$a(int p0,String p1,String p2,String p3,int p4){
       super();
       this.c = "0";
       this.h = "UNKNOWN";
       this.i = 0;
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
       this.g = p4;
    }
    public RtcCallStartParam a(){
       Object obj = PatchProxy.apply(null, this, RtcCallStartParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RtcCallStartParam(this);
    }
    public RtcCallStartParam$a b(int p0){
       this.i = p0;
       return this;
    }
    public RtcCallStartParam$a c(String p0){
       this.f = p0;
       return this;
    }
    public RtcCallStartParam$a d(String p0){
       this.h = p0;
       return this;
    }
    public RtcCallStartParam$a e(String p0){
       this.c = p0;
       return this;
    }
}
