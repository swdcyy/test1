package lnd.a;
import xld.c;
import lnd.a$a;
import nsd.u;
import xld.a;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import mod.a;
import java.lang.String;
import xld.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Map;
import uvc.a;
import jod.a;
import android.graphics.RectF;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;

public final class a extends c	// class@001c7a
{
    public final List G;
    public static final a$a H;

    static {
       a.H = new a$a(null);
    }
    public void a(){
       super(null, null, null, null, null, null, false, false, false, false, false, 2047, null);
    }
    public void a(a p0,List p1,DraftTextStyleInfo p2,a p3,String p4,b p5,boolean p6,boolean p7,boolean p8,boolean p9,boolean p10){
       a.p(p0, "decorationRootState");
       a.p(p1, "elementList");
       Object obj = p3;
       a.p(obj, "editingTextState");
       Object obj1 = p5;
       a.p(obj1, "ttsState");
       this.G = p1;
    }
    public void a(a p0,List p1,DraftTextStyleInfo p2,a p3,String p4,b p5,boolean p6,boolean p7,boolean p8,boolean p9,boolean p10,int p11,u p12){
       b uob1;
       int i = p11;
       b uob = null;
       if (i & 0x01) {
          a uoa = new a(false, null, null, null, null, 0, null, null, 0, false, false, false, false, null, 0, 0, 0, null, null, false, 0xfffff, null);
       }else {
          b uob3 = uob;
       }
       ArrayList uArrayList = (i & 0x02)? new ArrayList(): uob;
       if (i & 0x08) {
          a uoa1 = new a(false, false, false, 0, null, false, null, null, 255, null);
       }else {
          b uob2 = uob;
       }
       if (i & 0x20) {
          uob1 = new b(null, false, false, false, false, 0, 63, null);
       }
       uob1 = 0;
       int i1 = (i & 0x40)? 0: p6;
       int i2 = (i & 0x0080)? 0: p7;
       int i3 = (i & 0x0100)? 1: p8;
       int i4 = (i & 0x0200)? 0: p9;
       if (!(i & 0x0400)) {
          int i5 = p10;
       }
       super(v1, uArrayList, 0, v5, 0, uob, i1, i2, i3, i4, uob1);
       return;
    }
    public static a I(a p0,a p1,List p2,DraftTextStyleInfo p3,a p4,String p5,b p6,boolean p7,boolean p8,boolean p9,boolean p10,boolean p11,int p12,Object p13){
       if (p12 & 0x01) {
          p1 = p0;
       }
       if (p12 & 0x02) {
          p2 = p0.i();
       }
       if (p12 & 0x04) {
          p3 = p0.A();
       }
       if (p12 & 0x08) {
          p4 = p0.y();
       }
       if (p12 & 0x10) {
          p5 = p0.B();
       }
       if (p12 & 0x20) {
          p6 = p0.E();
       }
       if (p12 & 0x40) {
          p7 = p0.x();
       }
       if (p12 & 0x0080) {
          p8 = p0.G();
       }
       if (p12 & 0x0100) {
          p9 = p0.F();
       }
       if (p12 & 0x0200) {
          p10 = p0.D();
       }
       if (p12 & 0x0400) {
          p11 = p0.z();
       }
       return p0.H(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
    public static a J(a p0,boolean p1,List p2,List p3,Map p4,Map p5,int p6,a p7,a p8,double p9,boolean p10,boolean p11,boolean p12,boolean p13,Map p14,double p15,double p16,int p17,RectF p18,List p19,DraftTextStyleInfo p20,a p21,String p22,b p23,boolean p24,boolean p25,boolean p26,boolean p27,boolean p28,int p29,Object p30){
       int i3;
       List list3;
       boolean b10;
       a uoa4;
       int b11;
       b uob1;
       boolean b12;
       double d3;
       int b13;
       int i = p29;
       boolean b = (i & 0x01)? p0.s(): p1;
       List list = (i & 0x02)? p0.c(): null;
       List list1 = (i & 0x04)? p0.j(): null;
       Map map = (i & 0x08)? p0.d(): null;
       Map map1 = (i & 0x10)? p0.e(): null;
       int i1 = (i & 0x20)? p0.o(): p6;
       a uoa = (i & 0x40)? p0.a(): p7;
       a uoa1 = (i & 0x0080)? p0.r(): p8;
       double d = (i & 0x0100)? p0.n(): p9;
       int b1 = (i & 0x0200)? p0.v(): p10;
       boolean b2 = (i & 0x0400)? p0.p(): p11;
       boolean b3 = (i & 0x0800)? p0.q(): p12;
       boolean b4 = (i & 0x1000)? p0.t(): p13;
       Map map2 = (i & 0x2000)? p0.l(): 0;
       Map map3 = map2;
       double d1 = (i & 0x4000)? p0.k(): p15;
       double d2 = (0x8000 & i)? p0.m(): p16;
       int i2 = (0x10000 & i)? p0.g(): p17;
       RectF rectF = (i & 0x20000)? p0.f(): p18;
       List list2 = (i & 0x40000)? p0.i(): false;
       DraftTextStyleInfo uDraftTextSt = (i & 0x80000)? p0.A(): null;
       a uoa2 = (i & 0x100000)? p0.y(): p21;
       String str = (i & 0x200000)? p0.B(): null;
       b uob = (i & 0x400000)? p0.E(): p23;
       boolean b5 = (i & Float.MIN_NORMAL)? p0.x(): p24;
       boolean b6 = (i & 0x1000000)? p0.G(): p25;
       boolean b7 = (i & 0x2000000)? p0.F(): p26;
       boolean b8 = (i & 0x4000000)? p0.D(): p27;
       boolean b9 = (i & 0x8000000)? p0.z(): p28;
       a uoa3 = a.class;
       if (PatchProxy.isSupport(uoa3)) {
          Object[] objArray = new Object[28];
          objArray[0] = Boolean.valueOf(b);
          objArray[1] = list;
          objArray[2] = list1;
          objArray[3] = map;
          objArray[4] = map1;
          objArray[5] = Integer.valueOf(i1);
          objArray[6] = uoa;
          objArray[7] = uoa1;
          objArray[8] = Double.valueOf(d);
          objArray[9] = Boolean.valueOf(b1);
          objArray[10] = Boolean.valueOf(b2);
          objArray[11] = Boolean.valueOf(b3);
          objArray[12] = Boolean.valueOf(b4);
          objArray[13] = map3;
          objArray[14] = Double.valueOf(d1);
          objArray[15] = Double.valueOf(d2);
          objArray[16] = Integer.valueOf(i2);
          objArray[17] = rectF;
          i3 = i2;
          list3 = list2;
          objArray[18] = list3;
          objArray[19] = uDraftTextSt;
          b10 = b4;
          uoa4 = uoa2;
          objArray[20] = uoa4;
          objArray[21] = str;
          b11 = b3;
          uob1 = uob;
          objArray[22] = uob1;
          objArray[23] = Boolean.valueOf(b5);
          objArray[24] = Boolean.valueOf(b6);
          objArray[25] = Boolean.valueOf(b7);
          objArray[26] = Boolean.valueOf(b8);
          objArray[27] = Boolean.valueOf(b9);
          b12 = b2;
          d3 = d;
          b13 = b1;
          uoa3 = PatchProxy.apply(objArray, p0, uoa3, "1");
          if (uoa3 != PatchProxyResult.class) {
          label_02c8 :
             return uoa3;
          }
       }else {
          i3 = i2;
          d3 = d;
          b10 = b4;
          list3 = list2;
          uoa4 = uoa2;
          b12 = b2;
          b11 = b3;
          uob1 = uob;
          b13 = b1;
          b1 = p0;
       }
       a.p(list, "assetIdentifyList");
       a.p(list1, "longPictureAssetIdentifyList");
       a.p(map, "assetSegmentToAssetIdentifyMap");
       a.p(map1, "assetToFirstAssetSegmentIdentifyMap");
       a.p(uoa, "playerState");
       a.p(uoa1, "timelineData");
       Map map4 = map3;
       a.p(map4, "photoMovieMusicVolumeMap");
       a.p(list3, "textList");
       a.p(uoa4, "editingTextState");
       a.p(uob1, "ttsState");
       uoa3 = p0.H(a.b(p0, b, list, list1, map, map1, i1, uoa, uoa1, d3, b13, b12, b11, b10, map4, d1, d2, i3, rectF, 0, 0x40000, null), list3, uDraftTextSt, uoa4, str, uob1, b5, b6, b7, b8, b9);
       goto label_02c8 ;
    }
    public final a H(a p0,List p1,DraftTextStyleInfo p2,a p3,String p4,b p5,boolean p6,boolean p7,boolean p8,boolean p9,boolean p10){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p5;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[3] = oobject2;
          objArray[4] = p4;
          objArray[5] = oobject3;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = Boolean.valueOf(p10);
          Object obj = PatchProxy.apply(objArray, this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "decorationRootState");
       a.p(oobject1, "textList");
       a.p(oobject2, "editingTextState");
       a.p(oobject3, "ttsState");
       uoa = new a(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return v13;
    }
    public List i(){
       return this.G;
    }
}
