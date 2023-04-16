package com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import kq1.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import java.lang.AssertionError;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineExtraInfo;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;

public class LiveLineInviteItem implements Serializable, Cloneable	// class@00173a
{
    public int mCandidateStatus;
    public int mChatType;
    public String mDisplayAge;
    public String mDisplayLocation;
    public String mExtraInfo;
    public LiveFlowDiversionCpcInfoV2 mFlowDiversionCpcInfo;
    public boolean mHasShow;
    public List mHighlightTagList;
    public int mIndex;
    public String mInvitePenetrateParam;
    public d mInviteStatus;
    public LiveLineInviteResponse$LiveLineExtraInfo mLiveLineExtraInfo;
    public String mLiveStreamId;
    public String mMatchSource;
    public int mMultiLineJoinSourceType;
    public List mNormalTagList;
    public boolean mNotSupportPaidMultiLineChat;
    public LiveInteractivePromptDialogInfo mPromptDialogInfo;
    public LiveFlowDiversionPaySellingChatInfo mSellingChatInfo;
    public int mSourceType;
    public boolean mSupportMultiLineChat;
    public int mTransparentInviteSourceType;
    public UserInfo mUserInfo;
    public static final long serialVersionUID = 0xedee4b61a73cfeb1;

    public void LiveLineInviteItem(){
       super();
       this.mTransparentInviteSourceType = 0;
       this.mInviteStatus = new d$a(this);
       this.mChatType = 1;
    }
    public static LiveLineInviteItem createDefaultUserInfo(){
       LiveLineInviteItem obj = PatchProxy.apply(null, null, LiveLineInviteItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveLineInviteItem();
       obj.mUserInfo = new UserInfo();
       obj.mDisplayLocation = "";
       obj.mDisplayAge = "";
       obj.mMatchSource = "RECOMMEND_INVITE";
       obj.mSourceType = 4;
       return obj;
    }
    public LiveLineInviteItem clone(){
       Object obj = PatchProxy.apply(null, this, LiveLineInviteItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError();
       }
    }
    public Object clone(){
       return this.clone();
    }
    public String getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveLineInviteItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.mExtraInfo);
    }
    public boolean isMultiLineState(){
       LiveLineInviteItem obj = PatchProxy.apply(null, this, LiveLineInviteItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLiveLineExtraInfo;
       boolean b = (obj != null && !q.f(obj.mUserInfos))? true: false;
       return b;
    }
    public void setExtraInfo(String p0){
       this.mExtraInfo = p0;
    }
    public String toString(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, LiveLineInviteItem.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "LiveLineInviteItem{mUserInfo=";
       String str = PatchProxy.apply(objArray, this, LiveLineInviteItem.class, "5");
       if (str != patchProxyRe) {
       }else if(this.mUserInfo == null){
          str1 = "";
       }else {
          str1 = this.mUserInfo.mId+" & "+this.mUserInfo.mName;
       }
       str = str1;
       char c = ''';
       obj = obj+str+", mLiveStreamId=\'"+this.mLiveStreamId+c+", mSourceType="+this.mSourceType+", mMultiLineJoinSourceType="+this.mMultiLineJoinSourceType+", mMatchSource=\'"+this.mMatchSource+c+", mLiveFlowDiversionPayInfoV2=";
       boolean b = (this.mFlowDiversionCpcInfo == null)? true: false;
       return obj+b+", mSupportMultiLineChat="+this.mSupportMultiLineChat+", mExtraInfo=\'"+this.mExtraInfo+c+'}';
    }
}
