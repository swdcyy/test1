package com.yxcorp.gifshow.util.audiorecord.FragmentAudioRecorder$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class FragmentAudioRecorder$Status extends Enum	// class@001f3f
{
    public static final FragmentAudioRecorder$Status[] $VALUES;
    public static final FragmentAudioRecorder$Status INIT;
    public static final FragmentAudioRecorder$Status PAUSE;
    public static final FragmentAudioRecorder$Status START;
    public static final FragmentAudioRecorder$Status STOP;

    static {
       FragmentAudioRecorder$Status status = new FragmentAudioRecorder$Status("INIT", 0);
       FragmentAudioRecorder$Status.INIT = status;
       FragmentAudioRecorder$Status status1 = new FragmentAudioRecorder$Status("START", 1);
       FragmentAudioRecorder$Status.START = status1;
       FragmentAudioRecorder$Status status2 = new FragmentAudioRecorder$Status("PAUSE", 2);
       FragmentAudioRecorder$Status.PAUSE = status2;
       FragmentAudioRecorder$Status status3 = new FragmentAudioRecorder$Status("STOP", 3);
       FragmentAudioRecorder$Status.STOP = status3;
       FragmentAudioRecorder$Status[] statusArray = new FragmentAudioRecorder$Status[]{status,status1,status2,status3};
       FragmentAudioRecorder$Status.$VALUES = statusArray;
    }
    public void FragmentAudioRecorder$Status(String p0,int p1){
       super(p0, p1);
    }
    public static FragmentAudioRecorder$Status valueOf(String p0){
       return Enum.valueOf(FragmentAudioRecorder$Status.class, p0);
    }
    public static FragmentAudioRecorder$Status[] values(){
       return FragmentAudioRecorder$Status.$VALUES.clone();
    }
}
