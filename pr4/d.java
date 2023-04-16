package pr4.d;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract d implements MessageLiteOrBuilder	// class@002e09
{

    float getCustomTimestamp();
    boolean getIsChange();
    String getStickerName();
    ByteString getStickerNameBytes();
}
