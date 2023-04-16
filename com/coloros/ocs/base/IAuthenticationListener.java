package com.coloros.ocs.base.IAuthenticationListener;
import android.os.IInterface;
import com.oplus.ocs.base.common.CapabilityInfo;

public interface abstract IAuthenticationListener implements IInterface	// class@000f7b
{

    void onFail(int p0);
    void onSuccess(CapabilityInfo p0);
}
