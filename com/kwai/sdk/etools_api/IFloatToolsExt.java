package com.kwai.sdk.etools_api.IFloatToolsExt;
import android.content.Context;

public interface abstract IFloatToolsExt	// class@00142e
{

    boolean hideFloatTools();
    boolean isFloatToolsSwitcherOn(boolean p0);
    boolean showFloatTools(Context p0);
    void updateFloatToolsShown(boolean p0,Context p1);
    void updateSwitcherOn(boolean p0);
}
