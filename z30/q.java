package z30.q;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Transform;

public interface abstract q implements MessageLiteOrBuilder	// class@003459
{

    boolean getBorderPosLeftBottom();
    boolean getBorderPosLeftTop();
    boolean getBorderPosRightBottom();
    boolean getBorderPosRightTop();
    float getBorderRadius();
    int getHeight();
    Transform getTransform();
    int getWidth();
    boolean hasTransform();
}
