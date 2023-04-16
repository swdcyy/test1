package com.kwai.video.stannis.QosInfoJniPart2;
import java.lang.Object;
import java.lang.String;

public class QosInfoJniPart2	// class@000bc5
{
    public long audioCommonNS;
    public String audioErrCode;
    public String audioNoiseSnrState;
    public long audioQuality;
    public String audioQualityImp;
    public long speakerInputBytes;
    public long speakerInputChannel;
    public long speakerInputGain;
    public long speakerInputGainMax;
    public String speakerInputLiveChatAecState;
    public long speakerInputLiveChatBytes;
    public String speakerInputLiveStreamAecState;
    public long speakerInputLiveStreamBytes;
    public long speakerInputSampleRate;

    public void QosInfoJniPart2(){
       super();
    }
    public void QosInfoJniPart2(String p0,long p1,String p2,long p3,long p4,long p5,long p6,long p7,long p8,long p9,String p10,String p11,long p12,String p13){
       int i = this;
       super();
       i.audioErrCode = p0;
       i.audioQuality = p1;
       i.audioNoiseSnrState = p2;
       i.speakerInputGain = p3;
       i.speakerInputGainMax = p4;
       i.speakerInputSampleRate = p5;
       i.speakerInputChannel = p6;
       i.speakerInputBytes = p7;
       i.speakerInputLiveChatBytes = p8;
       i.speakerInputLiveStreamBytes = p9;
       i.speakerInputLiveChatAecState = p10;
       i.speakerInputLiveStreamAecState = p11;
       i.audioCommonNS = p12;
       i.audioQualityImp = p13;
    }
}
