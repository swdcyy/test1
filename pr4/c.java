package pr4.c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.photo.funnel.PrettifyItem;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.photo.funnel.PrettifyRestore;

public interface abstract c implements MessageLiteOrBuilder	// class@002e08
{

    PrettifyItem getItem(int p0);
    int getItemCount();
    List getItemList();
    String getRenderTime();
    ByteString getRenderTimeBytes();
    PrettifyRestore getRestore();
    boolean hasRestore();
}
