package com.kwai.video.clipkit.ClipExportHandler$ClipExportListener;
import com.kwai.video.clipkit.ClipExportException;
import java.lang.String;

public interface abstract ClipExportHandler$ClipExportListener	// class@001a15
{

    void onCancelled();
    void onError(ClipExportException p0);
    void onFinish(String p0);
    void onProgress(double p0);
}
