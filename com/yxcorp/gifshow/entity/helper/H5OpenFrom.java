package com.yxcorp.gifshow.entity.helper.H5OpenFrom;
import java.io.Serializable;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import ekd.w0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Number;

public class H5OpenFrom implements Serializable	// class@000dd5
{
    public String mDid;
    public String mFeedId;
    public String mFrom;
    public String mPosition;
    public String mShareType;
    public String mURL;
    public static final long serialVersionUID = 0x1;

    public void H5OpenFrom(){
       super();
    }
    public static H5OpenFrom fromIntent(Intent p0){
       H5OpenFrom obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, H5OpenFrom.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Uri data = p0.getData();
       if (data == null) {
          return obj;
       }
       String str = w0.a(data, "openFrom");
       if (TextUtils.x(str)) {
          return obj;
       }
       try{
          obj = a.a.h(str, H5OpenFrom.class);
          return obj;
       }catch(com.google.gson.JsonSyntaxException e0){
       }
    }
    public int getFromPage(){
       H5OpenFrom obj = PatchProxy.apply(null, this, H5OpenFrom.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mShareType;
       if (obj == null) {
          return 48;
       }
       if (obj.contains("copylink")) {
          return 36;
       }
       if ((this.mShareType).contains("wxms")) {
          return 40;
       }
       if ((this.mShareType).contains("wxtl")) {
          return 41;
       }
       if ((this.mShareType).contains("qq_friend") || (this.mShareType).contains("qqms")) {
          return 39;
       }
       if ((this.mShareType).contains("qq_zone") || (this.mShareType).contains("qzone")) {
          return 38;
       }
       if ((this.mShareType).contains("sina") || (this.mShareType).contains("weibo")) {
          return 37;
       }
       if ((this.mShareType).contains("intown")) {
          return 54;
       }
       return 48;
    }
}
