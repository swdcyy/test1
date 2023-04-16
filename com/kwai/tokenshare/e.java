package com.kwai.tokenshare.e;
import erd.o;
import java.lang.Object;
import com.kwai.tokenshare.model.TokenInfoModel;
import bu7.i0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import o56.a;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import com.kwai.tokenshare.model.TokenDialogModel;
import android.content.Context;
import com.kwai.tokenshare.model.TokenDialogModel$SharePoi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import com.kwai.tokenshare.model.TokenDialogModel$DialogConfig;
import com.kwai.tokenshare.model.TokenDialogModel$ShareMerchantShop;
import com.kwai.tokenshare.model.TokenDialogModel$ShareMerchantItem;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import wb5.i;
import ekd.n0;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.aa;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import android.text.TextPaint;
import lnc.a1;
import bu7.e0;
import jb0.a$a;
import jb0.a;

public final class e implements o	// class@00191f
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object apply(Object p0){
       TokenDialogModel mShareUser;
       ArrayList uArrayList;
       TokenDialogModel$SharePoi mPhotos;
       Iterator iterator;
       CoverMeta uCoverMeta;
       ShareTokenInfo shareTokenIn = PatchProxy.applyOneRefs(p0, null, i0.class, "2");
       if (shareTokenIn != PatchProxyResult.class) {
       }else {
          shareTokenIn = new ShareTokenInfo();
          shareTokenIn.mExtras = p0;
          Application b = a.B;
          shareTokenIn.mResult = p0.mResult;
          shareTokenIn.mUri = p0.mUri;
          shareTokenIn.mPlatform = p0.mSharePlatform;
          p0 = p0.mDialogModel;
          ShareTokenDialogInfo shareTokenDi = new ShareTokenDialogInfo();
          shareTokenIn.mTokenDialog = shareTokenDi;
          if (p0 != null) {
             shareTokenDi.mType = p0.mType;
             shareTokenDi.mActionUri = p0.mAction;
             shareTokenDi.mAction = b.getString(0x7f101c39);
             int i = 2;
             String str = "";
             switch (shareTokenDi.mType){
                 case 1:
                 case 5:
                 case 16:
                   if (p0.mPhoto != null) {
                      mShareUser = p0.mShareUser;
                      if (mShareUser != null && (!TextUtils.x(mShareUser.mId) && shareTokenDi.mType == 1)) {
                         shareTokenDi.mActionUri = TextUtils.d(shareTokenDi.mActionUri, "fid="+p0.mShareUser.mId);
                      }
                   label_0215 :
                      QPhoto qPhoto = new QPhoto(p0.mPhoto);
                      shareTokenDi.mCoverPlaceHolderColor = qPhoto.getColor();
                      shareTokenDi.mCoverUrl = qPhoto.getCoverThumbnailUrl();
                      shareTokenDi.mCoverUrls = qPhoto.getCoverThumbnailUrls();
                      shareTokenDi.mPhotoType = qPhoto.getType();
                      if (qPhoto.isImageType()) {
                         if (qPhoto.isLongPhotos()) {
                            shareTokenDi.mAtlasType = i;
                         }else if(qPhoto.isAtlasPhotos()){
                            shareTokenDi.mAtlasType = 1;
                         }
                      }
                      if (qPhoto.getUser() != null) {
                         User user = qPhoto.getUser();
                         user.getSex();
                         shareTokenDi.mAvatarPlaceHolderImage = 0x7f08069a;
                         shareTokenDi.mAvatarUrl = user.getAvatar();
                         shareTokenDi.mAvatarUrls = user.getAvatars();
                         TextPaint textPaint = new TextPaint();
                         textPaint.setTextSize((float)a1.e(14.00f));
                         Object[] objArray = new Object[]{user.getName()};
                         shareTokenDi.mTitle = a.a(b.getString(0x7f1051a4, objArray), 0, (user.getName()).length(), a1.e(185.00f), new e0(textPaint));
                      }
                      shareTokenDi.mDescription = str;
                   }
                   shareTokenDi.mErrorMessage = p0.mMessage;
                   break;
                 case 2:
                   mShareUser = p0.mUser;
                   if (mShareUser != null) {
                      shareTokenDi.mTitle = mShareUser.getName();
                      shareTokenDi.mAvatarUrl = mShareUser.getAvatar();
                      shareTokenDi.mAvatarUrls = mShareUser.getAvatars();
                      shareTokenDi.mDescription = (!TextUtils.x(mShareUser.getText()))? i0.a.matcher(mShareUser.getText()).replaceAll(str): str;
                      mShareUser.getSex();
                      shareTokenDi.mAvatarPlaceHolderImage = 0x7f08069a;
                   }
                   break;
                 case 3:
                 case 6:
                 case 7:
                   mShareUser = p0.mShareTag;
                   if (mShareUser != null) {
                      shareTokenDi.mPhotoCount = mShareUser.mPhotoCount;
                      shareTokenDi.mTagType = mShareUser.mTagType;
                      shareTokenDi.mTagTypeStr = mShareUser.mType;
                      if (!TextUtils.x(mShareUser.mTagName)) {
                         str = aa.a(mShareUser.mTagName, 9);
                      }
                      shareTokenDi.mTagName = str;
                      shareTokenDi.mIsRich = mShareUser.mIsRich;
                      shareTokenDi.mPhotoCovers = mShareUser.mPhotoCovers;
                   }
                   shareTokenDi.mErrorMessage = p0.mMessage;
                   break;
                 case 4:
                 case 17:
                   mShareUser = p0.mPhotoUser;
                   if (mShareUser != null) {
                      shareTokenDi.mTitle = mShareUser.getName();
                      shareTokenDi.mAvatarUrl = mShareUser.getAvatar();
                      shareTokenDi.mAvatarUrls = mShareUser.getAvatars();
                      mShareUser.getSex();
                      shareTokenDi.mAvatarPlaceHolderImage = 0x7f08069a;
                      Object[] objArray3 = new Object[]{mShareUser.getId()};
                      shareTokenDi.mActionUri = n0.a("kwai://profile/%s", objArray3);
                   }
                   shareTokenDi.mErrorMessage = p0.mMessage;
                   break;
                 case 8:
                   mShareUser = p0.mSharePoi;
                   if (mShareUser != null) {
                      shareTokenDi.mPoiTitle = mShareUser.mPoiTitle;
                      shareTokenDi.mPoiAddress = mShareUser.mPoiAddress;
                      uArrayList = new ArrayList();
                      mPhotos = mShareUser.mPhotos;
                      if (mPhotos != null) {
                         iterator = mPhotos.iterator();
                         while (iterator.hasNext()) {
                            uCoverMeta = r1.D0(iterator.next());
                            if (uCoverMeta != null) {
                               uArrayList.add(uCoverMeta.mCoverThumbnailUrls);
                            }
                         }
                      }
                      shareTokenDi.mPoiCovers = uArrayList;
                      shareTokenDi.mErrorMessage = p0.mMessage;
                   }
                   break;
                 case 11:
                   i0.e(b, shareTokenDi, p0, 0, 1);
                   mShareUser = p0.mShareMerchantItem;
                   if (mShareUser != null) {
                      shareTokenDi.mCoverUrl = mShareUser.mCover;
                   }
                   break;
                 case 12:
                   i0.e(b, shareTokenDi, p0, 1, 1);
                   mShareUser = p0.mShareMerchantShop;
                   if (mShareUser != null) {
                      Object[] objArray4 = new Object[]{mShareUser.mOnSaleItemNum};
                      shareTokenDi.mDescription = b.getString(0x7f101867, objArray4);
                   }
                   break;
                 case 13:
                   i0.e(b, shareTokenDi, p0, 0, 0);
                   shareTokenDi.mDescription = b.getString(0x7f101858);
                   break;
                 case 14:
                   i0.e(b, shareTokenDi, p0, 1, 0);
                   shareTokenDi.mDescription = b.getString(0x7f10185d);
                   break;
                 case 15:
                   i0.e(b, shareTokenDi, p0, 0, 0);
                   shareTokenDi.mDescription = b.getString(0x7f101857);
                   break;
                 case 18:
                   mShareUser = p0.mDialogConfig;
                   if (mShareUser != null) {
                      shareTokenDi.mTitle = mShareUser.mTitle;
                      shareTokenDi.mAvatarUrl = mShareUser.mIconUrl;
                      shareTokenDi.mAvatarTargetUrl = mShareUser.mIconTargetUrl;
                      shareTokenDi.mSubTitle = mShareUser.mSubTitle;
                      shareTokenDi.mSubTitleIconUrl = mShareUser.mSubTitleIconUrl;
                      shareTokenDi.mDescription = mShareUser.mDescription;
                      shareTokenDi.mSource = mShareUser.mFooterText;
                      shareTokenDi.mSourceUri = mShareUser.mFooterTargetUrl;
                      shareTokenDi.mAction = mShareUser.mActionButtonText;
                      shareTokenDi.mActionUri = mShareUser.mActionButtonTargetUrl;
                   }
                   break;
                 case 19:
                   mShareUser = p0.mSharePoi;
                   if (mShareUser != null) {
                      shareTokenDi.mPoiTitle = mShareUser.mPoiTitle;
                      shareTokenDi.mPoiAddress = mShareUser.mPoiAddress;
                      uArrayList = new ArrayList();
                      mPhotos = mShareUser.mPhotos;
                      if (mPhotos != null) {
                         iterator = mPhotos.iterator();
                         while (iterator.hasNext()) {
                            uCoverMeta = r1.D0(iterator.next());
                            if (uCoverMeta != null) {
                               uArrayList.add(uCoverMeta.mCoverThumbnailUrls);
                            }
                         }
                      }
                      shareTokenDi.mPoiCovers = uArrayList;
                      shareTokenDi.mErrorMessage = p0.mMessage;
                   }
                   break;
                 default:
             }
          label_02a5 :
             if (TextUtils.x(shareTokenDi.mSource) || TextUtils.x(shareTokenDi.mSourceUri)) {
                mShareUser = p0.mShareUser;
                if (mShareUser != null) {
                   String str1 = (("F").equals(mShareUser.getSex()))? b.getString(R.string.arg_RES_7f10023f): b.getString(R.string.arg_RES_7f10023e);
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = aa.a(p0.mShareUser.mName, 7);
                   objArray1[1] = str1;
                   shareTokenDi.mSource = b.getString(0x7f101c38, objArray1);
                   Object[] objArray2 = new Object[]{p0.mShareUser.getId()};
                   shareTokenDi.mSourceUri = n0.a("kwai://profile/%s", objArray2);
                }
             }
             if (shareTokenDi.mAvatarPlaceHolderImage == null) {
                shareTokenDi.mAvatarPlaceHolderImage = 0x7f08069a;
             }
          }
       }
       return shareTokenIn;
    }
}
