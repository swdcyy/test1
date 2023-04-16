package com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoResponse$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfoData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfo;
import java.util.Objects;
import com.yxcorp.gifshow.commercial.response.NeoFeedTabInfo$a;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import qrd.l1;
import java.util.List;

public final class NeoFeedTabInfoResponse$a	// class@00115c
{

    public void NeoFeedTabInfoResponse$a(){
       super();
    }
    public void NeoFeedTabInfoResponse$a(u p0){
       super();
    }
    public final NeoFeedTabInfoData a(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       Object obj = PatchProxy.apply(null, this, NeoFeedTabInfoResponse$a.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       NeoFeedTabInfo$a companion = NeoFeedTabInfo.Companion;
       Objects.requireNonNull(companion);
       NeoFeedTabInfo obj1 = PatchProxy.apply(null, companion, NeoFeedTabInfo$a.class, str);
       if (obj1 != patchProxyRe) {
          str1 = obj1;
       }else {
          String str2 = a1.p(R.string.arg_RES_7f103c3f);
          a.o(str2, "CommonUtil.string\(R.string.photo_recommend\)");
          str1 = str2;
       }
       obj1 = new NeoFeedTabInfo(0, str1, null, 5, null);
       ArrayList uArrayList = new ArrayList(1);
       uArrayList.add(obj);
       return new NeoFeedTabInfoData(null, uArrayList, 1, null);
    }
}
