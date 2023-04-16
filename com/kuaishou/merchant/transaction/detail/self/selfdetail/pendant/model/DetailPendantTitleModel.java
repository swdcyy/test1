package com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantTitleModel;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.pendant.model.DetailPendantTitleModel$a;
import nsd.u;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public final class DetailPendantTitleModel implements Serializable	// class@00074e
{
    public int baselineOffset;
    public String pattern;
    public String textColor;
    public int textSize;
    public String valueColor;
    public int valueTextSize;
    public List values;
    public static final DetailPendantTitleModel$a Companion;
    public static final long serialVersionUID;

    static {
       DetailPendantTitleModel.Companion = new DetailPendantTitleModel$a(null);
    }
    public void DetailPendantTitleModel(){
       super("", new ArrayList(), 0, 0, "", "", 0);
    }
    public void DetailPendantTitleModel(String p0,List p1,int p2,int p3,String p4,String p5,int p6){
       super();
       this.pattern = p0;
       this.values = p1;
       this.textSize = p2;
       this.valueTextSize = p3;
       this.textColor = p4;
       this.valueColor = p5;
       this.baselineOffset = p6;
    }
    public static DetailPendantTitleModel copy$default(DetailPendantTitleModel p0,String p1,List p2,int p3,int p4,String p5,String p6,int p7,int p8,Object p9){
       DetailPendantTitleModel pattern;
       DetailPendantTitleModel values;
       DetailPendantTitleModel textSize;
       DetailPendantTitleModel valueTextSiz;
       DetailPendantTitleModel textColor;
       DetailPendantTitleModel valueColor;
       DetailPendantTitleModel baselineOffs;
       if (p8 & 0x01) {
          pattern = p0.pattern;
       }
       if (p8 & 0x02) {
          values = p0.values;
       }
       p9 = values;
       if (p8 & 0x04) {
          textSize = p0.textSize;
       }
       DetailPendantTitleModel uDetailPenda = textSize;
       if (p8 & 0x08) {
          valueTextSiz = p0.valueTextSize;
       }
       DetailPendantTitleModel uDetailPenda1 = valueTextSiz;
       if (p8 & 0x10) {
          textColor = p0.textColor;
       }
       DetailPendantTitleModel uDetailPenda2 = textColor;
       if (p8 & 0x20) {
          valueColor = p0.valueColor;
       }
       DetailPendantTitleModel uDetailPenda3 = valueColor;
       if (p8 & 0x40) {
          baselineOffs = p0.baselineOffset;
       }
       return p0.copy(pattern, p9, uDetailPenda, uDetailPenda1, uDetailPenda2, uDetailPenda3, baselineOffs);
    }
    public final String component1(){
       return this.pattern;
    }
    public final List component2(){
       return this.values;
    }
    public final int component3(){
       return this.textSize;
    }
    public final int component4(){
       return this.valueTextSize;
    }
    public final String component5(){
       return this.textColor;
    }
    public final String component6(){
       return this.valueColor;
    }
    public final int component7(){
       return this.baselineOffset;
    }
    public final DetailPendantTitleModel copy(String p0,List p1,int p2,int p3,String p4,String p5,int p6){
       Object obj;
       if (PatchProxy.isSupport(DetailPendantTitleModel.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5,Integer.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, DetailPendantTitleModel.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       DetailPendantTitleModel uDetailPenda = new DetailPendantTitleModel(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailPendantTitleModel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DetailPendantTitleModel && (a.g(this.pattern, p0.pattern) && (a.g(this.values, p0.values) && (this.textSize == p0.textSize && (this.valueTextSize == p0.valueTextSize && (a.g(this.textColor, p0.textColor) && (a.g(this.valueColor, p0.valueColor) && this.baselineOffset == p0.baselineOffset)))))))) {
          return true;
       }
       return false;
    }
    public final int getBaselineOffset(){
       return this.baselineOffset;
    }
    public final String getPattern(){
       return this.pattern;
    }
    public final int getTextColor(){
       Object obj = PatchProxy.apply(null, this, DetailPendantTitleModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return TextUtils.J(this.textColor, a1.a(0x7f061d96));
    }
    public final String getTextColor(){
       return this.textColor;
    }
    public final int getTextSize(){
       return this.textSize;
    }
    public final String getValueColor(){
       return this.valueColor;
    }
    public final int getValueTextSize(){
       return this.valueTextSize;
    }
    public final List getValues(){
       return this.values;
    }
    public int hashCode(){
       DetailPendantTitleModel obj = PatchProxy.apply(null, this, DetailPendantTitleModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pattern;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DetailPendantTitleModel tvalues = this.values;
       int i2 = (tvalues != null)? tvalues.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + this.textSize) * 31) + this.valueTextSize) * 31;
       tvalues = this.textColor;
       i2 = (tvalues != null)? tvalues.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tvalues = this.valueColor;
       if (tvalues != null) {
          i = tvalues.hashCode();
       }
       return (((i1 + i) * 31) + this.baselineOffset);
    }
    public final void setBaselineOffset(int p0){
       this.baselineOffset = p0;
    }
    public final void setPattern(String p0){
       this.pattern = p0;
    }
    public final void setTextColor(String p0){
       this.textColor = p0;
    }
    public final void setTextSize(int p0){
       this.textSize = p0;
    }
    public final void setValueColor(String p0){
       this.valueColor = p0;
    }
    public final void setValueTextSize(int p0){
       this.valueTextSize = p0;
    }
    public final void setValues(List p0){
       this.values = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DetailPendantTitleModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DetailPendantTitleModel\(pattern="+this.pattern+", values="+this.values+", textSize="+this.textSize+", valueTextSize="+this.valueTextSize+", textColor="+this.textColor+", valueColor="+this.valueColor+", baselineOffset="+this.baselineOffset+"\)";
    }
}
