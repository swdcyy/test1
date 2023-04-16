package com.kuaishou.aegon.httpdns.ResolvedIP;
import java.lang.Comparable;
import java.lang.String;
import java.lang.Object;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public class ResolvedIP implements Comparable	// class@0007ad
{
    public final long mExpiredDate;
    public final String mHost;
    public final String mIP;
    public String mResolver;
    public long mRtt;
    public final long mTtl;

    public void ResolvedIP(String p0,String p1,String p2,long p3,long p4){
       super();
       this.mHost = p0;
       this.mIP = p1;
       this.mResolver = p2;
       this.mRtt = p4;
       this.mExpiredDate = System.currentTimeMillis() + p3;
       this.mTtl = p3;
    }
    public int compareTo(ResolvedIP p0){
       return (int)(this.mRtt - p0.mRtt);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ResolvedIP.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof ResolvedIP && (this.mIP).equals(p0.mIP))? true: false;
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, ResolvedIP.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mIP).hashCode();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ResolvedIP.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{\n"+"\thost = "+this.mHost+"\n"+"\tip = "+this.mIP+"\n"+"\ttype = "+this.mResolver+"\n"+"\trtt = "+this.mRtt+"\n"+"\tttl = "+this.mTtl+"\n"+"\texpired = "+this.mExpiredDate+"\n}\n";
    }
}
