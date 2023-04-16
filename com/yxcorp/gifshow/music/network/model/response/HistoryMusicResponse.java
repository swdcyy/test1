package com.yxcorp.gifshow.music.network.model.response.HistoryMusicResponse;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;

public class HistoryMusicResponse implements Serializable	// class@002060
{
    public List mMusicList;
    public int mResult;
    public static final long serialVersionUID = 0x9a9668fa56a3652c;

    public void HistoryMusicResponse(){
       super();
       this.mMusicList = new ArrayList();
    }
}
