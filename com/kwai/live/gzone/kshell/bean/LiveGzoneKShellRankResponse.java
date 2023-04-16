package com.kwai.live.gzone.kshell.bean.LiveGzoneKShellRankResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;

public class LiveGzoneKShellRankResponse implements Serializable, b	// class@000d8f
{
    public LiveGzoneKShellRankResponse$AuthorInfo mAuthorInfo;
    public LiveGzoneKShellRankResponse$BottomInfo mBottomInfo;
    public List mKShellRankUserInfoList;
    public static final long serialVersionUID = 0x8a6ab5f2d486a707;

    public void LiveGzoneKShellRankResponse(){
       super();
    }
    public List getItems(){
       return this.mKShellRankUserInfoList;
    }
    public boolean hasMore(){
       return false;
    }
}
