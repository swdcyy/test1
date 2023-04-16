package com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.livestream.stentor.StentorMMU$RtSpeechRecognitionType$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class StentorMMU$RtSpeechRecognitionType extends Enum implements Internal$EnumLite	// class@000dac
{
    public final int value;
    public static final StentorMMU$RtSpeechRecognitionType[] $VALUES;
    public static final StentorMMU$RtSpeechRecognitionType APPEND;
    public static final StentorMMU$RtSpeechRecognitionType CLOSE;
    public static final StentorMMU$RtSpeechRecognitionType NEW;
    public static final StentorMMU$RtSpeechRecognitionType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       StentorMMU$RtSpeechRecognitionType rtSpeechReco = new StentorMMU$RtSpeechRecognitionType("NEW", 0, 0);
       StentorMMU$RtSpeechRecognitionType.NEW = rtSpeechReco;
       StentorMMU$RtSpeechRecognitionType rtSpeechReco1 = new StentorMMU$RtSpeechRecognitionType("APPEND", 1, 1);
       StentorMMU$RtSpeechRecognitionType.APPEND = rtSpeechReco1;
       StentorMMU$RtSpeechRecognitionType rtSpeechReco2 = new StentorMMU$RtSpeechRecognitionType("CLOSE", 2, 2);
       StentorMMU$RtSpeechRecognitionType.CLOSE = rtSpeechReco2;
       StentorMMU$RtSpeechRecognitionType rtSpeechReco3 = new StentorMMU$RtSpeechRecognitionType("UNRECOGNIZED", 3, -1);
       StentorMMU$RtSpeechRecognitionType.UNRECOGNIZED = rtSpeechReco3;
       StentorMMU$RtSpeechRecognitionType[] rtSpeechReco4 = new StentorMMU$RtSpeechRecognitionType[]{rtSpeechReco,rtSpeechReco1,rtSpeechReco2,rtSpeechReco3};
       StentorMMU$RtSpeechRecognitionType.$VALUES = rtSpeechReco4;
       StentorMMU$RtSpeechRecognitionType.internalValueMap = new StentorMMU$RtSpeechRecognitionType$a();
    }
    public void StentorMMU$RtSpeechRecognitionType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static StentorMMU$RtSpeechRecognitionType forNumber(int p0){
       if (!p0) {
          return StentorMMU$RtSpeechRecognitionType.NEW;
       }
       if (p0 == 1) {
          return StentorMMU$RtSpeechRecognitionType.APPEND;
       }
       if (p0 != 2) {
          return null;
       }
       return StentorMMU$RtSpeechRecognitionType.CLOSE;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return StentorMMU$RtSpeechRecognitionType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return StentorMMU$RtSpeechRecognitionType$b.a;
    }
    public static StentorMMU$RtSpeechRecognitionType valueOf(int p0){
       return StentorMMU$RtSpeechRecognitionType.forNumber(p0);
    }
    public static StentorMMU$RtSpeechRecognitionType valueOf(String p0){
       return Enum.valueOf(StentorMMU$RtSpeechRecognitionType.class, p0);
    }
    public static StentorMMU$RtSpeechRecognitionType[] values(){
       return StentorMMU$RtSpeechRecognitionType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != StentorMMU$RtSpeechRecognitionType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
