package com.yxcorp.gifshow.music.data.HistoryMusicPageResponse;
import la6.b;
import java.io.Serializable;
import java.util.List;
import com.yxcorp.gifshow.music.data.HistoryMusicPageResponse$a;
import java.lang.Object;

public class HistoryMusicPageResponse implements b, Serializable	// class@002053
{
    public final HistoryMusicPageResponse$a mCurrentPageInfo;
    public final List mMusics;
    public static final long serialVersionUID = 0x848f4781c38c94c4;

    public void HistoryMusicPageResponse(List p0,HistoryMusicPageResponse$a p1){
       super();
       this.mMusics = p0;
       this.mCurrentPageInfo = p1;
    }
    public int getCurrentPageEndIndex(){
       return this.mCurrentPageInfo.b;
    }
    public List getItems(){
       return this.mMusics;
    }
    public boolean hasMore(){
       HistoryMusicPageResponse tmCurrentPag = this.mCurrentPageInfo;
       boolean b = (tmCurrentPag.b < tmCurrentPag.c)? true: false;
       return b;
    }
}
