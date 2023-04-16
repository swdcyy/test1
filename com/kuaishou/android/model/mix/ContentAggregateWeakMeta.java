package com.kuaishou.android.model.mix.ContentAggregateWeakMeta;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;
import com.kwai.framework.model.common.Distance;
import lnc.m1;

public class ContentAggregateWeakMeta implements Serializable, a	// class@000c08
{
    public int mContentType;
    public long mCreateTime;
    public Distance mDistance;
    public String mDistanceStr;
    public JsonObject mEventTrackingExtParams;
    public String mId;
    public boolean mIsFarAway;
    public String mLinkUrl;
    public boolean mShowTime;
    public String mSubTitle;
    public NearTag mTag;
    public String mTitle;
    public String mTypeName;
    public List mUsers;
    public static final long serialVersionUID = 0x9930286a5ae85ad0;

    public void ContentAggregateWeakMeta(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ContentAggregateWeakMeta.class, "1")) {
          return;
       }
       if (this.mDistance != null) {
          this.mDistanceStr = m1.a(b.J(), (long)this.mDistance.mDistance);
          this.mIsFarAway = m1.c((long)this.mDistance.mDistance);
       }
       return;
    }
}
