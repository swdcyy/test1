package com.yxcorp.gifshow.photo.download.task.exception.NoSpaceException;
import com.yxcorp.gifshow.photo.download.task.exception.DownloadException;
import android.app.Application;
import o56.a;
import java.lang.String;

public class NoSpaceException extends DownloadException	// class@000ef7
{

    public void NoSpaceException(){
       super(-100003, a.b().getString(0x7f1043cd));
    }
}
