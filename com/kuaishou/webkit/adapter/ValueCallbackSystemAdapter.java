package com.kuaishou.webkit.adapter.ValueCallbackSystemAdapter;
import android.webkit.ValueCallback;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Object;

public class ValueCallbackSystemAdapter implements ValueCallback	// class@0012b4
{
    public ValueCallback mStub;

    public void ValueCallbackSystemAdapter(ValueCallback p0){
       super();
       this.mStub = p0;
    }
    public void onReceiveValue(Object p0){
       this.mStub.onReceiveValue(p0);
    }
}
