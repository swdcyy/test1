package com.kuaishou.merchant.marketing.platform.fullgiving.model.WidgetItem;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.WidgetItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Long;
import java.lang.Integer;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class WidgetItem implements Serializable	// class@001b30
{
    public List background;
    public String button;
    public String clickUrl;
    public Long endTime;
    public Long price;
    public String title;
    public Integer type;
    public static final WidgetItem$a Companion;
    public static final long serialVersionUID;

    static {
       WidgetItem.Companion = new WidgetItem$a(null);
    }
    public void WidgetItem(String p0,String p1,Long p2,Long p3,String p4,Integer p5,List p6){
       super();
       this.button = p0;
       this.clickUrl = p1;
       this.endTime = p2;
       this.price = p3;
       this.title = p4;
       this.type = p5;
       this.background = p6;
    }
    public static WidgetItem copy$default(WidgetItem p0,String p1,String p2,Long p3,Long p4,String p5,Integer p6,List p7,int p8,Object p9){
       WidgetItem button;
       WidgetItem clickUrl;
       WidgetItem endTime;
       WidgetItem price;
       WidgetItem title;
       WidgetItem type;
       WidgetItem background;
       if (p8 & 0x01) {
          button = p0.button;
       }
       if (p8 & 0x02) {
          clickUrl = p0.clickUrl;
       }
       p9 = clickUrl;
       if (p8 & 0x04) {
          endTime = p0.endTime;
       }
       WidgetItem widgetItem = endTime;
       if (p8 & 0x08) {
          price = p0.price;
       }
       WidgetItem widgetItem1 = price;
       if (p8 & 0x10) {
          title = p0.title;
       }
       WidgetItem widgetItem2 = title;
       if (p8 & 0x20) {
          type = p0.type;
       }
       WidgetItem widgetItem3 = type;
       if (p8 & 0x40) {
          background = p0.background;
       }
       return p0.copy(button, p9, widgetItem, widgetItem1, widgetItem2, widgetItem3, background);
    }
    public final String component1(){
       return this.button;
    }
    public final String component2(){
       return this.clickUrl;
    }
    public final Long component3(){
       return this.endTime;
    }
    public final Long component4(){
       return this.price;
    }
    public final String component5(){
       return this.title;
    }
    public final Integer component6(){
       return this.type;
    }
    public final List component7(){
       return this.background;
    }
    public final WidgetItem copy(String p0,String p1,Long p2,Long p3,String p4,Integer p5,List p6){
       Object obj;
       if (PatchProxy.isSupport(WidgetItem.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          obj = PatchProxy.apply(objArray, this, WidgetItem.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       WidgetItem widgetItem = new WidgetItem(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, WidgetItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof WidgetItem && (a.g(this.button, p0.button) && (a.g(this.clickUrl, p0.clickUrl) && (a.g(this.endTime, p0.endTime) && (a.g(this.price, p0.price) && (a.g(this.title, p0.title) && (a.g(this.type, p0.type) && a.g(this.background, p0.background))))))))) {
          return true;
       }
       return false;
    }
    public final List getBackground(){
       return this.background;
    }
    public final String getButton(){
       return this.button;
    }
    public final String getClickUrl(){
       return this.clickUrl;
    }
    public final Long getEndTime(){
       return this.endTime;
    }
    public final Long getPrice(){
       return this.price;
    }
    public final String getTitle(){
       return this.title;
    }
    public final Integer getType(){
       return this.type;
    }
    public int hashCode(){
       WidgetItem obj = PatchProxy.apply(null, this, WidgetItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.button;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       WidgetItem tclickUrl = this.clickUrl;
       int i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.endTime;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.price;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.title;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.type;
       i2 = (tclickUrl != null)? tclickUrl.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tclickUrl = this.background;
       if (tclickUrl != null) {
          i = tclickUrl.hashCode();
       }
       return (i1 + i);
    }
    public final void setBackground(List p0){
       this.background = p0;
    }
    public final void setButton(String p0){
       this.button = p0;
    }
    public final void setClickUrl(String p0){
       this.clickUrl = p0;
    }
    public final void setEndTime(Long p0){
       this.endTime = p0;
    }
    public final void setPrice(Long p0){
       this.price = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setType(Integer p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WidgetItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WidgetItem\(button="+this.button+", clickUrl="+this.clickUrl+", endTime="+this.endTime+", price="+this.price+", title="+this.title+", type="+this.type+", background="+this.background+"\)";
    }
}
