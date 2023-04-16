package com.kuaishou.nearby_poi.poi.model.OpenDetailExtParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.yxcorp.gifshow.entity.QPhoto;
import erb.a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public class OpenDetailExtParams implements Serializable	// class@000a30
{
    public PoiButtonInfo mButtonInfo;
    public String mFirstText;
    public String mH5Page;
    public String mHeaderUrl;
    public int mIndex;
    public boolean mIsCollected;
    public String mPage;
    public String mParam;
    public String mParsePath;
    public String mPhotoId;
    public String mPoiAddress;
    public String mPoiId;
    public String mPoiTitle;
    public String mSecondText;
    public String mStartTs;
    public String mStyle;
    public String mUrl;
    public static final long serialVersionUID = 0x34486def77989928;

    public void OpenDetailExtParams(){
       super();
    }
    public final String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OpenDetailExtParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return p0;
       }
       return Uri.decode(p0);
    }
    public a convert2PoiParams(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OpenDetailExtParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "photo");
       a uoa = new a(this.a(this.mHeaderUrl), this.a(this.mPoiTitle), this.a(this.mPoiAddress), Boolean.valueOf(this.mIsCollected), this.mPoiId, p0);
       obj.a = this.mStyle;
       obj.b = this.mFirstText;
       obj.c = this.mSecondText;
       obj.d = this.mButtonInfo;
       return obj;
    }
    public boolean valid(){
       Object obj = PatchProxy.apply(null, this, OpenDetailExtParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mPhotoId) && (!TextUtils.x(this.mUrl) && (!TextUtils.x(this.mParam) && (!TextUtils.x(this.mParsePath) && (!TextUtils.x(this.mH5Page) && !TextUtils.x(this.mStartTs))))))? true: false;
       return b;
    }
}
