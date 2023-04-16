package pr4.p;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract p implements MessageLiteOrBuilder	// class@002e15
{

    boolean getHasPublished();
    String getHashTags();
    ByteString getHashTagsBytes();
    boolean getIsEnter();
    String getPrivacy();
    ByteString getPrivacyBytes();
    boolean getSaveToDraft();
}
