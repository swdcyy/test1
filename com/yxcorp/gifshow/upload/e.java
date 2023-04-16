package com.yxcorp.gifshow.upload.e;
import com.ks.ksapi.b;
import com.yxcorp.gifshow.upload.g;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import ln.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import brd.t;
import gnc.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import dnc.h;
import erd.g;
import cjd.a;
import dnc.g;
import njd.a;
import com.yxcorp.gifshow.upload.RickonResumeInfoResponse;
import java.util.ArrayList;
import w46.b;
import java.util.Iterator;
import com.kwai.feature.post.api.feature.upload.model.ServerInfo;
import ln.b$a;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.Error;
import java.lang.Exception;
import com.yxcorp.gifshow.upload.o1;

public class e implements b	// class@001e77
{
    public final UploadInfo a;
    public final String b;
    public final List c;
    public final long d;
    public final String e;
    public final g f;

    public void e(g p0,UploadInfo p1,String p2,List p3,long p4,String p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public b fetchResumeInfo(String p0){
       PostLogger obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "fetchResumeInfo: cachedToken: ";
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "CloudVideoUploader";
       a.D().s(str1, str+p0, objArray);
       obj = new PostLogger().c(str1);
       obj.k(this.a.getSessionId());
       obj = obj.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.getId()).j(PostLogger$Status.PROCESSING).g(str+p0);
       try{
          obj.d();
          t ot = this.f.a.fetchResumeInfo(p0);
          if (!TextUtils.x(this.e)) {
             ot = this.f.a.j(this.e, p0);
             objArray = new Object[i];
             a.D().w(str1, "fetchResumeInfo: resume using url="+this.e, objArray);
          }
          RickonResumeInfoResponse rickonResume = ot.doOnError(a.a(new h(this.a, this.d))).doOnNext(a.a(new g(this.d, p0, this.a))).blockingFirst().a();
          b uob = new b();
          uob.a = rickonResume.mToken;
          uob.d = new ArrayList();
          RickonResumeInfoResponse mFragmentInd = rickonResume.mFragmentIndex;
          uob.b = mFragmentInd;
          if (mFragmentInd < null) {
             objArray = new Object[i];
             a.D().t(str1, "fetchResumeInfo: response.mFragmentIndex is negative ="+rickonResume.mFragmentIndex, objArray);
             uob.b = i;
          }
          Iterator iterator = rickonResume.mServers.iterator();
          while (iterator.hasNext()) {
             ServerInfo serverInfo = iterator.next();
             uob.d.add(new b$a(serverInfo.mHost, serverInfo.mPort, serverInfo.mProtocol));
          }
          return uob;
       }catch(java.lang.RuntimeException e9){
          if (e9.getCause() != null && (!e9.getCause() instanceof Error && !e9.getCause() instanceof RuntimeException)) {
             throw e9.getCause();
          }else {
             throw e9;
          }
       }
    }
    public b fetchRickonToken(){
       PostLogger obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       String str = "CloudVideoUploader";
       String str1 = "fetchRickonToken";
       a.D().s(str, str1, objArray);
       obj = new PostLogger().c(str);
       obj.k(this.a.getSessionId());
       obj.h(PostSubTaskEvent.UPLOAD_ASSET).i(this.a.getId()).j(PostLogger$Status.PROCESSING).g(str1).d();
       try{
          b uob = new b();
          uob.a = this.b;
          uob.d = new ArrayList();
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             ServerInfo serverInfo = iterator.next();
             uob.d.add(new b$a(serverInfo.mHost, serverInfo.mPort, serverInfo.mProtocol));
          }
          o1.i(this.d, "", "", this.b, this.c, this.a.getSessionId(), this.a);
          return uob;
       }catch(java.lang.RuntimeException e0){
          if (e0.getCause() != null && (!e0.getCause() instanceof Error && !e0.getCause() instanceof RuntimeException)) {
             throw e0.getCause();
          }
          throw e0;
       }
    }
}
