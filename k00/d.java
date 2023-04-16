package k00.d;
import java.lang.String;

public interface abstract d	// class@00272d
{

    boolean a();
    long getCurrentPosition();
    long getDuration();
    boolean isPlaying();
    void pause();
    void release();
    void restart(long p0);
    void seekTo(long p0);
    void setAutoPlay(boolean p0);
    void setDataSource(String p0);
    void setMuted(boolean p0);
    void start();
}
