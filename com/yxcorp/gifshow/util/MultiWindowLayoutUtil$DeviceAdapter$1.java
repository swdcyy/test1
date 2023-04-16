package com.yxcorp.gifshow.util.MultiWindowLayoutUtil$DeviceAdapter$1;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil$DeviceAdapter;
import java.lang.String;
import lnc.z4;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.app.Activity;
import e3a.a;
import android.view.Window;
import android.os.Build;
import com.yxcorp.utility.TextUtils;
import java.lang.Object;

public final class MultiWindowLayoutUtil$DeviceAdapter$1 extends MultiWindowLayoutUtil$DeviceAdapter	// class@001efc
{
    public final int OFFSET;
    public final int SPLIT_SCREEN_DRAG_BAR_ID;

    public void MultiWindowLayoutUtil$DeviceAdapter$1(String p0,int p1){
       super(p0, p1, null);
       this.OFFSET = n.A(a.B);
       this.SPLIT_SCREEN_DRAG_BAR_ID = a.b().getResources().getIdentifier("hw_multiwindow_split_screen_drag_bar", "id", "androidhwext");
    }
    public int getOffset(){
       return this.OFFSET;
    }
    public final boolean hasSplitScreenDragBar(View p0){
       Activity uActivity = a.a(p0);
       boolean b = false;
       if (uActivity == null) {
          return b;
       }
       uActivity = uActivity.getWindow().getDecorView().findViewById(this.SPLIT_SCREEN_DRAG_BAR_ID);
       if (uActivity != null && !uActivity.getVisibility()) {
          b = true;
       }
       return b;
    }
    public boolean isAvailable(View p0){
       boolean b = ((TextUtils.M(Build.BRAND)).equals("HUAWEI") && this.hasSplitScreenDragBar(p0))? true: false;
       return b;
    }
}
