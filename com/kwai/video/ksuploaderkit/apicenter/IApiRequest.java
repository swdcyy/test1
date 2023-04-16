package com.kwai.video.ksuploaderkit.apicenter.IApiRequest;
import java.lang.String;
import com.kwai.video.ksuploaderkit.apicenter.ApiResponse;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import ln.b;
import com.kwai.video.ksuploaderkit.apicenter.IApiRequest$EventListener;
import com.kwai.video.ksuploaderkit.KSUploaderKitConfig$UploadInfo;

public interface abstract IApiRequest	// class@000994
{

    ApiResponse fetchResumeInfo(String p0);
    ApiResponse getCachedApiResponse(String p0);
    b getRickonTokenResponse(ApiResponse p0,ApiManager$TokenType p1);
    long getStartFileSize();
    ApiResponse getUploadToken(ApiManager$TokenType p0);
    void publish(ApiManager$TokenType p0);
    void removeCachedApiResponse(String p0);
    void setEventListener(IApiRequest$EventListener p0);
    void setExternalApiResponse(ApiResponse p0);
    void setUploadInfo(KSUploaderKitConfig$UploadInfo p0);
}
