package jw8.k;
import erd.o;
import com.yxcorp.gifshow.activity.preview.f$b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import cq.a;
import java.lang.String;
import q87.c;
import android.graphics.RectF;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Sticker$ParameterCase;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import com.kuaishou.edit.draft.VoteStickerParam;
import java.util.Collection;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo$VoteInfoExtParams;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import jn6.c;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo$Extra;
import com.kuaishou.edit.draft.RelayStickerParam;

public final class k implements o	// class@0029c2
{
    public final f$b b;
    public final float c;
    public final c d;

    public void k(f$b p0,float p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       float f3;
       k ok = this;
       k b = ok.b;
       k c = ok.c;
       k d = ok.d;
       Objects.requireNonNull(b);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = b.c.z().iterator();
       while (iterator.hasNext()) {
          Sticker sticker = iterator.next();
          if (sticker.getStickerType() != Sticker$Type.VOTE_STICKER && (sticker.getStickerType() != Sticker$Type.VOTE_STICKER_THREE && sticker.getStickerType() != Sticker$Type.RELAY_STICKER)) {
             continue ;
          }else {
             String str = "PreviewEncodeUtil";
             int i = 0;
             if (!sticker.hasResult()) {
                Object[] objArray = new Object[i];
                a.D().A(str, "getInteractStickerInfo: no sticker Result", objArray);
             }else {
                RectF rectF = new RectF();
                StickerResult result = sticker.getResult();
                File uFile = DraftFileManager.E().B(result.getPreviewImageFile(), b.c);
                if (uFile != null) {
                   b0 uob0 = BitmapUtil.E(uFile.getAbsolutePath());
                   if (uob0.a > null && (uob0.b > null && (b.d > null && b.e > null))) {
                      float f = 0x3f800000;
                      float scale = (result.getScale() - null > 0)? result.getScale(): 0x3f800000;
                      scale = scale * c;
                      f$b f1 = b.f;
                      if (f1 != null) {
                         Size b1 = f1.b;
                         if (b1 > null && f1.c > null) {
                            f = (float)b.d / (float)b1;
                         }
                      }
                      Object[] objArray1 = new Object[i];
                      String str1 = "VIVO_Y3_SCALE";
                      a.D().w(str1, "dimension.width = "+uob0.a+" dimension.height = "+uob0.b+" dimensionScale = "+f+" scale = "+scale+" outputW = "+b.d+" outputH = "+b.e+" assetTransformedScale = "+c+" stickerResult.getScale\(\) = "+result.getScale(), objArray1);
                      float f2 = (float)uob0.a * scale;
                      f2 = f2 * f;
                      f2 = f2 / (float)b.d;
                      scale = scale * (float)uob0.b;
                      scale = scale * f;
                      scale = scale / (float)b.e;
                      objArray1 = new Object[0];
                      a.D().w(str1, "widthRatio = "+f2+"heightRatio = "+scale, objArray1);
                      f = 2.00f;
                      f2 = f2 / f;
                      f3 = result.getCenterX() - f2;
                      rectF.left = f3;
                      f3 = result.getCenterX() + f2;
                      rectF.right = f3;
                      scale = scale / f;
                      f3 = result.getCenterY() - scale;
                      rectF.top = f3;
                      f3 = result.getCenterY() + scale;
                      rectF.bottom = f3;
                      Object[] objArray2 = new Object[0];
                      a.D().w(str1, "Calculated position rect = "+rectF, objArray2);
                   }
                }else {
                   Object[] objArray3 = new Object[0];
                   a.D().A(str, "getInteractStickerInfo: stickerFile is null", objArray3);
                }
                double d1 = 0x408f400000000000;
                double d2 = result.getRange().getStart() * d1;
                long l = (long)d2;
                double d3 = result.getRange().getDuration() * d1;
                long l1 = (long)d3 + l;
                Sticker$ParameterCase parameterCas = null;
                if (DraftUtils.V(d)) {
                   l = parameterCas;
                   l1 = l;
                }
                if (sticker.getParameterCase() == Sticker$ParameterCase.VOTE_STICKER_PARAM) {
                   VoteInfo voteInfo = new VoteInfo();
                   voteInfo.mStartTime = l;
                   voteInfo.mEndTime = l1;
                   VoteStickerParam voteStickerP = sticker.getVoteStickerParam();
                   voteInfo.mQuestion = voteStickerP.getQuestion();
                   voteInfo.mOptions.addAll(voteStickerP.getOptionsList());
                   voteInfo.mBubble = "sticker_vote_0";
                   voteInfo.mType = 1;
                   voteInfo.mScale = sticker.getResult().getViewScale();
                   f3 = (float)b.d / (float)b.e;
                   voteInfo.mPhotoAspectRatio = f3;
                   voteInfo.setPosition(rectF);
                   if (sticker.getStickerType() == Sticker$Type.VOTE_STICKER_THREE) {
                      voteInfo.mType = 2;
                      VoteResultResponse voteResultRe = new VoteResultResponse();
                      voteResultRe.mVoteInfoExtParams = voteInfo.generateExtParams().toString();
                      voteResultRe.mVoteInfo = voteInfo;
                      uArrayList.add(c.d(voteResultRe));
                   }else {
                      uArrayList.add(c.c(voteInfo));
                   }
                }else if(sticker.getParameterCase() == Sticker$ParameterCase.RELAY_STICKER_PARAM){
                   ChallengeStickerInfo uChallengeSt = new ChallengeStickerInfo();
                   ChallengeStickerInfo$Extra uExtra = new ChallengeStickerInfo$Extra();
                   uChallengeSt.extra = uExtra;
                   uExtra.left = rectF.left;
                   uExtra.top = rectF.top;
                   uExtra.right = rectF.right;
                   uExtra.bottom = rectF.bottom;
                   uExtra.startTime = l;
                   uExtra.endTime = l1;
                   uExtra.scale = sticker.getResult().getViewScale();
                   f3 = (float)b.d / (float)b.e;
                   uChallengeSt.extra.photoAspectRatio = f3;
                   uChallengeSt.challengeTopic = sticker.getRelayStickerParam().getText();
                   uChallengeSt.userList = new ArrayList();
                   uArrayList.add(c.b(uChallengeSt));
                }
             }
          }
       }
       return uArrayList;
    }
}
