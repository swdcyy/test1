package com.yxcorp.gifshow.ad.webview.jshandler.dto.NeoDetailData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.ads.AdNeoInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.util.Base64;
import fg6.a;
import ok.c;
import java.nio.charset.Charset;
import com.google.gson.Gson;
import java.lang.Throwable;
import yx.j0;

public class NeoDetailData implements Serializable	// class@001901
{
    public int mAction;
    public AdNeoInfo mAdInfo;
    public String mDetailSessionId;
    public String mNeoParams;
    public static final long serialVersionUID = 0xda4e16fc31b3ea48;

    public void NeoDetailData(){
       super();
    }
    public boolean checkAdInfo(){
       NeoDetailData tmAdInfo = this.mAdInfo;
       boolean b = (tmAdInfo != null && (tmAdInfo.mPageId > 0 && tmAdInfo.mSubPageId > 0))? true: false;
       return b;
    }
    public void decodeNeoParams(){
       if (PatchProxy.applyVoid(null, this, NeoDetailData.class, "1")) {
          return;
       }
       if (TextUtils.x(this.mNeoParams)) {
          return;
       }
       this.mAdInfo = a.a.h(new String(Base64.decode(this.mNeoParams, 8), c.c), AdNeoInfo.class);
       return;
    }
}
