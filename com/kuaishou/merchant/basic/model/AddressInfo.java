package com.kuaishou.merchant.basic.model.AddressInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import java.lang.Integer;

public class AddressInfo implements Serializable	// class@0015c3
{
    public String mAddUri;
    public String mAddress;
    public long mAddressId;
    public int mAddressStatus;
    public int mAddressType;
    public String mCity;
    public long mCityCode;
    public String mConsignee;
    public boolean mDisableChange;
    public String mDisableReason;
    public String mDistrict;
    public long mDistrictCode;
    public String mEditUri;
    public String mIdentifyKey;
    public int mIsDefault;
    public String mListUri;
    public String mMobile;
    public String mNameEtc;
    public String mProvince;
    public long mProvinceCode;
    public String mRegion;
    public long mTownCode;
    public String mTownName;
    public int mUriType;
    public long mUserId;
    public static final long serialVersionUID = 0x5d2525e6b02b0098;

    public void AddressInfo(){
       super();
       this.mUriType = 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AddressInfo.class, "5");
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
       if (this.mAddressId - p0.mAddressId || (this.mUserId - p0.mUserId || (this.mProvinceCode - p0.mProvinceCode || (this.mCityCode - p0.mCityCode || (this.mDistrictCode - p0.mDistrictCode || (this.mTownCode - p0.mTownCode || (this.mAddressStatus != p0.mAddressStatus || (this.mIsDefault != p0.mIsDefault || (this.mAddressType != p0.mAddressType || (this.mDisableChange != p0.mDisableChange || (!d.a(this.mConsignee, p0.mConsignee) || (!d.a(this.mMobile, p0.mMobile) || (!d.a(this.mProvince, p0.mProvince) || (!d.a(this.mCity, p0.mCity) || (!d.a(this.mDistrict, p0.mDistrict) || (!d.a(this.mTownName, p0.mTownName) || (!d.a(this.mAddress, p0.mAddress) || !d.a(this.mDisableReason, p0.mDisableReason)))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public long getAddressId(){
       long l;
       AddressInfo obj = PatchProxy.apply(null, this, AddressInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = (this.isValid())? this.mAddressId: 0;
       return obj;
    }
    public String getAddressInfo(){
       StringBuilder obj = PatchProxy.apply(null, this, AddressInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (!TextUtils.x(this.mConsignee)) {
          obj = obj+this.mConsignee+" ";
       }
       if (!TextUtils.x(this.mMobile)) {
          obj = obj+this.mMobile+" ";
       }
       if (!TextUtils.x(this.mAddress)) {
          obj = obj+this.mAddress;
       }
       return obj;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, AddressInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[16];
       obj[0] = Long.valueOf(this.mAddressId);
       obj[1] = Long.valueOf(this.mUserId);
       obj[2] = this.mConsignee;
       obj[3] = this.mMobile;
       obj[4] = Long.valueOf(this.mProvinceCode);
       obj[5] = this.mProvince;
       obj[6] = Long.valueOf(this.mCityCode);
       obj[7] = this.mCity;
       obj[8] = Long.valueOf(this.mDistrictCode);
       obj[9] = this.mDistrict;
       obj[10] = Long.valueOf(this.mTownCode);
       obj[11] = this.mTownName;
       obj[12] = this.mAddress;
       obj[13] = Integer.valueOf(this.mAddressStatus);
       obj[14] = Integer.valueOf(this.mIsDefault);
       obj[15] = Integer.valueOf(this.mAddressType);
       return d.b(obj);
    }
    public boolean isDefaultAddress(){
       boolean b = true;
       if (this.mIsDefault == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isValid(){
       boolean b = (this.mAddressId > 0)? true: false;
       return b;
    }
    public void updateAddressInfo(AddressInfo p0,boolean p1){
       if (PatchProxy.isSupport(AddressInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, AddressInfo.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.mAddressId = p0.mAddressId;
       this.mUserId = p0.mUserId;
       this.mConsignee = p0.mConsignee;
       this.mMobile = p0.mMobile;
       this.mProvinceCode = p0.mProvinceCode;
       this.mProvince = p0.mProvince;
       this.mCityCode = p0.mCityCode;
       this.mCity = p0.mCity;
       this.mDistrictCode = p0.mDistrictCode;
       this.mDistrict = p0.mDistrict;
       this.mTownCode = p0.mTownCode;
       this.mTownName = p0.mTownName;
       this.mAddress = p0.mAddress;
       this.mAddressStatus = p0.mAddressStatus;
       this.mIsDefault = p0.mIsDefault;
       this.mAddressType = p0.mAddressType;
       this.mDisableChange = p0.mDisableChange;
       this.mDisableReason = p0.mDisableReason;
       if (p1) {
          this.updateAddressUriIfNeeded(p0.mAddressId);
       }
       return;
    }
    public void updateAddressUriIfNeeded(long p0){
       if (PatchProxy.isSupport(AddressInfo.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, AddressInfo.class, "4")) {
          return;
       }
       if (p0 - null <= 0) {
          return;
       }
       if (!TextUtils.x(this.mEditUri)) {
          this.mEditUri = TextUtils.c(this.mEditUri, "addressId", String.valueOf(p0));
       }
       if (!TextUtils.x(this.mListUri)) {
          this.mListUri = TextUtils.c(this.mListUri, "addressId", String.valueOf(p0));
       }
       return;
    }
}
