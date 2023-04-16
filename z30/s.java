package z30.s;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract s implements MessageLiteOrBuilder	// class@003461
{

    String getBackgroundColorKey();
    ByteString getBackgroundColorKeyBytes();
    String getFillColorKey();
    ByteString getFillColorKeyBytes();
    String getShadowColorKey();
    ByteString getShadowColorKeyBytes();
    String getStrokeColorKey();
    ByteString getStrokeColorKeyBytes();
    int getTextAlign();
    int getTextMode();
}
