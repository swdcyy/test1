package fn4.b;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.String;
import com.google.protobuf.ByteString;

public interface abstract b implements MessageLiteOrBuilder	// class@00216d
{

    int getAot();
    int getAudioBitRate();
    int getAudioFormat();
    int getBitRateMode();
    String getContent();
    ByteString getContentBytes();
    int getIchs();
    int getInputType();
    int getLangType();
    int getPitch();
    String getReqId();
    ByteString getReqIdBytes();
    int getSampleRate();
    float getSemitone();
    long getSerialNo();
    int getSpeakerId();
    int getSpeed();
    int getStreamPacketDur();
    float getTimbre();
    String getUserid();
    ByteString getUseridBytes();
    String getVoiceName();
    ByteString getVoiceNameBytes();
    int getVolume();
}
