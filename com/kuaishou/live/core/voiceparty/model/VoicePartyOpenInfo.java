package com.kuaishou.live.core.voiceparty.model.VoicePartyOpenInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.live.model.VoicePartyChannel;

public class VoicePartyOpenInfo implements Serializable	// class@0017b9
{
    public boolean mEnableOpenCamera;
    public String mGroupChatId;
    public boolean mOpenCameraOnAudioChat;
    public boolean mOpenCameraOnGridChat;
    public VoicePartyChannel mSelectedChannel;
    public int mSourceType;
    public String mTopic;
    public static final long serialVersionUID = 0x976c3ff9fd25c85c;

    public void VoicePartyOpenInfo(){
       super();
       this.mOpenCameraOnAudioChat = false;
       this.mSourceType = 1;
       this.mGroupChatId = "";
       this.mEnableOpenCamera = true;
       this.mOpenCameraOnGridChat = false;
    }
    public boolean isVerticalChannel(){
       boolean b = true;
       if (this.mSourceType == 4) {
          return b;
       }
       VoicePartyOpenInfo tmSelectedCh = this.mSelectedChannel;
       if (tmSelectedCh == null) {
          return false;
       }
       if (tmSelectedCh.mType == b) {
          b = false;
       }
       return b;
    }
    public void resetSourceType(){
       this.mSourceType = 1;
    }
}
