package pr4.n;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract n implements MessageLiteOrBuilder	// class@002e13
{

    String getErrorCode();
    ByteString getErrorCodeBytes();
    String getLastSessionId();
    ByteString getLastSessionIdBytes();
    String getLastSuitId();
    ByteString getLastSuitIdBytes();
    String getSuitId();
    ByteString getSuitIdBytes();
}
