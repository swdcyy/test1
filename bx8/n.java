package bx8.n;
import erd.o;
import bx8.k;
import xw8.a;
import java.lang.Object;
import njd.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.share.model.PhotoEditResponse;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.model.EditInfo;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import lq.i;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import qaa.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.CropOptions;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import lnc.k9;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.feature.post.api.feature.hotspot.RelatedHotspot;
import da6.c;
import com.kuaishou.android.model.mix.CoverSize;
import qrd.l1;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import ow8.c;
import com.kuaishou.android.model.music.Music;
import java.lang.Boolean;
import java.util.Objects;
import bba.b;
import com.kuaishou.edit.draft.Publish;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.edit.draft.CaptionTopic;
import com.kuaishou.edit.draft.CaptionTopic$TopicType;
import com.kuaishou.android.model.mix.PhotoKgTag;
import com.kuaishou.android.model.mix.Location;
import lnc.d4;

public final class n implements o	// class@000483
{
    public final k b;
    public final a c;

    public void n(k p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Object[] objArray;
       c uoc;
       Size size;
       n c;
       Object[] objArray2;
       ArrayList uArrayList;
       Object obj = this;
       String obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Integer integer = PatchProxy.applyOneRefs(obj1, obj, n.class, "1");
       if (integer != patchProxyRe) {
       }else {
          a.p(obj1, "it");
          obj1 = obj1.a();
          a.o(obj1, "it.body\(\)");
          String str = "ShareReEditRepo";
          if (obj1.mEditTime - null) {
             objArray = new Object[0];
             a.b().w(str, "updatePhoto editTime: "+obj1.mEditTime, objArray);
             EditInfo editInfo = obj.b.a().getEditInfo();
             a.o(editInfo, "photo.editInfo");
             editInfo.mEditTime = Long.valueOf(obj1.mEditTime);
          }
          Object[] objArray1 = new Object[0];
          a.b().s(str, "update successfully", objArray1);
          if (!TextUtils.x(obj.c.f)) {
             obj1 = w0.c(new File(obj.c.f)).toString();
             a.o(obj1, "SafetyUriCalls.getUriFro¡­overFilePath\)\).toString\(\)");
          }else {
             obj1 = "";
          }
          i oi = i.m();
          String str1 = "PostSession.current\(\)";
          a.o(oi, str1);
          objArray = null;
          if (oi.y().isEmpty()) {
             uoc = objArray;
          }else {
             oi = i.m();
             a.o(oi, str1);
             uoc = oi.y().get(0);
          }
          if (uoc != null && a.f(uoc).v() != null) {
             Cover uCover = a.f(uoc).v();
             a.m(uCover);
             VideoCoverParam videoCoverPa = uCover.getVideoCoverParam();
             a.o(videoCoverPa, "coverDraft!!.videoCoverParam");
             if (!TextUtils.x(videoCoverPa.getVideoCoverRatio())) {
                VideoCoverParam videoCoverPa1 = uCover.getVideoCoverParam();
                String str2 = "coverDraft.videoCoverParam";
                a.o(videoCoverPa1, str2);
                CropOptions cropOptions = videoCoverPa1.getCropOptions();
                String str3 = "coverDraft.videoCoverParam.cropOptions";
                a.o(cropOptions, str3);
                VideoCoverParam videoCoverPa2 = uCover.getVideoCoverParam();
                a.o(videoCoverPa2, str2);
                CropOptions cropOptions1 = videoCoverPa2.getCropOptions();
                a.o(cropOptions1, str3);
                size = new Size(cropOptions.getWidth(), cropOptions1.getHeight());
             label_0114 :
                PhotoEditInfo photoEditInf = k9.a(obj.b.a());
                CoverMeta uCoverMeta = new CoverMeta();
                uCoverMeta.mCoverUrl = obj1;
                InteractStickerInfo interactStic = (photoEditInf != null)? photoEditInf.getInteractStickerInfo(): objArray;
                RelatedHotspot relatedHotsp = (photoEditInf != null)? photoEditInf.getRelatedHotspot(): objArray;
                uCoverMeta.f("PHOTO_EDIT_INFO", k9.c(uoc, interactStic, relatedHotsp));
                a g = obj.c.g;
                uCoverMeta.mWidth = g.b;
                uCoverMeta.mHeight = g.c;
                if (size != null && (size.b > null && size.c > null)) {
                   CoverSize uCoverSize = new CoverSize();
                   uCoverSize.mWidth = size.b;
                   uCoverSize.mHeight = size.c;
                   uCoverMeta.mOverrideCoverSize = uCoverSize;
                }
             label_0165 :
                if (c.n(obj.c.j) && obj.b.a().getEditInfo() != null) {
                   obj.b.a().getEditInfo().mEnable = false;
                }
                QPhoto qPhoto = obj.b.a();
                c = obj.c;
                a d = c.d;
                a c1 = c.c;
                EditInfo editInfo1 = obj.b.a().getEditInfo();
                g = obj.c.j;
                a.o(g, "photoContent.mVideoContext");
                Music music = g.B();
                Boolean uBoolean = Boolean.valueOf(obj.c.k);
                g = obj.c.l;
                n b = obj.b;
                Objects.requireNonNull(b);
                PhotoKgTag obj2 = PatchProxy.apply(objArray, b, k.class, "8");
                if (obj2 != patchProxyRe) {
                   objArray2 = obj2;
                }else {
                   Publish publish = a.p(b.g).v();
                   if (publish != null) {
                      a.o(publish, "DraftGetUtils.getPublish\x20\x02rstMessage ?: return null\x00");
                      uArrayList = new ArrayList();
                      Iterator iterator = publish.getCaptionTopicList().iterator();
                      while (iterator.hasNext()) {
                         CaptionTopic uCaptionTopi = iterator.next();
                         a.o(uCaptionTopi, "captionTopic");
                         if (uCaptionTopi.getTopicType() != CaptionTopic$TopicType.FILM_CARD) {
                            continue ;
                         }
                         obj2 = new PhotoKgTag();
                         obj2.mName = uCaptionTopi.getTopicName();
                         obj2.mId = uCaptionTopi.getTopicId();
                         obj2.mKgId = uCaptionTopi.getExtraInfo();
                         uArrayList.add(obj2);
                      }
                   }
                   objArray2 = uArrayList;
                }
                d4.d(qPhoto, d, c1, editInfo1, uCoverMeta, music, uBoolean, g, objArray2);
                integer = Integer.valueOf(-1);
             }
          }
          size = objArray;
          goto label_0114 ;
       }
       return integer;
    }
}
