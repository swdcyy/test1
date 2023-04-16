package com.vivo.vms.IPCInvoke;
import android.os.IInterface;
import android.os.Bundle;
import com.vivo.vms.IPCCallback;

public interface abstract IPCInvoke implements IInterface	// class@0010d0
{

    Bundle asyncCall(Bundle p0,IPCCallback p1);
}
