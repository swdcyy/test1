package com.yxcorp.gifshow.upload.LocalMusicUploadInfo;
import java.lang.Cloneable;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo$Status;
import java.io.File;
import s16.j;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.music.MusicType;
import android.text.TextUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.music.upload.UploadLocalMusicResult;

public class LocalMusicUploadInfo implements Cloneable, Serializable	// class@001e43
{
    public String mAlbum;
    public String mArtistName;
    public String mCoverKey;
    public final String mCoverPath;
    public long mDuration;
    public final String mFileId;
    public final String mFilePath;
    public final int mGenreId;
    public final String mLyricsPath;
    public String mMusicName;
    public MusicType mMusicType;
    public String mOriginalArtist;
    public float mProgress;
    public long mSize;
    public IUploadInfo$Status mStatus;
    public Throwable mThrowable;
    public String mToken;
    public UploadLocalMusicResult mUploadResult;
    public final String mUserId;
    public static final long serialVersionUID = 0xb79dbcb61f29f863;

    public void LocalMusicUploadInfo(LocalMusicUploadInfo p0){
       super();
       this.mFileId = p0.mFileId;
       this.mFilePath = p0.mFilePath;
       this.mToken = p0.mToken;
       this.mUserId = p0.mUserId;
       this.mProgress = p0.mProgress;
       this.mStatus = p0.mStatus;
       this.mThrowable = p0.mThrowable;
       this.mUploadResult = p0.mUploadResult;
       this.mArtistName = p0.mArtistName;
       this.mMusicName = p0.mMusicName;
       this.mOriginalArtist = p0.mOriginalArtist;
       this.mCoverPath = p0.mCoverPath;
       this.mLyricsPath = p0.mLyricsPath;
       this.mGenreId = p0.mGenreId;
    }
    public void LocalMusicUploadInfo(String p0,String p1,String p2,String p3,int p4){
       super();
       this.mFilePath = p0;
       this.mCoverPath = p1;
       this.mLyricsPath = p2;
       this.mStatus = IUploadInfo$Status.PENDING;
       this.mUserId = p3;
       this.mGenreId = p4;
       p1 = j.b(new File(p0));
       if (p1 == null) {
          p1 = p0+System.currentTimeMillis();
       }
       Matcher matcher = Pattern.compile("^\(.*?\)\(\\d+\)\(.*\)$").matcher(p1);
       if (matcher.matches()) {
          long l = (System.currentTimeMillis() / 1000) - Long.parseLong(matcher.group(2));
          if (l > 0) {
             p1 = matcher.group(1)+l+matcher.group(3)+"-"+p3;
          }
       }
       this.mFileId = p1;
       return;
    }
    public LocalMusicUploadInfo clone(){
       Object obj = PatchProxy.apply(null, this, LocalMusicUploadInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LocalMusicUploadInfo(this);
    }
    public Object clone(){
       return this.clone();
    }
    public String getAlbum(){
       return this.mAlbum;
    }
    public String getArtistName(){
       return this.mArtistName;
    }
    public String getCoverPath(){
       return this.mCoverPath;
    }
    public long getDuration(){
       return this.mDuration;
    }
    public String getFileId(){
       return this.mFileId;
    }
    public String getFilePath(){
       return this.mFilePath;
    }
    public int getGenreId(){
       return this.mGenreId;
    }
    public String getLyricsPath(){
       return this.mLyricsPath;
    }
    public String getMusicName(){
       return this.mMusicName;
    }
    public MusicType getMusicType(){
       return this.mMusicType;
    }
    public String getOriginalArtist(){
       return this.mOriginalArtist;
    }
    public float getProgress(){
       return this.mProgress;
    }
    public String getSessionId(){
       Object obj = PatchProxy.apply(null, this, LocalMusicUploadInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mFileId)) {
          return System.currentTimeMillis()+"";
       }
       return this.mFileId;
    }
    public long getSize(){
       return this.mSize;
    }
    public IUploadInfo$Status getStatus(){
       return this.mStatus;
    }
    public Throwable getThrowable(){
       return this.mThrowable;
    }
    public String getToken(){
       return this.mToken;
    }
    public UploadLocalMusicResult getUploadResult(){
       return this.mUploadResult;
    }
    public String getUserId(){
       return this.mUserId;
    }
    public void setAlbum(String p0){
       this.mAlbum = p0;
    }
    public void setArtistName(String p0){
       this.mArtistName = p0;
    }
    public void setDuration(long p0){
       this.mDuration = p0;
    }
    public void setMusicName(String p0){
       this.mMusicName = p0;
    }
    public void setMusicType(MusicType p0){
       this.mMusicType = p0;
    }
    public void setSize(long p0){
       this.mSize = p0;
    }
}
