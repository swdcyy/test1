package pr4.e;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;

public interface abstract e implements MessageLiteOrBuilder	// class@002e0a
{

    String getRenderTime();
    ByteString getRenderTimeBytes();
    PrettifyRestore getRestore();
    boolean hasRestore();
}
