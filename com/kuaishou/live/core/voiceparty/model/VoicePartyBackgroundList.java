package com.kuaishou.live.core.voiceparty.model.VoicePartyBackgroundList;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class VoicePartyBackgroundList implements Serializable, b	// class@0017af
{
    public List mBackgroundList;
    public int mChoosenId;
    public static final long serialVersionUID = 0x75db74cd0a6a6f81;

    public void VoicePartyBackgroundList(){
       super();
    }
    public List getItems(){
       return this.mBackgroundList;
    }
    public boolean hasMore(){
       return false;
    }
}
