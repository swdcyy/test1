package z30.d;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Template;
import com.kuaishou.edit.draft.Beauty;
import java.util.List;
import com.kuaishou.edit.draft.ColorFilter;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.FineTuningParam;
import com.kuaishou.edit.draft.Makeup;

public interface abstract d implements MessageLiteOrBuilder	// class@003424
{

    Template getAtlasTemplate();
    Beauty getBeauty(int p0);
    int getBeautyCount();
    List getBeautyList();
    ColorFilter getColorFilter(int p0);
    int getColorFilterCount();
    List getColorFilterList();
    String getCropFile();
    ByteString getCropFileBytes();
    CropOptions getCropOptions();
    String getFile();
    ByteString getFileBytes();
    FineTuningParam getFineTuningParam();
    String getIdentifier();
    ByteString getIdentifierBytes();
    Makeup getMakeup(int p0);
    int getMakeupCount();
    List getMakeupList();
    double getOriginPicHeight();
    double getOriginPicWidth();
    boolean hasAtlasTemplate();
    boolean hasCropOptions();
    boolean hasFineTuningParam();
}
