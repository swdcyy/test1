package pr4.q;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.MagicFaceStat;
import com.kuaishou.protobuf.photo.funnel.MusicStat;
import com.kuaishou.protobuf.photo.funnel.RecordBaseStat;
import com.kuaishou.protobuf.photo.funnel.PrettifyStat;

public interface abstract q implements MessageLiteOrBuilder	// class@002e16
{

    boolean getHasRecord();
    boolean getIsEnter();
    MagicFaceStat getMagicFace();
    MusicStat getMusic();
    RecordBaseStat getPageBase();
    PrettifyStat getPrettify();
    boolean hasMagicFace();
    boolean hasMusic();
    boolean hasPageBase();
    boolean hasPrettify();
}
