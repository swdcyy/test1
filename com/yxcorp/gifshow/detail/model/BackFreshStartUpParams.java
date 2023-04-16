package com.yxcorp.gifshow.detail.model.BackFreshStartUpParams;
import java.io.Serializable;
import com.yxcorp.gifshow.detail.model.BackFreshStartUpParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class BackFreshStartUpParams implements Serializable	// class@001583
{
    public boolean rankBackFreshEnabled;
    public boolean rankBackFreshRerankEnabled;
    public static final BackFreshStartUpParams$a Companion;
    public static final long serialVersionUID;

    static {
       BackFreshStartUpParams.Companion = new BackFreshStartUpParams$a(null);
    }
    public void BackFreshStartUpParams(){
       super(false, false, 3, null);
    }
    public void BackFreshStartUpParams(boolean p0,boolean p1){
       super();
       this.rankBackFreshEnabled = p0;
       this.rankBackFreshRerankEnabled = p1;
    }
    public void BackFreshStartUpParams(boolean p0,boolean p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = false;
       }
       if (p2 & 0x02) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public static BackFreshStartUpParams copy$default(BackFreshStartUpParams p0,boolean p1,boolean p2,int p3,Object p4){
       BackFreshStartUpParams rankBackFres;
       BackFreshStartUpParams rankBackFres1;
       if (p3 & 0x01) {
          rankBackFres = p0.rankBackFreshEnabled;
       }
       if (p3 & 0x02) {
          rankBackFres1 = p0.rankBackFreshRerankEnabled;
       }
       return p0.copy(rankBackFres, rankBackFres1);
    }
    public final boolean component1(){
       return this.rankBackFreshEnabled;
    }
    public final boolean component2(){
       return this.rankBackFreshRerankEnabled;
    }
    public final BackFreshStartUpParams copy(boolean p0,boolean p1){
       if (PatchProxy.isSupport(BackFreshStartUpParams.class)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, BackFreshStartUpParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BackFreshStartUpParams(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof BackFreshStartUpParams && (this.rankBackFreshEnabled == p0.rankBackFreshEnabled && this.rankBackFreshRerankEnabled == p0.rankBackFreshRerankEnabled))) {
          return true;
       }
       return false;
    }
    public final boolean getRankBackFreshEnabled(){
       return this.rankBackFreshEnabled;
    }
    public final boolean getRankBackFreshRerankEnabled(){
       return this.rankBackFreshRerankEnabled;
    }
    public int hashCode(){
       BackFreshStartUpParams trankBackFre = this.rankBackFreshEnabled;
       int i = 1;
       if (trankBackFre != null) {
          trankBackFre = 1;
       }
       int i1 = trankBackFre * 31;
       BackFreshStartUpParams trankBackFre1 = this.rankBackFreshRerankEnabled;
       if (trankBackFre1 == null) {
          i = trankBackFre1;
       }
       return (i1 + i);
    }
    public final void setRankBackFreshEnabled(boolean p0){
       this.rankBackFreshEnabled = p0;
    }
    public final void setRankBackFreshRerankEnabled(boolean p0){
       this.rankBackFreshRerankEnabled = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BackFreshStartUpParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BackFreshStartUpParams\(rankBackFreshEnabled="+this.rankBackFreshEnabled+", rankBackFreshRerankEnabled="+this.rankBackFreshRerankEnabled+"\)";
    }
}
