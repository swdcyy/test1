package com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$b;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$i;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$g;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog$h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photo.download.widget.q;
import com.yxcorp.gifshow.photo.download.widget.r;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.yxcorp.gifshow.photo.download.widget.p;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;

public class DownloadPicDialog$b implements DownloadPicDialog$i	// class@000f2e
{
    public final DownloadPicDialog a;

    public void DownloadPicDialog$b(DownloadPicDialog p0){
       this.a = p0;
       super();
    }
    public DownloadPicDialog$h a(DownloadPicDialog$g p0){
       q oq;
       p op;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DownloadPicDialog$b uob = DownloadPicDialog$b.class;
       Object[] obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = p0.g();
       boolean b = true;
       if (b == i) {
          i = p0.d();
          File uFile = p0.f();
          if (PatchProxy.isSupport(uob)) {
             oq = PatchProxy.applyTwoRefs(Integer.valueOf(i), uFile, this, uob, "3");
             if (oq != patchProxyRe) {
             label_0045 :
                return oq;
             }
          }
          this.a.H = b;
          oq = new q(this, i, new QPhoto(this.a.x), uFile);
          goto label_0045 ;
       }else {
          Object[] objArray = null;
          if (!i) {
             r or = PatchProxy.apply(objArray, this, uob, "4");
             if (or != patchProxyRe) {
             }else {
                or = new r(this);
             }
             return or;
          }else if(2 == i){
             i = p0.d();
             StatModel statModel = p0.e();
             if (PatchProxy.isSupport(uob)) {
                op = PatchProxy.applyTwoRefs(Integer.valueOf(i), statModel, this, uob, "2");
                if (op != patchProxyRe) {
                label_007f :
                   return op;
                }
             }
             op = new p(this, i, statModel);
             goto label_007f ;
          }else {
             obj = new Object[0];
             e.C().t(DownloadPicDialog.T, "Unexpected type when create "+i, obj);
             return objArray;
          }
       }
    }
}
