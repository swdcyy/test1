package com.kwai.video.westeros.models.MemojiResultSingleFaceOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kwai.video.westeros.models.MemojiHint;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract MemojiResultSingleFaceOrBuilder implements MessageLiteOrBuilder	// class@000fbb
{

    MemojiHint getHint();
    int getHintValue();
    String getResultJson();
    ByteString getResultJsonBytes();
    boolean getSuccess();
}
