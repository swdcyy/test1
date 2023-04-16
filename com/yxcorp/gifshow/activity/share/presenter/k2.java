package com.yxcorp.gifshow.activity.share.presenter.k2;
import io.reactivex.g;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.io.File;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.yxcorp.gifshow.activity.share.presenter.m2$i;
import java.lang.Boolean;
import com.kuaishou.edit.draft.VideoCoverParam;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.NullPointerException;
import java.lang.Throwable;
import brd.g;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import lnc.d1$a;
import lnc.p6;
import android.graphics.RectF;
import lnc.d1;
import zw8.x4;
import lnc.d1$b;
import zw8.a5;
import erd.g;

public final class k2 implements g	// class@0013f9
{
    public final c b;
    public final Size c;
    public final File d;

    public void k2(c p0,Size p1,File p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       Object[] objArray;
       k2 tb = this.b;
       k2 tc = this.c;
       k2 td = this.d;
       if (PatchProxy.applyVoidFourRefs(tb, tc, td, p0, null, m2.class, "18")) {
       }else {
          a uoa = a.f(tb);
          Cover uCover = uoa.v();
          StringBuilder str = null;
          m2$i oi = new m2$i(Boolean.FALSE);
          int i = 0;
          if (uCover == null || uCover.getVideoCoverParam() == null) {
             objArray = new Object[i];
             a.b().t("SharePreviewPresenter", "realCropCover: coverDraft = "+uCover, objArray);
             p0.onError(new NullPointerException("realCropCover: coverDraft = "+uCover));
          }else {
             String originalFram = uCover.getOriginalFrameFile();
             if (!TextUtils.isEmpty(originalFram)) {
                str = DraftFileManager.E().B(originalFram, uoa);
                oi.setValue(Boolean.TRUE);
             }
             if (str == null || !str.exists()) {
                objArray = new Object[i];
                a.b().t("SharePreviewPresenter", "realCropCover: finalCoverFile = "+td, objArray);
                str = td;
             }
             if (!str.exists()) {
                p0.onError(new NullPointerException("realCropCover: coverFile = "+td));
             }else {
                Bitmap uBitmap = BitmapUtil.q(str);
                if (uBitmap == null) {
                   p0.onError(new NullPointerException("realCropCover: coverBitmap is null, coverFile = "+str));
                }else {
                   d1$a uoa1 = p6.c(uoa, tc);
                   if (uoa1 == null) {
                      p0.onError(new NullPointerException("realCropCover: cropImageData = null"));
                   }else {
                      uoa1.e(uBitmap);
                      if (p6.g(tb)) {
                         p6.i(tb, uoa1.c(), uoa1.b());
                      }
                      d1 uod1 = new d1();
                      uod1.g(new x4(p0, oi, uoa, tc));
                      uod1.f(new a5(p0));
                      uod1.a(uoa1);
                   }
                }
             }
          }
       }
       return;
    }
}
