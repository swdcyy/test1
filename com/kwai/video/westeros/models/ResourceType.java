package com.kwai.video.westeros.models.ResourceType;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.video.westeros.models.ResourceType$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.video.westeros.models.ResourceType$ResourceTypeVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ResourceType extends Enum implements Internal$EnumLite	// class@00102c
{
    public final int value;
    public static final ResourceType[] $VALUES;
    public static final ResourceType UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final ResourceType kAIEditBegin;
    public static final ResourceType kAIEditEnd;
    public static final ResourceType kAR;
    public static final ResourceType kAnimojiData;
    public static final ResourceType kAudioDecibelCaculate;
    public static final ResourceType kAudioDetect;
    public static final ResourceType kAudioEffect;
    public static final ResourceType kColorTransform;
    public static final ResourceType kDynamicResControllable;
    public static final ResourceType kEarData;
    public static final ResourceType kFace;
    public static final ResourceType kFaceprop;
    public static final ResourceType kFacepropForCallback;
    public static final ResourceType kLandmarks3D;
    public static final ResourceType kMemojiData;
    public static final ResourceType kMmuArith;
    public static final ResourceType kMmuAsr;
    public static final ResourceType kMmuCatPnp;
    public static final ResourceType kMmuFaceBlend;
    public static final ResourceType kMmuFaceLivePhoto;
    public static final ResourceType kMmuHdrEst;
    public static final ResourceType kMmuRelightingCpu;
    public static final ResourceType kMmuRelightingGpu;
    public static final ResourceType kSensorData;
    public static final ResourceType kSystemAR;
    public static final ResourceType kTestResourceType1;
    public static final ResourceType kUIInteraction;
    public static final ResourceType kVideoSource;
    public static final ResourceType kYKitBegin;
    public static final ResourceType kYKitEnd;
    public static final ResourceType kYKitFaceAction;
    public static final ResourceType kYcnnBegin;
    public static final ResourceType kYcnnEnd;

    static {
       ResourceType resourceType = new ResourceType("kFace", 0, 0);
       ResourceType.kFace = resourceType;
       ResourceType resourceType1 = new ResourceType("kSensorData", 1, 1);
       ResourceType.kSensorData = resourceType1;
       ResourceType resourceType2 = new ResourceType("kUIInteraction", 2, 2);
       ResourceType.kUIInteraction = resourceType2;
       ResourceType resourceType3 = new ResourceType("kAR", 3, 3);
       ResourceType.kAR = resourceType3;
       ResourceType resourceType4 = new ResourceType("kSystemAR", 4, 4);
       ResourceType.kSystemAR = resourceType4;
       ResourceType resourceType5 = new ResourceType("kDynamicResControllable", 5, 5);
       ResourceType.kDynamicResControllable = resourceType5;
       ResourceType resourceType6 = new ResourceType("kAudioDetect", 6, 6);
       ResourceType.kAudioDetect = resourceType6;
       ResourceType resourceType7 = new ResourceType("kAudioEffect", 7, 7);
       ResourceType.kAudioEffect = resourceType7;
       ResourceType resourceType8 = new ResourceType("kAudioDecibelCaculate", 8, 8);
       ResourceType.kAudioDecibelCaculate = resourceType8;
       ResourceType resourceType9 = new ResourceType("kAnimojiData", 9, 9);
       ResourceType.kAnimojiData = resourceType9;
       ResourceType resourceType10 = new ResourceType("kEarData", 10, 10);
       ResourceType.kEarData = resourceType10;
       ResourceType resourceType11 = new ResourceType("kFaceprop", 11, 11);
       ResourceType.kFaceprop = resourceType11;
       ResourceType resourceType12 = new ResourceType("kFacepropForCallback", 12, 12);
       ResourceType.kFacepropForCallback = resourceType12;
       ResourceType resourceType13 = new ResourceType("kMmuRelightingCpu", 13, 13);
       ResourceType.kMmuRelightingCpu = resourceType13;
       ResourceType resourceType14 = resourceType13;
       ResourceType resourceType15 = new ResourceType("kMmuRelightingGpu", 14, 14);
       ResourceType.kMmuRelightingGpu = resourceType15;
       ResourceType resourceType16 = resourceType15;
       ResourceType resourceType17 = new ResourceType("kMemojiData", 15, 15);
       ResourceType.kMemojiData = resourceType17;
       ResourceType resourceType18 = resourceType17;
       resourceType13 = new ResourceType("kLandmarks3D", 16, 16);
       ResourceType.kLandmarks3D = resourceType13;
       ResourceType resourceType19 = resourceType13;
       resourceType15 = new ResourceType("kVideoSource", 17, 17);
       ResourceType.kVideoSource = resourceType15;
       ResourceType resourceType20 = resourceType15;
       resourceType17 = new ResourceType("kMmuArith", 18, 18);
       ResourceType.kMmuArith = resourceType17;
       ResourceType resourceType21 = resourceType17;
       resourceType13 = new ResourceType("kMmuCatPnp", 19, 19);
       ResourceType.kMmuCatPnp = resourceType13;
       ResourceType resourceType22 = resourceType13;
       resourceType15 = new ResourceType("kMmuFaceLivePhoto", 20, 20);
       ResourceType.kMmuFaceLivePhoto = resourceType15;
       ResourceType resourceType23 = resourceType15;
       resourceType17 = new ResourceType("kMmuFaceBlend", 21, 21);
       ResourceType.kMmuFaceBlend = resourceType17;
       ResourceType resourceType24 = resourceType17;
       ResourceType resourceType25 = resourceType12;
       resourceType13 = new ResourceType("kColorTransform", 22, 22);
       ResourceType.kColorTransform = resourceType13;
       ResourceType resourceType26 = resourceType13;
       resourceType17 = new ResourceType("kMmuHdrEst", 23, 23);
       ResourceType.kMmuHdrEst = resourceType17;
       ResourceType resourceType27 = resourceType17;
       resourceType15 = new ResourceType("kYcnnBegin", 24, 1000);
       ResourceType.kYcnnBegin = resourceType15;
       ResourceType resourceType28 = resourceType15;
       resourceType17 = new ResourceType("kYcnnEnd", 25, 2000);
       ResourceType.kYcnnEnd = resourceType17;
       ResourceType resourceType29 = resourceType17;
       resourceType15 = new ResourceType("kAIEditEnd", 26, 2501);
       ResourceType.kAIEditEnd = resourceType15;
       ResourceType resourceType30 = resourceType15;
       resourceType17 = new ResourceType("kAIEditBegin", 27, 3000);
       ResourceType.kAIEditBegin = resourceType17;
       ResourceType resourceType31 = resourceType17;
       resourceType15 = new ResourceType("kTestResourceType1", 28, 3001);
       ResourceType.kTestResourceType1 = resourceType15;
       ResourceType resourceType32 = resourceType15;
       resourceType17 = new ResourceType("kMmuAsr", 29, 3003);
       ResourceType.kMmuAsr = resourceType17;
       ResourceType resourceType33 = resourceType17;
       resourceType15 = new ResourceType("kYKitBegin", 30, 3100);
       ResourceType.kYKitBegin = resourceType15;
       ResourceType resourceType34 = resourceType15;
       resourceType17 = new ResourceType("kYKitFaceAction", 31, 3174);
       ResourceType.kYKitFaceAction = resourceType17;
       ResourceType resourceType35 = resourceType17;
       resourceType15 = new ResourceType("kYKitEnd", 32, 4000);
       ResourceType.kYKitEnd = resourceType15;
       ResourceType resourceType36 = resourceType15;
       resourceType17 = new ResourceType("UNRECOGNIZED", 33, -1);
       ResourceType.UNRECOGNIZED = resourceType17;
       ResourceType[] resourceType37 = new ResourceType[34];
       resourceType37[0] = resourceType;
       resourceType37[1] = resourceType1;
       resourceType37[2] = resourceType2;
       resourceType37[3] = resourceType3;
       resourceType37[4] = resourceType4;
       resourceType37[5] = resourceType5;
       resourceType37[6] = resourceType6;
       resourceType37[7] = resourceType7;
       resourceType37[8] = resourceType8;
       resourceType37[9] = resourceType9;
       resourceType37[10] = resourceType10;
       resourceType37[11] = resourceType11;
       resourceType37[12] = resourceType25;
       resourceType37[13] = resourceType14;
       resourceType37[14] = resourceType16;
       resourceType37[15] = resourceType18;
       resourceType37[16] = resourceType19;
       resourceType37[17] = resourceType20;
       resourceType37[18] = resourceType21;
       resourceType37[19] = resourceType22;
       resourceType37[20] = resourceType23;
       resourceType37[21] = resourceType24;
       resourceType37[22] = resourceType26;
       resourceType37[23] = resourceType27;
       resourceType37[24] = resourceType28;
       resourceType37[25] = resourceType29;
       resourceType37[26] = resourceType30;
       resourceType37[27] = resourceType31;
       resourceType37[28] = resourceType32;
       resourceType37[29] = resourceType33;
       resourceType37[30] = resourceType34;
       resourceType37[31] = resourceType35;
       resourceType37[32] = resourceType36;
       resourceType37[33] = resourceType17;
       ResourceType.$VALUES = resourceType37;
       ResourceType.internalValueMap = new ResourceType$1();
    }
    public void ResourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ResourceType forNumber(int p0){
       if (p0 == 1000) {
          return ResourceType.kYcnnBegin;
       }
       if (p0 == 2000) {
          return ResourceType.kYcnnEnd;
       }
       if (p0 == 2501) {
          return ResourceType.kAIEditEnd;
       }
       if (p0 == 3003) {
          return ResourceType.kMmuAsr;
       }
       if (p0 == 3100) {
          return ResourceType.kYKitBegin;
       }
       if (p0 == 3174) {
          return ResourceType.kYKitFaceAction;
       }
       if (p0 == 4000) {
          return ResourceType.kYKitEnd;
       }
       if (p0 == 3000) {
          return ResourceType.kAIEditBegin;
       }
       if (p0 == 3001) {
          return ResourceType.kTestResourceType1;
       }
       switch (p0){
           case 0:
             return ResourceType.kFace;
           case 1:
             return ResourceType.kSensorData;
           case 2:
             return ResourceType.kUIInteraction;
           case 3:
             return ResourceType.kAR;
           case 4:
             return ResourceType.kSystemAR;
           case 5:
             return ResourceType.kDynamicResControllable;
           case 6:
             return ResourceType.kAudioDetect;
           case 7:
             return ResourceType.kAudioEffect;
           case 8:
             return ResourceType.kAudioDecibelCaculate;
           case 9:
             return ResourceType.kAnimojiData;
           case 10:
             return ResourceType.kEarData;
           case 11:
             return ResourceType.kFaceprop;
           case 12:
             return ResourceType.kFacepropForCallback;
           case 13:
             return ResourceType.kMmuRelightingCpu;
           case 14:
             return ResourceType.kMmuRelightingGpu;
           case 15:
             return ResourceType.kMemojiData;
           case 16:
             return ResourceType.kLandmarks3D;
           case 17:
             return ResourceType.kVideoSource;
           case 18:
             return ResourceType.kMmuArith;
           case 19:
             return ResourceType.kMmuCatPnp;
           case 20:
             return ResourceType.kMmuFaceLivePhoto;
           case 21:
             return ResourceType.kMmuFaceBlend;
           case 22:
             return ResourceType.kColorTransform;
           case 23:
             return ResourceType.kMmuHdrEst;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ResourceType.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ResourceType$ResourceTypeVerifier.INSTANCE;
    }
    public static ResourceType valueOf(int p0){
       return ResourceType.forNumber(p0);
    }
    public static ResourceType valueOf(String p0){
       return Enum.valueOf(ResourceType.class, p0);
    }
    public static ResourceType[] values(){
       return ResourceType.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ResourceType.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
