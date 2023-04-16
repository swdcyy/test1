package com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import java.io.Serializable;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams$a;
import nsd.u;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SelectUsersConfigParams implements Serializable	// class@0019a6
{
    public int searchType;
    public int selectType;
    public List tabList;
    public static final SelectUsersConfigParams$a Companion;

    static {
       SelectUsersConfigParams.Companion = new SelectUsersConfigParams$a(null);
    }
    public void SelectUsersConfigParams(){
       super(0, 0, null, 7, null);
    }
    public void SelectUsersConfigParams(int p0,int p1,List p2){
       a.p(p2, "tabList");
       super();
       this.selectType = p0;
       this.searchType = p1;
       this.tabList = p2;
    }
    public void SelectUsersConfigParams(int p0,int p1,List p2,int p3,u p4){
       ArrayList uArrayList;
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          uArrayList = new ArrayList();
       }
       super(p0, p1, uArrayList);
       return;
    }
    public static SelectUsersConfigParams copy$default(SelectUsersConfigParams p0,int p1,int p2,List p3,int p4,Object p5){
       SelectUsersConfigParams selectType;
       SelectUsersConfigParams searchType;
       SelectUsersConfigParams tabList;
       if (p4 & 0x01) {
          selectType = p0.selectType;
       }
       if (p4 & 0x02) {
          searchType = p0.searchType;
       }
       if (p4 & 0x04) {
          tabList = p0.tabList;
       }
       return p0.copy(selectType, searchType, tabList);
    }
    public final int component1(){
       return this.selectType;
    }
    public final int component2(){
       return this.searchType;
    }
    public final List component3(){
       return this.tabList;
    }
    public final SelectUsersConfigParams copy(int p0,int p1,List p2){
       if (PatchProxy.isSupport(SelectUsersConfigParams.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, SelectUsersConfigParams.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "tabList");
       return new SelectUsersConfigParams(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersConfigParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SelectUsersConfigParams && (this.selectType == p0.selectType && (this.searchType == p0.searchType && a.g(this.tabList, p0.tabList))))) {
          return true;
       }
       return false;
    }
    public final int getSearchType(){
       return this.searchType;
    }
    public final int getSelectType(){
       return this.selectType;
    }
    public final List getTabList(){
       return this.tabList;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, SelectUsersConfigParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((this.selectType * 31) + this.searchType) * 31;
       SelectUsersConfigParams ttabList = this.tabList;
       int i1 = (ttabList != null)? ttabList.hashCode(): 0;
       return (i + i1);
    }
    public final boolean isDefaultSearch(){
       boolean b = (this.searchType == null)? true: false;
       return b;
    }
    public final boolean isDisableSearch(){
       boolean b = (this.searchType == 2)? true: false;
       return b;
    }
    public final boolean isMultiSelect(){
       boolean b = true;
       if (this.selectType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean isOnlySingleSelect(){
       boolean b = (this.selectType == 2)? true: false;
       return b;
    }
    public final boolean isPreviewSearch(){
       boolean b = true;
       if (this.searchType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public final boolean isSingleSelect(){
       boolean b = (this.selectType == null)? true: false;
       return b;
    }
    public final void setDefaultSearch(){
       this.searchType = 0;
    }
    public final void setMultiSelect(){
       this.selectType = 1;
    }
    public final void setSearchType(int p0){
       this.searchType = p0;
    }
    public final void setSelectType(int p0){
       this.selectType = p0;
    }
    public final void setTabList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersConfigParams.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.tabList = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SelectUsersConfigParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SelectUsersConfigParams\(selectType="+this.selectType+", searchType="+this.searchType+", tabList="+this.tabList+"\)";
    }
}
