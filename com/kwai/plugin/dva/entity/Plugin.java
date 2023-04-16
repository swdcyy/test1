package com.kwai.plugin.dva.entity.Plugin;
import android.app.Application;
import java.lang.ClassLoader;
import java.lang.String;
import android.content.pm.PackageInfo;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import android.content.res.Resources;

public interface abstract Plugin	// class@001300
{

    Application getApplication();
    ClassLoader getClassLoader();
    String getName();
    PackageInfo getPackageInfo();
    PluginInfo getPluginInfo();
    int getPluginType();
    Resources getResources();
}
