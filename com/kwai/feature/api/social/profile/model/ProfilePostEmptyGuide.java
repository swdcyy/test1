package com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.social.profile.model.ContentType;
import fx5.g;
import lnc.c3$a;
import lnc.c3;
import fg6.a;
import com.kwai.feature.api.social.profile.model.ProfilePostEmptyGuide$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;

public class ProfilePostEmptyGuide implements a	// class@0011b0
{
    public Map b;
    public a c;
    public String mContentJson;
    public String mExtraInfo;
    public String mType;

    public void ProfilePostEmptyGuide(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ProfilePostEmptyGuide.class, "1")) {
          return;
       }
       try{
          if (!TextUtils.x(this.mType) && !TextUtils.x(this.mContentJson)) {
             c3.c(ContentType.fromType(this.mType), new g(this));
          }
          if (!TextUtils.x(this.mExtraInfo)) {
             this.b = a.a.i(this.mExtraInfo, new ProfilePostEmptyGuide$a(this).getType());
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
