package com.kuaishou.live.common.core.component.multiline.widget.LiveMultiLineFlexLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.Map;
import os1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.multiline.widget.LiveMultiLineFlexLayout$a;

public final class LiveMultiLineFlexLayout extends FrameLayout	// class@0015cb
{
    public LiveMultiLineFlexLayout$a b;
    public final HashMap c;
    public a d;
    public HashMap e;

    public void LiveMultiLineFlexLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMultiLineFlexLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMultiLineFlexLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.c = new HashMap();
    }
    public void LiveMultiLineFlexLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final Map getChildViewMap(){
       return this.c;
    }
    public final a getLayoutManager(){
       return this.d;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveMultiLineFlexLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveMultiLineFlexLayout.class, "1")) {
             return;
          }
       }
       if (this.getChildCount() <= 0) {
          super.onLayout(p0, p1, p2, p3, p4);
          return;
       }else {
          LiveMultiLineFlexLayout td = this.d;
          if (td != null) {
             if (td != null) {
                td.a(this);
             }
          }else {
             super.onLayout(p0, p1, p2, p3, p4);
          }
          return;
       }
    }
    public final void setAdapter(LiveMultiLineFlexLayout$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineFlexLayout.class, "2")) {
          return;
       }
       a.p(p0, "adapter");
       this.b = p0;
       if (p0 != null && !PatchProxy.applyVoidOneRefs(this, p0, LiveMultiLineFlexLayout$a.class, "1")) {
          a.p(this, "layout");
          p0.a = this;
       }
       return;
    }
    public final void setLayoutManager(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineFlexLayout.class, "3")) {
          return;
       }
       a.p(p0, "layoutManager");
       this.d = p0;
       return;
    }
}
