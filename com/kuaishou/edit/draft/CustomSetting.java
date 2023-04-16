package com.kuaishou.edit.draft.CustomSetting;
import z30.r;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.Class;
import com.kuaishou.edit.draft.CustomSetting$b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.Parser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import java.lang.Object;
import com.kuaishou.edit.draft.CustomSetting$a;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import java.lang.Byte;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.MessageLite;
import java.lang.String;

public final class CustomSetting extends GeneratedMessageLite implements r	// class@001763
{
    public boolean allowKaraoke_;
    public boolean allowMagicFace_;
    public boolean allowMusicTag_;
    public boolean allowSameFrame_;
    public boolean allowSolitaire_;
    public boolean allowSoundTrack_;
    public boolean allowVisibilityExpiration_;
    public boolean allowVoiceDanmaku_;
    public boolean denyDownload_;
    public boolean disableNearby_;
    public boolean disallowRecreation_;
    public boolean showVisibilityExpirationSwitch_;
    public static final CustomSetting DEFAULT_INSTANCE;
    public static Parser PARSER;

    static {
       CustomSetting uCustomSetti = new CustomSetting();
       CustomSetting.DEFAULT_INSTANCE = uCustomSetti;
       GeneratedMessageLite.registerDefaultInstance(CustomSetting.class, uCustomSetti);
    }
    public void CustomSetting(){
       super();
    }
    public static CustomSetting getDefaultInstance(){
       return CustomSetting.DEFAULT_INSTANCE;
    }
    public static CustomSetting$b newBuilder(){
       return CustomSetting.DEFAULT_INSTANCE.createBuilder();
    }
    public static CustomSetting$b newBuilder(CustomSetting p0){
       return CustomSetting.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static CustomSetting parseDelimitedFrom(InputStream p0){
       return GeneratedMessageLite.parseDelimitedFrom(CustomSetting.DEFAULT_INSTANCE, p0);
    }
    public static CustomSetting parseDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseDelimitedFrom(CustomSetting.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomSetting parseFrom(ByteString p0){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0);
    }
    public static CustomSetting parseFrom(ByteString p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomSetting parseFrom(CodedInputStream p0){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0);
    }
    public static CustomSetting parseFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomSetting parseFrom(InputStream p0){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0);
    }
    public static CustomSetting parseFrom(InputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomSetting parseFrom(ByteBuffer p0){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0);
    }
    public static CustomSetting parseFrom(ByteBuffer p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0, p1);
    }
    public static CustomSetting parseFrom(byte[] p0){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0);
    }
    public static CustomSetting parseFrom(byte[] p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parseFrom(CustomSetting.DEFAULT_INSTANCE, p0, p1);
    }
    public static Parser parser(){
       return CustomSetting.DEFAULT_INSTANCE.getParserForType();
    }
    public void clearAllowKaraoke(){
       this.allowKaraoke_ = false;
    }
    public void clearAllowMagicFace(){
       this.allowMagicFace_ = false;
    }
    public void clearAllowMusicTag(){
       this.allowMusicTag_ = false;
    }
    public void clearAllowSameFrame(){
       this.allowSameFrame_ = false;
    }
    public void clearAllowSolitaire(){
       this.allowSolitaire_ = false;
    }
    public void clearAllowSoundTrack(){
       this.allowSoundTrack_ = false;
    }
    public void clearAllowVisibilityExpiration(){
       this.allowVisibilityExpiration_ = false;
    }
    public void clearAllowVoiceDanmaku(){
       this.allowVoiceDanmaku_ = false;
    }
    public void clearDenyDownload(){
       this.denyDownload_ = false;
    }
    public void clearDisableNearby(){
       this.disableNearby_ = false;
    }
    public void clearDisallowRecreation(){
       this.disallowRecreation_ = false;
    }
    public void clearShowVisibilityExpirationSwitch(){
       this.showVisibilityExpirationSwitch_ = false;
    }
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke p0,Object p1,Object p2){
       int i = 1;
       p2 = null;
       switch (CustomSetting$a.a[p0.ordinal()]){
           case 1:
             return new CustomSetting();
           case 2:
             return new CustomSetting$b(p2);
           case 3:
             Object[] objArray = new Object[12];
             objArray[0] = "disableNearby_";
             objArray[i] = "denyDownload_";
             objArray[2] = "allowSameFrame_";
             objArray[3] = "allowSoundTrack_";
             objArray[4] = "allowMagicFace_";
             objArray[5] = "allowKaraoke_";
             objArray[6] = "allowMusicTag_";
             objArray[7] = "allowSolitaire_";
             objArray[8] = "allowVoiceDanmaku_";
             objArray[9] = "disallowRecreation_";
             objArray[10] = "showVisibilityExpirationSwitch_";
             objArray[11] = "allowVisibilityExpiration_";
             return GeneratedMessageLite.newMessageInfo(CustomSetting.DEFAULT_INSTANCE, "\xff\x02\xff\x02\f\xff\x02\xff\x02\xff\x02\xff\x02\x01\f\f\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x07\x05\x07\x06\x07\x07\x07\b\x07\t\x07\n\x07\x0b\x07\f\x07\x00", objArray);
           case 4:
             return CustomSetting.DEFAULT_INSTANCE;
           case 5:
             Parser pARSER = CustomSetting.PARSER;
             if (pARSER == null) {
                _monitor_enter(CustomSetting.class);
                pARSER = CustomSetting.PARSER;
                if (pARSER == null) {
                   pARSER = new GeneratedMessageLite$DefaultInstanceBasedParser(CustomSetting.DEFAULT_INSTANCE);
                   CustomSetting.PARSER = pARSER;
                }
                _monitor_exit(CustomSetting.class);
             }
             return pARSER;
             break;
           case 6:
             return Byte.valueOf(i);
           case 7:
             return p2;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public boolean getAllowKaraoke(){
       return this.allowKaraoke_;
    }
    public boolean getAllowMagicFace(){
       return this.allowMagicFace_;
    }
    public boolean getAllowMusicTag(){
       return this.allowMusicTag_;
    }
    public boolean getAllowSameFrame(){
       return this.allowSameFrame_;
    }
    public boolean getAllowSolitaire(){
       return this.allowSolitaire_;
    }
    public boolean getAllowSoundTrack(){
       return this.allowSoundTrack_;
    }
    public boolean getAllowVisibilityExpiration(){
       return this.allowVisibilityExpiration_;
    }
    public boolean getAllowVoiceDanmaku(){
       return this.allowVoiceDanmaku_;
    }
    public boolean getDenyDownload(){
       return this.denyDownload_;
    }
    public boolean getDisableNearby(){
       return this.disableNearby_;
    }
    public boolean getDisallowRecreation(){
       return this.disallowRecreation_;
    }
    public boolean getShowVisibilityExpirationSwitch(){
       return this.showVisibilityExpirationSwitch_;
    }
    public void setAllowKaraoke(boolean p0){
       this.allowKaraoke_ = p0;
    }
    public void setAllowMagicFace(boolean p0){
       this.allowMagicFace_ = p0;
    }
    public void setAllowMusicTag(boolean p0){
       this.allowMusicTag_ = p0;
    }
    public void setAllowSameFrame(boolean p0){
       this.allowSameFrame_ = p0;
    }
    public void setAllowSolitaire(boolean p0){
       this.allowSolitaire_ = p0;
    }
    public void setAllowSoundTrack(boolean p0){
       this.allowSoundTrack_ = p0;
    }
    public void setAllowVisibilityExpiration(boolean p0){
       this.allowVisibilityExpiration_ = p0;
    }
    public void setAllowVoiceDanmaku(boolean p0){
       this.allowVoiceDanmaku_ = p0;
    }
    public void setDenyDownload(boolean p0){
       this.denyDownload_ = p0;
    }
    public void setDisableNearby(boolean p0){
       this.disableNearby_ = p0;
    }
    public void setDisallowRecreation(boolean p0){
       this.disallowRecreation_ = p0;
    }
    public void setShowVisibilityExpirationSwitch(boolean p0){
       this.showVisibilityExpirationSwitch_ = p0;
    }
}
