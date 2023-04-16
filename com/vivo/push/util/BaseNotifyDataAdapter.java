package com.vivo.push.util.BaseNotifyDataAdapter;
import com.vivo.push.model.InsideNotificationItem;
import android.content.Context;

public interface abstract BaseNotifyDataAdapter	// class@0010a8
{

    int getDefaultNotifyIcon();
    int getDefaultSmallIconId();
    int getNotifyMode(InsideNotificationItem p0);
    void init(Context p0);
}
