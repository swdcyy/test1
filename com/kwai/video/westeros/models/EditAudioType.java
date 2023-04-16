package com.kwai.video.westeros.models.EditAudioType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.EditAudioType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.EditAudioType$EditAudioTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class EditAudioType extends Enum implements Internal$EnumLite	// class@000ef9
{
    public final int value;
    public static final EditAudioType[] $VALUES;
    public static final EditAudioType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final EditAudioType kEditAudioTypeDefault;
    public static final EditAudioType kEditAudioTypeSilent;

    static {
       EditAudioType uEditAudioTy = new EditAudioType("kEditAudioTypeDefault", 0, 0);
       EditAudioType.kEditAudioTypeDefault = uEditAudioTy;
       EditAudioType uEditAudioTy1 = new EditAudioType("kEditAudioTypeSilent", 1, 1);
       EditAudioType.kEditAudioTypeSilent = uEditAudioTy1;
       EditAudioType uEditAudioTy2 = new EditAudioType("UNRECOGNIZED", 2, -1);
       EditAudioType.UNRECOGNIZED = uEditAudioTy2;
       EditAudioType[] uEditAudioTy3 = new EditAudioType[]{uEditAudioTy,uEditAudioTy1,uEditAudioTy2};
       EditAudioType.$VALUES = uEditAudioTy3;
       EditAudioType.internalValueMap = new EditAudioType$1();
    }
    public void EditAudioType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EditAudioType forNumber(int p0){
       if (!p0) {
          return EditAudioType.kEditAudioTypeDefault;
       }
       if (p0 != 1) {
          return null;
       }
       return EditAudioType.kEditAudioTypeSilent;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EditAudioType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EditAudioType$EditAudioTypeVerifier.INSTANCE;
    }
    public static EditAudioType valueOf(int p0){
       return EditAudioType.forNumber(p0);
    }
    public static EditAudioType valueOf(String p0){
       return Enum.valueOf(EditAudioType.class, p0);
    }
    public static EditAudioType[] values(){
       return EditAudioType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != EditAudioType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
