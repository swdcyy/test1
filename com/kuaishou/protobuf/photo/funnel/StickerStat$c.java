package com.kuaishou.protobuf.photo.funnel.StickerStat$c;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.Position;

public interface abstract StickerStat$c implements MessageLiteOrBuilder	// class@000e67
{

    String getId();
    ByteString getIdBytes();
    Position getPosition();
    float getScale();
    String getType();
    ByteString getTypeBytes();
    boolean hasPosition();
}
