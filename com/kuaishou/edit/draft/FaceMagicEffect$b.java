package com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.h;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FaceMagicEffect$a;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.TimeRange;

public final class FaceMagicEffect$b extends GeneratedMessageLite$Builder implements h	// class@00179d
{

    public void FaceMagicEffect$b(){
       super(FaceMagicEffect.DEFAULT_INSTANCE);
    }
    public void FaceMagicEffect$b(FaceMagicEffect$a p0){
       super(FaceMagicEffect.DEFAULT_INSTANCE);
    }
    public FaceMagicEffect$b a(String p0){
       this.copyOnWrite();
       this.instance.setAssetDir(p0);
       return this;
    }
    public FaceMagicEffect$b b(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public FaceMagicEffect$b c(FeatureId$b p0){
       this.copyOnWrite();
       this.instance.setFeatureId(p0);
       return this;
    }
    public FaceMagicEffect$b d(TimeRange$b p0){
       this.copyOnWrite();
       this.instance.setRange(p0);
       return this;
    }
    public FaceMagicEffect$b e(FaceMagicEffect$Type p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public String getAssetDir(){
       return this.instance.getAssetDir();
    }
    public ByteString getAssetDirBytes(){
       return this.instance.getAssetDirBytes();
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public FaceMagicEffect$Extra getExtra(){
       return this.instance.getExtra();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public TimeRange getRange(){
       return this.instance.getRange();
    }
    public FaceMagicEffect$Type getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasExtra(){
       return this.instance.hasExtra();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
    public boolean hasRange(){
       return this.instance.hasRange();
    }
}
