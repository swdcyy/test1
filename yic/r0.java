package yic.r0;
import exb.b;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Throwable;

public interface abstract r0 implements b	// class@004a8e
{

    void a();
    void b(DownloadPhotoInfoResponse p0);
    void c(b p0);
    void onCancel();
    void onError(Throwable p0);
    void onProgress(float p0);
    void onStart();
    void onSuccess();
}