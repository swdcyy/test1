package com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.g;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Cover$a;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.ImportCoverParamV2$b;
import com.kuaishou.edit.draft.ImportCoverParamV2;
import java.lang.String;
import com.kuaishou.edit.draft.PictureCoverParam$b;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.ImportCoverParam;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Cover$ParameterCase;
import com.kuaishou.edit.draft.PictureCoverParam;
import com.kuaishou.edit.draft.Sticker;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.VideoCoverParam;
import com.kuaishou.edit.draft.VideoCoverParam$b;

public final class Cover$b extends GeneratedMessageLite$Builder implements g	// class@00175c
{

    public void Cover$b(){
       super(Cover.DEFAULT_INSTANCE);
    }
    public void Cover$b(Cover$a p0){
       super(Cover.DEFAULT_INSTANCE);
    }
    public Cover$b a(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public Cover$b b(ImportCoverParamV2$b p0){
       this.copyOnWrite();
       this.instance.setImportCoverParamV2(p0);
       return this;
    }
    public Cover$b c(ImportCoverParamV2 p0){
       this.copyOnWrite();
       this.instance.setImportCoverParamV2(p0);
       return this;
    }
    public Cover$b d(String p0){
       this.copyOnWrite();
       this.instance.setOriginalFrameFile(p0);
       return this;
    }
    public Cover$b e(String p0){
       this.copyOnWrite();
       this.instance.setOutputFile(p0);
       return this;
    }
    public Cover$b f(PictureCoverParam$b p0){
       this.copyOnWrite();
       this.instance.setPictureCoverParam(p0);
       return this;
    }
    public Cover$b g(int p0,Text$b p1){
       this.copyOnWrite();
       this.instance.setTexts(p0, p1);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public ImportCoverParam getImportCoverParam(){
       return this.instance.getImportCoverParam();
    }
    public ImportCoverParamV2 getImportCoverParamV2(){
       return this.instance.getImportCoverParamV2();
    }
    public String getOriginalFrameFile(){
       return this.instance.getOriginalFrameFile();
    }
    public ByteString getOriginalFrameFileBytes(){
       return this.instance.getOriginalFrameFileBytes();
    }
    public String getOutputFile(){
       return this.instance.getOutputFile();
    }
    public ByteString getOutputFileBytes(){
       return this.instance.getOutputFileBytes();
    }
    public Cover$ParameterCase getParameterCase(){
       return this.instance.getParameterCase();
    }
    public PictureCoverParam getPictureCoverParam(){
       return this.instance.getPictureCoverParam();
    }
    public Sticker getStickers(int p0){
       return this.instance.getStickers(p0);
    }
    public int getStickersCount(){
       return this.instance.getStickersCount();
    }
    public List getStickersList(){
       return Collections.unmodifiableList(this.instance.getStickersList());
    }
    public Text getTexts(int p0){
       return this.instance.getTexts(p0);
    }
    public int getTextsCount(){
       return this.instance.getTextsCount();
    }
    public List getTextsList(){
       return Collections.unmodifiableList(this.instance.getTextsList());
    }
    public Cover$Type getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public VideoCoverParam getVideoCoverParam(){
       return this.instance.getVideoCoverParam();
    }
    public Cover$b h(Cover$Type p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasImportCoverParam(){
       return this.instance.hasImportCoverParam();
    }
    public boolean hasImportCoverParamV2(){
       return this.instance.hasImportCoverParamV2();
    }
    public boolean hasPictureCoverParam(){
       return this.instance.hasPictureCoverParam();
    }
    public boolean hasVideoCoverParam(){
       return this.instance.hasVideoCoverParam();
    }
    public Cover$b i(VideoCoverParam$b p0){
       this.copyOnWrite();
       this.instance.setVideoCoverParam(p0);
       return this;
    }
}
