package com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.playway.shared.micseat.viewmodel.Gender$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Gender extends Enum	// class@001873
{
    public static final Gender[] $VALUES;
    public static final Gender$a Companion;
    public static final Gender FEMALE;
    public static final Gender MALE;

    static {
       Gender gender;
       Gender[] genderArray = new Gender[]{gender,gender};
       gender = new Gender("MALE", 0);
       Gender.MALE = gender;
       gender = new Gender("FEMALE", 1);
       Gender.FEMALE = gender;
       Gender.$VALUES = genderArray;
       Gender.Companion = new Gender$a(null);
    }
    public void Gender(String p0,int p1){
       super(p0, p1);
    }
    public static final Gender fromGenderString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Gender.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Gender$a.b(Gender.Companion, p0, null, 2, null);
    }
    public static final Gender fromGenderString(String p0,Gender p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Gender.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Gender.Companion.a(p0, p1);
    }
    public static Gender valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Gender.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(Gender.class, p0);
    }
    public static Gender[] values(){
       Object obj = PatchProxy.apply(null, null, Gender.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Gender.$VALUES.clone();
    }
}
