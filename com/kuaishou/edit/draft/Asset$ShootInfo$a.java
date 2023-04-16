package com.kuaishou.edit.draft.Asset$ShootInfo$a;
import com.kuaishou.edit.draft.Asset$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset$a;
import java.lang.Iterable;
import com.kuaishou.edit.draft.MagicFaceEffectRange;
import com.kuaishou.edit.draft.Asset$ShootInfo$CameraType;
import com.kuaishou.edit.draft.RecordMagicFace$b;
import com.kuaishou.edit.draft.AuditFrame;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.Beauty;
import com.kuaishou.edit.draft.PrettifyStyle;
import com.kuaishou.edit.draft.RecordBeauty;
import com.kuaishou.edit.draft.RecordFilter;
import com.kuaishou.edit.draft.RecordMagicFace;
import com.kuaishou.edit.draft.RecordMakeup;
import com.kuaishou.edit.draft.RecordMusic;
import com.kuaishou.edit.draft.RecordSlimming;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;

public final class Asset$ShootInfo$a extends GeneratedMessageLite$Builder implements Asset$c	// class@001706
{

    public void Asset$ShootInfo$a(){
       super(Asset$ShootInfo.DEFAULT_INSTANCE);
    }
    public void Asset$ShootInfo$a(Asset$a p0){
       super(Asset$ShootInfo.DEFAULT_INSTANCE);
    }
    public Asset$ShootInfo$a a(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllAuditFrame(p0);
       return this;
    }
    public Asset$ShootInfo$a b(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMagicFaceAttributeFrame(p0);
       return this;
    }
    public Asset$ShootInfo$a c(MagicFaceEffectRange p0){
       this.copyOnWrite();
       this.instance.addMagicFaceEffectRange(p0);
       return this;
    }
    public Asset$ShootInfo$a d(Asset$ShootInfo$CameraType p0){
       this.copyOnWrite();
       this.instance.setCameraType(p0);
       return this;
    }
    public Asset$ShootInfo$a e(int p0){
       this.copyOnWrite();
       this.instance.setFrameEncryptLength(p0);
       return this;
    }
    public Asset$ShootInfo$a f(int p0){
       this.copyOnWrite();
       this.instance.setFrameEncryptStartIndex(p0);
       return this;
    }
    public Asset$ShootInfo$a g(RecordMagicFace$b p0){
       this.copyOnWrite();
       this.instance.setRecordMagicface(p0);
       return this;
    }
    public AuditFrame getAuditFrame(int p0){
       return this.instance.getAuditFrame(p0);
    }
    public int getAuditFrameCount(){
       return this.instance.getAuditFrameCount();
    }
    public List getAuditFrameList(){
       return Collections.unmodifiableList(this.instance.getAuditFrameList());
    }
    public double getAverageFrameRate(){
       return this.instance.getAverageFrameRate();
    }
    public String getBeautifyExtend(){
       return this.instance.getBeautifyExtend();
    }
    public ByteString getBeautifyExtendBytes(){
       return this.instance.getBeautifyExtendBytes();
    }
    public Beauty getBeauty(){
       return this.instance.getBeauty();
    }
    public Asset$ShootInfo$CameraType getCameraType(){
       return this.instance.getCameraType();
    }
    public int getCameraTypeValue(){
       return this.instance.getCameraTypeValue();
    }
    public int getCountDownCount(){
       return this.instance.getCountDownCount();
    }
    public boolean getCountDownEnabled(){
       return this.instance.getCountDownEnabled();
    }
    public int getFrameEncryptLength(){
       return this.instance.getFrameEncryptLength();
    }
    public int getFrameEncryptStartIndex(){
       return this.instance.getFrameEncryptStartIndex();
    }
    public AuditFrame getMagicFaceAttributeFrame(int p0){
       return this.instance.getMagicFaceAttributeFrame(p0);
    }
    public int getMagicFaceAttributeFrameCount(){
       return this.instance.getMagicFaceAttributeFrameCount();
    }
    public List getMagicFaceAttributeFrameList(){
       return Collections.unmodifiableList(this.instance.getMagicFaceAttributeFrameList());
    }
    public MagicFaceEffectRange getMagicFaceEffectRange(int p0){
       return this.instance.getMagicFaceEffectRange(p0);
    }
    public int getMagicFaceEffectRangeCount(){
       return this.instance.getMagicFaceEffectRangeCount();
    }
    public List getMagicFaceEffectRangeList(){
       return Collections.unmodifiableList(this.instance.getMagicFaceEffectRangeList());
    }
    public PrettifyStyle getPrettifyStyle(){
       return this.instance.getPrettifyStyle();
    }
    public double getRate(){
       return this.instance.getRate();
    }
    public RecordBeauty getRecordBeauty(){
       return this.instance.getRecordBeauty();
    }
    public RecordFilter getRecordFilter(){
       return this.instance.getRecordFilter();
    }
    public RecordMagicFace getRecordMagicface(){
       return this.instance.getRecordMagicface();
    }
    public RecordMakeup getRecordMakeup(){
       return this.instance.getRecordMakeup();
    }
    public RecordMusic getRecordMusic(){
       return this.instance.getRecordMusic();
    }
    public RecordSlimming getRecordSlimming(){
       return this.instance.getRecordSlimming();
    }
    public Asset$ShootInfo$Resolution getResolution(){
       return this.instance.getResolution();
    }
    public int getResolutionValue(){
       return this.instance.getResolutionValue();
    }
    public Asset$ShootInfo$a h(RecordMagicFace p0){
       this.copyOnWrite();
       this.instance.setRecordMagicface(p0);
       return this;
    }
    public boolean hasBeauty(){
       return this.instance.hasBeauty();
    }
    public boolean hasPrettifyStyle(){
       return this.instance.hasPrettifyStyle();
    }
    public boolean hasRecordBeauty(){
       return this.instance.hasRecordBeauty();
    }
    public boolean hasRecordFilter(){
       return this.instance.hasRecordFilter();
    }
    public boolean hasRecordMagicface(){
       return this.instance.hasRecordMagicface();
    }
    public boolean hasRecordMakeup(){
       return this.instance.hasRecordMakeup();
    }
    public boolean hasRecordMusic(){
       return this.instance.hasRecordMusic();
    }
    public boolean hasRecordSlimming(){
       return this.instance.hasRecordSlimming();
    }
}
