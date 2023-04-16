package com.yxcorp.gifshow.detail.plc.adapter.BasePlcEntryDataAdapter;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ekd.q;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.net.Uri;
import ekd.x0;
import androidx.collection.ArrayMap;
import android.net.Uri$Builder;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import g4a.c;
import java.util.List;
import v3a.f;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CommentStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$CoverStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$LongVideoStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;

public abstract class BasePlcEntryDataAdapter implements PlcEntryDataAdapter	// class@00165a
{
    public QPhoto mPhoto;
    public PlcEntryStyleInfo mPlcEntryStyleInfo;
    public final PlcEntryStyleInfo$StyleInfo mStyleInfo;
    public static final long serialVersionUID = 0xe1a7fdf88a3d922c;

    public void BasePlcEntryDataAdapter(QPhoto p0,PlcEntryStyleInfo p1){
       super();
       this.mPhoto = p0;
       this.mPlcEntryStyleInfo = p1;
       PlcEntryStyleInfo$StyleInfo styleInfo = (p1 == null)? null: p1.mStyleInfo;
       this.mStyleInfo = styleInfo;
       return;
    }
    public String appendBizRequiredParams(String p0){
       Iterator iterator;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayMap obj = PatchProxy.applyOneRefs(p0, this, BasePlcEntryDataAdapter.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, this, BasePlcEntryDataAdapter.class, "9");
       if (obj != patchProxyRe) {
          objArray = obj;
       }else {
          Map bizRequiredP = this.getBizRequiredParams();
          if (!q.h(bizRequiredP)) {
             objArray = new HashMap();
             Iterator iterator3 = bizRequiredP.entrySet().iterator();
             while (iterator3.hasNext()) {
                Map$Entry uEntry2 = iterator3.next();
                str = uEntry2.getKey();
                String value = uEntry2.getValue();
                if (!TextUtils.x(value) && TextUtils.n(str, "serverExpTag")) {
                   str = r1.I1(this.mPhoto.mEntity);
                   if (!TextUtils.x(str)) {
                      objArray.put(value, str);
                   }
                }
             }
          }
       }
       if (q.h(objArray) || TextUtils.x(p0)) {
       }else {
          try{
             Uri uri = x0.f(p0.trim());
             if (uri == null) {
                return p0;
             }else {
                iterator = uri.getQueryParameterNames().iterator();
                obj = new ArrayMap();
                while (iterator.hasNext()) {
                   str = iterator.next();
                   if (!TextUtils.x(str)) {
                      obj.put(str, TextUtils.I(uri.getQueryParameter(str)));
                   }
                }
                Uri$Builder uBuilder = uri.buildUpon();
                uBuilder.clearQuery();
                Iterator iterator1 = objArray.entrySet().iterator();
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   String key = uEntry.getKey();
                   str = uEntry.getValue();
                   int i = TextUtils.x(str) ^ 0x01;
                   if (i) {
                      obj.put(key, str);
                   }
                }
                Iterator iterator2 = obj.entrySet().iterator();
                while (iterator2.hasNext()) {
                   Map$Entry uEntry1 = iterator2.next();
                   str = uEntry1.getKey();
                   uBuilder.appendQueryParameter(str, uEntry1.getValue());
                }
                return uBuilder.build().toString();
             }
          }catch(java.lang.Exception e0){
             iterator = e0.toString();
          }
          return p0;
       }
    }
    public String getAppIconUrl(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mAppIconUrl);
       return str;
    }
    public String getAppLink(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mAppLink);
       return c.b(str, this.mPhoto, this.mPlcEntryStyleInfo);
    }
    public String getAppName(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mAppName);
       return str;
    }
    public List getAtmosphereBarImage(){
       return f.a(this);
    }
    public List getAvatarImages(){
       return f.b(this);
    }
    public int getBizType(){
       BasePlcEntryDataAdapter tmPlcEntrySt = this.mPlcEntryStyleInfo;
       int i = (tmPlcEntrySt == null)? 0: tmPlcEntrySt.mBizType;
       return i;
    }
    public String getCommentCategoryText(){
       return f.c(this);
    }
    public PlcEntryStyleInfo$CommentStyleInfo getCommentStyleInfo(){
       BasePlcEntryDataAdapter tmStyleInfo = this.mStyleInfo;
       PlcEntryStyleInfo$CommentStyleInfo uCommentStyl = (tmStyleInfo == null)? null: tmStyleInfo.mCommentStyleInfo;
       return uCommentStyl;
    }
    public String getCommentTagInfoText(){
       return f.d(this);
    }
    public int getCoverCategoryMaxLen(){
       return f.e(this);
    }
    public String getCoverCategoryText(){
       return f.f(this);
    }
    public PlcEntryStyleInfo$CoverStyleInfo getCoverStyleInfo(){
       BasePlcEntryDataAdapter tmStyleInfo = this.mStyleInfo;
       PlcEntryStyleInfo$CoverStyleInfo uCoverStyleI = (tmStyleInfo == null)? null: tmStyleInfo.mCoverStyleTemplateInfo;
       return uCoverStyleI;
    }
    public int getCoverStyleSubType(){
       return f.g(this);
    }
    public String getFileName(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mAppName);
       return str;
    }
    public String getIconLeftLabel(){
       return f.h(this);
    }
    public List getIconUrls(){
       return null;
    }
    public PlcEntryStyleInfo$LongVideoStyleInfo getLongVideoStyleInfo(){
       BasePlcEntryDataAdapter tmStyleInfo = this.mStyleInfo;
       PlcEntryStyleInfo$LongVideoStyleInfo longVideoSty = (tmStyleInfo == null)? null: tmStyleInfo.mLongVideoStyleTemplateInfo;
       return longVideoSty;
    }
    public String getMarketUri(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPlcEntryStyleInfo;
       String str = "";
       if (obj == null) {
          return str;
       }
       PlcEntryStyleInfo mAdData = obj.mAdData;
       if (mAdData != null && !TextUtils.x(mAdData.mMarketUri)) {
          return this.mPlcEntryStyleInfo.mAdData.mMarketUri;
       }
       obj = this.mStyleInfo;
       if (obj != null) {
          str = TextUtils.I(obj.mMarketUri);
       }
       return str;
    }
    public String getPackageName(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mPackageName);
       return str;
    }
    public QPhoto getPhoto(){
       return this.mPhoto;
    }
    public PlcEntryStyleInfo getPlcEntryStyleInfo(){
       return this.mPlcEntryStyleInfo;
    }
    public int getStrongCategoryMaxLen(){
       return f.i(this);
    }
    public String getStrongCategoryText(){
       return f.j(this);
    }
    public String getStrongHighLightIcon(){
       return f.k(this);
    }
    public List getStrongMultiHighLightLabel(){
       return f.l(this);
    }
    public List getStrongStyleItems(){
       return null;
    }
    public String getStrongTagInfoText(){
       return f.m(this);
    }
    public String getSubscriptDescription(){
       BasePlcEntryDataAdapter obj = PatchProxy.apply(null, this, BasePlcEntryDataAdapter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStyleInfo;
       String str = (obj == null)? "": TextUtils.I(obj.mSubscriptDescription);
       return str;
    }
    public int getWeakCategoryMaxLen(){
       return f.n(this);
    }
    public String getWeakCategoryText(){
       return f.o(this);
    }
    public int getWeakStyleSubType(){
       return f.p(this);
    }
    public String getWeakTagInfoText(){
       return f.q(this);
    }
    public boolean haveStyleTransition(){
       return f.r(this);
    }
    public boolean isEnableCommentLabelArrow(){
       return f.s(this);
    }
    public boolean isHidePlcAfterStrongDisappear(){
       BasePlcEntryDataAdapter tmPlcEntrySt = this.mPlcEntryStyleInfo;
       PlcEntryStyleInfo$StyleInfo styleInfo = (tmPlcEntrySt == null)? null: tmPlcEntrySt.mStyleInfo;
       boolean b = (styleInfo != null && styleInfo.mHidePlcAfterStrongDisappear != null)? true: false;
       return b;
    }
    public boolean isRoundCornerIcon(){
       return f.t(this);
    }
    public boolean isShowAdLabelInDetail(){
       BasePlcEntryDataAdapter tmStyleInfo = this.mStyleInfo;
       boolean b = (tmStyleInfo != null && tmStyleInfo.mShowAdLabelInDetail != null)? true: false;
       return b;
    }
}
