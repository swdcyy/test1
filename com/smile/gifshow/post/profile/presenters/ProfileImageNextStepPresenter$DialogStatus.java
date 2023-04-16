package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$DialogStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ProfileImageNextStepPresenter$DialogStatus extends Enum	// class@000c70
{
    public final int value;
    public static final ProfileImageNextStepPresenter$DialogStatus[] $VALUES;
    public static final ProfileImageNextStepPresenter$DialogStatus HAS_POP;
    public static final ProfileImageNextStepPresenter$DialogStatus NOT_POP;
    public static final ProfileImageNextStepPresenter$DialogStatus WILL_POP;

    static {
       ProfileImageNextStepPresenter$DialogStatus uDialogStatu1;
       ProfileImageNextStepPresenter$DialogStatus[] uDialogStatu = new ProfileImageNextStepPresenter$DialogStatus[]{uDialogStatu1,uDialogStatu1,uDialogStatu1};
       uDialogStatu1 = new ProfileImageNextStepPresenter$DialogStatus("NOT_POP", 0, 0);
       ProfileImageNextStepPresenter$DialogStatus.NOT_POP = uDialogStatu1;
       uDialogStatu1 = new ProfileImageNextStepPresenter$DialogStatus("WILL_POP", 1, 1);
       ProfileImageNextStepPresenter$DialogStatus.WILL_POP = uDialogStatu1;
       uDialogStatu1 = new ProfileImageNextStepPresenter$DialogStatus("HAS_POP", 2, 2);
       ProfileImageNextStepPresenter$DialogStatus.HAS_POP = uDialogStatu1;
       ProfileImageNextStepPresenter$DialogStatus.$VALUES = uDialogStatu;
    }
    public void ProfileImageNextStepPresenter$DialogStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ProfileImageNextStepPresenter$DialogStatus valueOf(String p0){
       return Enum.valueOf(ProfileImageNextStepPresenter$DialogStatus.class, p0);
    }
    public static ProfileImageNextStepPresenter$DialogStatus[] values(){
       return ProfileImageNextStepPresenter$DialogStatus.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
