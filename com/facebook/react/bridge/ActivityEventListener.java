package com.facebook.react.bridge.ActivityEventListener;
import android.app.Activity;
import android.content.Intent;

public interface abstract ActivityEventListener	// class@001197
{

    void onActivityResult(Activity p0,int p1,int p2,Intent p3);
    void onNewIntent(Intent p0);
}
