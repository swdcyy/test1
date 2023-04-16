package com.kuaishou.live.bottombar.component.widget.LiveAudienceBottomBarLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.LinearLayout;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;

public class LiveAudienceBottomBarLayout extends RelativeLayout	// class@000d40
{
    public final LinearLayout b;
    public final LinearLayout c;
    public int d;

    public void LiveAudienceBottomBarLayout(Context p0){
       super(p0, null);
    }
    public void LiveAudienceBottomBarLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceBottomBarLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       View view = a.k(this, R.layout.arg_RES_7f0d09f6, true);
       this.b = view.findViewById(0x7f0a1aa8);
       this.c = view.findViewById(0x7f0a1ab6);
       this.setGravity(16);
       this.setClipToPadding(false);
       this.setClipChildren(false);
    }
    public int getContainerWidth(){
       return this.d;
    }
    public ViewGroup getLeftLayout(){
       return this.b;
    }
    public ViewGroup getRightLayout(){
       return this.c;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveAudienceBottomBarLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveAudienceBottomBarLayout.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.d = this.getMeasuredWidth();
       return;
    }
}
