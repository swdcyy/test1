package com.yxcorp.gifshow.model.SelectUsersBundle;
import java.io.Serializable;
import java.lang.Object;
import java.util.LinkedHashSet;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Set;
import java.lang.Integer;
import com.yxcorp.gifshow.model.SelectUsersBundle$ToastLevel;
import java.lang.Enum;

public class SelectUsersBundle implements Serializable	// class@001e8b
{
    public int bizId;
    public Set checkedUsers;
    public String extraParams;
    public int finishButtonTextId;
    public boolean hasSetLimitToast;
    public boolean isFromPanel;
    public boolean isHalfScreen;
    public boolean isNewPanelV3;
    public String limitConditions;
    public int limitCount;
    public String logExtraParams;
    public boolean needUseCache;
    public String searchText;
    public String title;

    public void SelectUsersBundle(){
       super();
       this.bizId = -1;
       this.needUseCache = false;
       this.checkedUsers = new LinkedHashSet();
       this.finishButtonTextId = -1;
       this.extraParams = "";
       this.logExtraParams = "";
       this.isHalfScreen = false;
       this.isFromPanel = false;
       this.isNewPanelV3 = false;
       this.searchText = "";
       this.hasSetLimitToast = false;
    }
    public SelectUsersBundle addLimitCondition(String p0,Object p1){
       CharSequence[] obj = PatchProxy.applyTwoRefs(p0, p1, this, SelectUsersBundle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 1;
       try{
          obj = new CharSequence[i];
          obj[0] = this.limitConditions;
          JSONObject jSONObject = (TextUtils.y(obj))? new JSONObject(): new JSONObject(this.limitConditions);
          this.limitConditions = jSONObject.put(p0, p1).toString();
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
       }
       return this;
    }
    public int getBizId(){
       return this.bizId;
    }
    public Set getCheckedUsers(){
       return this.checkedUsers;
    }
    public String getExtraParams(){
       return this.extraParams;
    }
    public int getFinishButtonTextId(){
       return this.finishButtonTextId;
    }
    public String getLimitConditions(){
       return this.limitConditions;
    }
    public int getLimitNum(){
       return this.limitCount;
    }
    public String getLogExtraParams(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SelectUsersBundle obj = PatchProxy.apply(null, this, SelectUsersBundle.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.isHalfScreen == null) {
          return this.logExtraParams;
       }
       obj = this.logExtraParams;
       String str = PatchProxy.applyOneRefs(obj, this, SelectUsersBundle.class, "2");
       if (str != patchProxyRe) {
       }else if(obj.length()){
          str1 = "&is_half=true";
       }else {
          str1 = "is_half=true";
       }
       str = obj.concat(str1);
       return str;
    }
    public String getSearchText(){
       SelectUsersBundle tsearchText;
       String obj = PatchProxy.apply(null, this, SelectUsersBundle.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.x(this.searchText))? "": this.searchText;
       return obj;
    }
    public String getTitle(){
       return this.title;
    }
    public boolean hasLimitToast(){
       return this.hasSetLimitToast;
    }
    public boolean isFromPanel(){
       return this.isFromPanel;
    }
    public boolean isHalfScreen(){
       return this.isHalfScreen;
    }
    public boolean isNeedUseCache(){
       return this.needUseCache;
    }
    public boolean isNewPanelV3(){
       return this.isNewPanelV3;
    }
    public SelectUsersBundle setBizId(int p0){
       this.bizId = p0;
       return this;
    }
    public SelectUsersBundle setCheckedUsers(Set p0){
       this.checkedUsers = p0;
       return this;
    }
    public SelectUsersBundle setExtraParams(String p0){
       this.extraParams = p0;
       return this;
    }
    public SelectUsersBundle setFinishButtonTextId(int p0){
       this.finishButtonTextId = p0;
       return this;
    }
    public SelectUsersBundle setFromPanel(boolean p0){
       this.isFromPanel = p0;
       return this;
    }
    public SelectUsersBundle setHalfScreen(boolean p0){
       this.isHalfScreen = p0;
       return this;
    }
    public SelectUsersBundle setLimitNum(int p0){
       if (PatchProxy.isSupport(SelectUsersBundle.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SelectUsersBundle.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.limitCount = p0;
       return this.addLimitCondition("KEY_SELECT_LIMIT_NUM", Integer.valueOf(p0));
    }
    public SelectUsersBundle setLimitToast(int p0){
       if (PatchProxy.isSupport(SelectUsersBundle.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SelectUsersBundle.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.hasSetLimitToast = true;
       return this.addLimitCondition("KEY_SELECT_LIMIT_TOAST", Integer.valueOf(p0));
    }
    public SelectUsersBundle setLimitToastLevel(SelectUsersBundle$ToastLevel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersBundle.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.addLimitCondition("KEY_SELECT_LIMIT_TOAST_LEVEL", Integer.valueOf(p0.ordinal()));
    }
    public SelectUsersBundle setLogExtraParams(String p0){
       this.logExtraParams = p0;
       return this;
    }
    public SelectUsersBundle setNeedUseCache(boolean p0){
       this.needUseCache = p0;
       return this;
    }
    public SelectUsersBundle setNewPanelV3(boolean p0){
       this.isNewPanelV3 = p0;
       return this;
    }
    public SelectUsersBundle setSearchText(String p0){
       this.searchText = p0;
       return this;
    }
    public SelectUsersBundle setSingleFollowLimitNum(int p0){
       if (PatchProxy.isSupport(SelectUsersBundle.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SelectUsersBundle.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.addLimitCondition("KEY_SELECT_SINGLE_FOLLOW_LIMIT_NUM", Integer.valueOf(p0));
    }
    public SelectUsersBundle setSingleFollowLimitToast(int p0){
       if (PatchProxy.isSupport(SelectUsersBundle.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SelectUsersBundle.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.addLimitCondition("KEY_SELECT_SINGLE_FOLLOW_LIMIT_TOAST", Integer.valueOf(p0));
    }
    public SelectUsersBundle setTitle(String p0){
       this.title = p0;
       return this;
    }
}
