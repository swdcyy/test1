package com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfigGsonAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import java.util.Objects;
import com.google.gson.stream.JsonToken;
import fg6.a;
import h16.f;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import h16.d;
import h16.e;
import com.google.gson.stream.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfigGsonAdapter$1;
import com.google.common.reflect.TypeToken;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfigGsonAdapter$2;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfigGsonAdapter$3;

public class BeautifyConfigGsonAdapter extends TypeAdapter	// class@0012cb
{

    public void BeautifyConfigGsonAdapter(){
       super();
    }
    public Object read(a p0){
       BeautifyConfig uBeautifyCon = PatchProxy.applyOneRefs(p0, this, BeautifyConfigGsonAdapter.class, "2");
       if (uBeautifyCon != PatchProxyResult.class) {
       }else {
          uBeautifyCon = new BeautifyConfig();
          p0.c();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x89b7daf2:
                   if (str.equals("defaultIntensity")) {
                      i = 0;
                   }
                   break;
                 case 0xa46a484b:
                   if (str.equals("smoothSkin")) {
                      i = 1;
                   }
                   break;
                 case 0xacd1d138:
                   if (str.equals("bright_item")) {
                      i = 2;
                   }
                   break;
                 case 0xaff25bed:
                   if (str.equals("isV4DownGrade")) {
                      i = 3;
                   }
                   break;
                 case 0xb9a83629:
                   if (str.equals("isReco")) {
                      i = 4;
                   }
                   break;
                 case 0xc866eac6:
                   if (str.equals("use_quick_beauty")) {
                      i = 5;
                   }
                   break;
                 case 0xce19381a:
                   if (str.equals("passThroughParams")) {
                      i = 6;
                   }
                   break;
                 case 0xd9729b50:
                   if (str.equals("intensity_map")) {
                      i = 7;
                   }
                   break;
                 case 0xe914e553:
                   if (str.equals("resourcePath")) {
                      i = 8;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 9;
                   }
                   break;
                 case 0x7e3b982:
                   if (str.equals("faceDeform")) {
                      i = 10;
                   }
                   break;
                 case 0x14f51cd8:
                   if (str.equals("version")) {
                      i = 11;
                   }
                   break;
                 case 0x1dc31833:
                   if (str.equals("intensity")) {
                      i = 12;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uBeautifyCon.mDefaultIntensity = (float)p0.u();
                   break;
                 case 1:
                   if (p0.J() == JsonToken.BEGIN_OBJECT) {
                      uBeautifyCon.mSmoothSkinConfigMap.putAll(a.a.e(p0, new e(this).getType()));
                   }else {
                      p0.Q();
                   }
                   break;
                 case 2:
                   uBeautifyCon.mBrightItem = p0.E();
                   break;
                 case 3:
                   uBeautifyCon.mIsV4Down = p0.s();
                   break;
                 case 4:
                   uBeautifyCon.mIsRecoConfig = p0.s();
                   break;
                 case 5:
                   uBeautifyCon.mUseQuickBeauty = p0.s();
                   break;
                 case 6:
                   uBeautifyCon.mPassThroughParams = p0.E();
                   break;
                 case 7:
                   if (p0.J() == JsonToken.BEGIN_OBJECT) {
                      uBeautifyCon.mBeautyFilterItemIntensityMap.putAll(a.a.e(p0, new d(this).getType()));
                   }else {
                      p0.Q();
                   }
                   break;
                 case 8:
                   uBeautifyCon.mResourcePathKey = p0.E();
                   break;
                 case 9:
                   uBeautifyCon.mId = p0.v();
                   break;
                 case 10:
                   if (p0.J() == JsonToken.BEGIN_OBJECT) {
                      uBeautifyCon.mDeformConfigMap.putAll(a.a.e(p0, new f(this).getType()));
                   }else {
                      p0.Q();
                   }
                   break;
                 case 11:
                   uBeautifyCon.mVersion = p0.v();
                   break;
                 case 12:
                   uBeautifyCon.mIntensity = (float)p0.u();
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
       }
       return uBeautifyCon;
    }
    public void write(b p0,Object p1){
       Gson a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BeautifyConfigGsonAdapter.class, "1")) {
       }else {
          p0.e();
          p0.r("id").K((long)p1.mId);
          p0.r("version").K((long)p1.mVersion);
          p0.r("isV4DownGrade").P(p1.mIsV4Down);
          p0.r("use_quick_beauty").P(p1.mUseQuickBeauty);
          p0.r("bright_item").O(p1.mBrightItem);
          p0.r("resourcePath").O(p1.mResourcePathKey);
          if (p1.mIsRecoConfig != null) {
             p0.r("isReco").P(p1.mIsRecoConfig);
          }
          if (!TextUtils.x(p1.mPassThroughParams)) {
             p0.r("passThroughParams").O(p1.mPassThroughParams);
          }
          BeautifyConfig uBeautifyCon = null;
          if (p1.mIntensity - uBeautifyCon) {
             p0.r("intensity").J((double)p1.mIntensity);
          }
          if (p1.mDefaultIntensity - uBeautifyCon) {
             p0.r("defaultIntensity").J((double)p1.mDefaultIntensity);
          }
          BeautifyConfig mBeautyFilte = p1.mBeautyFilterItemIntensityMap;
          if (mBeautyFilte != null && !mBeautyFilte.isEmpty()) {
             p0.r("intensity_map");
             a.a.v(p1.mBeautyFilterItemIntensityMap, new BeautifyConfigGsonAdapter$1(this).getType(), p0);
          }
          p0.r("smoothSkin");
          a = a.a;
          a.v(p1.mSmoothSkinConfigMap, new BeautifyConfigGsonAdapter$2(this).getType(), p0);
          p0.r("faceDeform");
          a.v(p1.mDeformConfigMap, new BeautifyConfigGsonAdapter$3(this).getType(), p0);
          p0.j();
       }
       return;
    }
}
