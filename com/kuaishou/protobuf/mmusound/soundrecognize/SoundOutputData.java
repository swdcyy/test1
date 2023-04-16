package com.kuaishou.protobuf.mmusound.soundrecognize.SoundOutputData;
import java.io.Serializable;
import java.lang.Object;

public class SoundOutputData implements Serializable	// class@000df9
{
    public byte[] mAudioData;
    public int mAudioDataSize;
    public int mChannels;
    public String mCodecName;
    public boolean mEnd;
    public int mSampleRate;
    public int mSerialNumber;
    public String sessionid;
    public static final long serialVersionUID = 0xc86a5092a983e45f;

    public void SoundOutputData(){
       super();
       this.mEnd = false;
    }
}
