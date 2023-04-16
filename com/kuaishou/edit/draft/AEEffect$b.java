package com.kuaishou.edit.draft.AEEffect$b;
import com.kuaishou.edit.draft.a;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AEEffect;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AEEffect$a;
import java.lang.String;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.AEEffect$AttachType;
import com.kuaishou.edit.draft.FeatureId;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.TimeRange;

public final class AEEffect$b extends GeneratedMessageLite$Builder implements a	// class@0016f5
{

    public void AEEffect$b(){
       super(AEEffect.DEFAULT_INSTANCE);
    }
    public void AEEffect$b(AEEffect$a p0){
       super(AEEffect.DEFAULT_INSTANCE);
    }
    public AEEffect$b a(String p0){
       this.copyOnWrite();
       this.instance.setAeAssetDir(p0);
       return this;
    }
    public AEEffect$b b(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public AEEffect$b c(FeatureId$b p0){
       this.copyOnWrite();
       this.instance.setFeatureId(p0);
       return this;
    }
    public AEEffect$b d(int p0){
       this.copyOnWrite();
       this.instance.setFillingMode(p0);
       return this;
    }
    public AEEffect$b e(TimeRange$b p0){
       this.copyOnWrite();
       this.instance.setTimeRange(p0);
       return this;
    }
    public String getAeAssetDir(){
       return this.instance.getAeAssetDir();
    }
    public ByteString getAeAssetDirBytes(){
       return this.instance.getAeAssetDirBytes();
    }
    public AEEffect$AttachType getAttachType(){
       return this.instance.getAttachType();
    }
    public int getAttachTypeValue(){
       return this.instance.getAttachTypeValue();
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public int getFillingMode(){
       return this.instance.getFillingMode();
    }
    public String getTemplateId(){
       return this.instance.getTemplateId();
    }
    public ByteString getTemplateIdBytes(){
       return this.instance.getTemplateIdBytes();
    }
    public String getTextPicturePath(int p0){
       return this.instance.getTextPicturePath(p0);
    }
    public ByteString getTextPicturePathBytes(int p0){
       return this.instance.getTextPicturePathBytes(p0);
    }
    public int getTextPicturePathCount(){
       return this.instance.getTextPicturePathCount();
    }
    public List getTextPicturePathList(){
       return Collections.unmodifiableList(this.instance.getTextPicturePathList());
    }
    public String getTexts(int p0){
       return this.instance.getTexts(p0);
    }
    public ByteString getTextsBytes(int p0){
       return this.instance.getTextsBytes(p0);
    }
    public int getTextsCount(){
       return this.instance.getTextsCount();
    }
    public List getTextsList(){
       return Collections.unmodifiableList(this.instance.getTextsList());
    }
    public TimeRange getTimeRange(){
       return this.instance.getTimeRange();
    }
    public int getZIndex(){
       return this.instance.getZIndex();
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
    public boolean hasTimeRange(){
       return this.instance.hasTimeRange();
    }
}
