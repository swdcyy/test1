package z30.v;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.TimeRange;

public interface abstract v implements MessageLiteOrBuilder	// class@00346d
{

    Attributes getAttributes();
    TimeRange getRange();
    boolean hasAttributes();
    boolean hasRange();
}
