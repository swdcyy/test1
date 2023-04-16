package hr4.c;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotActionType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotSkillType;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract c implements MessageLiteOrBuilder	// class@0023bb
{

    StentorMMU$SpeechRobotActionType getAction();
    int getActionValue();
    StentorMMU$SpeechRobotSkillType getSkill();
    int getSkillValue();
    String getSlots();
    ByteString getSlotsBytes();
}
