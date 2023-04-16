package com.kwai.components.nearbymodel.model.NearbyCommonMeta;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.CommonMeta;
import fa6.e;
import fa6.b;

public class NearbyCommonMeta implements Serializable	// class@000c95
{
    public boolean mIsChatted;
    public String mLinkUrl;
    public String mMomentId;
    public NearbyFeedBottomCard mNearbyFeedBottomCard;
    public NearbyLocalLifePoiV2 mNearbyLocalLifePoiV2;
    public NearbyMapFeed mNearbyMapFeed;
    public String mNearbyRecoSlideInfo;
    public boolean mNearbyShowTime;
    public NearbyPhotoMapFastCommentGuide mPhotoMapFastCommentGuide;
    public int momentCategory;
    public static final long serialVersionUID = 0x4cb86884254b6fd6;

    public void NearbyCommonMeta(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, NearbyCommonMeta.class, "1")) {
          return;
       }
       e uoe = new e(NearbyCommonMeta.class, "", "nearbyCommonMeta");
       uoe.a(null);
       c.a.e(CommonMeta.class, uoe);
       return;
    }
}
