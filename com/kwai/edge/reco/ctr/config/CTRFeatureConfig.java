package com.kwai.edge.reco.ctr.config.CTRFeatureConfig;
import com.kwai.edge.reco.ctr.config.RedDotFeature;
import com.kwai.edge.reco.ctr.config.BubbleFeature;
import com.kwai.edge.reco.ctr.config.ProductionFeature;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class CTRFeatureConfig	// class@000d4b
{
    public BubbleFeature bubble;
    public boolean enableEnvLight;
    public boolean enableFollowAcc;
    public ProductionFeature productionWithoutKuaishou;
    public RedDotFeature reddot;

    public void CTRFeatureConfig(){
       super(false, false, null, null, null, 31, null);
    }
    public void CTRFeatureConfig(boolean p0,boolean p1,RedDotFeature p2,BubbleFeature p3,ProductionFeature p4,int p5,u p6){
       ProductionFeature productionFe;
       u ou;
       int i = 0;
       if (p5 & 0x01) {
          p0 = false;
       }
       if (p5 & 0x02) {
          p1 = false;
       }
       p6 = null;
       p2 = (p5 & 0x04)? new RedDotFeature(i, 1, p6): p6;
       BubbleFeature uBubbleFeatu = (p5 & 0x08)? new BubbleFeature(i, 1, p6): p6;
       if (p5 & 0x10) {
          productionFe = new ProductionFeature(i, 1, p6);
       }
       a.p(p2, "reddot");
       a.p(uBubbleFeatu, "bubble");
       a.p(productionFe, "productionWithoutKuaishou");
       super();
       this.enableEnvLight = p0;
       this.enableFollowAcc = p1;
       this.reddot = p2;
       this.bubble = uBubbleFeatu;
       this.productionWithoutKuaishou = productionFe;
       return;
    }
    public final BubbleFeature a(){
       return this.bubble;
    }
    public final boolean b(){
       return this.enableEnvLight;
    }
    public final ProductionFeature c(){
       return this.productionWithoutKuaishou;
    }
    public final RedDotFeature d(){
       return this.reddot;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CTRFeatureConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof CTRFeatureConfig && (this.enableEnvLight == p0.enableEnvLight && (this.enableFollowAcc == p0.enableFollowAcc && (a.g(this.reddot, p0.reddot) && (a.g(this.bubble, p0.bubble) && a.g(this.productionWithoutKuaishou, p0.productionWithoutKuaishou))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i1;
       CTRFeatureConfig treddot;
       CTRFeatureConfig obj = PatchProxy.apply(null, this, CTRFeatureConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.enableEnvLight;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       CTRFeatureConfig tenableFollo = this.enableFollowAcc;
       if (tenableFollo == null) {
          treddot = tenableFollo;
       }
       i1 = (i1 + i) * 31;
       treddot = this.reddot;
       int i2 = 0;
       i = (treddot != null)? treddot.hashCode(): 0;
       i1 = (i1 + i) * 31;
       treddot = this.bubble;
       i = (treddot != null)? treddot.hashCode(): 0;
       i1 = (i1 + i) * 31;
       treddot = this.productionWithoutKuaishou;
       if (treddot != null) {
          i2 = treddot.hashCode();
       }
       return (i1 + i2);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CTRFeatureConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CTRFeatureConfig\(enableEnvLight="+this.enableEnvLight+", enableFollowAcc="+this.enableFollowAcc+", reddot="+this.reddot+", bubble="+this.bubble+", productionWithoutKuaishou="+this.productionWithoutKuaishou+"\)";
    }
}
