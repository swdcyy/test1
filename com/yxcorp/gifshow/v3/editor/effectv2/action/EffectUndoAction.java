package com.yxcorp.gifshow.v3.editor.effectv2.action.EffectUndoAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.effectv2.action.EffectUndoAction$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import java.lang.Integer;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import raa.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.AEEffect;
import com.kuaishou.edit.draft.FeatureId;
import raa.i;
import com.kuaishou.edit.draft.VisualEffect;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import eqc.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import raa.c;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Objects;

public final class EffectUndoAction extends EditSdkAction	// class@000f42
{
    public final EffectGroupType currentEffectType;
    public final String effectName;
    public TimeRange lastTimeRange;
    public final Integer undoAdvEffectId;
    public static final EffectUndoAction$a Companion;

    static {
       EffectUndoAction.Companion = new EffectUndoAction$a(null);
    }
    public void EffectUndoAction(EffectGroupType p0,Integer p1,TimeRange p2,String p3){
       a.p(p0, "currentEffectType");
       a.p(p3, "effectName");
       super();
       this.currentEffectType = p0;
       this.undoAdvEffectId = p1;
       this.lastTimeRange = p2;
       this.effectName = p3;
    }
    public void EffectUndoAction(EffectGroupType p0,Integer p1,TimeRange p2,String p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = null;
       }
       if (p4 & 0x08) {
          p3 = "";
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final int getAdvEffectId(int p0,String p1){
       EffectUndoAction uEffectUndoA = EffectUndoAction.class;
       if (PatchProxy.isSupport(uEffectUndoA)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uEffectUndoA, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!TextUtils.isEmpty(p1)) {
          p0 = Integer.parseInt(p1);
       }
       return p0;
    }
    public final EffectGroupType getCurrentEffectType(){
       return this.currentEffectType;
    }
    public final String getEffectName(){
       return this.effectName;
    }
    public final TimeRange getLastTimeRange(){
       return this.lastTimeRange;
    }
    public final Integer getUndoAdvEffectId(){
       return this.undoAdvEffectId;
    }
    public final boolean isAEEffectId(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectUndoAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a uoa = p0.m0();
       if (uoa != null) {
          List list = uoa.z();
          a.o(list, "aeDraft.messages");
          Iterator iterator = list.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             FeatureId obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj1.hasFeatureId()) {
                a.o(obj1, "aeEffect");
                FeatureId featureId = obj1.getFeatureId();
                a.o(featureId, "aeEffect.featureId");
                obj1 = obj1.getFeatureId();
                a.o(obj1, "aeEffect\n                .featureId");
                String external = obj1.getExternal();
                a.o(external, "aeEffect\n                .featureId.external");
                i = this.getAdvEffectId(featureId.getInternalValue(), external);
                EffectUndoAction tundoAdvEffe = this.undoAdvEffectId;
                if (tundoAdvEffe != null && i == tundoAdvEffe.intValue()) {
                   return true;
                }
             }
             i = i1;
          }
       }
       return false;
    }
    public final boolean isNormalVisualEffect(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EffectUndoAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       i oi = p0.f1();
       if (oi != null) {
          List list = oi.z();
          a.o(list, "visualDraft.messages");
          Iterator iterator = list.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             FeatureId obj1 = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             if (obj1.hasFeatureId()) {
                a.o(obj1, "visualEffect");
                FeatureId featureId = obj1.getFeatureId();
                a.o(featureId, "visualEffect.featureId");
                obj1 = obj1.getFeatureId();
                a.o(obj1, "visualEffect\n                .featureId");
                String external = obj1.getExternal();
                a.o(external, "visualEffect\n                .featureId.external");
                i = this.getAdvEffectId(featureId.getInternalValue(), external);
                EffectUndoAction tundoAdvEffe = this.undoAdvEffectId;
                if (tundoAdvEffe != null && i == tundoAdvEffe.intValue()) {
                   return true;
                }
             }
             i = i1;
          }
       }
       return false;
    }
    public void performAction(c p0,c p1){
       Object[] objArray1;
       FaceMagicEffect$Type type;
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EffectUndoAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "EffectUndoAction";
       a.D().w(str, "performAction currentEffectType:"+this.currentEffectType+", undoAdvEffectId:"+this.undoAdvEffectId+", "+"lastTimeRange:"+this.lastTimeRange+", effectName:"+this.effectName, objArray);
       EffectUndoAction tcurrentEffe = this.currentEffectType;
       if (tcurrentEffe == EffectGroupType.VisualEffect) {
          tcurrentEffe = this.undoAdvEffectId;
          if (tcurrentEffe != null) {
             tcurrentEffe.intValue();
             a.a.onLogAdvButtonEvent("revoke_filter_effect");
             if (this.isAEEffectId(p0)) {
                objArray1 = new Object[i];
                a.D().s(str, "undo ae effect", objArray1);
                this.removeAEEffect(p0);
             }else if(this.isNormalVisualEffect(p0)){
                objArray1 = new Object[i];
                a.D().s(str, "undo normal visual effect", objArray1);
                i oi = p0.f1();
                if (oi != null) {
                   i = oi.p();
                }
                if (i > 0) {
                   this.removeNormalVisualEffect(p0);
                }else {
                   i1.c(new RuntimeException("undoFaceMagicOrVisualEffect error project"));
                }
             }
          }
       }else if(tcurrentEffe == EffectGroupType.FACE_MAGIC_EFFECT){
          tcurrentEffe = p0.z0();
          if (tcurrentEffe != null) {
             i = tcurrentEffe.p();
          }
          i = i - 1;
          while (i >= 0) {
             tcurrentEffe = p0.z0();
             TimeRange timeRange = null;
             if (tcurrentEffe != null) {
                List list = tcurrentEffe.z();
                if (list != null) {
                   FaceMagicEffect uFaceMagicEf = list.get(i);
                   if (uFaceMagicEf != null) {
                      type = uFaceMagicEf.getType();
                   label_00df :
                      if (type == FaceMagicEffect$Type.FACE_MAGIC) {
                         type = p0.z0();
                         if (type != null) {
                            uFaceMagicEf = type.y(i);
                            if (uFaceMagicEf != null) {
                               timeRange = uFaceMagicEf.getRange();
                            }
                         }
                         this.lastTimeRange = timeRange;
                         a = a.a;
                         EffectUndoAction teffectName = this.effectName;
                         Objects.requireNonNull(a);
                         a uoa = a.class;
                         if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(teffectName, Integer.valueOf(i), a, uoa, "19")) {
                            a.m(teffectName);
                            a.f("CLICK_UNDO", teffectName, i);
                         }
                         p0 = p0.z0();
                         if (p0 != null) {
                            p0.V(i);
                            break ;
                         }
                      }
                   }
                }
             }
             type = timeRange;
             goto label_00df ;
             i = i - 1;
          }
       }
       return;
    }
    public final void removeAEEffect(c p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectUndoAction.class, "5")) {
          return;
       }
       a uoa = p0.m0();
       int i = 0;
       String str = "EffectUndoAction";
       if (uoa == null) {
          objArray = new Object[i];
          a.D().s(str, "removeAEEffect ae2EffectTimeline is null", objArray);
          return;
       }else {
          int i1 = uoa.p();
          if (!i1) {
             objArray = new Object[i];
             a.D().s(str, "removeAEEffect param is null", objArray);
             return;
          }else {
             i1 = i1 - 1;
             GeneratedMessageLite generatedMes = uoa.y(i1);
             a.o(generatedMes, "ae2EffectDraft.getMessage\(ae2EffectSize - 1\)");
             this.lastTimeRange = generatedMes.getTimeRange();
             uoa.V(i1);
             return;
          }
       }
    }
    public final void removeNormalVisualEffect(c p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, EffectUndoAction.class, "4")) {
          return;
       }
       i oi = p0.f1();
       int i = 0;
       String str = "EffectUndoAction";
       if (oi == null) {
          objArray = new Object[i];
          a.D().s(str, "removeNormalEffect normalEffectTimeline is null", objArray);
          return;
       }else {
          int i1 = oi.p();
          if (!i1) {
             objArray = new Object[i];
             a.D().s(str, "removeNormalEffect param is null", objArray);
             return;
          }else {
             i1 = i1 - 1;
             GeneratedMessageLite generatedMes = oi.y(i1);
             a.o(generatedMes, "visualEffectDraft.getMessage\(size - 1\)");
             this.lastTimeRange = generatedMes.getRange();
             oi.V(i1);
             return;
          }
       }
    }
    public final void setLastTimeRange(TimeRange p0){
       this.lastTimeRange = p0;
    }
}
