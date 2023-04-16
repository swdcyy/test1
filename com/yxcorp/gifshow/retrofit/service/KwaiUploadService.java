package com.yxcorp.gifshow.retrofit.service.KwaiUploadService;
import brd.t;
import java.lang.String;
import okhttp3.MultipartBody$Part;
import java.util.Map;

public interface abstract KwaiUploadService	// class@001b14
{

    t atlasKey(int p0);
    t commonUpload(String p0,MultipartBody$Part p1);
    t isolatedUpload(String p0,MultipartBody$Part p1);
    t uploadLiveAuthVideo(MultipartBody$Part p0);
    t uploadLiveUserVerifyVideo(String p0,boolean p1,MultipartBody$Part p2);
    t uploadMusic(Map p0,MultipartBody$Part p1);
}
