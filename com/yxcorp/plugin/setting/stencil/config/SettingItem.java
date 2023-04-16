package com.yxcorp.plugin.setting.stencil.config.SettingItem;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SettingItem extends Enum	// class@0008f8
{
    public final int iconResource;
    public final String key;
    public static final SettingItem[] $VALUES;
    public static final SettingItem ABOUT;
    public static final SettingItem ACCOUNT_SECURITY;
    public static final SettingItem BIND_PHONE;
    public static final SettingItem BLOCK;
    public static final SettingItem DARK;
    public static final SettingItem E_COMMERCE;
    public static final SettingItem FAN_TOP;
    public static final SettingItem FEEDBACK;
    public static final SettingItem FONT;
    public static final SettingItem FREE_DATA_TRAFFIC;
    public static final SettingItem GENERAL;
    public static final SettingItem INVITATION;
    public static final SettingItem KUAIXIANG;
    public static final SettingItem LIVE;
    public static final SettingItem NOTIFICATION;
    public static final SettingItem PERMISSION_LIST;
    public static final SettingItem PERSONAL_INFO;
    public static final SettingItem PERSONAL_INFORMATION_COLLECTED;
    public static final SettingItem PRIVACY;
    public static final SettingItem PRIVACY_PROTECTION;
    public static final SettingItem QUICK_ORDER;
    public static final SettingItem REN_WO_KAN;
    public static final SettingItem STORAGE;
    public static final SettingItem THIRD_PARTY_DATA;
    public static final SettingItem WANG_CARD;

    static {
       SettingItem[] settingItemA = new SettingItem[25];
       SettingItem settingItem = new SettingItem("BIND_PHONE", 0, "bind_phone", 0x7f080bf5);
       SettingItem.BIND_PHONE = settingItem;
       settingItemA[0] = settingItem;
       settingItem = new SettingItem("ACCOUNT_SECURITY", 1, "account_safety", 0x7f080bf9);
       SettingItem.ACCOUNT_SECURITY = settingItem;
       settingItemA[1] = settingItem;
       settingItem = new SettingItem("PRIVACY", 2, "privacy_setting", 0x7f080bf6);
       SettingItem.PRIVACY = settingItem;
       settingItemA[2] = settingItem;
       settingItem = new SettingItem("PERSONAL_INFO", 3, "personal_information", 0x7f080552);
       SettingItem.PERSONAL_INFO = settingItem;
       settingItemA[3] = settingItem;
       settingItem = new SettingItem("GENERAL", 4, "general_setting", 0x7f080bea);
       SettingItem.GENERAL = settingItem;
       settingItemA[4] = settingItem;
       settingItem = new SettingItem("NOTIFICATION", 5, "notification_setting", 0x7f080bf2);
       SettingItem.NOTIFICATION = settingItem;
       settingItemA[5] = settingItem;
       settingItem = new SettingItem("BLOCK", 6, "block_setting", 0x7f080bfa);
       SettingItem.BLOCK = settingItem;
       settingItemA[6] = settingItem;
       settingItem = new SettingItem("LIVE", 7, "open_live", 0x7f080bef);
       SettingItem.LIVE = settingItem;
       settingItemA[7] = settingItem;
       settingItem = new SettingItem("STORAGE", 8, "storage_space", 0x7f080be2);
       SettingItem.STORAGE = settingItem;
       settingItemA[8] = settingItem;
       settingItem = new SettingItem("DARK", 9, "dark_mode", 0x7f080bf1);
       SettingItem.DARK = settingItem;
       settingItemA[9] = settingItem;
       settingItem = new SettingItem("FONT", 10, "font", 0x7f080be8);
       SettingItem.FONT = settingItem;
       settingItemA[10] = settingItem;
       settingItem = new SettingItem("INVITATION", 11, "invitation_entrance", 0x7f080bf8);
       SettingItem.INVITATION = settingItem;
       settingItemA[11] = settingItem;
       settingItem = new SettingItem("FAN_TOP", 12, "fan_headline", 0x7f080be7);
       SettingItem.FAN_TOP = settingItem;
       settingItemA[12] = settingItem;
       settingItem = new SettingItem("E_COMMERCE", 13, "e_commerce_promotionor", 0x7f080be1);
       SettingItem.E_COMMERCE = settingItem;
       settingItemA[13] = settingItem;
       settingItem = new SettingItem("QUICK_ORDER", 14, "quick_order", 0x7f080bf0);
       SettingItem.QUICK_ORDER = settingItem;
       settingItemA[14] = settingItem;
       settingItem = new SettingItem("KUAIXIANG", 15, "kuaixiang_author", 0x7f080bf0);
       SettingItem.KUAIXIANG = settingItem;
       settingItemA[15] = settingItem;
       settingItem = new SettingItem("WANG_CARD", 16, "wang_card", 0x7f080bfc);
       SettingItem.WANG_CARD = settingItem;
       settingItemA[16] = settingItem;
       settingItem = new SettingItem("REN_WO_KAN", 17, "ren_wo_kan", 0x7f080bee);
       SettingItem.REN_WO_KAN = settingItem;
       settingItemA[17] = settingItem;
       settingItem = new SettingItem("FREE_DATA_TRAFFIC", 18, "free_data_traffic", 0x7f080be9);
       SettingItem.FREE_DATA_TRAFFIC = settingItem;
       settingItemA[18] = settingItem;
       settingItem = new SettingItem("FEEDBACK", 19, "feed_and_help", 0x7f080beb);
       SettingItem.FEEDBACK = settingItem;
       settingItemA[19] = settingItem;
       settingItem = new SettingItem("ABOUT", 20, "about_kwai", 0x7f080bde);
       SettingItem.ABOUT = settingItem;
       settingItemA[20] = settingItem;
       settingItem = new SettingItem("PERSONAL_INFORMATION_COLLECTED", 21, "list_of_personal", 0x7f080527);
       SettingItem.PERSONAL_INFORMATION_COLLECTED = settingItem;
       settingItemA[21] = settingItem;
       settingItem = new SettingItem("PERMISSION_LIST", 22, "request_permission", 0x7f080bf3);
       SettingItem.PERMISSION_LIST = settingItem;
       settingItemA[22] = settingItem;
       settingItem = new SettingItem("THIRD_PARTY_DATA", 23, "list_of_third", 0x7f080bfd);
       SettingItem.THIRD_PARTY_DATA = settingItem;
       settingItemA[23] = settingItem;
       settingItem = new SettingItem("PRIVACY_PROTECTION", 24, "privacy_protection", 0x7f080bf7);
       SettingItem.PRIVACY_PROTECTION = settingItem;
       settingItemA[24] = settingItem;
       SettingItem.$VALUES = settingItemA;
    }
    public void SettingItem(String p0,int p1,String p2,int p3){
       super(p0, p1);
       this.key = p2;
       this.iconResource = p3;
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
    public final int getIconResource(){
       return this.iconResource;
    }
    public final String getKey(){
       return this.key;
    }
}
