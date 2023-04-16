package com.kwai.video.clipkit.ClipExportHandler$ClipExportListenerV2;
import com.kwai.video.clipkit.ClipExportHandler$ClipExportListener;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;

public interface abstract ClipExportHandler$ClipExportListenerV2 implements ClipExportHandler$ClipExportListener	// class@001a16
{

    void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1);
}
