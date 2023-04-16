package com.oplus.ocs.base.common.api.OplusApiClient;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.AuthResult;
import android.os.Looper;
import android.os.IBinder;
import com.oplus.ocs.base.common.api.i;
import com.oplus.ocs.base.common.api.j;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import android.os.Handler;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;

public interface abstract OplusApiClient	// class@000ad2
{

    void addQueue(TaskListenerHolder p0);
    void connect();
    void disconnect();
    Api getApi();
    AuthResult getAuthResult();
    Looper getLooper();
    IBinder getRemoteService();
    int getRemoteVersion();
    boolean isConnected();
    boolean isConnecting();
    void setOnCapabilityAuthListener(i p0);
    void setOnClearListener(j p0);
    void setOnConnectionFailedListener(OnConnectionFailedListener p0,Handler p1);
    void setOnConnectionSucceedListener(OnConnectionSucceedListener p0,Handler p1);
}
