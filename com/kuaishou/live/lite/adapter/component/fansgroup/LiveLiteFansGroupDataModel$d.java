package com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel$d;
import lf3.g;
import com.kuaishou.live.lite.adapter.component.fansgroup.LiveLiteFansGroupDataModel;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$SCLiveFansGroupStatusChanged;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import l95.a;
import java.util.LinkedHashMap;
import java.util.Map;
import l95.c;
import lf3.f;

public final class LiveLiteFansGroupDataModel$d implements g	// class@001d88
{
    public final LiveLiteFansGroupDataModel b;

    public void LiveLiteFansGroupDataModel$d(LiveLiteFansGroupDataModel p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteFansGroupDataModel$d.class, "1")) {
       }else {
          LiveFansGroupMessages$SCLiveFansGroupStatusChanged statusChange = p0.statusChangedType;
          boolean b = true;
          String str = null;
          String str1 = null;
          if (statusChange != b) {
             if (statusChange != 2) {
                if (statusChange != 4) {
                   if (statusChange == 5) {
                      LiveLiteFansGroupDataModel.o(this.b, p0.intimacyLevel, str1, 2, str);
                      LiveLiteFansGroupDataModel.r(this.b, p0.activeStatus, str1, 2, str);
                   }
                }else {
                   this.b.p(p0.medalType, b);
                   LiveLiteFansGroupDataModel.o(this.b, p0.intimacyLevel, str1, 2, str);
                }
             }else {
                LiveLiteFansGroupDataModel.o(this.b, p0.intimacyLevel, str1, 2, str);
                LiveLiteFansGroupDataModel.r(this.b, p0.activeStatus, str1, 2, str);
             }
          }else {
             LiveLiteFansGroupDataModel.o(this.b, p0.intimacyLevel, str1, 2, str);
             LiveLiteFansGroupDataModel.r(this.b, p0.activeStatus, str1, 2, str);
          }
          LiveLiteFansGroupDataModel$d tb = this.b;
          a.o(p0, "message");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveLiteFansGroupDataModel.class, "23") && FansGroupKswitchUtil.b()) {
             b uob = new b(b, "Entrance", "UPDATE_ENTRY");
             a uoa = new a();
             uoa.d(p0.activeStatus);
             uoa.b(p0.intimacyLevel);
             uoa.c(p0.medalType);
             uob.e(uoa);
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             linkedHashMa.put("changedType", String.valueOf(p0.statusChangedType));
             uob.d(linkedHashMa);
             c.a(uob);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
