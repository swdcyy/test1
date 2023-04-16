package com.kwai.feature.post.api.feature.localalbum.LocalAlbumEntranceParams;
import java.io.Serializable;
import java.lang.Object;

public class LocalAlbumEntranceParams implements Serializable	// class@0013a9
{
    public int mPageFrom;
    public static final long serialVersionUID = 0x6753c7504caa34f9;

    public void LocalAlbumEntranceParams(){
       super();
    }
    public int getPageFrom(){
       return this.mPageFrom;
    }
    public LocalAlbumEntranceParams setPageFrom(int p0){
       this.mPageFrom = p0;
       return this;
    }
}
