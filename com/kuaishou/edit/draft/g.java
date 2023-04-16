package com.kuaishou.edit.draft.g;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.ImportCoverParam;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Cover$ParameterCase;
import com.kuaishou.edit.draft.PictureCoverParam;
import com.kuaishou.edit.draft.Sticker;
import java.util.List;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam;

public interface abstract g implements MessageLiteOrBuilder	// class@001930
{

    Attributes getAttributes();
    ImportCoverParam getImportCoverParam();
    ImportCoverParamV2 getImportCoverParamV2();
    String getOriginalFrameFile();
    ByteString getOriginalFrameFileBytes();
    String getOutputFile();
    ByteString getOutputFileBytes();
    Cover$ParameterCase getParameterCase();
    PictureCoverParam getPictureCoverParam();
    Sticker getStickers(int p0);
    int getStickersCount();
    List getStickersList();
    Text getTexts(int p0);
    int getTextsCount();
    List getTextsList();
    Cover$Type getType();
    int getTypeValue();
    VideoCoverParam getVideoCoverParam();
    boolean hasAttributes();
    boolean hasImportCoverParam();
    boolean hasImportCoverParamV2();
    boolean hasPictureCoverParam();
    boolean hasVideoCoverParam();
}
