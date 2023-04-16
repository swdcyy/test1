package com.kuaishou.edit.draft.CustomSetting$b;
import z30.r;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.CustomSetting;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.CustomSetting$a;

public final class CustomSetting$b extends GeneratedMessageLite$Builder implements r	// class@001762
{

    public void CustomSetting$b(){
       super(CustomSetting.DEFAULT_INSTANCE);
    }
    public void CustomSetting$b(CustomSetting$a p0){
       super(CustomSetting.DEFAULT_INSTANCE);
    }
    public CustomSetting$b a(boolean p0){
       this.copyOnWrite();
       this.instance.setAllowMagicFace(p0);
       return this;
    }
    public CustomSetting$b b(boolean p0){
       this.copyOnWrite();
       this.instance.setAllowSameFrame(p0);
       return this;
    }
    public CustomSetting$b c(boolean p0){
       this.copyOnWrite();
       this.instance.setDenyDownload(p0);
       return this;
    }
    public CustomSetting$b d(boolean p0){
       this.copyOnWrite();
       this.instance.setDisableNearby(p0);
       return this;
    }
    public CustomSetting$b e(boolean p0){
       this.copyOnWrite();
       this.instance.setDisallowRecreation(p0);
       return this;
    }
    public boolean getAllowKaraoke(){
       return this.instance.getAllowKaraoke();
    }
    public boolean getAllowMagicFace(){
       return this.instance.getAllowMagicFace();
    }
    public boolean getAllowMusicTag(){
       return this.instance.getAllowMusicTag();
    }
    public boolean getAllowSameFrame(){
       return this.instance.getAllowSameFrame();
    }
    public boolean getAllowSolitaire(){
       return this.instance.getAllowSolitaire();
    }
    public boolean getAllowSoundTrack(){
       return this.instance.getAllowSoundTrack();
    }
    public boolean getAllowVisibilityExpiration(){
       return this.instance.getAllowVisibilityExpiration();
    }
    public boolean getAllowVoiceDanmaku(){
       return this.instance.getAllowVoiceDanmaku();
    }
    public boolean getDenyDownload(){
       return this.instance.getDenyDownload();
    }
    public boolean getDisableNearby(){
       return this.instance.getDisableNearby();
    }
    public boolean getDisallowRecreation(){
       return this.instance.getDisallowRecreation();
    }
    public boolean getShowVisibilityExpirationSwitch(){
       return this.instance.getShowVisibilityExpirationSwitch();
    }
}
