package com.yxcorp.gifshow.model.ProfileTemplateCard;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.Integer;
import java.io.ObjectInputStream;
import java.util.List;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import ok.j$b;
import ok.j;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import com.google.gson.JsonElement;

public class ProfileTemplateCard implements Serializable	// class@001e81
{
    public int mBizType;
    public ProfileTemplateCard$ButtonInfo mButtonInfo;
    public int mCardType;
    public String mCardTypeName;
    public int mCardViewStyle;
    public String mDarkIconUrl;
    public List mDarkIconUrls;
    public JsonObject mExtra;
    public String mIconUrl;
    public List mIconUrls;
    public int mIndex;
    public boolean mIsTopSerial;
    public String mKsOrderId;
    public String mLinkUrl;
    public String mMainTitle;
    public ProfileTemplateCard$ProfileCardRedDot mProfileCardRedDot;
    public boolean mShowed;
    public String mSubTitle;
    public String mTagText;
    public static final long serialVersionUID = 0x8e0135763be39181;

    public void ProfileTemplateCard(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileTemplateCard.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof ProfileTemplateCard) {
          return false;
       }
       if (this.mCardType != p0.mCardType || (!k.a(this.mIconUrl, p0.mIconUrl) || (!k.a(this.mMainTitle, p0.mMainTitle) || (!k.a(this.mSubTitle, p0.mSubTitle) || (!k.a(this.mLinkUrl, p0.mLinkUrl) || (!k.a(this.mTagText, p0.mTagText) || (this.mBizType != p0.mBizType || (!k.a(this.mKsOrderId, p0.mKsOrderId) || (!k.a(this.mIconUrls, p0.mIconUrls) || (!k.a(this.mExtra, p0.mExtra) || !k.a(this.mCardTypeName, p0.mCardTypeName))))))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, ProfileTemplateCard.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[11];
       obj[0] = this.mIconUrl;
       obj[1] = this.mMainTitle;
       obj[2] = this.mSubTitle;
       obj[3] = this.mLinkUrl;
       obj[4] = this.mTagText;
       obj[5] = Integer.valueOf(this.mBizType);
       obj[6] = Integer.valueOf(this.mCardType);
       obj[7] = this.mKsOrderId;
       obj[8] = this.mIconUrls;
       obj[9] = this.mExtra;
       obj[10] = this.mCardTypeName;
       return k.b(obj);
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCard.class, "5")) {
          return;
       }
       this.mIconUrl = p0.readObject();
       this.mMainTitle = p0.readObject();
       this.mSubTitle = p0.readObject();
       this.mLinkUrl = p0.readObject();
       this.mCardTypeName = p0.readObject();
       this.mBizType = p0.readInt();
       this.mCardType = p0.readInt();
       this.mCardViewStyle = p0.readInt();
       this.mKsOrderId = p0.readObject();
       this.mIconUrls = p0.readObject();
       this.mDarkIconUrl = p0.readObject();
       this.mDarkIconUrls = p0.readObject();
       this.mProfileCardRedDot = p0.readObject();
       this.mButtonInfo = p0.readObject();
       String str = p0.readObject();
       if (!TextUtils.isEmpty(str)) {
          this.mExtra = a.a.h(str, JsonObject.class);
       }
       return;
    }
    public String toString(){
       j$b obj = PatchProxy.apply(null, this, ProfileTemplateCard.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = j.b(this);
       obj.c("mMainTitle", this.mMainTitle);
       obj.a("mBizType", this.mBizType);
       return obj.toString();
    }
    public final void writeObject(ObjectOutputStream p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCard.class, "4")) {
          return;
       }
       ProfileTemplateCard tmIconUrl = this.mIconUrl;
       String str = "";
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = this.mMainTitle;
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = this.mSubTitle;
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = this.mLinkUrl;
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = this.mCardTypeName;
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       p0.writeInt(this.mBizType);
       p0.writeInt(this.mCardType);
       p0.writeInt(this.mCardViewStyle);
       tmIconUrl = this.mKsOrderId;
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = this.mIconUrls;
       if (tmIconUrl == null) {
          ArrayList uArrayList = new ArrayList();
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = this.mDarkIconUrl;
       if (tmIconUrl == null) {
          str1 = str;
       }
       p0.writeObject(tmIconUrl);
       tmIconUrl = (this.mDarkIconUrls != null)? this.mIconUrls: new ArrayList();
       p0.writeObject(tmIconUrl);
       tmIconUrl = (this.mProfileCardRedDot != null)? this.mDarkIconUrl: str;
       p0.writeObject(tmIconUrl);
       p0.writeObject(this.mButtonInfo);
       tmIconUrl = this.mExtra;
       if (tmIconUrl != null) {
          str = tmIconUrl.toString();
       }
       p0.writeObject(str);
       return;
    }
}
