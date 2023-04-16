package com.kwai.feature.post.api.music.data.HistoryMusic;
import java.io.Serializable;
import im8.g;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import c46.c;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;

public class HistoryMusic implements Serializable, g	// class@001415
{
    public String mAccompanimentPath;
    public String mCoverPath;
    public long mLastUseTime;
    public String mLyricsPath;
    public String mMelodyPath;
    public Music mMusic;
    public String mMusicPath;
    public String mSnippetMusicPath;
    public String mTargetPath;
    public static final long serialVersionUID = 0x6603e9d2f56b578f;

    public void HistoryMusic(Music p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,long p8){
       super();
       this.mMusic = p0;
       this.mTargetPath = p1;
       this.mMusicPath = p2;
       this.mLyricsPath = p4;
       this.mSnippetMusicPath = p3;
       this.mCoverPath = p5;
       this.mAccompanimentPath = p6;
       this.mMelodyPath = p7;
       this.mLastUseTime = p8;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HistoryMusic.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof HistoryMusic && (this.mTargetPath).equals(p0.mTargetPath))? true: false;
       return b;
    }
    public void fillMusicPathToMusic(){
       if (PatchProxy.applyVoid(null, this, HistoryMusic.class, "4")) {
          return;
       }
       if (!TextUtils.isEmpty(this.mMusicPath)) {
          this.mMusic.mPath = this.mMusicPath;
       }else if(!TextUtils.isEmpty(this.mSnippetMusicPath)){
          this.mMusic.mPath = this.mSnippetMusicPath;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HistoryMusic.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HistoryMusic.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HistoryMusic.class, new c());
       }else {
          obj.put(HistoryMusic.class, null);
       }
       return obj;
    }
    public boolean isLocalAvailable(){
       Object obj = PatchProxy.apply(null, this, HistoryMusic.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mMusicPath) || !TextUtils.isEmpty(this.mSnippetMusicPath))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HistoryMusic.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HistoryMusic{mMusic="+this.mMusic+", mTargetPath=\'"+this.mTargetPath+'''+", mMusicPath=\'"+this.mMusicPath+'''+", mLyricsPath=\'"+this.mLyricsPath+'''+", mCoverPath=\'"+this.mCoverPath+'''+", mAccompanimentPath=\'"+this.mAccompanimentPath+'''+", mMelodyPath=\'"+this.mMelodyPath+'''+'}';
    }
}
