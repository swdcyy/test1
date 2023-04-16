package com.kuaishou.live.common.core.basic.arya.SoundEffectItem;
import java.io.Serializable;
import java.lang.Object;

public class SoundEffectItem implements Serializable	// class@000e71
{
    public int mIcon;
    public int mName;
    public int mReverbLevel;
    public int mSoundEffectType;
    public static final long serialVersionUID = 0x489a3091a50b6cd8;

    public void SoundEffectItem(int p0,int p1,int p2,int p3){
       super();
       this.mName = p0;
       this.mIcon = p1;
       this.mReverbLevel = p2;
       this.mSoundEffectType = p3;
    }
}
