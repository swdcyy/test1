package com.yxcorp.gifshow.model.response.ulk.CurrentAttribute;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuffer;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;

public class CurrentAttribute implements Serializable	// class@001f99
{
    public String accountFeature;
    public String age;
    public String bizType;
    public String brand;
    public String city;
    public String cityArea;
    public String cityLevel;
    public String deviceFeature;
    public int deviceFeatureValue;
    public String interest;
    public String media;
    public String model;
    public String option;
    public String province;
    public String sex;
    public String simulationLink;
    public static final long serialVersionUID = 0xab1beb27a6fd1425;

    public void CurrentAttribute(){
       super();
    }
    public String getFullAddr(){
       StringBuffer obj = PatchProxy.apply(null, this, CurrentAttribute.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (!TextUtils.isEmpty(this.cityArea)) {
          obj = obj+this.cityArea+"_";
       }
       if (!TextUtils.isEmpty(this.cityLevel)) {
          obj = obj+this.cityLevel+"_";
       }
       if (!TextUtils.isEmpty(this.city)) {
          obj = obj+this.city;
       }
       return obj;
    }
    public String getFullBizStr(){
       StringBuffer obj = PatchProxy.apply(null, this, CurrentAttribute.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (!TextUtils.isEmpty(this.media)) {
          obj = obj+this.media+"_";
       }
       if (!TextUtils.isEmpty(this.bizType)) {
          obj = obj+this.bizType+"_";
       }
       if (!TextUtils.isEmpty(this.option)) {
          obj = obj+this.option;
       }
       return obj;
    }
    public boolean needShowDetailInfo(){
       Object obj = PatchProxy.apply(null, this, CurrentAttribute.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(this.age) && (TextUtils.isEmpty(this.sex) && (TextUtils.isEmpty(this.getFullAddr()) && (TextUtils.isEmpty(this.model) && (!TextUtils.isEmpty(this.getFullBizStr()) || !TextUtils.isEmpty(this.interest))))))? true: false;
       return b;
    }
}
