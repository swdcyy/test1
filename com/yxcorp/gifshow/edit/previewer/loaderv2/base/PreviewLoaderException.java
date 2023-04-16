package com.yxcorp.gifshow.edit.previewer.loaderv2.base.PreviewLoaderException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class PreviewLoaderException extends Exception	// class@001b31
{
    public boolean mNetWorkFailed;

    public void PreviewLoaderException(String p0){
       super(p0);
    }
    public void PreviewLoaderException(String p0,boolean p1){
       super(p0);
       this.mNetWorkFailed = p1;
    }
    public void PreviewLoaderException(Throwable p0){
       super(p0);
    }
}
