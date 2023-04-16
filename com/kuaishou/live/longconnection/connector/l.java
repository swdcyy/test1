package com.kuaishou.live.longconnection.connector.l;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;
import com.kuaishou.live.longconnection.connector.l$b;
import com.kuaishou.live.longconnection.connector.l$c;
import java.lang.StringBuilder;

public class l implements Cloneable	// class@000c77
{
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public int H;
    public int I;
    public l$b J;
    public l$a K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public c Q;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public List j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public l$c s;
    public boolean t;
    public int u;
    public int v;
    public double w;
    public double x;
    public long y;
    public int z;

    public void l(){
       super();
       this.M = false;
    }
    public l a(){
       Object obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public String b(){
       return this.k;
    }
    public String c(){
       l obj = PatchProxy.apply(null, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.J;
       if (obj != null) {
          return obj.h();
       }
       return "";
    }
    public Object clone(){
       return this.a();
    }
    public String d(){
       return this.d;
    }
    public long e(){
       return this.P;
    }
    public String f(){
       return this.c;
    }
    public String g(){
       return this.p;
    }
    public String h(){
       return this.q;
    }
    public l$c i(){
       return this.s;
    }
    public boolean j(){
       return this.e;
    }
    public boolean k(){
       return this.i;
    }
    public l l(l$c p0){
       this.s = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ("LongConnectionParams{"+"mToken=\'"+this.b+'''+", mLiveStreamId=\'"+this.c+'''+", mDeviceId=\'"+this.d+'''+", mIsAuthor="+this.e+", mAppVer=\'"+this.k+'''+", mSys=\'"+this.l+'''+", mPhoneModel=\'"+this.n+'''+", mChannel=\'"+this.o+'''+", mLocale=\'"+this.p+'''+", mOperator=\'"+this.q+'''+", mExpTag=\'"+this.r+'''+", mServerUriInfo="+this.s+", mIsFirstEnterRoom="+this.t+", mRetryCount="+this.u+", mLastErrorCode="+this.v+", mLatitude="+this.w+", mLongitude="+this.x+", mUserId="+this.y+", mAttach=\'"+this.c()+'''+", mLiveStreamStartPlaySourceType=\'"+this.z+'''+", mBroadcastGiftToken=\'"+this.A+'''+", mServiceToken=\'"+this.C+'''+", mAnchorId=\'"+this.D+'''+", mSessionId=\'"+this.E+'''+", mKpn=\'"+this.F+'''+", mKpf=\'"+this.G+'''+", mAppType=\'"+this.H+'''+", mClientId=\'"+this.I+'''+", mShouldLimitThreadCount=\'"+this.L+'''+", mIsStickyMessageEnabled=\'"+this.M+'''+'}').substring(0);
    }
}
