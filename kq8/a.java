package kq8.a;
import cq8.d;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import cq8.b;
import iq8.r;
import pz.i;
import pz.b0;
import pz.q;
import pz.c0;
import pz.a0;
import g00.c;
import pz.b;
import pz.z;
import pz.d;
import pz.e;
import pz.o;
import pz.u;
import rz.a;
import pz.l;
import pz.t;
import pz.x;
import pz.k;
import pz.w;
import pz.r;
import g00.d;
import pz.y;
import pz.s;
import qz.b;
import pz.p;
import pz.v;
import qz.a;
import pz.j;

public class a implements d	// class@002c0e
{
    public final ConcurrentHashMap a;
    public static final String[] b;

    static {
       String[] stringArray = new String[]{"TKAndroid_ListView","KwaiPlayer","TKAdVideo","AdTkScratchView","KwaiLoadingView","KSRTXRequest","KwaiLiveIconView","AdTkShineView","SearchEntryBarView","TKAndroid_WaterListView","KwaiLivePlayer","TKSearchScoreView","TKAndroid_RefreshControl","RTXBridgeCenter","SearchEntryIconView","SearchKwaiPlayer","TKSearchTicketTagView","TKLiveAutoPlayView","TKADAnimator","TKSearchScrollView","SearchTKLivePlayer","TKPostBubbleRoundViewContainer","TKMeasuredView","TKFlareButton","TKPostBubbleTitles","TKAttributedTagText","TKSearchScrollSelectedTextView"};
       a.b = stringArray;
    }
    public void a(){
       super();
       this.a = new ConcurrentHashMap(37);
    }
    public ConcurrentHashMap a(){
       return this.a;
    }
    public String[] b(){
       return a.b;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x8544e468:
             if (p0.equals("SearchEntryIconView")) {
                i = 0;
             }
             break;
           case 0x8ec5389e:
             if (p0.equals("KwaiLiveIconView")) {
                i = 1;
             }
             break;
           case 0x9946266b:
             if (p0.equals("TKLiveAutoPlayView")) {
                i = 2;
             }
             break;
           case 0xa2e88cea:
             if (p0.equals("TKAndroid_ListView")) {
                i = 3;
             }
             break;
           case 0xac21c4c1:
             if (p0.equals("KwaiLivePlayer")) {
                i = 4;
             }
             break;
           case 0xad751bc8:
             if (p0.equals("TKAttributedTagText")) {
                i = 5;
             }
             break;
           case 0xb526ae1e:
             if (p0.equals("TKPostBubbleTitles")) {
                i = 6;
             }
             break;
           case 0xc71b06c1:
             if (p0.equals("KSRTXRequest")) {
                i = 7;
             }
             break;
           case 0xf0d31273:
             if (p0.equals("TKAndroid_WaterListView")) {
                i = 8;
             }
             break;
           case 0xf0d746a2:
             if (p0.equals("TKMeasuredView")) {
                i = 9;
             }
             break;
           case 0xf2914a7d:
             if (p0.equals("SearchKwaiPlayer")) {
                i = 10;
             }
             break;
           case 0xa8568f1:
             if (p0.equals("TKPostBubbleRoundViewContainer")) {
                i = 11;
             }
             break;
           case 0xfdeada9:
             if (p0.equals("TKFlareButton")) {
                i = 12;
             }
             break;
           case 0x12b83a8c:
             if (p0.equals("SearchTKLivePlayer")) {
                i = 13;
             }
             break;
           case 0x1ab792b5:
             if (p0.equals("KwaiPlayer")) {
                i = 14;
             }
             break;
           case 0x2e7b5ead:
             if (p0.equals("KwaiLoadingView")) {
                i = 15;
             }
             break;
           case 0x33735fa1:
             if (p0.equals("TKAdVideo")) {
                i = 16;
             }
             break;
           case 0x3febbdb6:
             if (p0.equals("AdTkShineView")) {
                i = 17;
             }
             break;
           case 0x4e13fa45:
             if (p0.equals("AdTkScratchView")) {
                i = 18;
             }
             break;
           case 0x617d7c18:
             if (p0.equals("TKSearchScoreView")) {
                i = 19;
             }
             break;
           case 0x629265e1:
             if (p0.equals("TKADAnimator")) {
                i = 20;
             }
             break;
           case 0x6b1d92b4:
             if (p0.equals("RTXBridgeCenter")) {
                i = 21;
             }
             break;
           case 0x70464bf9:
             if (p0.equals("TKSearchScrollSelectedTextView")) {
                i = 22;
             }
             break;
           case 0x719857f4:
             if (p0.equals("TKSearchTicketTagView")) {
                i = 23;
             }
             break;
           case 0x72a17949:
             if (p0.equals("TKAndroid_RefreshControl")) {
                i = 24;
             }
             break;
           case 0x74423771:
             if (p0.equals("TKSearchScrollView")) {
                i = 25;
             }
             break;
           case 0x75f0ae6e:
             if (p0.equals("SearchEntryBarView")) {
                i = 26;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 16:
           case 17:
           case 18:
           case 19:
           case 20:
           case 21:
           case 22:
           case 23:
           case 24:
           case 25:
           case 26:
           case 1:
           default:
             return false;
       }
       return true;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.a.clear();
       return;
    }
    public b init(String p0){
       String str9;
       int i;
       b str83;
       d str86;
       Object obj = p0;
       String obj1 = PatchProxy.applyOneRefs(obj, this, a.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       Objects.requireNonNull(p0);
       obj1 = "TKMeasuredView";
       String str = "TKAndroid_WaterListView";
       String str1 = "KSRTXRequest";
       String str2 = "TKPostBubbleTitles";
       String str3 = "TKAttributedTagText";
       String str4 = "KwaiLivePlayer";
       String str5 = "TKAndroid_ListView";
       String str6 = "TKLiveAutoPlayView";
       String str7 = "KwaiLiveIconView";
       String a str8 = "SearchEntryIconView";
       switch (p0.hashCode()){
           case 0x8544e468:
             str9 = str7;
             if (!obj.equals(str8)) {
             label_005b :
                i = -1;
             }else {
                i = 0;
             }
             break;
           case 0x8ec5389e:
             str9 = str7;
             if (!obj.equals(str9)) {
                goto label_005b ;
             }else {
                i = 1;
             }
             break;
           case 0x9946266b:
             str9 = str6;
             if (!obj.equals(str9)) {
                str6 = str9;
             }else {
                str6 = str9;
                str9 = str7;
                i = 2;
             }
             break;
           case 0xa2e88cea:
             str9 = str5;
             if (!obj.equals(str9)) {
                str5 = str9;
             }else {
                str5 = str9;
                str9 = str7;
                i = 3;
             }
             break;
           case 0xac21c4c1:
             str9 = str4;
             if (!obj.equals(str9)) {
                str4 = str9;
             }else {
                str4 = str9;
                str9 = str7;
                i = 4;
             }
             break;
           case 0xad751bc8:
             str9 = str3;
             if (!obj.equals(str9)) {
                str3 = str9;
             }else {
                str3 = str9;
                str9 = str7;
                i = 5;
             }
             break;
           case 0xb526ae1e:
             str9 = str2;
             if (!obj.equals(str9)) {
                str2 = str9;
             }else {
                str2 = str9;
                str9 = str7;
                i = 6;
             }
             break;
           case 0xc71b06c1:
             str9 = str1;
             if (!obj.equals(str9)) {
                str1 = str9;
             }else {
                str1 = str9;
                str9 = str7;
                i = 7;
             }
             break;
           case 0xf0d31273:
             str9 = str;
             if (!obj.equals(str9)) {
                str = str9;
             }else {
                str = str9;
                str9 = str7;
                i = 8;
             }
             break;
           case 0xf0d746a2:
             if (obj.equals(obj1)) {
                str9 = str7;
                i = 9;
             }else {
             }
             break;
           case 0xf2914a7d:
             if (obj.equals("SearchKwaiPlayer")) {
                str9 = str7;
                i = 10;
             }else {
             }
             break;
           case 0xa8568f1:
             if (obj.equals("TKPostBubbleRoundViewContainer")) {
                str9 = str7;
                i = 11;
             }else {
             }
             break;
           case 0xfdeada9:
             if (obj.equals("TKFlareButton")) {
                str9 = str7;
                i = 12;
             }else {
             }
             break;
           case 0x12b83a8c:
             if (obj.equals("SearchTKLivePlayer")) {
                str9 = str7;
                i = 13;
             }else {
             }
             break;
           case 0x1ab792b5:
             if (obj.equals("KwaiPlayer")) {
                str9 = str7;
                i = 14;
             }else {
             }
             break;
           case 0x2e7b5ead:
             if (obj.equals("KwaiLoadingView")) {
                str9 = str7;
                i = 15;
             }else {
             }
             break;
           case 0x33735fa1:
             if (obj.equals("TKAdVideo")) {
                str9 = str7;
                i = 16;
             }else {
             }
             break;
           case 0x3febbdb6:
             if (obj.equals("AdTkShineView")) {
                str9 = str7;
                i = 17;
             }else {
             }
             break;
           case 0x4e13fa45:
             if (obj.equals("AdTkScratchView")) {
                str9 = str7;
                i = 18;
             }else {
             }
             break;
           case 0x617d7c18:
             if (obj.equals("TKSearchScoreView")) {
                str9 = str7;
                i = 19;
             }else {
             }
             break;
           case 0x629265e1:
             if (obj.equals("TKADAnimator")) {
                str9 = str7;
                i = 20;
             }else {
             }
             break;
           case 0x6b1d92b4:
             if (obj.equals("RTXBridgeCenter")) {
                str9 = str7;
                i = 21;
             }else {
             }
             break;
           case 0x70464bf9:
             if (obj.equals("TKSearchScrollSelectedTextView")) {
                str9 = str7;
                i = 22;
             }else {
             }
             break;
           case 0x719857f4:
             if (obj.equals("TKSearchTicketTagView")) {
                str9 = str7;
                i = 23;
             }else {
             }
             break;
           case 0x72a17949:
             if (obj.equals("TKAndroid_RefreshControl")) {
                str9 = str7;
                i = 24;
             }else {
             }
             break;
           case 0x74423771:
             if (obj.equals("TKSearchScrollView")) {
                str9 = str7;
                i = 25;
             }else {
             }
             break;
           case 0x75f0ae6e:
             if (obj.equals("SearchEntryBarView")) {
                str9 = str7;
                i = 26;
             }else {
             }
             break;
           default:
             str9 = str7;
             goto label_005b ;
       }
       switch (i){
           case 0:
             j oj = new j();
             this.a.put(str8, oj);
             return oj;
           case 1:
             str8 = new a();
             this.a.put(str9, str8);
             return str8;
           case 2:
             v str81 = new v();
             this.a.put(str6, str81);
             return str81;
           case 3:
             p str82 = new p();
             this.a.put(str5, str82);
             return str82;
           case 4:
             str83 = new b();
             this.a.put(str4, str83);
             return str83;
           case 5:
             s str84 = new s();
             this.a.put(str3, str84);
             return str84;
           case 6:
             y str85 = new y();
             this.a.put(str2, str85);
             return str85;
           case 7:
             str86 = new d();
             this.a.put(str1, str86);
             return str86;
           case 8:
             r or = new r();
             this.a.put(str, or);
             return or;
           case 9:
             w str87 = new w();
             this.a.put(obj1, str87);
             return str87;
           case 10:
             k str88 = new k();
             this.a.put("SearchKwaiPlayer", str88);
             return str88;
           case 11:
             x str89 = new x();
             this.a.put("TKPostBubbleRoundViewContainer", str89);
             return str89;
           case 12:
             t str810 = new t();
             this.a.put("TKFlareButton", str810);
             return str810;
           case 13:
             l str811 = new l();
             this.a.put("SearchTKLivePlayer", str811);
             return str811;
           case 14:
             str8 = new a();
             this.a.put("KwaiPlayer", str8);
             return str8;
           case 15:
             u str812 = new u();
             this.a.put("KwaiLoadingView", str812);
             return str812;
           case 16:
             o str813 = new o();
             this.a.put("TKAdVideo", str813);
             return str813;
           case 17:
             e str814 = new e();
             this.a.put("AdTkShineView", str814);
             return str814;
           case 18:
             str86 = new d();
             this.a.put("AdTkScratchView", str86);
             return str86;
           case 19:
             z str815 = new z();
             this.a.put("TKSearchScoreView", str815);
             return str815;
           case 20:
             str83 = new b();
             this.a.put("TKADAnimator", str83);
             return str83;
           case 21:
             c str816 = new c();
             this.a.put("RTXBridgeCenter", str816);
             return str816;
           case 22:
             a0 str817 = new a0();
             this.a.put("TKSearchScrollSelectedTextView", str817);
             return str817;
           case 23:
             c0 str818 = new c0();
             this.a.put("TKSearchTicketTagView", str818);
             return str818;
           case 24:
             q str819 = new q();
             this.a.put("TKAndroid_RefreshControl", str819);
             return str819;
           case 25:
             b0 str820 = new b0();
             this.a.put("TKSearchScrollView", str820);
             return str820;
           case 26:
             i str821 = new i();
             this.a.put("SearchEntryBarView", str821);
             return str821;
           default:
             r.a();
             return null;
       }
    }
    public void init(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       String[] b = a.b;
       int len = b.length;
       int i = 0;
       while (i < len) {
          object oobject = b[i];
          if (!this.a.contains(oobject)) {
             this.init(oobject);
          }
          i = i + 1;
       }
       return;
    }
}
