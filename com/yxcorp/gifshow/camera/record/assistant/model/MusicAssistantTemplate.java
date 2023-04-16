package com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import java.io.Serializable;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate$a;
import nsd.u;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicAssistantTemplate extends g implements Serializable	// class@001d15
{
    public boolean isCollection;
    public Music music;
    public static final MusicAssistantTemplate$a Companion;
    public static final long serialVersionUID;

    static {
       MusicAssistantTemplate.Companion = new MusicAssistantTemplate$a(null);
    }
    public void MusicAssistantTemplate(){
       super();
    }
    public final Music getMusic(){
       return this.music;
    }
    public String getTemplateId(){
       String id;
       MusicAssistantTemplate obj = PatchProxy.apply(null, this, MusicAssistantTemplate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.music;
       if (obj != null) {
          id = obj.getId();
          if (id != null) {
          label_001d :
             return id;
          }
       }
       id = "";
       goto label_001d ;
    }
    public String getTemplateName(){
       Music mName;
       MusicAssistantTemplate tmusic = this.music;
       if (tmusic != null) {
          mName = tmusic.mName;
          if (mName != null) {
          label_000b :
             return mName;
          }
       }
       mName = "";
       goto label_000b ;
    }
    public int getType(){
       return 4;
    }
    public final boolean isCollection(){
       return this.isCollection;
    }
    public final void setCollection(boolean p0){
       this.isCollection = p0;
    }
    public final void setMusic(Music p0){
       this.music = p0;
    }
}
