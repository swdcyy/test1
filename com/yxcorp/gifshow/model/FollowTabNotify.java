package com.yxcorp.gifshow.model.FollowTabNotify;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.FollowTabNotify$TagRenderInfo;
import com.yxcorp.gifshow.model.FollowTabNotify$TabUserInfo;
import java.lang.Boolean;
import ekd.s0;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import java.util.ArrayList;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.Integer;
import ok.k;
import java.util.Collection;
import ekd.q;
import java.util.Map;
import java.util.HashMap;
import com.google.common.collect.Maps;
import java.lang.StringBuilder;

public class FollowTabNotify implements Serializable, Cloneable	// class@001e1a
{
    public boolean b;
    public String mBubbleText;
    public int mClickType;
    public boolean mHasBubble;
    public int mIconStyle;
    public int mMultiIconStyle;
    public long mNotifyId;
    public String mPayload;
    public FollowTabNotify$TagRenderInfo mTagRenderInfo;
    public int mType;
    public String mUUID;
    public int mUnreadCount;
    public boolean mUsed;
    public FollowTabNotify$TabUserInfo mUserInfo;
    public List mUserInfos;
    public static final long serialVersionUID = 0x4d8b543157a6f29e;

    public void FollowTabNotify(){
       super();
       this.mClickType = -1;
    }
    public FollowTabNotify appendClickType(){
       this.b = true;
       return this;
    }
    public FollowTabNotify clone(){
       FollowTabNotify obj = PatchProxy.apply(null, this, FollowTabNotify.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FollowTabNotify();
       obj.mType = this.mType;
       obj.mUnreadCount = this.mUnreadCount;
       FollowTabNotify tmTagRenderI = this.mTagRenderInfo;
       if (tmTagRenderI != null) {
          obj.mTagRenderInfo = tmTagRenderI.clone();
       }
       tmTagRenderI = this.mUserInfo;
       if (tmTagRenderI != null) {
          obj.mUserInfo = tmTagRenderI.clone();
       }
       obj.mNotifyId = this.mNotifyId;
       obj.mPayload = this.mPayload;
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowTabNotify.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mType != p0.mType || !s0.a(this.mUserInfo, p0.mUserInfo)) {
          b = false;
       }
       return b;
    }
    public String getFollowTabNotifyInfo(FollowTabNotify p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, FollowTabNotify.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.valid()) {
          return null;
       }
       try{
          obj = new JSONObject();
          obj.put("type", this.mType);
          obj.put("unreadCount", this.mUnreadCount);
          obj.put("payload", this.mPayload);
          if (p0 != null) {
             FollowTabNotify mUserInfo = p0.mUserInfo;
             if (mUserInfo != null) {
                obj.put("iconAuthorId", mUserInfo.mAuthorId);
             }else if(p0.isMultiUser() && p0.isValidMultiUser()){
                JSONArray jSONArray = new JSONArray();
                Iterator iterator = p0.mUserInfos.iterator();
                while (iterator.hasNext()) {
                   jSONArray.put(iterator.next().mAuthorId);
                }
                obj.put("iconAuthorIds", jSONArray);
             }
          }
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
       }
       return obj.toString();
    }
    public List getMultiUserAvatarUrls(){
       ArrayList obj = PatchProxy.apply(null, this, FollowTabNotify.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!this.isValidMultiUser()) {
          return obj;
       }
       Iterator iterator = this.mUserInfos.iterator();
       while (iterator.hasNext()) {
          FollowTabNotify$TabUserInfo tabUserInfo = iterator.next();
          if (tabUserInfo != null && !TextUtils.x(tabUserInfo.mHeadUrl)) {
             obj.add(tabUserInfo.mHeadUrl);
          }
       }
       return obj;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, FollowTabNotify.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Integer.valueOf(this.mType)};
       return k.b(obj);
    }
    public boolean isCustomHeadUrl(){
       FollowTabNotify obj = PatchProxy.apply(null, this, FollowTabNotify.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mUserInfo;
       boolean b = (obj != null && !TextUtils.x(obj.mHeadUrl))? true: false;
       return b;
    }
    public boolean isFollowTabMultiDynamic(){
       FollowTabNotify obj = PatchProxy.apply(null, this, FollowTabNotify.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isValidMultiUser()) {
          obj = this.mMultiIconStyle;
          if (obj != null && (obj == b || obj == 2)) {
          label_0026 :
             return b;
          }
       }
       b = false;
       goto label_0026 ;
    }
    public boolean isMultiAvatarDynamic(){
       boolean b = true;
       if (this.mType == 5) {
          FollowTabNotify tmMultiIconS = this.mMultiIconStyle;
          if (tmMultiIconS != null && (tmMultiIconS == b || tmMultiIconS == 2)) {
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
    public boolean isMultiHeadUrl(){
       Object obj = PatchProxy.apply(null, this, FollowTabNotify.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.mUserInfos) ^ 0x01);
    }
    public boolean isMultiUser(){
       boolean b = (this.mType == 5)? true: false;
       return b;
    }
    public boolean isSingleAvatarDynamic(){
       Object obj = PatchProxy.apply(null, this, FollowTabNotify.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.isCustomHeadUrl() || this.mIconStyle != b) {
          b = false;
       }
       return b;
    }
    public boolean isValidMultiUser(){
       Iterator obj = PatchProxy.apply(null, this, FollowTabNotify.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.mType == 5 && (q.f(this.mUserInfos) || this.mUserInfos.size() < 3)) {
          return false;
       }
       obj = this.mUserInfos.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          FollowTabNotify$TabUserInfo tabUserInfo = obj.next();
          if (tabUserInfo == null || TextUtils.x(tabUserInfo.mHeadUrl)) {
             break ;
          }
       }
       return false;
    }
    public Map toMaps(){
       HashMap obj = PatchProxy.apply(null, this, FollowTabNotify.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Maps.s();
       obj.put("has_bubble", String.valueOf(this.mHasBubble));
       obj.put("style", String.valueOf(this.mType));
       obj.put("show_num", String.valueOf(this.mUnreadCount));
       obj.put("redpoint_loc", "follow");
       int i = 0;
       obj.put("redpoint_level", String.valueOf(i));
       obj.put("notify_id", String.valueOf(this.mNotifyId));
       boolean b = (this.isCustomHeadUrl() || (this.isMultiUser() && this.isValidMultiUser()))? true: false;
       obj.put("has_head", String.valueOf(b));
       if (!TextUtils.x(this.mUUID)) {
          obj.put("uuid", this.mUUID);
       }
       if (!TextUtils.x(this.mPayload)) {
          obj.put("payload", this.mPayload);
       }
       if (this.b != null) {
          FollowTabNotify tmClickType = this.mClickType;
          if (tmClickType >= null) {
             obj.put("click_type", String.valueOf(tmClickType));
             this.b = i;
          }
       }
       if (this.isCustomHeadUrl()) {
          obj.put("head_author_id", TextUtils.I(this.mUserInfo.mAuthorId));
       }else if(this.isMultiHeadUrl()){
          StringBuilder str = "";
          Iterator iterator = this.mUserInfos.iterator();
          while (iterator.hasNext()) {
             FollowTabNotify$TabUserInfo tabUserInfo = iterator.next();
             if (tabUserInfo != null && !TextUtils.x(tabUserInfo.mAuthorId)) {
                str = str+tabUserInfo.mAuthorId+",";
             }
          }
          if (str.length() > 0) {
             str.deleteCharAt((str.length() - 1));
          }
          obj.put("head_author_id", str);
       }
       return obj;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, FollowTabNotify.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.toMaps();
       String str = PatchProxy.applyOneRefs(obj, objArray, FollowTabNotify.class, "11");
       if (str != patchProxyRe) {
       }else {
          str = new JSONObject(obj).toString();
       }
       return str;
    }
    public boolean valid(){
       FollowTabNotify obj = PatchProxy.apply(null, this, FollowTabNotify.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mType;
       boolean b = true;
       if (obj == b) {
          return b;
       }
       if (obj == 2) {
          if (this.mUnreadCount <= null) {
             b = false;
          }
          return b;
       }else if(obj == 5){
          return this.isValidMultiUser();
       }else if(obj >= 3){
          obj = this.mTagRenderInfo;
          if (obj != null && !TextUtils.x(obj.mUrl)) {
             obj = this.mTagRenderInfo;
             if (obj.mWidth > null && obj.mHeight > null) {
             label_0048 :
                return b;
             }
          }
          b = false;
          goto label_0048 ;
       }else {
          return this.isCustomHeadUrl();
       }
    }
}
