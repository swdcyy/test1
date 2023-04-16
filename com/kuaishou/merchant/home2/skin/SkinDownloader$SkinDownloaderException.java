package com.kuaishou.merchant.home2.skin.SkinDownloader$SkinDownloaderException;
import java.lang.Exception;
import java.lang.Throwable;
import java.lang.String;

public class SkinDownloader$SkinDownloaderException extends Exception	// class@00181f
{
    public final int errorCode;
    public static final long serialVersionUID = 0x340477ed65bb995c;

    public void SkinDownloader$SkinDownloaderException(int p0,Throwable p1){
       super("SkinDownloader failed", p1);
       this.errorCode = p0;
    }
}
