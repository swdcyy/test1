package com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class MapRoleInfoResponse implements Serializable	// class@001c7a
{
    public boolean mEnableRole;
    public NearbyMapFeed$RoleInfo$Moment mMoment;
    public NearbyMapFeed$RoleInfo$Role mRole;
    public User mUser;
    public static final long serialVersionUID = 0x16831a6f6381e832;

    public void MapRoleInfoResponse(){
       super();
    }
}
