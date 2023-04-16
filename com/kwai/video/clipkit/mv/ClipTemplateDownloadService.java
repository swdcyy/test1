package com.kwai.video.clipkit.mv.ClipTemplateDownloadService;
import java.lang.String;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadConfig;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;

public interface abstract ClipTemplateDownloadService	// class@001ab7
{

    void cancel(String p0);
    void download(ClipTemplateDownloadConfig p0,ClipTemplateDownloadListener p1);
}
