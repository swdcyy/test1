package com.sina.weibo.sdk.api.WeiboMultiMessage;
import java.io.Serializable;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import android.os.Parcelable;
import com.sina.weibo.sdk.api.MediaObject;
import com.sina.weibo.sdk.api.TextObject;
import com.sina.weibo.sdk.api.ImageObject;
import com.sina.weibo.sdk.api.MultiImageObject;
import com.sina.weibo.sdk.api.VideoSourceObject;
import com.sina.weibo.sdk.api.SuperGroupObject;

public class WeiboMultiMessage implements Serializable	// class@000ba9
{
    public ImageObject imageObject;
    public MediaObject mediaObject;
    public MultiImageObject multiImageObject;
    public SuperGroupObject superGroupObject;
    public TextObject textObject;
    public VideoSourceObject videoSourceObject;
    public static final long serialVersionUID = 0xd1b2668674c99f54;

    public void WeiboMultiMessage(){
       super();
    }
    public void readFromBundle(Bundle p0){
       this.mediaObject = p0.getParcelable("_weibo_message_media");
       this.textObject = p0.getParcelable("_weibo_message_text");
       this.imageObject = p0.getParcelable("_weibo_message_image");
       this.multiImageObject = p0.getParcelable("_weibo_message_multi_image");
       this.videoSourceObject = p0.getParcelable("_weibo_message_video_source");
       this.superGroupObject = p0.getParcelable("_weibo_message_supergroup");
    }
    public Bundle writeToBundle(Bundle p0){
       WeiboMultiMessage tmediaObject = this.mediaObject;
       String str = "_weibo_message_media";
       if (tmediaObject != null) {
          p0.putParcelable(str, tmediaObject);
       }else {
          p0.putParcelable(str, null);
       }
       tmediaObject = this.textObject;
       str = "_weibo_message_text";
       if (tmediaObject != null) {
          p0.putParcelable(str, tmediaObject);
       }else {
          p0.putParcelable(str, null);
       }
       tmediaObject = this.imageObject;
       str = "_weibo_message_image";
       if (tmediaObject != null) {
          p0.putParcelable(str, tmediaObject);
       }else {
          p0.putParcelable(str, null);
       }
       tmediaObject = this.multiImageObject;
       str = "_weibo_message_multi_image";
       if (tmediaObject != null) {
          p0.putParcelable(str, tmediaObject);
       }else {
          p0.putParcelable(str, null);
       }
       tmediaObject = this.videoSourceObject;
       str = "_weibo_message_video_source";
       if (tmediaObject != null) {
          p0.putParcelable(str, tmediaObject);
       }else {
          p0.putParcelable(str, null);
       }
       tmediaObject = this.superGroupObject;
       if (tmediaObject != null) {
          p0.putParcelable("_weibo_message_supergroup", tmediaObject);
       }else {
          p0.putParcelable("_weibo_message_supergroup", null);
       }
       return p0;
    }
}
