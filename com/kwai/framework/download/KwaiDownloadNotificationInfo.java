package com.kwai.framework.download.KwaiDownloadNotificationInfo;
import java.io.Serializable;
import java.lang.String;
import android.os.Bundle;
import android.content.Intent;

public interface abstract KwaiDownloadNotificationInfo implements Serializable	// class@001533
{

    boolean canProcessNotificationClick(int p0);
    String getNotificationIconUrl(int p0);
    Bundle getNotificationIntentExtras(int p0);
    long getNotificationShowWhen(int p0);
    String getNotificationTargetName(int p0);
    boolean isNotificationCancellable(int p0);
    void onNotificationClick(int p0,int p1,Intent p2);
}
