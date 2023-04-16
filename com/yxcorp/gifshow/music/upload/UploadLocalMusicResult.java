package com.yxcorp.gifshow.music.upload.UploadLocalMusicResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.model.music.Music;

public final class UploadLocalMusicResult implements Serializable	// class@00207d
{
    public String mErrorMessage;
    public int mResult;
    public Music mUploadedMusic;
    public String originResponse;

    public void UploadLocalMusicResult(){
       super();
    }
    public String getErrorMessage(){
       return this.mErrorMessage;
    }
    public String getOriginResponse(){
       return this.originResponse;
    }
    public int getResult(){
       return this.mResult;
    }
    public Music getUploadedMusic(){
       return this.mUploadedMusic;
    }
    public void setOriginResponse(String p0){
       this.originResponse = p0;
    }
    public void setUploadedMusic(Music p0){
       this.mUploadedMusic = p0;
    }
}
