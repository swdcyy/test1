package haa.b;
import erd.g;
import com.kuaishou.edit.draft.Workspace$Type;
import a26.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import wba.z;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$EditCoverInfo;
import taa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Preview$b;
import maa.a;
import haa.a;
import java.lang.String;
import com.kuaishou.edit.draft.Asset$Type;
import java.util.Iterator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import qaa.a;
import com.kuaishou.edit.draft.VideoCoverParam$b;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$CoverFrame;
import com.kuaishou.edit.draft.CropOptions$b;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Transform$b;
import com.kuaishou.edit.draft.Transform;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.ImportCoverParamV2$b;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import java.util.ArrayList;
import java.lang.Integer;
import com.kuaishou.edit.draft.PictureCoverParam$b;
import com.kuaishou.edit.draft.PictureCoverParam;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Cover;
import hba.a;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.Workspace$b;
import com.kuaishou.edit.draft.SmartAlbum$b;
import com.kuaishou.edit.draft.SmartAlbum;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo;
import jn6.c;
import android.graphics.Bitmap;
import java.lang.Float;
import eba.a;
import android.graphics.RectF;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo$Extra;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.Sticker$Type;
import com.kuaishou.edit.draft.StickerResult$Type;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.RelayStickerParam$b;
import com.kuaishou.edit.draft.RelayStickerParam;
import com.kuaishou.edit.draft.Sticker;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;

public final class b implements g	// class@0025ef
{
    public final Workspace$Type b;
    public final a c;
    public final c d;
    public final List e;

    public void b(Workspace$Type p0,a p1,c p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       String str;
       float f2;
       float f3;
       StickerResult$b uob3;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       b e = uob.e;
       DraftUtils uDraftUtils = DraftUtils.class;
       boolean b1 = false;
       if (!z.u(b) && c.d() != null) {
          PhotoEditInfo$EditCoverInfo clientEditCo = c.d().getClientEditCoverInfo();
          if (clientEditCo != null) {
             d.P0().c0();
             Preview$b uob1 = d.P0().k();
             uob1.g(clientEditCo.getAssetWidth());
             uob1.d(clientEditCo.getAssetHeight());
             d.P0().g(b1);
          }
       }
       a uoa = a.c(d);
       uoa.c0();
       float f = Float.MIN_VALUE;
       if (e.size() == f) {
          str = e.get(b1);
          if (b == Workspace$Type.SINGLE_PICTURE) {
             DraftUtils.c(uoa, Asset$Type.PICTURE, str);
          }else {
             DraftUtils.c(uoa, Asset$Type.VIDEO, str);
          }
       }else {
          Iterator iterator = e.iterator();
          while (iterator.hasNext()) {
             DraftUtils.c(uoa, Asset$Type.PICTURE, iterator.next());
          }
       }
       uoa.g(b1);
       if (b != Workspace$Type.SINGLE_PICTURE) {
          PhotoEditInfo photoEditInf = c.d();
          if (!PatchProxy.applyVoidTwoRefs(photoEditInf, d, null, uDraftUtils, "55")) {
             str = "DraftUtils";
             if (photoEditInf == null || photoEditInf.getClientEditCoverInfo() == null) {
                Object[] objArray = new Object[b1];
                f.D().A(str, "setCoverInfo is null", objArray);
             }else {
                Object[] objArray1 = new Object[b1];
                f.D().w(str, "setCoverInfo: "+photoEditInf.getClientEditCoverInfo(), objArray1);
                PhotoEditInfo$EditCoverInfo clientEditCo1 = photoEditInf.getClientEditCoverInfo();
                a uoa2 = a.f(d);
                uoa2.c0();
                if (d.a1() == Workspace$Type.ATLAS || d.a1() == Workspace$Type.LONG_PICTURE) {
                   ArrayList uArrayList = new ArrayList();
                   if (!TextUtils.x(clientEditCo1.getAtlasIndexes())) {
                      String[] stringArray = (clientEditCo1.getAtlasIndexes()).split("_");
                      int len = stringArray.length;
                      for (int i = 0; i < len; i = i + 1) {
                         uArrayList.add(Integer.valueOf(Integer.parseInt(stringArray[i])));
                      }
                   }else {
                      uArrayList.add(Integer.valueOf(b1));
                   }
                   Cover$b uob6 = uoa2.k();
                   uob6.h(Cover$Type.PICTURE);
                   PictureCoverParam$b uob7 = PictureCoverParam.newBuilder();
                   uob7.a(uArrayList);
                   uob6.copyOnWrite();
                   uob6.instance.setPictureCoverParam(uob7.build());
                }else {
                   VideoCoverParam$b uob12 = VideoCoverParam.newBuilder();
                   uob12.a(clientEditCo1.getCustomTimestamp());
                   uob12.h(clientEditCo1.getCoverRatioStr());
                   boolean b2 = (clientEditCo1.getCoverScale() > 0)? true: false;
                   uob12.d(b2);
                   if (clientEditCo1.getCoverFrame() != null) {
                      PhotoEditInfo$CoverFrame coverFrame = clientEditCo1.getCoverFrame();
                      if (clientEditCo1.getAssetWidth() && clientEditCo1.getAssetHeight()) {
                         coverFrame.setX(coverFrame.getX());
                         coverFrame.setY(coverFrame.getY());
                      }else {
                         f2 = 0;
                         coverFrame.setX(f2);
                         coverFrame.setY(f2);
                      }
                      CropOptions$b uob13 = CropOptions.newBuilder();
                      uob13.d((int)coverFrame.getWidth());
                      uob13.a((int)coverFrame.getHeight());
                      Transform$b uob14 = Transform.newBuilder();
                      uob14.a((double)coverFrame.getX());
                      uob14.b((double)coverFrame.getY());
                      uob13.c(uob14.build());
                      CropOptions uCropOptions = uob13.build();
                      uob12.copyOnWrite();
                      uob12.instance.setCropOptions(uCropOptions);
                   }
                   ImportCoverParamV2$b uob15 = ImportCoverParamV2.newBuilder();
                   if (!TextUtils.x(clientEditCo1.getOriginCoverPath()) && new File(clientEditCo1.getOriginCoverPath()).exists()) {
                      uob15.b(clientEditCo1.getOriginCoverPath());
                      uob15.a(uoa2.Q(clientEditCo1.getOriginCoverPath()));
                      uob15.c(f);
                   }
                   Cover$b uob16 = uoa2.k();
                   uob16.h(Cover$Type.VIDEO);
                   uob16.i(uob12);
                   uob16.c(uob15.build());
                }
                if (!TextUtils.x(clientEditCo1.getEditTitle())) {
                   uoa = uoa2.f0();
                   uoa.c0();
                   Text$b uob8 = uoa.k();
                   FeatureId$b uob9 = FeatureId.newBuilder();
                   uob9.a(TextUtils.k(clientEditCo1.getTitleStyle()));
                   uob8.h(uob9.build());
                   uob8.m(TextUtils.k(clientEditCo1.getEditTitle()));
                   uob8.e(TextUtils.k(clientEditCo1.getFontName()));
                   String str1 = (d.a1() == Workspace$Type.ALBUM_MOVIE)? TextUtils.k(clientEditCo1.getTimeText()): "";
                   uob8.o(str1);
                   uob8.i(TextUtils.k(clientEditCo1.getLocationText()));
                   uob3 = StickerResult.newBuilder();
                   float f4 = 100.00f;
                   uob3.f((clientEditCo1.getCenterX() / f4));
                   uob3.g((clientEditCo1.getCenterY() / f4));
                   uob3.s(clientEditCo1.getRotate());
                   uob3.t(clientEditCo1.getScale());
                   uob3.v(0x3f800000);
                   uob8.k(uob3.build());
                   uoa.g(b1);
                }
                if (d.a1() == Workspace$Type.ALBUM_MOVIE) {
                   Workspace$b uob10 = d.k();
                   SmartAlbum$b uob11 = SmartAlbum.newBuilder();
                   uob11.b(TextUtils.k(clientEditCo1.getEditSubtitle()));
                   uob10.copyOnWrite();
                   uob10.instance.setSmartAlbum(uob11.build());
                   d.d1().E0(TextUtils.k(clientEditCo1.getEditSubtitle()));
                }
                uoa2.g(b1);
             }
          }
          a e1 = c.e;
          if (e1 != null) {
             int type = e1.getType();
             if (type != f) {
                if (type != 2) {
                   if (type == 3) {
                      ChallengeStickerInfo uChallengeSt = c.a(e1);
                      Bitmap uBitmap = c.b();
                      float f1 = c.c();
                      if (!PatchProxy.isSupport(uDraftUtils) || (PatchProxy.applyVoidFourRefs(uChallengeSt, uBitmap, Float.valueOf(f1), d, null, DraftUtils.class, "54") || (uChallengeSt != null && uBitmap != null))) {
                         ChallengeStickerInfo extra = uChallengeSt.extra;
                         if (extra != null) {
                            a uoa1 = a.q(d);
                            uoa1.c0();
                            RectF position = extra.getPosition();
                            RectF rectF = 0x3f000000;
                            if (position != null) {
                               f2 = 2.00f;
                               rectF = position.left + (position.width() / f2);
                               f3 = (position.height() / f2) + position.top;
                            }else {
                               f3 = 0x3f000000;
                            }
                            Sticker$b uob2 = uoa1.b();
                            uob2.j(Sticker$Type.RELAY_STICKER);
                            uob3 = StickerResult.newBuilder();
                            uob3.u(StickerResult$Type.VIDEO);
                            uob3.m(uoa1.O(uBitmap, ".png", DraftFileManager.l));
                            TimeRange$b uob4 = TimeRange.newBuilder();
                            uob4.b((double)((float)extra.startTime / 1000.00f));
                            uob4.a((double)((float)(extra.endTime - extra.startTime) / 1000.00f));
                            uob3.o(uob4.build());
                            uob3.f(rectF);
                            uob3.g(f3);
                            uob3.t(f1);
                            uob3.v(0x3f800000);
                            uob2.i(uob3.build());
                            RelayStickerParam$b uob5 = RelayStickerParam.newBuilder();
                            uob5.a(uChallengeSt.challengeTopic);
                            RelayStickerParam relaySticker = uob5.build();
                            uob2.copyOnWrite();
                            uob2.instance.setRelayStickerParam(relaySticker);
                            uoa1.g(false);
                         }
                      }
                   }
                }else {
                   VoteResultResponse voteResultRe = c.e(e1);
                   if (voteResultRe != null) {
                      DraftUtils.h0(voteResultRe.mVoteInfo, c.b(), c.c(), d, Sticker$Type.VOTE_STICKER_THREE);
                   }
                }
             }else {
                DraftUtils.h0(c.f(e1), c.b(), c.c(), d, Sticker$Type.VOTE_STICKER);
             }
          }
       }
    label_03fa :
       return;
    }
}
