package com.kuaishou.live.core.show.subscribe.model.LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail;
import java.io.Serializable;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.HashSet;
import ok2.j;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.core.show.subscribe.model.b;
import ok.o;
import com.kuaishou.live.core.show.subscribe.model.a;
import ok.h;
import com.google.common.collect.ImmutableSet;

public class LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail implements Serializable	// class@00112f
{
    public LiveAnchorSubscriberCreateConfig$LiveSubscribeBannedInfo mBannedInfo;
    public String mHelpUrl;
    public String mHelpUrlLight;
    public boolean mIsSubscribePendantSwitchOn;
    public String mPendantSubtitle;
    public String mPendantTitle;
    public boolean mShouldShowSuccessTips;
    public LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDescription mSubscribeDescription;
    public List mSubscribeInfoList;
    public LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeLastInfo mSubscribeLastInfo;
    public static final long serialVersionUID = 0xad35d6b2146d9327;

    public void LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail(){
       super();
       this.mShouldShowSuccessTips = false;
    }
    public Set getEditableSubscribeTypes(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorSubscriberCreateConfig$LiveEntrySubscribeDetail.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mSubscribeInfoList)) {
          return new HashSet(j.x);
       }
       HashSet hashSet = new HashSet(j.x);
       hashSet.removeAll(m.s(this.mSubscribeInfoList).p(b.b).F(a.b).D());
       return hashSet;
    }
    public boolean isBanned(){
       boolean b = (this.mBannedInfo != null)? true: false;
       return b;
    }
}
