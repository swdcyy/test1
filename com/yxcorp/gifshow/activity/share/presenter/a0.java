package com.yxcorp.gifshow.activity.share.presenter.a0;
import erd.o;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import java.lang.Object;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer$PhotoInfo;
import com.kuaishou.android.model.mix.CoverMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.feature.post.api.feature.hotspot.RelatedHotspot;
import java.lang.String;
import da6.c;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer$VideoInfo;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$EditCoverInfo;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import a26.a;
import e46.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Workspace$Type;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import zw8.y;
import com.yxcorp.gifshow.activity.share.presenter.p1;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ln6.a;
import android.content.Context;
import jn6.b;
import ln6.b;
import android.view.ViewGroup;
import android.view.View;
import android.view.ViewTreeObserver;
import zw8.n3;
import java.lang.Runnable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class a0 implements o	// class@0013bb
{
    public final c0 b;
    public final PhotoEditInfo c;
    public final PhotoEditInfo d;

    public void a0(c0 p0,PhotoEditInfo p1,PhotoEditInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       boolean b1;
       a uoa1;
       a0 uoa0 = this;
       a0 b = uoa0.b;
       a0 c = uoa0.c;
       a0 d = uoa0.d;
       PreviewPlayer$PhotoInfo photoInfo = p0;
       if (b.D == null) {
          PreviewPlayer$PhotoInfo mInteractSti = photoInfo.mInteractStickerInfo;
          if (mInteractSti != null) {
             b.D = mInteractSti;
          }
       }
       if (!b.b9(c) && b.G.getCoverMeta() != null) {
          d.setInteractStickerInfo(b.D);
          if (c != null && c.getRelatedHotspot() != null) {
             d.setRelatedHotspot(c.getRelatedHotspot());
          }
          b.G.getCoverMeta().f("PHOTO_EDIT_INFO", d);
       }
       PreviewPlayer$PhotoInfo mVideoInfoLi = photoInfo.mVideoInfoList;
       ArrayList uArrayList = new ArrayList(mVideoInfoLi.size());
       for (int i = 0; i < mVideoInfoLi.size(); i = i + 1) {
          uArrayList.add(mVideoInfoLi.get(i).mPhotoFilePath);
       }
       PreviewPlayer$VideoInfo mSize = photoInfo.mVideoInfoList.get(0).mSize;
       if (d.getClientEditCoverInfo() != null) {
          d.getClientEditCoverInfo().setAssetWidth(mSize.b);
          d.getClientEditCoverInfo().setAssetHeight(mSize.c);
          d.getClientEditCoverInfo().setOriginCoverPath(photoInfo.mOriginCoverPath);
       }
       a uoa = new a(0x2712);
       uoa.h = b.a(b.G);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, uoa, a.class, "3")) {
          a.p(uArrayList, "<set-?>");
          uoa.d = uArrayList;
       }
       uoa.c = d;
       uoa.f(b.E);
       uoa.g(b.S);
       uoa.i = photoInfo.mCoverThumbnail;
       if (b.D != null) {
          c0 s = b.S;
          if (s != Workspace$Type.SINGLE_PICTURE && s != Workspace$Type.KTV_SONG) {
             b1 = true;
          label_00d1 :
             b.P = b1;
             Object[] objArray = new Object[0];
             a.b().w("ShareBasePreviewPresenter", "startEdit mNeedInteractStickerInfo is "+b.P, objArray);
             if (b.P != null) {
                c0 d1 = b.D;
                uoa.e = d1;
                y oy = new y(b, uoa);
                if (PatchProxy.applyVoidFourRefs(d1, mSize, uoa, oy, b, c0.class, "32")) {
                label_0165 :
                   uoa1 = uoa;
                }else {
                   b.R.u(d1);
                   s = b.R;
                   Objects.requireNonNull(s);
                   y oy1 = oy;
                   uoa1 = uoa;
                   PreviewPlayer$VideoInfo videoInfo = mSize;
                   if (!PatchProxy.applyVoidThreeRefs(mSize, uoa, oy, s, p1.class, "15")) {
                      if (s.n == null) {
                         s.a(d.a(-863649994).b00(s.q, s.p.getType(), s.p));
                         s.r.setVisibility(4);
                      }
                      s.D = false;
                      s.n.getView().getViewTreeObserver().addOnGlobalLayoutListener(new n3(s, videoInfo, uoa1, oy1));
                   }
                }
             }else {
                goto label_0165 ;
             }
             return uoa1;
          }
       }
       b1 = false;
       goto label_00d1 ;
    }
}
