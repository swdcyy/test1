package com.yxcorp.gifshow.detail.player.panel.elements.QualityItemModel;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.detail.player.panel.elements.QualityMode;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class QualityItemModel implements Serializable	// class@00162a
{
    public final QualityMode qualityMode;
    public boolean selected;
    public final String subTitle;
    public final String title;

    public void QualityItemModel(String p0,String p1,QualityMode p2,boolean p3){
       a.p(p0, "title");
       a.p(p1, "subTitle");
       a.p(p2, "qualityMode");
       super();
       this.title = p0;
       this.subTitle = p1;
       this.qualityMode = p2;
       this.selected = p3;
    }
    public void QualityItemModel(String p0,String p1,QualityMode p2,boolean p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static QualityItemModel copy$default(QualityItemModel p0,String p1,String p2,QualityMode p3,boolean p4,int p5,Object p6){
       QualityItemModel title;
       QualityItemModel subTitle;
       QualityItemModel qualityMode;
       QualityItemModel selected;
       if (p5 & 0x01) {
          title = p0.title;
       }
       if (p5 & 0x02) {
          subTitle = p0.subTitle;
       }
       if (p5 & 0x04) {
          qualityMode = p0.qualityMode;
       }
       if (p5 & 0x08) {
          selected = p0.selected;
       }
       return p0.copy(title, subTitle, qualityMode, selected);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.subTitle;
    }
    public final QualityMode component3(){
       return this.qualityMode;
    }
    public final boolean component4$detail_release(){
       return this.selected;
    }
    public final QualityItemModel copy(String p0,String p1,QualityMode p2,boolean p3){
       if (PatchProxy.isSupport(QualityItemModel.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, QualityItemModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "title");
       a.p(p1, "subTitle");
       a.p(p2, "qualityMode");
       return new QualityItemModel(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, QualityItemModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof QualityItemModel && (a.g(this.title, p0.title) && (a.g(this.subTitle, p0.subTitle) && (a.g(this.qualityMode, p0.qualityMode) && this.selected == p0.selected))))) {
          return true;
       }
       return false;
    }
    public final QualityMode getQualityMode(){
       return this.qualityMode;
    }
    public final boolean getSelected$detail_release(){
       return this.selected;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
    public final String getTitle(){
       return this.title;
    }
    public int hashCode(){
       QualityItemModel obj = PatchProxy.apply(null, this, QualityItemModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       QualityItemModel tsubTitle = this.subTitle;
       int i2 = (tsubTitle != null)? tsubTitle.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsubTitle = this.qualityMode;
       if (tsubTitle != null) {
          i = tsubTitle.hashCode();
       }
       i1 = (i1 + i) * 31;
       QualityItemModel tselected = this.selected;
       if (tselected != null) {
          tselected = 1;
       }
       return (i1 + tselected);
    }
    public final void setSelected$detail_release(boolean p0){
       this.selected = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, QualityItemModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "QualityItemModel\(title="+this.title+", subTitle="+this.subTitle+", qualityMode="+this.qualityMode+", selected="+this.selected+"\)";
    }
}
