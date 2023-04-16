package com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$d;
import gb7.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.Throwable;
import java.io.IOException;
import java.lang.Long;
import java.lang.Integer;
import w46.b;

public final class KSDownloadHelperX$d implements c	// class@0019f2
{
    public final KSDownloadHelperX a;
    public final KSTemplateDetailInfo b;
    public final String c;

    public void KSDownloadHelperX$d(KSDownloadHelperX p0,KSTemplateDetailInfo p1,String p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDownloadHelperX$d.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "downloadUrl");
       KSDownloadHelperX$d ta = this.a;
       KSDownloadHelperX$d tb = this.b;
       KSDownloadHelperX$d tc = this.c;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, ta, KSDownloadHelperX.class, "15")) {
          Object[] objArray = new Object[0];
          e.D().s("KS_Hodor", "onCancel : "+tb.mTemplateId, objArray);
          ta.q(tb, tc);
       }
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KSDownloadHelperX$d.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "path");
       a.p(p2, "downloadUrl");
       KSDownloadHelperX$d ta = this.a;
       KSDownloadHelperX$d tb = this.b;
       KSDownloadHelperX$d tc = this.c;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidThreeRefs(tb, tc, p1, ta, KSDownloadHelperX.class, "17")) {
          Object[] objArray = new Object[0];
          e.D().s("KS_Hodor", "onComplete : "+tb.mTemplateId, objArray);
          PostBaseResourceDownloadHelper$a uoa = ta.c.get(tb.mTemplateId);
          if (uoa != null) {
             uoa.a(tb, p1);
          }
          ta.q(tb, tc);
       }
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, KSDownloadHelperX$d.class, "3")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "e");
       KSDownloadHelperX$d ta = this.a;
       KSDownloadHelperX$d tb = this.b;
       KSDownloadHelperX$d tc = this.c;
       String message = p1.getMessage();
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidThreeRefs(tb, tc, message, ta, KSDownloadHelperX.class, "16")) {
          Object[] objArray = new Object[0];
          e.D().s("KS_Hodor", "onFailed : "+tb.mTemplateId+" with "+message, objArray);
          PostBaseResourceDownloadHelper$a uoa = ta.c.get(tb.mTemplateId);
          if (uoa != null) {
             if (message == null) {
                message = "";
             }
             uoa.c(tb, new IOException(message));
          }
          ta.q(tb, tc);
       }
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(KSDownloadHelperX$d.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, KSDownloadHelperX$d.class, "4")) {
          return;
       }
       a.p(p0, "id");
       KSDownloadHelperX$d ta = this.a;
       KSDownloadHelperX$d tb = this.b;
       int i = (int)p1;
       int i1 = (int)p2;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(KSDownloadHelperX.class) || !PatchProxy.applyVoidThreeRefs(tb, Integer.valueOf(i), Integer.valueOf(i1), ta, KSDownloadHelperX.class, "14")) {
          if (i1 <= 0) {
             Object[] objArray = new Object[0];
             e.D().t("KS_Hodor", "Invalid total size for target file.", objArray);
          }else {
             PostBaseResourceDownloadHelper$a uoa = ta.c.get(tb.mTemplateId);
             if (uoa != null) {
                uoa.b(tb, i, i1);
             }
          }
       }
       return;
    }
}
