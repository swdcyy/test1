package com.kuaishou.live.core.basic.utils.LivePreferenceObject;
import com.kuaishou.live.core.basic.utils.LivePreferenceObject$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.kuaishou.live.core.basic.utils.LivePreferenceObject$2;
import java.lang.Object;
import com.kuaishou.live.basic.model.StreamType;

public class LivePreferenceObject	// class@0008dd
{
    public boolean A;
    public long B;
    public long C;
    public long D;
    public long E;
    public boolean F;
    public boolean G;
    public List H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public CheckResolutionResponse a;
    public int b;
    public boolean c;
    public String d;
    public boolean e;
    public long f;
    public String g;
    public boolean h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Map p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public int u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final Type M;
    public static final Type N;

    static {
       LivePreferenceObject.M = new LivePreferenceObject$1().getType();
       LivePreferenceObject.N = new LivePreferenceObject$2().getType();
    }
    public void LivePreferenceObject(){
       super();
       this.h = true;
       this.j = 0;
       this.m = false;
       this.q = -1;
       this.r = 90;
       this.s = -1;
       this.t = false;
       this.u = StreamType.VIDEO.toInt();
       this.v = 0;
       this.I = 0;
       this.J = false;
    }
}
