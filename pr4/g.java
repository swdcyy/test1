package pr4.g;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;

public interface abstract g implements MessageLiteOrBuilder	// class@002e0c
{

    PrettifyItem getItem(int p0);
    int getItemCount();
    List getItemList();
    String getRenderTime();
    ByteString getRenderTimeBytes();
    PrettifyRestore getRestore();
    boolean hasRestore();
}
