package pr4.o;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.BeautyStat;
import com.kuaishou.protobuf.photo.funnel.PrettifyBlockStat;
import java.util.List;
import com.kuaishou.protobuf.photo.funnel.BodyStat;
import com.kuaishou.protobuf.photo.funnel.FilterStat;
import com.kuaishou.protobuf.photo.funnel.MakeUpStat;

public interface abstract o implements MessageLiteOrBuilder	// class@002e14
{

    BeautyStat getBeauty();
    PrettifyBlockStat getBlockStat(int p0);
    int getBlockStatCount();
    List getBlockStatList();
    BodyStat getBody();
    FilterStat getFilter();
    MakeUpStat getMakeup();
    boolean hasBeauty();
    boolean hasBody();
    boolean hasFilter();
    boolean hasMakeup();
}
