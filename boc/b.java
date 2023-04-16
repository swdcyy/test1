package boc.b;
import com.yxcorp.gifshow.util.resource.a;
import java.io.File;
import java.lang.String;
import java.nio.charset.Charset;
import doc.a;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;

public interface abstract b	// class@00043b
{
    public static final FilenameFilter c0;

    static {
       b.c0 = a.b;
    }
    void a();
    boolean b(File p0);
    void c(boolean p0);
    boolean checkFileValid();
    String d(String p0);
    void e(boolean p0);
    boolean f();
    Charset getCharset();
    String getDownloadId();
    String getEventUrl();
    YlabModelConfigResponse$ModelConfig$DiffInfo getIncrementalInfo(a p0);
    String getInitDownloadUrl(a p0);
    String getResourceDir();
    String getResourceName();
    String getRetryDownloadUrl(a p0);
    int getRetryTimes();
    String getUnzipDir();
    boolean isNeedUnzip();
    void markHaveDownloaded(String p0);
    boolean needAddNoMediaFile();
    boolean needDownload(a p0);
    boolean needRename();
    boolean supportIncrementalDownload(a p0);
    boolean useYcnnModelConfig();
}
