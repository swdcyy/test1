package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo$a;
import hr4.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlot;
import java.util.List;
import java.util.Collections;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$MusicActionType;

public final class StentorMMU$RobotMusicInfo$a extends GeneratedMessageLite$Builder implements f	// class@000d95
{

    public void StentorMMU$RobotMusicInfo$a(){
       super(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RobotMusicInfo$a(a p0){
       super(StentorMMU$RobotMusicInfo.DEFAULT_INSTANCE);
    }
    public String getMusicList(){
       return this.instance.getMusicList();
    }
    public ByteString getMusicListBytes(){
       return this.instance.getMusicListBytes();
    }
    public String getMusicName(){
       return this.instance.getMusicName();
    }
    public ByteString getMusicNameBytes(){
       return this.instance.getMusicNameBytes();
    }
    public StentorMMU$SkillSlot getSkillslots(int p0){
       return this.instance.getSkillslots(p0);
    }
    public int getSkillslotsCount(){
       return this.instance.getSkillslotsCount();
    }
    public List getSkillslotsList(){
       return Collections.unmodifiableList(this.instance.getSkillslotsList());
    }
    public StentorMMU$MusicActionType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
}
