package com.kwai.video.clipkit.ClipImportHandler$ClipImportHandlerListener;
import com.kwai.video.clipkit.ClipImportException;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;
import java.lang.String;

public interface abstract ClipImportHandler$ClipImportHandlerListener	// class@001a26
{

    void onClipImportCanceled();
    void onClipImportError(int p0,ClipImportException p1);
    void onClipImportFinish(ClipImportHandler$ClipImportResult p0);
    void onClipImportProgress(int p0,double p1,double p2);
    void onClipImportSuccess(int p0,String p1);
}
