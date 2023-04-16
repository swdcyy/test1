package z30.k;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.FaceInfo;
import java.util.List;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract k implements MessageLiteOrBuilder	// class@003440
{

    FaceInfo getFaceInfo(int p0);
    int getFaceInfoCount();
    List getFaceInfoList();
    String getFile();
    ByteString getFileBytes();
    String getJsonFile();
    ByteString getJsonFileBytes();
}
