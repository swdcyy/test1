package com.tencent.connect.common.UIListenerManager$ApiTask;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.tauth.IUiListener;
import java.lang.Object;

public class UIListenerManager$ApiTask	// class@000e48
{
    public final UIListenerManager a;
    public IUiListener mListener;
    public int mRequestCode;

    public void UIListenerManager$ApiTask(UIListenerManager p0,int p1,IUiListener p2){
       this.a = p0;
       super();
       this.mRequestCode = p1;
       this.mListener = p2;
    }
}
