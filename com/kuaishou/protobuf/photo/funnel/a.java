package com.kuaishou.protobuf.photo.funnel.a;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.AlbumStat$NextMode;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;

public interface abstract a implements MessageLiteOrBuilder	// class@000e84
{

    long getCntPhoto();
    long getCntVideo();
    boolean getFinalSelMode();
    boolean getInitSelMode();
    boolean getIsEnter();
    int getMaxLimit();
    AlbumStat$NextMode getNextMode();
    int getNextModeValue();
    String getSelectPath(int p0);
    ByteString getSelectPathBytes(int p0);
    int getSelectPathCount();
    List getSelectPathList();
}
