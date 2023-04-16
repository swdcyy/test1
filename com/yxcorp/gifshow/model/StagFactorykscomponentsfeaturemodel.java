package com.yxcorp.gifshow.model.StagFactorykscomponentsfeaturemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ProfileCardRedDot$TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonStatusInfo$TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo;
import com.yxcorp.gifshow.model.ProfileTemplateCard$ButtonInfo$TypeAdapter;
import com.yxcorp.gifshow.model.ProfileTemplateCard;
import com.yxcorp.gifshow.model.ProfileTemplateCard$TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateTypeMetaInfo;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRedDot;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRedDot$TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateCircle;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateCircle$TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRelation;
import com.yxcorp.gifshow.model.IntimateRelationGroup$IntimateRelation$TypeAdapter;
import com.yxcorp.gifshow.model.IntimateRelationGroup;
import com.yxcorp.gifshow.model.IntimateRelationGroup$TypeAdapter;

public final class StagFactorykscomponentsfeaturemodel implements j	// class@001e92
{

    public void StagFactorykscomponentsfeaturemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentsfeaturemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == ProfileTemplateCard$ProfileCardRedDot.class) {
          return new ProfileTemplateCard$ProfileCardRedDot$TypeAdapter(p0);
       }
       if (rawType == ProfileTemplateCard$ButtonStatusInfo.class) {
          return new ProfileTemplateCard$ButtonStatusInfo$TypeAdapter(p0);
       }
       if (rawType == ProfileTemplateCard$ButtonInfo.class) {
          return new ProfileTemplateCard$ButtonInfo$TypeAdapter(p0);
       }
       if (rawType == ProfileTemplateCard.class) {
          return new ProfileTemplateCard$TypeAdapter(p0);
       }
       if (rawType == IntimateRelationGroup$IntimateTypeMetaInfo.class) {
          return new IntimateRelationGroup$IntimateTypeMetaInfo$TypeAdapter(p0);
       }
       if (rawType == IntimateRelationGroup$IntimateRedDot.class) {
          return new IntimateRelationGroup$IntimateRedDot$TypeAdapter(p0);
       }
       if (rawType == IntimateRelationGroup$IntimateCircle.class) {
          return new IntimateRelationGroup$IntimateCircle$TypeAdapter(p0);
       }
       if (rawType == IntimateRelationGroup$IntimateRelation.class) {
          return new IntimateRelationGroup$IntimateRelation$TypeAdapter(p0);
       }
       if (rawType == IntimateRelationGroup.class) {
          return new IntimateRelationGroup$TypeAdapter(p0);
       }
       return null;
    }
}
