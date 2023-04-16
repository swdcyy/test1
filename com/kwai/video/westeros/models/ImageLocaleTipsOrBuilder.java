package com.kwai.video.westeros.models.ImageLocaleTipsOrBuilder;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import java.util.Map;

public interface abstract ImageLocaleTipsOrBuilder implements MessageLiteOrBuilder	// class@000f92
{

    boolean containsTips(String p0);
    int getDisplayDuration();
    Map getTips();
    int getTipsCount();
    Map getTipsMap();
    String getTipsOrDefault(String p0,String p1);
    String getTipsOrThrow(String p0);
}
