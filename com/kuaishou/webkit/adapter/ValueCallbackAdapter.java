package com.kuaishou.webkit.adapter.ValueCallbackAdapter;
import com.kuaishou.webkit.ValueCallback;
import android.webkit.ValueCallback;
import java.lang.Object;

public class ValueCallbackAdapter implements ValueCallback	// class@0012b3
{
    public ValueCallback mStub;

    public void ValueCallbackAdapter(ValueCallback p0){
       super();
       this.mStub = p0;
    }
    public void onReceiveValue(Object p0){
       this.mStub.onReceiveValue(p0);
    }
}
