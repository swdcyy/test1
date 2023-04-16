package pr4.f;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract f implements MessageLiteOrBuilder	// class@002e0b
{

    String getApplyFailReason();
    ByteString getApplyFailReasonBytes();
    boolean getApplySuccess();
    String getApplyTimeCost();
    ByteString getApplyTimeCostBytes();
    String getDataFailReason();
    ByteString getDataFailReasonBytes();
    boolean getDataSuccess();
    String getDataTimeCost();
    ByteString getDataTimeCostBytes();
    boolean getResouceDownload();
}
