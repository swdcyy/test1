package com.kuaishou.live.core.show.vote.model.VoteMessageInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.vote.response.LiveVoterResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.vote.model.LiveVoteContext;
import ekd.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import em2.d;
import java.util.Iterator;
import com.kuaishou.live.core.show.vote.model.LiveVoteOption;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCVoteChanged;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveVoteOptionModel;
import java.util.Collection;
import ekd.q;

public class VoteMessageInfo implements Serializable	// class@00123c
{
    public long mDurationDuration;
    public LiveVoteOption[] mOptions;
    public long mRestTime;
    public String mTopic;
    public String mVoteId;

    public void VoteMessageInfo(){
       super();
    }
    public LiveVoterResponse reproduceLiveVoterResponseForAnchor(){
       LiveVoterResponse obj = PatchProxy.apply(null, this, VoteMessageInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveVoterResponse();
       LiveVoteContext liveVoteCont = new LiveVoteContext();
       obj.mVote = liveVoteCont;
       liveVoteCont.mVoteId = this.mVoteId;
       liveVoteCont.mQuestion = this.mTopic;
       liveVoteCont.mLeftMillis = this.mRestTime;
       liveVoteCont.mVoteDuration = this.mDurationDuration;
       obj.mVote.mOptions = (j.h(this.mOptions))? new ArrayList(): Arrays.asList(this.mOptions);
       int i = d.a(obj.mVote.mOptions);
       Iterator iterator = obj.mVote.mOptions.iterator();
       while (iterator.hasNext()) {
          LiveVoteOption liveVoteOpti = iterator.next();
          if (i > 0 && (liveVoteOpti != null && liveVoteOpti.mCount == i)) {
             liveVoteOpti.isHighLight = true;
          }else {
             liveVoteOpti.isHighLight = false;
          }
       }
       return obj;
    }
    public void updateFromVoteMessage(LiveStreamMessages$SCVoteChanged p0,boolean p1){
       LiveVoteOption liveVoteOpti1;
       int len1;
       int i2;
       if (PatchProxy.isSupport(VoteMessageInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, VoteMessageInfo.class, "2")) {
          return;
       }
       this.mVoteId = p0.voteId;
       VoteMessageInfo tmOptions = this.mOptions;
       if (tmOptions == null || tmOptions.length != p0.options.length) {
          LiveVoteOption[] liveVoteOpti = new LiveVoteOption[p0.options.length];
          this.mOptions = liveVoteOpti;
       }
       LiveStreamMessages$SCVoteChanged options = p0.options;
       int len = options.length;
       int i = 0;
       while (i < len) {
          object oobject = options[i];
          int i1 = 0;
          VoteMessageInfo tmOptions1 = this.mOptions;
          while (i1 < tmOptions1.length) {
             if (tmOptions1[i1] == null) {
                tmOptions1[i1] = new LiveVoteOption();
             }
             tmOptions1 = this.mOptions;
             if (tmOptions1[i1].mOptionId == oobject.id) {
                LiveStreamMessages$SCVoteChanged options1 = p0.options;
                tmOptions1[i1].mCount = options1[i1].count;
                tmOptions1[i1].mDisplayCount = options1[i1].displayCount;
                break ;
             }
             i1 = i1 + 1;
          }
          i = i + 1;
       }
       if (p1) {
          VoteMessageInfo tmOptions2 = this.mOptions;
          if (tmOptions2 == null || !tmOptions2.length) {
             liveVoteOpti1 = -1;
          }else {
             len1 = tmOptions2.length;
             i2 = 0;
             liveVoteOpti1 = 0;
             while (i2 < len1) {
                LiveVoteOption mCount = tmOptions2[i2].mCount;
                if (mCount >= liveVoteOpti1) {
                   liveVoteOpti1 = mCount;
                }
                i2 = i2 + 1;
             }
          }
          tmOptions2 = this.mOptions;
          len1 = tmOptions2.length;
          i2 = 0;
          while (i2 < len1) {
             object oobject1 = tmOptions2[i2];
             if (oobject1 != null) {
                oobject1.isHighLight = (liveVoteOpti1 > null && oobject1.mCount == liveVoteOpti1)? true: false;
             }
          label_0099 :
             i2 = i2 + 1;
          }
       }
       return;
    }
    public void updateFromVoteResponse(LiveVoterResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteMessageInfo.class, "3")) {
          return;
       }
       LiveVoterResponse mVote = p0.mVote;
       this.mVoteId = mVote.mVoteId;
       this.mRestTime = mVote.mLeftMillis;
       this.mTopic = mVote.mQuestion;
       LiveVoteOption[] liveVoteOpti = new LiveVoteOption[mVote.mOptions.size()];
       this.mOptions = liveVoteOpti;
       p0 = p0.mVote;
       this.mDurationDuration = p0.mVoteDuration;
       p0.mOptions.toArray(liveVoteOpti);
       return;
    }
    public void updateOptionTo(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteMessageInfo.class, "1")) {
          return;
       }
       if (!j.h(this.mOptions) && !q.f(p0)) {
          VoteMessageInfo tmOptions = this.mOptions;
          int len = tmOptions.length;
          int i = 0;
          while (i < len) {
             object oobject = tmOptions[i];
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                LiveVoteOption liveVoteOpti = iterator.next();
                if (oobject.mOptionId == liveVoteOpti.mOptionId) {
                   LiveVoteOption mCount = oobject.mCount;
                   if (mCount > liveVoteOpti.mCount) {
                      liveVoteOpti.mCount = mCount;
                      liveVoteOpti.mDisplayCount = oobject.mDisplayCount;
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
