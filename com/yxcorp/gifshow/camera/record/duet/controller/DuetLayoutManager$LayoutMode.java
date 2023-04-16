package com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import java.lang.Enum;
import pi9.e;
import lnc.s6;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$Type;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camerasdk.q;
import java.lang.Integer;
import java.lang.Boolean;
import n65.k;
import com.kwai.camerasdk.videoCapture.CameraController;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory;
import com.kwai.camerasdk.models.VideoSourceLayout;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.VideoSourceLayoutFactory$a;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.c;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.b;
import com.yxcorp.gifshow.camerasdk.videosourcelayout.a;
import com.kwai.camerasdk.models.DisplayLayout;
import com.kwai.camerasdk.models.VideoSourceLayout$b;
import android.graphics.RectF;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.camerasdk.models.VideoSourceSubLayout$b;
import com.kwai.camerasdk.models.VideoSourceSubLayout;
import com.kwai.camerasdk.models.SubLayoutIndex;
import com.google.protobuf.GeneratedMessageLite;

public final class DuetLayoutManager$LayoutMode extends Enum	// class@000dba
{
    public int mIconLargeRes;
    public int mIconSmallRes;
    public VideoSourceLayoutFactory$Type mLayoutType;
    public int mNameRes;
    public String mTag;
    public VideoSourceLayout mVideoSourceLayout;
    public static final DuetLayoutManager$LayoutMode[] $VALUES;
    public static final DuetLayoutManager$LayoutMode DOWN;
    public static final DuetLayoutManager$LayoutMode IN;
    public static final DuetLayoutManager$LayoutMode LEFT;
    public static final DuetLayoutManager$LayoutMode RIGHT;
    public static final DuetLayoutManager$LayoutMode UP;

    static {
       int i;
       int i3;
       if (e.e()) {
          i = 0x7f081ca8;
       }else if(s6.m()){
          i = 0x7f081c2f;
       }else {
          i = 0x7f081c2e;
       }
       DuetLayoutManager$LayoutMode layoutMode = new DuetLayoutManager$LayoutMode("LEFT", 0, 0x7f104334, i, 0x7f082019, "LR", VideoSourceLayoutFactory$Type.LeftCameraRightVideoLayout);
       DuetLayoutManager$LayoutMode.LEFT = v8;
       int i1 = 1;
       int i2 = 0x7f104339;
       if (e.e()) {
          i3 = 0x7f081caa;
       }else if(s6.m()){
          i3 = 0x7f081c32;
       }else {
          i3 = 0x7f081c31;
       }
       DuetLayoutManager$LayoutMode layoutMode1 = new DuetLayoutManager$LayoutMode("RIGHT", i1, i2, i3, 0x7f08202b, "RL", VideoSourceLayoutFactory$Type.RightCameraLeftVideoLayout);
       DuetLayoutManager$LayoutMode.RIGHT = layoutMode;
       int i4 = 2;
       int i5 = 0x7f10433c;
       int i6 = (e.e())? 0x7f081cab: 0x7f081c34;
       DuetLayoutManager$LayoutMode layoutMode2 = new DuetLayoutManager$LayoutMode("UP", i4, i5, i6, 0x7f082030, "UD", VideoSourceLayoutFactory$Type.TopCameraBottomVideoLayout);
       DuetLayoutManager$LayoutMode.UP = v1;
       i3 = (e.e())? 0x7f081ca7: 0x7f081c2d;
       layoutMode1 = new DuetLayoutManager$LayoutMode("DOWN", 3, 0x7f104335, i3, 0x7f082012, "DU", VideoSourceLayoutFactory$Type.BottomCameraTopVideoLayout);
       DuetLayoutManager$LayoutMode.DOWN = v2;
       if (e.e()) {
          i6 = 0x7f081ca9;
       }else if(s6.m()){
          i6 = 0x7f081c2c;
       }else {
          i6 = 0x7f081c30;
       }
       layoutMode2 = new DuetLayoutManager$LayoutMode("IN", 4, 0x7f104337, i6, 0x7f082018, "PIP", VideoSourceLayoutFactory$Type.LeftTopVideoLayout);
       DuetLayoutManager$LayoutMode.IN = v3;
       DuetLayoutManager$LayoutMode[] layoutModeAr = new DuetLayoutManager$LayoutMode[]{v8,layoutMode,v1,v2,v3};
       DuetLayoutManager$LayoutMode.$VALUES = layoutModeAr;
    }
    public void DuetLayoutManager$LayoutMode(String p0,int p1,int p2,int p3,int p4,String p5,VideoSourceLayoutFactory$Type p6){
       super(p0, p1);
       this.mNameRes = p2;
       this.mIconSmallRes = p3;
       this.mIconLargeRes = p4;
       this.mTag = p5;
       this.mLayoutType = p6;
    }
    public static DuetLayoutManager$LayoutMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, DuetLayoutManager$LayoutMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(DuetLayoutManager$LayoutMode.class, p0);
    }
    public static DuetLayoutManager$LayoutMode[] values(){
       Object obj = PatchProxy.apply(null, null, DuetLayoutManager$LayoutMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DuetLayoutManager$LayoutMode.$VALUES.clone();
    }
    public boolean apply(q p0,int p1,int p2,int p3){
       VideoSourceLayout obj;
       int this;
       a obj1;
       boolean b;
       DisplayLayout obj2;
       int i8;
       Object obj3;
       DuetLayoutManager$LayoutMode layoutMode = this;
       q oq = p0;
       if (PatchProxy.isSupport(DuetLayoutManager$LayoutMode.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, DuetLayoutManager$LayoutMode.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (oq && (layoutMode.mLayoutType != null && (p2 && (p3 && this.isPreviewSizeValid(p0))))) {
          DuetLayoutManager$LayoutMode mLayoutType = layoutMode.mLayoutType;
          int i1 = p0.getPreviewSize().c();
          int i2 = p0.getPreviewSize().d();
          VideoSourceLayoutFactory videoSourceL = VideoSourceLayoutFactory.class;
          String str = "1";
          this = 5;
          int i3 = 4;
          int i4 = 3;
          int i5 = 2;
          c uoc = null;
          int i6 = 1;
          if (PatchProxy.isSupport(videoSourceL)) {
             Object[] objArray = new Object[]{mLayoutType,Integer.valueOf(i1),Integer.valueOf(i2),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p1)};
             obj1 = PatchProxy.apply(objArray, uoc, videoSourceL, str);
             if (obj1 != PatchProxyResult.class) {
                b = true;
             label_01c5 :
                layoutMode.mVideoSourceLayout = obj1;
                oq.S0(obj1);
                return b;
             }
          }
          int i7 = VideoSourceLayoutFactory$a.a[mLayoutType.ordinal()];
          if (i7 != i6 && (i7 != i5 && (i7 != i4 && i7 != i3))) {
             if (i7 != this) {
                obj2 = uoc;
                b = true;
                i8 = 2;
             label_00c9 :
                if (uoc == null) {
                   obj3 = obj2;
                }else {
                   obj1 = a.class;
                   a obj4 = PatchProxy.apply(obj2, uoc, obj1, str);
                   if (obj4 != PatchProxyResult.class) {
                      obj3 = obj4;
                   }else {
                      uoc.a();
                      obj4 = uoc.i;
                      obj2 = uoc.b();
                      a h = uoc.h;
                      a g = uoc.g;
                      a f = uoc.f;
                      if (PatchProxy.isSupport(obj1)) {
                         Object[] this1 = new Object[this];
                         this1[i] = obj4;
                         this1[b] = obj2;
                         this1[i8] = h;
                         this1[i4] = g;
                         this1[4] = Integer.valueOf(f);
                         obj = PatchProxy.apply(this1, uoc, obj1, "2");
                         if (obj != PatchProxyResult.class) {
                         label_01c3 :
                            obj3 = obj;
                         }
                      }
                      VideoSourceLayout$b uob = VideoSourceLayout.newBuilder();
                      uob.copyOnWrite();
                      uob.instance.setWidth(obj4.width());
                      uob.copyOnWrite();
                      uob.instance.setHeight(obj4.height());
                      uob.copyOnWrite();
                      uob.instance.setDisplayLayoutOverride(obj2);
                      VideoSourceSubLayout$b uob1 = VideoSourceSubLayout.newBuilder();
                      uob1.d(((h.left - obj4.left) / obj4.width()));
                      uob1.e(((h.top - obj4.top) / obj4.height()));
                      uob1.c((h.width() / obj4.width()));
                      uob1.b((h.height() / obj4.height()));
                      uob1.a(SubLayoutIndex.kLayoutIndexCamera);
                      uob.a(uob1);
                      uob1 = VideoSourceSubLayout.newBuilder();
                      uob1.d(((g.left - obj4.left) / obj4.width()));
                      uob1.e(((g.top - obj4.top) / obj4.height()));
                      uob1.c((g.width() / obj4.width()));
                      uob1.b((g.height() / obj4.height()));
                      uob1.copyOnWrite();
                      uob1.instance.setRotation(f);
                      uob1.a(SubLayoutIndex.kLayoutIndex1);
                      uob.a(uob1);
                      obj = uob.build();
                      goto label_01c3 ;
                   }
                }
                obj1 = obj3;
                goto label_01c5 ;
             }else {
                b = true;
                obj2 = uoc;
                i8 = 2;
                c uoc1 = new c(mLayoutType, i1, i2, p2, p3, p1);
             }
          }else {
             obj2 = uoc;
             b = true;
             i8 = 2;
             b uob2 = new b(mLayoutType, i1, i2, p2, p3, p1);
          }
          uoc = i7;
          goto label_00c9 ;
       }else {
          return i;
       }
    }
    public boolean isPreviewSizeValid(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DuetLayoutManager$LayoutMode.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getPreviewSize() != null && (p0.getPreviewSize().d() && p0.getPreviewSize().c()))? true: false;
       return b;
    }
}
