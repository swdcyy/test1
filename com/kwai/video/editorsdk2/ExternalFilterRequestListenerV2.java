package com.kwai.video.editorsdk2.ExternalFilterRequestListenerV2;
import com.kwai.video.editorsdk2.ExternalFilterRequestListenerV3;
import java.lang.Object;
import com.kwai.video.editorsdk2.ExternalFilterRequest;
import com.kwai.video.editorsdk2.ExternalFilterResult;
import com.kwai.video.editorsdk2.ExternalFilterInitParams;
import com.kwai.video.editorsdk2.ExternalFilterReleaseParams;
import com.kwai.video.editorsdk2.ExternalFilterFrameInfo;
import com.kwai.video.editorsdk2.ExternalFilterDataFormatConfig;

public abstract class ExternalFilterRequestListenerV2 implements ExternalFilterRequestListenerV3	// class@001c5e
{

    public void ExternalFilterRequestListenerV2(){
       super();
    }
    public ExternalFilterResult filterOriginalFrame(ExternalFilterRequest p0){
       return null;
    }
    public ExternalFilterResult filterProcessedFrame(ExternalFilterRequest p0){
       return null;
    }
    public void init(ExternalFilterInitParams p0){
    }
    public boolean originalFilterSkippable(){
       return false;
    }
    public boolean processedFilterSkippable(){
       return false;
    }
    public void releaseFilter(ExternalFilterReleaseParams p0){
    }
    public ExternalFilterDataFormatConfig willFilterOriginalFrame(ExternalFilterFrameInfo p0){
       return null;
    }
    public ExternalFilterDataFormatConfig willFilterProcessedFrame(ExternalFilterFrameInfo p0){
       return null;
    }
}
