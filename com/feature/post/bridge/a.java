package com.feature.post.bridge.a;
import n3d.a;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import f55.g;
import r16.f;
import q46.r;
import java.lang.Object;
import android.content.Intent;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult$UploadData;
import java.lang.String;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumResult;
import java.io.Serializable;
import ekd.j0;
import java.util.List;
import java.lang.Exception;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.models.QMedia;
import qkd.b;
import brd.a0;
import mg.r0;
import erd.o;
import t45.d;
import brd.z;
import mg.n0;
import com.feature.post.bridge.b;
import erd.g;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.post.api.feature.upload.model.RickonWholeUploadParams;
import com.feature.post.bridge.j;

public final class a implements a	// class@00146b
{
    public final JsUploadVideoFromAlbumParams b;
    public final g c;
    public final f d;
    public final r e;

    public void a(JsUploadVideoFromAlbumParams p0,g p1,f p2,r p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a uoa = this;
       int i = p1;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       int i1 = 0;
       if (!i) {
          c.onSuccess(new JsUploadVideoFromAlbumResult(new JsUploadVideoFromAlbumResult$UploadData(b.mTaskId, "", "0"), i1));
       }else if(i == -1){
          List list = j0.e(p2, "album_data_list");
          if (list == null) {
             i1.c(new Exception("Result QMedia data list is null"));
          }else {
             QMedia qMedia = list.get(i1);
             QMedia path = qMedia.path;
             QMedia duration = qMedia.duration;
             n0 on0 = v6;
             n0 on01 = v6;
             a uoa1 = e;
             on0 = new n0(b, qMedia.size, b.z(path), duration, c);
             a0.B(path).C(new r0(path)).T(d.c).G(d.a).R(on01, b.b);
             if (b.mFinishedParams != null && !TextUtils.x(path)) {
                d.J1(b.mTaskId, path, duration, b.generateWholeUploadParams());
             }
             j.a(uoa1, b.mTaskId, c);
          }
       }
       return;
    }
}
