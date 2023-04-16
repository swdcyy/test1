package com.kwai.social.startup.reminder.model.IMMagicFaceModel;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class IMMagicFaceModel implements Serializable	// class@0018cc
{
    public List emotionIDs;
    public String magicId;
    public int type;

    public void IMMagicFaceModel(){
       super();
       this.emotionIDs = CollectionsKt__CollectionsKt.E();
    }
    public final List getEmotionIDs(){
       return this.emotionIDs;
    }
    public final String getMagicId(){
       return this.magicId;
    }
    public final int getType(){
       return this.type;
    }
    public final void setEmotionIDs(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMMagicFaceModel.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.emotionIDs = p0;
       return;
    }
    public final void setMagicId(String p0){
       this.magicId = p0;
    }
    public final void setType(int p0){
       this.type = p0;
    }
}
