package com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.Log;
import android.os.Bundle;

public class WXMusicObject implements WXMediaMessage$IMediaObject	// class@000eff
{
    public String musicDataUrl;
    public String musicLowBandDataUrl;
    public String musicLowBandUrl;
    public String musicUrl;
    public String songAlbumUrl;
    public String songLyric;

    public void WXMusicObject(){
       super();
    }
    public boolean checkArgs(){
       String str;
       WXMusicObject tmusicUrl = this.musicUrl;
       if (tmusicUrl == null || !tmusicUrl.length()) {
          tmusicUrl = this.musicLowBandUrl;
          if (tmusicUrl == null || !tmusicUrl.length()) {
             str = "both arguments are null";
          }else {
          label_0018 :
             tmusicUrl = this.musicUrl;
             int i = 0x2800;
             if (tmusicUrl != null && tmusicUrl.length() > i) {
                str = "checkArgs fail, musicUrl is too long";
             }else {
                tmusicUrl = this.musicLowBandUrl;
                if (tmusicUrl != null && tmusicUrl.length() > i) {
                   str = "checkArgs fail, musicLowBandUrl is too long";
                }else {
                   tmusicUrl = this.songAlbumUrl;
                   if (tmusicUrl != null && tmusicUrl.length() > i) {
                      str = "checkArgs fail, songAlbumUrl is too long";
                   }else {
                      tmusicUrl = this.songLyric;
                      if (tmusicUrl != null && tmusicUrl.length() > 0x8000) {
                         str = "checkArgs fail, songLyric is too long";
                      }else {
                         return true;
                      }
                   }
                }
             }
          }
       }else {
          goto label_0018 ;
       }
       Log.e("MicroMsg.SDK.WXMusicObject", str);
       return false;
    }
    public void serialize(Bundle p0){
       p0.putString("_wxmusicobject_musicUrl", this.musicUrl);
       p0.putString("_wxmusicobject_musicLowBandUrl", this.musicLowBandUrl);
       p0.putString("_wxmusicobject_musicDataUrl", this.musicDataUrl);
       p0.putString("_wxmusicobject_musicLowBandDataUrl", this.musicLowBandDataUrl);
       p0.putString("_wxmusicobject_musicAlbumUrl", this.songAlbumUrl);
       p0.putString("_wxmusicobject_musicLyric", this.songLyric);
    }
    public int type(){
       return 3;
    }
    public void unserialize(Bundle p0){
       this.musicUrl = p0.getString("_wxmusicobject_musicUrl");
       this.musicLowBandUrl = p0.getString("_wxmusicobject_musicLowBandUrl");
       this.musicDataUrl = p0.getString("_wxmusicobject_musicDataUrl");
       this.musicLowBandDataUrl = p0.getString("_wxmusicobject_musicLowBandDataUrl");
       this.songAlbumUrl = p0.getString("_wxmusicobject_musicAlbumUrl");
       this.songLyric = p0.getString("_wxmusicobject_musicLyric");
    }
}
