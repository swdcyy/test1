package com.yxcorp.gifshow.retrofit.service.KwaiSegmentUploadService;
import java.util.Map;
import okhttp3.MultipartBody$Part;
import brd.t;

public interface abstract KwaiSegmentUploadService	// class@001b11
{

    t atlasUpload(Map p0,MultipartBody$Part p1);
    t segmentUploadFile(Map p0,MultipartBody$Part p1);
}
