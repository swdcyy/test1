package com.yxcorp.gifshow.settings.SettingItem;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SettingItem extends Enum	// class@001b26
{
    public static final SettingItem[] $VALUES;
    public static final SettingItem CLEAR_CACHE;
    public static final SettingItem MY_COURSE;
    public static final SettingItem MY_WALLET;
    public static final SettingItem SAVE_TO_LOCAL;
    public static final SettingItem STORAGE_SPACE;
    public static final SettingItem WANG_CARD_GET_MONEY;

    static {
       SettingItem settingItem = new SettingItem("CLEAR_CACHE", 0);
       SettingItem.CLEAR_CACHE = settingItem;
       SettingItem settingItem1 = new SettingItem("STORAGE_SPACE", 1);
       SettingItem.STORAGE_SPACE = settingItem1;
       SettingItem settingItem2 = new SettingItem("SAVE_TO_LOCAL", 2);
       SettingItem.SAVE_TO_LOCAL = settingItem2;
       SettingItem settingItem3 = new SettingItem("MY_WALLET", 3);
       SettingItem.MY_WALLET = settingItem3;
       SettingItem settingItem4 = new SettingItem("WANG_CARD_GET_MONEY", 4);
       SettingItem.WANG_CARD_GET_MONEY = settingItem4;
       SettingItem settingItem5 = new SettingItem("MY_COURSE", 5);
       SettingItem.MY_COURSE = settingItem5;
       SettingItem[] settingItemA = new SettingItem[]{settingItem,settingItem1,settingItem2,settingItem3,settingItem4,settingItem5};
       SettingItem.$VALUES = settingItemA;
    }
    public void SettingItem(String p0,int p1){
       super(p0, p1);
    }
    public static SettingItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SettingItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SettingItem.class, p0);
    }
    public static SettingItem[] values(){
       Object obj = PatchProxy.apply(null, null, SettingItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SettingItem.$VALUES.clone();
    }
}
