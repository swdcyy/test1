package com.kwai.video.ksuploaderkit.apicenter.IApiService;
import okhttp3.RequestBody;
import java.lang.String;
import retrofit2.a;

public interface abstract IApiService	// class@000995
{

    a fragmentUpload(RequestBody p0,int p1,String p2,String p3);
    a fragmentUploadFinished(int p0,String p1);
    a getImageUploadToken(RequestBody p0);
    a getResumeInfo(String p0);
    a getVideoUploadToken(RequestBody p0);
    a publishImage(RequestBody p0);
    a publishVideo(RequestBody p0);
}
