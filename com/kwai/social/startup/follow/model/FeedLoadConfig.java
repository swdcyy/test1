package com.kwai.social.startup.follow.model.FeedLoadConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FeedLoadConfig implements Serializable	// class@0018a0
{
    public int directlyLoadLimit;
    public int preLoadLimit;

    public void FeedLoadConfig(int p0,int p1){
       super();
       this.directlyLoadLimit = p0;
       this.preLoadLimit = p1;
    }
    public static FeedLoadConfig copy$default(FeedLoadConfig p0,int p1,int p2,int p3,Object p4){
       FeedLoadConfig directlyLoad;
       FeedLoadConfig preLoadLimit;
       if (p3 & 0x01) {
          directlyLoad = p0.directlyLoadLimit;
       }
       if (p3 & 0x02) {
          preLoadLimit = p0.preLoadLimit;
       }
       return p0.copy(directlyLoad, preLoadLimit);
    }
    public final int component1(){
       return this.directlyLoadLimit;
    }
    public final int component2(){
       return this.preLoadLimit;
    }
    public final FeedLoadConfig copy(int p0,int p1){
       if (PatchProxy.isSupport(FeedLoadConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FeedLoadConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FeedLoadConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FeedLoadConfig && (this.directlyLoadLimit == p0.directlyLoadLimit && this.preLoadLimit == p0.preLoadLimit))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FeedLoadConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.directlyLoadLimit * 31) + this.preLoadLimit);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeedLoadConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeedLoadConfig\(directlyLoadLimit="+this.directlyLoadLimit+", preLoadLimit="+this.preLoadLimit+"\)";
    }
}
