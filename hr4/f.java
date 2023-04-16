package hr4.f;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlot;
import java.util.List;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$MusicActionType;

public interface abstract f implements MessageLiteOrBuilder	// class@0023be
{

    String getMusicList();
    ByteString getMusicListBytes();
    String getMusicName();
    ByteString getMusicNameBytes();
    StentorMMU$SkillSlot getSkillslots(int p0);
    int getSkillslotsCount();
    List getSkillslotsList();
    StentorMMU$MusicActionType getType();
    int getTypeValue();
}
