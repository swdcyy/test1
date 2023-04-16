package com.kwai.video.westeros.models.BitmapOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.ByteString;
import com.kwai.video.westeros.models.Bitmap$Format;

public interface abstract BitmapOrBuilder implements MessageLiteOrBuilder	// class@000ebd
{

    ByteString getData();
    Bitmap$Format getFormat();
    int getFormatValue();
    int getHeight();
    int getWidth();
}
