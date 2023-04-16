package b42.b;
import b42.a;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import qvb.n0;
import com.yxcorp.gifshow.model.response.LiveChainPhotoFeedResponse;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo$LiveExtraInfo;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class b extends a	// class@0002f2
{
    public LivePassThruParamExtraInfo v;
    public String w;

    public void b(){
       super();
    }
    public t I1(){
       String str2;
       Object[] objArray = null;
       String str = "1";
       b obj = PatchProxy.apply(objArray, this, b.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object obj1 = b.a(0x330163e);
       b tw = this.w;
       LiveChainPhotoFeedResponse liveChainPho = (!this.K() && this.L0() != null)? this.L0().mCursor: objArray;
       obj = this.v;
       if (obj != null) {
          LivePassThruParamExtraInfo mLiveExtraIn = obj.mLiveExtraInfo;
          if (mLiveExtraIn != null && mLiveExtraIn.mIsLiveChainSideBarNewStyle != null) {
             str = "2";
          }
       }
       String str1 = str;
       if (obj != null) {
          LivePassThruParamExtraInfo mLiveExtraIn1 = obj.mLiveExtraInfo;
          if (mLiveExtraIn1 != null && mLiveExtraIn1.mIsLiveChainSideBarNewStyle != null) {
             str2 = mLiveExtraIn1.mLiveChainSideBarContentRelatedKey;
          label_0055 :
             LivePassThruParamExtraInfo$LiveExtraInfo liveExtraInf = str2;
             if (!this.K() && this.L0() != null) {
                objArray = this.L0().mIdentity;
             }
             return obj1.queryLiveChainSideBarV2(tw, liveChainPho, 10, str1, liveExtraInf, objArray).map(new e()).subscribeOn(d.b).observeOn(d.a);
          }
       }
       str2 = "";
       goto label_0055 ;
    }
    public void j2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (TextUtils.x(this.w)) {
          this.w = p0;
       }
       return;
    }
    public void k2(LivePassThruParamExtraInfo p0){
       this.v = p0;
    }
}
