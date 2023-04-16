package com.kuaishou.android.security.features.drm.utils.b$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class b$b extends Enum	// class@000f38
{
    public final int a;
    public static final b$b b;
    public static final b$b c;
    public static final b$b d;
    public static final b$b e;
    public static final b$b f;
    public static final b$b g;
    public static final b$b h;
    public static final b$b i;
    public static final b$b j;
    public static final b$b k;
    public static final b$b l;
    public static final b$b m;
    public static final b$b n;
    public static final b$b o;
    public static final b$b p;
    public static final b$b q;
    public static final b$b r;
    public static final b$b s;
    public static final b$b t;
    public static final b$b u;
    public static final b$b v;
    public static final b$b[] w;

    static {
       b$b uob = new b$b("ERROR_SERVER_NO_RESPONSE", 0, 0x1315411);
       b$b.b = uob;
       b$b uob1 = new b$b("ERROR_REQUEST_FAIL", 1, 0x1315412);
       b$b.c = uob1;
       b$b uob2 = new b$b("ERROR_SERVER_UNKNOWN", 2, 0x1315413);
       b$b.d = uob2;
       b$b uob3 = new b$b("ERROR_SERVER_MISSING_PARAMETER", 3, 0x1315414);
       b$b.e = uob3;
       b$b uob4 = new b$b("ERROR_SERVER_INVALID_PARAMETER", 4, 0x1315415);
       b$b.f = uob4;
       b$b uob5 = new b$b("ERROR_SERVER_TOKEN_EXPIRED", 5, 0x1315416);
       b$b.g = uob5;
       b$b uob6 = new b$b("ERROR_SERVER_SIGNATURE_NOT_MATCH", 6, 0x1315417);
       b$b.h = uob6;
       b$b uob7 = new b$b("ERROR_SERVER_TOKEN_INVALID", 7, 0x1315418);
       b$b.i = uob7;
       b$b uob8 = new b$b("ERROR_NETWORK_UNKNOWN", 8, 0x1315419);
       b$b.j = uob8;
       b$b uob9 = new b$b("ERROR_NETWORK_UNSUPPORTED", 9, 0x131541a);
       b$b.k = uob9;
       b$b uob10 = new b$b("ERROR_NETWORK_RESOLVE", 10, 0x131541b);
       b$b.l = uob10;
       b$b uob11 = new b$b("ERROR_NETWORK_CONNECT_TIMEOUT", 11, 0x131541c);
       b$b.m = uob11;
       b$b uob12 = new b$b("ERROR_NETWORK_COULD_NOT_CONNECT", 12, 0x131541d);
       b$b.n = uob12;
       b$b uob13 = uob12;
       b$b uob14 = new b$b("ERROR_NETWORK_HTTP_403", 13, 0x131541e);
       b$b.o = uob14;
       b$b uob15 = uob14;
       uob12 = new b$b("ERROR_NETWORK_HTTP_404", 14, 0x131541f);
       b$b.p = uob12;
       b$b uob16 = uob12;
       uob14 = new b$b("ERROR_NETWORK_HTTP_4XX", 15, 0x1315420);
       b$b.q = uob14;
       b$b uob17 = uob14;
       uob12 = new b$b("ERROR_NETWORK_HTTP_5XX", 16, 0x1315421);
       b$b.r = uob12;
       b$b uob18 = uob12;
       uob14 = new b$b("ERROR_KSDRM_UNKNOWN", 17, 0x1315be1);
       b$b.s = uob14;
       b$b uob19 = uob14;
       uob12 = new b$b("ERROR_KSDRM_EXTRADECTYPE_UNIMPLEMENTED", 18, 0x1315be2);
       b$b.t = uob12;
       b$b uob20 = uob12;
       uob14 = new b$b("ERROR_KSDRM_TOKEN_KEY_NOTFOUND", 19, 0x1315be3);
       b$b.u = uob14;
       b$b uob21 = uob14;
       uob12 = new b$b("ERROR_KSDRM_DECRYPT_ERROR", 20, 0x1315be4);
       b$b.v = uob12;
       b$b[] uobArray = new b$b[21];
       uobArray[0] = uob;
       uobArray[1] = uob1;
       uobArray[2] = uob2;
       uobArray[3] = uob3;
       uobArray[4] = uob4;
       uobArray[5] = uob5;
       uobArray[6] = uob6;
       uobArray[7] = uob7;
       uobArray[8] = uob8;
       uobArray[9] = uob9;
       uobArray[10] = uob10;
       uobArray[11] = uob11;
       uobArray[12] = uob13;
       uobArray[13] = uob15;
       uobArray[14] = uob16;
       uobArray[15] = uob17;
       uobArray[16] = uob18;
       uobArray[17] = uob19;
       uobArray[18] = uob20;
       uobArray[19] = uob21;
       uobArray[20] = uob12;
       b$b.w = uobArray;
    }
    public void b$b(String p0,int p1,int p2){
       this.a = p2;
    }
    public static b$b a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(b$b.class, p0);
    }
    public static b$b[] values(){
       Object obj = PatchProxy.apply(null, null, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$b.w.clone();
    }
    public int a(){
       return this.a;
    }
}
