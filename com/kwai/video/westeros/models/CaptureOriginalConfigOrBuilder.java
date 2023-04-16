package com.kwai.video.westeros.models.CaptureOriginalConfigOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract CaptureOriginalConfigOrBuilder implements MessageLiteOrBuilder	// class@000eee
{

    boolean getCaptureDepthVideo();
    boolean getCaptureForContentCheck();
    boolean getCaptureOriginalFrames();
    boolean getCaptureOriginalVideo();
    String getCaptureVideoKey();
    ByteString getCaptureVideoKeyBytes();
    float getFrameInterval();
    float getFrameMaxSize();
    float getFrameMaxUploadSize();
    float getFrameStartTime();
}
