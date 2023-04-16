package com.feature.post.bridge.util.d$a;
import r26.e;
import java.lang.String;
import og.b1;
import w26.c;
import java.lang.Object;
import r26.a;
import com.feature.post.bridge.jsmodel.PostVideoUploadResult;
import java.lang.Math;
import com.feature.post.bridge.jsmodel.PostVideoUploadResult$ShopUploadData;
import og.r;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import java.io.File;
import og.l;
import q87.c;
import com.feature.post.bridge.util.c;
import com.feature.post.bridge.util.d$b;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.postwork.PostStatus;
import java.lang.Enum;

public class d$a implements e	// class@0014cc
{
    public boolean b;
    public final String c;
    public final int d;
    public final b1 e;
    public final c f;

    public void d$a(String p0,int p1,b1 p2,c p3){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       super();
       this.b = false;
    }
    public void V4(float p0,a p1){
       d$a tc;
       if (p1 != null && p1.getId() == this.d) {
          PostVideoUploadResult postVideoUpl = new PostVideoUploadResult(p1, "");
          postVideoUpl.mData.mProgress = String.valueOf(Math.min(100, (int)(100.00f * p0)));
          r or = new r(this, p0, postVideoUpl, this.e);
          if (this.b != null) {
             or.a("");
          }else if(TextUtils.x(this.c) && (p1.getUploadInfo() == null || p1.getUploadInfo().getCoverFile() == null)){
             Object[] objArray = new Object[0];
             l.D().w("PostMediaHelper", "have no cover file and \(empty uploadInfo or empty uploadCoverFile\)", objArray);
             or.a("");
          }else if(!TextUtils.x(this.c)){
             tc = this.c;
          }else {
             tc = p1.getUploadInfo().getCoverFile().getAbsolutePath();
          }
          c.a(new c(tc, or));
       }
       return;
    }
    public void w9(PostStatus p0,a p1){
       if (p1 != null && p1.getId() == this.d) {
          Object[] objArray = new Object[]{p0.toString()};
          Object[] objArray1 = new Object[0];
          l.D().w("PostMediaHelper", String.format("onStatusChanged status=%s", objArray), objArray1);
          PostStatus uPLOAD_COMPL = PostStatus.UPLOAD_COMPLETE;
          if (p0 == uPLOAD_COMPL) {
             this.e.a(new PostVideoUploadResult(p1, "success"));
          }else if(p0 != PostStatus.ENCODE_FAILED && (p0 != PostStatus.UPLOAD_FAILED && (p0 == PostStatus.ENCODE_CANCELED || p0 == PostStatus.UPLOAD_CANCELED))){
             this.e.a(new PostVideoUploadResult(p1, "failed"));
          }
          if (p0 != uPLOAD_COMPL && (p0 == PostStatus.UPLOAD_FAILED || p0 == PostStatus.UPLOAD_CANCELED)) {
             this.e.c(this, this.f);
          }
       }
    label_0064 :
       return;
    }
}
