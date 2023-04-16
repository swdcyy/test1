package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigResponse$a;
import nsd.u;
import java.lang.Object;

public final class KgiCloudRpConfigResponse implements Serializable	// class@0013e5
{
    public KgiCloudRpConfig config;
    public static final KgiCloudRpConfigResponse$a Companion;
    public static final long serialVersionUID;

    static {
       KgiCloudRpConfigResponse.Companion = new KgiCloudRpConfigResponse$a(null);
       KgiCloudRpConfigResponse.serialVersionUID = -131122942;
    }
    public void KgiCloudRpConfigResponse(){
       super();
    }
    public static final long getSerialVersionUID(){
       return KgiCloudRpConfigResponse.serialVersionUID;
    }
}
