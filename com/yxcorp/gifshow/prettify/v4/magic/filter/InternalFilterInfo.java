package com.yxcorp.gifshow.prettify.v4.magic.filter.InternalFilterInfo;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InternalFilterInfo extends Enum	// class@0011a8
{
    public final int mFeatureId;
    public final int mId;
    public static final InternalFilterInfo[] $VALUES;
    public static final InternalFilterInfo filter_bailu;
    public static final InternalFilterInfo filter_enhance_color;
    public static final InternalFilterInfo filter_heibai;
    public static final InternalFilterInfo filter_langmu;
    public static final InternalFilterInfo filter_meiwei;
    public static final InternalFilterInfo filter_memory;
    public static final InternalFilterInfo filter_none;
    public static final InternalFilterInfo filter_pudding;
    public static final InternalFilterInfo filter_qiaokeli;
    public static final InternalFilterInfo filter_qingche;
    public static final InternalFilterInfo filter_qinliang;
    public static final InternalFilterInfo filter_shaonv;
    public static final InternalFilterInfo filter_shengdai;
    public static final InternalFilterInfo filter_shuiguang;
    public static final InternalFilterInfo filter_simuxue;
    public static final InternalFilterInfo filter_sunny;
    public static final InternalFilterInfo filter_taozi;
    public static final InternalFilterInfo filter_time;
    public static final InternalFilterInfo filter_weiguang;
    public static final InternalFilterInfo filter_yinhua;
    public static final InternalFilterInfo filter_yintao;
    public static final InternalFilterInfo filter_yummy;

    static {
       InternalFilterInfo internalFilt = new InternalFilterInfo("filter_none", 0, -1, 0);
       InternalFilterInfo.filter_none = internalFilt;
       InternalFilterInfo internalFilt1 = new InternalFilterInfo("filter_enhance_color", 1, -4, 0x2afa);
       InternalFilterInfo.filter_enhance_color = internalFilt1;
       InternalFilterInfo internalFilt2 = new InternalFilterInfo("filter_shaonv", 2, 2, 0x2ee3);
       InternalFilterInfo.filter_shaonv = internalFilt2;
       InternalFilterInfo internalFilt3 = new InternalFilterInfo("filter_sunny", 3, 22, 0x2ef7);
       InternalFilterInfo.filter_sunny = internalFilt3;
       InternalFilterInfo internalFilt4 = new InternalFilterInfo("filter_bailu", 4, 11, 0x2eec);
       InternalFilterInfo.filter_bailu = internalFilt4;
       InternalFilterInfo internalFilt5 = new InternalFilterInfo("filter_heibai", 5, 28, 0x2efe);
       InternalFilterInfo.filter_heibai = internalFilt5;
       InternalFilterInfo internalFilt6 = new InternalFilterInfo("filter_yummy", 6, 20, 0x2ef5);
       InternalFilterInfo.filter_yummy = internalFilt6;
       InternalFilterInfo internalFilt7 = new InternalFilterInfo("filter_memory", 7, 26, 0x2efb);
       InternalFilterInfo.filter_memory = internalFilt7;
       InternalFilterInfo internalFilt8 = new InternalFilterInfo("filter_qiaokeli", 8, 10, 0x2eeb);
       InternalFilterInfo.filter_qiaokeli = internalFilt8;
       InternalFilterInfo internalFilt9 = new InternalFilterInfo("filter_pudding", 9, 17, 0x2ef2);
       InternalFilterInfo.filter_pudding = internalFilt9;
       InternalFilterInfo internalFilt10 = new InternalFilterInfo("filter_yinhua", 10, 8, 0x2eef);
       InternalFilterInfo.filter_yinhua = internalFilt10;
       InternalFilterInfo internalFilt11 = new InternalFilterInfo("filter_time", 11, 30, 0x2efd);
       InternalFilterInfo.filter_time = internalFilt11;
       InternalFilterInfo internalFilt12 = internalFilt11;
       InternalFilterInfo internalFilt13 = new InternalFilterInfo("filter_qingche", 12, 0, 0x2f04);
       InternalFilterInfo.filter_qingche = internalFilt13;
       InternalFilterInfo internalFilt14 = internalFilt13;
       InternalFilterInfo internalFilt15 = new InternalFilterInfo("filter_shengdai", 13, 29, 0x2eff);
       InternalFilterInfo.filter_shengdai = internalFilt15;
       InternalFilterInfo internalFilt16 = internalFilt15;
       internalFilt13 = new InternalFilterInfo("filter_shuiguang", 14, 4, 0x2ee5);
       InternalFilterInfo.filter_shuiguang = internalFilt13;
       InternalFilterInfo internalFilt17 = internalFilt13;
       internalFilt15 = new InternalFilterInfo("filter_weiguang", 15, 25, 0x2ee7);
       InternalFilterInfo.filter_weiguang = internalFilt15;
       InternalFilterInfo internalFilt18 = internalFilt15;
       internalFilt13 = new InternalFilterInfo("filter_simuxue", 16, 18, 0x2ef3);
       InternalFilterInfo.filter_simuxue = internalFilt13;
       InternalFilterInfo internalFilt19 = internalFilt13;
       internalFilt15 = new InternalFilterInfo("filter_yintao", 17, 19, 0x2ef4);
       InternalFilterInfo.filter_yintao = internalFilt15;
       InternalFilterInfo internalFilt20 = internalFilt15;
       internalFilt13 = new InternalFilterInfo("filter_qinliang", 18, 23, 0x2ef8);
       InternalFilterInfo.filter_qinliang = internalFilt13;
       InternalFilterInfo internalFilt21 = internalFilt13;
       internalFilt15 = new InternalFilterInfo("filter_taozi", 19, 31, 0x2f00);
       InternalFilterInfo.filter_taozi = internalFilt15;
       internalFilt13 = new InternalFilterInfo("filter_meiwei", 20, 20, 0x2ef5);
       InternalFilterInfo.filter_meiwei = internalFilt13;
       InternalFilterInfo internalFilt22 = internalFilt13;
       internalFilt11 = new InternalFilterInfo("filter_langmu", 21, 21, 0x2ef6);
       InternalFilterInfo.filter_langmu = internalFilt11;
       InternalFilterInfo[] internalFilt23 = new InternalFilterInfo[22];
       internalFilt23[0] = internalFilt;
       internalFilt23[1] = internalFilt1;
       internalFilt23[2] = internalFilt2;
       internalFilt23[3] = internalFilt3;
       internalFilt23[4] = internalFilt4;
       internalFilt23[5] = internalFilt5;
       internalFilt23[6] = internalFilt6;
       internalFilt23[7] = internalFilt7;
       internalFilt23[8] = internalFilt8;
       internalFilt23[9] = internalFilt9;
       internalFilt23[10] = internalFilt10;
       internalFilt23[11] = internalFilt12;
       internalFilt23[12] = internalFilt14;
       internalFilt23[13] = internalFilt16;
       internalFilt23[14] = internalFilt17;
       internalFilt23[15] = internalFilt18;
       internalFilt23[16] = internalFilt19;
       internalFilt23[17] = internalFilt20;
       internalFilt23[18] = internalFilt21;
       internalFilt23[19] = internalFilt15;
       internalFilt23[20] = internalFilt22;
       internalFilt23[21] = internalFilt11;
       InternalFilterInfo.$VALUES = internalFilt23;
    }
    public void InternalFilterInfo(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.mId = p2;
       this.mFeatureId = p3;
    }
    public static InternalFilterInfo valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InternalFilterInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(InternalFilterInfo.class, p0);
    }
    public static InternalFilterInfo[] values(){
       Object obj = PatchProxy.apply(null, null, InternalFilterInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return InternalFilterInfo.$VALUES.clone();
    }
}
