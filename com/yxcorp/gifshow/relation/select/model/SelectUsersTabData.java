package com.yxcorp.gifshow.relation.select.model.SelectUsersTabData;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SelectUsersTabData implements Serializable	// class@0019aa
{
    public final String emptyMsg;
    public final String tabTitle;
    public final int tabType;

    public void SelectUsersTabData(){
       super(0, null, null, 7, null);
    }
    public void SelectUsersTabData(int p0,String p1,String p2){
       a.p(p1, "tabTitle");
       a.p(p2, "emptyMsg");
       super();
       this.tabType = p0;
       this.tabTitle = p1;
       this.emptyMsg = p2;
    }
    public void SelectUsersTabData(int p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = "È«²¿";
       }
       if (p3 & 0x04) {
          p2 = a1.p(R.string.arg_RES_7f100d2c);
          a.o(p2, "CommonUtil.string\(R.string.empty_prompt\)");
       }
       super(p0, p1, p2);
       return;
    }
    public static SelectUsersTabData copy$default(SelectUsersTabData p0,int p1,String p2,String p3,int p4,Object p5){
       SelectUsersTabData tabType;
       SelectUsersTabData tabTitle;
       SelectUsersTabData emptyMsg;
       if (p4 & 0x01) {
          tabType = p0.tabType;
       }
       if (p4 & 0x02) {
          tabTitle = p0.tabTitle;
       }
       if (p4 & 0x04) {
          emptyMsg = p0.emptyMsg;
       }
       return p0.copy(tabType, tabTitle, emptyMsg);
    }
    public final int component1(){
       return this.tabType;
    }
    public final String component2(){
       return this.tabTitle;
    }
    public final String component3(){
       return this.emptyMsg;
    }
    public final SelectUsersTabData copy(int p0,String p1,String p2){
       if (PatchProxy.isSupport(SelectUsersTabData.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, SelectUsersTabData.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "tabTitle");
       a.p(p2, "emptyMsg");
       return new SelectUsersTabData(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersTabData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SelectUsersTabData && (this.tabType == p0.tabType && (a.g(this.tabTitle, p0.tabTitle) && a.g(this.emptyMsg, p0.emptyMsg))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SelectUsersTabData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.tabType * 31;
       SelectUsersTabData ttabTitle = this.tabTitle;
       int i1 = 0;
       int i2 = (ttabTitle != null)? ttabTitle.hashCode(): 0;
       i = (i + i2) * 31;
       ttabTitle = this.emptyMsg;
       if (ttabTitle != null) {
          i1 = ttabTitle.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SelectUsersTabData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SelectUsersTabData\(tabType="+this.tabType+", tabTitle="+this.tabTitle+", emptyMsg="+this.emptyMsg+"\)";
    }
}
