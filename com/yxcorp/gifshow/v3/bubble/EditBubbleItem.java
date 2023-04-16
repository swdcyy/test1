package com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import ra9.c;
import java.lang.Enum;
import java.lang.String;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import oa0.a;
import android.content.SharedPreferences;
import ooc.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import ra9.b;
import java.lang.Number;
import lnc.e7;

public final class EditBubbleItem extends Enum implements c	// class@000d2b
{
    public final boolean mBlockOther;
    public final boolean mBlockedByOther;
    public final String mBubbleKey;
    public String mContent;
    public final EditorItemFunc mEditorItemFunc;
    public final String mFunctionName;
    public final boolean mShouldShowOldState;
    public final int mShowTimes;
    public final int mType;
    public final int mUpgradeVersion;
    public static final EditBubbleItem[] $VALUES;
    public static final EditBubbleItem AE_TEXT;
    public static final EditBubbleItem AI_CUT_ORIGIN;
    public static final EditBubbleItem AI_CUT_RECOMMEND;
    public static final EditBubbleItem AUTO_MUSIC_PICTURE;
    public static final EditBubbleItem AUTO_MUSIC_SETTINGS;
    public static final EditBubbleItem AUTO_MUSIC_VIDEO;
    public static final EditBubbleItem AUTO_SUBTITLE;
    public static final EditBubbleItem BEAT_SYNC_NO_ICON;
    public static final EditBubbleItem BEAT_SYNC_WITH_ICON;
    public static final EditBubbleItem CLIP_ADD_SEGMENT;
    public static final EditBubbleItem COPY_TEXT_NEW_TEXT;
    public static final EditBubbleItem COPY_TEXT_OLD_TEXT;
    public static final EditBubbleItem COVER_GUIDE;
    public static final EditBubbleItem COVER_IMPORT;
    public static final EditBubbleItem COVER_RATIO;
    public static final EditBubbleItem EDIT_AUTOMUSIC_TIP;
    public static final EditBubbleItem EDIT_PROGRESS_GUIDE;
    public static final EditBubbleItem FRAME_FULL_SCREEN;
    public static final EditBubbleItem KUAISHAN_SEGMENT;
    public static final EditBubbleItem MUSIC_CANCEL;
    public static final EditBubbleItem MUSIC_LIBRARY_ENTRANCE;
    public static final EditBubbleItem MUSIC_LOCAL_GUIDE;
    public static final EditBubbleItem MUSIC_POINT;
    public static final EditBubbleItem PHOTO_VISIBILITY;
    public static final EditBubbleItem PIC_TEMPLATE_V2;
    public static final EditBubbleItem POST_DIRECTLY;
    public static final EditBubbleItem RECOMMEND_MUSIC;
    public static final EditBubbleItem RELAY_PHOTO;
    public static final EditBubbleItem RELAY_PHOTO_NEW;
    public static final EditBubbleItem RELAY_STICKER_BUBBLE;
    public static final EditBubbleItem RELAY_VIDEO;
    public static final EditBubbleItem RELAY_VIDEO_NEW;
    public static final EditBubbleItem SEGMENT;
    public static final EditBubbleItem STICKER_PLC;
    public static final EditBubbleItem SUBTITLE;
    public static final EditBubbleItem SUBTITLE_EDIT;
    public static final EditBubbleItem USER_TIPS;
    public static final EditBubbleItem VIDEO_COVER_AUTO_CROP;
    public static final EditBubbleItem VIDEO_OPENING;
    public static final EditBubbleItem VISIBILITY_EXPIRATION;

    static {
       SharedPreferences a;
       EditBubbleItem uEditBubbleI = new EditBubbleItem("USER_TIPS", 0, 2, 0, "", null, "", "", Integer.MAX_VALUE, true, false, false);
       EditBubbleItem.USER_TIPS = v13;
       EditorItemFunc sTICKER_V2 = EditorItemFunc.STICKER_V2;
       int i = 0;
       boolean b = true;
       EditBubbleItem uEditBubbleI1 = new EditBubbleItem("RELAY_STICKER_BUBBLE", 1, 0, i, a1.p(0x7f1016e4), sTICKER_V2, "RELAY_STICKER_BUBBLE", "relay_sticker_bubble_edit", 1, b, true, true);
       EditBubbleItem.RELAY_STICKER_BUBBLE = uEditBubbleI;
       EditBubbleItem uEditBubbleI2 = new EditBubbleItem("EDIT_PROGRESS_GUIDE", 2, 2, 0, a1.p(0x7f100c4f), null, "", "edit_progress_guide", 1, true, true, false);
       EditBubbleItem.EDIT_PROGRESS_GUIDE = v2;
       uEditBubbleI1 = new EditBubbleItem("EDIT_AUTOMUSIC_TIP", 3, 2, i, "", null, "", "", Integer.MAX_VALUE, b, false, false);
       EditBubbleItem.EDIT_AUTOMUSIC_TIP = v3;
       String str = a1.p(R.string.arg_RES_7f103df0);
       if (PostExperimentUtils.w()) {
       }else {
          sTICKER_V2 = EditorItemFunc.DECORATION;
       }
       uEditBubbleI2 = new EditBubbleItem("STICKER_PLC", 4, 2, 0, str, sTICKER_V2, "sticker_plc_bubble", Integer.MAX_VALUE, true);
       EditBubbleItem.STICKER_PLC = v4;
       int i1 = 2;
       i = 0;
       EditorItemFunc cOVER_VIDEO = EditorItemFunc.COVER_VIDEO;
       boolean b1 = true;
       uEditBubbleI1 = new EditBubbleItem("VIDEO_COVER_AUTO_CROP", 5, i1, i, a1.p(0x7f103d3c), cOVER_VIDEO, "", Integer.MAX_VALUE, b1);
       EditBubbleItem.VIDEO_COVER_AUTO_CROP = sTICKER_V2;
       EditBubbleItem uEditBubbleI3 = new EditBubbleItem("FRAME_FULL_SCREEN", 6, 2, 0, a1.p(0x7f100cc9), EditorItemFunc.FRAME_V2, "frame_full_screen_tip", 1, true);
       EditBubbleItem.FRAME_FULL_SCREEN = v11;
       EditBubbleItem uEditBubbleI4 = new EditBubbleItem("COPY_TEXT_OLD_TEXT", 7, 2, 0, a1.p(0x7f103b79), EditorItemFunc.TEXT, "", "copy_text_bubble", 1, true, true, false);
       EditBubbleItem.COPY_TEXT_OLD_TEXT = v12;
       uEditBubbleI1 = new EditBubbleItem("COPY_TEXT_NEW_TEXT", 8, i1, i, a1.p(0x7f103b79), EditorItemFunc.TEXT_V2, "", "copy_text_bubble", b1, true, true, false);
       EditBubbleItem.COPY_TEXT_NEW_TEXT = uEditBubbleI2;
       EditBubbleItem uEditBubbleI5 = new EditBubbleItem("AE_TEXT", 9, 2, 0, a1.p(0x7f103d60), EditorItemFunc.TEXT_V3, "", "ae_text_bubble", 3, true, true, true);
       EditBubbleItem.AE_TEXT = uEditBubbleI1;
       int i2 = 10;
       int i3 = 2;
       int i4 = 0;
       String str1 = a1.p(R.string.arg_RES_7f101291);
       EditorItemFunc rELAY_PHOTO = EditorItemFunc.RELAY_PHOTO;
       boolean i5 = 2;
       boolean b2 = false;
       boolean b3 = true;
       boolean b4 = (a.t() > 0)? true: false;
       EditBubbleItem uEditBubbleI6 = new EditBubbleItem("RELAY_PHOTO_NEW", i2, i3, i4, str1, rELAY_PHOTO, "", "", i5, b4, false, false);
       EditBubbleItem.RELAY_PHOTO_NEW = v15;
       int i6 = 11;
       int i7 = 2;
       int i8 = 0;
       String str2 = a1.p(R.string.arg_RES_7f10128d);
       EditorItemFunc rELAY_VIDEO = EditorItemFunc.RELAY_VIDEO;
       boolean i9 = 2;
       boolean b5 = (a.u() > 0)? true: false;
       uEditBubbleI5 = new EditBubbleItem("RELAY_VIDEO_NEW", i6, i7, i8, str2, rELAY_VIDEO, "", "", i9, b5, false, false);
       EditBubbleItem.RELAY_VIDEO_NEW = v22;
       i2 = 12;
       i3 = 2;
       i4 = 0;
       str1 = a1.p(R.string.arg_RES_7f104b1c);
       EditorItemFunc sUBTITLE_V2 = EditorItemFunc.SUBTITLE_V2;
       int i10 = 1;
       i5 = (a.y0() > 0)? true: false;
       uEditBubbleI6 = new EditBubbleItem("AUTO_SUBTITLE", i2, i3, i4, str1, sUBTITLE_V2, "", i10, i5);
       EditBubbleItem.AUTO_SUBTITLE = b1;
       a = a.a;
       uEditBubbleI5 = new EditBubbleItem("SUBTITLE", 13, a1.p(0x7f104b2d), sUBTITLE_V2, a.getBoolean("edit_subtitle_new_bubble_show", b3));
       EditBubbleItem.SUBTITLE = uEditBubbleI3;
       i6 = 14;
       i7 = 2;
       i8 = 0;
       str2 = a1.p(R.string.arg_RES_7f100c8c);
       int i11 = 5;
       i9 = (a.y0() > 0)? true: false;
       uEditBubbleI5 = new EditBubbleItem("SUBTITLE_EDIT", i6, i7, i8, str2, sUBTITLE_V2, "", i11, i9);
       EditBubbleItem.SUBTITLE_EDIT = v25;
       EditBubbleItem uEditBubbleI7 = new EditBubbleItem("VISIBILITY_EXPIRATION", 15, a1.p(0x7f104cfb), "visibility_expiration", a.getBoolean("post_visibility_expiration_show_v2", b3));
       EditBubbleItem.VISIBILITY_EXPIRATION = v26;
       uEditBubbleI5 = new EditBubbleItem("POST_DIRECTLY", 16, a1.p(0x7f103d58), "post_directly", (a.getBoolean("is_directly_post_tip_shown", b2) ^ 0x01));
       EditBubbleItem.POST_DIRECTLY = v40;
       uEditBubbleI4 = new EditBubbleItem("PHOTO_VISIBILITY", 17, a1.p(0x7f100cd1), "photo_visibility", (a.getBoolean("edit_photo_visibility_bubble_showed", b2) ^ 0x01));
       EditBubbleItem.PHOTO_VISIBILITY = uEditBubbleI5;
       EditBubbleItem uEditBubbleI8 = new EditBubbleItem("PIC_TEMPLATE_V2", 18, a1.p(0x7f100b2a), EditorItemFunc.PIC_TEMPLATE_V2, true);
       EditBubbleItem.PIC_TEMPLATE_V2 = uEditBubbleI6;
       EditBubbleItem uEditBubbleI9 = new EditBubbleItem("SEGMENT", 19, a1.p(0x7f100c69), EditorItemFunc.SEGMENT, a.getBoolean("fragment_tip_show", b3));
       EditBubbleItem.SEGMENT = uEditBubbleI8;
       EditBubbleItem uEditBubbleI10 = new EditBubbleItem("KUAISHAN_SEGMENT", 20, a1.p(0x7f100b7f), EditorItemFunc.KUAISHAN_SEGMENT, a.getBoolean("kuaishan_segment_tip_show", b3));
       EditBubbleItem.KUAISHAN_SEGMENT = uEditBubbleI9;
       i = 21;
       String str3 = a1.p(R.string.arg_RES_7f103d70);
       boolean b6 = (a.t() > 0)? true: false;
       EditBubbleItem uEditBubbleI11 = new EditBubbleItem("RELAY_PHOTO", i, str3, rELAY_PHOTO, b6);
       EditBubbleItem.RELAY_PHOTO = uEditBubbleI10;
       i11 = 22;
       String str4 = a1.p(R.string.arg_RES_7f103d6f);
       boolean b7 = (a.u() > 0)? true: false;
       uEditBubbleI4 = new EditBubbleItem("RELAY_VIDEO", i11, str4, rELAY_VIDEO, b7);
       EditBubbleItem.RELAY_VIDEO = uEditBubbleI11;
       EditBubbleItem uEditBubbleI12 = v15;
       SharedPreferences sharedPrefer = a;
       EditBubbleItem uEditBubbleI13 = uEditBubbleI1;
       int b8 = false;
       EditBubbleItem uEditBubbleI14 = new EditBubbleItem("VIDEO_OPENING", 23, a1.p(0x7f103db9), cOVER_VIDEO, a.getBoolean("edit_opening_bubble_show", b3));
       EditBubbleItem.VIDEO_OPENING = i1;
       EditorItemFunc mUSIC_V2 = EditorItemFunc.MUSIC_V2;
       EditBubbleItem uEditBubbleI15 = new EditBubbleItem("AUTO_MUSIC_PICTURE", 24, 2, 0, "", mUSIC_V2, "", 1, (sharedPrefer.getBoolean("auto_select_music_bubble_showed", b8) ^ 0x01));
       EditBubbleItem.AUTO_MUSIC_PICTURE = uEditBubbleI14;
       int i12 = 25;
       int i13 = 2;
       int i14 = 0;
       int i15 = 3;
       EditBubbleItem obj = PatchProxy.apply(null, null, c.class, "6");
       String str5 = 3;
       if (obj != PatchProxyResult.class) {
          b3 = obj.booleanValue();
       }else if(a.B0() < str5){
          obj = 1;
       }else {
          obj = null;
       }
       boolean b9 = b3;
       EditBubbleItem uEditBubbleI16 = new EditBubbleItem("AUTO_MUSIC_VIDEO", i12, i13, i14, "", mUSIC_V2, "", i15, b9);
       EditBubbleItem.AUTO_MUSIC_VIDEO = a;
       EditBubbleItem uEditBubbleI17 = new EditBubbleItem("AUTO_MUSIC_SETTINGS", 26, 2, 0, a1.p(0x7f1002ff), null, "photo_visibility", "", 1, true, true, true);
       EditBubbleItem.AUTO_MUSIC_SETTINGS = b3;
       i12 = 27;
       i13 = 2;
       i14 = 0;
       String str6 = a1.p(R.string.arg_RES_7f10419f);
       i15 = 5;
       b8 = 5;
       b9 = (!sharedPrefer.getBoolean("edit_operation_music_bubble_clicked", b8) && a.s() < b8)? true: false;
       uEditBubbleI16 = new EditBubbleItem("RECOMMEND_MUSIC", i12, i13, i14, str6, mUSIC_V2, "", i15, b9);
       EditBubbleItem.RECOMMEND_MUSIC = cOVER_VIDEO;
       EditorItemFunc bEAT_SYNC = EditorItemFunc.BEAT_SYNC;
       EditBubbleItem uEditBubbleI18 = new EditBubbleItem("BEAT_SYNC_WITH_ICON", 28, "", bEAT_SYNC, true);
       EditBubbleItem.BEAT_SYNC_WITH_ICON = mUSIC_V2;
       uEditBubbleI4 = new EditBubbleItem("BEAT_SYNC_NO_ICON", 29, a1.p(0x7f100b48), bEAT_SYNC, true);
       EditBubbleItem.BEAT_SYNC_NO_ICON = uEditBubbleI18;
       i4 = 30;
       EditBubbleItem uEditBubbleI19 = mUSIC_V2;
       boolean b10 = (a.n() < 1)? true: false;
       uEditBubbleI15 = new EditBubbleItem("COVER_GUIDE", i4, "", "cover_guide", b10);
       EditBubbleItem.COVER_GUIDE = i8;
       uEditBubbleI16 = new EditBubbleItem("COVER_RATIO", 31, 2, 0, a1.p(0x7f101c75), null, "cover_ratio", "", Integer.MAX_VALUE, true, true, false);
       EditBubbleItem.COVER_RATIO = mUSIC_V2;
       uEditBubbleI15 = mUSIC_V2;
       EditBubbleItem uEditBubbleI20 = cOVER_VIDEO;
       uEditBubbleI4 = new EditBubbleItem("COVER_IMPORT", 32, a1.p(0x7f10164b), "cover_import", (sharedPrefer.getBoolean("video_import_cover_bubble_showed", false) ^ 0x01));
       EditBubbleItem.COVER_IMPORT = b8;
       uEditBubbleI16 = new EditBubbleItem("MUSIC_CANCEL", 33, a1.p(0x7f1004b7), "music_cancel", (a.C0() ^ 0x01));
       EditBubbleItem.MUSIC_CANCEL = mUSIC_V2;
       i15 = 34;
       b9 = 2;
       int i16 = 0;
       String str7 = a1.p(R.string.arg_RES_7f103718);
       EditorItemFunc uEditorItemF = null;
       boolean b11 = (TextUtils.isEmpty(a.n0()) || TextUtils.isEmpty(a.r()))? true: false;
       EditBubbleItem uEditBubbleI21 = new EditBubbleItem("MUSIC_LIBRARY_ENTRANCE", i15, b9, i16, str7, uEditorItemF, "music_library_entrance", "", 2, b11, true, true);
       EditBubbleItem.MUSIC_LIBRARY_ENTRANCE = cOVER_VIDEO;
       uEditBubbleI4 = new EditBubbleItem("MUSIC_LOCAL_GUIDE", 35, a1.p(0x7f102fd3), "music_local_guide", TextUtils.isEmpty(a.W()));
       EditBubbleItem.MUSIC_LOCAL_GUIDE = i4;
       uEditBubbleI4 = new EditBubbleItem("MUSIC_POINT", 36, a1.p(0x7f100b45), bEAT_SYNC, true);
       EditBubbleItem.MUSIC_POINT = str1;
       uEditBubbleI16 = new EditBubbleItem("AI_CUT_RECOMMEND", 37, a1.p(0x7f104c1c), "ai_cut_recommend", true);
       EditBubbleItem.AI_CUT_RECOMMEND = bEAT_SYNC;
       EditBubbleItem uEditBubbleI22 = bEAT_SYNC;
       uEditBubbleI4 = new EditBubbleItem("AI_CUT_ORIGIN", 38, a1.p(0x7f100159), "ai_cut_origin", sharedPrefer.getBoolean("ai_cut_origin_style_tip_show", true));
       EditBubbleItem.AI_CUT_ORIGIN = v47;
       uEditBubbleI16 = new EditBubbleItem("CLIP_ADD_SEGMENT", 39, 2, 0, a1.p(0x7f1005e0), null, "clip_add_segment", "clip_add_segment_button_guide", 1, true, true, false);
       EditBubbleItem.CLIP_ADD_SEGMENT = cOVER_VIDEO;
       EditBubbleItem[] uEditBubbleI23 = new EditBubbleItem[40];
       uEditBubbleI23[0] = v13;
       uEditBubbleI23[1] = uEditBubbleI;
       uEditBubbleI23[2] = v2;
       uEditBubbleI23[3] = v3;
       uEditBubbleI23[4] = v4;
       uEditBubbleI23[5] = sTICKER_V2;
       uEditBubbleI23[6] = v11;
       uEditBubbleI23[7] = v12;
       uEditBubbleI23[8] = uEditBubbleI2;
       uEditBubbleI23[9] = uEditBubbleI13;
       uEditBubbleI23[10] = uEditBubbleI12;
       uEditBubbleI23[11] = v22;
       uEditBubbleI23[12] = b1;
       uEditBubbleI23[13] = uEditBubbleI3;
       uEditBubbleI23[14] = v25;
       uEditBubbleI23[15] = v26;
       uEditBubbleI23[16] = v40;
       uEditBubbleI23[17] = uEditBubbleI5;
       uEditBubbleI23[18] = uEditBubbleI6;
       uEditBubbleI23[19] = uEditBubbleI8;
       uEditBubbleI23[20] = uEditBubbleI9;
       uEditBubbleI23[21] = uEditBubbleI10;
       uEditBubbleI23[22] = uEditBubbleI11;
       uEditBubbleI23[23] = i1;
       uEditBubbleI23[24] = uEditBubbleI14;
       uEditBubbleI23[25] = a;
       uEditBubbleI23[26] = b3;
       uEditBubbleI23[27] = uEditBubbleI20;
       uEditBubbleI23[28] = uEditBubbleI19;
       uEditBubbleI23[29] = uEditBubbleI18;
       uEditBubbleI23[30] = i8;
       uEditBubbleI23[31] = uEditBubbleI15;
       uEditBubbleI23[32] = b8;
       uEditBubbleI23[33] = mUSIC_V2;
       uEditBubbleI23[34] = cOVER_VIDEO;
       uEditBubbleI23[35] = i4;
       uEditBubbleI23[36] = str1;
       uEditBubbleI23[37] = uEditBubbleI22;
       uEditBubbleI23[38] = v47;
       uEditBubbleI23[39] = cOVER_VIDEO;
       EditBubbleItem.$VALUES = uEditBubbleI23;
    }
    public void EditBubbleItem(String p0,int p1,int p2,int p3,String p4,EditorItemFunc p5,String p6,int p7,boolean p8){
       super(p0, p1);
       this.mType = p2;
       this.mUpgradeVersion = p3;
       this.mContent = p4;
       this.mFunctionName = p5.name();
       this.mEditorItemFunc = p5;
       this.mBubbleKey = p6;
       this.mShowTimes = p7;
       this.mShouldShowOldState = p8;
       this.mBlockOther = true;
       this.mBlockedByOther = true;
       this.init();
    }
    public void EditBubbleItem(String p0,int p1,int p2,int p3,String p4,EditorItemFunc p5,String p6,String p7,int p8,boolean p9,boolean p10,boolean p11){
       super(p0, p1);
       this.mType = p2;
       this.mUpgradeVersion = p3;
       this.mContent = p4;
       this.mFunctionName = (p5 != null)? p5.name(): p6;
       this.mEditorItemFunc = p5;
       this.mBubbleKey = p7;
       this.mShowTimes = p8;
       this.mShouldShowOldState = p9;
       this.mBlockOther = p10;
       this.mBlockedByOther = p11;
       this.init();
       return;
    }
    public void EditBubbleItem(String p0,int p1,String p2,EditorItemFunc p3,boolean p4){
       super(p0, p1);
       this.mType = 0;
       this.mUpgradeVersion = 0;
       this.mContent = p2;
       this.mFunctionName = p3.name();
       this.mEditorItemFunc = p3;
       this.mBubbleKey = "";
       this.mShowTimes = 1;
       this.mShouldShowOldState = p4;
       this.mBlockOther = true;
       this.mBlockedByOther = true;
       this.init();
    }
    public void EditBubbleItem(String p0,int p1,String p2,String p3,boolean p4){
       super(p0, p1);
       this.mType = 0;
       this.mUpgradeVersion = 0;
       this.mContent = p2;
       this.mFunctionName = p3;
       this.mEditorItemFunc = null;
       this.mBubbleKey = "";
       this.mShowTimes = 1;
       this.mShouldShowOldState = p4;
       this.mBlockOther = true;
       this.mBlockedByOther = true;
       this.init();
    }
    public static EditBubbleItem valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditBubbleItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EditBubbleItem.class, p0);
    }
    public static EditBubbleItem[] values(){
       Object obj = PatchProxy.apply(null, null, EditBubbleItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EditBubbleItem.$VALUES.clone();
    }
    public boolean couldShow(){
       Object obj = PatchProxy.apply(null, this, EditBubbleItem.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.a(this) && this.mShouldShowOldState != null)? true: false;
       return b;
    }
    public String getBubbleKey(){
       Object obj = PatchProxy.apply(null, this, EditBubbleItem.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mBubbleKey)) {
          return b.b(this);
       }
       return this.mBubbleKey;
    }
    public int getBubbleShowTimes(){
       return this.mShowTimes;
    }
    public String getContent(){
       return this.mContent;
    }
    public EditorItemFunc getEditorItemFunc(){
       return this.mEditorItemFunc;
    }
    public String getFunctionName(){
       return this.mFunctionName;
    }
    public int getMode(){
       return b.f(this);
    }
    public int getPriority(){
       Object obj = PatchProxy.apply(null, this, EditBubbleItem.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.ordinal();
    }
    public int getType(){
       return this.mType;
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, EditBubbleItem.class, "3")) {
          return;
       }
       if (this.mShouldShowOldState == null) {
          e7.b(this.getBubbleKey(), this.getBubbleShowTimes());
       }
       return;
    }
    public boolean isAutoDismissWhenPageStop(){
       return b.h(this);
    }
    public boolean isBlockedAfterShowingSelf(){
       return this.mBlockOther;
    }
    public boolean isBlockedByOthersBeforeShowing(){
       return this.mBlockedByOther;
    }
    public EditBubbleItem setContent(String p0){
       this.mContent = p0;
       return this;
    }
    public int upgradeVersion(){
       return this.mUpgradeVersion;
    }
}
