package com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType$b;
import com.google.protobuf.Internal$EnumVerifier;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$SkillType;

public final class StentorMMU$SkillType$b implements Internal$EnumVerifier	// class@000db7
{
    public static final Internal$EnumVerifier a;

    static {
       StentorMMU$SkillType$b.a = new StentorMMU$SkillType$b();
    }
    public void StentorMMU$SkillType$b(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (StentorMMU$SkillType.forNumber(p0) != null)? true: false;
       return b;
    }
}
