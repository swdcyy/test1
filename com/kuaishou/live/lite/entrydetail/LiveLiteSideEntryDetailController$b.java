package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import java.lang.Object;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.animation.ObjectAnimator;
import com.kuaishou.live.lite.sidebar.c;
import android.view.View;
import android.animation.Keyframe;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class LiveLiteSideEntryDetailController$b implements LiveLiteGuidanceMessageQueueManager$b	// class@0008e5
{
    public final LiveLiteSideEntryDetailController a;

    public void LiveLiteSideEntryDetailController$b(LiveLiteSideEntryDetailController p0){
       this.a = p0;
       super();
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       Object obj = this;
       LiveLiteSideEntryDetailController$b obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteSideEntryDetailController$b.class, "1")) {
          return;
       }
       a.p(obj1, "message");
       obj1 = obj.a;
       Objects.requireNonNull(obj1);
       if (!PatchProxy.applyVoid(null, obj1, LiveLiteSideEntryDetailController.class, "5")) {
          LiveLiteSideEntryDetailController m = obj1.m;
          int i = 1;
          if (m != null && (m.isRunning() != i && obj1.X2().l() != null)) {
             Keyframe keyframe = Keyframe.ofFloat(0, 0x3f800000);
             a.o(keyframe, "Keyframe.ofFloat\(0f, 1.0f\)");
             Keyframe keyframe1 = Keyframe.ofFloat(0.21f, 0x3f99999a);
             a.o(keyframe1, "Keyframe.ofFloat\(0.21f, 1.2f\)");
             Keyframe keyframe2 = Keyframe.ofFloat(0.36f, 0x3f666666);
             a.o(keyframe2, "Keyframe.ofFloat\(0.36f, 0.9f\)");
             Keyframe keyframe3 = Keyframe.ofFloat(0x3f000000, 0x3f866666);
             a.o(keyframe3, "Keyframe.ofFloat\(0.5f, 1.05f\)");
             Keyframe keyframe4 = Keyframe.ofFloat(0x3f23d70a, 0x3f7ae148);
             a.o(keyframe4, "Keyframe.ofFloat\(0.64f, 0.98f\)");
             Keyframe keyframe5 = Keyframe.ofFloat(0x3f4a3d71, 0x3f8147ae);
             a.o(keyframe5, "Keyframe.ofFloat\(0.79f, 1.01f\)");
             Keyframe keyframe6 = Keyframe.ofFloat(0x3f6b851f, 0x3f800000);
             a.o(keyframe6, "Keyframe.ofFloat\(0.92f, 1.0f\)");
             Keyframe keyframe7 = Keyframe.ofFloat(0x3f800000, 0x3f800000);
             a.o(keyframe7, "Keyframe.ofFloat\(1.0f, 1.0f\)");
             Keyframe[] keyframeArra = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3,keyframe4,keyframe5,keyframe6,keyframe7};
             Keyframe[] keyframeArra1 = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3,keyframe4,keyframe5,keyframe6,keyframe7};
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeArra),PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeArra1)};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(obj1.X2().l(), propertyValu);
             obj1.m = objectAnimat;
             if (objectAnimat != null) {
                objectAnimat.setRepeatCount(-1);
             }
             m = obj1.m;
             if (m != null) {
                m.setDuration(1400);
             }
             m = obj1.m;
             if (m != null) {
                m.setInterpolator(new AccelerateDecelerateInterpolator());
             }
             LiveLiteSideEntryDetailController m1 = obj1.m;
             if (m1 != null) {
                m1.start();
             }
          }
       }
       return;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideEntryDetailController$b.class, "2")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteSideEntryDetailController$b ta = this.a;
       LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage iLiveLiteGui = null;
       ta.n = iLiveLiteGui;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(iLiveLiteGui, ta, LiveLiteSideEntryDetailController.class, "6")) {
          LiveLiteSideEntryDetailController m = ta.m;
          if (m != null) {
             m.cancel();
          }
          ta.m = iLiveLiteGui;
          View view = ta.X2().l();
          if (view != null) {
             view.setScaleX(0x3f800000);
          }
          View view1 = ta.X2().l();
          if (view1 != null) {
             view1.setScaleY(0x3f800000);
          }
       }
       return;
    }
}
