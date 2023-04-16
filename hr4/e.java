package hr4.e;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotPkInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType;

public interface abstract e implements MessageLiteOrBuilder	// class@0023bd
{

    StentorMMU$RobotMusicInfo getMusicInfo();
    StentorMMU$RobotPkInfo getPkInfo();
    StentorMMU$SkillType getSkillType();
    int getSkillTypeValue();
    boolean hasMusicInfo();
    boolean hasPkInfo();
}
