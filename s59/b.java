package s59.b;
import com.yxcorp.download.DownloadTask;
import java.lang.String;

public interface abstract b	// class@003759
{

    void a(DownloadTask p0);
    String getKey();
    void onCancel();
    void onComplete();
    void onError();
    void onPause();
    void onProgress(long p0,long p1);
    void onResume();
    void onStart();
}
