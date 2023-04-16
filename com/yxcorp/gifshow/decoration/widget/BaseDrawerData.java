package com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.os.Parcelable;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$a;
import java.lang.String;
import android.graphics.RectF;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import aw9.c;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import android.os.Parcel;
import java.lang.Integer;

public class BaseDrawerData implements Parcelable	// class@0012b1
{
    public String b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public String o;
    public int p;
    public RectF q;
    public RectF r;
    public int s;
    public int t;
    public boolean u;
    public float v;
    public static final Parcelable$Creator CREATOR;

    static {
       BaseDrawerData.CREATOR = new BaseDrawerData$a();
    }
    public void BaseDrawerData(){
       super(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, 0, 0, false, 0, 0x1fffff, null);
    }
    public void BaseDrawerData(BaseDrawerData p0){
       a.p(p0, "baseDrawerData");
       super(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, 0, 0, false, 0, 0x1fffff, null);
       this.a(p0);
    }
    public void BaseDrawerData(String p0,int p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9,float p10,float p11,int p12,String p13,int p14,RectF p15,RectF p16,int p17,int p18,boolean p19,float p20){
       int i = this;
       Object obj = p13;
       Object obj1 = p15;
       Object obj2 = p16;
       a.p(p0, "decorationName");
       a.p(obj, "decorationFilePath");
       a.p(obj1, "elementMoveLimit");
       a.p(obj2, "elementDrawLimit");
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = p3;
       i.f = p4;
       i.g = p5;
       i.h = p6;
       i.i = p7;
       i.j = p8;
       i.k = p9;
       i.l = p10;
       i.m = p11;
       i.n = p12;
       i.o = obj;
       i.p = p14;
       i.q = obj1;
       i.r = obj2;
       i.s = p17;
       i.t = p18;
       i.u = p19;
       i.v = p20;
    }
    public void BaseDrawerData(String p0,int p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9,float p10,float p11,int p12,String p13,int p14,RectF p15,RectF p16,int p17,int p18,boolean p19,float p20,int p21,u p22){
       int i12;
       String str2;
       RectF rectF1;
       int i13;
       RectF rectF2;
       int i = p21;
       String str = "";
       String str1 = (i & 0x01)? str: 0;
       int i1 = (i & 0x02)? -1: p1;
       int i2 = 0x3f000000;
       int i3 = (i & 0x04)? 0x3f000000: p2;
       if (!(i & 0x08)) {
          i2 = p3;
       }
       int i4 = (i & 0x10)? 0: p4;
       int i5 = (i & 0x20)? 0: p5;
       int i6 = (i & 0x40)? 0: p6;
       int i7 = 0x3f800000;
       int i8 = (i & 0x0080)? 0x3f800000: p7;
       int i9 = (i & 0x0100)? 0x3f800000: p8;
       int i10 = (i & 0x0200)? 0x3f800000: p9;
       int i11 = (i & 0x0400)? 0x3f800000: p10;
       if (!(i & 0x0800)) {
          i7 = p11;
       }
       float f = (i & 0x1000)? -1.#Rf: p12;
       if (!(i & 0x2000)) {
          str = 0;
       }
       RectF rectF = (i & 0x4000)? 0x1111111: p14;
       if (i & 0x8000) {
          i12 = rectF;
          str2 = str;
          rectF = new RectF((- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH), (- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH), (- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH), (- BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH));
       }else {
          str2 = str;
          p15 = rectF;
          float f1 = 0;
       }
       if (0x10000 & i) {
          rectF1 = rectF;
          i13 = f;
          rectF2 = new RectF(BaseDrawer.DRAWER_WIDTH_LEFT_RIGHT_LIMIT, BaseDrawer.DRAWER_HEIGHT_TOP_BOTTOM_LIMIT, BaseDrawer.DRAWER_WIDTH_LEFT_RIGHT_LIMIT, BaseDrawer.DRAWER_HEIGHT_TOP_BOTTOM_LIMIT);
       }else {
          i13 = f;
          rectF1 = rectF;
          rectF2 = 0;
       }
       int dECORATION_O = (0x20000 & i)? BaseDrawer.DECORATION_OUT_BOX_DISTANCE_IN_BOX_WIDTH: p17;
       int dECORATION_O1 = (0x40000 & i)? BaseDrawer.DECORATION_OUT_BOX_DISTANCE_IN_BOX_WIDTH: p18;
       int i14 = (i & 0x80000)? 1: p19;
       i = (i & 0x100000)? 0: p20;
       super(str1, i1, i3, i2, i4, i5, i6, i8, i9, i10, i11, i7, i13, str2, i12, rectF1, rectF2, dECORATION_O, dECORATION_O1, i14, i);
       return;
    }
    public final float A(){
       return this.j;
    }
    public final int B(){
       return this.c;
    }
    public boolean C(){
       return false;
    }
    public boolean D(){
       boolean b = ((this.p & 0x1000000) == 0x1000000)? true: false;
       return b;
    }
    public final boolean E(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.D()) {
          return b;
       }
       if ((this.p & 1) == 1) {
          b = true;
       }
       return b;
    }
    public final boolean F(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.D()) {
          return b;
       }
       if ((this.p & 0x100000) == 0x100000) {
          b = true;
       }
       return b;
    }
    public final boolean G(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.D()) {
          return b;
       }
       if ((this.p & 4096) == 4096) {
          b = true;
       }
       return b;
    }
    public final boolean H(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.D()) {
          return b;
       }
       if ((this.p & 256) == 256) {
          b = true;
       }
       return b;
    }
    public final boolean I(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.D()) {
          return b;
       }
       if ((this.p & 0x10000) == 0x10000) {
          b = true;
       }
       return b;
    }
    public final boolean J(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.D()) {
          return b;
       }
       if ((this.p & 16) == 16) {
          b = true;
       }
       return b;
    }
    public final void K(float p0){
       this.l = p0;
    }
    public final void L(float p0){
       this.m = p0;
    }
    public final void M(float p0){
       this.g = p0;
    }
    public final void N(int p0){
       this.s = p0;
    }
    public final void O(int p0){
       this.t = p0;
    }
    public final void P(float p0){
       this.f = p0;
    }
    public void Q(boolean p0){
    }
    public final void R(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawerData.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.o = p0;
       return;
    }
    public final void S(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawerData.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public final void T(int p0){
       this.n = p0;
    }
    public final void U(float p0){
       this.k = p0;
    }
    public final void V(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawerData.class, "13")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.q = p0;
       return;
    }
    public final void W(float p0){
       this.v = p0;
    }
    public final void X(float p0){
       this.i = p0;
    }
    public final void Y(float p0){
       this.d = p0;
    }
    public final void Z(float p0){
       this.e = p0;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "baseDrawerData");
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.v = p0.v;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
       this.m = p0.m;
       this.b = p0.b;
       this.n = p0.n;
       this.o = p0.o;
       this.p = p0.p;
       this.q = p0.q;
       this.r = p0.r;
       return;
    }
    public final void a0(float p0){
       this.h = p0;
    }
    public final void b(int p0){
       this.p = p0 ^ this.p;
    }
    public final void b0(float p0){
       this.j = p0;
    }
    public final void c(int p0){
       this.p = p0 | this.p;
    }
    public final void c0(int p0){
       this.c = p0;
    }
    public final float d(){
       return this.l;
    }
    public String d0(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "X:"+c.a(this.d)+",  Y="+c.a(this.e)+",\nrotate="+c.a(this.h)+','+"  scale="+c.a(this.j)+",\n"+"globalScale:"+c.a(this.i)+", "+" additionalScale = "+c.a(this.l)+", "+"extraRotate:"+c.a(this.v)+"assetTransformedScale:"+c.a(this.k)+",\nsize:["+this.f+'*'+this.g+']';
    }
    public int describeContents(){
       return 0;
    }
    public final float e(){
       return this.m;
    }
    public final float f(){
       return this.g;
    }
    public final int g(){
       return this.s;
    }
    public final int h(){
       return this.t;
    }
    public final float i(){
       return this.f;
    }
    public BaseDrawerData$CustomButtonMode j(){
       return BaseDrawerData$CustomButtonMode.NONE;
    }
    public final String k(){
       return this.o;
    }
    public final String l(){
       return this.b;
    }
    public final float m(){
       return this.k;
    }
    public final RectF n(){
       return this.r;
    }
    public final RectF o(){
       return this.q;
    }
    public final float q(){
       return this.v;
    }
    public final float t(){
       return this.i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BaseDrawerData.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BaseDrawerData\(decorationName=\'"+this.b+"\', zIndex="+this.c+", moveX="+this.d+", "+"moveY="+this.e+", contentWidth="+this.f+", contentHeight="+this.g+", rotate="+this.h+", "+"scale="+this.j+", alpha="+this.m+", decorationType="+this.n+", decorationFilePath=\'"+this.o+"\', "+"elementMoveLimit="+this.q+", elementDrawLimit="+this.r+", "+"isSelectEnable:"+this.D()+", "+"isRotateEnable:"+this.G()+", isSelectedTapEnable:"+this.I()+", "+"isGestureEnable:"+this.D()+" ,isRemoveEnable:"+this.F()+", "+"needShow:"+this.u+", isHorizontalMoveEnable:"+this.E()+", "+"isVerticalMoveEnable:"+this.J()+", globalScale:"+this.i+' '+"assetTransformedScale:"+this.k+", additionalScal:"+this.l+", "+"extraRotate:"+this.v+')';
    }
    public final float w(){
       return this.d;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(BaseDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, BaseDrawerData.class, "15")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.b);
       p0.writeInt(this.c);
       p0.writeFloat(this.d);
       p0.writeFloat(this.e);
       p0.writeFloat(this.f);
       p0.writeFloat(this.g);
       p0.writeFloat(this.h);
       p0.writeFloat(this.i);
       p0.writeFloat(this.j);
       p0.writeFloat(this.k);
       p0.writeFloat(this.l);
       p0.writeFloat(this.m);
       p0.writeInt(this.n);
       p0.writeString(this.o);
       p0.writeInt(this.p);
       p0.writeParcelable(this.q, p1);
       p0.writeParcelable(this.r, p1);
       p0.writeInt(this.s);
       p0.writeInt(this.t);
       p0.writeInt(this.u);
       p0.writeFloat(this.v);
       return;
    }
    public final float x(){
       return this.e;
    }
    public final boolean y(){
       return this.u;
    }
    public final float z(){
       return this.h;
    }
}
