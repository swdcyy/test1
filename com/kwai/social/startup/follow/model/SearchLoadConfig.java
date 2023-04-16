package com.kwai.social.startup.follow.model.SearchLoadConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SearchLoadConfig implements Serializable	// class@0018a8
{
    public int directlyLoadLimit;
    public int preLoadLimit;

    public void SearchLoadConfig(int p0,int p1){
       super();
       this.directlyLoadLimit = p0;
       this.preLoadLimit = p1;
    }
    public static SearchLoadConfig copy$default(SearchLoadConfig p0,int p1,int p2,int p3,Object p4){
       SearchLoadConfig directlyLoad;
       SearchLoadConfig preLoadLimit;
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
    public final SearchLoadConfig copy(int p0,int p1){
       if (PatchProxy.isSupport(SearchLoadConfig.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchLoadConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new SearchLoadConfig(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof SearchLoadConfig && (this.directlyLoadLimit == p0.directlyLoadLimit && this.preLoadLimit == p0.preLoadLimit))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SearchLoadConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.directlyLoadLimit * 31) + this.preLoadLimit);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SearchLoadConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SearchLoadConfig\(directlyLoadLimit="+this.directlyLoadLimit+", preLoadLimit="+this.preLoadLimit+"\)";
    }
}
