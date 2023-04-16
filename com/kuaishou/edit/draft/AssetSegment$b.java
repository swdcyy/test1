package com.kuaishou.edit.draft.AssetSegment$b;
import z30.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AssetSegment;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetSegment$a;
import java.lang.String;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.FineTuningParam;
import com.kuaishou.edit.draft.Template;
import com.kuaishou.edit.draft.Beauty;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.ColorFilter;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Makeup;

public final class AssetSegment$b extends GeneratedMessageLite$Builder implements d	// class@001719
{

    public void AssetSegment$b(){
       super(AssetSegment.DEFAULT_INSTANCE);
    }
    public void AssetSegment$b(AssetSegment$a p0){
       super(AssetSegment.DEFAULT_INSTANCE);
    }
    public AssetSegment$b a(String p0){
       this.copyOnWrite();
       this.instance.setCropFile(p0);
       return this;
    }
    public AssetSegment$b b(CropOptions p0){
       this.copyOnWrite();
       this.instance.setCropOptions(p0);
       return this;
    }
    public AssetSegment$b c(String p0){
       this.copyOnWrite();
       this.instance.setFile(p0);
       return this;
    }
    public AssetSegment$b d(FineTuningParam p0){
       this.copyOnWrite();
       this.instance.setFineTuningParam(p0);
       return this;
    }
    public AssetSegment$b e(String p0){
       this.copyOnWrite();
       this.instance.setIdentifier(p0);
       return this;
    }
    public AssetSegment$b f(double p0){
       this.copyOnWrite();
       this.instance.setOriginPicHeight(p0);
       return this;
    }
    public AssetSegment$b g(double p0){
       this.copyOnWrite();
       this.instance.setOriginPicWidth(p0);
       return this;
    }
    public Template getAtlasTemplate(){
       return this.instance.getAtlasTemplate();
    }
    public Beauty getBeauty(int p0){
       return this.instance.getBeauty(p0);
    }
    public int getBeautyCount(){
       return this.instance.getBeautyCount();
    }
    public List getBeautyList(){
       return Collections.unmodifiableList(this.instance.getBeautyList());
    }
    public ColorFilter getColorFilter(int p0){
       return this.instance.getColorFilter(p0);
    }
    public int getColorFilterCount(){
       return this.instance.getColorFilterCount();
    }
    public List getColorFilterList(){
       return Collections.unmodifiableList(this.instance.getColorFilterList());
    }
    public String getCropFile(){
       return this.instance.getCropFile();
    }
    public ByteString getCropFileBytes(){
       return this.instance.getCropFileBytes();
    }
    public CropOptions getCropOptions(){
       return this.instance.getCropOptions();
    }
    public String getFile(){
       return this.instance.getFile();
    }
    public ByteString getFileBytes(){
       return this.instance.getFileBytes();
    }
    public FineTuningParam getFineTuningParam(){
       return this.instance.getFineTuningParam();
    }
    public String getIdentifier(){
       return this.instance.getIdentifier();
    }
    public ByteString getIdentifierBytes(){
       return this.instance.getIdentifierBytes();
    }
    public Makeup getMakeup(int p0){
       return this.instance.getMakeup(p0);
    }
    public int getMakeupCount(){
       return this.instance.getMakeupCount();
    }
    public List getMakeupList(){
       return Collections.unmodifiableList(this.instance.getMakeupList());
    }
    public double getOriginPicHeight(){
       return this.instance.getOriginPicHeight();
    }
    public double getOriginPicWidth(){
       return this.instance.getOriginPicWidth();
    }
    public boolean hasAtlasTemplate(){
       return this.instance.hasAtlasTemplate();
    }
    public boolean hasCropOptions(){
       return this.instance.hasCropOptions();
    }
    public boolean hasFineTuningParam(){
       return this.instance.hasFineTuningParam();
    }
}
