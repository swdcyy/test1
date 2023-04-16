package com.yxcorp.gifshow.util.resource.g$a;
import brd.y;
import com.yxcorp.gifshow.util.resource.g;
import java.lang.String;
import com.yxcorp.gifshow.util.resource.g$d;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.feature.post.api.model.DownloadStatus;
import com.yxcorp.gifshow.util.resource.f;
import qfc.a;
import q87.c;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroupResponse;
import java.util.List;
import java.util.Iterator;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.io.File;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import crd.b;

public class g$a implements y	// class@000ce7
{
    public final String b;
    public final g$d c;
    public final g d;

    public void g$a(g p0,String p1,g$d p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onComplete(){
    }
    public void onError(Throwable p0){
       this.d.k(DownloadStatus.DOWNLOAD_FAILED);
       Object[] objArray = new Object[0];
       a.C().t("CategoryDialog", "downloadFilterData error", objArray);
    }
    public void onNext(Object p0){
       p0 = p0.getAllFilters().iterator();
       while (p0.hasNext()) {
          FilterConfig uFilterConfi = p0.next();
          if (uFilterConfi.mSourceType == null) {
             FilterConfig mFilterResou = uFilterConfi.mFilterResources;
             if (mFilterResou == null) {
                continue ;
             }else {
                Iterator iterator = mFilterResou.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (!new File(this.b, iterator.next()).exists()) {
                         this.c.a.add(uFilterConfi);
                      }else {
                         continue ;
                      }
                   }else {
                      continue ;
                   }
                }
                this.d.m(this.c);
                return;
             }
          }else if(TextUtils.x(e0.c(uFilterConfi.mZipSourceFile))){
             continue ;
          }else {
             File uFile = new File(this.b, uFilterConfi.getUnZipDir());
             if (uFile.exists() && (!uFile.isDirectory() || uFile.listFiles().length <= 0)) {
                this.c.a.add(uFilterConfi);
             }
          }
       }
    }
    public void onSubscribe(b p0){
    }
}
