package com.kuaishou.android.model.mix.CoverCommonTagsModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.CoverCommonTagsModel;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import com.google.gson.stream.b;

public final class CoverCommonTagsModel$TypeAdapter extends TypeAdapter	// class@000c35
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       CoverCommonTagsModel$TypeAdapter.c = a.get(CoverCommonTagsModel.class);
    }
    public void CoverCommonTagsModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(CoverCommonTagLabelModel$TypeAdapter.l);
    }
    public CoverCommonTagsModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, CoverCommonTagsModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       CoverCommonTagsModel uCoverCommon = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uCoverCommon;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uCoverCommon;
       }else {
          p0.c();
          CoverCommonTagsModel uCoverCommon1 = new CoverCommonTagsModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x863f9a13:
                   if (str.equals("authorRelationEnhanceTag")) {
                      i = 0;
                   }
                   break;
                 case 0x95117915:
                   if (str.equals("besideCaptionSecTag")) {
                      i = 1;
                   }
                   break;
                 case 0xa6b3ed73:
                   if (str.equals("authorRelationTag")) {
                      i = 2;
                   }
                   break;
                 case 0xb59e9128:
                   if (str.equals("leftBottomTag")) {
                      i = 3;
                   }
                   break;
                 case 0xb805f6b3:
                   if (str.equals("rightBottomTag")) {
                      i = 4;
                   }
                   break;
                 case 0xb8110d03:
                   if (str.equals("authorHeadMaskEnhanceTag")) {
                      i = 5;
                   }
                   break;
                 case 0xc96e674f:
                   if (str.equals("authorRelationTagV2")) {
                      i = 6;
                   }
                   break;
                 case 0xc96e6750:
                   if (str.equals("authorRelationTagV3")) {
                      i = 7;
                   }
                   break;
                 case 0xe09bd528:
                   if (str.equals("coronaLeftTopTag")) {
                      i = 8;
                   }
                   break;
                 case 0xe8f43341:
                   if (str.equals("rightTopTag")) {
                      i = 9;
                   }
                   break;
                 case 0x18dfaf8e:
                   if (str.equals("besideCaptionTag")) {
                      i = 10;
                   }
                   break;
                 case 0x2237e481:
                   if (str.equals("authorRelationBigHeadTag")) {
                      i = 11;
                   }
                   break;
                 case 0x3540d232:
                   if (str.equals("authorRightSideTag")) {
                      i = 12;
                   }
                   break;
                 case 0x3776956a:
                   if (str.equals("searchSingleTag")) {
                      i = 13;
                   }
                   break;
                 case 0x43fa2397:
                   if (str.equals("authorHeadMask")) {
                      i = 14;
                   }
                   break;
                 case 0x483dcb7a:
                   if (str.equals("fifthPositionTag")) {
                      i = 15;
                   }
                   break;
                 case 0x490893f0:
                   if (str.equals("miniAppHeadTag")) {
                      i = 16;
                   }
                   break;
                 case 0x618b3338:
                   if (str.equals("underCoverTagV3")) {
                      i = 17;
                   }
                   break;
                 case 0x7fadb4ec:
                   if (str.equals("leftTopTag")) {
                      i = 18;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uCoverCommon1.mAuthorRelationEnhanceTag = this.b.read(p0);
                   break;
                 case 1:
                   uCoverCommon1.mBasideCaptionSecTag = this.b.read(p0);
                   break;
                 case 2:
                   uCoverCommon1.mAuthorRelationTag = this.b.read(p0);
                   break;
                 case 3:
                   uCoverCommon1.mLeftBottomTag = this.b.read(p0);
                   break;
                 case 4:
                   uCoverCommon1.mRightBottomTag = this.b.read(p0);
                   break;
                 case 5:
                   uCoverCommon1.mAuthorHeadMaskEnhanceTag = this.b.read(p0);
                   break;
                 case 6:
                   uCoverCommon1.mAuthorRelationTagV2 = this.b.read(p0);
                   break;
                 case 7:
                   uCoverCommon1.mV3StrongWithAvatarTag = this.b.read(p0);
                   break;
                 case 8:
                   uCoverCommon1.mCoronaLeftTopTag = this.b.read(p0);
                   break;
                 case 9:
                   uCoverCommon1.mRightTopTag = this.b.read(p0);
                   break;
                 case 10:
                   uCoverCommon1.mBesideCaptionTag = this.b.read(p0);
                   break;
                 case 11:
                   uCoverCommon1.mAuthorRelationBigHeadTag = this.b.read(p0);
                   break;
                 case 12:
                   uCoverCommon1.mAuthorRightSideTag = this.b.read(p0);
                   break;
                 case 13:
                   uCoverCommon1.mSearchSingleTag = this.b.read(p0);
                   break;
                 case 14:
                   uCoverCommon1.mAuthorHeadMask = this.b.read(p0);
                   break;
                 case 15:
                   uCoverCommon1.mFifthPositionTag = this.b.read(p0);
                   break;
                 case 16:
                   uCoverCommon1.mMiniAppHeadTag = this.b.read(p0);
                   break;
                 case 17:
                   uCoverCommon1.mV3StrongWithoutAvatarTag = this.b.read(p0);
                   break;
                 case 18:
                   uCoverCommon1.mLeftTopTag = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uCoverCommon1;
       }
    }
    public void b(b p0,CoverCommonTagsModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CoverCommonTagsModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mAuthorRelationTag != null) {
             p0.r("authorRelationTag");
             this.b.write(p0, p1.mAuthorRelationTag);
          }
          if (p1.mSearchSingleTag != null) {
             p0.r("searchSingleTag");
             this.b.write(p0, p1.mSearchSingleTag);
          }
          if (p1.mAuthorHeadMask != null) {
             p0.r("authorHeadMask");
             this.b.write(p0, p1.mAuthorHeadMask);
          }
          if (p1.mAuthorRelationTagV2 != null) {
             p0.r("authorRelationTagV2");
             this.b.write(p0, p1.mAuthorRelationTagV2);
          }
          if (p1.mLeftTopTag != null) {
             p0.r("leftTopTag");
             this.b.write(p0, p1.mLeftTopTag);
          }
          if (p1.mAuthorRightSideTag != null) {
             p0.r("authorRightSideTag");
             this.b.write(p0, p1.mAuthorRightSideTag);
          }
          if (p1.mRightTopTag != null) {
             p0.r("rightTopTag");
             this.b.write(p0, p1.mRightTopTag);
          }
          if (p1.mRightBottomTag != null) {
             p0.r("rightBottomTag");
             this.b.write(p0, p1.mRightBottomTag);
          }
          if (p1.mLeftBottomTag != null) {
             p0.r("leftBottomTag");
             this.b.write(p0, p1.mLeftBottomTag);
          }
          if (p1.mV3StrongWithAvatarTag != null) {
             p0.r("authorRelationTagV3");
             this.b.write(p0, p1.mV3StrongWithAvatarTag);
          }
          if (p1.mV3StrongWithoutAvatarTag != null) {
             p0.r("underCoverTagV3");
             this.b.write(p0, p1.mV3StrongWithoutAvatarTag);
          }
          if (p1.mBesideCaptionTag != null) {
             p0.r("besideCaptionTag");
             this.b.write(p0, p1.mBesideCaptionTag);
          }
          if (p1.mBasideCaptionSecTag != null) {
             p0.r("besideCaptionSecTag");
             this.b.write(p0, p1.mBasideCaptionSecTag);
          }
          if (p1.mCoronaLeftTopTag != null) {
             p0.r("coronaLeftTopTag");
             this.b.write(p0, p1.mCoronaLeftTopTag);
          }
          if (p1.mMiniAppHeadTag != null) {
             p0.r("miniAppHeadTag");
             this.b.write(p0, p1.mMiniAppHeadTag);
          }
          if (p1.mAuthorRelationBigHeadTag != null) {
             p0.r("authorRelationBigHeadTag");
             this.b.write(p0, p1.mAuthorRelationBigHeadTag);
          }
          if (p1.mAuthorRelationEnhanceTag != null) {
             p0.r("authorRelationEnhanceTag");
             this.b.write(p0, p1.mAuthorRelationEnhanceTag);
          }
          if (p1.mAuthorHeadMaskEnhanceTag != null) {
             p0.r("authorHeadMaskEnhanceTag");
             this.b.write(p0, p1.mAuthorHeadMaskEnhanceTag);
          }
          if (p1.mFifthPositionTag != null) {
             p0.r("fifthPositionTag");
             this.b.write(p0, p1.mFifthPositionTag);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
