package com.android.kwai.platform.notification.core.config.IRemoteService;
import com.android.kwai.foundation.network.IRpcService;
import com.android.kwai.foundation.network.IRpcService$Callback;
import com.android.kwai.foundation.network.core.ICancelFeature;

public interface abstract IRemoteService implements IRpcService	// class@000408
{

    ICancelFeature fetchRemoteConfig(IRpcService$Callback p0);
}
