package com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostDialogPlugin$DialogScenario extends Enum	// class@001a98
{
    public static final PostDialogPlugin$DialogScenario[] $VALUES;
    public static final PostDialogPlugin$DialogScenario CAMERA_BACK_FINALLY;
    public static final PostDialogPlugin$DialogScenario CAMERA_BACK_WITH_RECORD_INFO;
    public static final PostDialogPlugin$DialogScenario CAMERA_KTV_BACK;
    public static final PostDialogPlugin$DialogScenario CAMERA_MOOD_BACK;
    public static final PostDialogPlugin$DialogScenario EDIT_ALBUM;
    public static final PostDialogPlugin$DialogScenario EDIT_QUIT_CONFIRM_PHOTO;
    public static final PostDialogPlugin$DialogScenario EDIT_QUIT_CONFIRM_VIDEO;
    public static final PostDialogPlugin$DialogScenario EDIT_SAVE_KTV;
    public static final PostDialogPlugin$DialogScenario EDIT_SAVE_PHOTO;
    public static final PostDialogPlugin$DialogScenario EDIT_SAVE_VIDEO;
    public static final PostDialogPlugin$DialogScenario SHARE_BACK_WITHOUT_DRAFT;
    public static final PostDialogPlugin$DialogScenario UNKNOWN;

    static {
       PostDialogPlugin$DialogScenario uDialogScena = new PostDialogPlugin$DialogScenario("UNKNOWN", 0);
       PostDialogPlugin$DialogScenario.UNKNOWN = uDialogScena;
       PostDialogPlugin$DialogScenario uDialogScena1 = new PostDialogPlugin$DialogScenario("CAMERA_BACK_WITH_RECORD_INFO", 1);
       PostDialogPlugin$DialogScenario.CAMERA_BACK_WITH_RECORD_INFO = uDialogScena1;
       PostDialogPlugin$DialogScenario uDialogScena2 = new PostDialogPlugin$DialogScenario("CAMERA_BACK_FINALLY", 2);
       PostDialogPlugin$DialogScenario.CAMERA_BACK_FINALLY = uDialogScena2;
       PostDialogPlugin$DialogScenario uDialogScena3 = new PostDialogPlugin$DialogScenario("CAMERA_KTV_BACK", 3);
       PostDialogPlugin$DialogScenario.CAMERA_KTV_BACK = uDialogScena3;
       PostDialogPlugin$DialogScenario uDialogScena4 = new PostDialogPlugin$DialogScenario("CAMERA_MOOD_BACK", 4);
       PostDialogPlugin$DialogScenario.CAMERA_MOOD_BACK = uDialogScena4;
       PostDialogPlugin$DialogScenario uDialogScena5 = new PostDialogPlugin$DialogScenario("SHARE_BACK_WITHOUT_DRAFT", 5);
       PostDialogPlugin$DialogScenario.SHARE_BACK_WITHOUT_DRAFT = uDialogScena5;
       PostDialogPlugin$DialogScenario uDialogScena6 = new PostDialogPlugin$DialogScenario("EDIT_SAVE_VIDEO", 6);
       PostDialogPlugin$DialogScenario.EDIT_SAVE_VIDEO = uDialogScena6;
       PostDialogPlugin$DialogScenario uDialogScena7 = new PostDialogPlugin$DialogScenario("EDIT_SAVE_PHOTO", 7);
       PostDialogPlugin$DialogScenario.EDIT_SAVE_PHOTO = uDialogScena7;
       PostDialogPlugin$DialogScenario uDialogScena8 = new PostDialogPlugin$DialogScenario("EDIT_QUIT_CONFIRM_PHOTO", 8);
       PostDialogPlugin$DialogScenario.EDIT_QUIT_CONFIRM_PHOTO = uDialogScena8;
       PostDialogPlugin$DialogScenario uDialogScena9 = new PostDialogPlugin$DialogScenario("EDIT_QUIT_CONFIRM_VIDEO", 9);
       PostDialogPlugin$DialogScenario.EDIT_QUIT_CONFIRM_VIDEO = uDialogScena9;
       PostDialogPlugin$DialogScenario uDialogScena10 = new PostDialogPlugin$DialogScenario("EDIT_SAVE_KTV", 10);
       PostDialogPlugin$DialogScenario.EDIT_SAVE_KTV = uDialogScena10;
       PostDialogPlugin$DialogScenario uDialogScena11 = new PostDialogPlugin$DialogScenario("EDIT_ALBUM", 11);
       PostDialogPlugin$DialogScenario.EDIT_ALBUM = uDialogScena11;
       PostDialogPlugin$DialogScenario[] uDialogScena12 = new PostDialogPlugin$DialogScenario[12];
       uDialogScena12[0] = uDialogScena;
       uDialogScena12[1] = uDialogScena1;
       uDialogScena12[2] = uDialogScena2;
       uDialogScena12[3] = uDialogScena3;
       uDialogScena12[4] = uDialogScena4;
       uDialogScena12[5] = uDialogScena5;
       uDialogScena12[6] = uDialogScena6;
       uDialogScena12[7] = uDialogScena7;
       uDialogScena12[8] = uDialogScena8;
       uDialogScena12[9] = uDialogScena9;
       uDialogScena12[10] = uDialogScena10;
       uDialogScena12[11] = uDialogScena11;
       PostDialogPlugin$DialogScenario.$VALUES = uDialogScena12;
    }
    public void PostDialogPlugin$DialogScenario(String p0,int p1){
       super(p0, p1);
    }
    public static PostDialogPlugin$DialogScenario valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostDialogPlugin$DialogScenario.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostDialogPlugin$DialogScenario.class, p0);
    }
    public static PostDialogPlugin$DialogScenario[] values(){
       Object obj = PatchProxy.apply(null, null, PostDialogPlugin$DialogScenario.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostDialogPlugin$DialogScenario.$VALUES.clone();
    }
}
