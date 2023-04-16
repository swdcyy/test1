package com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import java.lang.Object;
import java.util.Map;

public abstract class BaseJavaModule implements NativeModule	// class@00119d
{

    public void BaseJavaModule(){
       super();
    }
    public boolean canOverrideExistingModule(){
       return false;
    }
    public Map getConstants(){
       return null;
    }
    public boolean hasConstants(){
       return false;
    }
    public void initialize(){
    }
    public void invalidate(){
    }
    public void onCatalystInstanceDestroy(){
    }
}
