package hr4.n;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType;

public interface abstract n implements MessageLiteOrBuilder	// class@0023c6
{

    String getText();
    ByteString getTextBytes();
    StentorMMU$SkillSlotType getType();
    int getTypeValue();
}
