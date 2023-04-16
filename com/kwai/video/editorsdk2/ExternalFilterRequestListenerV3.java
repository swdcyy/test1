package com.kwai.video.editorsdk2.ExternalFilterRequestListenerV3;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import com.kwai.video.editorsdk2.ExternalFilterResult;
import com.kwai.video.editorsdk2.ExternalFilterInitParams;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;
import com.kwai.video.editorsdk2.ExternalFilterFrameInfo;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig;

public interface abstract ExternalFilterRequestListenerV3	// class@001c5f
{

    ExternalFilterResult filterOriginalFrame(ExternalFilterRequest p0);
    ExternalFilterResult filterProcessedFrame(ExternalFilterRequest p0);
    void init(ExternalFilterInitParams p0);
    void releaseFilter(ExternalFilterReleaseParams p0);
    ExternalFilterDataFormatConfig willFilterOriginalFrame(ExternalFilterFrameInfo p0);
    ExternalFilterDataFormatConfig willFilterProcessedFrame(ExternalFilterFrameInfo p0);
}
