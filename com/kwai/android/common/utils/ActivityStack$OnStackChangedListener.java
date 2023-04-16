package com.kwai.android.common.utils.ActivityStack$OnStackChangedListener;
import android.app.Activity;

public interface abstract ActivityStack$OnStackChangedListener	// class@000998
{

    void onAppPause();
    void onAppResume();
    void onPop(Activity p0);
    void onPush(Activity p0);
    void onStackGonnaEmpty(Activity p0);
}
