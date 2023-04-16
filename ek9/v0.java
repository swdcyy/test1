package ek9.v0;
import erd.g;
import com.yxcorp.gifshow.comment.e;
import com.kuaishou.android.model.mix.QComment;
import android.app.Activity;
import ek9.a;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.e$c;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.CommentPictureResponse;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.model.response.CommentPictureResponse$CommentPictureUploadInfo;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig;
import com.kwai.video.ksuploaderkit.KSUploaderKit;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.yxcorp.gifshow.comment.c;
import com.kwai.video.ksuploaderkit.KSUploaderKitEventListener;
import ek9.m1;
import q87.c;
import java.lang.Throwable;

public final class v0 implements g	// class@0021a7
{
    public final e b;
    public final QComment c;
    public final Activity d;
    public final a e;
    public final String f;
    public final String g;
    public final QPhoto h;
    public final e$c i;

    public void v0(e p0,QComment p1,Activity p2,a p3,String p4,String p5,QPhoto p6,e$c p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final void accept(Object p0){
       v0 ov0 = this;
       v0 b = ov0.b;
       v0 c = ov0.c;
       v0 d = ov0.d;
       v0 e = ov0.e;
       v0 f = ov0.f;
       v0 g = ov0.g;
       v0 h = ov0.h;
       v0 i = ov0.i;
       CommentPictureResponse uCommentPict = p0;
       Objects.requireNonNull(b);
       CommentPictureResponse mCommentPict = uCommentPict.mCommentPictureUploadInfo;
       int i1 = 0;
       if (mCommentPict != null && !mCommentPict.isEmpty()) {
          ArrayList uArrayList = new ArrayList();
          String[] stringArray = new String[uCommentPict.mCommentPictureUploadInfo.size()];
          ArrayList uArrayList1 = new ArrayList();
          if (c != null) {
             stringArray[i1] = c.mQMedia.path;
          }
          if (uCommentPict.mCommentPictureUploadInfo.get(i1) != null) {
             uArrayList1 = uCommentPict.mCommentPictureUploadInfo.get(i1).mEndPointList;
          }
          for (int i2 = 0; i2 < uCommentPict.mCommentPictureUploadInfo.size(); i2 = i2 + 1) {
             uArrayList.add(uCommentPict.mCommentPictureUploadInfo.get(i2).mToken);
          }
          String[] stringArray1 = new String[uArrayList.size()];
          KSUploaderKitConfig kSUploaderKi = new KSUploaderKitConfig(uArrayList.toArray(stringArray1), stringArray, null);
          i1 = 0;
          if (uCommentPict.mCommentPictureUploadInfo.get(i1).mHttpEndPoint != null) {
             kSUploaderKi.setServerHost(uCommentPict.mCommentPictureUploadInfo.get(i1).mHttpEndPoint.get(i1));
          }
          KSUploaderKit kSUploaderKi1 = new KSUploaderKit(d, kSUploaderKi);
          kSUploaderKi1.setExternalEndPoints(uArrayList1, uArrayList.get(i1));
          kSUploaderKi1.setSceneType(KSUploaderKitCommon$SceneType.CommentPicture);
          c uoc = new c(b, d, e, f, g, uArrayList, c, h, i, kSUploaderKi1);
          kSUploaderKi1.setEventListener(uArrayList1);
          kSUploaderKi1.startUpload();
       }else {
          Object[] objArray = new Object[0];
          m1.C().w("CommentHelper", "mCommentPictureUploadInfo is null", objArray);
          b.m(d, h, c, i, new Throwable("mCommentPictureUploadInfo is null"));
       }
       return;
    }
}
