package gn4.c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.mmu.common.Result$ResultCode;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract c implements MessageLiteOrBuilder	// class@00227c
{

    Result$ResultCode getCode();
    int getCodeValue();
    String getMsg();
    ByteString getMsgBytes();
}
