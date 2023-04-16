package h31.a;
import ok.h;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse$AnchorReinforceInfo;
import com.kwai.robust.PatchProxyResult;
import h31.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.util.Base64;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import ms5.a;
import ekd.j;
import ms5.a$a;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;

public final class a implements h	// class@00260e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo sCLiveAuthor = PatchProxy.applyOneRefs(p0, obj, l.class, "11");
       if (sCLiveAuthor != patchProxyRe) {
       }else if(p0 == null || TextUtils.x(p0.mReinforceInfoBasePb64)){
       label_0037 :
          sCLiveAuthor = obj;
       }else {
          try{
             sCLiveAuthor = LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo.parseFrom(Base64.decode(p0.mReinforceInfoBasePb64, 0));
          }catch(java.lang.IllegalArgumentException e3){
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e3){
          }
          b.H(LiveLogTag.TOP_USER, "parseAnchorReinforceError", "biz", p0.mBiz, e3);
          goto label_0037 ;
       }
       p0 = PatchProxy.applyOneRefs(sCLiveAuthor, obj, l.class, "10");
       if (p0 != patchProxyRe) {
          obj = p0;
       }else if(sCLiveAuthor == null || j.h(sCLiveAuthor.imageUrlNew)){
          p0 = new a$a(e0.i(sCLiveAuthor.imageUrlNew));
          p0.e(sCLiveAuthor.routerUrl);
          p0.f = sCLiveAuthor.animStyle;
          p0.f(sCLiveAuthor.showDurationMs);
          p0.b(sCLiveAuthor.biz);
          p0.a = sCLiveAuthor.priority;
          p0.d(sCLiveAuthor.delayDurationMs);
          obj = p0.a();
       }
       return obj;
    }
}
