package com.kwai.video.ksspark.NewSparkConstructListener;
import java.lang.String;
import com.kwai.video.ksspark.model.VideoProjectWrapper;
import java.util.Map;

public interface abstract NewSparkConstructListener	// class@000924
{

    void onCancel();
    void onFail(int p0,String p1);
    void onProgress(float p0);
    void onStart(String p0);
    void onSuccess(VideoProjectWrapper p0,Map p1);
}
