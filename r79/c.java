package r79.c;
import com.yxcorp.gifshow.album.vm.viewdata.DataType;
import java.lang.String;

public interface abstract c	// class@00366b
{

    boolean contentEquals(c p0);
    long getClipDuration();
    DataType getDataType();
    long getDuration();
    int getHeight();
    String getPath();
    int getPosition();
    float getRatio();
    long getSize();
    String getTypeLoggerStr();
    int getWidth();
    boolean isSelected();
    boolean isVideoType();
    boolean objectEquals(c p0);
    void setClipDuration(long p0);
    void setSelected(boolean p0);
}
