package com.kuaishou.edit.draft.Asset$c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.AuditFrame;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.Asset$ShootInfo$CameraType;
import com.kuaishou.edit.draft.MagicFaceEffectRange;
import com.kuaishou.edit.draft.PrettifyStyle;
import com.kuaishou.edit.draft.RecordBeauty;
import com.kuaishou.edit.draft.RecordFilter;
import com.kuaishou.edit.draft.RecordMagicFace;
import com.kuaishou.edit.draft.RecordMakeup;
import com.kuaishou.edit.draft.RecordMusic;
import com.kuaishou.edit.draft.RecordSlimming;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;

public interface abstract Asset$c implements MessageLiteOrBuilder	// class@00170d
{

    AuditFrame getAuditFrame(int p0);
    int getAuditFrameCount();
    List getAuditFrameList();
    double getAverageFrameRate();
    String getBeautifyExtend();
    ByteString getBeautifyExtendBytes();
    Beauty getBeauty();
    Asset$ShootInfo$CameraType getCameraType();
    int getCameraTypeValue();
    int getCountDownCount();
    boolean getCountDownEnabled();
    int getFrameEncryptLength();
    int getFrameEncryptStartIndex();
    AuditFrame getMagicFaceAttributeFrame(int p0);
    int getMagicFaceAttributeFrameCount();
    List getMagicFaceAttributeFrameList();
    MagicFaceEffectRange getMagicFaceEffectRange(int p0);
    int getMagicFaceEffectRangeCount();
    List getMagicFaceEffectRangeList();
    PrettifyStyle getPrettifyStyle();
    double getRate();
    RecordBeauty getRecordBeauty();
    RecordFilter getRecordFilter();
    RecordMagicFace getRecordMagicface();
    RecordMakeup getRecordMakeup();
    RecordMusic getRecordMusic();
    RecordSlimming getRecordSlimming();
    Asset$ShootInfo$Resolution getResolution();
    int getResolutionValue();
    boolean hasBeauty();
    boolean hasPrettifyStyle();
    boolean hasRecordBeauty();
    boolean hasRecordFilter();
    boolean hasRecordMagicface();
    boolean hasRecordMakeup();
    boolean hasRecordMusic();
    boolean hasRecordSlimming();
}
