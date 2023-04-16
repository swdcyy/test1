package com.kwai.feature.api.social.nearby.model.CityInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.kwai.feature.api.social.nearby.model.CityInfo$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import aud.b;
import aud.a;
import aud.c;
import ekd.e0;
import android.content.Context;
import ztd.b;
import java.lang.Boolean;
import ok.k;
import java.lang.Double;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.Integer;

public class CityInfo implements Serializable, Parcelable	// class@00119b
{
    public boolean b;
    public String mBgUrl;
    public String mCityName;
    public String mDesc;
    public String mDistrict;
    public boolean mIsExposed;
    public String mLabel;
    public double mLatitude;
    public double mLongitude;
    public String mPinYin;
    public String mProvince;
    public String mRoamCityId;
    public static final Parcelable$Creator CREATOR;
    public static final long serialVersionUID;

    static {
       CityInfo.CREATOR = new CityInfo$a();
    }
    public void CityInfo(){
       super();
       this.mCityName = "";
    }
    public void CityInfo(Parcel p0){
       super();
       this.mCityName = "";
       this.mCityName = p0.readString();
       this.mLongitude = p0.readDouble();
       this.mLatitude = p0.readDouble();
       this.mPinYin = p0.readString();
       this.mLabel = p0.readString();
       this.mBgUrl = p0.readString();
    }
    public void CityInfo(String p0){
       super();
       this.mCityName = "";
       this.mCityName = p0;
    }
    public void CityInfo(String p0,String p1){
       super();
       this.mCityName = "";
       this.mRoamCityId = p0;
       this.mCityName = p1;
    }
    public void CityInfo(boolean p0){
       super();
       this.mCityName = "";
       this.b = p0;
    }
    public static String parse2PinYinLetter(String p0){
       char c;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, CityInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       b uob = new b();
       uob.c(a.c);
       uob.d(c.c);
       char[] uocharArray = p0.toCharArray();
       int len = uocharArray.length;
       int i = 0;
       while (i < len) {
          c = uocharArray[i];
          obj = (c > 128)? obj+(b.a(e0.b, c, uob)[0]).charAt(0): obj+c;
       label_0046 :
          i = i + 1;
       }
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CityInfo.class, "1");
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
       if (!k.a(this.mCityName, p0.mCityName) || (Double.compare(p0.mLongitude, this.mLongitude) || (Double.compare(p0.mLatitude, this.mLatitude) || (!k.a(p0.mRoamCityId, this.mRoamCityId) || (!k.a(p0.mDistrict, this.mDistrict) || !k.a(p0.mProvince, this.mProvince)))))) {
          b = false;
       }
       return b;
    }
    public String getPinYin(){
       Object obj = PatchProxy.apply(null, this, CityInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mPinYin)) {
          this.mPinYin = CityInfo.parse2PinYinLetter(this.mCityName);
       }
       return this.mPinYin;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, CityInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mCityName,Double.valueOf(this.mLongitude),Double.valueOf(this.mLatitude),this.mRoamCityId,this.mDistrict,this.mProvince};
       return k.b(obj);
    }
    public boolean isLocal(){
       return this.b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CityInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CityInfo{mId=\'"+this.mRoamCityId+'''+", mCityName=\'"+this.mCityName+'''+", mDistrict=\'"+this.mDistrict+'''+", mLongitude="+this.mLongitude+", mLatitude="+this.mLatitude+", mPinYin=\'"+this.mPinYin+'''+", mLabel=\'"+this.mLabel+'''+", mBgUrl=\'"+this.mBgUrl+'''+", mProvince=\'"+this.mProvince+'''+", mDesc=\'"+this.mDesc+'''+", mIsLocal="+this.b+", mIsExposed="+this.mIsExposed+'}';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(CityInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, CityInfo.class, "5")) {
          return;
       }
       p0.writeString(this.mCityName);
       p0.writeDouble(this.mLongitude);
       p0.writeDouble(this.mLatitude);
       p0.writeString(this.mPinYin);
       p0.writeString(this.mLabel);
       p0.writeString(this.mBgUrl);
       return;
    }
}
