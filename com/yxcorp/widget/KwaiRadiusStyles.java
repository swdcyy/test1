package com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KwaiRadiusStyles extends Enum implements c	// class@0009de
{
    public final float bottomLeftRadius;
    public final float bottomRightRadius;
    public final float radius;
    public final float topLeftRadius;
    public final float topRightRadius;
    public static final KwaiRadiusStyles[] $VALUES;
    public static final KwaiRadiusStyles BL12_BR12;
    public static final KwaiRadiusStyles BL16_BR16;
    public static final KwaiRadiusStyles BL2_BR2;
    public static final KwaiRadiusStyles BL4_BR4;
    public static final KwaiRadiusStyles BL8_BR8;
    public static final KwaiRadiusStyles FULL;
    public static final KwaiRadiusStyles FULL_LEFT;
    public static final KwaiRadiusStyles FULL_RIGHT;
    public static final KwaiRadiusStyles NULL;
    public static final KwaiRadiusStyles R12;
    public static final KwaiRadiusStyles R14;
    public static final KwaiRadiusStyles R16;
    public static final KwaiRadiusStyles R2;
    public static final KwaiRadiusStyles R3;
    public static final KwaiRadiusStyles R32;
    public static final KwaiRadiusStyles R4;
    public static final KwaiRadiusStyles R6;
    public static final KwaiRadiusStyles R8;
    public static final KwaiRadiusStyles TL12_TR12;
    public static final KwaiRadiusStyles TL16_BL16;
    public static final KwaiRadiusStyles TL16_TR16;
    public static final KwaiRadiusStyles TL4_BL4;
    public static final KwaiRadiusStyles TL4_BR4;
    public static final KwaiRadiusStyles TL4_TR4;
    public static final KwaiRadiusStyles TL8_BR6;
    public static final KwaiRadiusStyles TL8_TR8;
    public static final KwaiRadiusStyles TLF_TRF_BL1_BRF;
    public static final KwaiRadiusStyles TR4_BR4;

    static {
       KwaiRadiusStyles kwaiRadiusSt = new KwaiRadiusStyles("NULL", 0, 0, 0, 0, 0, 0);
       KwaiRadiusStyles.NULL = v8;
       KwaiRadiusStyles kwaiRadiusSt1 = new KwaiRadiusStyles("FULL", 1, 200.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.FULL = kwaiRadiusSt;
       KwaiRadiusStyles kwaiRadiusSt2 = new KwaiRadiusStyles("R2", 2, 2.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R2 = v1;
       kwaiRadiusSt1 = new KwaiRadiusStyles("R3", 3, 3.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R3 = v2;
       kwaiRadiusSt2 = new KwaiRadiusStyles("R4", 4, 4.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R4 = v3;
       kwaiRadiusSt1 = new KwaiRadiusStyles("R6", 5, 6.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R6 = v4;
       kwaiRadiusSt2 = new KwaiRadiusStyles("R8", 6, 8.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R8 = v5;
       kwaiRadiusSt1 = new KwaiRadiusStyles("R12", 7, 12.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R12 = v6;
       kwaiRadiusSt2 = new KwaiRadiusStyles("R14", 8, 14.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R14 = v7;
       kwaiRadiusSt1 = new KwaiRadiusStyles("R16", 9, 16.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R16 = kwaiRadiusSt2;
       KwaiRadiusStyles kwaiRadiusSt3 = new KwaiRadiusStyles("R32", 10, 32.00f, 0, 0, 0, 0);
       KwaiRadiusStyles.R32 = kwaiRadiusSt1;
       KwaiRadiusStyles kwaiRadiusSt4 = new KwaiRadiusStyles("FULL_LEFT", 11, 0, 300.00f, 0, 300.00f, 0);
       KwaiRadiusStyles.FULL_LEFT = v10;
       kwaiRadiusSt3 = new KwaiRadiusStyles("FULL_RIGHT", 12, 0, 0, 300.00f, 0, 300.00f);
       KwaiRadiusStyles.FULL_RIGHT = v11;
       kwaiRadiusSt4 = new KwaiRadiusStyles("BL2_BR2", 13, 0, 0, 0, 2.00f, 2.00f);
       KwaiRadiusStyles.BL2_BR2 = v12;
       kwaiRadiusSt3 = new KwaiRadiusStyles("BL4_BR4", 14, 0, 0, 0, 4.00f, 4.00f);
       KwaiRadiusStyles.BL4_BR4 = v13;
       kwaiRadiusSt4 = new KwaiRadiusStyles("TL4_BR4", 15, 0, 4.00f, 0, 0, 4.00f);
       KwaiRadiusStyles.TL4_BR4 = v14;
       kwaiRadiusSt3 = new KwaiRadiusStyles("TL8_TR8", 16, 0, 8.00f, 8.00f, 0, 0);
       KwaiRadiusStyles.TL8_TR8 = v15;
       kwaiRadiusSt4 = new KwaiRadiusStyles("TL4_TR4", 17, 0, 4.00f, 4.00f, 0, 0);
       KwaiRadiusStyles.TL4_TR4 = v16;
       kwaiRadiusSt3 = new KwaiRadiusStyles("TL4_BL4", 18, 0, 4.00f, 0, 4.00f, 0);
       KwaiRadiusStyles.TL4_BL4 = kwaiRadiusSt4;
       KwaiRadiusStyles kwaiRadiusSt5 = new KwaiRadiusStyles("TR4_BR4", 19, 0, 0, 4.00f, 0, 4.00f);
       KwaiRadiusStyles.TR4_BR4 = kwaiRadiusSt3;
       KwaiRadiusStyles kwaiRadiusSt6 = new KwaiRadiusStyles("TL8_BR6", 20, 0, 8.00f, 0, 0, 6.00f);
       KwaiRadiusStyles.TL8_BR6 = v19;
       kwaiRadiusSt5 = new KwaiRadiusStyles("BL8_BR8", 21, 0, 0, 0, 8.00f, 8.00f);
       KwaiRadiusStyles.BL8_BR8 = v20;
       kwaiRadiusSt6 = new KwaiRadiusStyles("TL16_TR16", 22, 0, 16.00f, 16.00f, 0, 0);
       KwaiRadiusStyles.TL16_TR16 = v21;
       kwaiRadiusSt5 = new KwaiRadiusStyles("TL16_BL16", 23, 0, 16.00f, 0, 16.00f, 0);
       KwaiRadiusStyles.TL16_BL16 = v22;
       kwaiRadiusSt6 = new KwaiRadiusStyles("BL16_BR16", 24, 0, 0, 0, 16.00f, 16.00f);
       KwaiRadiusStyles.BL16_BR16 = v23;
       kwaiRadiusSt5 = new KwaiRadiusStyles("TL12_TR12", 25, 0, 12.00f, 12.00f, 0, 0);
       KwaiRadiusStyles.TL12_TR12 = v24;
       kwaiRadiusSt6 = new KwaiRadiusStyles("BL12_BR12", 26, 0, 0, 0, 12.00f, 12.00f);
       KwaiRadiusStyles.BL12_BR12 = v25;
       kwaiRadiusSt5 = new KwaiRadiusStyles("TLF_TRF_BL1_BRF", 27, 0, 300.00f, 300.00f, 0x3f800000, 300.00f);
       KwaiRadiusStyles.TLF_TRF_BL1_BRF = kwaiRadiusSt6;
       kwaiRadiusSt5 = v15;
       KwaiRadiusStyles[] kwaiRadiusSt7 = new KwaiRadiusStyles[28];
       kwaiRadiusSt7[0] = v8;
       kwaiRadiusSt7[1] = kwaiRadiusSt;
       kwaiRadiusSt7[2] = v1;
       kwaiRadiusSt7[3] = v2;
       kwaiRadiusSt7[4] = v3;
       kwaiRadiusSt7[5] = v4;
       kwaiRadiusSt7[6] = v5;
       kwaiRadiusSt7[7] = v6;
       kwaiRadiusSt7[8] = v7;
       kwaiRadiusSt7[9] = kwaiRadiusSt2;
       kwaiRadiusSt7[10] = kwaiRadiusSt1;
       kwaiRadiusSt7[11] = v10;
       kwaiRadiusSt7[12] = v11;
       kwaiRadiusSt7[13] = v12;
       kwaiRadiusSt7[14] = v13;
       kwaiRadiusSt7[15] = v14;
       kwaiRadiusSt7[16] = kwaiRadiusSt5;
       kwaiRadiusSt7[17] = v16;
       kwaiRadiusSt7[18] = kwaiRadiusSt4;
       kwaiRadiusSt7[19] = kwaiRadiusSt3;
       kwaiRadiusSt7[20] = v19;
       kwaiRadiusSt7[21] = v20;
       kwaiRadiusSt7[22] = v21;
       kwaiRadiusSt7[23] = v22;
       kwaiRadiusSt7[24] = v23;
       kwaiRadiusSt7[25] = v24;
       kwaiRadiusSt7[26] = v25;
       kwaiRadiusSt7[27] = kwaiRadiusSt6;
       KwaiRadiusStyles.$VALUES = kwaiRadiusSt7;
    }
    public void KwaiRadiusStyles(String p0,int p1,float p2,float p3,float p4,float p5,float p6){
       super(p0, p1);
       this.radius = p2;
       this.topLeftRadius = p3;
       this.topRightRadius = p4;
       this.bottomLeftRadius = p5;
       this.bottomRightRadius = p6;
    }
    public static KwaiRadiusStyles valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KwaiRadiusStyles.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KwaiRadiusStyles.class, p0);
    }
    public static KwaiRadiusStyles[] values(){
       Object obj = PatchProxy.apply(null, null, KwaiRadiusStyles.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiRadiusStyles.$VALUES.clone();
    }
    public float getBottomLeftRadius(){
       return this.bottomLeftRadius;
    }
    public float getBottomRightRadius(){
       return this.bottomRightRadius;
    }
    public float getRadius(){
       return this.radius;
    }
    public float getTopLeftRadius(){
       return this.topLeftRadius;
    }
    public float getTopRightRadius(){
       return this.topRightRadius;
    }
}
