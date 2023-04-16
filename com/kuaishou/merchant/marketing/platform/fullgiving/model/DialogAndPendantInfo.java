package com.kuaishou.merchant.marketing.platform.fullgiving.model.DialogAndPendantInfo;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.DialogAndPendantInfo$a;
import nsd.u;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.Lottery;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.RedPackage;
import java.lang.Integer;
import java.util.List;
import com.kuaishou.merchant.marketing.platform.fullgiving.model.TaskInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DialogAndPendantInfo implements Serializable	// class@001b24
{
    public Lottery lottery;
    public RedPackage redPackage;
    public Integer status;
    public TaskInfo taskInfo;
    public List widgetItems;
    public static final DialogAndPendantInfo$a Companion;
    public static final long serialVersionUID;

    static {
       DialogAndPendantInfo.Companion = new DialogAndPendantInfo$a(null);
    }
    public void DialogAndPendantInfo(Lottery p0,RedPackage p1,Integer p2,List p3,TaskInfo p4){
       super();
       this.lottery = p0;
       this.redPackage = p1;
       this.status = p2;
       this.widgetItems = p3;
       this.taskInfo = p4;
    }
    public static DialogAndPendantInfo copy$default(DialogAndPendantInfo p0,Lottery p1,RedPackage p2,Integer p3,List p4,TaskInfo p5,int p6,Object p7){
       DialogAndPendantInfo lottery;
       DialogAndPendantInfo redPackage;
       DialogAndPendantInfo status;
       DialogAndPendantInfo widgetItems;
       DialogAndPendantInfo taskInfo;
       if (p6 & 0x01) {
          lottery = p0.lottery;
       }
       if (p6 & 0x02) {
          redPackage = p0.redPackage;
       }
       p7 = redPackage;
       if (p6 & 0x04) {
          status = p0.status;
       }
       DialogAndPendantInfo uDialogAndPe = status;
       if (p6 & 0x08) {
          widgetItems = p0.widgetItems;
       }
       DialogAndPendantInfo uDialogAndPe1 = widgetItems;
       if (p6 & 0x10) {
          taskInfo = p0.taskInfo;
       }
       return p0.copy(lottery, p7, uDialogAndPe, uDialogAndPe1, taskInfo);
    }
    public final Lottery component1(){
       return this.lottery;
    }
    public final RedPackage component2(){
       return this.redPackage;
    }
    public final Integer component3(){
       return this.status;
    }
    public final List component4(){
       return this.widgetItems;
    }
    public final TaskInfo component5(){
       return this.taskInfo;
    }
    public final DialogAndPendantInfo copy(Lottery p0,RedPackage p1,Integer p2,List p3,TaskInfo p4){
       Object obj;
       if (PatchProxy.isSupport(DialogAndPendantInfo.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, DialogAndPendantInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       DialogAndPendantInfo uDialogAndPe = new DialogAndPendantInfo(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DialogAndPendantInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof DialogAndPendantInfo && (a.g(this.lottery, p0.lottery) && (a.g(this.redPackage, p0.redPackage) && (a.g(this.status, p0.status) && (a.g(this.widgetItems, p0.widgetItems) && a.g(this.taskInfo, p0.taskInfo))))))) {
          return true;
       }
       return false;
    }
    public final Lottery getLottery(){
       return this.lottery;
    }
    public final RedPackage getRedPackage(){
       return this.redPackage;
    }
    public final Integer getStatus(){
       return this.status;
    }
    public final TaskInfo getTaskInfo(){
       return this.taskInfo;
    }
    public final List getWidgetItems(){
       return this.widgetItems;
    }
    public int hashCode(){
       DialogAndPendantInfo obj = PatchProxy.apply(null, this, DialogAndPendantInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.lottery;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       DialogAndPendantInfo tredPackage = this.redPackage;
       int i2 = (tredPackage != null)? tredPackage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tredPackage = this.status;
       i2 = (tredPackage != null)? tredPackage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tredPackage = this.widgetItems;
       i2 = (tredPackage != null)? tredPackage.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tredPackage = this.taskInfo;
       if (tredPackage != null) {
          i = tredPackage.hashCode();
       }
       return (i1 + i);
    }
    public final void setLottery(Lottery p0){
       this.lottery = p0;
    }
    public final void setRedPackage(RedPackage p0){
       this.redPackage = p0;
    }
    public final void setStatus(Integer p0){
       this.status = p0;
    }
    public final void setTaskInfo(TaskInfo p0){
       this.taskInfo = p0;
    }
    public final void setWidgetItems(List p0){
       this.widgetItems = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DialogAndPendantInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DialogAndPendantInfo\(lottery="+this.lottery+", redPackage="+this.redPackage+", status="+this.status+", widgetItems="+this.widgetItems+", taskInfo="+this.taskInfo+"\)";
    }
}
