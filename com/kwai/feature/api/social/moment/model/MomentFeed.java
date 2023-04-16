package com.kwai.feature.api.social.moment.model.MomentFeed;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.social.moment.model.MomentFeed$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.moment.model.MomentModel;
import com.yxcorp.utility.TextUtils;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Collections;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import com.kwai.feature.api.social.moment.model.b;
import java.util.Map;
import java.lang.Number;
import com.kwai.feature.api.social.moment.model.MomentComment;
import java.io.ObjectInputStream;
import com.smile.gifmaker.mvps.utils.SyncableProvider;

public class MomentFeed extends BaseFeed	// class@001182
{
    public MomentComment mComment;
    public CommonMeta mCommonMeta;
    public MomentModel mMomentModel;
    public MomentFeed$a mRealType;
    public User mUser;
    public UserStatus mUserStatusMeta;
    public static final long serialVersionUID = 0xd2feb1ec1535663f;

    public void MomentFeed(){
       super();
       this.mRealType = new MomentFeed$a();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, MomentFeed.class, "1")) {
          return;
       }
       super.afterDeserialize();
       if (this.mMomentModel == null) {
          this.mMomentModel = new MomentModel();
       }
       MomentFeed tmMomentMode = this.mMomentModel;
       tmMomentMode.mMomentUser = this.mUser;
       tmMomentMode.mUserStatusMeta = this.mUserStatusMeta;
       tmMomentMode.mMomentId = TextUtils.I(tmMomentMode.mMomentId);
       tmMomentMode = this.mMomentModel;
       if (tmMomentMode.mLikers == null) {
          tmMomentMode.mLikers = Lists.b();
       }
       tmMomentMode = this.mMomentModel;
       if (tmMomentMode.mComments == null) {
          tmMomentMode.mComments = Lists.b();
       }
       tmMomentMode = this.mMomentModel;
       if (tmMomentMode.mLikePhotos == null) {
          tmMomentMode.mLikePhotos = Collections.emptyList();
       }
       tmMomentMode = this.mMomentModel;
       if (tmMomentMode.mTags == null) {
          tmMomentMode.mTags = Collections.emptyList();
       }
       tmMomentMode = this.mMomentModel;
       if (tmMomentMode.mPictures == null) {
          tmMomentMode.mPictures = Collections.emptyList();
       }
       this.a(CommonMeta.class).mId = this.getId();
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || this.getClass() != p0.getClass()) {
          return b;
       }
       if (!k.a(this.mMomentModel, p0.mMomentModel)) {
          return b;
       }
       if (!k.a(this.mComment, p0.mComment)) {
          return b;
       }
       return k.a(this.mRealType, p0.mRealType);
    }
    public String getId(){
       MomentFeed tmMomentMode = this.mMomentModel;
       MomentModel mMomentId = (tmMomentMode != null)? tmMomentMode.mMomentId: "";
       return mMomentId;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentFeed.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, MomentFeed.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(MomentFeed.class, new b());
       }else {
          obj.put(MomentFeed.class, null);
       }
       return obj;
    }
    public int hashCode(){
       MomentFeed obj = PatchProxy.apply(null, this, MomentFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMomentModel;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MomentFeed tmComment = this.mComment;
       int i2 = (tmComment != null)? tmComment.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmComment = this.mRealType;
       if (tmComment != null) {
          i = tmComment.hashCode();
       }
       return (i1 + i);
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MomentFeed.class, "2")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}
