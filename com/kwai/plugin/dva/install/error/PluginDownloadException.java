package com.kwai.plugin.dva.install.error.PluginDownloadException;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.String;
import java.lang.Throwable;

public class PluginDownloadException extends PluginInstallException	// class@00135d
{

    public void PluginDownloadException(int p0){
       super(p0);
    }
    public void PluginDownloadException(int p0,String p1){
       super(p0, p1);
    }
    public void PluginDownloadException(int p0,String p1,Throwable p2){
       super(p0, p1, p2);
    }
}
