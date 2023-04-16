package gb7.c;
import java.lang.String;
import java.lang.Throwable;

public interface abstract c	// class@002570
{

    void onCancel(String p0,String p1);
    void onCompleted(String p0,String p1,String p2);
    void onFailed(String p0,Throwable p1,String p2,String p3);
    void onProgress(String p0,long p1,long p2);
}
