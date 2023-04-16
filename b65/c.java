package b65.c;
import java.lang.StringBuilder;
import android.os.Build;
import java.lang.String;
import java.lang.Object;
import n65.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Arrays;
import java.lang.Boolean;

public class c	// class@000348
{
    public static final String a;
    public static Boolean b;
    public static k c;

    static {
       c.a = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
       c.b = null;
       c.c = null;
    }
    public void c(){
       super();
    }
    public static k a(){
       String[] obj = PatchProxy.apply(null, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.c == null) {
          c.c = new k(540, 960);
          if (Build$VERSION.SDK_INT >= 27) {
             obj = new String[]{"OUKI\(OKP6\)","Meizu\(M6\)","OPPO\(OPPO A57T\)","HUAWEI\(DUB-AL00a\)","Huawei\(ALE-TL00\)","VETAS\(V5 PRO\)","samsung\(SM-G965F\)","vivo\(vivo 1901\)","Hoswn\(P40\)","READBOY\(Readboy_G35S\)","GiONEE\(M5L\)","Xiaomi\(HM NOTE 1S\)","360\(1515-A01\)","Changhong\(P01\)","OPPO\(OPPO A59t\)","HUAWEI\(KNT-AL20\)","HUAWEI\(ALE-TL00\)","HUAWEI\(HUAWEI RIO-CL00\)","CMDC\(M850A\)","samsung\(SM-T810\)","P5M2_X23\(P5M2_X23\)","VOGA\(VOGA 55909\)","LeMobile\(LEX720\)","Xiaomi\(2014812\)","samsung\(SM-G965f\)","YOUXUEPAI\(U17\)","samsung\(SM-J415GN\)","vivo\(vivo Y71A\)","OPPO\(PBDM00\)","vivo\(V1818CT\)","HUAWEI\(H60-L11\)","xiaomi\(hm note 1s\)","alps\(SM-W2018\)","BAC-AL00\(nova 2 Plus\)","nubia\(NX612J\)","conquest\(conquest-S12\)","TCL\(TCL V760\)","samsung\(sm-g965f\)","youxuepai\(U17\)","Lenovo\(K350t\)","ZTE\(ZTE V1000\)","MEIIGOO\(N360.\)","meizu\(m1 note\)","NOAIN\(NOAIN K16\)","Hisense\(Hisense A2\)","PROTRULY\(PROTRULY D8\)","meizu\(M5c\)","HUAWEI\(FRD-DL00\)","ZTE\(ZTE BA601N\)","T106\(T106\)","UOOGOU\(L3\)","Meizu\(m1 note\)","ZTE\(ZTE A0620\)","ZTE\(ZTE C880S\)","vivo\(PD1818C-VGA-A\)","Philips\(Philips_V787\)","Coolpad\(Coolpad Y803-8\)","CLASSONE\(DSL C3\)","DOOV\(DOOV M2\)","samsung\(SM-T705C\)","SAF\(Philips S626L\)","SOP\(SOP-S8\)","CLASSONE\(DSL C1\)","Sony\(F8332\)","OPPO\(OPPO A57t\)","UNNO\(UNNO E5\)","vivo\(vivo Y928\)","4G+\(V18\)","samsung\(SM-N920L\)","F81_X20\(F81_X20\)","HUAWEI\(HMA-L29\)","Xiaomi\(MI 5s\)"};
             if (!Arrays.asList(obj).contains(c.a)) {
                c.c = new k(720, 1280);
             }
          }
       }
       return c.c;
    }
    public static boolean b(){
       String[] obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (c.b == null) {
          obj = new String[]{"HUAWEI\(HUAWEI HN3-U01\)","HUAWEI\(HUAWEI MT1-U06\)","HUAWEI\(HUAWEI P6-C00\)","HUAWEI\(HUAWEI P6-T00\)","HUAWEI\(HUAWEI P6-U06\)","HTC\(HTC Desire 526G dual sim\)","LENOVO\(Lenovo TAB 2 A7-30HC\)","HUAWEI\(HUAWEI TIT-U02\)","ZTE\(ZTE Blade L370\)","LENOVO\(Lenovo A536\)","Micromax\(Micromax Q340\)","Nomi\(Nomi i504\)","alps\(LG-X210\)","LENOVO\(Lenovo A5000\)","BQ\(BQS_5505\)","Texet\(TM-5005\)","ZTE\(ZTE BLADE L0510\)","Sony\(G3123\)","LGE\(LG-D680\)","Meizu\(M1 E\)","HUAWEI\(LLD-AL10\)","HUAWEI\(FLA-TL10\)","HUAWEI\(BND-AL10\)","OPPO\(PADM00\)","OPPO\(R7Plus\)","OPPO\(OPPO R7 Plus\)","Xiaomi\(Redmi Note 2\)","Xiaomi\(Redmi Note 3\)","Letv\(Letv X500\)","Letv\(Letv X501\)","Letv\(x600\)","Letv\(X608\)","Meizu\(m1 metal\)","Meizu\(MX5\)","HUAWEI\(CAM-TL00\)","HUAWEI\(CAM-TL00H\)","HUAWEI\(CAM-AL00\)","HUAWEI\(BLL-L22\)","HUAWEI\(ALE-UL00\)","HUAWEI\(CAM-UL00\)","HUAWEI\(BND-AL00\)","HUAWEI\(HUAWEI P8max\)","OPPO\(OPPO A59s\)","OPPO\(OPPO R9m\)","HUAWEI\(ANE-AL00\)","Meizu\(m2 note\)","HUAWEI\(CUN-TL00\)","HUAWEI\(PLK-AL10\)","Xiaomi\(MI 5C\)","HUAWEI\(HUAWEI TAG-TL00\)","OPPO\(OPPO R9t\)","GIONEE\(GN8003\)","Meizu\(M621C\)","GIONEE\(GN9012\)","HUAWEI\(LON-AL00\)","Meitu\(MP1503\)","GIONEE\(GN5003\)","GIONEE\(GN5005\)","HUAWEI\(JMM-AL10\)","HUAWEI\(BAC-TL00\)","GIONEE\(GIONEE M7L\)","OPPO\(OPPO A79k\)","Meizu\(M3 Max\)","OPPO\(OPPO A79\)","HUAWEI\(VIE-AL10\)","Meitu\(MP1602\)","Meitu\(MP1603\)","GiONEE\(GN5001S\)","HUAWEI\(COR-AL10\)","HUAWEI\(EML-AL00\)","HUAWEI\(BLA-AL00\)","HUAWEI\(STF-AL10\)","HUAWEI\(MHA-AL00\)","GIONEE\(GIONEE S10\)","GIONEE\(GN8002S\)","HUAWEI\(PIC-AL00\)","HUAWEI\(ALP-AL00\)","OPPO\(OPPO A83t\)","HUAWEI\(FIG-AL00\)","OPPO\(OPPO R9tm\)","HUAWEI\(FIG-TL10\)","vivo\(vivo X6Plus L\)","HUAWEI\(NEM-AL10\)","vivo\(vivo Y35\)","HUAWEI\(FRD-AL00\)","HUAWEI\(EDI-AL10\)","GIONEE\(GIONEE S10B\)","HUAWEI\(BLN-AL20\)","GIONEE\(GIONEE M7\)","HUAWEI\(LLD-AL30\)","GIONEE\(GIONEE S10L\)","HUAWEI\(PRA-AL00\)","HUAWEI\(BLN-AL10\)","Meitu\(MP1512\)"
    ,"vivo\(vivo Y67\)","nubia\(NX573J\)","HUAWEI\(HUAWEI TAG-AL00\)","HUAWEI\(CLT-AL01\)","HUAWEI\(BKL-AL20\)","GIONEE\(GIONEE S11\)","OPPO\(OPPO R7st\)","HUAWEI\(PLK-TL01H\)","koobee\(koobee H9\)","GIONEE\(S9L\)","Meizu\(m1 note\)","GIONEE\(GN8003L\)","OPPO\(6607\)","OPPO\(OPPO R7s\)","Meizu\(MEIZU M6\)","Meizu\(PRO 7-S\)","Meitu\(MP1709\)","Meitu\(MP1611\)","HUAWEI\(WAS-TL10\)","GIONEE\(F5\)","Meizu\(M3X\)","koobee\(koobee F1\)","HUAWEI\(EVA-TL00\)","Meizu\(U20\)","GIONEE\(GN9011\)","Meizu\(PRO 6\)","HUAWEI\(JMM-TL10\)","Meizu\(PRO 6s\)","GIONEE\(GN5005L\)","HUAWEI\(BTV-DL09\)","360\(1505-A01\)","HUAWEI\(NEM-TL00\)","HUAWEI\(COL-TL10\)","HUAWEI\(EVA-DL00\)","nubia\(NX541J\)","LeMobile\(LEX626\)","HUAWEI\(PIC-TL00\)","OPPO\(OPPO A79t\)","HUAWEI\(PRA-AL00\)","HUAWEI\(ALE-TL00\)","HUAWEI\(CLT-AL00\)","HUAWEI\(FIG-AL10\)","HUAWEI\(PAR-AL00\)","HUAWEI\(PRA-AL00X\)","OPPO\(OPPO A59st\)","OPPO\(OPPO A73\)","OPPO\(OPPO A37t\)","OPPO\(OPPO A83\)","360\(1701-M01\)","Blephone\(lephone T7+\)","Blephone\(lephone T9+\)","HUAWEI\(CHM-TL00H\)","HUAWEI\(ANE-TL00\)","HUAWEI\(BAC-AL00\)","HUAWEI\(BLN-TL10\)","HUAWEI\(KNT-AL20\)","HUAWEI\(STF-AL00\)","LeMobile\(LEX651\)","Letv\(Letv X502\)","Meizu\(MX4\)","OPPO\(OPPO A73t\)","OPPO\(OPPO A79kt\)","OPPO\(OPPO A83\)","OPPO\(OPPO R11s\)","SPRD\(VOTO GT18\)","Xiaomi\(Redmi 4\)","Meizu\(M355\)","OPPO\(OPPO R11\)","vivo\(vivo X9\)","OPPO\(PACM00\)","OPPO\(OPPO R7\)","vivo\(vivo Y51A\)","OPPO\(OPPO A37m\)","Xiaomi\(Redmi 4A\)"};
          c.b = Boolean.valueOf(Arrays.asList(obj).contains(c.a));
       }
       return c.b.booleanValue();
    }
}
