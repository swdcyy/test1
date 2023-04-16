package okhttp3.internal.http2.StreamResetException;
import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public final class StreamResetException extends IOException	// class@001fbd
{
    public final ErrorCode errorCode;

    public void StreamResetException(ErrorCode p0){
       super("stream was reset: "+p0);
       this.errorCode = p0;
    }
}
