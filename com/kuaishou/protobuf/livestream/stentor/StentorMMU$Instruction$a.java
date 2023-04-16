package com.kuaishou.protobuf.livestream.stentor.StentorMMU$Instruction$a;
import hr4.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$Instruction;
import com.google.protobuf.GeneratedMessageLite;
import hr4.a;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotActionType;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SpeechRobotSkillType;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class StentorMMU$Instruction$a extends GeneratedMessageLite$Builder implements c	// class@000d89
{

    public void StentorMMU$Instruction$a(){
       super(StentorMMU$Instruction.DEFAULT_INSTANCE);
    }
    public void StentorMMU$Instruction$a(a p0){
       super(StentorMMU$Instruction.DEFAULT_INSTANCE);
    }
    public StentorMMU$SpeechRobotActionType getAction(){
       return this.instance.getAction();
    }
    public int getActionValue(){
       return this.instance.getActionValue();
    }
    public StentorMMU$SpeechRobotSkillType getSkill(){
       return this.instance.getSkill();
    }
    public int getSkillValue(){
       return this.instance.getSkillValue();
    }
    public String getSlots(){
       return this.instance.getSlots();
    }
    public ByteString getSlotsBytes(){
       return this.instance.getSlotsBytes();
    }
}
