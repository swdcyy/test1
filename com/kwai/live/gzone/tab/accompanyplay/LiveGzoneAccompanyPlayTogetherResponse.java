package com.kwai.live.gzone.tab.accompanyplay.LiveGzoneAccompanyPlayTogetherResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveGzoneAccompanyPlayTogetherResponse implements Serializable, b	// class@000e00
{
    public String mGameId;
    public String mGameName;
    public List mGamePanelBackground;
    public List mItems;

    public void LiveGzoneAccompanyPlayTogetherResponse(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       return false;
    }
}
