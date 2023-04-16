package com.kwai.user.base.db.entity.FollowUser;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.model.user.User;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k75.b;
import ekd.f0;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.util.HashMap;
import lc5.b;

public class FollowUser implements Serializable	// class@001985
{
    public String mGender;
    public List mHeadCDNUrls;
    public String mHeadUrl;
    public List mHeadUrls;
    public String mId;
    public String mName;
    public String mNameAbbr;
    public String mNamePY;
    public String mRelation;
    public String mRemarkName;
    public String mRemarkNameAbbr;
    public String mRemarkNamePY;
    public static final long serialVersionUID = 0x771353c491cccc8e;

    public void FollowUser(){
       super();
    }
    public void FollowUser(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,List p9,List p10,String p11){
       super();
       this.mId = p0;
       this.mName = p1;
       this.mNamePY = p2;
       this.mNameAbbr = p3;
       this.mRemarkName = p4;
       this.mRemarkNamePY = p5;
       this.mRemarkNameAbbr = p6;
       this.mGender = p7;
       this.mHeadUrl = p8;
       this.mHeadUrls = p9;
       this.mHeadCDNUrls = p10;
       this.mRelation = p11;
    }
    public CDNUrl[] getCDNUrlArray(){
       CDNUrl[] uCDNUrlArray1;
       FollowUser obj = PatchProxy.apply(null, this, FollowUser.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!q.f(this.mHeadCDNUrls)) {
          obj = this.mHeadCDNUrls;
          CDNUrl[] uCDNUrlArray = new CDNUrl[obj.size()];
          return obj.toArray(uCDNUrlArray);
       }else {
          int i = 0;
          if (!q.f(this.mHeadUrls)) {
             uCDNUrlArray1 = new CDNUrl[this.mHeadUrls.size()];
             for (; i < this.mHeadUrls.size(); i = i + 1) {
                uCDNUrlArray1[i] = new CDNUrl("", this.mHeadUrls.get(i));
             }
          }else {
             uCDNUrlArray1 = new CDNUrl[i];
          }
          return uCDNUrlArray1;
       }
    }
    public String getMGender(){
       return this.mGender;
    }
    public List getMHeadCDNUrls(){
       return this.mHeadCDNUrls;
    }
    public String getMHeadUrl(){
       return this.mHeadUrl;
    }
    public List getMHeadUrls(){
       return this.mHeadUrls;
    }
    public String getMId(){
       return this.mId;
    }
    public String getMName(){
       return this.mName;
    }
    public String getMNameAbbr(){
       return this.mNameAbbr;
    }
    public String getMNamePY(){
       return this.mNamePY;
    }
    public String getMRelation(){
       return this.mRelation;
    }
    public String getMRemarkName(){
       return this.mRemarkName;
    }
    public String getMRemarkNameAbbr(){
       return this.mRemarkNameAbbr;
    }
    public String getMRemarkNamePY(){
       return this.mRemarkNamePY;
    }
    public void setMGender(String p0){
       this.mGender = p0;
    }
    public void setMHeadCDNUrls(List p0){
       this.mHeadCDNUrls = p0;
    }
    public void setMHeadUrl(String p0){
       this.mHeadUrl = p0;
    }
    public void setMHeadUrls(List p0){
       this.mHeadUrls = p0;
    }
    public void setMId(String p0){
       this.mId = p0;
    }
    public void setMName(String p0){
       this.mName = p0;
    }
    public void setMNameAbbr(String p0){
       this.mNameAbbr = p0;
    }
    public void setMNamePY(String p0){
       this.mNamePY = p0;
    }
    public void setMRelation(String p0){
       this.mRelation = p0;
    }
    public void setMRemarkName(String p0){
       this.mRemarkName = p0;
    }
    public void setMRemarkNameAbbr(String p0){
       this.mRemarkNameAbbr = p0;
    }
    public void setMRemarkNamePY(String p0){
       this.mRemarkNamePY = p0;
    }
    public User toQUser(){
       Object obj = PatchProxy.apply(null, this, FollowUser.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       User user = new User(this.mId, this.mName, this.mGender, this.mHeadUrl, this.getCDNUrlArray());
       int i = 1;
       if ((String.valueOf(i)).equals(this.mRelation)) {
          obj.setFriend(i);
       }
       FollowUser tmRelation = this.mRelation;
       i = (tmRelation != null)? Integer.valueOf(tmRelation).intValue(): 2;
       obj.setRelation(i);
       return obj;
    }
    public void updateNamePY(){
       if (PatchProxy.applyVoid(null, this, FollowUser.class, "1")) {
          return;
       }
       if (!TextUtils.x(this.mName)) {
          this.mNamePY = b.a(this.mName);
          this.mNameAbbr = f0.e(this.mName);
       }
       if (!TextUtils.x(this.mRemarkName)) {
          this.mRemarkNamePY = b.a(this.mRemarkName);
          this.mRemarkNameAbbr = f0.e(this.mRemarkName);
       }
       return;
    }
}
