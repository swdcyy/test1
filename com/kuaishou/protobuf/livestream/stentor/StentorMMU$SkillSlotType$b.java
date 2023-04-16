package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillSlotType;

public final class StentorMMU$SkillSlotType$b implements Internal$EnumVerifier	// class@000db4
{
    public static final Internal$EnumVerifier a;

    static {
       StentorMMU$SkillSlotType$b.a = new StentorMMU$SkillSlotType$b();
    }
    public void StentorMMU$SkillSlotType$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (StentorMMU$SkillSlotType.forNumber(p0) != null)? true: false;
       return b;
    }
}
