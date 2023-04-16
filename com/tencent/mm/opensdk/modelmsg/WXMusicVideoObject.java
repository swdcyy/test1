package com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXMusicVideoObject implements WXMediaMessage$IMediaObject	// class@000f00
{
    public String albumName;
    public int duration;
    public String hdAlbumThumbFilePath;
    public String identification;
    public long issueDate;
    public String musicDataUrl;
    public String musicGenre;
    public String musicOperationUrl;
    public String musicUrl;
    public String singerName;
    public String songLyric;

    public void WXMusicVideoObject(){
       super();
    }
    public boolean checkArgs(){
       String str;
       if (b.b(this.musicUrl) || (this.musicUrl).length() > 0x2800) {
          str = "musicUrl.length exceeds the limit";
       }else if(b.b(this.musicDataUrl) || (this.musicDataUrl).length() > 0x2800){
          str = "musicDataUrl.length exceeds the limit";
       }else if(b.b(this.singerName) || (this.singerName).length() > 1024){
          str = "singerName.length exceeds the limit";
       }else if(!b.b(this.songLyric) && (this.songLyric).length() > 0x8000){
          str = "songLyric.length exceeds the limit";
       }else if(!b.b(this.hdAlbumThumbFilePath) && (this.hdAlbumThumbFilePath).length() > 1024){
          str = "hdAlbumThumbFilePath.length exceeds the limit";
       }else if(!b.b(this.hdAlbumThumbFilePath) && this.getFileSize(this.hdAlbumThumbFilePath) > 0xa00000){
          str = "hdAlbumThumbFilePath file length exceeds the limit";
       }else if(!b.b(this.musicGenre) && (this.musicGenre).length() > 1024){
          str = "musicGenre.length exceeds the limit";
       }else if(!b.b(this.identification) && (this.identification).length() > 1024){
          str = "identification.length exceeds the limit";
       }else if(!b.b(this.musicOperationUrl) && (this.musicOperationUrl).length() > 0x2800){
          str = "musicOperationUrl.length exceeds the limit";
       }else {
          return true;
       }
       Log.e("MicroMsg.SDK.WXMusicVideoObject", str);
       return false;
    }
    public final int getFileSize(String p0){
       return b.a(p0);
    }
    public void serialize(Bundle p0){
       p0.putString("_wxmusicvideoobject_musicUrl", this.musicUrl);
       p0.putString("_wxmusicvideoobject_musicDataUrl", this.musicDataUrl);
       p0.putString("_wxmusicvideoobject_singerName", this.singerName);
       p0.putString("_wxmusicvideoobject_songLyric", this.songLyric);
       p0.putString("_wxmusicvideoobject_hdAlbumThumbFilePath", this.hdAlbumThumbFilePath);
       p0.putString("_wxmusicvideoobject_albumName", this.albumName);
       p0.putString("_wxmusicvideoobject_musicGenre", this.musicGenre);
       p0.putLong("_wxmusicvideoobject_issueDate", this.issueDate);
       p0.putString("_wxmusicvideoobject_identification", this.identification);
       p0.putInt("_wxmusicvideoobject_duration", this.duration);
       p0.putString("_wxmusicvideoobject_musicOperationUrl", this.musicOperationUrl);
    }
    public int type(){
       return 76;
    }
    public void unserialize(Bundle p0){
       this.musicUrl = p0.getString("_wxmusicvideoobject_musicUrl");
       this.musicDataUrl = p0.getString("_wxmusicvideoobject_musicDataUrl");
       this.singerName = p0.getString("_wxmusicvideoobject_singerName");
       this.songLyric = p0.getString("_wxmusicvideoobject_songLyric");
       this.hdAlbumThumbFilePath = p0.getString("_wxmusicvideoobject_hdAlbumThumbFilePath");
       this.albumName = p0.getString("_wxmusicvideoobject_albumName");
       this.musicGenre = p0.getString("_wxmusicvideoobject_musicGenre");
       this.issueDate = p0.getLong("_wxmusicvideoobject_issueDate", 0);
       this.identification = p0.getString("_wxmusicvideoobject_identification");
       this.duration = p0.getInt("_wxmusicvideoobject_duration", 0);
       this.musicOperationUrl = p0.getString("_wxmusicvideoobject_musicOperationUrl");
    }
}
