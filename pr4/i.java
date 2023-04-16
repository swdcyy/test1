package pr4.i;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract i implements MessageLiteOrBuilder	// class@002e0e
{

    String getDiskMemory();
    ByteString getDiskMemoryBytes();
    String getMemory();
    ByteString getMemoryBytes();
    String getThreadCnt();
    ByteString getThreadCntBytes();
    String getTime();
    ByteString getTimeBytes();
}
