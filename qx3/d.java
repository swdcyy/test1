package qx3.d;
import hx3.o;
import iv.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jo4.d;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo$a;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.home2.feed.model.UnknownFeed;
import java.lang.Boolean;
import ny3.b;
import java.util.Map;
import java.lang.Integer;
import ly3.a;
import com.kuaishou.merchant.home2.feed.model.PhotoFeed;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public abstract class d extends o	// class@003b90
{

    public void d(){
       super();
    }
    public a l(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.b("KEY_CHANNEL_MODEL");
       if (!obj instanceof d) {
          return p0;
       }
       p0.d("MERCHANT_HOME_FEED_CHANNEL", FeedChannelInfo.Companion.a(obj));
       return p0;
    }
    public Object m(a p0){
       Boolean uBoolean;
       a uoa;
       PhotoFeed mVideoQPhoto;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = null;
       UnknownFeed modelObj = (p0 != null)? p0.getModelObj(): obj;
       if (modelObj instanceof BaseFeed) {
          modelObj = (p0 != null)? p0.getModelObj(): obj;
          if (!modelObj instanceof BaseFeed) {
             modelObj = obj;
          }
       }else {
          a.g(MerchantHomeLogBiz.Feed, "FeedNativeWidget", "Feed Model Parse Error");
          Object obj2 = new UnknownFeed();
       }
       if (modelObj != null) {
          uBoolean = (p0 != null)? Boolean.valueOf(p0.isFromCache): obj;
          modelObj.mCache = uBoolean.booleanValue();
       }
       String str = "1";
       uBoolean = PatchProxy.applyOneRefs(modelObj, obj, b.class, str);
       if (uBoolean != patchProxyRe) {
          obj = uBoolean;
       }else {
          b uob = new b();
          Integer integer = b.f.get(modelObj.getClass());
          if (integer != null) {
             uob.b = integer.intValue();
             uob.c = modelObj;
             Object obj1 = PatchProxy.applyOneRefs(modelObj, obj, a.class, str);
             if (obj1 != patchProxyRe) {
                uoa = obj1;
             }else if(modelObj instanceof PhotoFeed){
                mVideoQPhoto = modelObj.mVideoQPhoto;
             }else if(modelObj instanceof LiveFeed){
                mVideoQPhoto = modelObj.mQPhoto;
             }else {
                mVideoQPhoto = obj;
             }
             if (mVideoQPhoto != null && mVideoQPhoto.isAd()) {
                r1.Y4(mVideoQPhoto.mEntity, modelObj.mListLoadSequenceID);
                uoa = new a(mVideoQPhoto);
             }
             uob.d = uoa;
             obj = uob;
          }
       }
       if (obj == null) {
          obj = new b();
       }
       return obj;
    }
}
