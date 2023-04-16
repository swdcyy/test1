package com.kuaishou.aegon.NetworkSwitchCallback;
import com.kuaishou.aegon.NetworkSwitchCallback$Status;
import java.lang.String;

public interface abstract NetworkSwitchCallback	// class@00079d
{

    void a(NetworkSwitchCallback$Status p0);
    void onError(String p0);
}
