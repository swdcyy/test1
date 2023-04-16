package com.facebook.react.transientpage.TransientPageModule$$MethodInfoProvider;
import ge.a;
import java.util.List;
import java.util.ArrayList;
import com.facebook.react.module.model.MethodDescriptor;
import java.lang.String;
import java.lang.Object;

public final class TransientPageModule$$MethodInfoProvider extends a	// class@001303
{

    public void TransientPageModule$$MethodInfoProvider(){
       super();
    }
    public List a(){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new MethodDescriptor("onLoad", 0, 0, "\(\)V"));
       uArrayList.add(new MethodDescriptor("onHide", 0, 0, "\(\)V"));
       uArrayList.add(new MethodDescriptor("getWindowWidth", 0, 2, "\(\)D"));
       uArrayList.add(new MethodDescriptor("markRootTags", 2, 0, "\(DLcom/facebook/react/bridge/ReadableArray;\)V"));
       uArrayList.add(new MethodDescriptor("resolveAssetSource", 1, 3, "\(Lcom/facebook/react/bridge/ReadableMap;\)Ljava/lang/String;"));
       uArrayList.add(new MethodDescriptor("clearRootView", 0, 0, "\(\)V"));
       uArrayList.add(new MethodDescriptor("updateView", 3, 0, "\(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;\)V"));
       uArrayList.add(new MethodDescriptor("dispatchViewManagerCommand", 3, 0, "\(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;\)V"));
       uArrayList.add(new MethodDescriptor("dispatchViewManagerCommand", 3, 0, "\(DILcom/facebook/react/bridge/ReadableArray;\)V"));
       uArrayList.add(new MethodDescriptor("createView", 4, 0, "\(DLjava/lang/String;DLcom/facebook/react/bridge/ReadableMap;\)V"));
       uArrayList.add(new MethodDescriptor("setChildren", 2, 0, "\(DLcom/facebook/react/bridge/ReadableArray;\)V"));
       uArrayList.add(new MethodDescriptor("manageChildren", 6, 0, "\(DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;\)V"));
       uArrayList.add(new MethodDescriptor("invalidateView", 0, 0, "\(\)V"));
       uArrayList.add(new MethodDescriptor("sendRequest", 9, 0, "\(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ\)V"));
       return uArrayList;
    }
}
