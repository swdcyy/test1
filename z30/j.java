package z30.j;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;

public interface abstract j implements MessageLiteOrBuilder	// class@00343c
{

    String getAppVersion();
    ByteString getAppVersionBytes();
    Timestamp getCreatedAt();
    String getDraftVersion();
    ByteString getDraftVersionBytes();
    Timestamp getModifiedAt();
    boolean hasCreatedAt();
    boolean hasModifiedAt();
}
