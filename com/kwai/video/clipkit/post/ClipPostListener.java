package com.kwai.video.clipkit.post.ClipPostListener;
import java.lang.String;
import com.kwai.video.clipkit.post.ClipPostStatus;
import com.kwai.video.clipkit.post.ClipPostResult;
import com.kwai.video.clipkit.post.ClipPostException;

public interface abstract ClipPostListener	// class@001ae2
{

    void onCancel(String p0);
    void onProgress(String p0,double p1,double p2,double p3);
    void onStatusChange(String p0,ClipPostStatus p1,ClipPostResult p2,ClipPostException p3);
}
