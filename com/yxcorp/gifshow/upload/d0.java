package com.yxcorp.gifshow.upload.d0;
import java.lang.String;
import com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import com.yxcorp.gifshow.upload.d0$a;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.util.List;

public interface abstract d0	// class@001e68
{

    boolean X(String p0);
    LocalMusicUploadInfo b3(String p0);
    void c3(d0$a p0);
    boolean cancel(String p0);
    String d3(LocalMusicUploadInfo p0);
    List e3(IUploadInfo$Status[] p0);
    void f3(d0$a p0);
}
