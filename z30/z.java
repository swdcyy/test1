package z30.z;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Attributes;
import java.util.List;
import com.kuaishou.edit.draft.Url;
import com.kuaishou.edit.draft.StickerResult;

public interface abstract z implements MessageLiteOrBuilder	// class@003479
{

    boolean getAeRender();
    double getAnimateInRatio();
    String getAnimateInputPath();
    ByteString getAnimateInputPathBytes();
    double getAnimateOutRatio();
    String getAnimateOutputPath();
    ByteString getAnimateOutputPathBytes();
    Attributes getAttributes();
    String getFontFilePath();
    ByteString getFontFilePathBytes();
    String getFontName();
    ByteString getFontNameBytes();
    String getLyricTexts(int p0);
    ByteString getLyricTextsBytes(int p0);
    int getLyricTextsCount();
    List getLyricTextsList();
    String getLyricsFile();
    ByteString getLyricsFileBytes();
    Url getMmuLrcUrls(int p0);
    int getMmuLrcUrlsCount();
    List getMmuLrcUrlsList();
    StickerResult getStickerResults(int p0);
    int getStickerResultsCount();
    List getStickerResultsList();
    String getStyleId();
    ByteString getStyleIdBytes();
    double getTextRangeRatio();
    String getTextStylePath();
    ByteString getTextStylePathBytes();
    boolean hasAttributes();
}
