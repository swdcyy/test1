package gn4.d;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.mmu.common.Result$ResultStatus;

public interface abstract d implements MessageLiteOrBuilder	// class@00227d
{

    String getResullt();
    ByteString getResulltBytes();
    Result$ResultStatus getStatus();
    boolean hasStatus();
}
