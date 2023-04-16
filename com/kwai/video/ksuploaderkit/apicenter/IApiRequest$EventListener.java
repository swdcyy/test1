package com.kwai.video.ksuploaderkit.apicenter.IApiRequest$EventListener;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$UploadStep;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import java.lang.String;
import com.kwai.video.ksuploaderkit.network.HttpRequestInfo;

public interface abstract IApiRequest$EventListener	// class@000993
{

    void onComplete(ApiManager$UploadStep p0,NetworkUtils$NetErrorCode p1,String p2);
    void onReportAPILog(ApiManager$UploadStep p0,HttpRequestInfo p1);
}
