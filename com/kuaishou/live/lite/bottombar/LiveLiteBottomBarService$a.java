package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import android.content.Context;
import android.view.View;
import com.google.gson.JsonObject;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarItemChangeReason;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;

public interface abstract LiveLiteBottomBarService$a	// class@001eb1
{

    View a(Context p0);
    JsonObject b();
    boolean c();
    JsonObject d();
    void f(LiveLiteBottomBarService$BottomBarItemChangeReason p0);
    void g(LiveLiteBottomBarService$BottomBarItemChangeReason p0);
    LiveLiteBottomBarService$BottomBarType getType();
    boolean i();
}
