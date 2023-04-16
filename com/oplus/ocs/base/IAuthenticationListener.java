package com.oplus.ocs.base.IAuthenticationListener;
import android.os.IInterface;
import com.oplus.ocs.base.common.CapabilityInfo;

public interface abstract IAuthenticationListener implements IInterface	// class@000aac
{

    void onFail(int p0);
    void onSuccess(CapabilityInfo p0);
}
