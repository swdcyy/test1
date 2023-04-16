package com.kuaishou.live.core.show.share.e$a;
import uo7.r;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.String;
import sj2.s;
import java.lang.ref.SoftReference;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.apiservice.KsDefaultMgr;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;
import java.util.UUID;
import com.kuaishou.live.core.show.share.e;
import com.kwai.sdk.switchconfig.a;
import com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import lnc.a1;
import com.yxcorp.gifshow.share.OperationModelUtil;
import mhc.x;
import mhc.o2;
import xv8.b;
import com.yxcorp.gifshow.model.CDNUrl;

public class e$a extends r	// class@001010
{
    public LiveStreamFeed a;
    public String b;
    public SoftReference c;

    public void e$a(LiveStreamFeed p0,String p1,s p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new SoftReference(p2);
    }
    public ShareAnyResponse a(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, e$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KsDefaultMgr.c.c();
       boolean b = false;
       if (obj == null) {
          obj = UUID.randomUUID().toString();
          i = -1;
       }else {
          i = 0;
       }
       s os = this.c.get();
       if (os != null) {
          os.j = i;
       }
       e$a ta = this.a;
       e$a tb = this.b;
       ShareAnyResponse shareAnyResp = PatchProxy.applyFourRefs(ta, tb, p0, obj, null, e.class, "19");
       if (shareAnyResp != patchProxyRe) {
       }else if(!a.t().d("enableShareAnyGlobalBackupData", b)){
          shareAnyResp = null;
       }else {
          shareAnyResp = new ShareAnyResponse();
          ShareAnyResponse$ShareAnyData shareAnyData = new ShareAnyResponse$ShareAnyData();
          shareAnyResp.mShareAnyData = shareAnyData;
          String str = (("copyLink").equals(p0))? "TOKEN": "CARD";
          shareAnyData.mShareMethod = str;
          ShareAnyResponse mShareAnyDat = shareAnyResp.mShareAnyData;
          mShareAnyDat.mShareMode = "APP";
          mShareAnyDat.mShareChannel = p0;
          mShareAnyDat.mSubBiz = tb;
          mShareAnyDat.mShareObject = new ShareAnyResponse$ShareObject();
          shareAnyData = shareAnyResp.mShareAnyData.mShareObject;
          shareAnyData.mShareId = obj;
          obj = (r1.b3(ta))? a1.p(R.string.arg_RES_7f104630): a1.r(R.string.arg_RES_7f104774, r1.V1(ta));
          shareAnyData.mTitle = obj;
          shareAnyResp.mShareAnyData.mShareObject.mSubTitle = OperationModelUtil.a.b(r1.p0(ta));
          shareAnyResp.mShareAnyData.mShareObject.mShareUrl = b.d(r1.U1(ta), o2.i(p0).y0(), ta);
          CDNUrl[] uCDNUrlArray = r1.F0(ta);
          String[] stringArray = new String[uCDNUrlArray.length];
          shareAnyResp.mShareAnyData.mShareObject.mCoverUrls = stringArray;
          for (; b < uCDNUrlArray.length; b = b + 1) {
             shareAnyResp.mShareAnyData.mShareObject.mCoverUrls[b] = uCDNUrlArray[b].mUrl;
          }
          ShareAnyResponse$ShareAnyData mShareObject = shareAnyResp.mShareAnyData.mShareObject;
          mShareObject.mShareMessage = mShareObject.mShareUrl;
       }
       return shareAnyResp;
    }
}
