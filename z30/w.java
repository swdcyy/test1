package z30.w;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Frame;
import java.util.List;

public interface abstract w implements MessageLiteOrBuilder	// class@003470
{

    int getAnimatedSubAssetFileType();
    boolean getDisableRecyclePlay();
    double getFrameRate();
    Frame getFrames(int p0);
    int getFramesCount();
    List getFramesList();
}
