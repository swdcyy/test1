package com.kwai.video.ksspark.NewSparkDownloadService;
import java.lang.String;
import com.kwai.video.ksspark.NewSparkDownloadConfig;
import com.kwai.video.ksspark.NewSparkDownloadListener;

public interface abstract NewSparkDownloadService	// class@000928
{

    void cancel(String p0);
    void download(NewSparkDownloadConfig p0,NewSparkDownloadListener p1);
}
