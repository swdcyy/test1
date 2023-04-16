package com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil$UrlTrackInfo;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil$UrlTrackInfo$UrlFailedInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Thread;
import java.lang.StackTraceElement;

public class BlackUrlUtil$UrlTrackInfo	// class@0018b4
{
    public List mHistoryUrlList;
    public List mUrlFailedInfoList;
    public List stackTrace;

    public void BlackUrlUtil$UrlTrackInfo(){
       super();
       this.mHistoryUrlList = Collections.synchronizedList(new ArrayList());
       this.mUrlFailedInfoList = Collections.synchronizedList(new ArrayList());
       this.stackTrace = new ArrayList();
    }
    public void addErrorInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BlackUrlUtil$UrlTrackInfo.class, "3")) {
          return;
       }
       BlackUrlUtil$UrlTrackInfo$UrlFailedInfo urlTrackInfo = new BlackUrlUtil$UrlTrackInfo$UrlFailedInfo();
       urlTrackInfo.error = p1;
       urlTrackInfo.url = p0;
       this.mUrlFailedInfoList.add(urlTrackInfo);
       return;
    }
    public void addUrlHistory(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BlackUrlUtil$UrlTrackInfo.class, "2")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       if (!this.mHistoryUrlList.isEmpty()) {
          BlackUrlUtil$UrlTrackInfo tmHistoryUrl = this.mHistoryUrlList;
          if ((tmHistoryUrl.get((tmHistoryUrl.size() - 1))).equalsIgnoreCase(p0)) {
             return;
          }
       }
       this.mHistoryUrlList.add(p0);
       return;
    }
    public void snapshotThreadTrace(){
       if (PatchProxy.applyVoid(null, this, BlackUrlUtil$UrlTrackInfo.class, "1")) {
          return;
       }
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       int len = stackTrace.length;
       for (int i = 0; i < len; i = i + 1) {
          this.stackTrace.add(stackTrace[i].toString());
       }
       return;
    }
}
