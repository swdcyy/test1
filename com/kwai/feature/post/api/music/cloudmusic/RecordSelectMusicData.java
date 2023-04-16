package com.kwai.feature.post.api.music.cloudmusic.RecordSelectMusicData;
import java.io.Serializable;
import java.lang.Object;

public class RecordSelectMusicData implements Serializable	// class@001413
{
    public int mActivityHashCode;
    public boolean mEnableClip;
    public Music mMusic;
    public String mMusicPath;
    public boolean mMusicPathIsWholeFile;
    public MusicSource mMusicSource;
    public long mMusicStartMills;
    public int mRecordMode;
    public int mSpecialRecordDuration;
    public static final long serialVersionUID = 0x39be3e4c78e12f54;

    public void RecordSelectMusicData(){
       super();
    }
}
