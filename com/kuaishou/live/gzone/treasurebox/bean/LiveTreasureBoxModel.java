package com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel;
import mkd.a;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import io.reactivex.subjects.PublishSubject;
import k77.t$b;
import java.lang.Object;
import mrd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxStatus;
import java.util.Collection;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.lang.Math;
import mrd.c;
import java.lang.StringBuilder;
import com.kuaishou.live.gzone.treasurebox.bean.LiveTreasureBoxModel$BoxType;
import java.lang.Integer;
import xl8.d;
import java.lang.System;
import o53.c;
import java.lang.Runnable;
import ekd.k1;

public class LiveTreasureBoxModel extends DefaultObservable implements a	// class@001c61
{
    public String mAfterOpenTip;
    public String mBeforeOpenTip;
    public List mBoxIcons;
    public int mBoxIndexInAdapter;
    public LiveTreasureBoxModel$BoxStatus mBoxStatus;
    public long mDataTimeStamp;
    public boolean mIsLast;
    public String mJumpUrl;
    public long mKShell;
    public List mNewStyleBoxIcons;
    public final c mOpenedDoneSubject;
    public long mOpeningStartTimeMillisecond;
    public boolean mPendingAnimation;
    public int mPosition;
    public int mRequiredSecond;
    public LiveGzoneAudienceTreasureBoxRewardPopupModel mRewardPopupModel;
    public final c mShakeAnimatorSubject;
    public int mSignInBoxLevel;
    public int mStartCountDownWatchedTime;
    public int mStatus;
    public String mStep;
    public String mToleranceFlag;
    public int mType;
    public int mWatchedSecond;

    public void LiveTreasureBoxModel(){
       super();
       this.mOpenedDoneSubject = PublishSubject.g();
       this.mShakeAnimatorSubject = a.h(new t$b());
       this.mOpeningStartTimeMillisecond = 0;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveTreasureBoxModel.class, "5")) {
          return;
       }
       LiveTreasureBoxModel tmStatus = this.mStatus;
       if (tmStatus == null) {
          this.mBoxStatus = LiveTreasureBoxModel$BoxStatus.WAITING;
       }else if(tmStatus == 1){
          this.mBoxStatus = LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN;
       }else if(tmStatus == 2){
          this.mBoxStatus = LiveTreasureBoxModel$BoxStatus.OPENED;
       }
       if (!q.f(this.mNewStyleBoxIcons)) {
          this.mBoxIcons = this.mNewStyleBoxIcons;
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTreasureBoxModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof LiveTreasureBoxModel) {
          return b;
       }
       if (p0.mRequiredSecond == this.mRequiredSecond && (TextUtils.n(this.mStep, p0.mStep) && (TextUtils.n(this.mToleranceFlag, p0.mToleranceFlag) && this.mIsLast == p0.mIsLast))) {
          b = true;
       }
    label_003c :
       return b;
    }
    public LiveTreasureBoxModel$BoxStatus getBoxStatus(){
       return this.mBoxStatus;
    }
    public long getDataTimeStamp(){
       return this.mDataTimeStamp;
    }
    public int getPosition(){
       return this.mPosition;
    }
    public int getRemainSecond(){
       Object obj = PatchProxy.apply(null, this, LiveTreasureBoxModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max((this.mRequiredSecond - this.mWatchedSecond), 0);
    }
    public int getRequiredSecond(){
       return this.mRequiredSecond;
    }
    public c getShakeAnimatorSubject(){
       return this.mShakeAnimatorSubject;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveTreasureBoxModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mRequiredSecond+"_"+this.mStep+"_"+this.mToleranceFlag+"_"+this.mIsLast).hashCode();
    }
    public boolean isGoldBox(){
       boolean b = (this.mType == LiveTreasureBoxModel$BoxType.GOLD.mType)? true: false;
       return b;
    }
    public boolean isLast(){
       return this.mIsLast;
    }
    public boolean isSignInBox(){
       boolean b = (this.mType == LiveTreasureBoxModel$BoxType.SIGN_IN.mType)? true: false;
       return b;
    }
    public boolean onWatchedTimeChanged(int p0,boolean p1){
       LiveTreasureBoxModel obj;
       if (PatchProxy.isSupport(LiveTreasureBoxModel.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LiveTreasureBoxModel.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.mBoxStatus;
       boolean b = false;
       if (obj == null) {
          return b;
       }else {
          this.mWatchedSecond = p0;
          if (obj == LiveTreasureBoxModel$BoxStatus.WAITING && p0 >= this.mStartCountDownWatchedTime) {
             this.mBoxStatus = LiveTreasureBoxModel$BoxStatus.COUNTING_DOWN;
          }else if(obj != LiveTreasureBoxModel$BoxStatus.OPENING && (obj != LiveTreasureBoxModel$BoxStatus.OPENED && p0 >= this.mRequiredSecond)){
             this.mBoxStatus = LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN;
          }
          if (p1) {
             this.notifyChanged();
          }
          if (this.mBoxStatus == LiveTreasureBoxModel$BoxStatus.OPENED) {
             b = true;
          }
          return b;
       }
    }
    public void setBoxStatus(LiveTreasureBoxModel$BoxStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTreasureBoxModel.class, "1")) {
          return;
       }
       LiveTreasureBoxModel$BoxStatus oPENING = LiveTreasureBoxModel$BoxStatus.OPENING;
       if (this.mBoxStatus == oPENING && (p0 == LiveTreasureBoxModel$BoxStatus.COUNTED_DOWN || p0 == LiveTreasureBoxModel$BoxStatus.OPENED)) {
          long l = System.currentTimeMillis() - this.mOpeningStartTimeMillisecond;
          if (l - 200 < 0) {
             k1.r(new c(this, p0), Math.max(0, l));
             return;
          }else {
             this.mPendingAnimation = true;
          }
       }
       if (p0 == oPENING) {
          this.mOpeningStartTimeMillisecond = System.currentTimeMillis();
       }
       this.mBoxStatus = p0;
       this.notifyChanged();
       return;
    }
    public void setDataTimeStamp(long p0){
       this.mDataTimeStamp = p0;
    }
    public void setLast(boolean p0){
       this.mIsLast = p0;
    }
    public void setPosition(int p0){
       this.mPosition = p0;
    }
    public void setStartCountDownWatchedTime(int p0){
       this.mStartCountDownWatchedTime = p0;
    }
    public void setToleranceFlag(String p0){
       this.mToleranceFlag = p0;
    }
    public void syncStatusWithModel(LiveTreasureBoxModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTreasureBoxModel.class, "2")) {
          return;
       }
       this.setBoxStatus(p0.getBoxStatus());
       this.setStartCountDownWatchedTime(p0.mStartCountDownWatchedTime);
       this.onWatchedTimeChanged(p0.mWatchedSecond, true);
       this.setDataTimeStamp(p0.getDataTimeStamp());
       this.mKShell = p0.mKShell;
       if (p0.mBoxStatus != LiveTreasureBoxModel$BoxStatus.OPENED) {
          this.mPendingAnimation = false;
       }
       return;
    }
}
