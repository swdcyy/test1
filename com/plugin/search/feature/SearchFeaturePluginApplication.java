package com.plugin.search.feature.SearchFeaturePluginApplication;
import android.app.Application;

public class SearchFeaturePluginApplication extends Application	// class@000b52
{

    public void SearchFeaturePluginApplication(){
       super();
    }
    public static void doRegister(){
    }
    public void onCreate(){
       super.onCreate();
       SearchFeaturePluginApplication.doRegister();
    }
}
