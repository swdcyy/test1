package com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class PluginInstallException extends Exception	// class@00135e
{
    public final int code;

    public void PluginInstallException(int p0){
       super(p0, "", null);
    }
    public void PluginInstallException(int p0,String p1){
       super(p0, p1, null);
    }
    public void PluginInstallException(int p0,String p1,Throwable p2){
       super(p1, p2);
       this.code = p0;
    }
    public int getCode(){
       return this.code;
    }
}
