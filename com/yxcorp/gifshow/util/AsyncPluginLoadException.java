package com.yxcorp.gifshow.util.AsyncPluginLoadException;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Throwable;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.StringBuilder;

public class AsyncPluginLoadException extends IllegalStateException	// class@001ecf
{
    public int mCode;
    public Throwable mExtraThrowable;

    public void AsyncPluginLoadException(String p0){
       super(p0);
       this.mCode = -1;
    }
    public void AsyncPluginLoadException(String p0,Throwable p1){
       super(p0, p1);
       this.mCode = -1;
       if (p1 instanceof PluginInstallException) {
          this.mCode = p1.getCode();
       }
       return;
    }
    public int getCode(){
       return this.mCode;
    }
    public Throwable getExtraThrowable(){
       return this.mExtraThrowable;
    }
    public void setExtraThrowable(Throwable p0){
       this.mExtraThrowable = p0;
    }
    public String toString(){
       return this.mCode+","+super.toString();
    }
}
