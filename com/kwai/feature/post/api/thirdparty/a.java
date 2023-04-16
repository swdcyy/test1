package com.kwai.feature.post.api.thirdparty.a;
import java.lang.Object;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$Profile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoPreClipPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoAICutPage;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.util.Objects;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$PicSharePage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$PicEditPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoEditPage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$VideoSharePage;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig;
import java.lang.reflect.Type;
import rq.a;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$IdIndexer;
import com.kwai.feature.post.api.thirdparty.ThirdPartyAuthConfig$Mapping;

public class a	// class@001453
{

    public void a(){
       super();
    }
    public static ThirdPartyAuthConfig$Profile a(){
       ThirdPartyAuthConfig$Profile obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ThirdPartyAuthConfig$Profile();
       obj.mId = 0;
       ThirdPartyAuthConfig$Profile mVideoPreCli = obj.mVideoPreClip;
       mVideoPreCli.mAllow = true;
       mVideoPreCli.mMaxPartCount = 31;
       mVideoPreCli = obj.mVideoAICut;
       mVideoPreCli.mAllow = true;
       mVideoPreCli.mMaxPartCount = 31;
       return obj;
    }
    public static String b(String p0){
       ThirdPartyAuthConfig$Profile profile;
       ThirdPartyAuthConfig$Profile mVideoPreCli;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return new Gson().q(a.a());
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("com.kwai.m2u")) {
          if (!p0.equals("com.kwai.videoeditor")) {
             profile = a.a();
          }else {
             profile = PatchProxy.apply(null, null, uoa, "6");
             if (profile != patchProxyRe) {
             }else {
                profile = new ThirdPartyAuthConfig$Profile();
                profile.mId = 1;
                profile.mAllowSoundTrack = true;
                profile.mAllowTag = true;
                profile.mAllowExtraInfo = true;
                profile.mPicSharePage.mAllow = true;
                profile.mPicEditPage.mAllow = true;
                mVideoPreCli = profile.mVideoPreClip;
                mVideoPreCli.mAllow = true;
                mVideoPreCli.mMaxPartCount = 31;
                mVideoPreCli = profile.mVideoAICut;
                mVideoPreCli.mAllow = true;
                mVideoPreCli.mMaxPartCount = 31;
                mVideoPreCli = profile.mVideoEdit;
                mVideoPreCli.mAllow = true;
                mVideoPreCli.mMaxDuration = 0x927c0;
                mVideoPreCli = profile.mVideoShare;
                mVideoPreCli.mAllow = true;
                mVideoPreCli.mMaxDuration = 0x927c0;
                mVideoPreCli.mAllowCover = true;
             }
          }
       }else {
          profile = PatchProxy.apply(null, null, uoa, "5");
          if (profile != patchProxyRe) {
          }else {
             profile = new ThirdPartyAuthConfig$Profile();
             profile.mId = 2;
             profile.mAllowSoundTrack = true;
             profile.mAllowTag = true;
             profile.mAllowExtraInfo = true;
             profile.mPicSharePage.mAllow = true;
             profile.mPicEditPage.mAllow = true;
             mVideoPreCli = profile.mVideoPreClip;
             mVideoPreCli.mAllow = true;
             mVideoPreCli.mMaxPartCount = 31;
             mVideoPreCli = profile.mVideoAICut;
             mVideoPreCli.mAllow = true;
             mVideoPreCli.mMaxPartCount = 31;
             mVideoPreCli = profile.mVideoEdit;
             mVideoPreCli.mAllow = true;
             mVideoPreCli.mMaxDuration = 0xe09c;
             mVideoPreCli = profile.mVideoShare;
             mVideoPreCli.mAllow = true;
             mVideoPreCli.mMaxDuration = 0xe09c;
             mVideoPreCli.mAllowCover = true;
          }
       }
       return new Gson().q(profile);
    }
    public static String c(String p0){
       object oobject = null;
       ThirdPartyAuthConfig obj = PatchProxy.applyOneRefs(p0, oobject, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.G(ThirdPartyAuthConfig.class);
       if (obj == null) {
          return a.b(p0);
       }
       ThirdPartyAuthConfig$IdIndexer mMapping = obj.mIdIndexer.mMapping;
       int len = mMapping.length;
       int i = 0;
       int i1 = 0;
       ThirdPartyAuthConfig$Mapping mapping = null;
       while (i1 < len) {
          object oobject1 = mMapping[i1];
          ThirdPartyAuthConfig$Mapping mAppIds = oobject1.mAppIds;
          int len1 = mAppIds.length;
          int i2 = 0;
          while (i2 < len1) {
             if ((mAppIds[i2]).equals(p0)) {
                mapping = oobject1.mId;
             }
             i2 = i2 + 1;
          }
          i1 = i1 + 1;
       }
       ThirdPartyAuthConfig mProfiles = obj.mProfiles;
       len = mProfiles.length;
       while (true) {
          if (i < len) {
             object oobject2 = mProfiles[i];
             ThirdPartyAuthConfig$Profile mId = oobject2.mId;
             if (mId == obj.mIdIndexer.mDefaultProfileId) {
                oobject = oobject2;
             }
             if (mId == mapping) {
                return new Gson().q(oobject2);
             }else {
                i = i + 1;
             }
          }else if(oobject != null){
             p0 = new Gson().q(oobject);
             break ;
          }else {
             p0 = a.b(p0);
             break ;
          }
       }
       return p0;
    }
}
