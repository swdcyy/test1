package n0a.b;
import qvb.f;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.commonfeedslide.CommonFeedSlideParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import o0a.a;
import wkd.b;
import n0a.a;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.detail.fragments.milano.commonfeedslide.network.feed.CommonFeedSlideResponse;
import la6.b;
import kp.y1;
import tkd.b;
import tkd.d;
import ayb.i;
import com.kwai.feature.api.feed.growth.model.XinhuiDetailSurveyModel;

public class b extends f	// class@0030ad
{
    public String p;
    public String q;
    public CommonFeedSlideParams r;
    public String s;

    public void b(){
       super();
    }
    public t I1(){
       b uob = b.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          return objArray;
       }
       if (TextUtils.x(obj.mPath)) {
          return objArray;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "3") && !q.f(this.r.mPhotoIds)) {
          StringBuilder str = "";
          Iterator iterator = this.r.mPhotoIds.iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next()+",";
          }
          this.q = str;
       }
       uob = this.r;
       return b.a(0xd12d7a4).a(uob.mPath, new a(this.r.mHostKey), uob.mSelectedPhotoId, this.q, uob.mPageSize, this.p, uob.mServerExtraInfo, this.s).map(new e());
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(CommonFeedSlideResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       List list = this.W1(p0, p1);
       if (list == null) {
          return;
       }
       y1.c(list, p0.mLlsid);
       p1.addAll(list);
       this.V1(list);
       this.p = p0.getCursor();
       this.s = p0.mPassthroughExtraInfo;
       if (p0.mXinhuiDetailSurvey != null) {
          d.a(0x4f878389).zz(p0.mXinhuiDetailSurvey);
       }
       return;
    }
    public void i2(CommonFeedSlideParams p0){
       this.r = p0;
       this.p = p0.mCursor;
    }
}
