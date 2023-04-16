package com.yxcorp.gifshow.v3.editor.magicfinger.model.MagicFingerItem;
import java.lang.Enum;
import com.yxcorp.gifshow.v3.editor.magicfinger.i$c;
import java.lang.String;
import android.graphics.Color;
import com.google.common.collect.HashBiMap;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import qk.f;
import java.util.Map;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.resource.Category;
import java.io.File;

public final class MagicFingerItem extends Enum	// class@00103b
{
    public int mFeatureId;
    public i$c mFilterItemInfo;
    public String mFilterName;
    public static final MagicFingerItem[] $VALUES;
    public static final f FEATURE_ID_MAGIC_ITEM_BI_MAP;
    public static final MagicFingerItem filter_ballon;
    public static final MagicFingerItem filter_celebration;
    public static final MagicFingerItem filter_fire;
    public static final MagicFingerItem filter_heart;
    public static final MagicFingerItem filter_ice;
    public static final MagicFingerItem filter_lips;
    public static final MagicFingerItem filter_lotus;
    public static final MagicFingerItem filter_prism;
    public static final MagicFingerItem filter_rain;
    public static final MagicFingerItem filter_rich;
    public static final MagicFingerItem filter_shower;
    public static final MagicFingerItem filter_stick;

    static {
       MagicFingerItem magicFingerI = new MagicFingerItem("filter_heart", 0, "filter_1", new i$c(0x7f10312f, "xin", Color.parseColor("#80FF3A30"), 1), 0x5210);
       MagicFingerItem.filter_heart = v6;
       MagicFingerItem magicFingerI1 = new MagicFingerItem("filter_fire", 1, "filter_2", new i$c(0x7f10312e, "huo", Color.parseColor("#8036CFA2"), 3), 0x520b);
       MagicFingerItem.filter_fire = magicFingerI;
       MagicFingerItem magicFingerI2 = new MagicFingerItem("filter_rich", 2, "filter_3", new i$c(0x7f103137, "hao", Color.parseColor("#809353E0"), 4), 0x520c);
       MagicFingerItem.filter_rich = v1;
       MagicFingerItem magicFingerI3 = new MagicFingerItem("filter_stick", 3, "filter_4", new i$c(0x7f103133, "mofa", Color.parseColor("#802FC727"), 12), 0x520e);
       MagicFingerItem.filter_stick = v2;
       MagicFingerItem magicFingerI4 = new MagicFingerItem("filter_ice", 4, "filter_5", new i$c(0x7f103130, "bingshu", Color.parseColor("#802E53EB"), 11), 0x520f);
       MagicFingerItem.filter_ice = v3;
       MagicFingerItem magicFingerI5 = new MagicFingerItem("filter_lips", 5, "filter_6", new i$c(0x7f103131, "xiangwen", Color.parseColor("#80FF6759"), 5), 0x520a);
       MagicFingerItem.filter_lips = v5;
       MagicFingerItem magicFingerI6 = new MagicFingerItem("filter_shower", 6, "filter_7", new i$c(0x7f103134, "liuxingyu", Color.parseColor("#80FFEB3B"), 10), 0x5211);
       MagicFingerItem.filter_shower = magicFingerI1;
       magicFingerI5 = new MagicFingerItem("filter_lotus", 7, "filter_8", new i$c(0x7f103132, "taohua", Color.parseColor("#80EA2D95"), 6), 0x5212);
       MagicFingerItem.filter_lotus = v10;
       MagicFingerItem magicFingerI7 = new MagicFingerItem("filter_rain", 8, "filter_9", new i$c(0x7f103136, "yu", Color.parseColor("#80B47EED"), 7), 0x5213);
       MagicFingerItem.filter_rain = magicFingerI4;
       MagicFingerItem magicFingerI8 = new MagicFingerItem("filter_celebration", 9, "filter_10", new i$c(0x7f10312d, "huanqing", Color.parseColor("#80BAE639"), 8), 0x5214);
       MagicFingerItem.filter_celebration = v9;
       magicFingerI7 = new MagicFingerItem("filter_ballon", 10, "filter_11", new i$c(0x7f10312c, "qiqiu", Color.parseColor("#80FF5000"), 9), 0x520d);
       MagicFingerItem.filter_ballon = v4;
       MagicFingerItem magicFingerI9 = v4;
       magicFingerI8 = new MagicFingerItem("filter_prism", 11, "filter_12", new i$c(0x7f103135, "xingxing", Color.parseColor("#80FDAF12"), 2), 0x5209);
       MagicFingerItem.filter_prism = v7;
       MagicFingerItem[] magicFingerI10 = new MagicFingerItem[12];
       magicFingerI10[0] = v6;
       magicFingerI10[1] = magicFingerI;
       magicFingerI10[2] = v1;
       magicFingerI10[3] = v2;
       magicFingerI10[4] = v3;
       magicFingerI10[5] = v5;
       magicFingerI10[6] = magicFingerI1;
       magicFingerI10[7] = v10;
       magicFingerI10[8] = magicFingerI4;
       magicFingerI10[9] = v9;
       magicFingerI10[10] = magicFingerI9;
       magicFingerI10[11] = v7;
       MagicFingerItem.$VALUES = magicFingerI10;
       MagicFingerItem.FEATURE_ID_MAGIC_ITEM_BI_MAP = HashBiMap.create();
       MagicFingerItem.initFeatureIdMagicItemBiMap();
    }
    public void MagicFingerItem(String p0,int p1,String p2,i$c p3,int p4){
       super(p0, p1);
       this.mFilterName = p2;
       this.mFilterItemInfo = p3;
       this.mFeatureId = p4;
    }
    public static Integer geFeatureIdFromTouchFilterId(int p0){
       MagicFingerItem[] obj;
       object oobject;
       MagicFingerItem magicFingerI = MagicFingerItem.class;
       if (PatchProxy.isSupport(magicFingerI)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, magicFingerI, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = MagicFingerItem.values();
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return Integer.valueOf(-1);
          }
          oobject = obj[i];
          if (oobject.mFilterItemInfo.d == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return MagicFingerItem.FEATURE_ID_MAGIC_ITEM_BI_MAP.inverse().get(oobject);
    }
    public static String getIconDir(){
       Object obj = PatchProxy.apply(null, null, MagicFingerItem.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Category.MAGIC_FINGER.getResourceDir()+"icons"+File.separator;
    }
    public static String getIconFilePath(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFingerItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicFingerItem.getIconDir()+p0+".gif";
    }
    public static MagicFingerItem getMagicItemFromFeatureId(int p0){
       MagicFingerItem magicFingerI = MagicFingerItem.class;
       if (PatchProxy.isSupport(magicFingerI)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, magicFingerI, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p0) {
          return null;
       }else {
          return MagicFingerItem.FEATURE_ID_MAGIC_ITEM_BI_MAP.get(Integer.valueOf(p0));
       }
    }
    public static void initFeatureIdMagicItemBiMap(){
       if (PatchProxy.applyVoid(null, null, MagicFingerItem.class, "3")) {
          return;
       }
       int i = 0;
       while (i < MagicFingerItem.values().length) {
          object oobject = MagicFingerItem.values()[i];
          MagicFingerItem mFeatureId = oobject.mFeatureId;
          if (mFeatureId != null) {
             MagicFingerItem.FEATURE_ID_MAGIC_ITEM_BI_MAP.put(Integer.valueOf(mFeatureId), oobject);
          }
          i = i + 1;
       }
       return;
    }
    public static MagicFingerItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicFingerItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MagicFingerItem.class, p0);
    }
    public static MagicFingerItem[] values(){
       Object obj = PatchProxy.apply(null, null, MagicFingerItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MagicFingerItem.$VALUES.clone();
    }
}
