package com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.BaseJavaModule;
import android.content.Context;

public abstract class ContextBaseJavaModule extends BaseJavaModule	// class@0011b5
{
    public final Context mContext;

    public void ContextBaseJavaModule(Context p0){
       super();
       this.mContext = p0;
    }
    public final Context getContext(){
       return this.mContext;
    }
}
