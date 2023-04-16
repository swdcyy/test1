package com.kwai.link.model.NetworkInfo;
import java.lang.Object;
import com.kwai.link.model.NetworkInfo$NetworkType;
import java.lang.Enum;

public class NetworkInfo	// class@000d21
{
    public String apn_name;
    public boolean is_available;
    public int network_type;

    public void NetworkInfo(){
       super();
       this.is_available = false;
       this.network_type = NetworkInfo$NetworkType.kNone.ordinal();
       this.apn_name = "unknown";
    }
}
