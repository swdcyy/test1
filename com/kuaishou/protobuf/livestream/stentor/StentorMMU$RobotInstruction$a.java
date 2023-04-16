package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction$a;
import hr4.e;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotInstruction;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotMusicInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RobotPkInfo;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType;

public final class StentorMMU$RobotInstruction$a extends GeneratedMessageLite$Builder implements e	// class@000d93
{

    public void StentorMMU$RobotInstruction$a(){
       super(StentorMMU$RobotInstruction.DEFAULT_INSTANCE);
    }
    public void StentorMMU$RobotInstruction$a(a p0){
       super(StentorMMU$RobotInstruction.DEFAULT_INSTANCE);
    }
    public StentorMMU$RobotMusicInfo getMusicInfo(){
       return this.instance.getMusicInfo();
    }
    public StentorMMU$RobotPkInfo getPkInfo(){
       return this.instance.getPkInfo();
    }
    public StentorMMU$SkillType getSkillType(){
       return this.instance.getSkillType();
    }
    public int getSkillTypeValue(){
       return this.instance.getSkillTypeValue();
    }
    public boolean hasMusicInfo(){
       return this.instance.hasMusicInfo();
    }
    public boolean hasPkInfo(){
       return this.instance.hasPkInfo();
    }
}
