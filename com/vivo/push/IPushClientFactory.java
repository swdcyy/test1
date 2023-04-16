package com.vivo.push.IPushClientFactory;
import com.vivo.push.o;
import com.vivo.push.d.z;
import android.content.Intent;
import com.vivo.push.l;

public interface abstract IPushClientFactory	// class@00102a
{

    z createReceiveTask(o p0);
    o createReceiverCommand(Intent p0);
    l createTask(o p0);
}
