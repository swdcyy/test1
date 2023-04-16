package com.kwai.video.editorsdk2.ExportEventListenerV2;
import com.kwai.video.editorsdk2.ExportEventListener;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.ExportedPipelineTempFilesState;
import com.kwai.video.editorsdk2.EncodedSegmentInfo;

public interface abstract ExportEventListenerV2 implements ExportEventListener	// class@001c47
{

    void onPipelineTemporaryFileParsed(ExportTask p0,ExportedPipelineTempFilesState p1);
    void onSegmentEncoded(ExportTask p0,EncodedSegmentInfo p1);
}
