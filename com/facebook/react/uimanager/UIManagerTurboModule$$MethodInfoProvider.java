package com.facebook.react.uimanager.UIManagerTurboModule$$MethodInfoProvider;
import ge.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.facebook.react.module.model.MethodDescriptor;

public final class UIManagerTurboModule$$MethodInfoProvider extends a	// class@001330
{

    public void UIManagerTurboModule$$MethodInfoProvider(){
       super();
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, UIManagerTurboModule$$MethodInfoProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new MethodDescriptor("getConstants", 0, 6, "\(\)Ljava/util/Map;"));
       obj.add(new MethodDescriptor("getConstantsForViewManager", 1, 4, "\(Ljava/lang/String;\)Lcom/facebook/react/bridge/WritableMap;"));
       obj.add(new MethodDescriptor("getDefaultEventTypes", 0, 4, "\(\)Lcom/facebook/react/bridge/WritableMap;"));
       obj.add(new MethodDescriptor("playTouchSound", 0, 0, "\(\)V"));
       obj.add(new MethodDescriptor("lazilyLoadView", 1, 4, "\(Ljava/lang/String;\)Lcom/facebook/react/bridge/WritableMap;"));
       obj.add(new MethodDescriptor("createView", 4, 0, "\(Ljava/lang/Double;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableMap;\)V"));
       obj.add(new MethodDescriptor("updateView", 3, 0, "\(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;\)V"));
       obj.add(new MethodDescriptor("removeRootView", 1, 0, "\(Ljava/lang/Double;\)V"));
       obj.add(new MethodDescriptor("focus", 1, 0, "\(Ljava/lang/Double;\)V"));
       obj.add(new MethodDescriptor("blur", 1, 0, "\(Ljava/lang/Double;\)V"));
       obj.add(new MethodDescriptor("findSubviewIn", 3, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("dispatchViewManagerCommand", 3, 0, "\(Ljava/lang/Double;DLcom/facebook/react/bridge/ReadableArray;\)V"));
       obj.add(new MethodDescriptor("dispatchViewManagerStringCommand", 3, 0, "\(Ljava/lang/Double;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;\)V"));
       obj.add(new MethodDescriptor("measure", 2, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("measureInWindow", 2, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("viewIsDescendantOf", 3, 0, "\(Ljava/lang/Double;Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("measureLayout", 4, 0, "\(Ljava/lang/Double;Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("measureLayoutRelativeToParent", 3, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("setJSResponder", 2, 0, "\(Ljava/lang/Double;Z\)V"));
       obj.add(new MethodDescriptor("clearJSResponder", 0, 0, "\(\)V"));
       obj.add(new MethodDescriptor("configureNextLayoutAnimation", 3, 0, "\(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("removeSubviewsFromContainerWithID", 1, 0, "\(D\)V"));
       obj.add(new MethodDescriptor("replaceExistingNonRootView", 2, 0, "\(Ljava/lang/Double;Ljava/lang/Double;\)V"));
       obj.add(new MethodDescriptor("setChildren", 2, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/ReadableArray;\)V"));
       obj.add(new MethodDescriptor("manageChildren", 6, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;\)V"));
       obj.add(new MethodDescriptor("setLayoutAnimationEnabledExperimental", 1, 0, "\(Z\)V"));
       obj.add(new MethodDescriptor("sendAccessibilityEvent", 2, 0, "\(Ljava/lang/Double;D\)V"));
       obj.add(new MethodDescriptor("showPopupMenu", 4, 0, "\(Ljava/lang/Double;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;\)V"));
       obj.add(new MethodDescriptor("dismissPopupMenu", 0, 0, "\(\)V"));
       obj.add(new MethodDescriptor("onBatchComplete", 0, 0, "\(\)V"));
       return obj;
    }
}
