package com.kwai.video.krtc.videoprocessing.VideoProcessingCallback;
import java.lang.Object;
import com.kwai.video.krtc.videoprocessing.VideoProcessFrame;

public abstract class VideoProcessingCallback	// class@0008ce
{

    public void VideoProcessingCallback(){
       super();
    }
    public abstract void onProcessedFrame(VideoProcessFrame p0);
}
