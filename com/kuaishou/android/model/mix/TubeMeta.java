package com.kuaishou.android.model.mix.TubeMeta;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;

public class TubeMeta implements Serializable, a	// class@000e20
{
    public boolean mHasTubeTag;
    public TubeEntryInfo mTubeEntryInfo;
    public TubeEpisodeInfo mTubeEpisodeInfo;
    public TubeInfo mTubeInfo;
    public static final long serialVersionUID = 0xce1e8aad93587f88;

    public void TubeMeta(){
       super();
    }
    public void afterDeserialize(){
    }
}
