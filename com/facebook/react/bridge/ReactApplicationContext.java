package com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;

public class ReactApplicationContext extends ReactContext	// class@001219
{

    public void ReactApplicationContext(Context p0){
       super(p0.getApplicationContext());
    }
}
