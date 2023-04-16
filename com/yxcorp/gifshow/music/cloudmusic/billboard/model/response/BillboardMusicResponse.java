package com.yxcorp.gifshow.music.cloudmusic.billboard.model.response.BillboardMusicResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class BillboardMusicResponse implements CursorResponse, Serializable	// class@001ff3
{
    public List mRankLists;
    public static final long serialVersionUID = 0xd531c9a323f917e3;

    public void BillboardMusicResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       return this.mRankLists;
    }
    public boolean hasMore(){
       return false;
    }
}
