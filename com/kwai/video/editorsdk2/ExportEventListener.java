package com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$RenderRange;

public interface abstract ExportEventListener	// class@001c46
{

    void onCancelled(ExportTask p0);
    void onError(ExportTask p0);
    void onFinished(ExportTask p0,EditorSdk2$RenderRange[] p1);
    void onNewFrame(ExportTask p0,double p1);
    void onProgress(ExportTask p0,double p1);
}
