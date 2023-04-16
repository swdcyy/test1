package com.kwai.components.nearbymodel.model.NearbyMapFeed;
import java.io.Serializable;
import java.lang.Object;

public class NearbyMapFeed implements Serializable	// class@000cb5
{
    public double latitude;
    public double longitude;
    public int mAuthorHeaderTagType;
    public int mCardStyle;
    public String mDefaultText;
    public String mFeedLandingLink;
    public int mHotCardLeftTagType;
    public boolean mMarkerSelected;
    public NearbyMapFeed$RelationTag mRelationTag;
    public NearbyMapFeed$RoleInfo mRoleInfo;
    public List mTags;
    public static final long serialVersionUID = 0x7f219a9d6ea69138;

    public void NearbyMapFeed(){
       super();
    }
}
