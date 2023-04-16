package com.kwai.slide.play.detail.model.MoreOperationItem;
import java.io.Serializable;
import com.kwai.slide.play.detail.model.MoreOperationItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MoreOperationItem implements Serializable	// class@00182d
{
    public final String darkIcon;
    public final boolean enableFeedbackDetail;
    public final String icon;
    public final String id;
    public final String name;
    public final String selectedDarkIcon;
    public final String selectedIcon;
    public final String selectedName;
    public final String selectedToast;
    public final String toast;
    public final String type;
    public static final MoreOperationItem$a Companion;

    static {
       MoreOperationItem.Companion = new MoreOperationItem$a(null);
    }
    public void MoreOperationItem(String p0,String p1,String p2,String p3,String p4,String p5,boolean p6,String p7,String p8,String p9,String p10){
       a.p(p0, "id");
       a.p(p1, "type");
       a.p(p2, "name");
       a.p(p3, "icon");
       a.p(p4, "darkIcon");
       a.p(p5, "toast");
       a.p(p7, "selectedIcon");
       a.p(p8, "selectedDarkIcon");
       a.p(p9, "selectedName");
       a.p(p10, "selectedToast");
       super();
       this.id = p0;
       this.type = p1;
       this.name = p2;
       this.icon = p3;
       this.darkIcon = p4;
       this.toast = p5;
       this.enableFeedbackDetail = p6;
       this.selectedIcon = p7;
       this.selectedDarkIcon = p8;
       this.selectedName = p9;
       this.selectedToast = p10;
    }
    public static MoreOperationItem copy$default(MoreOperationItem p0,String p1,String p2,String p3,String p4,String p5,String p6,boolean p7,String p8,String p9,String p10,String p11,int p12,Object p13){
       MoreOperationItem moreOperatio = p0;
       int i = p12;
       MoreOperationItem id = (i & 0x01)? moreOperatio.id: p1;
       MoreOperationItem type = (i & 0x02)? moreOperatio.type: p2;
       MoreOperationItem name = (i & 0x04)? moreOperatio.name: p3;
       MoreOperationItem icon = (i & 0x08)? moreOperatio.icon: p4;
       MoreOperationItem darkIcon = (i & 0x10)? moreOperatio.darkIcon: p5;
       MoreOperationItem toast = (i & 0x20)? moreOperatio.toast: p6;
       MoreOperationItem enableFeedba = (i & 0x40)? moreOperatio.enableFeedbackDetail: p7;
       MoreOperationItem selectedIcon = (i & 0x0080)? moreOperatio.selectedIcon: p8;
       MoreOperationItem selectedDark = (i & 0x0100)? moreOperatio.selectedDarkIcon: p9;
       MoreOperationItem selectedName = (i & 0x0200)? moreOperatio.selectedName: p10;
       MoreOperationItem selectedToas = (i & 0x0400)? moreOperatio.selectedToast: p11;
       return p0.copy(id, type, name, icon, darkIcon, toast, enableFeedba, selectedIcon, selectedDark, selectedName, selectedToas);
    }
    public final String component1(){
       return this.id;
    }
    public final String component10(){
       return this.selectedName;
    }
    public final String component11(){
       return this.selectedToast;
    }
    public final String component2(){
       return this.type;
    }
    public final String component3(){
       return this.name;
    }
    public final String component4(){
       return this.icon;
    }
    public final String component5(){
       return this.darkIcon;
    }
    public final String component6(){
       return this.toast;
    }
    public final boolean component7(){
       return this.enableFeedbackDetail;
    }
    public final String component8(){
       return this.selectedIcon;
    }
    public final String component9(){
       return this.selectedDarkIcon;
    }
    public final MoreOperationItem copy(String p0,String p1,String p2,String p3,String p4,String p5,boolean p6,String p7,String p8,String p9,String p10){
       MoreOperationItem obj;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       object oobject6 = p7;
       object oobject7 = p8;
       object oobject8 = p9;
       object oobject9 = p10;
       if (PatchProxy.isSupport(MoreOperationItem.class)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = oobject3;
          objArray[4] = oobject4;
          objArray[5] = oobject5;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject6;
          objArray[8] = oobject7;
          objArray[9] = oobject8;
          objArray[10] = oobject9;
          obj = PatchProxy.apply(objArray, this, MoreOperationItem.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "id");
       a.p(oobject1, "type");
       a.p(oobject2, "name");
       a.p(oobject3, "icon");
       a.p(oobject4, "darkIcon");
       a.p(oobject5, "toast");
       a.p(oobject6, "selectedIcon");
       a.p(oobject7, "selectedDarkIcon");
       a.p(oobject8, "selectedName");
       a.p(oobject9, "selectedToast");
       obj = new MoreOperationItem(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return v12;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoreOperationItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MoreOperationItem && (a.g(this.id, p0.id) && (a.g(this.type, p0.type) && (a.g(this.name, p0.name) && (a.g(this.icon, p0.icon) && (a.g(this.darkIcon, p0.darkIcon) && (a.g(this.toast, p0.toast) && (this.enableFeedbackDetail == p0.enableFeedbackDetail && (a.g(this.selectedIcon, p0.selectedIcon) && (a.g(this.selectedDarkIcon, p0.selectedDarkIcon) && (a.g(this.selectedName, p0.selectedName) && a.g(this.selectedToast, p0.selectedToast))))))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MoreOperationItem obj = PatchProxy.apply(null, this, MoreOperationItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.id;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MoreOperationItem ttype = this.type;
       int i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.name;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.icon;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.darkIcon;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.toast;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.enableFeedbackDetail;
       if (ttype != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       ttype = this.selectedIcon;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.selectedDarkIcon;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.selectedName;
       i2 = (ttype != null)? ttype.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttype = this.selectedToast;
       if (ttype != null) {
          i = ttype.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MoreOperationItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MoreOperationItem\(id="+this.id+", type="+this.type+", name="+this.name+", icon="+this.icon+", darkIcon="+this.darkIcon+", toast="+this.toast+", enableFeedbackDetail="+this.enableFeedbackDetail+", selectedIcon="+this.selectedIcon+", selectedDarkIcon="+this.selectedDarkIcon+", selectedName="+this.selectedName+", selectedToast="+this.selectedToast+"\)";
    }
}
