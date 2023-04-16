package com.kuaishou.live.core.voiceparty.channel.model.VoicePartyTopic;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.Number;
import java.lang.StringBuilder;

public class VoicePartyTopic implements Serializable	// class@001379
{
    public int mId;
    public List mLabelUrl;
    public String mName;
    public boolean mSelected;
    public static final long serialVersionUID = 0xf52a54f33a30071c;

    public void VoicePartyTopic(){
       super();
       this.mSelected = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTopic.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       boolean b = false;
       if (p0 == null || this.getClass() != p0.getClass()) {
          return b;
       }
       if (this.mId != p0.mId) {
          return b;
       }
       return k.a(this.mName, p0.mName);
    }
    public int hashCode(){
       VoicePartyTopic obj = PatchProxy.apply(null, this, VoicePartyTopic.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       int i = (obj ^ (obj >> 32)) * 31;
       VoicePartyTopic tmName = this.mName;
       int i1 = (tmName != null)? tmName.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTopic.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VoicePartyTopic{mId="+this.mId+", mName=\'"+this.mName+'''+", mSelected="+this.mSelected+'}';
    }
}
