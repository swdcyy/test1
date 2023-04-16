package jw8.q;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.edit.draft.InternalFeatureId;
import java.util.Map;
import com.kuaishou.edit.draft.FeatureId;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.kuaishou.edit.draft.FeatureId$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class q	// class@0029c8
{
    public static final Map a;

    static {
       HashMap hashMap = new HashMap();
       q.a = hashMap;
       if (PatchProxy.applyVoid(null, null, q.class, "1")) {
       }else {
          hashMap.put("01.png", InternalFeatureId.STICKER_KWAIID_1);
          hashMap.put("02.png", InternalFeatureId.STICKER_KWAIID_2);
          hashMap.put("03.png", InternalFeatureId.STICKER_KWAIID_3);
          hashMap.put("04.png", InternalFeatureId.STICKER_KWAIID_4);
          hashMap.put("05.png", InternalFeatureId.STICKER_KWAIID_5);
          hashMap.put("06.png", InternalFeatureId.STICKER_KWAIID_6);
          hashMap.put("date1", InternalFeatureId.STICKER_TIME_MONTH_DAY_WEEKDAY);
          hashMap.put("date2", InternalFeatureId.STICKER_TIME_MONTH_DAY);
          hashMap.put("datetime", InternalFeatureId.STICKER_TIME_MONTH_DAY_HOUR_MINUTE);
          hashMap.put("time", InternalFeatureId.STICKER_TIME_HOUR_MINUTE_AMPM);
          hashMap.put("sticker_ip_1", InternalFeatureId.STICKER_IP_1);
          hashMap.put("sticker_ip_2", InternalFeatureId.STICKER_IP_2);
          hashMap.put("sticker_ip_3", InternalFeatureId.STICKER_IP_3);
          hashMap.put("sticker_ip_4", InternalFeatureId.STICKER_IP_4);
          hashMap.put("sticker_ip_5", InternalFeatureId.STICKER_IP_5);
          hashMap.put("sticker_ip_6", InternalFeatureId.STICKER_IP_6);
          hashMap.put("sticker_ip_7", InternalFeatureId.STICKER_IP_7);
          hashMap.put("sticker_ip_8", InternalFeatureId.STICKER_IP_8);
          hashMap.put("sticker_normal_1", InternalFeatureId.STICKER_NORMAL_1);
          hashMap.put("sticker_normal_2", InternalFeatureId.STICKER_NORMAL_2);
          hashMap.put("sticker_normal_3", InternalFeatureId.STICKER_NORMAL_3);
          hashMap.put("sticker_normal_5", InternalFeatureId.STICKER_NORMAL_5);
          hashMap.put("sticker_normal_6", InternalFeatureId.STICKER_NORMAL_6);
          hashMap.put("sticker_normal_7", InternalFeatureId.STICKER_NORMAL_7);
          hashMap.put("sticker_normal_8", InternalFeatureId.STICKER_NORMAL_8);
          hashMap.put("sticker_normal_9", InternalFeatureId.STICKER_NORMAL_9);
          hashMap.put("sticker_normal_10", InternalFeatureId.STICKER_NORMAL_10);
          hashMap.put("sticker_normal_11", InternalFeatureId.STICKER_NORMAL_11);
          hashMap.put("sticker_normal_12", InternalFeatureId.STICKER_NORMAL_12);
          hashMap.put("sticker_normal_13", InternalFeatureId.STICKER_NORMAL_13);
          hashMap.put("sticker_normal_14", InternalFeatureId.STICKER_NORMAL_14);
          hashMap.put("sticker_normal_15", InternalFeatureId.STICKER_NORMAL_15);
          hashMap.put("sticker_normal_17", InternalFeatureId.STICKER_NORMAL_17);
          hashMap.put("sticker_normal_18", InternalFeatureId.STICKER_NORMAL_18);
          hashMap.put("sticker_normal_21", InternalFeatureId.STICKER_NORMAL_21);
          hashMap.put("sticker_normal_22", InternalFeatureId.STICKER_NORMAL_22);
          hashMap.put("sticker_normal_23", InternalFeatureId.STICKER_NORMAL_23);
          hashMap.put("sticker_normal_24", InternalFeatureId.STICKER_NORMAL_24);
          hashMap.put("sticker_normal_26", InternalFeatureId.STICKER_NORMAL_26);
          hashMap.put("sticker_normal_27", InternalFeatureId.STICKER_NORMAL_27);
          hashMap.put("sticker_normal_28", InternalFeatureId.STICKER_NORMAL_28);
          hashMap.put("sticker_normal_29", InternalFeatureId.STICKER_NORMAL_29);
          hashMap.put("sticker_normal_30", InternalFeatureId.STICKER_NORMAL_30);
          hashMap.put("sticker_normal_31", InternalFeatureId.STICKER_NORMAL_31);
          hashMap.put("sticker_normal_32", InternalFeatureId.STICKER_NORMAL_32);
          hashMap.put("sticker_normal_33", InternalFeatureId.STICKER_NORMAL_33);
          hashMap.put("sticker_normal_34", InternalFeatureId.STICKER_NORMAL_34);
          hashMap.put("sticker_normal_35", InternalFeatureId.STICKER_NORMAL_35);
          hashMap.put("sticker_normal_37", InternalFeatureId.STICKER_NORMAL_37);
          hashMap.put("sticker_normal_40", InternalFeatureId.STICKER_NORMAL_40);
          hashMap.put("sticker_vote_0", InternalFeatureId.STICKER_VOTE_0);
          hashMap.put("sticker_chunjie_1", InternalFeatureId.STICKER_CHUN_JIE_1);
          hashMap.put("sticker_chunjie_2", InternalFeatureId.STICKER_CHUN_JIE_2);
          hashMap.put("sticker_chunjie_3", InternalFeatureId.STICKER_CHUN_JIE_3);
          hashMap.put("sticker_chunjie_4", InternalFeatureId.STICKER_CHUN_JIE_4);
       }
    }
    public void q(){
       super();
    }
    public static FeatureId a(String p0){
       GeneratedMessageLite generatedMes;
       FeatureId$b uob;
       InternalFeatureId internalFeat;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Map obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, oq, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0.contains("sticker_vote")) {
          generatedMes = PatchProxy.applyOneRefs(p0, obj, oq, "4");
          if (generatedMes != patchProxyRe) {
          }else {
             uob = FeatureId.newBuilder();
             String str = p0.replaceAll(".png", "");
             obj = q.a;
             if (obj.get(p0) != null) {
                internalFeat = obj.get(p0);
             }else if(obj.get(str) != null){
                internalFeat = obj.get(str);
             }else {
                internalFeat = InternalFeatureId.UNKNOWN;
             }
             if (internalFeat != null && internalFeat != InternalFeatureId.UNKNOWN) {
                uob.b(internalFeat);
             }else {
                uob.a(p0);
             }
             generatedMes = uob.build();
          }
          return generatedMes;
       }else {
          generatedMes = PatchProxy.applyOneRefs(p0, obj, oq, "3");
          if (generatedMes != patchProxyRe) {
          }else {
             uob = FeatureId.newBuilder();
             uob.a(p0);
             generatedMes = uob.build();
          }
          return generatedMes;
       }
    }
    public static String b(FeatureId p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       q oq = q.class;
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, oq, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = "";
       if (p0 == null) {
          return obj1;
       }
       if (!TextUtils.x(p0.getExternal())) {
          obj1 = p0.getExternal();
       }else if(p0.getInternal() != InternalFeatureId.UNKNOWN){
          InternalFeatureId internal = p0.getInternal();
          Map$Entry obj2 = PatchProxy.applyOneRefs(internal, obj, oq, "6");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          }else {
             Iterator iterator = q.a.entrySet().iterator();
             while (iterator.hasNext()) {
                obj2 = iterator.next();
                if (obj2.getValue() == internal) {
                   obj = obj2.getKey();
                   break ;
                }
             }
          }
          obj1 = obj;
       }
       return obj1;
    }
}
